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

package org.politaktiv.meinungsbild.infrastructure.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.politaktiv.meinungsbild.infrastructure.service.ClpSerializer;
import org.politaktiv.meinungsbild.infrastructure.service.RatingLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.RatingServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.SubtopicLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.SubtopicServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.TopicLocalServiceUtil;
import org.politaktiv.meinungsbild.infrastructure.service.TopicServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			RatingLocalServiceUtil.clearService();

			RatingServiceUtil.clearService();
			SubtopicLocalServiceUtil.clearService();

			SubtopicServiceUtil.clearService();
			TopicLocalServiceUtil.clearService();

			TopicServiceUtil.clearService();
		}
	}
}