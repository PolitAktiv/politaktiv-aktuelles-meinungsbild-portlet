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

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import com.PA.meinungsbild.infrastructure.model.Rating;
import com.PA.meinungsbild.infrastructure.service.base.RatingLocalServiceBaseImpl;
import com.PA.meinungsbild.infrastructure.service.persistence.RatingUtil;

/**
 * The implementation of the rating local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.PA.meinungsbild.infrastructure.service.RatingLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.PA.meinungsbild.infrastructure.service.RatingLocalServiceUtil} to access the rating local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author politaktiv
 * @see com.PA.meinungsbild.infrastructure.service.base.RatingLocalServiceBaseImpl
 * @see com.PA.meinungsbild.infrastructure.service.RatingLocalServiceUtil
 */
public class RatingLocalServiceImpl extends RatingLocalServiceBaseImpl {
	
	public Rating giveRatingByUserIdAndSubtopicId(long userId, long subtopicId) throws SystemException{
		return RatingUtil.fetchByUserIdAndSubtopicId(userId, subtopicId);
	}
	
	public List<Rating> bySubtopicId(long subtopicId) throws SystemException{
		return RatingUtil.findBySubtopicId(subtopicId);
	}
}