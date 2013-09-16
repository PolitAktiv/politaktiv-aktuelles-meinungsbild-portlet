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
 * The utility for the topic local service. This utility wraps {@link org.politaktiv.meinungsbild.infrastructure.service.impl.TopicLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author politaktiv
 * @see TopicLocalService
 * @see org.politaktiv.meinungsbild.infrastructure.service.base.TopicLocalServiceBaseImpl
 * @see org.politaktiv.meinungsbild.infrastructure.service.impl.TopicLocalServiceImpl
 * @generated
 */
public class TopicLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.politaktiv.meinungsbild.infrastructure.service.impl.TopicLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the topic to the database. Also notifies the appropriate model listeners.
	*
	* @param topic the topic
	* @return the topic that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic addTopic(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTopic(topic);
	}

	/**
	* Creates a new topic with the primary key. Does not add the topic to the database.
	*
	* @param topicId the primary key for the new topic
	* @return the new topic
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic createTopic(
		long topicId) {
		return getService().createTopic(topicId);
	}

	/**
	* Deletes the topic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param topicId the primary key of the topic
	* @throws PortalException if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTopic(long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTopic(topicId);
	}

	/**
	* Deletes the topic from the database. Also notifies the appropriate model listeners.
	*
	* @param topic the topic
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTopic(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTopic(topic);
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

	public static org.politaktiv.meinungsbild.infrastructure.model.Topic fetchTopic(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTopic(topicId);
	}

	/**
	* Returns the topic with the primary key.
	*
	* @param topicId the primary key of the topic
	* @return the topic
	* @throws PortalException if a topic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic getTopic(
		long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTopic(topicId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the topics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of topics
	* @param end the upper bound of the range of topics (not inclusive)
	* @return the range of topics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> getTopics(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTopics(start, end);
	}

	/**
	* Returns the number of topics.
	*
	* @return the number of topics
	* @throws SystemException if a system exception occurred
	*/
	public static int getTopicsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTopicsCount();
	}

	/**
	* Updates the topic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param topic the topic
	* @return the topic that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic updateTopic(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTopic(topic);
	}

	/**
	* Updates the topic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param topic the topic
	* @param merge whether to merge the topic with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the topic that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Topic updateTopic(
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTopic(topic, merge);
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

	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Topic> giveTopicByCommunityId(
		long communityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().giveTopicByCommunityId(communityId);
	}

	public static void clearService() {
		_service = null;
	}

	public static TopicLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TopicLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TopicLocalService.class.getName(), portletClassLoader);

			_service = new TopicLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TopicLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TopicLocalService.class);
		}

		return _service;
	}

	public void setService(TopicLocalService service) {
		MethodCache.remove(TopicLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TopicLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TopicLocalService.class);
	}

	private static TopicLocalService _service;
}