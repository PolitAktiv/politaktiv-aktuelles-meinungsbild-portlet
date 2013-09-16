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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.politaktiv.meinungsbild.infrastructure.service.SubtopicLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author politaktiv
 */
public class SubtopicClp extends BaseModelImpl<Subtopic> implements Subtopic {
	public SubtopicClp() {
	}

	public Class<?> getModelClass() {
		return Subtopic.class;
	}

	public String getModelClassName() {
		return Subtopic.class.getName();
	}

	public long getPrimaryKey() {
		return _subtopicId;
	}

	public void setPrimaryKey(long primaryKey) {
		setSubtopicId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_subtopicId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	public void setRatingList(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> ratingList) {
		throw new UnsupportedOperationException();
	}

	public boolean validate() {
		throw new UnsupportedOperationException();
	}

	public int getCurentUserScore() {
		throw new UnsupportedOperationException();
	}

	public void setCurrentUserScore(int score) {
		throw new UnsupportedOperationException();
	}

	public int getFullCommunityScore() {
		throw new UnsupportedOperationException();
	}

	public void setFullCommunityScore(int score) {
		throw new UnsupportedOperationException();
	}

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
		return (Subtopic)Proxy.newProxyInstance(Subtopic.class.getClassLoader(),
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
		if (obj == null) {
			return false;
		}

		SubtopicClp subtopic = null;

		try {
			subtopic = (SubtopicClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

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
}