<%@page import="com.kpmg.wjhsSearch.util.DataGridDisplayManageUtil"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%> 
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
 <portlet:renderURL var="viewDistrictRecordsURL">
			<portlet:param name="mvcPath" value="/districtWiseHospitals.jsp"/> 
		</portlet:renderURL> 
 
<%
org.json.JSONArray states_List=DataGridDisplayManageUtil.getStateLevelAsrimHospCount();

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
	  
	  
		  <h3> <%if(pId==499){ %> WJHS <% }else if(pId==491){ %>EHS <% } %>  State Empanelled Hospitals</h3><br>
		  <div class="row">
		      
		      <% 
		      List<String> statesList = new ArrayList<String>();
 		      statesList.add("AndhraPradesh");
		      statesList.add("Telangana");
		      statesList.add("Karnataka");
		      statesList.add("Chennai");
 		       
	        for(int i=0;i<statesList.size();i++){ 
	    		// System.out.println("statesList.get(i)>>>"+statesList.get(i));
	    		for(int j=0;j<states_List.length();j++){
	    		org.json.JSONArray data=new org.json.JSONArray(states_List.get(j).toString()); 
 	    	   
	    	   String stateId=data.getString(1);
	    	   String stateName=data.getString(0);
	    	   long govtHospitalCount=data.getLong(2);
	 		   long privateHospitalCount=data.getLong(3);
	 		//   System.out.println("stateName>>>"+stateName);
	 		   if(stateName.trim().equalsIgnoreCase(statesList.get(i))){
	 		   if(stateName.equalsIgnoreCase("Chennai")){
	 			  stateName="Tamilnadu";
	 		   }
	 		   
	    	   %>
	    	   
		<portlet:renderURL var="viewDistrictsURL">
			<portlet:param name="mvcPath" value="/districtWiseHospitals.jsp"/>
			<portlet:param name="recordId" value="<%= String.valueOf(stateId) %>"/> 
		</portlet:renderURL>
		      <div class="col-lg-6">
			  	<div class="card">
				  <div class="card-body">
					<h5 class="card-title"><%=stateName %></h5>
					<% if(govtHospitalCount>0 || privateHospitalCount>0){ %>
					    <a href="<%=viewDistrictsURL %>" style="cursor: pointer;background-color: #fff;text-decoration: none;color: #000;"  class=""> 
					             <div class="card-link"> Government - <%=govtHospitalCount %>
					             <br>Private - <%=privateHospitalCount %></div>
					     </a>
					<% }else { %> <div><p>Government - <%=govtHospitalCount %></p>
					<p>Private - <%=privateHospitalCount %></p></div> <% } %>
				</div>
				</div>
			  </div>
			  
			  <%  } } } %>
		  </div>
		   
	</section>  	
<script>
function viewRecords(recordId){
	$('#<portlet:namespace />viewRecords').find('input[name=<portlet:namespace />recordId]').val(recordId);
	$("#<portlet:namespace />viewRecords").submit();
} 
</script>
		
<aui:form name="viewRecords" method="post" action="<%=viewDistrictRecordsURL %>" style="display:none;">
   <aui:input type="text" name="recordId" value=""></aui:input>
</aui:form>
	
		
	</div><!--ysri_section-->	  
    