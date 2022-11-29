
 
<% 
 PortletURL iteratorNewURL = renderResponse.createRenderURL(); 
 iteratorNewURL.setParameter("mvcPath", "/view.jsp");

 org.json.JSONArray states_List=DataGridDisplayManageUtil.getStateLevelAsrimMitrasCount();
 System.out.print("states_List"+states_List.toString());


%>
<style>
.lfr-tooltip-scope{disaply:none;}
 .alert-dismissible{disaply:none;}
.alert-danger{disaply:none;}
</style>
<div class="ysri_section">		
<section class="blue_section search_panel">
	  <div class="container">
 
		  <h3><%if(pId==501){ %> WJHS <% }else if(pId==521){ %>EHS <% } %> / Search State Mitra Information</h3><br>
 
		  <div class="row">
		      
		      <% 
		      List<String> statesList = new ArrayList<String>();
		      //List<String> statesList = new List<String>();
		      statesList.add("Andhra Pradesh");
		      statesList.add("Telagana");
		      statesList.add("Karnataka");
		      statesList.add("Tamilnadu");
		 	  
		        for(int i=0;i<statesList.size();i++){
		        	 System.out.println("statesList.get(i)>>>"+statesList.get(i));
		        	for(int j=0;j<states_List.length();j++){
		        	org.json.JSONArray data=new org.json.JSONArray(states_List.get(j).toString());
		    	   long stateId=data.getLong(2);
		    	   String stateName=data.getString(0).toString();
		    	   long mitrasCount=data.getLong(1);
		    	   System.out.println("stateName>>>"+stateName);
		    	if(stateName.trim().equalsIgnoreCase(statesList.get(i))){
		    		stateName=statesList.get(i);
		    		
	    	   %>
	    	    <portlet:renderURL var="viewMitraDistrictsURL">
			<portlet:param name="mvcPath" value="/districtWiseMitras.jsp"/> 
			<portlet:param name="recordId" value="<%=String.valueOf(stateId) %>"/> 
		</portlet:renderURL>
		      <div class="col-lg-6">
			  	<div class="card">
				  <div class="card-body">
					<h5 class="card-title"><%=stateName %></h5>
					<% if(mitrasCount>0){ %>
					   <%--  <a style="cursor: pointer;" onClick="viewRecords('<%=stateId %>');" class="card-link"> 
					               <%=mitrasCount %></a> --%>
					                <a href="<%=viewMitraDistrictsURL %>" style="cursor: pointer;" class="card-link"> 
					               <%=mitrasCount %></a>
					<% }else { %>  <%=mitrasCount %> <% } %>
					 
				  </div>
				</div>
			  </div>
			  <% } } } %>
			  
		  </div> 
	</section>  <!-- services_section -->

	
<script>
function viewRecords(recordId){
	$('#<portlet:namespace />viewRecords').find('input[name=<portlet:namespace />recordId]').val(recordId);
	$("#<portlet:namespace />viewRecords").submit();
} 
</script>
<%-- 		
<aui:form name="viewRecords" method="post" action="<%=viewMitraDistrictRecordsURL %>" style="display:none;">
   <aui:input type="text" name="recordId" value=""></aui:input>
</aui:form>
	 --%>
		
	</div><!--ysri_section-->	  
    