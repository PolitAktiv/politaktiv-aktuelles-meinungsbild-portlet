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
 * Provides a wrapper for {@link SubtopicService}.
 *
 * @author politaktiv
 * @see SubtopicService
 * @generated
 */
public class SubtopicServiceWrapper implements SubtopicService,
	ServiceWrapper<SubtopicService> {
	public SubtopicServiceWrapper(SubtopicService subtopicService) {
		_subtopicService = subtopicService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _subtopicService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_subtopicService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _subtopicService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic addSubtopic(
		long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _subtopicService.addSubtopic(groupId, subtopic);
	}

	@Override
	public void deleteSubtopic(long groupId, long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_subtopicService.deleteSubtopic(groupId, topicId);
	}

	@Override
	public void updateSubtopic(long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_subtopicService.updateSubtopic(groupId, subtopic);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SubtopicService getWrappedSubtopicService() {
		return _subtopicService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSubtopicService(SubtopicService subtopicService) {
		_subtopicService = subtopicService;
	}

	@Override
	public SubtopicService getWrappedService() {
		return _subtopicService;
	}

	@Override
	public void setWrappedService(SubtopicService subtopicService) {
		_subtopicService = subtopicService;
	}

	private SubtopicService _subtopicService;
}