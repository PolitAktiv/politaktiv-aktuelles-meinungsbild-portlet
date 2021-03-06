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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Rating service. Represents a row in the &quot;meinungsbild_Rating&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.politaktiv.meinungsbild.infrastructure.model.impl.RatingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.politaktiv.meinungsbild.infrastructure.model.impl.RatingImpl}.
 * </p>
 *
 * @author politaktiv
 * @see Rating
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.RatingImpl
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.RatingModelImpl
 * @generated
 */
public interface RatingModel extends BaseModel<Rating> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a rating model instance should use the {@link Rating} interface instead.
	 */

	/**
	 * Returns the primary key of this rating.
	 *
	 * @return the primary key of this rating
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this rating.
	 *
	 * @param primaryKey the primary key of this rating
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the rating ID of this rating.
	 *
	 * @return the rating ID of this rating
	 */
	public long getRatingId();

	/**
	 * Sets the rating ID of this rating.
	 *
	 * @param ratingId the rating ID of this rating
	 */
	public void setRatingId(long ratingId);

	/**
	 * Returns the user ID of this rating.
	 *
	 * @return the user ID of this rating
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this rating.
	 *
	 * @param userId the user ID of this rating
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this rating.
	 *
	 * @return the user uuid of this rating
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this rating.
	 *
	 * @param userUuid the user uuid of this rating
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the subtopic ID of this rating.
	 *
	 * @return the subtopic ID of this rating
	 */
	public long getSubtopicId();

	/**
	 * Sets the subtopic ID of this rating.
	 *
	 * @param subtopicId the subtopic ID of this rating
	 */
	public void setSubtopicId(long subtopicId);

	/**
	 * Returns the score of this rating.
	 *
	 * @return the score of this rating
	 */
	public int getScore();

	/**
	 * Sets the score of this rating.
	 *
	 * @param score the score of this rating
	 */
	public void setScore(int score);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Rating rating);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Rating> toCacheModel();

	@Override
	public Rating toEscapedModel();

	@Override
	public Rating toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}