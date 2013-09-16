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

package org.politaktiv.meinungsbild.infrastructure.model.impl;

import java.util.List;

import org.politaktiv.meinungsbild.application.MeinungsbildRepository;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import org.politaktiv.meinungsbild.infrastructure.model.Rating;
import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;
import org.politaktiv.meinungsbild.infrastructure.service.TopicLocalServiceUtil;

/**
 * The model implementation for the Subtopic service. Represents a row in the &quot;meinungsbild_Subtopic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.PA.meinungsbild.infrastructure.model.Subtopic} interface.
 * </p>
 *
 * <p>
 * Never reference this class directly. All methods that expect a subtopic model instance should use the {@link Subtopic} interface instead.
 * </p>
 */
public class SubtopicImpl extends SubtopicBaseImpl {
	
	private static Log _log = LogFactoryUtil.getLog(org.politaktiv.meinungsbild.infrastructure.model.Subtopic.class);
	
	private int curentUserScore = 0;
	private int fullCommunityScore = 0;
	private List<Rating> ratingsList;
	private MeinungsbildRepository repository = new MeinungsbildRepository();
	
	public SubtopicImpl() {
	}
	
	/**
	 * Checks: does parent topic exists && is name valid && URL is valid URL
	 * @return if subtopic is valid
	 */
	
	public void setRatingList(List<Rating> ratingList){
		this.ratingsList = ratingList;
	}
	public boolean validate(){
		try {
			//test if parentID exists
			TopicLocalServiceUtil.getTopic(this.getParentTopic());
			
			//test if
				//name has only allowed characters
										//			 ä      ö	 ü	   Ä     Ö      Ü	 ß
			if(!this.getName().matches("[a-zA-Z0-9\u00E4\u00F6\u00FC\u00C4\u00D6\u00DC\u00DF., ]+")
					|| this.getName().length() > 75
					
						//url is valide or empty
					|| !(Validator.isUrl(this.getUrl())
						|| this.getUrl().isEmpty())
						
						//url not longer then 249 chars
					|| this.getUrl().length() > 250){
				_log.debug("wrong name or url?");
				return false;
			}
			
			//if all checks passed
			return true;
			
			
			//return if parentId does not exists
		} catch (PortalException e) {
			return false;
		} catch (SystemException e) {
			return false;
		}
		
	}

	public int getCurentUserScore() {
		return curentUserScore;
	}
	
	public void setCurrentUserScore(int score){
		this.curentUserScore = score;
	}


	public int getFullCommunityScore() {
		return fullCommunityScore;
	}
	
	public void setFullCommunityScore(int score){
		this.fullCommunityScore = score;
	}
	


}