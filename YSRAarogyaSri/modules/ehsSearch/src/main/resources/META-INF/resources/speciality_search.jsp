<%@page import="com.kpmg.ehsSearch.util.DataGridDisplayManageUtil"%> 
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Order"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%> 
<%@page import="java.util.List"%>
 <%@ include file="/init.jsp" %>

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
	  <div class="container">
		  <h3>EHS / Speciality Search</h3><br>
		  
		  
		  
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