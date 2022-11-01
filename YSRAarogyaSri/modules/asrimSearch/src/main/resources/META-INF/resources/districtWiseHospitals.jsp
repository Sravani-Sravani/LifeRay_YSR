<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
<%@page import="com.liferay.headless.commerce.admin.order.dto.v1_0.Order"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.kpmg.asrimTables.service.AsrimLocationsLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.kpmg.asrimTables.model.AsrimLocations"%>
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
 
 String recordId = ParamUtil.getString(request, "recordId");
 System.out.println("recordId>>>"+recordId);
 
 List<AsrimLocations> asrimLocationsList=null;
 try{
	DynamicQuery dynamicQuery = null;
	dynamicQuery = AsrimLocationsLocalServiceUtil.dynamicQuery();
	if (recordId != "") {
		dynamicQuery.add(RestrictionsFactoryUtil.eq("LOC_STATE_VAL", recordId));
		System.out.println("organizationId 11111>>>"+recordId);
	}
	//Order order = OrderFactoryUtil.desc("LOC_NAME");
	//dynamicQuery.addOrder(order);
	System.out.println("dynamicQuery=>>>>>>>>>>>>>>>"+dynamicQuery.toString());
	asrimLocationsList = AsrimLocationsLocalServiceUtil.dynamicQuery(dynamicQuery);
 }
 catch(Exception e){
	 e.printStackTrace();
 }
%>
<div class="ysri_section">
		
	<section class="blue_section">
	  <div class="container search_panel">
		  <h3>Aarogyasri / District Wise - Empanelled Hospitals</h3>
		  <div class="row">
		  
		  <% try{ for(AsrimLocations asLocations:asrimLocationsList){ %>
		      <div class="col-lg-3">
			  	<div class="card">
				  <div class="card-body">
					<h5 class="card-title"><%=asLocations.getLOC_NAME() %></h5>
					<a href="" class="card-link">Government - 46 </a>
					<a href="" class="card-link">Private - 48</a>
				  </div>
				</div>
			  </div>
			  <% } }catch(Exception e){e.printStackTrace();} %>
		 </div>
	   </div>
	</section>  <!-- services_section -->
	</div><!--ysri_section-->	  
 