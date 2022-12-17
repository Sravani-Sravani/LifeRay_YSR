<%@page import="com.kpmg.asrimSearch.util.DataGridDisplayManageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
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
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId1=themeDisplay.getPlid();
%>
<%
org.json.JSONArray states_List=null;
String pageTitle="";
if(pageId1==513){
	pageTitle="Aarogyasri ";
}
else if(pageId1==507){
	pageTitle="Arogya Raksha ";
}
else if(pageId1==499){
	pageTitle="WJHS ";
}
else if(pageId1==491){
	pageTitle="EHS ";
}
try{
	// if(pId==513 || pId==507 || pId==499 || pId==491){
	    states_List=DataGridDisplayManageUtil.getStateLevelAsrimHospCount(pageId1);
	// }
}
catch(Exception e){
e.getMessage();	
}

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
		  <h3><%=pageTitle %> State Empanelled Hospitals</h3><br>
		  <div class="row">
		      
		      <% 
		      List<String> statesList = new ArrayList<String>();
 		      statesList.add("ANDHRA PRADESH");
		      statesList.add("TELANGANA");
		      statesList.add("KARNATAKA");
		      statesList.add("TAMIL NADU");
 		       
	        for(int i=0;i<statesList.size();i++){
	    		/// System.out.println("statesList.get(i)>>>"+statesList.get(i));
	    		for(int j=0;j<states_List.length();j++){
	    		org.json.JSONArray data=new org.json.JSONArray(states_List.get(j).toString()); 
 	    	   
	    	   String stateId=data.getString(1);
	    	   String stateName=data.getString(0);
	    	   
	    	   if(pageId1==499 || pageId1==491){
	    		     stateId=data.getString(0);
		    	     stateName=data.getString(1);
	    	   }
	    	   long govtHospitalCount=data.getLong(2);
	 		   long privateHospitalCount=data.getLong(3);
	 		  // System.out.println("stateName>>>"+stateName);
	 		   if(stateName.trim().equalsIgnoreCase(statesList.get(i))){
	 		 //  if(stateName.equalsIgnoreCase("Chennai")){
	 			//  stateName="Tamilnadu";
	 		  // }
	 		   
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
    