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
 * This class is a wrapper for {@link Rating}.
 * </p>
 *
 * @author politaktiv
 * @see Rating
 * @generated
 */
public class RatingWrapper implements Rating, ModelWrapper<Rating> {
	public RatingWrapper(Rating rating) {
		_rating = rating;
	}

	@Override
	public Class<?> getModelClass() {
		return Rating.class;
	}

	@Override
	public String getModelClassName() {
		return Rating.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ratingId", getRatingId());
		attributes.put("userId", getUserId());
		attributes.put("subtopicId", getSubtopicId());
		attributes.put("score", getScore());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ratingId = (Long)attributes.get("ratingId");

		if (ratingId != null) {
			setRatingId(ratingId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long subtopicId = (Long)attributes.get("subtopicId");

		if (subtopicId != null) {
			setSubtopicId(subtopicId);
		}

		Integer score = (Integer)attributes.get("score");

		if (score != null) {
			setScore(score);
		}
	}

	/**
	* Returns the primary key of this rating.
	*
	* @return the primary key of this rating
	*/
	@Override
	public long getPrimaryKey() {
		return _rating.getPrimaryKey();
	}

	/**
	* Sets the primary key of this rating.
	*
	* @param primaryKey the primary key of this rating
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rating.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rating ID of this rating.
	*
	* @return the rating ID of this rating
	*/
	@Override
	public long getRatingId() {
		return _rating.getRatingId();
	}

	/**
	* Sets the rating ID of this rating.
	*
	* @param ratingId the rating ID of this rating
	*/
	@Override
	public void setRatingId(long ratingId) {
		_rating.setRatingId(ratingId);
	}

	/**
	* Returns the user ID of this rating.
	*
	* @return the user ID of this rating
	*/
	@Override
	public long getUserId() {
		return _rating.getUserId();
	}

	/**
	* Sets the user ID of this rating.
	*
	* @param userId the user ID of this rating
	*/
	@Override
	public void setUserId(long userId) {
		_rating.setUserId(userId);
	}

	/**
	* Returns the user uuid of this rating.
	*
	* @return the user uuid of this rating
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rating.getUserUuid();
	}

	/**
	* Sets the user uuid of this rating.
	*
	* @param userUuid the user uuid of this rating
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_rating.setUserUuid(userUuid);
	}

	/**
	* Returns the subtopic ID of this rating.
	*
	* @return the subtopic ID of this rating
	*/
	@Override
	public long getSubtopicId() {
		return _rating.getSubtopicId();
	}

	/**
	* Sets the subtopic ID of this rating.
	*
	* @param subtopicId the subtopic ID of this rating
	*/
	@Override
	public void setSubtopicId(long subtopicId) {
		_rating.setSubtopicId(subtopicId);
	}

	/**
	* Returns the score of this rating.
	*
	* @return the score of this rating
	*/
	@Override
	public int getScore() {
		return _rating.getScore();
	}

	/**
	* Sets the score of this rating.
	*
	* @param score the score of this rating
	*/
	@Override
	public void setScore(int score) {
		_rating.setScore(score);
	}

	@Override
	public boolean isNew() {
		return _rating.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_rating.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _rating.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rating.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _rating.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _rating.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_rating.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _rating.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_rating.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_rating.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_rating.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RatingWrapper((Rating)_rating.clone());
	}

	@Override
	public int compareTo(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating) {
		return _rating.compareTo(rating);
	}

	@Override
	public int hashCode() {
		return _rating.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.politaktiv.meinungsbild.infrastructure.model.Rating> toCacheModel() {
		return _rating.toCacheModel();
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Rating toEscapedModel() {
		return new RatingWrapper(_rating.toEscapedModel());
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Rating toUnescapedModel() {
		return new RatingWrapper(_rating.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _rating.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rating.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_rating.persist();
	}

	@Override
	public boolean validate() {
		return _rating.validate();
	}

	@Override
	public void inceaseScore() {
		_rating.inceaseScore();
	}

	@Override
	public void decreaseScoreIfGreater0() {
		_rating.decreaseScoreIfGreater0();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RatingWrapper)) {
			return false;
		}

		RatingWrapper ratingWrapper = (RatingWrapper)obj;

		if (Validator.equals(_rating, ratingWrapper._rating)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Rating getWrappedRating() {
		return _rating;
	}

	@Override
	public Rating getWrappedModel() {
		return _rating;
	}

	@Override
	public void resetOriginalValues() {
		_rating.resetOriginalValues();
	}

	private Rating _rating;
}