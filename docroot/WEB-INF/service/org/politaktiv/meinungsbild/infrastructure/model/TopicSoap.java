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
 * This class is used by SOAP remote services, specifically {@link org.politaktiv.meinungsbild.infrastructure.service.http.TopicServiceSoap}.
 *
 * @author    politaktiv
 * @see       org.politaktiv.meinungsbild.infrastructure.service.http.TopicServiceSoap
 * @generated
 */
public class TopicSoap implements Serializable {
	public static TopicSoap toSoapModel(Topic model) {
		TopicSoap soapModel = new TopicSoap();

		soapModel.setTopicId(model.getTopicId());
		soapModel.setName(model.getName());
		soapModel.setCommunityId(model.getCommunityId());

		return soapModel;
	}

	public static TopicSoap[] toSoapModels(Topic[] models) {
		TopicSoap[] soapModels = new TopicSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TopicSoap[][] toSoapModels(Topic[][] models) {
		TopicSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TopicSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TopicSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TopicSoap[] toSoapModels(List<Topic> models) {
		List<TopicSoap> soapModels = new ArrayList<TopicSoap>(models.size());

		for (Topic model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TopicSoap[soapModels.size()]);
	}

	public TopicSoap() {
	}

	public long getPrimaryKey() {
		return _topicId;
	}

	public void setPrimaryKey(long pk) {
		setTopicId(pk);
	}

	public long getTopicId() {
		return _topicId;
	}

	public void setTopicId(long topicId) {
		_topicId = topicId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getCommunityId() {
		return _communityId;
	}

	public void setCommunityId(long communityId) {
		_communityId = communityId;
	}

	private long _topicId;
	private String _name;
	private long _communityId;
}