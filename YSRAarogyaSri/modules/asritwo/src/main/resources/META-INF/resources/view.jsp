<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>



<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);

if(pageId==443){ %>
<%@ include file="/asri.jsp" %>
<%}else if(pageId==447 ||pageId==6){ %>
<%@ include file="/who_is_who_trust.jsp" %>
<%}else if(pageId==282){ %>
<%@ include file="/asri_agreements_bw_trust_and_network_hospitals.jsp" %>
<%}else if(pageId==531){ %>
<%@ include file="/asri_circulars.jsp" %>
<%}else if(pageId==537){ %>
<%@ include file="/follow_up_information.jsp" %>
<%}else if(pageId==539){ %>
<%@ include file="/guidelines.jsp" %>
<%}else if(pageId==455){ %>
<%@ include file="/notifications.jsp" %>
<%}else if(pageId==431){ %>
<%@ include file="/moudocument.jsp" %>
<%}else if(pageId==433){ %>
<%@ include file="/additionalprocedures.jsp" %>
<%}else if(pageId==545){ %>
<%@ include file="/asri_follow_up_guidelines.jsp" %>
<%}else if(pageId==559){ %>
<%@ include file="/asri_guidelines_new.jsp" %>
<%}else{ %>
PageIsNotFound in asritwo
<%}
%>



<%-- <% else if(pageId==453){ %>
<%@ include file="/rti_act.jsp" %>
<%}else if(pageId==449){ %>
<%@ include file="/who_is_who_district.jsp" %>
<%}else if(pageId==451){ %>
<%@ include file="/bosrd_of_trustees.jsp" %>
else if(pageId==441){ %>
<%@ include file="/health_camps.jsp" %>
<%}else if(pageId==445){ %>
<%@ include file="/healthcare_trust.jsp" %>
<%}
<%}%> --%>