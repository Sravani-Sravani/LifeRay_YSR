<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>



<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);

if(pageId==597){ %>
<%@ include file="/aboutaasara.jsp" %>
<%}else if(pageId==646){ %>
<%@ include file="/aasarastatus.jsp" %>
<%}else{ %>
PageIsNotFound in asri
<%}
%>

