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

package org.politaktiv.meinungsbild.infrastructure.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.politaktiv.meinungsbild.infrastructure.model.Rating;

/**
 * The persistence interface for the rating service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author politaktiv
 * @see RatingPersistenceImpl
 * @see RatingUtil
 * @generated
 */
public interface RatingPersistence extends BasePersistence<Rating> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RatingUtil} to access the rating persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ratings where subtopicId = &#63;.
	*
	* @param subtopicId the subtopic ID
	* @return the matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findBySubtopicId(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ratings where subtopicId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subtopicId the subtopic ID
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @return the range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findBySubtopicId(
		long subtopicId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ratings where subtopicId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subtopicId the subtopic ID
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findBySubtopicId(
		long subtopicId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first rating in the ordered set where subtopicId = &#63;.
	*
	* @param subtopicId the subtopic ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating findBySubtopicId_First(
		long subtopicId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	/**
	* Returns the first rating in the ordered set where subtopicId = &#63;.
	*
	* @param subtopicId the subtopic ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating fetchBySubtopicId_First(
		long subtopicId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last rating in the ordered set where subtopicId = &#63;.
	*
	* @param subtopicId the subtopic ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating findBySubtopicId_Last(
		long subtopicId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	/**
	* Returns the last rating in the ordered set where subtopicId = &#63;.
	*
	* @param subtopicId the subtopic ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating fetchBySubtopicId_Last(
		long subtopicId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ratings before and after the current rating in the ordered set where subtopicId = &#63;.
	*
	* @param ratingId the primary key of the current rating
	* @param subtopicId the subtopic ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating[] findBySubtopicId_PrevAndNext(
		long ratingId, long subtopicId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	/**
	* Removes all the ratings where subtopicId = &#63; from the database.
	*
	* @param subtopicId the subtopic ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySubtopicId(long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ratings where subtopicId = &#63;.
	*
	* @param subtopicId the subtopic ID
	* @return the number of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public int countBySubtopicId(long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ratings where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findByByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ratings where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @return the range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findByByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ratings where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findByByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first rating in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating findByByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	/**
	* Returns the first rating in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating fetchByByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last rating in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating findByByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	/**
	* Returns the last rating in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating fetchByByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ratings before and after the current rating in the ordered set where userId = &#63;.
	*
	* @param ratingId the primary key of the current rating
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating[] findByByUserId_PrevAndNext(
		long ratingId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	/**
	* Removes all the ratings where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ratings where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public int countByByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the rating where userId = &#63; and subtopicId = &#63; or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException} if it could not be found.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @return the matching rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating findByUserIdAndSubtopicId(
		long userId, long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	/**
	* Returns the rating where userId = &#63; and subtopicId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @return the matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating fetchByUserIdAndSubtopicId(
		long userId, long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the rating where userId = &#63; and subtopicId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating fetchByUserIdAndSubtopicId(
		long userId, long subtopicId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the rating where userId = &#63; and subtopicId = &#63; from the database.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @return the rating that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating removeByUserIdAndSubtopicId(
		long userId, long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	/**
	* Returns the number of ratings where userId = &#63; and subtopicId = &#63;.
	*
	* @param userId the user ID
	* @param subtopicId the subtopic ID
	* @return the number of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserIdAndSubtopicId(long userId, long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the rating in the entity cache if it is enabled.
	*
	* @param rating the rating
	*/
	public void cacheResult(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating);

	/**
	* Caches the ratings in the entity cache if it is enabled.
	*
	* @param ratings the ratings
	*/
	public void cacheResult(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> ratings);

	/**
	* Creates a new rating with the primary key. Does not add the rating to the database.
	*
	* @param ratingId the primary key for the new rating
	* @return the new rating
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating create(
		long ratingId);

	/**
	* Removes the rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ratingId the primary key of the rating
	* @return the rating that was removed
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating remove(
		long ratingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	public org.politaktiv.meinungsbild.infrastructure.model.Rating updateImpl(
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the rating with the primary key or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException} if it could not be found.
	*
	* @param ratingId the primary key of the rating
	* @return the rating
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating findByPrimaryKey(
		long ratingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchRatingException;

	/**
	* Returns the rating with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ratingId the primary key of the rating
	* @return the rating, or <code>null</code> if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Rating fetchByPrimaryKey(
		long ratingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ratings.
	*
	* @return the ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @return the range of ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ratings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ratings.
	*
	* @return the number of ratings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}