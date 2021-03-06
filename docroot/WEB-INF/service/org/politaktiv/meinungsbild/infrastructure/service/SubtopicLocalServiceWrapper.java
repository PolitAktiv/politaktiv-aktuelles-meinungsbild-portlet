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
 * Provides a wrapper for {@link SubtopicLocalService}.
 *
 * @author politaktiv
 * @see SubtopicLocalService
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
	@Override
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
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic createSubtopic(
		long subtopicId) {
		return _subtopicLocalService.createSubtopic(subtopicId);
	}

	/**
	* Deletes the subtopic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subtopicId the primary key of the subtopic
	* @return the subtopic that was removed
	* @throws PortalException if a subtopic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic deleteSubtopic(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.deleteSubtopic(subtopicId);
	}

	/**
	* Deletes the subtopic from the database. Also notifies the appropriate model listeners.
	*
	* @param subtopic the subtopic
	* @return the subtopic that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic deleteSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.deleteSubtopic(subtopic);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _subtopicLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
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
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
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
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic getSubtopic(
		long subtopicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.getSubtopic(subtopicId);
	}

	@Override
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of subtopics
	* @param end the upper bound of the range of subtopics (not inclusive)
	* @return the range of subtopics
	* @throws SystemException if a system exception occurred
	*/
	@Override
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
	@Override
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
	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic updateSubtopic(
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.updateSubtopic(subtopic);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _subtopicLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_subtopicLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _subtopicLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopicsFromTopicId(
		long topicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subtopicLocalService.getSubtopicsFromTopicId(topicId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SubtopicLocalService getWrappedSubtopicLocalService() {
		return _subtopicLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSubtopicLocalService(
		SubtopicLocalService subtopicLocalService) {
		_subtopicLocalService = subtopicLocalService;
	}

	@Override
	public SubtopicLocalService getWrappedService() {
		return _subtopicLocalService;
	}

	@Override
	public void setWrappedService(SubtopicLocalService subtopicLocalService) {
		_subtopicLocalService = subtopicLocalService;
	}

	private SubtopicLocalService _subtopicLocalService;
}