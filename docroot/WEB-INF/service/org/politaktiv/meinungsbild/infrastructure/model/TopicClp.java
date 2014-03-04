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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.politaktiv.meinungsbild.infrastructure.service.ClpSerializer;
import org.politaktiv.meinungsbild.infrastructure.service.TopicLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author politaktiv
 */
public class TopicClp extends BaseModelImpl<Topic> implements Topic {
	public TopicClp() {
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

	@Override
	public long getTopicId() {
		return _topicId;
	}

	@Override
	public void setTopicId(long topicId) {
		_topicId = topicId;

		if (_topicRemoteModel != null) {
			try {
				Class<?> clazz = _topicRemoteModel.getClass();

				Method method = clazz.getMethod("setTopicId", long.class);

				method.invoke(_topicRemoteModel, topicId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_topicRemoteModel != null) {
			try {
				Class<?> clazz = _topicRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_topicRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCommunityId() {
		return _communityId;
	}

	@Override
	public void setCommunityId(long communityId) {
		_communityId = communityId;

		if (_topicRemoteModel != null) {
			try {
				Class<?> clazz = _topicRemoteModel.getClass();

				Method method = clazz.getMethod("setCommunityId", long.class);

				method.invoke(_topicRemoteModel, communityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean validate() {
		try {
			String methodName = "validate";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			Boolean returnObj = (Boolean)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public int getTotalTopicScore() {
		try {
			String methodName = "getTotalTopicScore";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			Integer returnObj = (Integer)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public void setSubtopics(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> subtopics) {
		try {
			String methodName = "setSubtopics";

			Class<?>[] parameterTypes = new Class<?>[] { java.util.List.class };

			Object[] parameterValues = new Object[] { subtopics };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopics() {
		try {
			String methodName = "getSubtopics";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> returnObj =
				(java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic>)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getTopicRemoteModel() {
		return _topicRemoteModel;
	}

	public void setTopicRemoteModel(BaseModel<?> topicRemoteModel) {
		_topicRemoteModel = topicRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _topicRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_topicRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TopicLocalServiceUtil.addTopic(this);
		}
		else {
			TopicLocalServiceUtil.updateTopic(this);
		}
	}

	@Override
	public Topic toEscapedModel() {
		return (Topic)ProxyUtil.newProxyInstance(Topic.class.getClassLoader(),
			new Class[] { Topic.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TopicClp clone = new TopicClp();

		clone.setTopicId(getTopicId());
		clone.setName(getName());
		clone.setCommunityId(getCommunityId());

		return clone;
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

		if (!(obj instanceof TopicClp)) {
			return false;
		}

		TopicClp topic = (TopicClp)obj;

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

	private long _topicId;
	private String _name;
	private long _communityId;
	private BaseModel<?> _topicRemoteModel;
}