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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.politaktiv.meinungsbild.infrastructure.model.Topic;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Topic in entity cache.
 *
 * @author politaktiv
 * @see Topic
 * @generated
 */
public class TopicCacheModel implements CacheModel<Topic>, Externalizable {
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

	@Override
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

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		topicId = objectInput.readLong();
		name = objectInput.readUTF();
		communityId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(topicId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(communityId);
	}

	public long topicId;
	public String name;
	public long communityId;
}