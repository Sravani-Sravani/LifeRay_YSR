<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>



<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);


if(pageId==314 ||pageId==6){ %>
<%@ include file="/archives_new.jsp" %>
<%} else if(pageId==318){ %>
<%@ include file="/archives_old.jsp" %>
<%}else if(pageId==99  || pageId==19){ %>
<%@ include file="/asrischeme.jsp" %>
<%}else if(pageId==294){ %>
<%@ include file="/bids_agreements.jsp" %>
<%}else if(pageId==244){ %>
<%@ include file="/boardResultions.jsp" %>
<%}else if(pageId==300){ %>
<%@ include file="/exploredata.jsp" %>
<%}else if(pageId==250){ %>
<%@ include file="/govtorders.jsp" %>
<%}else if(pageId==296){ %>
<%@ include file="/guidelines.jsp" %>
<%}else if(pageId==242){ %>
<%@ include file="/processflowdocuments.jsp" %>
<%}else if(pageId==248){ %>
<%@ include file="/publicity.jsp" %>
<%}else if(pageId==246){ %>
<%@ include file="/reportsworkingpapers.jsp" %>
<%}else if(pageId==93){ %>
<%@ include file="/tenders.jsp" %>
<%}else if(pageId==153){ %>
<%@ include file="/usermanuals.jsp" %>
<%}else if(pageId==435){ %>
<%@ include file="/nabhhospitals.jsp" %>
<%}else if(pageId==433){ %>
<%@ include file="/follow_procedures.jsp" %>
<%}else if(pageId==431){ %>
<%@ include file="/moudocument.jsp" %>
<%}else if(pageId==429){ %>
<%@ include file="/empanelment_application.jsp" %>
<%}else if(pageId==427){ %>
<%@ include file="/changerequest.jsp" %>
<%}else if(pageId==425){ %>
<%@ include file="/empanlementguidelines.jsp" %>
<%}else{ %>
PageIsNotFound in asri
<%}
%>
