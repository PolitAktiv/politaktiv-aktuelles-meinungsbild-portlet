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

package org.politaktiv.meinungsbild.infrastructure.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link RatingLocalService}.
 * </p>
 *
 * @author    politaktiv
 * @see       RatingLocalService
 * @generated
 */
public class RatingLocalServiceWrapper implements RatingLocalService,
	ServiceWrapper<RatingLocalService> {
	public RatingLocalServiceWrapper(RatingLocalService ratingLocalService) {
		_ratingLocalService = ratingLocalService;
	}

	/**
	* Adds the rating to the database. Also notifies the appropriate model listeners.
	*
	* @param rating the rating
	* @return the rating that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating addRating(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.addRating(rating);
	}

	/**
	* Creates a new rating with the primary key. Does not add the rating to the database.
	*
	* @param ratingId the primary key for the new rating
	* @return the new rating
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating createRating(
		long ratingId) {
		return _ratingLocalService.createRating(ratingId);
	}

	/**
	* Deletes the rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ratingId the primary key of the rating
	* @throws PortalException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteRating(long ratingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_ratingLocalService.deleteRating(ratingId);
	}

	/**
	* Deletes the rating from the database. Also notifies the appropriate model listeners.
	*
	* @param rating the rating
	* @throws SystemException if a system exception occurred
	*/
	public void deleteRating(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ratingLocalService.deleteRating(rating);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.politaktiv.meinungsbild.infrastructure.model.Rating fetchRating(
		long ratingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.fetchRating(ratingId);
	}

	/**
	* Returns the rating with the primary key.
	*
	* @param ratingId the primary key of the rating
	* @return the rating
	* @throws PortalException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating getRating(
		long ratingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.getRating(ratingId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @return the range of ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> getRatings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.getRatings(start, end);
	}

	/**
	* Returns the number of ratings.
	*
	* @return the number of ratings
	* @throws SystemException if a system exception occurred
	*/
	public int getRatingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.getRatingsCount();
	}

	/**
	* Updates the rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rating the rating
	* @return the rating that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating updateRating(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.updateRating(rating);
	}

	/**
	* Updates the rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rating the rating
	* @param merge whether to merge the rating with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the rating that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating updateRating(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.updateRating(rating, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _ratingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ratingLocalService.setBeanIdentifier(beanIdentifier);
	}

	public org.politaktiv.meinungsbild.infrastructure.model.Rating giveRatingByUserIdAndSubtopicId(
		long userId, long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.giveRatingByUserIdAndSubtopicId(userId,
			subtopicId);
	}

	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> bySubtopicId(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.bySubtopicId(subtopicId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public RatingLocalService getWrappedRatingLocalService() {
		return _ratingLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedRatingLocalService(
		RatingLocalService ratingLocalService) {
		_ratingLocalService = ratingLocalService;
	}

	public RatingLocalService getWrappedService() {
		return _ratingLocalService;
	}

	public void setWrappedService(RatingLocalService ratingLocalService) {
		_ratingLocalService = ratingLocalService;
	}

	private RatingLocalService _ratingLocalService;
}