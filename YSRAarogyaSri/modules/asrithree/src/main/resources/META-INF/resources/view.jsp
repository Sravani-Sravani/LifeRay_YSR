<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>



<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);

if(pageId==6){ %>
<%@ include file="/follow_up_guidelines_new.jsp" %>
<%}else if(pageId==551){ %>
<%@ include file="/follow_up_guidelines_new.jsp" %>
<%}else if(pageId==565){ %>
<%@ include file="/arogyamithra.jsp" %>
<%}else if(pageId==634){ %>
<%@ include file="/aasaraAmount.jsp" %>
<%}else if(pageId==636){ %>
<%@ include file="/specialities.jsp" %>
<%}else{ %>
PageIsNotFound in asri
<%}
%>