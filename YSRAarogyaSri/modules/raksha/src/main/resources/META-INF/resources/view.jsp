<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>
<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);


if(pageId==6 || pageId==87){ %>
	<%@ include file="/board_of_trustees.jsp" %>
<% }else if(pageId==99){ %>
<%@ include file="/dr_ysr_asri_scheme.jsp" %>
<%} else if(pageId==69){ %>
<%@ include file="/follow_up_guidelines.jsp" %>
<%}else if(pageId==75){ %>
<%@ include file="/follow_up_information.jsp" %>
<%}else if(pageId==103){ %>
<%@ include file="/health_camps.jsp" %>
<%}else if(pageId==89){ %>
<%@ include file="/health_who_is_who_district.jsp" %>
<%}else if(pageId==91){ %>
<%@ include file="/health_who_is_who_trust.jsp" %>
<%}else if(pageId==177){ %>
<%@ include file="/salient_features.jsp" %>
<%}else if(pageId==95){ %>
<%@ include file="/ysr_healthcare_trust.jsp" %>
<%}else if(pageId==21){ %>
<%@ include file="/ysr_landing_page.jsp" %>
<%}else if(pageId==244){ %>
<%@ include file="/board_resolutions.jsp" %>
<%}else{ %>
PageIsNotFound in raksha
<%}
%>

