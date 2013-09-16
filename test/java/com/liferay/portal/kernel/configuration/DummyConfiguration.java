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

package com.liferay.portal.kernel.configuration;

import java.util.Properties;

public class DummyConfiguration implements Configuration {

	@Override
	public void addProperties(Properties properties) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearCache() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(String key, Filter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getArray(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getArray(String key, Filter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getProperties(String prefix, boolean removePrefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeProperties(Properties properties) {
		// TODO Auto-generated method stub

	}

	@Override
	public void set(String key, String value) {
		// TODO Auto-generated method stub

	}

}
