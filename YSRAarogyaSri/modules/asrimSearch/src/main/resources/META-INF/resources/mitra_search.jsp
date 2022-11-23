<%@page import="com.kpmg.asrimSearch.util.DataGridDisplayManageUtil"%> 
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%> 
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%> 
<%@page import="java.util.LinkedHashMap"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Order"%> 
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
 <%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletURL"%>
 <%@ include file="/init.jsp" %>
 <portlet:renderURL var="viewMitraDistrictRecordsURL">
			<portlet:param name="mvcPath" value="/districtWiseMitras.jsp"/> 
		</portlet:renderURL> 
 
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
		  <h3>Aarogyasri / Search State Mitra Information</h3><br>
		  <div class="row">
		      
		      <% 
		      List<String> statesList = new ArrayList<String>();
		      //List<String> statesList = new List<String>();
		      statesList.add("Andhra Pradesh");
		      statesList.add("Telagana");
		      statesList.add("Karnataka");
		      statesList.add("Tamilnadu");
		 
		     // List<AsrimLocations> asrimDistrictsList=null;	  
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
		  <br>
		  <br>
		  <br>
		  <br>
		  <br>
		  
	</section>  <!-- services_section -->

	
<script>
function viewRecords(recordId){
	$('#<portlet:namespace />viewRecords').find('input[name=<portlet:namespace />recordId]').val(recordId);
	$("#<portlet:namespace />viewRecords").submit();
} 
</script>
		
<aui:form name="viewRecords" method="post" action="<%=viewMitraDistrictRecordsURL %>" style="display:none;">
   <aui:input type="text" name="recordId" value=""></aui:input>
</aui:form>
	
		
	</div><!--ysri_section-->	  
    