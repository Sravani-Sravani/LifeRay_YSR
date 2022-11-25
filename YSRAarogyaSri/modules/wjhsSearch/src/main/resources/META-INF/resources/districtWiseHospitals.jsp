 <%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.kpmg.wjhsSearch.util.DataGridDisplayManageUtil"%>
<%@page import="org.json.JSONArray"%> 
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
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pId=themeDisplay.getPlid();
%>
 <%
 String stateId = ParamUtil.getString(request, "recordId");
 System.out.println("stateId>>>"+stateId);
JSONArray districts_List=DataGridDisplayManageUtil.getDistrictAsrimHospCount(stateId);
System.out.print("districts_List"+districts_List.toString());
%>
<div class="ysri_section">
	<section class="blue_section">
	  <div class="container search_panel">
		  <h3> <%if(pId==499 || pId==501|| pId==503 || pId==505){ %> WJHS <% }else if(pId==491 || pId==497 || pId==495 || pId==521){ %>EHS <% } %>  / District Wise - Empanelled Hospitals</h3><br>
		  <div class="row">
		  
		  <%  try{ 
			   
			  for(int i=0;i<districts_List.length();i++){
		    	 	org.json.JSONArray data=new org.json.JSONArray(districts_List.get(i).toString());
		   
		    	 String districtId="";	
		    	 	String districtName=data.getString(0);
		    	   long govtHospitalCount=data.getLong(1);
		 		   long privateHospitalCount=data.getLong(2); 
		  %>
		  <portlet:renderURL var="viewGovtHospitalsURL">
			<portlet:param name="mvcPath" value="/hospitalsList.jsp"/>
			<portlet:param name="districtId" value="<%=districtName %>"/> 
			<portlet:param name="HOSP_TYPE" value="Government"/> 
			<portlet:param name="stateId" value="<%= stateId %>"/> 
		</portlet:renderURL>
		 <portlet:renderURL var="viewPrivateHospitalsURL">
			<portlet:param name="mvcPath" value="/hospitalsList.jsp"/>
			<portlet:param name="districtId" value="<%=districtName %>"/> 
			<portlet:param name="HOSP_TYPE" value="Private"/> 
			<portlet:param name="stateId" value="<%= stateId %>"/> 
		</portlet:renderURL>
		      <div class="col-lg-3">
			  	<div class="card">
				  <div class="card-body">
					<h5 class="card-title"><%=districtName %></h5>
					<%-- <a style="cursor: pointer;" onClick="viewRecords('<%=districtName %>','Government');" class="card-link">Government - <%=String.valueOf(govtHospitalCount) %> </a>
					<a style="cursor: pointer;" onClick="viewRecords('<%=districtName %>','Private');" class="card-link">Private - <%=String.valueOf(privateHospitalCount) %></a>
				  --%> 
				  <a href="<%=viewGovtHospitalsURL %>" style="cursor: pointer;"  class="card-link">Government - <%=String.valueOf(govtHospitalCount) %> </a>
				<a href="<%=viewPrivateHospitalsURL %>" style="cursor: pointer;" class="card-link">Private - <%=String.valueOf(privateHospitalCount) %></a>
				 
				  </div>
				</div>
			  </div>
			  <%  } }catch(Exception e){e.printStackTrace();} %>
		 </div>
	</section>  <!-- services_section -->
	   </div>
	</div><!--ysri_section-->	
<script>
function viewRecords(recordId,HOSP_TYPE){
	$('#<portlet:namespace />viewRecords').find('input[name=<portlet:namespace />districtId]').val(recordId);
	$('#<portlet:namespace />viewRecords').find('input[name=<portlet:namespace />HOSP_TYPE]').val(HOSP_TYPE);
	$("#<portlet:namespace />viewRecords").submit();
}
</script>
		<portlet:renderURL var="viewRecordsURL">
			<portlet:param name="mvcPath" value="/hospitalsList.jsp"/> 
		</portlet:renderURL> 
<aui:form name="viewRecords" method="post" action="<%=viewRecordsURL %>" style="display:none;">
   <aui:input type="text" name="districtId" value=""></aui:input>
   <aui:input type="text" name="HOSP_TYPE" value=""></aui:input>
   <aui:input type="text" name="stateId" value="<%=stateId %>"></aui:input>
</aui:form>  
 