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

import org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException;
import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;
import org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicImpl;
import org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the subtopic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author politaktiv
 * @see SubtopicPersistence
 * @see SubtopicUtil
 * @generated
 */
public class SubtopicPersistenceImpl extends BasePersistenceImpl<Subtopic>
	implements SubtopicPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SubtopicUtil} to access the subtopic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SubtopicImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
			SubtopicModelImpl.FINDER_CACHE_ENABLED, SubtopicImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
			SubtopicModelImpl.FINDER_CACHE_ENABLED, SubtopicImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
			SubtopicModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOPICID = new FinderPath(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
			SubtopicModelImpl.FINDER_CACHE_ENABLED, SubtopicImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTopicId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICID =
		new FinderPath(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
			SubtopicModelImpl.FINDER_CACHE_ENABLED, SubtopicImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTopicId",
			new String[] { Long.class.getName() },
			SubtopicModelImpl.PARENTTOPIC_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOPICID = new FinderPath(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
			SubtopicModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTopicId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the subtopics where parentTopic = &#63;.
	 *
	 * @param parentTopic the parent topic
	 * @return the matching subtopics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Subtopic> findByTopicId(long parentTopic)
		throws SystemException {
		return findByTopicId(parentTopic, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the subtopics where parentTopic = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentTopic the parent topic
	 * @param start the lower bound of the range of subtopics
	 * @param end the upper bound of the range of subtopics (not inclusive)
	 * @return the range of matching subtopics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Subtopic> findByTopicId(long parentTopic, int start, int end)
		throws SystemException {
		return findByTopicId(parentTopic, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subtopics where parentTopic = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentTopic the parent topic
	 * @param start the lower bound of the range of subtopics
	 * @param end the upper bound of the range of subtopics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subtopics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Subtopic> findByTopicId(long parentTopic, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICID;
			finderArgs = new Object[] { parentTopic };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOPICID;
			finderArgs = new Object[] { parentTopic, start, end, orderByComparator };
		}

		List<Subtopic> list = (List<Subtopic>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Subtopic subtopic : list) {
				if ((parentTopic != subtopic.getParentTopic())) {
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

			query.append(_SQL_SELECT_SUBTOPIC_WHERE);

			query.append(_FINDER_COLUMN_TOPICID_PARENTTOPIC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SubtopicModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentTopic);

				if (!pagination) {
					list = (List<Subtopic>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Subtopic>(list);
				}
				else {
					list = (List<Subtopic>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first subtopic in the ordered set where parentTopic = &#63;.
	 *
	 * @param parentTopic the parent topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtopic
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a matching subtopic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic findByTopicId_First(long parentTopic,
		OrderByComparator orderByComparator)
		throws NoSuchSubtopicException, SystemException {
		Subtopic subtopic = fetchByTopicId_First(parentTopic, orderByComparator);

		if (subtopic != null) {
			return subtopic;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentTopic=");
		msg.append(parentTopic);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSubtopicException(msg.toString());
	}

	/**
	 * Returns the first subtopic in the ordered set where parentTopic = &#63;.
	 *
	 * @param parentTopic the parent topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtopic, or <code>null</code> if a matching subtopic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic fetchByTopicId_First(long parentTopic,
		OrderByComparator orderByComparator) throws SystemException {
		List<Subtopic> list = findByTopicId(parentTopic, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subtopic in the ordered set where parentTopic = &#63;.
	 *
	 * @param parentTopic the parent topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subtopic
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a matching subtopic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic findByTopicId_Last(long parentTopic,
		OrderByComparator orderByComparator)
		throws NoSuchSubtopicException, SystemException {
		Subtopic subtopic = fetchByTopicId_Last(parentTopic, orderByComparator);

		if (subtopic != null) {
			return subtopic;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentTopic=");
		msg.append(parentTopic);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSubtopicException(msg.toString());
	}

	/**
	 * Returns the last subtopic in the ordered set where parentTopic = &#63;.
	 *
	 * @param parentTopic the parent topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subtopic, or <code>null</code> if a matching subtopic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic fetchByTopicId_Last(long parentTopic,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTopicId(parentTopic);

		if (count == 0) {
			return null;
		}

		List<Subtopic> list = findByTopicId(parentTopic, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subtopics before and after the current subtopic in the ordered set where parentTopic = &#63;.
	 *
	 * @param subtopicId the primary key of the current subtopic
	 * @param parentTopic the parent topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subtopic
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic[] findByTopicId_PrevAndNext(long subtopicId,
		long parentTopic, OrderByComparator orderByComparator)
		throws NoSuchSubtopicException, SystemException {
		Subtopic subtopic = findByPrimaryKey(subtopicId);

		Session session = null;

		try {
			session = openSession();

			Subtopic[] array = new SubtopicImpl[3];

			array[0] = getByTopicId_PrevAndNext(session, subtopic, parentTopic,
					orderByComparator, true);

			array[1] = subtopic;

			array[2] = getByTopicId_PrevAndNext(session, subtopic, parentTopic,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Subtopic getByTopicId_PrevAndNext(Session session,
		Subtopic subtopic, long parentTopic,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUBTOPIC_WHERE);

		query.append(_FINDER_COLUMN_TOPICID_PARENTTOPIC_2);

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
			query.append(SubtopicModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(parentTopic);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(subtopic);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Subtopic> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subtopics where parentTopic = &#63; from the database.
	 *
	 * @param parentTopic the parent topic
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTopicId(long parentTopic) throws SystemException {
		for (Subtopic subtopic : findByTopicId(parentTopic, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(subtopic);
		}
	}

	/**
	 * Returns the number of subtopics where parentTopic = &#63;.
	 *
	 * @param parentTopic the parent topic
	 * @return the number of matching subtopics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTopicId(long parentTopic) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOPICID;

		Object[] finderArgs = new Object[] { parentTopic };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUBTOPIC_WHERE);

			query.append(_FINDER_COLUMN_TOPICID_PARENTTOPIC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentTopic);

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

	private static final String _FINDER_COLUMN_TOPICID_PARENTTOPIC_2 = "subtopic.parentTopic = ?";

	public SubtopicPersistenceImpl() {
		setModelClass(Subtopic.class);
	}

	/**
	 * Caches the subtopic in the entity cache if it is enabled.
	 *
	 * @param subtopic the subtopic
	 */
	@Override
	public void cacheResult(Subtopic subtopic) {
		EntityCacheUtil.putResult(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
			SubtopicImpl.class, subtopic.getPrimaryKey(), subtopic);

		subtopic.resetOriginalValues();
	}

	/**
	 * Caches the subtopics in the entity cache if it is enabled.
	 *
	 * @param subtopics the subtopics
	 */
	@Override
	public void cacheResult(List<Subtopic> subtopics) {
		for (Subtopic subtopic : subtopics) {
			if (EntityCacheUtil.getResult(
						SubtopicModelImpl.ENTITY_CACHE_ENABLED,
						SubtopicImpl.class, subtopic.getPrimaryKey()) == null) {
				cacheResult(subtopic);
			}
			else {
				subtopic.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all subtopics.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SubtopicImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SubtopicImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the subtopic.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Subtopic subtopic) {
		EntityCacheUtil.removeResult(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
			SubtopicImpl.class, subtopic.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Subtopic> subtopics) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Subtopic subtopic : subtopics) {
			EntityCacheUtil.removeResult(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
				SubtopicImpl.class, subtopic.getPrimaryKey());
		}
	}

	/**
	 * Creates a new subtopic with the primary key. Does not add the subtopic to the database.
	 *
	 * @param subtopicId the primary key for the new subtopic
	 * @return the new subtopic
	 */
	@Override
	public Subtopic create(long subtopicId) {
		Subtopic subtopic = new SubtopicImpl();

		subtopic.setNew(true);
		subtopic.setPrimaryKey(subtopicId);

		return subtopic;
	}

	/**
	 * Removes the subtopic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subtopicId the primary key of the subtopic
	 * @return the subtopic that was removed
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic remove(long subtopicId)
		throws NoSuchSubtopicException, SystemException {
		return remove((Serializable)subtopicId);
	}

	/**
	 * Removes the subtopic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the subtopic
	 * @return the subtopic that was removed
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic remove(Serializable primaryKey)
		throws NoSuchSubtopicException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Subtopic subtopic = (Subtopic)session.get(SubtopicImpl.class,
					primaryKey);

			if (subtopic == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSubtopicException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(subtopic);
		}
		catch (NoSuchSubtopicException nsee) {
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
	protected Subtopic removeImpl(Subtopic subtopic) throws SystemException {
		subtopic = toUnwrappedModel(subtopic);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(subtopic)) {
				subtopic = (Subtopic)session.get(SubtopicImpl.class,
						subtopic.getPrimaryKeyObj());
			}

			if (subtopic != null) {
				session.delete(subtopic);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (subtopic != null) {
			clearCache(subtopic);
		}

		return subtopic;
	}

	@Override
	public Subtopic updateImpl(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws SystemException {
		subtopic = toUnwrappedModel(subtopic);

		boolean isNew = subtopic.isNew();

		SubtopicModelImpl subtopicModelImpl = (SubtopicModelImpl)subtopic;

		Session session = null;

		try {
			session = openSession();

			if (subtopic.isNew()) {
				session.save(subtopic);

				subtopic.setNew(false);
			}
			else {
				session.merge(subtopic);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SubtopicModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((subtopicModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						subtopicModelImpl.getOriginalParentTopic()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOPICID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICID,
					args);

				args = new Object[] { subtopicModelImpl.getParentTopic() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOPICID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICID,
					args);
			}
		}

		EntityCacheUtil.putResult(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
			SubtopicImpl.class, subtopic.getPrimaryKey(), subtopic);

		return subtopic;
	}

	protected Subtopic toUnwrappedModel(Subtopic subtopic) {
		if (subtopic instanceof SubtopicImpl) {
			return subtopic;
		}

		SubtopicImpl subtopicImpl = new SubtopicImpl();

		subtopicImpl.setNew(subtopic.isNew());
		subtopicImpl.setPrimaryKey(subtopic.getPrimaryKey());

		subtopicImpl.setSubtopicId(subtopic.getSubtopicId());
		subtopicImpl.setName(subtopic.getName());
		subtopicImpl.setUrl(subtopic.getUrl());
		subtopicImpl.setParentTopic(subtopic.getParentTopic());

		return subtopicImpl;
	}

	/**
	 * Returns the subtopic with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the subtopic
	 * @return the subtopic
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSubtopicException, SystemException {
		Subtopic subtopic = fetchByPrimaryKey(primaryKey);

		if (subtopic == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSubtopicException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return subtopic;
	}

	/**
	 * Returns the subtopic with the primary key or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException} if it could not be found.
	 *
	 * @param subtopicId the primary key of the subtopic
	 * @return the subtopic
	 * @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic findByPrimaryKey(long subtopicId)
		throws NoSuchSubtopicException, SystemException {
		return findByPrimaryKey((Serializable)subtopicId);
	}

	/**
	 * Returns the subtopic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the subtopic
	 * @return the subtopic, or <code>null</code> if a subtopic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Subtopic subtopic = (Subtopic)EntityCacheUtil.getResult(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
				SubtopicImpl.class, primaryKey);

		if (subtopic == _nullSubtopic) {
			return null;
		}

		if (subtopic == null) {
			Session session = null;

			try {
				session = openSession();

				subtopic = (Subtopic)session.get(SubtopicImpl.class, primaryKey);

				if (subtopic != null) {
					cacheResult(subtopic);
				}
				else {
					EntityCacheUtil.putResult(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
						SubtopicImpl.class, primaryKey, _nullSubtopic);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SubtopicModelImpl.ENTITY_CACHE_ENABLED,
					SubtopicImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return subtopic;
	}

	/**
	 * Returns the subtopic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subtopicId the primary key of the subtopic
	 * @return the subtopic, or <code>null</code> if a subtopic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Subtopic fetchByPrimaryKey(long subtopicId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)subtopicId);
	}

	/**
	 * Returns all the subtopics.
	 *
	 * @return the subtopics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Subtopic> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subtopics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of subtopics
	 * @param end the upper bound of the range of subtopics (not inclusive)
	 * @return the range of subtopics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Subtopic> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the subtopics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of subtopics
	 * @param end the upper bound of the range of subtopics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of subtopics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Subtopic> findAll(int start, int end,
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

		List<Subtopic> list = (List<Subtopic>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SUBTOPIC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUBTOPIC;

				if (pagination) {
					sql = sql.concat(SubtopicModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Subtopic>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Subtopic>(list);
				}
				else {
					list = (List<Subtopic>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the subtopics from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Subtopic subtopic : findAll()) {
			remove(subtopic);
		}
	}

	/**
	 * Returns the number of subtopics.
	 *
	 * @return the number of subtopics
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

				Query q = session.createQuery(_SQL_COUNT_SUBTOPIC);

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
	 * Initializes the subtopic persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.politaktiv.meinungsbild.infrastructure.model.Subtopic")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Subtopic>> listenersList = new ArrayList<ModelListener<Subtopic>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Subtopic>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SubtopicImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SUBTOPIC = "SELECT subtopic FROM Subtopic subtopic";
	private static final String _SQL_SELECT_SUBTOPIC_WHERE = "SELECT subtopic FROM Subtopic subtopic WHERE ";
	private static final String _SQL_COUNT_SUBTOPIC = "SELECT COUNT(subtopic) FROM Subtopic subtopic";
	private static final String _SQL_COUNT_SUBTOPIC_WHERE = "SELECT COUNT(subtopic) FROM Subtopic subtopic WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "subtopic.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Subtopic exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Subtopic exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SubtopicPersistenceImpl.class);
	private static Subtopic _nullSubtopic = new SubtopicImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Subtopic> toCacheModel() {
				return _nullSubtopicCacheModel;
			}
		};

	private static CacheModel<Subtopic> _nullSubtopicCacheModel = new CacheModel<Subtopic>() {
			@Override
			public Subtopic toEntityModel() {
				return _nullSubtopic;
			}
		};
}