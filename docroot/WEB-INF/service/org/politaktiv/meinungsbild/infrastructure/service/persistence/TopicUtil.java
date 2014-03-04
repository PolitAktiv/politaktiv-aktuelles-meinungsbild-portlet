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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.politaktiv.meinungsbild.infrastructure.model.Topic;

import java.util.List;

/**
 * The persistence utility for the topic service. This utility wraps {@link TopicPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author politaktiv
 * @see TopicPersistence
 * @see TopicPersistenceImpl
 * @generated
 */
public class TopicUtil {
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
	public static void clearCache(Topic topic) {
		getPersistence().clearCache(topic);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Topic> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Topic> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Topic> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Topic update(Topic topic) throws SystemException {
		return getPersistence().update(topic);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Topic update(Topic topic, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(topic, serviceContext);
	}

	/**
	* Returns all the topics where communityId = &#63;.
	*
	* @param communityId the community ID
	* @return the matching topics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findByCommunityId(
		long communityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCommunityId(communityId);
	}

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
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findByCommunityId(
		long communityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCommunityId(communityId, start, end);
	}

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
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findByCommunityId(
		long communityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCommunityId(communityId, start, end, orderByComparator);
	}

	/**
	* Returns the first topic in the ordered set where communityId = &#63;.
	*
	* @param communityId the community ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching topic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a matching topic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic findByCommunityId_First(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException {
		return getPersistence()
				   .findByCommunityId_First(communityId, orderByComparator);
	}

	/**
	* Returns the first topic in the ordered set where communityId = &#63;.
	*
	* @param communityId the community ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching topic, or <code>null</code> if a matching topic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic fetchByCommunityId_First(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCommunityId_First(communityId, orderByComparator);
	}

	/**
	* Returns the last topic in the ordered set where communityId = &#63;.
	*
	* @param communityId the community ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching topic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a matching topic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic findByCommunityId_Last(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException {
		return getPersistence()
				   .findByCommunityId_Last(communityId, orderByComparator);
	}

	/**
	* Returns the last topic in the ordered set where communityId = &#63;.
	*
	* @param communityId the community ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching topic, or <code>null</code> if a matching topic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic fetchByCommunityId_Last(
		long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCommunityId_Last(communityId, orderByComparator);
	}

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
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic[] findByCommunityId_PrevAndNext(
		long topicId, long communityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException {
		return getPersistence()
				   .findByCommunityId_PrevAndNext(topicId, communityId,
			orderByComparator);
	}

	/**
	* Removes all the topics where communityId = &#63; from the database.
	*
	* @param communityId the community ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCommunityId(long communityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCommunityId(communityId);
	}

	/**
	* Returns the number of topics where communityId = &#63;.
	*
	* @param communityId the community ID
	* @return the number of matching topics
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCommunityId(long communityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCommunityId(communityId);
	}

	/**
	* Caches the topic in the entity cache if it is enabled.
	*
	* @param topic the topic
	*/
	public static void cacheResult(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic) {
		getPersistence().cacheResult(topic);
	}

	/**
	* Caches the topics in the entity cache if it is enabled.
	*
	* @param topics the topics
	*/
	public static void cacheResult(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> topics) {
		getPersistence().cacheResult(topics);
	}

	/**
	* Creates a new topic with the primary key. Does not add the topic to the database.
	*
	* @param topicId the primary key for the new topic
	* @return the new topic
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic create(
		long topicId) {
		return getPersistence().create(topicId);
	}

	/**
	* Removes the topic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param topicId the primary key of the topic
	* @return the topic that was removed
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic remove(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException {
		return getPersistence().remove(topicId);
	}

	public static org.politaktiv.meinungsbild.infrastructure.model.Topic updateImpl(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(topic);
	}

	/**
	* Returns the topic with the primary key or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException} if it could not be found.
	*
	* @param topicId the primary key of the topic
	* @return the topic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic findByPrimaryKey(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException {
		return getPersistence().findByPrimaryKey(topicId);
	}

	/**
	* Returns the topic with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param topicId the primary key of the topic
	* @return the topic, or <code>null</code> if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic fetchByPrimaryKey(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(topicId);
	}

	/**
	* Returns all the topics.
	*
	* @return the topics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the topics from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of topics.
	*
	* @return the number of topics
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TopicPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TopicPersistence)PortletBeanLocatorUtil.locate(org.politaktiv.meinungsbild.infrastructure.service.ClpSerializer.getServletContextName(),
					TopicPersistence.class.getName());

			ReferenceRegistry.registerReference(TopicUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TopicPersistence persistence) {
	}

	private static TopicPersistence _persistence;
}