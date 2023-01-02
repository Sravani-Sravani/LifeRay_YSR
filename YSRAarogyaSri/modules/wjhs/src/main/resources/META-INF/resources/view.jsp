<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>



<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);


if(pageId==151 || pageId==25){ %>
<%@ include file="/asri_functions.jsp" %>
<% } else if(pageId==149){ %>
<%@ include file="/claims.jsp" %>
<%} else if(pageId==131){ %>
<%@ include file="/edm_wjhs.jsp" %>
<%}else if(pageId==133){ %>
<%@ include file="/field_operations.jsp" %>
<%}else if(pageId==385){ %>
<%@ include file="/instructions.jsp" %>
<%}else if(pageId==135){ %>
<%@ include file="/network_hospitals.jsp" %>
<%}else if(pageId==310){ %>
<%@ include file="/notification_tender.jsp" %>
<%}else if(pageId==137){ %>
<%@ include file="/nwh_obligations.jsp" %>
<%}else if(pageId==139){ %>
<%@ include file="/pre_authorization.jsp" %>
<%}else if(pageId==286){ %>
<%@ include file="/scheme_coverage.jsp" %>
<%}else if(pageId==310){ %>
<%@ include file="/tender.jsp" %>
<%}else if(pageId==143){ %>
<%@ include file="/webportal_online_workflow.jsp" %>
<%}else if(pageId==147 || pageId==6){ %>
<%@ include file="/who_is_who.jsp" %>
<%}else if(pageId==308){ %>
<%@ include file="/documents_wjhs.jsp" %>
<%}else if(pageId==417){ %>
<%@ include file="/followup_packages.jsp" %>
<%}else if(pageId==415){ %>
<%@ include file="/patient_processflow.jsp" %>
<%}else if(pageId==423){ %>
<%@ include file="/procedure_covered.jsp" %>
<%}else if(pageId==419){ %>
<%@ include file="/sample_healthcard.jsp" %>
<%}else if(pageId==413){ %>
<%@ include file="/steps_for_health_card.jsp" %>
<%}else if(pageId==421){ %>
<%@ include file="/usermanual_for_download_healthcard.jsp" %>
<%}else if(pageId==411){ %>
<%@ include file="/lgn_instructionsj.jsp" %>
<%}else if(pageId==605 ||pageId==607){ %>
<%@ include file="/wjhs_treatments.jsp" %>
<%}else if(pageId==409){ %>
<%@ include file="/login_instruction.jsp" %>
<%}else{ %>
PageIsNotFound
<%}
%>


