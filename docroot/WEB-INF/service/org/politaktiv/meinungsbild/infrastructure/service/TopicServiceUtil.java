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
 * The utility for the topic remote service. This utility wraps {@link org.politaktiv.meinungsbild.infrastructure.service.impl.TopicServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author politaktiv
 * @see TopicService
 * @see org.politaktiv.meinungsbild.infrastructure.service.base.TopicServiceBaseImpl
 * @see org.politaktiv.meinungsbild.infrastructure.service.impl.TopicServiceImpl
 * @generated
 */
public class TopicServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.politaktiv.meinungsbild.infrastructure.service.impl.TopicServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic addTopic(
		long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService().addTopic(groupId, topic);
	}

	public static void deleteTopic(long groupId, long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTopic(groupId, topicId);
	}

	public static void clearService() {
		_service = null;
	}

	public static TopicService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TopicService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TopicService.class.getName(), portletClassLoader);

			_service = new TopicServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TopicServiceUtil.class,
				"_service");
			MethodCache.remove(TopicService.class);
		}

		return _service;
	}

	public void setService(TopicService service) {
		MethodCache.remove(TopicService.class);

		_service = service;

		ReferenceRegistry.registerReference(TopicServiceUtil.class, "_service");
		MethodCache.remove(TopicService.class);
	}

	private static TopicService _service;
}