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
 * This class is a wrapper for {@link SubtopicService}.
 * </p>
 *
 * @author    politaktiv
 * @see       SubtopicService
 * @generated
 */
public class SubtopicServiceWrapper implements SubtopicService,
	ServiceWrapper<SubtopicService> {
	public SubtopicServiceWrapper(SubtopicService subtopicService) {
		_subtopicService = subtopicService;
	}

	public org.politaktiv.meinungsbild.infrastructure.model.Subtopic addSubtopic(
		long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _subtopicService.addSubtopic(groupId, subtopic);
	}

	public void deleteSubtopic(long groupId, long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_subtopicService.deleteSubtopic(groupId, topicId);
	}

	public void updateSubtopic(long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Subtopic subtopic)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_subtopicService.updateSubtopic(groupId, subtopic);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SubtopicService getWrappedSubtopicService() {
		return _subtopicService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSubtopicService(SubtopicService subtopicService) {
		_subtopicService = subtopicService;
	}

	public SubtopicService getWrappedService() {
		return _subtopicService;
	}

	public void setWrappedService(SubtopicService subtopicService) {
		_subtopicService = subtopicService;
	}

	private SubtopicService _subtopicService;
}