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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Subtopic service. Represents a row in the &quot;meinungsbild_Subtopic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicImpl}.
 * </p>
 *
 * @author politaktiv
 * @see Subtopic
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicImpl
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl
 * @generated
 */
public interface SubtopicModel extends BaseModel<Subtopic> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a subtopic model instance should use the {@link Subtopic} interface instead.
	 */

	/**
	 * Returns the primary key of this subtopic.
	 *
	 * @return the primary key of this subtopic
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this subtopic.
	 *
	 * @param primaryKey the primary key of this subtopic
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the subtopic ID of this subtopic.
	 *
	 * @return the subtopic ID of this subtopic
	 */
	public long getSubtopicId();

	/**
	 * Sets the subtopic ID of this subtopic.
	 *
	 * @param subtopicId the subtopic ID of this subtopic
	 */
	public void setSubtopicId(long subtopicId);

	/**
	 * Returns the name of this subtopic.
	 *
	 * @return the name of this subtopic
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this subtopic.
	 *
	 * @param name the name of this subtopic
	 */
	public void setName(String name);

	/**
	 * Returns the url of this subtopic.
	 *
	 * @return the url of this subtopic
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this subtopic.
	 *
	 * @param url the url of this subtopic
	 */
	public void setUrl(String url);

	/**
	 * Returns the parent topic of this subtopic.
	 *
	 * @return the parent topic of this subtopic
	 */
	public long getParentTopic();

	/**
	 * Sets the parent topic of this subtopic.
	 *
	 * @param parentTopic the parent topic of this subtopic
	 */
	public void setParentTopic(long parentTopic);

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
	public int compareTo(Subtopic subtopic);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Subtopic> toCacheModel();

	@Override
	public Subtopic toEscapedModel();

	@Override
	public Subtopic toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}