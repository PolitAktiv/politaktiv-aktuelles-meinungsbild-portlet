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
 * This class is used by SOAP remote services, specifically {@link org.politaktiv.meinungsbild.infrastructure.service.http.SubtopicServiceSoap}.
 *
 * @author    politaktiv
 * @see       org.politaktiv.meinungsbild.infrastructure.service.http.SubtopicServiceSoap
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