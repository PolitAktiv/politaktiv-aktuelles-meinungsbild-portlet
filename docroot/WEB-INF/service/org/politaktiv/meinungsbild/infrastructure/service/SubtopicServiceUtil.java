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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Subtopic. This utility wraps
 * {@link org.politaktiv.meinungsbild.infrastructure.service.impl.SubtopicServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author politaktiv
 * @see SubtopicService
 * @see org.politaktiv.meinungsbild.infrastructure.service.base.SubtopicServiceBaseImpl
 * @see org.politaktiv.meinungsbild.infrastructure.service.impl.SubtopicServiceImpl
 * @generated
 */
public class SubtopicServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.politaktiv.meinungsbild.infrastructure.service.impl.SubtopicServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic addSubtopic(
		long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService().addSubtopic(groupId, subtopic);
	}

	public static void deleteSubtopic(long groupId, long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSubtopic(groupId, topicId);
	}

	public static void updateSubtopic(long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().updateSubtopic(groupId, subtopic);
	}

	public static void clearService() {
		_service = null;
	}

	public static SubtopicService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SubtopicService.class.getName());

			if (invokableService instanceof SubtopicService) {
				_service = (SubtopicService)invokableService;
			}
			else {
				_service = new SubtopicServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(SubtopicServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(SubtopicService service) {
	}

	private static SubtopicService _service;
}