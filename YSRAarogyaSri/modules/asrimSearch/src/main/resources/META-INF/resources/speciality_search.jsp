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
		  <%
	String geography="";
	String speciality="";
	String nearbyhptls="";
	if(pageId1==589|| pageId1==593 || pageId1==515){
		geography="/web/guest/search-by-geography";
		speciality="/web/guest/asrispeciality";
		nearbyhptls="/web/guest/nearby-hospitals";
	}
	else if(pageId1==497|| pageId1==585||pageId1==595){
		geography="/web/guest/ehs-v4";
		speciality="/web/guest/ehsspeciality";
		nearbyhptls="/web/guest/nearby-hospitals";
	}
	
	if(pageId1==589|| pageId1==593|| pageId1==585||pageId1==595){
	 %>
	<div class="container-fluid">
			<div class="row">
		
				<div class="col-lg-12 text-end">
				<a href="<%=geography %>" class="btn search_sm_btn"><i class="fa-solid fa-location-dot"></i> Search by Geography</a>
				<a href="<%=speciality %>"  class="btn search_sm_btn_active"><i class="fa-solid fa-user-doctor"></i> Search by Speciality</a>
				<a href="<%=nearbyhptls %>" class="btn search_sm_btn"><i class="fa-solid fa-hospital"></i> Hospitals Near Me</a>
			  </div> <!--end of col-->
			</div>
	<% } %>

	  <%
	  String pageTitle="";
	  if(pageId1==513 || pageId1==589|| pageId1==593 ||pageId1==515){
	  	pageTitle="Aarogyasri ";
	  }
	  else if(pageId1==507 || pageId1==509){
	  	pageTitle="Aarogya Raksha ";
	  }
	  else if(pageId1==585 || pageId1==497||pageId1==595){
		  pageTitle="EHS";
	  }
	  else if(pageId1==503){
		  pageTitle="WJHS";
	  }
	  %>
		  <h3><%=pageTitle %> / Speciality Search</h3><br>
		  <div class="row">
		      
		      <% 
	          String specialityId=null;
		      org.json.JSONArray speciality_List= DataGridDisplayManageUtil.getAsriSpecialityCount(specialityId, pageId1);
		      System.out.print("speciality_List 123"+speciality_List.toString());
		  	  
		      for(int j=0;j<speciality_List.length();j++){
	        	org.json.JSONArray data=new org.json.JSONArray(speciality_List.get(j).toString());
	        	
	        	
	        	long proceduresCount=0;
		    	   long hospitalCount=0;
		    	   String diseaseId="";
		    	   String diseaseName="";
	        	
	    	     if(pageId1==595 || pageId1==497 || pageId1==503 ||pageId1==495 ){ //503=wjhs, 595 = ehsspeciality, 497=ehs

	    	    	     proceduresCount=data.getLong(1);
			    	     hospitalCount=data.getLong(2);
			    	     diseaseId=data.getString(2);
			    	     diseaseName=data.getString(0); 
	    	     }
	    	 
	    	     else{
                  	 proceduresCount=data.getLong(0);
			    	     hospitalCount=data.getLong(1);
			    	     diseaseId=data.getString(2);
			    	     diseaseName=data.getString(3); 
	    	    	 
	    	     }
	    	    
	    	   %>
		      <div class="col-lg-3">
			  	<div class="card card-large">
				  <div class="card-body">
					<h5 class="card-title card-title-large d-flex align-items-center justify-content-center"><%=diseaseName %></h5> 
					<% if(hospitalCount>0){ %>
					<a style="cursor: pointer;" onClick="viewHospitalRecords('<%=diseaseName %>');" class="card-link">Hospitals - <%=hospitalCount %> </a>
				  <% }else{ %>Hospitals - <%=hospitalCount %> <% } %>
				  </div>
				</div>
			  </div>
			    <% } %>
 </div>
	</div>	
	</section>
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