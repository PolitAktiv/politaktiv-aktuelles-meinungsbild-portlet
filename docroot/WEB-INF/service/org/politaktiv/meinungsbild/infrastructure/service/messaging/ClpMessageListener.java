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
 * @author politaktiv
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