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

package org.politaktiv.setofopinions.domain;

import junit.framework.TestCase;

import org.junit.Test;
import org.politaktiv.meinungsbild.infrastructure.model.impl.TopicImpl;

import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.configuration.DummyConfigurationFactory;

public class TopicTest extends TestCase {

	@Test
	public void test() {
		ConfigurationFactoryUtil.setConfigurationFactory(new DummyConfigurationFactory());
		TopicImpl t = new TopicImpl();
		t.setName("Das ist ein töller Teßt");
		assertTrue(t.validate());
		t.setName("Das ist ein plöder' Test");
		assertFalse(t.validate());
	}
}
