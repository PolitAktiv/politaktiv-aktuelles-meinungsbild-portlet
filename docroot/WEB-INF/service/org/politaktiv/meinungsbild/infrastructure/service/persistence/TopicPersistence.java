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

import org.politaktiv.meinungsbild.infrastructure.model.Topic;

/**
 * The persistence interface for the topic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author politaktiv
 * @see TopicPersistenceImpl
 * @see TopicUtil
 * @generated
 */
public interface TopicPersistence extends BasePersistence<Topic> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TopicUtil} to access the topic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the topics where communityId = &#63;.
	*
	* @param communityId the community ID
	* @return the matching topics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findByCommunityId(
		long communityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the topics where communityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.TopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param communityId the community ID
	* @param start the lower bound of the range of topics
	* @param end the upper bound of the range of topics (not inclusive)
	* @return the range of matching topics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findByCommunityId(
		long communityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the topics where communityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.TopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param communityId the community ID
	* @param start the lower bound of the range of topics
	* @param end the upper bound of the range of topics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching topics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findByCommunityId(
		long communityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first topic in the ordered set where communityId = &#63;.
	*
	* @param communityId the community ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching topic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a matching topic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Topic findByCommunityId_First(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException;

	/**
	* Returns the first topic in the ordered set where communityId = &#63;.
	*
	* @param communityId the community ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching topic, or <code>null</code> if a matching topic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Topic fetchByCommunityId_First(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last topic in the ordered set where communityId = &#63;.
	*
	* @param communityId the community ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching topic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a matching topic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Topic findByCommunityId_Last(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException;

	/**
	* Returns the last topic in the ordered set where communityId = &#63;.
	*
	* @param communityId the community ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching topic, or <code>null</code> if a matching topic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Topic fetchByCommunityId_Last(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the topics before and after the current topic in the ordered set where communityId = &#63;.
	*
	* @param topicId the primary key of the current topic
	* @param communityId the community ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next topic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Topic[] findByCommunityId_PrevAndNext(
		long topicId, long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException;

	/**
	* Removes all the topics where communityId = &#63; from the database.
	*
	* @param communityId the community ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCommunityId(long communityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of topics where communityId = &#63;.
	*
	* @param communityId the community ID
	* @return the number of matching topics
	* @throws SystemException if a system exception occurred
	*/
	public int countByCommunityId(long communityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the topic in the entity cache if it is enabled.
	*
	* @param topic the topic
	*/
	public void cacheResult(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic);

	/**
	* Caches the topics in the entity cache if it is enabled.
	*
	* @param topics the topics
	*/
	public void cacheResult(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> topics);

	/**
	* Creates a new topic with the primary key. Does not add the topic to the database.
	*
	* @param topicId the primary key for the new topic
	* @return the new topic
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Topic create(
		long topicId);

	/**
	* Removes the topic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param topicId the primary key of the topic
	* @return the topic that was removed
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Topic remove(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException;

	public org.politaktiv.meinungsbild.infrastructure.model.Topic updateImpl(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the topic with the primary key or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException} if it could not be found.
	*
	* @param topicId the primary key of the topic
	* @return the topic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Topic findByPrimaryKey(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException;

	/**
	* Returns the topic with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param topicId the primary key of the topic
	* @return the topic, or <code>null</code> if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Topic fetchByPrimaryKey(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the topics.
	*
	* @return the topics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the topics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.TopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of topics
	* @param end the upper bound of the range of topics (not inclusive)
	* @return the range of topics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the topics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.TopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of topics
	* @param end the upper bound of the range of topics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of topics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the topics from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of topics.
	*
	* @return the number of topics
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}