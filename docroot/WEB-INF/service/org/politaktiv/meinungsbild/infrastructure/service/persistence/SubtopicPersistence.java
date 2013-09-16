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

import com.liferay.portal.service.persistence.BasePersistence;

import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;

/**
 * The persistence interface for the subtopic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author politaktiv
 * @see SubtopicPersistenceImpl
 * @see SubtopicUtil
 * @generated
 */
public interface SubtopicPersistence extends BasePersistence<Subtopic> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SubtopicUtil} to access the subtopic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the subtopic in the entity cache if it is enabled.
	*
	* @param subtopic the subtopic
	*/
	public void cacheResult(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic);

	/**
	* Caches the subtopics in the entity cache if it is enabled.
	*
	* @param subtopics the subtopics
	*/
	public void cacheResult(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> subtopics);

	/**
	* Creates a new subtopic with the primary key. Does not add the subtopic to the database.
	*
	* @param subtopicId the primary key for the new subtopic
	* @return the new subtopic
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic create(
		long subtopicId);

	/**
	* Removes the subtopic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subtopicId the primary key of the subtopic
	* @return the subtopic that was removed
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic remove(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException;

	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic updateImpl(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the subtopic with the primary key or throws a {@link org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException} if it could not be found.
	*
	* @param subtopicId the primary key of the subtopic
	* @return the subtopic
	* @throws org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic findByPrimaryKey(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException;

	/**
	* Returns the subtopic with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subtopicId the primary key of the subtopic
	* @return the subtopic, or <code>null</code> if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic fetchByPrimaryKey(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the subtopics where parentTopic = &#63;.
	*
	* @param parentTopic the parent topic
	* @return the matching subtopics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findByTopicId(
		long parentTopic)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findByTopicId(
		long parentTopic, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findByTopicId(
		long parentTopic, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic findByTopicId_First(
		long parentTopic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException;

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
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic findByTopicId_Last(
		long parentTopic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException;

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
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic[] findByTopicId_PrevAndNext(
		long subtopicId, long parentTopic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.politaktiv.meinungsbild.infrastructure.NoSuchSubtopicException;

	/**
	* Returns all the subtopics.
	*
	* @return the subtopics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the subtopics where parentTopic = &#63; from the database.
	*
	* @param parentTopic the parent topic
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTopicId(long parentTopic)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the subtopics from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of subtopics where parentTopic = &#63;.
	*
	* @param parentTopic the parent topic
	* @return the number of matching subtopics
	* @throws SystemException if a system exception occurred
	*/
	public int countByTopicId(long parentTopic)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of subtopics.
	*
	* @return the number of subtopics
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}