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

package org.politaktiv.meinungsbild.infrastructure.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.politaktiv.meinungsbild.infrastructure.model.Rating;

import java.util.List;

/**
 * The persistence utility for the rating service. This utility wraps {@link RatingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author politaktiv
 * @see RatingPersistence
 * @see RatingPersistenceImpl
 * @generated
 */
public class RatingUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Rating rating) {
		getPersistence().clearCache(rating);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Rating> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Rating> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Rating> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Rating update(Rating rating, boolean merge)
		throws SystemException {
		return getPersistence().update(rating, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Rating update(Rating rating, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(rating, merge, serviceContext);
	}

	/**
	* Caches the rating in the entity cache if it is enabled.
	*
	* @param rating the rating
	*/
	public static void cacheResult(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating) {
		getPersistence().cacheResult(rating);
	}

	/**
	* Caches the ratings in the entity cache if it is enabled.
	*
	* @param ratings the ratings
	*/
	public static void cacheResult(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> ratings) {
		getPersistence().cacheResult(ratings);
	}

	/**
	* Creates a new rating with the primary key. Does not add the rating to the database.
	*
	* @param ratingId the primary key for the new rating
	* @return the new rating
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating create(
		long ratingId) {
		return getPersistence().create(ratingId);
	}

	/**
	* Removes the rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ratingId the primary key of the rating
	* @return the rating that was removed
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating remove(
		long ratingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		return getPersistence().remove(ratingId);
	}

	public static org.politaktiv.meinungsbild.infrastructure.model.Rating updateImpl(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(rating, merge);
	}

	/**
	* Returns the rating with the primary key or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException} if it could not be found.
	*
	* @param ratingId the primary key of the rating
	* @return the rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating findByPrimaryKey(
		long ratingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		return getPersistence().findByPrimaryKey(ratingId);
	}

	/**
	* Returns the rating with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ratingId the primary key of the rating
	* @return the rating, or <code>null</code> if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating fetchByPrimaryKey(
		long ratingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ratingId);
	}

	/**
	* Returns all the ratings where subtopicId = &#63;.
	*
	* @param subtopicId the subtopic ID
	* @return the matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findBySubtopicId(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySubtopicId(subtopicId);
	}

	/**
	* Returns a range of all the ratings where subtopicId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param subtopicId the subtopic ID
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @return the range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findBySubtopicId(
		long subtopicId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySubtopicId(subtopicId, start, end);
	}

	/**
	* Returns an ordered range of all the ratings where subtopicId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param subtopicId the subtopic ID
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findBySubtopicId(
		long subtopicId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySubtopicId(subtopicId, start, end, orderByComparator);
	}

	/**
	* Returns the first rating in the ordered set where subtopicId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param subtopicId the subtopic ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating findBySubtopicId_First(
		long subtopicId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		return getPersistence()
				   .findBySubtopicId_First(subtopicId, orderByComparator);
	}

	/**
	* Returns the last rating in the ordered set where subtopicId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param subtopicId the subtopic ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating findBySubtopicId_Last(
		long subtopicId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		return getPersistence()
				   .findBySubtopicId_Last(subtopicId, orderByComparator);
	}

	/**
	* Returns the ratings before and after the current rating in the ordered set where subtopicId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param ratingId the primary key of the current rating
	* @param subtopicId the subtopic ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating[] findBySubtopicId_PrevAndNext(
		long ratingId, long subtopicId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		return getPersistence()
				   .findBySubtopicId_PrevAndNext(ratingId, subtopicId,
			orderByComparator);
	}

	/**
	* Returns all the ratings where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findByByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByByUserId(userId);
	}

	/**
	* Returns a range of all the ratings where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @return the range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findByByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the ratings where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findByByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first rating in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating findByByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		return getPersistence().findByByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last rating in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating findByByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		return getPersistence().findByByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the ratings before and after the current rating in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param ratingId the primary key of the current rating
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating[] findByByUserId_PrevAndNext(
		long ratingId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		return getPersistence()
				   .findByByUserId_PrevAndNext(ratingId, userId,
			orderByComparator);
	}

	/**
	* Returns the rating where userId = &#63; and subtopicId = &#63; or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException} if it could not be found.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @return the matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating findByUserIdAndSubtopicId(
		long userId, long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		return getPersistence().findByUserIdAndSubtopicId(userId, subtopicId);
	}

	/**
	* Returns the rating where userId = &#63; and subtopicId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @return the matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating fetchByUserIdAndSubtopicId(
		long userId, long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserIdAndSubtopicId(userId, subtopicId);
	}

	/**
	* Returns the rating where userId = &#63; and subtopicId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating fetchByUserIdAndSubtopicId(
		long userId, long subtopicId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserIdAndSubtopicId(userId, subtopicId,
			retrieveFromCache);
	}

	/**
	* Returns all the ratings.
	*
	* @return the ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ratings where subtopicId = &#63; from the database.
	*
	* @param subtopicId the subtopic ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySubtopicId(long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySubtopicId(subtopicId);
	}

	/**
	* Removes all the ratings where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByByUserId(userId);
	}

	/**
	* Removes the rating where userId = &#63; and subtopicId = &#63; from the database.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserIdAndSubtopicId(long userId, long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException {
		getPersistence().removeByUserIdAndSubtopicId(userId, subtopicId);
	}

	/**
	* Removes all the ratings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ratings where subtopicId = &#63;.
	*
	* @param subtopicId the subtopic ID
	* @return the number of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySubtopicId(long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySubtopicId(subtopicId);
	}

	/**
	* Returns the number of ratings where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByByUserId(userId);
	}

	/**
	* Returns the number of ratings where userId = &#63; and subtopicId = &#63;.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @return the number of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserIdAndSubtopicId(long userId, long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserIdAndSubtopicId(userId, subtopicId);
	}

	/**
	* Returns the number of ratings.
	*
	* @return the number of ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RatingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RatingPersistence)PortletBeanLocatorUtil.locate(org.politaktiv.meinungsbild.infrastructure.service.ClpSerializer.getServletContextName(),
					RatingPersistence.class.getName());

			ReferenceRegistry.registerReference(RatingUtil.class, "_persistence");
		}

		return _persistence;
	}

	public void setPersistence(RatingPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(RatingUtil.class, "_persistence");
	}

	private static RatingPersistence _persistence;
}