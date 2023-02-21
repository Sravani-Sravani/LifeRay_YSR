<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>

<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);


if( pageId==33 || pageId==565){ %>
<%@ include file="/mithraehs.jsp" %>
<% }else if(pageId==567 ){ %>
<%@ include file="/mithraehs.jsp" %>
<%}else if(pageId==638 ){ %>
<%@ include file="/ehspecialities.jsp" %>
<%}else{ %>
PageIsNotFound IN ehs
<%}
%>










			 