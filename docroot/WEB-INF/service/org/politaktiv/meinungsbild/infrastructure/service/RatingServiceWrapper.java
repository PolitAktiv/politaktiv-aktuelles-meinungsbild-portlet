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
 * Provides a wrapper for {@link RatingService}.
 *
 * @author politaktiv
 * @see RatingService
 * @generated
 */
public class RatingServiceWrapper implements RatingService,
	ServiceWrapper<RatingService> {
	public RatingServiceWrapper(RatingService ratingService) {
		_ratingService = ratingService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ratingService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ratingService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ratingService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.politaktiv.meinungsbild.infrastructure.model.Rating addRating(
		long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _ratingService.addRating(groupId, rating);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RatingService getWrappedRatingService() {
		return _ratingService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRatingService(RatingService ratingService) {
		_ratingService = ratingService;
	}

	@Override
	public RatingService getWrappedService() {
		return _ratingService;
	}

	@Override
	public void setWrappedService(RatingService ratingService) {
		_ratingService = ratingService;
	}

	private RatingService _ratingService;
}