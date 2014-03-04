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
 * This class is a wrapper for {@link Subtopic}.
 * </p>
 *
 * @author politaktiv
 * @see Subtopic
 * @generated
 */
public class SubtopicWrapper implements Subtopic, ModelWrapper<Subtopic> {
	public SubtopicWrapper(Subtopic subtopic) {
		_subtopic = subtopic;
	}

	@Override
	public Class<?> getModelClass() {
		return Subtopic.class;
	}

	@Override
	public String getModelClassName() {
		return Subtopic.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subtopicId", getSubtopicId());
		attributes.put("name", getName());
		attributes.put("url", getUrl());
		attributes.put("parentTopic", getParentTopic());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subtopicId = (Long)attributes.get("subtopicId");

		if (subtopicId != null) {
			setSubtopicId(subtopicId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Long parentTopic = (Long)attributes.get("parentTopic");

		if (parentTopic != null) {
			setParentTopic(parentTopic);
		}
	}

	/**
	* Returns the primary key of this subtopic.
	*
	* @return the primary key of this subtopic
	*/
	@Override
	public long getPrimaryKey() {
		return _subtopic.getPrimaryKey();
	}

	/**
	* Sets the primary key of this subtopic.
	*
	* @param primaryKey the primary key of this subtopic
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_subtopic.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the subtopic ID of this subtopic.
	*
	* @return the subtopic ID of this subtopic
	*/
	@Override
	public long getSubtopicId() {
		return _subtopic.getSubtopicId();
	}

	/**
	* Sets the subtopic ID of this subtopic.
	*
	* @param subtopicId the subtopic ID of this subtopic
	*/
	@Override
	public void setSubtopicId(long subtopicId) {
		_subtopic.setSubtopicId(subtopicId);
	}

	/**
	* Returns the name of this subtopic.
	*
	* @return the name of this subtopic
	*/
	@Override
	public java.lang.String getName() {
		return _subtopic.getName();
	}

	/**
	* Sets the name of this subtopic.
	*
	* @param name the name of this subtopic
	*/
	@Override
	public void setName(java.lang.String name) {
		_subtopic.setName(name);
	}

	/**
	* Returns the url of this subtopic.
	*
	* @return the url of this subtopic
	*/
	@Override
	public java.lang.String getUrl() {
		return _subtopic.getUrl();
	}

	/**
	* Sets the url of this subtopic.
	*
	* @param url the url of this subtopic
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_subtopic.setUrl(url);
	}

	/**
	* Returns the parent topic of this subtopic.
	*
	* @return the parent topic of this subtopic
	*/
	@Override
	public long getParentTopic() {
		return _subtopic.getParentTopic();
	}

	/**
	* Sets the parent topic of this subtopic.
	*
	* @param parentTopic the parent topic of this subtopic
	*/
	@Override
	public void setParentTopic(long parentTopic) {
		_subtopic.setParentTopic(parentTopic);
	}

	@Override
	public boolean isNew() {
		return _subtopic.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_subtopic.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _subtopic.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_subtopic.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _subtopic.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _subtopic.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_subtopic.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _subtopic.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_subtopic.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_subtopic.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_subtopic.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SubtopicWrapper((Subtopic)_subtopic.clone());
	}

	@Override
	public int compareTo(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic) {
		return _subtopic.compareTo(subtopic);
	}

	@Override
	public int hashCode() {
		return _subtopic.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> toCacheModel() {
		return _subtopic.toCacheModel();
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic toEscapedModel() {
		return new SubtopicWrapper(_subtopic.toEscapedModel());
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic toUnescapedModel() {
		return new SubtopicWrapper(_subtopic.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _subtopic.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _subtopic.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_subtopic.persist();
	}

	/**
	* Checks: does parent topic exists && is name valid && URL is valid URL
	*
	* @return if subtopic is valid
	*/
	@Override
	public void setRatingList(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> ratingList) {
		_subtopic.setRatingList(ratingList);
	}

	@Override
	public boolean validate() {
		return _subtopic.validate();
	}

	@Override
	public int getCurentUserScore() {
		return _subtopic.getCurentUserScore();
	}

	@Override
	public void setCurrentUserScore(int score) {
		_subtopic.setCurrentUserScore(score);
	}

	@Override
	public int getFullCommunityScore() {
		return _subtopic.getFullCommunityScore();
	}

	@Override
	public void setFullCommunityScore(int score) {
		_subtopic.setFullCommunityScore(score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SubtopicWrapper)) {
			return false;
		}

		SubtopicWrapper subtopicWrapper = (SubtopicWrapper)obj;

		if (Validator.equals(_subtopic, subtopicWrapper._subtopic)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Subtopic getWrappedSubtopic() {
		return _subtopic;
	}

	@Override
	public Subtopic getWrappedModel() {
		return _subtopic;
	}

	@Override
	public void resetOriginalValues() {
		_subtopic.resetOriginalValues();
	}

	private Subtopic _subtopic;
}