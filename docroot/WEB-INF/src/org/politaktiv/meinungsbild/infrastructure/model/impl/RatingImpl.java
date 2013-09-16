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
import org.politaktiv.meinungsbild.infrastructure.model.Rating;

/**
 * The model implementation for the Rating service. Represents a row in the &quot;meinungsbild_Rating&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.PA.meinungsbild.infrastructure.model.Rating} interface.
 * </p>
 *
 * <p>
 * Never reference this class directly. All methods that expect a rating model instance should use the {@link Rating} interface instead.
 * </p>
 */
public class RatingImpl extends RatingBaseImpl {
	public RatingImpl() {
	}
	
	
	//TODO: more checks
	public boolean validate(){
		
		if(this.getScore() >= 0){
			return true;
		} else {
			return false;
		}
	}
	
	public void inceaseScore(){
		this.setScore(this.getScore()+1);
	}
	
	public void decreaseScoreIfGreater0(){
		if(this.getScore() > 0){
			this.setScore(this.getScore()-1);
		}
	}

}