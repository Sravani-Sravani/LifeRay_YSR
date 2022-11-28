<%@ include file="/init.jsp" %>
  <%@page import="com.kpmg.ehsSearch.util.DataGridDisplayManageUtil"%> 
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
 <%@ include file="/html/dataTableIncludes.jspf" %>
  
		
    <%if(pId==499 || pId==491){ %>
 <%@ include file="/hospital_search.jsp" %>
 <% }else if(pId==503 || pId==497){ %>
 <%@ include file="/speciality_search.jsp" %>
 <% }else if(pId==505 || pId==495){ %>
 <%@ include file="/procedure_search.jsp" %>
 <% }else if(pId==501 || pId==521){ %>
   <%@ include file="/mitra_search.jsp" %>
   <% } else{ %> 
   pagenotfound in <%=pId %>
   <% } %>