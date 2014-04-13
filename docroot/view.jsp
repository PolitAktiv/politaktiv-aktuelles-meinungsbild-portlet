<%
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
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %> 
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.service.permission.PortletPermissionUtil" %>
<%@ page import="com.liferay.portal.service.GroupLocalServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="org.politaktiv.meinungsbild.infrastructure.model.Topic" %>
<%@ page import="org.politaktiv.meinungsbild.infrastructure.model.Subtopic" %>
<%@ page import="org.politaktiv.setofopinions.domain.SetOfOpinion" %>

<!-- Internationalisation stuff -->
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>

<liferay-ui:error message="you-dont-have-permission" key="noPermission" /> 
<liferay-ui:error message="only-characters-numbers-and-spaces-allowed-in-topicname" key="topicNameNotValide" />
<liferay-ui:error message="a-very-big-error-appeared-please-try-again-later" key="veryBigError" />
<liferay-ui:error message="indended-user-action-dont-do-this-again-please" key="indendedUserAction" />
<liferay-ui:error message="only-characters-are-allowed-in-name-only-please-only-real-urls" key="subtopicInputNotValide" />
<liferay-ui:error message="the-input-of-maximum-value-is-not-correct-please-bigger-0-per-user-and-use-dropdown-menu-in-subtopic" key="maximumsInputNotValid" />
<%
SetOfOpinion setOfOpinion = (SetOfOpinion) request.getAttribute("setOfOpinion");
List<Topic> topicList = setOfOpinion.getTopicList();
%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL name="doSaveMaximumRatings" var="doSaveMaximumRatingsURL" />
<portlet:actionURL name="doAddTopic" var="doAddTopicURL" />
<portlet:actionURL name="doDeleteTopic" var="doDeleteTopicURL" />
<portlet:actionURL name="doAddSubtopic" var="doAddSubtopicURL" />
<portlet:actionURL name="doMoveSubtopic" var="doMoveSubtopicURL" />
<portlet:actionURL name="doDeleteSubtopic" var="doDeleteSubtopicURL" />

<%
String doSaveMaximumRatingsURLString = doSaveMaximumRatingsURL.toString();
String doAddTopicURLString = doAddTopicURL.toString();
String doDeleteTopicURLString = doDeleteTopicURL.toString();
String doAddSubtopicURLString = doAddSubtopicURL.toString();
String doMoveSubtopicURLString = doMoveSubtopicURL.toString();
String doDeleteSubtopicURLString = doDeleteSubtopicURL.toString();

boolean permission_to_add_topic = permissionChecker.hasPermission(layout.getGroupId(), "com.PA.meinungsbild.infrastructure.model.Topic", layout.getGroupId(), "ADD");
boolean permission_to_delete_topic = permissionChecker.hasPermission(layout.getGroupId(), "com.PA.meinungsbild.infrastructure.model.Topic", layout.getGroupId(), "DELETE");
boolean permission_to_add_subtopic = permissionChecker.hasPermission(layout.getGroupId(), "com.PA.meinungsbild.infrastructure.model.Subtopic", layout.getGroupId(), "ADD");
boolean permission_to_delete_subtopic = permissionChecker.hasPermission(layout.getGroupId(), "com.PA.meinungsbild.infrastructure.model.Subtopic", layout.getGroupId(), "DELETE");
boolean permission_to_move_subtopic_to_other_topic = permissionChecker.hasPermission(layout.getGroupId(), "com.PA.meinungsbild.infrastructure.model.Subtopic", layout.getGroupId(), "MOVE_TO_OTHER_TOPIC");

boolean user_has_minimum_one_permission = permission_to_add_topic ||
										permission_to_delete_topic ||
										permission_to_add_subtopic ||
										permission_to_delete_subtopic ||
										permission_to_move_subtopic_to_other_topic ;

// in liferay 6.1, is this instead:
//UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, RoleConstants.SITE_MEMBER)
boolean user_is_community_member = GroupLocalServiceUtil.hasUserGroup(themeDisplay.getUserId(), themeDisplay.getLayout().getGroupId());
%>

<aui:script>
	function refreshPortlet(){
		Liferay.Portlet.refresh('#p_p_id<portlet:namespace />');
	}
