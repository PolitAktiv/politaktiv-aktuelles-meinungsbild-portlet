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

package com.PA.meinungsbild.infrastructure.service.impl;

import com.PA.meinungsbild.infrastructure.model.Rating;
import com.PA.meinungsbild.infrastructure.service.RatingLocalServiceUtil;
import com.PA.meinungsbild.infrastructure.service.base.RatingServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;

/**
 * The implementation of the rating remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.PA.meinungsbild.infrastructure.service.RatingService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.PA.meinungsbild.infrastructure.service.RatingServiceUtil} to access the rating remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author politaktiv
 * @see com.PA.meinungsbild.infrastructure.service.base.RatingServiceBaseImpl
 * @see com.PA.meinungsbild.infrastructure.service.RatingServiceUtil
 */
public class RatingServiceImpl extends RatingServiceBaseImpl {
	
		
	public Rating addRating(long groupId, Rating rating) throws PrincipalException, SystemException{
		
		if(!getPermissionChecker().hasPermission(groupId, "com.PA.meinungsbild.infrastructure.model.Rating", groupId, "RATE")){
			throw new PrincipalException();
		}
		return RatingLocalServiceUtil.addRating(rating);
	}
}