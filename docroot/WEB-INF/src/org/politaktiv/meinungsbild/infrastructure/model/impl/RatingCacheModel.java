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
import com.liferay.portal.model.CacheModel;

import org.politaktiv.meinungsbild.infrastructure.model.Rating;

import java.io.Serializable;

/**
 * The cache model class for representing Rating in entity cache.
 *
 * @author politaktiv
 * @see Rating
 * @generated
 */
public class RatingCacheModel implements CacheModel<Rating>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{ratingId=");
		sb.append(ratingId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", subtopicId=");
		sb.append(subtopicId);
		sb.append(", score=");
		sb.append(score);
		sb.append("}");

		return sb.toString();
	}

	public Rating toEntityModel() {
		RatingImpl ratingImpl = new RatingImpl();

		ratingImpl.setRatingId(ratingId);
		ratingImpl.setUserId(userId);
		ratingImpl.setSubtopicId(subtopicId);
		ratingImpl.setScore(score);

		ratingImpl.resetOriginalValues();

		return ratingImpl;
	}

	public long ratingId;
	public long userId;
	public long subtopicId;
	public int score;
}