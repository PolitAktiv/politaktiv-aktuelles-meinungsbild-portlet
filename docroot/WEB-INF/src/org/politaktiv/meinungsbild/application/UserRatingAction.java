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

import javax.portlet.PortletPreferences;
import org.politaktiv.setofopinions.domain.SetOfOpinion;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.politaktiv.meinungsbild.infrastructure.service.SubtopicLocalServiceUtil;

public class UserRatingAction {

	long userId;
	long communityId;
	String action;
	long subtopicId;
	SetOfOpinion setOfOpinion;
	MeinungsbildRepository repository = new MeinungsbildRepository();
	private static Log _log = LogFactoryUtil.getLog(UserRatingAction.class);
	
	UserRatingAction(long userId, long communityId, String action, long subtopicId, PortletPreferences portletPreferences) throws SystemException{
		this.userId = userId;
		this.communityId = communityId;
		this.action = action;
		this.subtopicId = subtopicId;
		this.setOfOpinion = repository.getSetOfOpinionByCommunityIdAndUserId(communityId, userId, portletPreferences);
	}
	
	
	

	/**
	 * Checks if user has not reached maximum rating per subtopic && maximum rating for set of opinion
	 * @return user has not reached a maximum
	 * @throws SystemException
	 */
	public boolean userHasRatingsLeft() throws SystemException{
		
		_log.info("userHasRatingsLeft: asked");
		
		//user can always decrease points
		if(this.isMinusAction()){
			_log.info("userHasRatingLeft: isMinusAction!");
			return true;
		}
		
		//test of total sum for community for user is reached
		if(this.setOfOpinion.getSumOfUserRatings() >= this.setOfOpinion.getNumberOfMaximumScoresByUser()){
			return false;
		}
		
		//test if users rating for subtopic has no reached the maximum for subtopic per user
		if(this.setOfOpinion.getUserRatingForSubtopicId(this.subtopicId) >= this.setOfOpinion.getNumberOfMaximumScoreBySubtopic()){
			return false;
		}
		
		_log.info("userHasRatingsLeft: true");
		//if all checks passed
		return true;
		
	}
	
	/**
	 * Check, if subtopic exists
	 * @return
	 * @throws SystemException
	 */
	public boolean subtopicExists(){
		
		try { //try getting subtopic
			SubtopicLocalServiceUtil.getSubtopic(subtopicId);
			
			//if it does not exist
		} catch (PortalException e) {
			return false;
		} catch (SystemException e) {
			return false;
		}

		//if successful
		return true;
	}
	
	/**
	 * Test if the user action is a valid one (plusPress or minusPress)
	 * @return is valid input
	 */
	public boolean validateActionCommand(){
		
		return this.action.equals("plusPress")
				|| this.action.equals("minusPress");
	}
	
	public boolean isMinusAction(){
		return this.action.equals("minusPress");
	}
	
	public boolean isPlusAction(){
		return this.action.equals("plusPress");
	}
	
	public long getSubtopicId(){
		return this.subtopicId;
	}
	
	public long getUserId(){
		return this.userId;
	}
	
}
