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
 * The extended model interface for the Subtopic service. Represents a row in the &quot;meinungsbild_Subtopic&quot; database table, with each column mapped to a property of this class.
 *
 * @author politaktiv
 * @see SubtopicModel
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicImpl
 * @see org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicModelImpl
 * @generated
 */
public interface Subtopic extends SubtopicModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link org.politaktiv.meinungsbild.infrastructure.model.impl.SubtopicImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Checks: does parent topic exists && is name valid && URL is valid URL
	*
	* @return if subtopic is valid
	*/
	public void setRatingList(
		java.util.List<org.politaktiv.meinungsbild.infrastructure.model.Rating> ratingList);

	public boolean validate();

	public int getCurentUserScore();

	public void setCurrentUserScore(int score);

	public int getFullCommunityScore();

	public void setFullCommunityScore(int score);
}