<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>


<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);


if(pageId==6 || pageId==87){ %>
	<%@ include file="/govt_orders.jsp" %>
<% }else if(pageId==250){ %>
<%@ include file="/govt_orders.jsp" %>
<%}else if(pageId==296){ %>
<%@ include file="/guidelines_manuals_sops.jsp" %>
<%}else if(pageId==242){ %>
<%@ include file="/processflow_documents.jsp" %>
<%}else if(pageId==248){ %>
<%@ include file="/publicity.jsp" %>
<%}else if(pageId==246){ %>
<%@ include file="/reports_workingpages.jsp" %>
<%}else{ %>
<%}
%>

