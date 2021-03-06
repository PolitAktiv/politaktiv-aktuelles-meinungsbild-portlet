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

package org.politaktiv.meinungsbild.infrastructure.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.politaktiv.meinungsbild.infrastructure.model.Topic;
import org.politaktiv.meinungsbild.infrastructure.model.TopicModel;
import org.politaktiv.meinungsbild.infrastructure.model.TopicSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Topic service. Represents a row in the &quot;meinungsbild_Topic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.politaktiv.meinungsbild.infrastructure.model.TopicModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TopicImpl}.
 * </p>
 *
 * @author politaktiv
 * @see TopicImpl
 * @see org.politaktiv.meinungsbild.infrastructure.model.Topic
 * @see org.politaktiv.meinungsbild.infrastructure.model.TopicModel
 * @generated
 */
@JSON(strict = true)
public class TopicModelImpl extends BaseModelImpl<Topic> implements TopicModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a topic model instance should use the {@link org.politaktiv.meinungsbild.infrastructure.model.Topic} interface instead.
	 */
	public static final String TABLE_NAME = "meinungsbild_Topic";
	public static final Object[][] TABLE_COLUMNS = {
			{ "topicId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "communityId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table meinungsbild_Topic (topicId LONG not null primary key,name VARCHAR(75) null,communityId LONG)";
	public static final String TABLE_SQL_DROP = "drop table meinungsbild_Topic";
	public static final String ORDER_BY_JPQL = " ORDER BY topic.topicId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY meinungsbild_Topic.topicId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.politaktiv.meinungsbild.infrastructure.model.Topic"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.politaktiv.meinungsbild.infrastructure.model.Topic"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.politaktiv.meinungsbild.infrastructure.model.Topic"),
			true);
	public static long COMMUNITYID_COLUMN_BITMASK = 1L;
	public static long TOPICID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Topic toModel(TopicSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Topic model = new TopicImpl();

		model.setTopicId(soapModel.getTopicId());
		model.setName(soapModel.getName());
		model.setCommunityId(soapModel.getCommunityId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Topic> toModels(TopicSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Topic> models = new ArrayList<Topic>(soapModels.length);

		for (TopicSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.politaktiv.meinungsbild.infrastructure.model.Topic"));

	public TopicModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _topicId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTopicId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _topicId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public long getTopicId() {
		return _topicId;
	}

	@Override
	public void setTopicId(long topicId) {
		_topicId = topicId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@JSON
	@Override
	public long getCommunityId() {
		return _communityId;
	}

	@Override
	public void setCommunityId(long communityId) {
		_columnBitmask |= COMMUNITYID_COLUMN_BITMASK;

		if (!_setOriginalCommunityId) {
			_setOriginalCommunityId = true;

			_originalCommunityId = _communityId;
		}

		_communityId = communityId;
	}

	public long getOriginalCommunityId() {
		return _originalCommunityId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Topic.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Topic toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Topic)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TopicImpl topicImpl = new TopicImpl();

		topicImpl.setTopicId(getTopicId());
		topicImpl.setName(getName());
		topicImpl.setCommunityId(getCommunityId());

		topicImpl.resetOriginalValues();

		return topicImpl;
	}

	@Override
	public int compareTo(Topic topic) {
		long primaryKey = topic.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Topic)) {
			return false;
		}

		Topic topic = (Topic)obj;

		long primaryKey = topic.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		TopicModelImpl topicModelImpl = this;

		topicModelImpl._originalCommunityId = topicModelImpl._communityId;

		topicModelImpl._setOriginalCommunityId = false;

		topicModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Topic> toCacheModel() {
		TopicCacheModel topicCacheModel = new TopicCacheModel();

		topicCacheModel.topicId = getTopicId();

		topicCacheModel.name = getName();

		String name = topicCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			topicCacheModel.name = null;
		}

		topicCacheModel.communityId = getCommunityId();

		return topicCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{topicId=");
		sb.append(getTopicId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", communityId=");
		sb.append(getCommunityId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("org.politaktiv.meinungsbild.infrastructure.model.Topic");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>topicId</column-name><column-value><![CDATA[");
		sb.append(getTopicId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>communityId</column-name><column-value><![CDATA[");
		sb.append(getCommunityId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Topic.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Topic.class };
	private long _topicId;
	private String _name;
	private long _communityId;
	private long _originalCommunityId;
	private boolean _setOriginalCommunityId;
	private long _columnBitmask;
	private Topic _escapedModel;
}