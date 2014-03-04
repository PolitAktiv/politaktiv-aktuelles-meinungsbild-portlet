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

package org.politaktiv.meinungsbild.infrastructure.service.base;

import org.politaktiv.meinungsbild.infrastructure.service.SubtopicServiceUtil;

import java.util.Arrays;

/**
 * @author politaktiv
 * @generated
 */
public class SubtopicServiceClpInvoker {
	public SubtopicServiceClpInvoker() {
		_methodName30 = "getBeanIdentifier";

		_methodParameterTypes30 = new String[] {  };

		_methodName31 = "setBeanIdentifier";

		_methodParameterTypes31 = new String[] { "java.lang.String" };

		_methodName36 = "addSubtopic";

		_methodParameterTypes36 = new String[] {
				"long",
				"org.politaktiv.meinungsbild.infrastructure.model.Subtopic"
			};

		_methodName37 = "deleteSubtopic";

		_methodParameterTypes37 = new String[] { "long", "long" };

		_methodName38 = "updateSubtopic";

		_methodParameterTypes38 = new String[] {
				"long",
				"org.politaktiv.meinungsbild.infrastructure.model.Subtopic"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return SubtopicServiceUtil.getBeanIdentifier();
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			SubtopicServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			return SubtopicServiceUtil.addSubtopic(((Long)arguments[0]).longValue(),
				(org.politaktiv.meinungsbild.infrastructure.model.Subtopic)arguments[1]);
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			SubtopicServiceUtil.deleteSubtopic(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			SubtopicServiceUtil.updateSubtopic(((Long)arguments[0]).longValue(),
				(org.politaktiv.meinungsbild.infrastructure.model.Subtopic)arguments[1]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName38;
	private String[] _methodParameterTypes38;
}