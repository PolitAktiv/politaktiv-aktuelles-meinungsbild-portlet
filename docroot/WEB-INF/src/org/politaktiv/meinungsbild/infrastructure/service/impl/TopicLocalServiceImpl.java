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

package org.politaktiv.meinungsbild.infrastructure.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import org.politaktiv.meinungsbild.infrastructure.model.Topic;
import org.politaktiv.meinungsbild.infrastructure.service.base.TopicLocalServiceBaseImpl;
import org.politaktiv.meinungsbild.infrastructure.service.persistence.TopicUtil;

/**
 * The implementation of the topic local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.PA.meinungsbild.infrastructure.service.TopicLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.PA.meinungsbild.infrastructure.service.TopicLocalServiceUtil} to access the topic local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author politaktiv
 * @see com.PA.meinungsbild.infrastructure.service.base.TopicLocalServiceBaseImpl
 * @see com.PA.meinungsbild.infrastructure.service.TopicLocalServiceUtil
 */
public class TopicLocalServiceImpl extends TopicLocalServiceBaseImpl {
	
	public List<Topic> giveTopicByCommunityId(long communityId) throws SystemException{
		return TopicUtil.findByCommunityId(communityId);
	}
}