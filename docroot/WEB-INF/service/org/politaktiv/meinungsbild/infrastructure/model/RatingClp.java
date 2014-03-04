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
import com.liferay.portal.util.PortalUtil;

import org.politaktiv.meinungsbild.infrastructure.service.ClpSerializer;
import org.politaktiv.meinungsbild.infrastructure.service.RatingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author politaktiv
 */
public class RatingClp extends BaseModelImpl<Rating> implements Rating {
	public RatingClp() {
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
	public long getPrimaryKey() {
		return _ratingId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRatingId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ratingId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getRatingId() {
		return _ratingId;
	}

	@Override
	public void setRatingId(long ratingId) {
		_ratingId = ratingId;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setRatingId", long.class);

				method.invoke(_ratingRemoteModel, ratingId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_ratingRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getSubtopicId() {
		return _subtopicId;
	}

	@Override
	public void setSubtopicId(long subtopicId) {
		_subtopicId = subtopicId;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setSubtopicId", long.class);

				method.invoke(_ratingRemoteModel, subtopicId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getScore() {
		return _score;
	}

	@Override
	public void setScore(int score) {
		_score = score;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setScore", int.class);

				method.invoke(_ratingRemoteModel, score);
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
	public void inceaseScore() {
		try {
			String methodName = "inceaseScore";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public void decreaseScoreIfGreater0() {
		try {
			String methodName = "decreaseScoreIfGreater0";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getRatingRemoteModel() {
		return _ratingRemoteModel;
	}

	public void setRatingRemoteModel(BaseModel<?> ratingRemoteModel) {
		_ratingRemoteModel = ratingRemoteModel;
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

		Class<?> remoteModelClass = _ratingRemoteModel.getClass();

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

		Object returnValue = method.invoke(_ratingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RatingLocalServiceUtil.addRating(this);
		}
		else {
			RatingLocalServiceUtil.updateRating(this);
		}
	}

	@Override
	public Rating toEscapedModel() {
		return (Rating)ProxyUtil.newProxyInstance(Rating.class.getClassLoader(),
			new Class[] { Rating.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RatingClp clone = new RatingClp();

		clone.setRatingId(getRatingId());
		clone.setUserId(getUserId());
		clone.setSubtopicId(getSubtopicId());
		clone.setScore(getScore());

		return clone;
	}

	@Override
	public int compareTo(Rating rating) {
		long primaryKey = rating.getPrimaryKey();

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

		if (!(obj instanceof RatingClp)) {
			return false;
		}

		RatingClp rating = (RatingClp)obj;

		long primaryKey = rating.getPrimaryKey();

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

		sb.append("{ratingId=");
		sb.append(getRatingId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", subtopicId=");
		sb.append(getSubtopicId());
		sb.append(", score=");
		sb.append(getScore());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.politaktiv.meinungsbild.infrastructure.model.Rating");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ratingId</column-name><column-value><![CDATA[");
		sb.append(getRatingId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subtopicId</column-name><column-value><![CDATA[");
		sb.append(getSubtopicId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>score</column-name><column-value><![CDATA[");
		sb.append(getScore());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ratingId;
	private long _userId;
	private String _userUuid;
	private long _subtopicId;
	private int _score;
	private BaseModel<?> _ratingRemoteModel;
}