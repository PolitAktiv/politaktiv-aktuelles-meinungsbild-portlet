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
import java.util.Collections;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

import org.politaktiv.setofopinions.domain.SetOfOpinion;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.security.auth.PrincipalException;
import org.politaktiv.meinungsbild.infrastructure.model.Rating;
import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;
import org.politaktiv.meinungsbild.infrastructure.model.Topic;
import org.politaktiv.meinungsbild.infrastructure.service.RatingLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.RatingServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.SubtopicLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.SubtopicServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.TopicLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.TopicServiceUtil;

public class MeinungsbildRepository {
	
	private static Log _log = LogFactoryUtil.getLog(MeinungsbildRepository.class);

	
	
	public SetOfOpinion getSetOfOpinionByCommunityIdAndUserId(long communityId, long userId, PortletPreferences portletPreferences) throws SystemException{
		
		List<Topic> tmpTopics = this.getAllTopicsByCommunityId(communityId);
		tmpTopics = this.fillSubtopics(tmpTopics,userId);
		
		SetOfOpinion returnSetOfOpinion = new SetOfOpinion(tmpTopics,
															this.getMaximumRatingPerUser(portletPreferences),
															this.getMaximumOfRatingPerSubtopic(portletPreferences));
		
		if(tmpTopics == null)
			_log.error("tmpTopics is null");
		
		return returnSetOfOpinion;
	}
	
	public void deleteTopic(long groupId,long topicId) throws PortalException, SystemException {
		
		Topic topic = TopicLocalServiceUtil.getTopic(topicId);
		//get subtopics from topic
		List<Subtopic> subtopicList = SubtopicLocalServiceUtil.getSubtopicsFromTopicId(topicId);
		//remove topic
		TopicServiceUtil.deleteTopic(groupId,topicId);
		//also remove subtopics
		//caution: no permission check in this case, because if user is allowed to remove topics
		//			subtopics have to be deleted too
		for(Subtopic subtopic : subtopicList){
			_log.info("try to remove subtopic " + subtopic.getName());
			SubtopicLocalServiceUtil.deleteSubtopic(subtopic);
			//delete ratings from subtopic
			this.deleteRatingFromSubtopicById(subtopic.getSubtopicId());
		}
		
		
	}

	/**
	 * Get Rating by User Id and Subtopic Id
	 * @param userId
	 * @param subtopicId
	 * @return
	 * @throws SystemException
	 */
	public Rating giveRatingByUserIdAndSubtopicId(long userId, long subtopicId) throws SystemException {
		
		return RatingLocalServiceUtil.giveRatingByUserIdAndSubtopicId(userId, subtopicId);
		
	}

	public void addRating(long currentCommunityId, Rating tmpRating) throws SystemException, PrincipalException {
		
		RatingServiceUtil.addRating(currentCommunityId,tmpRating);
		
	}
	
	public void saveMaximumRatings(SetOfOpinion tmpSetOfOpinionWithOnlyMaxValues, ActionRequest actionRequest) throws ReadOnlyException, ValidatorException, IOException {
			javax.portlet.PortletPreferences prefs = actionRequest.getPreferences();
			
			if(tmpSetOfOpinionWithOnlyMaxValues.validateMaxValues()){
				prefs.setValue("maximumRatingPerUser", Integer.toString(tmpSetOfOpinionWithOnlyMaxValues.getNumberOfMaximumScoresByUser()));
				prefs.setValue("maximumOfRatingPerSubtopic", Integer.toString(tmpSetOfOpinionWithOnlyMaxValues.getNumberOfMaximumScoreBySubtopic()));
				prefs.store();
			} else {
				SessionErrors.add(actionRequest, "maximumsInputNotValid");
			}
	}

	public void addTopic(long currentCommunityId, Topic newTopic) throws PrincipalException, SystemException {
		TopicServiceUtil.addTopic(currentCommunityId, newTopic);
	}

	public void deleteSubtopic(long currentCommunityId, long subTopicId) throws PortalException, SystemException {
		
		SubtopicServiceUtil.deleteSubtopic(currentCommunityId, subTopicId);
		
		//then delete ratings from subtopic
		this.deleteRatingFromSubtopicById(subTopicId);
	}
	
	private List<Topic> fillSubtopics(List<Topic> topics, long userId) throws SystemException{
		for(Topic topic:  topics){
			 List<Subtopic> tmpSubtopics = SubtopicLocalServiceUtil.getSubtopicsFromTopicId(topic.getTopicId());
			 
			 tmpSubtopics = this.fillRating(tmpSubtopics, userId);
			 topic.setSubtopics(tmpSubtopics);
		}
		return topics;
	}

	private List<Subtopic> fillRating(List<Subtopic> tmpSubtopics, long userId) throws SystemException {
		for(Subtopic subtopic: tmpSubtopics){
			int tmpSubtopicCommunityScore = this.getFullCommunityScoreBySubtopicId(subtopic.getSubtopicId());
			subtopic.setFullCommunityScore(tmpSubtopicCommunityScore);
			int tmpSubtopicUserScore = this.getUserRatingScoreOfSubtopicByUserIdandSubtopicId(userId, subtopic.getSubtopicId());
			subtopic.setCurrentUserScore(tmpSubtopicUserScore);
		}
		return tmpSubtopics;
	}

	private List<Topic> getAllTopicsByCommunityId(long communityId) throws SystemException{
		
		List<Topic> returnList = null;
		
		returnList = TopicLocalServiceUtil.giveTopicByCommunityId(communityId);
		
		if(returnList != null)
			return returnList;
		else
			return Collections.emptyList();
	}

	private int getUserRatingScoreOfSubtopicByUserIdandSubtopicId(long userId, long subtopicId) throws SystemException{
		
		Rating tmpRating = this.giveRatingByUserIdAndSubtopicId(userId, subtopicId);
		
		if(tmpRating == null){
			return 0;
		} else {
			return tmpRating.getScore();
		}
	}

	private int getFullCommunityScoreBySubtopicId(long subtopicId) throws SystemException {
			
			//TODO optimize with code like this:
	//		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
	//				Rating.class, PortalClassLoaderUtil.getClassLoader());
	//		
	//		dynamicQuery.add(RestrictionsFactoryUtil.eq("subtopicId", subtopicId));
	//		
	//		List<Rating> tmpRatingList = RatingLocalServiceUtil.dynamicQuery(dynamicQuery);
			
			
			List<Rating> tmpRatingList = RatingLocalServiceUtil.bySubtopicId(subtopicId);
			
			int returnSum = 0;
			
			for(Rating rating: tmpRatingList){
				
				returnSum = returnSum + rating.getScore();
			}
			
			return returnSum;
		}

	private int  getMaximumRatingPerUser(PortletPreferences prefs) {
		int maximumRatingPerUser = Integer.parseInt(((javax.portlet.PortletPreferences) prefs).getValue("maximumRatingPerUser","0"));
		return maximumRatingPerUser;
	}

	private int  getMaximumOfRatingPerSubtopic(PortletPreferences prefs) {
		int maximumOfRatingPerSubtopic = Integer.parseInt(prefs.getValue("maximumOfRatingPerSubtopic","3"));
		return maximumOfRatingPerSubtopic;
	}

	private void deleteRatingFromSubtopicById(long subtopicId) throws SystemException{
		
		//get ratings by subtopicId
		List<Rating> tmpRatingList = RatingLocalServiceUtil.bySubtopicId(subtopicId);
		
		//remove them
		
		for(Rating rating: tmpRatingList){
			RatingLocalServiceUtil.deleteRating(rating);
		}
	}

}







