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
import com.liferay.portal.util.PortalUtil;

import org.politaktiv.meinungsbild.infrastructure.service.RatingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author politaktiv
 */
public class RatingClp extends BaseModelImpl<Rating> implements Rating {
	public RatingClp() {
	}

	public Class<?> getModelClass() {
		return Rating.class;
	}

	public String getModelClassName() {
		return Rating.class.getName();
	}

	public long getPrimaryKey() {
		return _ratingId;
	}

	public void setPrimaryKey(long primaryKey) {
		setRatingId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_ratingId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
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

	public boolean validate() {
		throw new UnsupportedOperationException();
	}

	public void inceaseScore() {
		throw new UnsupportedOperationException();
	}

	public void decreaseScoreIfGreater0() {
		throw new UnsupportedOperationException();
	}

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
		return (Rating)Proxy.newProxyInstance(Rating.class.getClassLoader(),
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
		if (obj == null) {
			return false;
		}

		RatingClp rating = null;

		try {
			rating = (RatingClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

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
}