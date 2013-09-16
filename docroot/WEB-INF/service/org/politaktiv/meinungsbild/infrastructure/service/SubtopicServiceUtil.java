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

package org.politaktiv.meinungsbild.infrastructure.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the subtopic remote service. This utility wraps {@link org.politaktiv.meinungsbild.infrastructure.service.impl.SubtopicServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
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
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SubtopicService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					SubtopicService.class.getName(), portletClassLoader);

			_service = new SubtopicServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(SubtopicServiceUtil.class,
				"_service");
			MethodCache.remove(SubtopicService.class);
		}

		return _service;
	}

	public void setService(SubtopicService service) {
		MethodCache.remove(SubtopicService.class);

		_service = service;

		ReferenceRegistry.registerReference(SubtopicServiceUtil.class,
			"_service");
		MethodCache.remove(SubtopicService.class);
	}

	private static SubtopicService _service;
}