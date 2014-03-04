/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.politaktiv.meinungsbild.infrastructure.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Topic}.
 * </p>
 *
 * @author politaktiv
 * @see Topic
 * @generated
 */
public class TopicWrapper implements Topic, ModelWrapper<Topic> {
	public TopicWrapper(Topic topic) {
		_topic = topic;
	}

	@Override
	public Class<?> getModelClass() {
		return Topic.class;
	}

	@Override
	public String getModelClassName() {
		return Topic.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("topicId", getTopicId());
		attributes.put("name", getName());
		attributes.put("communityId", getCommunityId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long topicId = (Long)attributes.get("topicId");

		if (topicId != null) {
			setTopicId(topicId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long communityId = (Long)attributes.get("communityId");

		if (communityId != null) {
			setCommunityId(communityId);
		}
	}

	/**
	* Returns the primary key of this topic.
	*
	* @return the primary key of this topic
	*/
	@Override
	public long getPrimaryKey() {
		return _topic.getPrimaryKey();
	}

	/**
	* Sets the primary key of this topic.
	*
	* @param primaryKey the primary key of this topic
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_topic.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the topic ID of this topic.
	*
	* @return the topic ID of this topic
	*/
	@Override
	public long getTopicId() {
		return _topic.getTopicId();
	}

	/**
	* Sets the topic ID of this topic.
	*
	* @param topicId the topic ID of this topic
	*/
	@Override
	public void setTopicId(long topicId) {
		_topic.setTopicId(topicId);
	}

	/**
	* Returns the name of this topic.
	*
	* @return the name of this topic
	*/
	@Override
	public java.lang.String getName() {
		return _topic.getName();
	}

	/**
	* Sets the name of this topic.
	*
	* @param name the name of this topic
	*/
	@Override
	public void setName(java.lang.String name) {
		_topic.setName(name);
	}

	/**
	* Returns the community ID of this topic.
	*
	* @return the community ID of this topic
	*/
	@Override
	public long getCommunityId() {
		return _topic.getCommunityId();
	}

	/**
	* Sets the community ID of this topic.
	*
	* @param communityId the community ID of this topic
	*/
	@Override
	public void setCommunityId(long communityId) {
		_topic.setCommunityId(communityId);
	}

	@Override
	public boolean isNew() {
		return _topic.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_topic.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _topic.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_topic.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _topic.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _topic.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_topic.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _topic.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_topic.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_topic.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_topic.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TopicWrapper((Topic)_topic.clone());
	}

	@Override
	public int compareTo(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic) {
		return _topic.compareTo(topic);
	}

	@Override
	public int hashCode() {
		return _topic.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.politaktiv.meinungsbild.infrastructure.model.Topic> toCacheModel() {
		return _topic.toCacheModel();
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic toEscapedModel() {
		return new TopicWrapper(_topic.toEscapedModel());
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic toUnescapedModel() {
		return new TopicWrapper(_topic.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _topic.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _topic.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_topic.persist();
	}

	@Override
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopics() {
		return _topic.getSubtopics();
	}

	@Override
	public boolean validate() {
		return _topic.validate();
	}

	@Override
	public int getTotalTopicScore() {
		return _topic.getTotalTopicScore();
	}

	@Override
	public void setSubtopics(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> subtopics) {
		_topic.setSubtopics(subtopics);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TopicWrapper)) {
			return false;
		}

		TopicWrapper topicWrapper = (TopicWrapper)obj;

		if (Validator.equals(_topic, topicWrapper._topic)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Topic getWrappedTopic() {
		return _topic;
	}

	@Override
	public Topic getWrappedModel() {
		return _topic;
	}

	@Override
	public void resetOriginalValues() {
		_topic.resetOriginalValues();
	}

	private Topic _topic;
}