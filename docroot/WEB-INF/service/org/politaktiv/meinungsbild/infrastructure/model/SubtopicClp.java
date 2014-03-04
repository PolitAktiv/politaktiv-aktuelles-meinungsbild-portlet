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
import org.politaktiv.meinungsbild.infrastructure.service.SubtopicLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author politaktiv
 */
public class SubtopicClp extends BaseModelImpl<Subtopic> implements Subtopic {
	public SubtopicClp() {
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
	public long getPrimaryKey() {
		return _subtopicId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSubtopicId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _subtopicId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getSubtopicId() {
		return _subtopicId;
	}

	@Override
	public void setSubtopicId(long subtopicId) {
		_subtopicId = subtopicId;

		if (_subtopicRemoteModel != null) {
			try {
				Class<?> clazz = _subtopicRemoteModel.getClass();

				Method method = clazz.getMethod("setSubtopicId", long.class);

				method.invoke(_subtopicRemoteModel, subtopicId);
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

		if (_subtopicRemoteModel != null) {
			try {
				Class<?> clazz = _subtopicRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_subtopicRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrl() {
		return _url;
	}

	@Override
	public void setUrl(String url) {
		_url = url;

		if (_subtopicRemoteModel != null) {
			try {
				Class<?> clazz = _subtopicRemoteModel.getClass();

				Method method = clazz.getMethod("setUrl", String.class);

				method.invoke(_subtopicRemoteModel, url);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParentTopic() {
		return _parentTopic;
	}

	@Override
	public void setParentTopic(long parentTopic) {
		_parentTopic = parentTopic;

		if (_subtopicRemoteModel != null) {
			try {
				Class<?> clazz = _subtopicRemoteModel.getClass();

				Method method = clazz.getMethod("setParentTopic", long.class);

				method.invoke(_subtopicRemoteModel, parentTopic);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setFullCommunityScore(int score) {
		try {
			String methodName = "setFullCommunityScore";

			Class<?>[] parameterTypes = new Class<?>[] { int.class };

			Object[] parameterValues = new Object[] { score };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public void setRatingList(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> ratingList) {
		try {
			String methodName = "setRatingList";

			Class<?>[] parameterTypes = new Class<?>[] { java.util.List.class };

			Object[] parameterValues = new Object[] { ratingList };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public int getFullCommunityScore() {
		try {
			String methodName = "getFullCommunityScore";

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
	public void setCurrentUserScore(int score) {
		try {
			String methodName = "setCurrentUserScore";

			Class<?>[] parameterTypes = new Class<?>[] { int.class };

			Object[] parameterValues = new Object[] { score };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public int getCurentUserScore() {
		try {
			String methodName = "getCurentUserScore";

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

	public BaseModel<?> getSubtopicRemoteModel() {
		return _subtopicRemoteModel;
	}

	public void setSubtopicRemoteModel(BaseModel<?> subtopicRemoteModel) {
		_subtopicRemoteModel = subtopicRemoteModel;
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

		Class<?> remoteModelClass = _subtopicRemoteModel.getClass();

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

		Object returnValue = method.invoke(_subtopicRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SubtopicLocalServiceUtil.addSubtopic(this);
		}
		else {
			SubtopicLocalServiceUtil.updateSubtopic(this);
		}
	}

	@Override
	public Subtopic toEscapedModel() {
		return (Subtopic)ProxyUtil.newProxyInstance(Subtopic.class.getClassLoader(),
			new Class[] { Subtopic.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SubtopicClp clone = new SubtopicClp();

		clone.setSubtopicId(getSubtopicId());
		clone.setName(getName());
		clone.setUrl(getUrl());
		clone.setParentTopic(getParentTopic());

		return clone;
	}

	@Override
	public int compareTo(Subtopic subtopic) {
		long primaryKey = subtopic.getPrimaryKey();

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

		if (!(obj instanceof SubtopicClp)) {
			return false;
		}

		SubtopicClp subtopic = (SubtopicClp)obj;

		long primaryKey = subtopic.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{subtopicId=");
		sb.append(getSubtopicId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", parentTopic=");
		sb.append(getParentTopic());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.politaktiv.meinungsbild.infrastructure.model.Subtopic");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>subtopicId</column-name><column-value><![CDATA[");
		sb.append(getSubtopicId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentTopic</column-name><column-value><![CDATA[");
		sb.append(getParentTopic());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _subtopicId;
	private String _name;
	private String _url;
	private long _parentTopic;
	private BaseModel<?> _subtopicRemoteModel;
}