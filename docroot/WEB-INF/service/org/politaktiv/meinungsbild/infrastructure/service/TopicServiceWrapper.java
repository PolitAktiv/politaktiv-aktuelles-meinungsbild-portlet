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
 * Provides a wrapper for {@link TopicService}.
 *
 * @author politaktiv
 * @see TopicService
 * @generated
 */
public class TopicServiceWrapper implements TopicService,
	ServiceWrapper<TopicService> {
	public TopicServiceWrapper(TopicService topicService) {
		_topicService = topicService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _topicService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_topicService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _topicService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Topic addTopic(
		long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _topicService.addTopic(groupId, topic);
	}

	@Override
	public void deleteTopic(long groupId, long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_topicService.deleteTopic(groupId, topicId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TopicService getWrappedTopicService() {
		return _topicService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTopicService(TopicService topicService) {
		_topicService = topicService;
	}

	@Override
	public TopicService getWrappedService() {
		return _topicService;
	}

	@Override
	public void setWrappedService(TopicService topicService) {
		_topicService = topicService;
	}

	private TopicService _topicService;
}