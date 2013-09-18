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
 * The utility for the subtopic local service. This utility wraps {@link org.politaktiv.meinungsbild.infrastructure.service.impl.SubtopicLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author politaktiv
 * @see SubtopicLocalService
 * @see org.politaktiv.meinungsbild.infrastructure.service.base.SubtopicLocalServiceBaseImpl
 * @see org.politaktiv.meinungsbild.infrastructure.service.impl.SubtopicLocalServiceImpl
 * @generated
 */
public class SubtopicLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.politaktiv.meinungsbild.infrastructure.service.impl.SubtopicLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the subtopic to the database. Also notifies the appropriate model listeners.
	*
	* @param subtopic the subtopic
	* @return the subtopic that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic addSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSubtopic(subtopic);
	}

	/**
	* Creates a new subtopic with the primary key. Does not add the subtopic to the database.
	*
	* @param subtopicId the primary key for the new subtopic
	* @return the new subtopic
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic createSubtopic(
		long subtopicId) {
		return getService().createSubtopic(subtopicId);
	}

	/**
	* Deletes the subtopic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subtopicId the primary key of the subtopic
	* @throws PortalException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSubtopic(long subtopicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSubtopic(subtopicId);
	}

	/**
	* Deletes the subtopic from the database. Also notifies the appropriate model listeners.
	*
	* @param subtopic the subtopic
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSubtopic(subtopic);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic fetchSubtopic(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSubtopic(subtopicId);
	}

	/**
	* Returns the subtopic with the primary key.
	*
	* @param subtopicId the primary key of the subtopic
	* @return the subtopic
	* @throws PortalException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic getSubtopic(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubtopic(subtopicId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the subtopics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of subtopics
	* @param end the upper bound of the range of subtopics (not inclusive)
	* @return the range of subtopics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopics(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubtopics(start, end);
	}

	/**
	* Returns the number of subtopics.
	*
	* @return the number of subtopics
	* @throws SystemException if a system exception occurred
	*/
	public static int getSubtopicsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubtopicsCount();
	}

	/**
	* Updates the subtopic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subtopic the subtopic
	* @return the subtopic that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic updateSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSubtopic(subtopic);
	}

	/**
	* Updates the subtopic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subtopic the subtopic
	* @param merge whether to merge the subtopic with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the subtopic that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic updateSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSubtopic(subtopic, merge);
	}

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

	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopicsFromTopicId(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubtopicsFromTopicId(topicId);
	}

	public static void clearService() {
		_service = null;
	}

	public static SubtopicLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SubtopicLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					SubtopicLocalService.class.getName(), portletClassLoader);

			_service = new SubtopicLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(SubtopicLocalServiceUtil.class,
				"_service");
			MethodCache.remove(SubtopicLocalService.class);
		}

		return _service;
	}

	public void setService(SubtopicLocalService service) {
		MethodCache.remove(SubtopicLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(SubtopicLocalServiceUtil.class,
			"_service");
		MethodCache.remove(SubtopicLocalService.class);
	}

	private static SubtopicLocalService _service;
}