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
 * This class is a wrapper for {@link RatingService}.
 * </p>
 *
 * @author    politaktiv
 * @see       RatingService
 * @generated
 */
public class RatingServiceWrapper implements RatingService,
	ServiceWrapper<RatingService> {
	public RatingServiceWrapper(RatingService ratingService) {
		_ratingService = ratingService;
	}

	public org.politaktiv.meinungsbild.infrastructure.model.Rating addRating(
		long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _ratingService.addRating(groupId, rating);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public RatingService getWrappedRatingService() {
		return _ratingService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedRatingService(RatingService ratingService) {
		_ratingService = ratingService;
	}

	public RatingService getWrappedService() {
		return _ratingService;
	}

	public void setWrappedService(RatingService ratingService) {
		_ratingService = ratingService;
	}

	private RatingService _ratingService;
}