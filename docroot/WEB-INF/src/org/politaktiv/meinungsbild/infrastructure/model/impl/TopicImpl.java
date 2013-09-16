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

import java.util.ArrayList;
import java.util.List;

import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;
import org.politaktiv.meinungsbild.infrastructure.model.Topic;

import com.liferay.portal.kernel.util.Validator;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The model implementation for the Topic service. Represents a row in the &quot;meinungsbild_Topic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.PA.meinungsbild.infrastructure.model.Topic} interface.
 * </p>
 *
 * <p>
 * Never reference this class directly. All methods that expect a topic model instance should use the {@link Topic} interface instead.
 * </p>
 */
public class TopicImpl extends TopicBaseImpl {
	
	private static Log _log = LogFactoryUtil.getLog(org.politaktiv.meinungsbild.infrastructure.model.Topic.class);
	
	List<Subtopic> subtopics = null;
	
	public TopicImpl() {
		subtopics = new ArrayList<Subtopic>();
	}
	

	
	public List<Subtopic> getSubtopics(){
		return this.subtopics;
	}
	
	public boolean validate(){
//												 ä      ö	 ü	   Ä     Ö      Ü	 ß
		if(!this.getName().matches("[a-zA-Z0-9\u00E4\u00F6\u00FC\u00C4\u00D6\u00DC\u00DF., ]+")
			|| this.getName().length() > 75
				){
			_log.error("wrong name character or size");
			return false;
		}
		return true;
	}
	
	public int getTotalTopicScore(){
		int sumScore = 0;
		for(Subtopic subtopic: this.subtopics){
			sumScore += subtopic.getFullCommunityScore();
		}
		return sumScore;
	}
	
	public void setSubtopics(List<Subtopic> subtopics){
		
		if(subtopics != null){
			this.subtopics = subtopics;
		}
		
	}
}