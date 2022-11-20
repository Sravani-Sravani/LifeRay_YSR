<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>



<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);


if(pageId==27 || pageId==31){ %>
	<%@ include file="/about.jsp" %>
<% } else if(pageId==35){ %>
<%@ include file="/trust.jsp" %>
<%} else if(pageId==33){ %>
<%@ include file="/field.jsp" %>
<%}else if(pageId==41){ %>
<%@ include file="/whoiswho.jsp" %>
<%}else if(pageId==39){ %>
<%@ include file="/webportal.jsp" %>
<%}else if(pageId==45){ %>
<%@ include file="/whod.jsp" %>
<%}else{ %>
PageIsNotFound
<%}
%>










			 