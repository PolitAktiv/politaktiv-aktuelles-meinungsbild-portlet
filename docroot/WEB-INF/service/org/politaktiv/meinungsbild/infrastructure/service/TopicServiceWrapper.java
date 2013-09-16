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
 * This class is a wrapper for {@link TopicService}.
 * </p>
 *
 * @author    politaktiv
 * @see       TopicService
 * @generated
 */
public class TopicServiceWrapper implements TopicService,
	ServiceWrapper<TopicService> {
	public TopicServiceWrapper(TopicService topicService) {
		_topicService = topicService;
	}

	public org.politaktiv.meinungsbild.infrastructure.model.Topic addTopic(
		long groupId,
		org.politaktiv.meinungsbild.infrastructure.model.Topic topic)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _topicService.addTopic(groupId, topic);
	}

	public void deleteTopic(long groupId, long topicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_topicService.deleteTopic(groupId, topicId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TopicService getWrappedTopicService() {
		return _topicService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTopicService(TopicService topicService) {
		_topicService = topicService;
	}

	public TopicService getWrappedService() {
		return _topicService;
	}

	public void setWrappedService(TopicService topicService) {
		_topicService = topicService;
	}

	private TopicService _topicService;
}