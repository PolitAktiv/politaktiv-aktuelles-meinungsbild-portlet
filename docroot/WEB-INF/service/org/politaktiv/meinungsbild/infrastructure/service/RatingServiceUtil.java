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
 * The utility for the rating remote service. This utility wraps {@link org.politaktiv.meinungsbild.infrastructure.service.impl.RatingServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author politaktiv
 * @see RatingService
 * @see org.politaktiv.meinungsbild.infrastructure.service.base.RatingServiceBaseImpl
 * @see org.politaktiv.meinungsbild.infrastructure.service.impl.RatingServiceImpl
 * @generated
 */
public class RatingServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.politaktiv.meinungsbild.infrastructure.service.impl.RatingServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static org.politaktiv.meinungsbild.infrastructure.model.Rating addRating(
		long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService().addRating(groupId, rating);
	}

	public static void clearService() {
		_service = null;
	}

	public static RatingService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RatingService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					RatingService.class.getName(), portletClassLoader);

			_service = new RatingServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(RatingServiceUtil.class,
				"_service");
			MethodCache.remove(RatingService.class);
		}

		return _service;
	}

	public void setService(RatingService service) {
		MethodCache.remove(RatingService.class);

		_service = service;

		ReferenceRegistry.registerReference(RatingServiceUtil.class, "_service");
		MethodCache.remove(RatingService.class);
	}

	private static RatingService _service;
}