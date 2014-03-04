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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.politaktiv.meinungsbild.infrastructure.service.http.SubtopicServiceSoap}.
 *
 * @author politaktiv
 * @see org.politaktiv.meinungsbild.infrastructure.service.http.SubtopicServiceSoap
 * @generated
 */
public class SubtopicSoap implements Serializable {
	public static SubtopicSoap toSoapModel(Subtopic model) {
		SubtopicSoap soapModel = new SubtopicSoap();

		soapModel.setSubtopicId(model.getSubtopicId());
		soapModel.setName(model.getName());
		soapModel.setUrl(model.getUrl());
		soapModel.setParentTopic(model.getParentTopic());

		return soapModel;
	}

	public static SubtopicSoap[] toSoapModels(Subtopic[] models) {
		SubtopicSoap[] soapModels = new SubtopicSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SubtopicSoap[][] toSoapModels(Subtopic[][] models) {
		SubtopicSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SubtopicSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SubtopicSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SubtopicSoap[] toSoapModels(List<Subtopic> models) {
		List<SubtopicSoap> soapModels = new ArrayList<SubtopicSoap>(models.size());

		for (Subtopic model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SubtopicSoap[soapModels.size()]);
	}

	public SubtopicSoap() {
	}

	public long getPrimaryKey() {
		return _subtopicId;
	}

	public void setPrimaryKey(long pk) {
		setSubtopicId(pk);
	}

	public long getSubtopicId() {
		return _subtopicId;
	}

	public void setSubtopicId(long subtopicId) {
		_subtopicId = subtopicId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public long getParentTopic() {
		return _parentTopic;
	}

	public void setParentTopic(long parentTopic) {
		_parentTopic = parentTopic;
	}

	private long _subtopicId;
	private String _name;
	private String _url;
	private long _parentTopic;
}