/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.politaktiv.meinungsbild.application;

import java.io.IOException;

import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.ValidatorException;
import javax.portlet.ActionRequest;


import com.liferay.portal.kernel.exception.SystemException;
import org.politaktiv.setofopinions.domain.SetOfOpinion;

import org.politaktiv.meinungsbild.infrastructure.model.Rating;
import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;
import org.politaktiv.meinungsbild.infrastructure.model.Topic;
import org.politaktiv.meinungsbild.infrastructure.service.RatingLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.SubtopicLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.SubtopicServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.TopicLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class MeinungsbildPortlet extends MVCPortlet{

	private static Log _log = LogFactoryUtil.getLog(MeinungsbildPortlet.class);
	private MeinungsbildRepository repository = new MeinungsbildRepository();
	
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException{
		
		SetOfOpinion setOfOpinion = null;
		
		try {
			setOfOpinion = repository.getSetOfOpinionByCommunityIdAndUserId(this.getCurrentCommunityId(renderRequest),
																		this.getCurrentUserId(renderRequest),
																		renderRequest.getPreferences());
		} catch (SystemException e) {
			SessionErrors.add(renderRequest, "veryBigError");
		}
		
		if(setOfOpinion == null)
			_log.error("setOfOpinion is null");
		
		if(setOfOpinion.getTopicList() == null)
			_log.error("topicList is null");
		
		renderRequest.setAttribute("setOfOpinion", setOfOpinion);
		
		
		super.doView(renderRequest, renderResponse);
	}



	
	
	//TODO REFACTORING - SIEHT JA SCHLIMM AUS HIER
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException,PortletException {
		
		//clear response
		resourceResponse.resetBuffer();
		
		//get USERINPUT
		String userActionInput = ParamUtil.getString(resourceRequest, "action");
		long subtopicId = ParamUtil.getLong(resourceRequest, "subtopicId");
		
		
		//build user rating action object
		UserRatingAction curUserRatingAction;
		try {
			curUserRatingAction = new UserRatingAction(this.getCurrentUserId(resourceRequest),this.getCurrentCommunityId(resourceRequest), userActionInput, subtopicId, resourceRequest.getPreferences());
			
			//test if action is valid
			if(!(curUserRatingAction.validateActionCommand() &&
					curUserRatingAction.subtopicExists() &&
					curUserRatingAction.userHasRatingsLeft())){
				
				//send "error"
				resourceResponse.getWriter().print("error");
				
			} else { //if rating action is valid and subtopic exists
				
				Rating tmpRating = null;
				
				//try to get rating from user
				try {
					tmpRating = repository.giveRatingByUserIdAndSubtopicId(this.getCurrentUserId(resourceRequest), subtopicId);
				} catch (SystemException e) {
					
					//send "error"
					resourceResponse.getWriter().print("error");
				}
				
				//if user never rated this subtopic
				if(tmpRating == null){
					
					_log.info("user never voted for this subtopic");
					
					try {
						//get new rating and fill with information
						tmpRating = RatingLocalServiceUtil.createRating(CounterLocalServiceUtil.increment());
						tmpRating.setUserId(this.getCurrentUserId(resourceRequest));
						tmpRating.setSubtopicId(curUserRatingAction.getSubtopicId());
						tmpRating.setUserId(curUserRatingAction.getUserId());
						
						//if user pressed minus score is 0, because negative not allowed
						if(curUserRatingAction.isMinusAction()){
							tmpRating.setScore(0);
							
						// if user pressed plus, first score is 1
						} else if(curUserRatingAction.isPlusAction()){
							tmpRating.setScore(1);
						}
						
						
						//add rating to database
						try {
							repository.addRating(this.getCurrentCommunityId(resourceRequest),tmpRating);
							resourceResponse.getWriter().print(tmpRating.getScore());
						} catch (PrincipalException e) {
							resourceResponse.getWriter().print("no_permission");
						}
						
						
					} catch (SystemException e) {
						
						//send "error"
						resourceResponse.getWriter().print("error");
						
					}
					
				} else { //is user already rated for this subtopic
					
					// user pressed (-) and subtopic score is greater 0
					if(curUserRatingAction.isMinusAction()){
						
						// decrease subtopic score
						tmpRating.decreaseScoreIfGreater0();
						
					//user pressed (+)
					} else if(curUserRatingAction.isPlusAction()){
						
						// increase subtopic score
						tmpRating.inceaseScore();
					}
					
					//update rating
					try {
						RatingLocalServiceUtil.updateRating(tmpRating);
						resourceResponse.getWriter().print(tmpRating.getScore());
					} catch (SystemException e) {
						resourceResponse.getWriter().print("error");
					}
					
				}
			}
		
		} catch (SystemException e1) {
			resourceResponse.getWriter().print("error");
		}
		
		resourceResponse.flushBuffer();
		super.serveResource(resourceRequest, resourceResponse);
	}

	public void doAddTopic(ActionRequest request, ActionResponse response){
		
		//get USERINPUT
		String topicNameFormInput = ParamUtil.getString(request,"topicNameAddFormInput");
		
		
		Topic newTopic = null;
		try {
			//create Topic
			newTopic = TopicLocalServiceUtil.createTopic(CounterLocalServiceUtil.increment());
		} catch (SystemException e1) {
			SessionErrors.add(request, "veryBigError");
		}
		
		//add user input
		newTopic.setName(topicNameFormInput);
		//add communityId
		newTopic.setCommunityId(this.getCurrentCommunityId(request));
		
		//validate(not empty, only characters and spaces) , and if its okay
		if(newTopic.validate()){
			try { // add to database
				repository.addTopic(this.getCurrentCommunityId(request),newTopic);
			} catch (SystemException e) {
				SessionErrors.add(request, "veryBigError");
				//if user has no permission to add
			} catch (PrincipalException e) {
				SessionErrors.add(request, "noPermission");
			}
		} else { //is topic not valide
			SessionErrors.add(request, "topicNameNotValide");
		}
	}
	
	/**
	 * Removes a topic
	 * @param request
	 * @param response
	 */
	public void doDeleteTopic(ActionRequest actionRequest, ActionResponse response){
		//get USERINPUT validated to long, if its invalid, it returns 0
		long topicIdFormInput = ParamUtil.getLong(actionRequest, "topicIdRemoveFormInput");
		
		if(topicIdFormInput != 0){
			try {
				//remove topic by id if its not 0 and does exist
				//and all its subtopics
				repository.deleteTopic(this.getCurrentCommunityId(actionRequest),topicIdFormInput);
			} catch (PortalException e) {
				SessionErrors.add(actionRequest, "indendedUserAction");
			} catch (SystemException e) {
				SessionErrors.add(actionRequest, "veryBigError");
			}
		} else {
			SessionErrors.add(actionRequest, "indendedUserAction");
		}
		
			
	}
	
	public void doAddSubtopic(ActionRequest request, ActionResponse response){
	
		//get USERINPUT an validate of its string && long
		String subtopicNameFormInput = ParamUtil.getString(request, "subtopicNameAddFormInput");
		String subtopicUrlAddFormInput = ParamUtil.getString(request, "subtopicUrlAddFormInput");
		long topicIdToAddSubtopicFormInput = ParamUtil.getLong(request, "topicIdToAddSubtopicFormInput");
		
		
		//generate new, empty subtopic
		Subtopic newSubtopic = null;
		 try {
			 //"factory" 
			newSubtopic = SubtopicLocalServiceUtil.createSubtopic(CounterLocalServiceUtil.increment());
		} catch (SystemException e) {
			SessionErrors.add(request, "veryBigError");
		}
		 //set userinput to new subtopic
		 newSubtopic.setName(subtopicNameFormInput);
		 newSubtopic.setUrl(subtopicUrlAddFormInput);
		 newSubtopic.setParentTopic(topicIdToAddSubtopicFormInput);
		 
		 //check if parentID exists && name has only characters && name is not empty && URL is valide
		 if(newSubtopic.validate()){
			 try {
				SubtopicLocalServiceUtil.addSubtopic(newSubtopic);
			} catch (SystemException e) {
				SessionErrors.add(request, "veryBigError");
			} 
		} else {
			SessionErrors.add(request, "subtopicInputNotValide");
		}
	}

	public void doMoveSubtopic(ActionRequest request, ActionResponse response){
		
		////get USERINPUT
		long subtopicId = ParamUtil.getLong(request, "subtopicIdMoveFormInput");
		long toParentTopicId = ParamUtil.getLong(request, "topicIdToMoveFormInput");
		
		try {
			//get chooses subtopic
			Subtopic tmpSubtopic = SubtopicLocalServiceUtil.getSubtopic(subtopicId);
			//set new parent topic
			tmpSubtopic.setParentTopic(toParentTopicId);
			
			//if new parent topic is valide
			if(tmpSubtopic.validate()){
				//update old subtopic
				SubtopicServiceUtil.updateSubtopic(this.getCurrentCommunityId(request),tmpSubtopic);
			} else {
				SessionErrors.add(request, "subtopicInputNotValide");
			}
			
		} catch (PortalException e) {
			SessionErrors.add(request, "indendedUserAction");
		} catch (SystemException e) {
			SessionErrors.add(request, "veryBigError");
		}
		
		
	}
	
	public void doDeleteSubtopic(ActionRequest actionRequest, ActionResponse response){
		
		//get USERINPUT
		long subTopicId = ParamUtil.getLong(actionRequest, "subtopicIdRemoveFormInput");
		try {
			repository.deleteSubtopic(this.getCurrentCommunityId(actionRequest),subTopicId);
		} catch (PortalException e) {
			SessionErrors.add(actionRequest, "indendedUserAction");
		} catch (SystemException e) {
			SessionErrors.add(actionRequest, "veryBigError");
		}
		
	}
	
	public void doSaveMaximumRatings(ActionRequest request, ActionResponse response){
		
		Integer maximumRatingPerUser = ParamUtil.getInteger(request,"maximumRatingPerUserFormInput");
		Integer maximumOfRatingPerSubtopic = ParamUtil.getInteger(request,"maximumOfRatingPerSubtopicFormInput");
		
		SetOfOpinion tmpValidateSetOfOpinion = new SetOfOpinion();
		tmpValidateSetOfOpinion.setNumberOfMaximumScoresByUser(maximumRatingPerUser);
		tmpValidateSetOfOpinion.setNumberOfMaximumScoreBySubtopic(maximumOfRatingPerSubtopic);
		
		
		try {
			if(!tmpValidateSetOfOpinion.validateMaxValues()){
				SessionErrors.add(request, "maximumsInputNotValid");
			} else {
				repository.saveMaximumRatings(tmpValidateSetOfOpinion, request);
			}

		
		
		} catch (ReadOnlyException e) {
			SessionErrors.add(request, "veryBigError");
		} catch (ValidatorException e) {
			SessionErrors.add(request, "veryBigError");
		} catch (IOException e) {
			SessionErrors.add(request, "veryBigError");
		}
	}
	
	private long getCurrentCommunityId(RenderRequest renderRequest) {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
				.getAttribute(WebKeys.THEME_DISPLAY); 
		
		return themeDisplay.getLayout().getGroupId();
	}
	
	private long getCurrentCommunityId(ActionRequest actionRequest) {
		ThemeDisplay themeDisplay = (ThemeDisplay) ((PortletRequest) actionRequest)
				.getAttribute(WebKeys.THEME_DISPLAY); 
		
		return themeDisplay.getLayout().getGroupId();
	}
	
	private long getCurrentCommunityId(ResourceRequest resourceRequest) {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest
				.getAttribute(WebKeys.THEME_DISPLAY); 
		
		return themeDisplay.getLayout().getGroupId();
	}
	
	/**
	 * Get userId of user in current scope
	 * @param resourceRequest
	 * @return userId
	 */
	private long getCurrentUserId(ResourceRequest resourceRequest) {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest
				.getAttribute(WebKeys.THEME_DISPLAY); 
		
		return themeDisplay.getUserId();
	}
	
	private long getCurrentUserId(RenderRequest renderRequest) {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
				.getAttribute(WebKeys.THEME_DISPLAY); 
		
		return themeDisplay.getUserId();
	}

}
