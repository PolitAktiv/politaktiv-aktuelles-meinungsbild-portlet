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

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link Subtopic}.
 * </p>
 *
 * @author    politaktiv
 * @see       Subtopic
 * @generated
 */
public class SubtopicWrapper implements Subtopic, ModelWrapper<Subtopic> {
	public SubtopicWrapper(Subtopic subtopic) {
		_subtopic = subtopic;
	}

	public Class<?> getModelClass() {
		return Subtopic.class;
	}

	public String getModelClassName() {
		return Subtopic.class.getName();
	}

	/**
	* Returns the primary key of this subtopic.
	*
	* @return the primary key of this subtopic
	*/
	public long getPrimaryKey() {
		return _subtopic.getPrimaryKey();
	}

	/**
	* Sets the primary key of this subtopic.
	*
	* @param primaryKey the primary key of this subtopic
	*/
	public void setPrimaryKey(long primaryKey) {
		_subtopic.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the subtopic ID of this subtopic.
	*
	* @return the subtopic ID of this subtopic
	*/
	public long getSubtopicId() {
		return _subtopic.getSubtopicId();
	}

	/**
	* Sets the subtopic ID of this subtopic.
	*
	* @param subtopicId the subtopic ID of this subtopic
	*/
	public void setSubtopicId(long subtopicId) {
		_subtopic.setSubtopicId(subtopicId);
	}

	/**
	* Returns the name of this subtopic.
	*
	* @return the name of this subtopic
	*/
	public java.lang.String getName() {
		return _subtopic.getName();
	}

	/**
	* Sets the name of this subtopic.
	*
	* @param name the name of this subtopic
	*/
	public void setName(java.lang.String name) {
		_subtopic.setName(name);
	}

	/**
	* Returns the url of this subtopic.
	*
	* @return the url of this subtopic
	*/
	public java.lang.String getUrl() {
		return _subtopic.getUrl();
	}

	/**
	* Sets the url of this subtopic.
	*
	* @param url the url of this subtopic
	*/
	public void setUrl(java.lang.String url) {
		_subtopic.setUrl(url);
	}

	/**
	* Returns the parent topic of this subtopic.
	*
	* @return the parent topic of this subtopic
	*/
	public long getParentTopic() {
		return _subtopic.getParentTopic();
	}

	/**
	* Sets the parent topic of this subtopic.
	*
	* @param parentTopic the parent topic of this subtopic
	*/
	public void setParentTopic(long parentTopic) {
		_subtopic.setParentTopic(parentTopic);
	}

	public boolean isNew() {
		return _subtopic.isNew();
	}

	public void setNew(boolean n) {
		_subtopic.setNew(n);
	}

	public boolean isCachedModel() {
		return _subtopic.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_subtopic.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _subtopic.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _subtopic.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_subtopic.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _subtopic.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_subtopic.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SubtopicWrapper((Subtopic)_subtopic.clone());
	}

	public int compareTo(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic) {
		return _subtopic.compareTo(subtopic);
	}

	@Override
	public int hashCode() {
		return _subtopic.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> toCacheModel() {
		return _subtopic.toCacheModel();
	}

	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic toEscapedModel() {
		return new SubtopicWrapper(_subtopic.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _subtopic.toString();
	}

	public java.lang.String toXmlString() {
		return _subtopic.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_subtopic.persist();
	}

	/**
	* Checks: does parent topic exists && is name valid && URL is valid URL
	*
	* @return if subtopic is valid
	*/
	public void setRatingList(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> ratingList) {
		_subtopic.setRatingList(ratingList);
	}

	public boolean validate() {
		return _subtopic.validate();
	}

	public int getCurentUserScore() {
		return _subtopic.getCurentUserScore();
	}

	public void setCurrentUserScore(int score) {
		_subtopic.setCurrentUserScore(score);
	}

	public int getFullCommunityScore() {
		return _subtopic.getFullCommunityScore();
	}

	public void setFullCommunityScore(int score) {
		_subtopic.setFullCommunityScore(score);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Subtopic getWrappedSubtopic() {
		return _subtopic;
	}

	public Subtopic getWrappedModel() {
		return _subtopic;
	}

	public void resetOriginalValues() {
		_subtopic.resetOriginalValues();
	}

	private Subtopic _subtopic;
}