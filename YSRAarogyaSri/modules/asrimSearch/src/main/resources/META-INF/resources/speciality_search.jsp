<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.kpmg.asrimSearch.util.DataGridDisplayManageUtil"%> 
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Order"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%> 
<%@page import="java.util.List"%>
 <%@ include file="/init.jsp" %>
 <%@page import="com.kpmg.asrimSearch.util.DataGridDisplayManageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
 <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId1=themeDisplay.getPlid();
%>
<style>

.lfr-tooltip-scope{disaply:none;}
 .alert-dismissible{disaply:none;}
.alert-danger{disaply:none;}
</style>
<portlet:renderURL var="viewSpecialityRecordsURL">
			<portlet:param name="mvcPath" value="/speciality_procedures.jsp"/> 
		</portlet:renderURL> 
	<div class="ysri_section">
		
	<section class="blue_section search_panel">
	<h2 class="subheading">Network Hospitals</h2> 
	<div class="row mb-2 p-2 rounded-2 shadow-lg" id="Aarogyasri_section">
 			<div class="col-lg-4"  >
				<p><a href="/web/guest/search-by-geography" class="button_blueshade"><i class="fa-solid fa-location-dot"></i> Search by Geography</a></p>
		  </div> <!--end of col-->

		  <div class="col-lg-4">
			<p><a href="/web/guest/asri_specilitysearch" class="active_button_blueshade"><i class="fa-solid fa-user-doctor"></i> Search by Speciality</a></p>

	 	  </div> <!--end of col-->

	 	<div class="col-lg-4">
			<p><a href="/web/guest/nearby-hospitals" class="button_blueshade"><i class="fa-solid fa-hospital"></i> Hospitals Near Me</a></p>
 		 </div> <!--end of col-->
	</div> 
	  <div class="container">
	  <%
	  String pageTitle="";
	  if(pageId1==513){
	  	pageTitle="Aarogyasri ";
	  }
	  else if(pageId1==507){
	  	pageTitle="Arogya Raksha ";
	  }

	  %>
		  <h3><%=pageTitle %> / Speciality Search</h3><br>
		  
		  
		  
		  <div class="row">
		      
		      <% 
	          String specialityId=null;
		      org.json.JSONArray speciality_List= DataGridDisplayManageUtil.getAsriSpecialityCount(specialityId);
		      System.out.print("speciality_List 123"+speciality_List.toString());
		  	  
		      for(int j=0;j<speciality_List.length();j++){
	        	org.json.JSONArray data=new org.json.JSONArray(speciality_List.get(j).toString());
	    	   long proceduresCount=data.getLong(0);
	    	   long hospitalCount=data.getLong(1);
	    	   String diseaseId=data.getString(2);
	    	   String diseaseName=data.getString(3);
	    	    
	    	   %>
		      <div class="col-lg-3">
			  	<div class="card">
				  <div class="card-body">
					<h5 class="card-title"><%=diseaseName %></h5> 
					<% if(hospitalCount>0){ %>
					<a style="cursor: pointer;" onClick="viewHospitalRecords('<%=diseaseName %>');" class="card-link">Hospitals - <%=hospitalCount %> </a>
				  <% }else{ %>Hospitals - <%=hospitalCount %> <% } %>
				  </div>
				</div>
			  </div>
			    <% } %>
 
	</div>	</section>
	</div><!--ysri_section-->
 	
<script>
function viewHospitalRecords(diseaseName){
	console.log("diseaseName>>>>"+diseaseName);
	$('#<portlet:namespace />viewHospitalsRecords').find('input[name=<portlet:namespace />diseaseName]').val(diseaseName);
	$("#<portlet:namespace />viewHospitalsRecords").submit();
}
</script>
		
<aui:form name="viewRecords" method="post" action="<%=viewSpecialityRecordsURL %>" style="display:none;">
   <aui:input type="text" name="diseaseId" value=""></aui:input>
   <aui:input type="text" name="districtId" value=""></aui:input>
</aui:form>
		  
<portlet:renderURL var="viewHospitalsRecordsURL">
			<portlet:param name="mvcPath" value="/hospitalsList.jsp"/> 
		</portlet:renderURL> 
<aui:form name="viewHospitalsRecords" method="post" action="<%=viewHospitalsRecordsURL %>" style="display:none;">
   <aui:input type="text" name="diseaseName" value=""></aui:input>
   <aui:input type="text" name="districtId" value=""></aui:input>
   <aui:input type="text" name="HOSP_TYPE" value=""></aui:input>
   <aui:input type="text" name="stateId" value=""></aui:input>
   
</aui:form>  