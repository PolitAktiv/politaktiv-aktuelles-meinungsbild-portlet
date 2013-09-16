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

package org.politaktiv.meinungsbild.infrastructure.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;

import java.util.List;

/**
 * The persistence utility for the subtopic service. This utility wraps {@link SubtopicPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author politaktiv
 * @see SubtopicPersistence
 * @see SubtopicPersistenceImpl
 * @generated
 */
public class SubtopicUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Subtopic subtopic) {
		getPersistence().clearCache(subtopic);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Subtopic> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Subtopic> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Subtopic> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Subtopic update(Subtopic subtopic, boolean merge)
		throws SystemException {
		return getPersistence().update(subtopic, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Subtopic update(Subtopic subtopic, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(subtopic, merge, serviceContext);
	}

	/**
	* Caches the subtopic in the entity cache if it is enabled.
	*
	* @param subtopic the subtopic
	*/
	public static void cacheResult(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic) {
		getPersistence().cacheResult(subtopic);
	}

	/**
	* Caches the subtopics in the entity cache if it is enabled.
	*
	* @param subtopics the subtopics
	*/
	public static void cacheResult(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> subtopics) {
		getPersistence().cacheResult(subtopics);
	}

	/**
	* Creates a new subtopic with the primary key. Does not add the subtopic to the database.
	*
	* @param subtopicId the primary key for the new subtopic
	* @return the new subtopic
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic create(
		long subtopicId) {
		return getPersistence().create(subtopicId);
	}

	/**
	* Removes the subtopic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subtopicId the primary key of the subtopic
	* @return the subtopic that was removed
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic remove(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException {
		return getPersistence().remove(subtopicId);
	}

	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic updateImpl(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(subtopic, merge);
	}

	/**
	* Returns the subtopic with the primary key or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException} if it could not be found.
	*
	* @param subtopicId the primary key of the subtopic
	* @return the subtopic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic findByPrimaryKey(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException {
		return getPersistence().findByPrimaryKey(subtopicId);
	}

	/**
	* Returns the subtopic with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subtopicId the primary key of the subtopic
	* @return the subtopic, or <code>null</code> if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic fetchByPrimaryKey(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(subtopicId);
	}

	/**
	* Returns all the subtopics where parentTopic = &#63;.
	*
	* @param parentTopic the parent topic
	* @return the matching subtopics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findByTopicId(
		long parentTopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTopicId(parentTopic);
	}

	/**
	* Returns a range of all the subtopics where parentTopic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parentTopic the parent topic
	* @param start the lower bound of the range of subtopics
	* @param end the upper bound of the range of subtopics (not inclusive)
	* @return the range of matching subtopics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findByTopicId(
		long parentTopic, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTopicId(parentTopic, start, end);
	}

	/**
	* Returns an ordered range of all the subtopics where parentTopic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parentTopic the parent topic
	* @param start the lower bound of the range of subtopics
	* @param end the upper bound of the range of subtopics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching subtopics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findByTopicId(
		long parentTopic, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTopicId(parentTopic, start, end, orderByComparator);
	}

	/**
	* Returns the first subtopic in the ordered set where parentTopic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parentTopic the parent topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtopic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a matching subtopic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic findByTopicId_First(
		long parentTopic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException {
		return getPersistence()
				   .findByTopicId_First(parentTopic, orderByComparator);
	}

	/**
	* Returns the last subtopic in the ordered set where parentTopic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parentTopic the parent topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtopic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a matching subtopic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic findByTopicId_Last(
		long parentTopic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException {
		return getPersistence()
				   .findByTopicId_Last(parentTopic, orderByComparator);
	}

	/**
	* Returns the subtopics before and after the current subtopic in the ordered set where parentTopic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param subtopicId the primary key of the current subtopic
	* @param parentTopic the parent topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next subtopic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.politaktiv.meinungsbild.infrastructure.model.Subtopic[] findByTopicId_PrevAndNext(
		long subtopicId, long parentTopic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException {
		return getPersistence()
				   .findByTopicId_PrevAndNext(subtopicId, parentTopic,
			orderByComparator);
	}

	/**
	* Returns all the subtopics.
	*
	* @return the subtopics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the subtopics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of subtopics
	* @param end the upper bound of the range of subtopics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of subtopics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the subtopics where parentTopic = &#63; from the database.
	*
	* @param parentTopic the parent topic
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTopicId(long parentTopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTopicId(parentTopic);
	}

	/**
	* Removes all the subtopics from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of subtopics where parentTopic = &#63;.
	*
	* @param parentTopic the parent topic
	* @return the number of matching subtopics
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTopicId(long parentTopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTopicId(parentTopic);
	}

	/**
	* Returns the number of subtopics.
	*
	* @return the number of subtopics
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SubtopicPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SubtopicPersistence)PortletBeanLocatorUtil.locate(org.politaktiv.meinungsbild.infrastructure.service.ClpSerializer.getServletContextName(),
					SubtopicPersistence.class.getName());

			ReferenceRegistry.registerReference(SubtopicUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(SubtopicPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(SubtopicUtil.class, "_persistence");
	}

	private static SubtopicPersistence _persistence;
}