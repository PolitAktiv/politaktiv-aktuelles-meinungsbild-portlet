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

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link Rating}.
 * </p>
 *
 * @author    politaktiv
 * @see       Rating
 * @generated
 */
public class RatingWrapper implements Rating, ModelWrapper<Rating> {
	public RatingWrapper(Rating rating) {
		_rating = rating;
	}

	public Class<?> getModelClass() {
		return Rating.class;
	}

	public String getModelClassName() {
		return Rating.class.getName();
	}

	/**
	* Returns the primary key of this rating.
	*
	* @return the primary key of this rating
	*/
	public long getPrimaryKey() {
		return _rating.getPrimaryKey();
	}

	/**
	* Sets the primary key of this rating.
	*
	* @param primaryKey the primary key of this rating
	*/
	public void setPrimaryKey(long primaryKey) {
		_rating.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rating ID of this rating.
	*
	* @return the rating ID of this rating
	*/
	public long getRatingId() {
		return _rating.getRatingId();
	}

	/**
	* Sets the rating ID of this rating.
	*
	* @param ratingId the rating ID of this rating
	*/
	public void setRatingId(long ratingId) {
		_rating.setRatingId(ratingId);
	}

	/**
	* Returns the user ID of this rating.
	*
	* @return the user ID of this rating
	*/
	public long getUserId() {
		return _rating.getUserId();
	}

	/**
	* Sets the user ID of this rating.
	*
	* @param userId the user ID of this rating
	*/
	public void setUserId(long userId) {
		_rating.setUserId(userId);
	}

	/**
	* Returns the user uuid of this rating.
	*
	* @return the user uuid of this rating
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rating.getUserUuid();
	}

	/**
	* Sets the user uuid of this rating.
	*
	* @param userUuid the user uuid of this rating
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_rating.setUserUuid(userUuid);
	}

	/**
	* Returns the subtopic ID of this rating.
	*
	* @return the subtopic ID of this rating
	*/
	public long getSubtopicId() {
		return _rating.getSubtopicId();
	}

	/**
	* Sets the subtopic ID of this rating.
	*
	* @param subtopicId the subtopic ID of this rating
	*/
	public void setSubtopicId(long subtopicId) {
		_rating.setSubtopicId(subtopicId);
	}

	/**
	* Returns the score of this rating.
	*
	* @return the score of this rating
	*/
	public int getScore() {
		return _rating.getScore();
	}

	/**
	* Sets the score of this rating.
	*
	* @param score the score of this rating
	*/
	public void setScore(int score) {
		_rating.setScore(score);
	}

	public boolean isNew() {
		return _rating.isNew();
	}

	public void setNew(boolean n) {
		_rating.setNew(n);
	}

	public boolean isCachedModel() {
		return _rating.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_rating.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _rating.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _rating.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_rating.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _rating.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_rating.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RatingWrapper((Rating)_rating.clone());
	}

	public int compareTo(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating) {
		return _rating.compareTo(rating);
	}

	@Override
	public int hashCode() {
		return _rating.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.politaktiv.meinungsbild.infrastructure.model.Rating> toCacheModel() {
		return _rating.toCacheModel();
	}

	public org.politaktiv.meinungsbild.infrastructure.model.Rating toEscapedModel() {
		return new RatingWrapper(_rating.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _rating.toString();
	}

	public java.lang.String toXmlString() {
		return _rating.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_rating.persist();
	}

	public boolean validate() {
		return _rating.validate();
	}

	public void inceaseScore() {
		_rating.inceaseScore();
	}

	public void decreaseScoreIfGreater0() {
		_rating.decreaseScoreIfGreater0();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Rating getWrappedRating() {
		return _rating;
	}

	public Rating getWrappedModel() {
		return _rating;
	}

	public void resetOriginalValues() {
		_rating.resetOriginalValues();
	}

	private Rating _rating;
}