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

package org.politaktiv.meinungsbild.infrastructure.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Topic service. Represents a row in the &quot;meinungsbild_Topic&quot; database table, with each column mapped to a property of this class.
 *
 * @author politaktiv
 * @see TopicModel
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.TopicImpl
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.TopicModelImpl
 * @generated
 */
public interface Topic extends TopicModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link org.politaktiv.meinungsbild.infrastructure.model.impl.TopicImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> getSubtopics();

	public boolean validate();

	public int getTotalTopicScore();

	public void setSubtopics(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Subtopic> subtopics);
}