/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.politaktiv.meinungsbild.infrastructure.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.politaktiv.meinungsbild.infrastructure.service.http.RatingServiceSoap}.
 *
 * @author    politaktiv
 * @see       org.politaktiv.meinungsbild.infrastructure.service.http.RatingServiceSoap
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