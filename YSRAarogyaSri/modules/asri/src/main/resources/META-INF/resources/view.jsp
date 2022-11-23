<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>



<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);

if(pageId==443){ %>
<%@ include file="/asri.jsp" %>
<%}else if(pageId==314){ %>
<%@ include file="/archives_new.jsp" %>
<%} else if(pageId==318){ %>
<%@ include file="/archives_old.jsp" %>
<%}else if(pageId==99){ %>
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
<%}else if(pageId==393){ %>
<%@ include file="/notifications.jsp" %>
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
<%}else if(pageId==145){ %>
<%@ include file="/caution.jsp" %>
<%}else if(pageId==71){ %>
<%@ include file="/circulars.jsp" %>
<%}else if(pageId==75){ %>
<%@ include file="/follow_up_information.jsp" %>
<%}else if(pageId==425){ %>
<%@ include file="/empanlementguidelines.jsp" %>
<%}else if(pageId==427){ %>
<%@ include file="/changerequest.jsp" %>
<%}else if(pageId==429){ %>
<%@ include file="/specialisation_inclusion_details.jsp" %>
<%}else if(pageId==431){ %>
<%@ include file="/moudocument.jsp" %>
<%}else if(pageId==433){ %>
<%@ include file="/additionalprocedures.jsp" %>
<%}else if(pageId==435){ %>
<%@ include file="/nabhhospitals.jsp" %>
<%}else if(pageId==451){ %>
<%@ include file="/bosrd_of_trustees.jsp" %>
<%}else if(pageId==441){ %>
<%@ include file="/health_camps.jsp" %>
<%}else if(pageId==445){ %>
<%@ include file="/healthcare_trust.jsp" %>
<%}else if(pageId==455){ %>
<%@ include file="/notifications.jsp" %>
<%}else if(pageId==453){ %>
<%@ include file="/rti_act.jsp" %>
<%}else if(pageId==449){ %>
<%@ include file="/who_is_who_district.jsp" %>
<%}else if(pageId==447){ %>
<%@ include file="/who_is_who_trust.jsp" %>
<%}else if(pageId==282){ %>
<%@ include file="/asri_agreements_bw_trust_and_network_hospitals.jsp" %>
<%}else if(pageId==529){ %>
<%@ include file="/archives_new.jsp" %>
<%}else if(pageId==527){ %>
<%@ include file="/archives_old.jsp" %>
<%}else if(pageId==531){ %>
<%@ include file="/asri_circulars.jsp" %>
<%}else if(pageId==537){ %>
<%@ include file="/follow_up_information.jsp" %>
<%}else if(pageId==539){ %>
<%@ include file="/guidelines.jsp" %>
<%}else{ %>
PageIsNotFound
<%}
%>