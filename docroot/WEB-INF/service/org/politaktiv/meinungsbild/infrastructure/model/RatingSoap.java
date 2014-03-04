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
 * This class is used by SOAP remote services, specifically {@link org.politaktiv.meinungsbild.infrastructure.service.http.RatingServiceSoap}.
 *
 * @author politaktiv
 * @see org.politaktiv.meinungsbild.infrastructure.service.http.RatingServiceSoap
 * @generated
 */
public class RatingSoap implements Serializable {
	public static RatingSoap toSoapModel(Rating model) {
		RatingSoap soapModel = new RatingSoap();

		soapModel.setRatingId(model.getRatingId());
		soapModel.setUserId(model.getUserId());
		soapModel.setSubtopicId(model.getSubtopicId());
		soapModel.setScore(model.getScore());

		return soapModel;
	}

	public static RatingSoap[] toSoapModels(Rating[] models) {
		RatingSoap[] soapModels = new RatingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RatingSoap[][] toSoapModels(Rating[][] models) {
		RatingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RatingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RatingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RatingSoap[] toSoapModels(List<Rating> models) {
		List<RatingSoap> soapModels = new ArrayList<RatingSoap>(models.size());

		for (Rating model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RatingSoap[soapModels.size()]);
	}

	public RatingSoap() {
	}

	public long getPrimaryKey() {
		return _ratingId;
	}

	public void setPrimaryKey(long pk) {
		setRatingId(pk);
	}

	public long getRatingId() {
		return _ratingId;
	}

	public void setRatingId(long ratingId) {
		_ratingId = ratingId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getSubtopicId() {
		return _subtopicId;
	}

	public void setSubtopicId(long subtopicId) {
		_subtopicId = subtopicId;
	}

	public int getScore() {
		return _score;
	}

	public void setScore(int score) {
		_score = score;
	}

	private long _ratingId;
	private long _userId;
	private long _subtopicId;
	private int _score;
}