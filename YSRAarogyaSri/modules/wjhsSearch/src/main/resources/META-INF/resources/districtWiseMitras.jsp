 <%@page import="org.json.JSONArray"%>
<%@page import="com.kpmg.wjhsSearch.util.DataGridDisplayManageUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Order"%>
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
 <%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
 <%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
 <%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletURL"%>
 <%@ include file="/init.jsp" %>
  <style>

.lfr-tooltip-scope{disaply:none;}
 .alert-dismissible{disaply:none;}
.alert-danger{disaply:none;}
</style>
 <% 
 String stateId = ParamUtil.getString(request, "recordId");
 System.out.println("stateId>>>"+stateId);
JSONArray districts_List=DataGridDisplayManageUtil.getDistrictAsrimMitrasCount(stateId);
System.out.print("districts_List"+districts_List.toString());
 
%>
<div class="ysri_section">
	<section class="blue_section">
	  <div class="container search_panel">
		  <h3>Aarogyasri / District Wise - Empanelled Hospitals</h3><br>
		  <div class="row">
		  
		  <% try{ 
			   
			  for(int i=0;i<districts_List.length();i++){
		    	 	org.json.JSONArray data=new org.json.JSONArray(districts_List.get(i).toString());
		           String districtName=data.getString(0);
		    	   long mitrasCount=data.getLong(2);
		 		   String districtId=data.getString(1);
		 	  
		  %>
		  <portlet:renderURL var="viewMitraDetailsURL">
			<portlet:param name="mvcPath" value="/mitrasList.jsp"/> 
			<portlet:param name="districtId" value="<%= districtName %>"/> 
		</portlet:renderURL>
		      <div class="col-lg-3">
			  	<div class="card">
				  <div class="card-body">
					<h5 class="card-title"><%=districtName %></h5>
					<%-- <a style="cursor: pointer;" onClick="viewRecords('<%=districtName %>');" class="card-link"><%=String.valueOf(mitrasCount) %> </a> --%>
					<a href="<%=viewMitraDetailsURL %>" style="cursor: pointer;" class="card-link"><%=String.valueOf(mitrasCount) %> </a>
				  </div>
				</div>
			  </div>
			  <%  } }catch(Exception e){e.printStackTrace();} %>
		 </div>
	</section>  <!-- services_section -->
	   </div>
	</div><!--ysri_section-->	
<script>
function viewRecords(recordId){
	$('#<portlet:namespace />viewRecords').find('input[name=<portlet:namespace />districtId]').val(recordId);
	$("#<portlet:namespace />viewRecords").submit();
}
</script>
		<portlet:renderURL var="viewRecordsURL">
			<portlet:param name="mvcPath" value="/mitrasList.jsp"/> 
		</portlet:renderURL> 
<aui:form name="viewRecords" method="post" action="<%=viewRecordsURL %>" style="display:none;">
   <aui:input type="text" name="districtId" value=""></aui:input>
</aui:form>  
 