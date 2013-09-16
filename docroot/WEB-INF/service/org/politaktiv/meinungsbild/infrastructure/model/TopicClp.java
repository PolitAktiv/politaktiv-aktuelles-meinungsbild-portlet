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

import org.politaktiv.meinungsbild.infrastructure.service.TopicLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author politaktiv
 */
public class TopicClp extends BaseModelImpl<Topic> implements Topic {
	public TopicClp() {
	}

	public Class<?> getModelClass() {
		return Topic.class;
	}

	public String getModelClassName() {
		return Topic.class.getName();
	}

	public long getPrimaryKey() {
		return _topicId;
	}

	public void setPrimaryKey(long primaryKey) {
		setTopicId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_topicId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopics() {
		throw new UnsupportedOperationException();
	}

	public boolean validate() {
		throw new UnsupportedOperationException();
	}

	public int getTotalTopicScore() {
		throw new UnsupportedOperationException();
	}

	public void setSubtopics(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> subtopics) {
		throw new UnsupportedOperationException();
	}

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
		return (Topic)Proxy.newProxyInstance(Topic.class.getClassLoader(),
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
		if (obj == null) {
			return false;
		}

		TopicClp topic = null;

		try {
			topic = (TopicClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

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
}