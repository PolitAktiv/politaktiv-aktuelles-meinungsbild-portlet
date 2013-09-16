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
 * This class is a wrapper for {@link Topic}.
 * </p>
 *
 * @author    politaktiv
 * @see       Topic
 * @generated
 */
public class TopicWrapper implements Topic, ModelWrapper<Topic> {
	public TopicWrapper(Topic topic) {
		_topic = topic;
	}

	public Class<?> getModelClass() {
		return Topic.class;
	}

	public String getModelClassName() {
		return Topic.class.getName();
	}

	/**
	* Returns the primary key of this topic.
	*
	* @return the primary key of this topic
	*/
	public long getPrimaryKey() {
		return _topic.getPrimaryKey();
	}

	/**
	* Sets the primary key of this topic.
	*
	* @param primaryKey the primary key of this topic
	*/
	public void setPrimaryKey(long primaryKey) {
		_topic.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the topic ID of this topic.
	*
	* @return the topic ID of this topic
	*/
	public long getTopicId() {
		return _topic.getTopicId();
	}

	/**
	* Sets the topic ID of this topic.
	*
	* @param topicId the topic ID of this topic
	*/
	public void setTopicId(long topicId) {
		_topic.setTopicId(topicId);
	}

	/**
	* Returns the name of this topic.
	*
	* @return the name of this topic
	*/
	public java.lang.String getName() {
		return _topic.getName();
	}

	/**
	* Sets the name of this topic.
	*
	* @param name the name of this topic
	*/
	public void setName(java.lang.String name) {
		_topic.setName(name);
	}

	/**
	* Returns the community ID of this topic.
	*
	* @return the community ID of this topic
	*/
	public long getCommunityId() {
		return _topic.getCommunityId();
	}

	/**
	* Sets the community ID of this topic.
	*
	* @param communityId the community ID of this topic
	*/
	public void setCommunityId(long communityId) {
		_topic.setCommunityId(communityId);
	}

	public boolean isNew() {
		return _topic.isNew();
	}

	public void setNew(boolean n) {
		_topic.setNew(n);
	}

	public boolean isCachedModel() {
		return _topic.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_topic.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _topic.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _topic.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_topic.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _topic.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_topic.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TopicWrapper((Topic)_topic.clone());
	}

	public int compareTo(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic) {
		return _topic.compareTo(topic);
	}

	@Override
	public int hashCode() {
		return _topic.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.politaktiv.meinungsbild.infrastructure.model.Topic> toCacheModel() {
		return _topic.toCacheModel();
	}

	public org.politaktiv.meinungsbild.infrastructure.model.Topic toEscapedModel() {
		return new TopicWrapper(_topic.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _topic.toString();
	}

	public java.lang.String toXmlString() {
		return _topic.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_topic.persist();
	}

	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopics() {
		return _topic.getSubtopics();
	}

	public boolean validate() {
		return _topic.validate();
	}

	public int getTotalTopicScore() {
		return _topic.getTotalTopicScore();
	}

	public void setSubtopics(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> subtopics) {
		_topic.setSubtopics(subtopics);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Topic getWrappedTopic() {
		return _topic;
	}

	public Topic getWrappedModel() {
		return _topic;
	}

	public void resetOriginalValues() {
		_topic.resetOriginalValues();
	}

	private Topic _topic;
}