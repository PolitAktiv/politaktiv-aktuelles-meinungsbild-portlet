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

import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;

import java.io.Serializable;

/**
 * The cache model class for representing Subtopic in entity cache.
 *
 * @author politaktiv
 * @see Subtopic
 * @generated
 */
public class SubtopicCacheModel implements CacheModel<Subtopic>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{subtopicId=");
		sb.append(subtopicId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", url=");
		sb.append(url);
		sb.append(", parentTopic=");
		sb.append(parentTopic);
		sb.append("}");

		return sb.toString();
	}

	public Subtopic toEntityModel() {
		SubtopicImpl subtopicImpl = new SubtopicImpl();

		subtopicImpl.setSubtopicId(subtopicId);

		if (name == null) {
			subtopicImpl.setName(StringPool.BLANK);
		}
		else {
			subtopicImpl.setName(name);
		}

		if (url == null) {
			subtopicImpl.setUrl(StringPool.BLANK);
		}
		else {
			subtopicImpl.setUrl(url);
		}

		subtopicImpl.setParentTopic(parentTopic);

		subtopicImpl.resetOriginalValues();

		return subtopicImpl;
	}

	public long subtopicId;
	public String name;
	public String url;
	public long parentTopic;
}