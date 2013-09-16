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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link SubtopicLocalService}.
 * </p>
 *
 * @author    politaktiv
 * @see       SubtopicLocalService
 * @generated
 */
public class SubtopicLocalServiceWrapper implements SubtopicLocalService,
	ServiceWrapper<SubtopicLocalService> {
	public SubtopicLocalServiceWrapper(
		SubtopicLocalService subtopicLocalService) {
		_subtopicLocalService = subtopicLocalService;
	}

	/**
	* Adds the subtopic to the database. Also notifies the appropriate model listeners.
	*
	* @param subtopic the subtopic
	* @return the subtopic that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic addSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.addSubtopic(subtopic);
	}

	/**
	* Creates a new subtopic with the primary key. Does not add the subtopic to the database.
	*
	* @param subtopicId the primary key for the new subtopic
	* @return the new subtopic
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic createSubtopic(
		long subtopicId) {
		return _subtopicLocalService.createSubtopic(subtopicId);
	}

	/**
	* Deletes the subtopic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subtopicId the primary key of the subtopic
	* @throws PortalException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSubtopic(long subtopicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_subtopicLocalService.deleteSubtopic(subtopicId);
	}

	/**
	* Deletes the subtopic from the database. Also notifies the appropriate model listeners.
	*
	* @param subtopic the subtopic
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		_subtopicLocalService.deleteSubtopic(subtopic);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic fetchSubtopic(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.fetchSubtopic(subtopicId);
	}

	/**
	* Returns the subtopic with the primary key.
	*
	* @param subtopicId the primary key of the subtopic
	* @return the subtopic
	* @throws PortalException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic getSubtopic(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.getSubtopic(subtopicId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopics(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.getSubtopics(start, end);
	}

	/**
	* Returns the number of subtopics.
	*
	* @return the number of subtopics
	* @throws SystemException if a system exception occurred
	*/
	public int getSubtopicsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.getSubtopicsCount();
	}

	/**
	* Updates the subtopic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subtopic the subtopic
	* @return the subtopic that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic updateSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.updateSubtopic(subtopic);
	}

	/**
	* Updates the subtopic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subtopic the subtopic
	* @param merge whether to merge the subtopic with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the subtopic that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic updateSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.updateSubtopic(subtopic, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _subtopicLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_subtopicLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopicsFromTopicId(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.getSubtopicsFromTopicId(topicId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SubtopicLocalService getWrappedSubtopicLocalService() {
		return _subtopicLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSubtopicLocalService(
		SubtopicLocalService subtopicLocalService) {
		_subtopicLocalService = subtopicLocalService;
	}

	public SubtopicLocalService getWrappedService() {
		return _subtopicLocalService;
	}

	public void setWrappedService(SubtopicLocalService subtopicLocalService) {
		_subtopicLocalService = subtopicLocalService;
	}

	private SubtopicLocalService _subtopicLocalService;
}