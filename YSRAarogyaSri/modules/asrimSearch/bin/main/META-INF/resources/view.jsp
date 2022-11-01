<%@page import="com.kpmg.asrimTables.service.FooLocalServiceUtil"%>
<%@page import="com.kpmg.asrimTables.model.AsrimHospitals"%>
<%@page import="com.kpmg.asrimTables.service.AsrimHospitalsLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
 <%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletURL"%>
 <%@ include file="/init.jsp" %>
<!-- 
<p>
	<b><liferay-ui:message key="asrimsearch.caption"/></b>
</p>
 -->
<%
//int count=FooLocalServiceUtil.getFoosCount();
//System.out.println("Count 123>>>"+count);
  int count=AsrimHospitalsLocalServiceUtil.getAsrimHospitalsesCount();
 System.out.println("Count 123>>>"+count);
%>
<% 
 PortletURL iteratorNewURL = renderResponse.createRenderURL(); 
 iteratorNewURL.setParameter("mvcPath", "/view.jsp");
 long cur = 1;
 long delta=1;
 if(ParamUtil.getLong(request, "cur")!=0){
 	cur =ParamUtil.getLong(request, "cur");
 }
 if(ParamUtil.getLong(request, "delta")!=0){
 	delta =ParamUtil.getLong(request, "delta");
 }
 long sNo=(delta * (cur-1))+1;
  
 
%>
<div class="ysri_section">
             <!--  <portlet:renderURL var="ViewDistrictWiseListURL">
					<portlet:param name="mvcPath" value="/districtWiseHospitals.jsp" />
					<portlet:param name="applicationId" value="" />
				</portlet:renderURL> -->		
	<section class="blue_section">
	  <div class="container search_panel">
		  <h3>Aarogyasri State Empanelled Hospitals</h3>
		  <div class="row">
		      <div class="col-lg-3">
			  	<div class="card">
				  <div class="card-body">
					<h5 class="card-title">Andhra Pradesh</h5>
					<a onClick="viewRecords(6);" class="card-link">Government - 75</a>
					<a onClick="viewRecords(6);" class="card-link">Private - 35 </a>
				  </div>
				</div>
			  </div>
			  <div class="col-lg-3">
			  	<div class="card">
				  <div class="card-body">
					<h5 class="card-title">Telangana</h5>
					<a onClick="viewRecords(7);" class="card-link">Government - 15</a>
					<a onClick="viewRecords(7);" class="card-link">Private - 35 </a>
				  </div>
				</div>
			  </div>
			  <div class="col-lg-3">
			  <div class="card">
				  <div class="card-body">
					<h5 class="card-title">Tamil Nadu</h5>
					<a onClick="viewRecords(9);" class="card-link">Government - 15</a>
					<a onClick="viewRecords(9);" class="card-link">Private - 15 </a>
				  </div>
				</div>
			  </div>
			  <div class="col-lg-3">
			  <div class="card">
				  <div class="card-body">
					<h5 class="card-title">Karnataka</h5>
					<a onClick="viewRecords(8);" class="card-link">Government - 15</a>
					<a onClick="viewRecords(8);" class="card-link">Private - 15 </a>
				  </div>
				</div>
			  </div>
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
		<portlet:renderURL var="viewRecordsURL">
			<portlet:param name="mvcPath" value="/districtWiseHospitals.jsp"/> 
		</portlet:renderURL> 
<aui:form name="viewRecords" method="post" action="<%=viewRecordsURL %>" style="display:none;">
   <aui:input type="text" name="recordId" value=""></aui:input>
</aui:form>
	
		
	</div><!--ysri_section-->	  
    