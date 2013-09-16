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

import org.politaktiv.meinungsbild.infrastructure.model.Topic;
import org.politaktiv.meinungsbild.infrastructure.service.TopicLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.base.TopicServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.security.auth.PrincipalException;

/**
 * The implementation of the topic remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.PA.meinungsbild.infrastructure.service.TopicService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.PA.meinungsbild.infrastructure.service.TopicServiceUtil} to access the topic remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author politaktiv
 * @see com.PA.meinungsbild.infrastructure.service.base.TopicServiceBaseImpl
 * @see com.PA.meinungsbild.infrastructure.service.TopicServiceUtil
 */
public class TopicServiceImpl extends TopicServiceBaseImpl {
	
	private static Log _log = LogFactoryUtil.getLog(org.politaktiv.meinungsbild.infrastructure.service.TopicServiceUtil.class);
	
	public Topic addTopic(long groupId, Topic topic) throws PrincipalException, SystemException{
		
		if(!getPermissionChecker().hasPermission(groupId, "com.PA.meinungsbild.infrastructure.model.Topic", groupId, "ADD")){
			_log.error("user has no permission to add topic");
			throw new PrincipalException();
		}
		return TopicLocalServiceUtil.addTopic(topic);
	}
	
	public void deleteTopic(long groupId, long topicId) throws SystemException, PortalException{
		
		if(!getPermissionChecker().hasPermission(groupId, "com.PA.meinungsbild.infrastructure.model.Topic", groupId, "DELETE")){
			throw new PrincipalException();
		}
		TopicLocalServiceUtil.deleteTopic(topicId);
	}
}