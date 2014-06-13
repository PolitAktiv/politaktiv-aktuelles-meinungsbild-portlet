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

import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;
import org.politaktiv.meinungsbild.infrastructure.service.SubtopicLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.base.SubtopicServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;

/**
 * The implementation of the subtopic remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.PA.meinungsbild.infrastructure.service.SubtopicService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.PA.meinungsbild.infrastructure.service.SubtopicServiceUtil} to access the subtopic remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author politaktiv
 * @see com.PA.meinungsbild.infrastructure.service.base.SubtopicServiceBaseImpl
 * @see com.PA.meinungsbild.infrastructure.service.SubtopicServiceUtil
 */
public class SubtopicServiceImpl extends SubtopicServiceBaseImpl {
	
	public Subtopic addSubtopic(long groupId, Subtopic subtopic) throws PrincipalException, SystemException{
		
		if(!getPermissionChecker().hasPermission(groupId, "com.PA.meinungsbild.infrastructure.model.Subtopic", groupId, "ADD")){
			throw new PrincipalException();
		}
		return SubtopicLocalServiceUtil.addSubtopic(subtopic);
	}
	
	public void deleteSubtopic(long groupId, long topicId) throws SystemException, PortalException{
		
		if(!getPermissionChecker().hasPermission(groupId, "com.PA.meinungsbild.infrastructure.model.Subtopic", groupId, "DELETE")){
			throw new PrincipalException();
		}
		SubtopicLocalServiceUtil.deleteSubtopic(topicId);
	}
	
	public void updateSubtopic(long groupId, Subtopic subtopic) throws SystemException, PortalException{
		
		if(!getPermissionChecker().hasPermission(groupId, "com.PA.meinungsbild.infrastructure.model.Subtopic", groupId,"MOVE_TO_OTHER_TOPIC")){
			throw new PrincipalException();
		}
		
		SubtopicLocalServiceUtil.updateSubtopic(subtopic);
	}
}