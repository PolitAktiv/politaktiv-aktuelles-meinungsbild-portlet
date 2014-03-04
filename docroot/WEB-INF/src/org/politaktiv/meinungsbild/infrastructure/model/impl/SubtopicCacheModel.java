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

import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Subtopic in entity cache.
 *
 * @author politaktiv
 * @see Subtopic
 * @generated
 */
public class SubtopicCacheModel implements CacheModel<Subtopic>, Externalizable {
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

	@Override
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

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		subtopicId = objectInput.readLong();
		name = objectInput.readUTF();
		url = objectInput.readUTF();
		parentTopic = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(subtopicId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		objectOutput.writeLong(parentTopic);
	}

	public long subtopicId;
	public String name;
	public String url;
	public long parentTopic;
}