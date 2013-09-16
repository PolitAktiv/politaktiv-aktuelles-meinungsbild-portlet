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

package org.politaktiv.meinungsbild.infrastructure.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.politaktiv.meinungsbild.infrastructure.model.Topic;

import java.io.Serializable;

/**
 * The cache model class for representing Topic in entity cache.
 *
 * @author politaktiv
 * @see Topic
 * @generated
 */
public class TopicCacheModel implements CacheModel<Topic>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{topicId=");
		sb.append(topicId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", communityId=");
		sb.append(communityId);
		sb.append("}");

		return sb.toString();
	}

	public Topic toEntityModel() {
		TopicImpl topicImpl = new TopicImpl();

		topicImpl.setTopicId(topicId);

		if (name == null) {
			topicImpl.setName(StringPool.BLANK);
		}
		else {
			topicImpl.setName(name);
		}

		topicImpl.setCommunityId(communityId);

		topicImpl.resetOriginalValues();

		return topicImpl;
	}

	public long topicId;
	public String name;
	public long communityId;
}