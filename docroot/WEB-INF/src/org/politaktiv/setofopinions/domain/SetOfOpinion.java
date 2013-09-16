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

import java.util.List;

import org.politaktiv.meinungsbild.application.MeinungsbildRepository;

import com.liferay.portal.kernel.exception.SystemException;

import org.politaktiv.meinungsbild.infrastructure.model.Subtopic;
import org.politaktiv.meinungsbild.infrastructure.model.Topic;

public class SetOfOpinion {
	
	private List<Topic> topicList;
	private int numberOfMaximumScoresByUser;
	private int numberOfMaximumScoreBySubtopic;
	private MeinungsbildRepository repository = new MeinungsbildRepository();
	
	public SetOfOpinion(){
		this(null,0,3);
	}
	
	public SetOfOpinion(List<Topic> topicList, int numberOfMaxmimumScoresByUser, int numberOfMaximumScoreBySubtopic) {
		super();
		this.topicList = topicList;
		this.numberOfMaximumScoresByUser = numberOfMaxmimumScoresByUser;
		this.numberOfMaximumScoreBySubtopic = numberOfMaximumScoreBySubtopic;
	}

	public final int getNumberOfMaximumScoresByUser(){
		return this.numberOfMaximumScoresByUser;
	}
	
	public final void setNumberOfMaximumScoresByUser(int number){
		this.numberOfMaximumScoresByUser = number;
	}
	
	public final int getNumberOfMaximumScoreBySubtopic(){
		return this.numberOfMaximumScoreBySubtopic;
	}
	
	public final void setNumberOfMaximumScoreBySubtopic(int number){
		this.numberOfMaximumScoreBySubtopic = number;
	}


	public final List<Topic> getTopicList() {
		return this.topicList;
	}

	public final void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}
	
	public boolean validateMaxValues(){
				// 0 < number of maximum score by subtopic < 7
		return (this.numberOfMaximumScoreBySubtopic > 0 && this.numberOfMaximumScoreBySubtopic < 7)
					//user can give one or more scores
				&& (this.numberOfMaximumScoresByUser > 0);


	}
	
	public int getSumOfUserRatings() throws SystemException{
	int returnSumUserRatingByCommunity = 0;
		
		//only if number of topics in community is not empty
		if(!this.topicList.isEmpty()){
			
			//sum from every topic
			for(Topic topic: topicList){
				
				//the subtopics
				for(Subtopic subtopic: topic.getSubtopics()){
					returnSumUserRatingByCommunity += subtopic.getCurentUserScore();
				}
			}
			
		}
		
		return returnSumUserRatingByCommunity;
	}
	
	public int getUserRatingForSubtopicId(long subtopicId){
	int subTopicRating = 0;
		
		//only if number of topics in community is not empty
		if(!this.topicList.isEmpty()){
			
			//sum from every topic
			for(Topic topic: topicList){
				
				//the subtopics
				for(Subtopic subtopic: topic.getSubtopics()){
					if(subtopic.getSubtopicId() == subtopicId){
						subTopicRating = subtopic.getCurentUserScore();
					}
				}
			}
			
		}
		
		return subTopicRating;
		
	}

}
