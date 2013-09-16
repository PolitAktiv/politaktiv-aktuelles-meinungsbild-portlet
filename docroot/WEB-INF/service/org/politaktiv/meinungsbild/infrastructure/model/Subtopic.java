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


package org.politaktiv.meinungsbild.infrastructure.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Subtopic service. Represents a row in the &quot;meinungsbild_Subtopic&quot; database table, with each column mapped to a property of this class.
 *
 * @author politaktiv
 * @see SubtopicModel
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicImpl
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl
 * @generated
 */
public interface Subtopic extends SubtopicModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Checks: does parent topic exists && is name valid && URL is valid URL
	*
	* @return if subtopic is valid
	*/
	public void setRatingList(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> ratingList);

	public boolean validate();

	public int getCurentUserScore();

	public void setCurrentUserScore(int score);

	public int getFullCommunityScore();

	public void setFullCommunityScore(int score);
}