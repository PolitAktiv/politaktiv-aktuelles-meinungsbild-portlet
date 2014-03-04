/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.politaktiv.meinungsbild.infrastructure.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.politaktiv.meinungsbild.infrastructure.model.Rating;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Rating in entity cache.
 *
 * @author politaktiv
 * @see Rating
 * @generated
 */
public class RatingCacheModel implements CacheModel<Rating>, Externalizable {
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

	@Override
	public Rating toEntityModel() {
		RatingImpl ratingImpl = new RatingImpl();

		ratingImpl.setRatingId(ratingId);
		ratingImpl.setUserId(userId);
		ratingImpl.setSubtopicId(subtopicId);
		ratingImpl.setScore(score);

		ratingImpl.resetOriginalValues();

		return ratingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ratingId = objectInput.readLong();
		userId = objectInput.readLong();
		subtopicId = objectInput.readLong();
		score = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ratingId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(subtopicId);
		objectOutput.writeInt(score);
	}

	public long ratingId;
	public long userId;
	public long subtopicId;
	public int score;
}