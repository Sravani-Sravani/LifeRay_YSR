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
<%}else if(pageId==650 ){ %>
<%@ include file="/benefit.jsp" %>
<%}else if(pageId==652 ){ %>
<%@ include file="/chronic.jsp" %>
<%}else if(pageId==666 || pageId==690 ){ %>
<%@ include file="/penloginins.jsp" %>
<%}else if(pageId==668 || pageId==684 ){ %>
<%@ include file="/loc.jsp" %>
<%}else{ %>
PageIsNotFound IN ehsthree
<%}
%>
