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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException;
import org.politaktiv.meinungsbild.infrastructure.model.Topic;
import org.politaktiv.meinungsbild.infrastructure.model.impl.TopicImpl;
import org.politaktiv.meinungsbild.infrastructure.model.impl.TopicModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the topic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author politaktiv
 * @see TopicPersistence
 * @see TopicUtil
 * @generated
 */
public class TopicPersistenceImpl extends BasePersistenceImpl<Topic>
	implements TopicPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TopicUtil} to access the topic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TopicImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TopicModelImpl.ENTITY_CACHE_ENABLED,
			TopicModelImpl.FINDER_CACHE_ENABLED, TopicImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TopicModelImpl.ENTITY_CACHE_ENABLED,
			TopicModelImpl.FINDER_CACHE_ENABLED, TopicImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TopicModelImpl.ENTITY_CACHE_ENABLED,
			TopicModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMMUNITYID =
		new FinderPath(TopicModelImpl.ENTITY_CACHE_ENABLED,
			TopicModelImpl.FINDER_CACHE_ENABLED, TopicImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCommunityId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMUNITYID =
		new FinderPath(TopicModelImpl.ENTITY_CACHE_ENABLED,
			TopicModelImpl.FINDER_CACHE_ENABLED, TopicImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCommunityId",
			new String[] { Long.class.getName() },
			TopicModelImpl.COMMUNITYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMMUNITYID = new FinderPath(TopicModelImpl.ENTITY_CACHE_ENABLED,
			TopicModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCommunityId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the topics where communityId = &#63;.
	 *
	 * @param communityId the community ID
	 * @return the matching topics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Topic> findByCommunityId(long communityId)
		throws SystemException {
		return findByCommunityId(communityId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Topic> findByCommunityId(long communityId, int start, int end)
		throws SystemException {
		return findByCommunityId(communityId, start, end, null);
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
	@Override
	public List<Topic> findByCommunityId(long communityId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMUNITYID;
			finderArgs = new Object[] { communityId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMMUNITYID;
			finderArgs = new Object[] { communityId, start, end, orderByComparator };
		}

		List<Topic> list = (List<Topic>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Topic topic : list) {
				if ((communityId != topic.getCommunityId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TOPIC_WHERE);

			query.append(_FINDER_COLUMN_COMMUNITYID_COMMUNITYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TopicModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(communityId);

				if (!pagination) {
					list = (List<Topic>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Topic>(list);
				}
				else {
					list = (List<Topic>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Topic findByCommunityId_First(long communityId,
		OrderByComparator orderByComparator)
		throws NoSuchTopicException, SystemException {
		Topic topic = fetchByCommunityId_First(communityId, orderByComparator);

		if (topic != null) {
			return topic;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("communityId=");
		msg.append(communityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTopicException(msg.toString());
	}

	/**
	 * Returns the first topic in the ordered set where communityId = &#63;.
	 *
	 * @param communityId the community ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching topic, or <code>null</code> if a matching topic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Topic fetchByCommunityId_First(long communityId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Topic> list = findByCommunityId(communityId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Topic findByCommunityId_Last(long communityId,
		OrderByComparator orderByComparator)
		throws NoSuchTopicException, SystemException {
		Topic topic = fetchByCommunityId_Last(communityId, orderByComparator);

		if (topic != null) {
			return topic;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("communityId=");
		msg.append(communityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTopicException(msg.toString());
	}

	/**
	 * Returns the last topic in the ordered set where communityId = &#63;.
	 *
	 * @param communityId the community ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching topic, or <code>null</code> if a matching topic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Topic fetchByCommunityId_Last(long communityId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCommunityId(communityId);

		if (count == 0) {
			return null;
		}

		List<Topic> list = findByCommunityId(communityId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Topic[] findByCommunityId_PrevAndNext(long topicId,
		long communityId, OrderByComparator orderByComparator)
		throws NoSuchTopicException, SystemException {
		Topic topic = findByPrimaryKey(topicId);

		Session session = null;

		try {
			session = openSession();

			Topic[] array = new TopicImpl[3];

			array[0] = getByCommunityId_PrevAndNext(session, topic,
					communityId, orderByComparator, true);

			array[1] = topic;

			array[2] = getByCommunityId_PrevAndNext(session, topic,
					communityId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Topic getByCommunityId_PrevAndNext(Session session, Topic topic,
		long communityId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TOPIC_WHERE);

		query.append(_FINDER_COLUMN_COMMUNITYID_COMMUNITYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TopicModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(communityId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(topic);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Topic> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the topics where communityId = &#63; from the database.
	 *
	 * @param communityId the community ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCommunityId(long communityId) throws SystemException {
		for (Topic topic : findByCommunityId(communityId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(topic);
		}
	}

	/**
	 * Returns the number of topics where communityId = &#63;.
	 *
	 * @param communityId the community ID
	 * @return the number of matching topics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCommunityId(long communityId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMMUNITYID;

		Object[] finderArgs = new Object[] { communityId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TOPIC_WHERE);

			query.append(_FINDER_COLUMN_COMMUNITYID_COMMUNITYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(communityId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMMUNITYID_COMMUNITYID_2 = "topic.communityId = ?";

	public TopicPersistenceImpl() {
		setModelClass(Topic.class);
	}

	/**
	 * Caches the topic in the entity cache if it is enabled.
	 *
	 * @param topic the topic
	 */
	@Override
	public void cacheResult(Topic topic) {
		EntityCacheUtil.putResult(TopicModelImpl.ENTITY_CACHE_ENABLED,
			TopicImpl.class, topic.getPrimaryKey(), topic);

		topic.resetOriginalValues();
	}

	/**
	 * Caches the topics in the entity cache if it is enabled.
	 *
	 * @param topics the topics
	 */
	@Override
	public void cacheResult(List<Topic> topics) {
		for (Topic topic : topics) {
			if (EntityCacheUtil.getResult(TopicModelImpl.ENTITY_CACHE_ENABLED,
						TopicImpl.class, topic.getPrimaryKey()) == null) {
				cacheResult(topic);
			}
			else {
				topic.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all topics.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TopicImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TopicImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the topic.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Topic topic) {
		EntityCacheUtil.removeResult(TopicModelImpl.ENTITY_CACHE_ENABLED,
			TopicImpl.class, topic.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Topic> topics) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Topic topic : topics) {
			EntityCacheUtil.removeResult(TopicModelImpl.ENTITY_CACHE_ENABLED,
				TopicImpl.class, topic.getPrimaryKey());
		}
	}

	/**
	 * Creates a new topic with the primary key. Does not add the topic to the database.
	 *
	 * @param topicId the primary key for the new topic
	 * @return the new topic
	 */
	@Override
	public Topic create(long topicId) {
		Topic topic = new TopicImpl();

		topic.setNew(true);
		topic.setPrimaryKey(topicId);

		return topic;
	}

	/**
	 * Removes the topic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param topicId the primary key of the topic
	 * @return the topic that was removed
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a topic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Topic remove(long topicId)
		throws NoSuchTopicException, SystemException {
		return remove((Serializable)topicId);
	}

	/**
	 * Removes the topic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the topic
	 * @return the topic that was removed
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a topic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Topic remove(Serializable primaryKey)
		throws NoSuchTopicException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Topic topic = (Topic)session.get(TopicImpl.class, primaryKey);

			if (topic == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTopicException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(topic);
		}
		catch (NoSuchTopicException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Topic removeImpl(Topic topic) throws SystemException {
		topic = toUnwrappedModel(topic);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(topic)) {
				topic = (Topic)session.get(TopicImpl.class,
						topic.getPrimaryKeyObj());
			}

			if (topic != null) {
				session.delete(topic);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (topic != null) {
			clearCache(topic);
		}

		return topic;
	}

	@Override
	public Topic updateImpl(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws SystemException {
		topic = toUnwrappedModel(topic);

		boolean isNew = topic.isNew();

		TopicModelImpl topicModelImpl = (TopicModelImpl)topic;

		Session session = null;

		try {
			session = openSession();

			if (topic.isNew()) {
				session.save(topic);

				topic.setNew(false);
			}
			else {
				session.merge(topic);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TopicModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((topicModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMUNITYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						topicModelImpl.getOriginalCommunityId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMMUNITYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMUNITYID,
					args);

				args = new Object[] { topicModelImpl.getCommunityId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMMUNITYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMUNITYID,
					args);
			}
		}

		EntityCacheUtil.putResult(TopicModelImpl.ENTITY_CACHE_ENABLED,
			TopicImpl.class, topic.getPrimaryKey(), topic);

		return topic;
	}

	protected Topic toUnwrappedModel(Topic topic) {
		if (topic instanceof TopicImpl) {
			return topic;
		}

		TopicImpl topicImpl = new TopicImpl();

		topicImpl.setNew(topic.isNew());
		topicImpl.setPrimaryKey(topic.getPrimaryKey());

		topicImpl.setTopicId(topic.getTopicId());
		topicImpl.setName(topic.getName());
		topicImpl.setCommunityId(topic.getCommunityId());

		return topicImpl;
	}

	/**
	 * Returns the topic with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the topic
	 * @return the topic
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a topic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Topic findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTopicException, SystemException {
		Topic topic = fetchByPrimaryKey(primaryKey);

		if (topic == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTopicException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return topic;
	}

	/**
	 * Returns the topic with the primary key or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException} if it could not be found.
	 *
	 * @param topicId the primary key of the topic
	 * @return the topic
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchTopicException if a topic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Topic findByPrimaryKey(long topicId)
		throws NoSuchTopicException, SystemException {
		return findByPrimaryKey((Serializable)topicId);
	}

	/**
	 * Returns the topic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the topic
	 * @return the topic, or <code>null</code> if a topic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Topic fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Topic topic = (Topic)EntityCacheUtil.getResult(TopicModelImpl.ENTITY_CACHE_ENABLED,
				TopicImpl.class, primaryKey);

		if (topic == _nullTopic) {
			return null;
		}

		if (topic == null) {
			Session session = null;

			try {
				session = openSession();

				topic = (Topic)session.get(TopicImpl.class, primaryKey);

				if (topic != null) {
					cacheResult(topic);
				}
				else {
					EntityCacheUtil.putResult(TopicModelImpl.ENTITY_CACHE_ENABLED,
						TopicImpl.class, primaryKey, _nullTopic);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TopicModelImpl.ENTITY_CACHE_ENABLED,
					TopicImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return topic;
	}

	/**
	 * Returns the topic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param topicId the primary key of the topic
	 * @return the topic, or <code>null</code> if a topic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Topic fetchByPrimaryKey(long topicId) throws SystemException {
		return fetchByPrimaryKey((Serializable)topicId);
	}

	/**
	 * Returns all the topics.
	 *
	 * @return the topics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Topic> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Topic> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Topic> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Topic> list = (List<Topic>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TOPIC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TOPIC;

				if (pagination) {
					sql = sql.concat(TopicModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Topic>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Topic>(list);
				}
				else {
					list = (List<Topic>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the topics from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Topic topic : findAll()) {
			remove(topic);
		}
	}

	/**
	 * Returns the number of topics.
	 *
	 * @return the number of topics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TOPIC);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the topic persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.politaktiv.meinungsbild.infrastructure.model.Topic")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Topic>> listenersList = new ArrayList<ModelListener<Topic>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Topic>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TopicImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TOPIC = "SELECT topic FROM Topic topic";
	private static final String _SQL_SELECT_TOPIC_WHERE = "SELECT topic FROM Topic topic WHERE ";
	private static final String _SQL_COUNT_TOPIC = "SELECT COUNT(topic) FROM Topic topic";
	private static final String _SQL_COUNT_TOPIC_WHERE = "SELECT COUNT(topic) FROM Topic topic WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "topic.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Topic exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Topic exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TopicPersistenceImpl.class);
	private static Topic _nullTopic = new TopicImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Topic> toCacheModel() {
				return _nullTopicCacheModel;
			}
		};

	private static CacheModel<Topic> _nullTopicCacheModel = new CacheModel<Topic>() {
			@Override
			public Topic toEntityModel() {
				return _nullTopic;
			}
		};
}