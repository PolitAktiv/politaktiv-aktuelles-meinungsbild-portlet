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

package org.politaktiv.meinungsbild.infrastructure.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TopicLocalService}.
 *
 * @author politaktiv
 * @see TopicLocalService
 * @generated
 */
public class TopicLocalServiceWrapper implements TopicLocalService,
	ServiceWrapper<TopicLocalService> {
	public TopicLocalServiceWrapper(TopicLocalService topicLocalService) {
		_topicLocalService = topicLocalService;
	}

	/**
	* Adds the topic to the database. Also notifies the appropriate model listeners.
	*
	* @param topic the topic
	* @return the topic that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic addTopic(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.addTopic(topic);
	}

	/**
	* Creates a new topic with the primary key. Does not add the topic to the database.
	*
	* @param topicId the primary key for the new topic
	* @return the new topic
	*/
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic createTopic(
		long topicId) {
		return _topicLocalService.createTopic(topicId);
	}

	/**
	* Deletes the topic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param topicId the primary key of the topic
	* @return the topic that was removed
	* @throws PortalException if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic deleteTopic(
		long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.deleteTopic(topicId);
	}

	/**
	* Deletes the topic from the database. Also notifies the appropriate model listeners.
	*
	* @param topic the topic
	* @return the topic that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic deleteTopic(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.deleteTopic(topic);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _topicLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.TopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.TopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic fetchTopic(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.fetchTopic(topicId);
	}

	/**
	* Returns the topic with the primary key.
	*
	* @param topicId the primary key of the topic
	* @return the topic
	* @throws PortalException if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic getTopic(
		long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.getTopic(topicId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> getTopics(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.getTopics(start, end);
	}

	/**
	* Returns the number of topics.
	*
	* @return the number of topics
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTopicsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.getTopicsCount();
	}

	/**
	* Updates the topic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param topic the topic
	* @return the topic that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic updateTopic(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.updateTopic(topic);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _topicLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_topicLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _topicLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> giveTopicByCommunityId(
		long communityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _topicLocalService.giveTopicByCommunityId(communityId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TopicLocalService getWrappedTopicLocalService() {
		return _topicLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTopicLocalService(TopicLocalService topicLocalService) {
		_topicLocalService = topicLocalService;
	}

	@Override
	public TopicLocalService getWrappedService() {
		return _topicLocalService;
	}

	@Override
	public void setWrappedService(TopicLocalService topicLocalService) {
		_topicLocalService = topicLocalService;
	}

	private TopicLocalService _topicLocalService;
}