</aui:script>
 	
		
<% if(user_has_minimum_one_permission){ %>
	<liferay-ui:toggle-area id="toggle_moderator_controls" hideMessage='<%= LanguageUtil.get(pageContext,"hide-moderator-controls") %>'
		showMessage='<%= LanguageUtil.get(pageContext,"show-moderator-controls") %>'
		defaultShowContent="false" align="bottom">

	<aui:form name="fm" action="<%= doSaveMaximumRatingsURLString %>" method="post">
						<aui:input value="<%= setOfOpinion.getNumberOfMaximumScoresByUser() %>" type="number" id="maximum_rating_per_user" name="maximumRatingPerUserFormInput" label="Maximum Bewertungen pro Bürger (Richtwert: Wurzel der Themenanzahl, Wichtig: größer 0)" />
						<aui:select name="maximumOfRatingPerSubtopicFormInput" label="Maximale Bewertung pro Unterthema pro Bürger">
						<% for(int i = 1; i<= 6; i++){ %>
							<aui:option value="<%= i %>" selected="<%= (i == setOfOpinion.getNumberOfMaximumScoreBySubtopic()) %>"> 
								<%= i %>
							</aui:option>
						<% } %>
						</aui:select>
						
						<aui:button type="submit" id="save_maximum_ratings" value="Speichern"/>
	</aui:form> 	


	<table class="moderation-table">
		<head>
			<tr>
				<% if(permission_to_add_topic){ %>
					<td>
						Neues Thema
					</td>
				<% } %>
				<% if(permission_to_delete_topic) {%>
					<td>
						Thema löschen
					</td>
				<% } %>
				<% if(permission_to_add_subtopic) {%>
					<td>
						Neues Unterthema
					</td>
				<% } %>
				<% if(permission_to_move_subtopic_to_other_topic) { %>
					<td>
						Unterthema verschieben
					</td>
				<% } %>
				<% if(permission_to_delete_subtopic)  {%>
					<td>
						Unterthema löschen
					</td>
				<% } %>
				
			</tr>
		</head>
		
		<body>
		
			<tr>
				<% if(permission_to_add_topic) { %>
					<td>
						<aui:form name="fm" action="<%= doAddTopicURLString %>" method="post">
							<aui:input type="text" id="topic_name" name="topicNameAddFormInput" label="Name"/>
							<aui:button type="submit" id="add_topic" value="Hinzufügen"/>
						</aui:form> 
					</td>
				<% } %>
				<% if(permission_to_delete_topic) { %>
					<td>
						<aui:form name="fm" action="<%= doDeleteTopicURLString %>" method="post">
							<aui:select name="topicIdRemoveFormInput" label="Thema:">
							<% for(Topic topic: topicList){ %>
								<aui:option value="<%= topic.getTopicId() %>">
									<%= topic.getName() %>
								</aui:option>
							<% } %>
							</aui:select>
							<aui:button type="submit" id="remove_topic" value="Entfernen"/>
						</aui:form>
					</td>
				<% } %>
				<% if(permission_to_add_subtopic) { %>
				<td>
					<aui:form name="fm" action="<%= doAddSubtopicURLString %>" method="post">
						<aui:input type="text" id="subtopic_name" name="subtopicNameAddFormInput" label="Name"/>
						<aui:input type="text" id="subtopic_url" name="subtopicUrlAddFormInput" label="URL zum Beitrag"/>
						<aui:select name="topicIdToAddSubtopicFormInput" label="Für Thema:">
						<% for(Topic topic: topicList){ %>
							<aui:option value="<%= topic.getTopicId() %>">
								<%= topic.getName() %>
							</aui:option>
						<% } %>
						</aui:select>
						<aui:button type="submit" id="add_subtopic" value="Hinzufügen"/>
					</aui:form>
				</td>
				<% } %>
				<% if(permission_to_move_subtopic_to_other_topic) { %>
					<td>
						<aui:form name="fm" action="<%= doMoveSubtopicURLString %>" method="post">
							<aui:select name="subtopicIdMoveFormInput" label="Unterthema:">
							<% for( Topic topic: topicList){ 
									for( Subtopic subtopic : topic.getSubtopics()) {%>
										<aui:option value="<%= subtopic.getSubtopicId() %>">
											<%= subtopic.getName() %>
										</aui:option>
									<% } %>
							<%	} %>
							</aui:select>	
							nach
							<aui:select name="topicIdToMoveFormInput" label="Thema">
							<% for( Topic topic: topicList){ %>
								<aui:option value="<%= topic.getTopicId() %>">
									<%= topic.getName() %>
								</aui:option>
							<% } %>
							
							</aui:select>
							<aui:button type="submit" id="move_topic" value="Verschieben"/>
						</aui:form>
					</td>		
				<% } %>
				<% if(permission_to_delete_subtopic) {%>		
					<td>
						<aui:form name="fm" action="<%= doDeleteSubtopicURLString %>" method="post">
							<aui:select name="subtopicIdRemoveFormInput" label="Unterthema:">
							<% for( Topic topic: topicList){ 
									for( Subtopic subtopic : topic.getSubtopics()) {%>
								<aui:option value="<%= subtopic.getSubtopicId() %>">
									<%= subtopic.getName() %>
								</aui:option>
							<% 		}
								} %>
							</aui:select>
							<aui:button type="submit" id="remove_topic" value="Entfernen"/>
						</aui:form>
					</td>
				<% } %>
			</tr>
		</body>
	</table>

</liferay-ui:toggle-area>

<% } %>


	<% //TODO hier nach communityzugehörigkeit fragen %>
	<% if(user_is_community_member) {%>
	<liferay-ui:message key="you-have-given-x-from-y-points-you-can-give-a-maximum-of-z"
	arguments="<%= new String[] {String.valueOf(setOfOpinion.getSumOfUserRatings()),String.valueOf(setOfOpinion.getNumberOfMaximumScoresByUser()), String.valueOf(setOfOpinion.getNumberOfMaximumScoreBySubtopic())} %>"
	/> <br />
		<aui:button onclick="refreshPortlet()" value="update-full-sum"/>
	<% } %>
	<div id="markupBoundingBox">
    	<ul id="meinungsbild_topic_ul">
    		<aui:form>
    		
    		<% for( Topic topic: topicList){ %>
    		<div class="topic_frame">
    		<input class="subtopic_expand_selector" type="checkbox" id="<%= "expand" + topic.getTopicId() %>"/> 
    		<label class="tree_expand_selector" for="<%= "expand" + topic.getTopicId() %>">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    		<b><%= topic.getName() %></b> &nbsp;&nbsp; <liferay-ui:message key="points" />:	<b><%= topic.getTotalTopicScore() %> </b>
    		
    			<% for(Subtopic subtopic : topic.getSubtopics()){ %>
<!--     			generate Links für javascript ajax call -->
    			<% String sendMinusCall = "sendEvent(" + subtopic.getSubtopicId() + ",'minusPress')" ;%>
    			<% String sendPlusCall = "sendEvent(" + subtopic.getSubtopicId() + ",'plusPress')"; %>
	    		<ul class="subtopic_expandable" id="meinungsbild_subtopic_lu">
	    			<li>
	    			<%if(!subtopic.getUrl().isEmpty()){ %>
	    				<a href="<%= subtopic.getUrl()%>" target="_blank"> <%= subtopic.getName() %> </a>
	    			<% } else { %>
	    				<%= subtopic.getName() %>
	    			<% } %>
	    		<aui:fieldset>	
	    		
<!-- 	    			show user score  and rating only if user is signed in -->
	    			<% if(user_is_community_member){ %>
		    			<aui:column>
		    					<liferay-ui:message key="yours" />:
		    			</aui:column>
			    		<aui:column>
			    		<% String user_rate_subtopicId = "user_rate_" + subtopic.getSubtopicId(); %>
			    				<b id='<portlet:namespace/><%= user_rate_subtopicId %>' > <%= subtopic.getCurentUserScore() %> </b>
			    		</aui:column>
			    		
			    		<aui:column>
			    				<aui:button id="meinungsbild_rate_button" name="thema" type="button" value="-" onclick="<%= sendMinusCall %>" />
			    				<aui:button id="meinungsbild_rate_button" name="thema" type="button" value="+" onclick="<%= sendPlusCall %>" />
			    		</aui:column>
			    		
		    		<% } %>
		    		<aui:column>
		    				<label><liferay-ui:message key="total" />:</label>
		    		</aui:column>
		    		<aui:column>
		    				<b><%= subtopic.getFullCommunityScore() %> </b>
		    		</aui:column>
		    	</aui:fieldset>
	    			</li>
	    		</ul>
	    		<% } %>
	    	</div>
	    	<% } %>
	    	
    		

    		</aui:form>
    	</ul>
    </div>
    	
    	
    	
    	
    	
    	<portlet:resourceURL  var="eventHandlerURL">
		</portlet:resourceURL>
    	
    	<aui:script>
            function sendEvent(subtopicId,action) { 

                AUI().use('aui-io-request-depricated', function(A) {
                    A.io.request('<%= eventHandlerURL %>', {
                        method: 'POST',
                        dataType: 'JSON', 
                        data: {
                            <portlet:namespace/>subtopicId: subtopicId,
                            <portlet:namespace/>action: action
                        },
                        on: { 
                            success: function() {
                                var result = this.get('responseData');
                                if(result == "error"){
                               		 alert("Fehleingabe oder maximimale Anzahl vergeben");
                                } else if(result == "no_permission") {
                                	 alert("Sie haben keine Berechtigung zu Bewerten")
                               	} else {
                               			document.getElementById("<portlet:namespace />user_rate_"+subtopicId).innerHTML = result;
                               	}
                                
                            }
                        }
                    });
                });
              }


			
         </aui:script>

        