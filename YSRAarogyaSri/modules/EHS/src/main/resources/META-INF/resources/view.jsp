<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>

<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);


if(pageId==6|| pageId==33){ %>
<%@ include file="/about_fieldoperations.jsp" %>
<% } else if(pageId==31||pageId==27){ %>
<%@ include file="/about_scheme.jsp" %>
<%} else if(pageId==35){ %>
<%@ include file="/about_trustoffice.jsp" %>
<%}else if(pageId==41){ %>
<%@ include file="/whoiswho.jsp" %>
<%}else if(pageId==39){ %>
<%@ include file="/about_webportal.jsp" %>
<%}else if(pageId==45){ %>
<%@ include file="/who_is_who_district.jsp" %>
<%}else if(pageId==218){ %>
<%@ include file="/download_healthcard.jsp" %>
<%}else if(pageId==115){ %>
<%@ include file="/employee_chronicpatient.jsp" %>
<%}else if(pageId==51){ %>
<%@ include file="/employee_login.jsp" %>
<%}else if(pageId==119){ %>
<%@ include file="/patient_meeseva.jsp" %>
<%}else if(pageId==216){ %>
<%@ include file="/patient_processflow.jsp" %>
<%}else if(pageId==125){ %>
<%@ include file="/pensioners_chronic.jsp" %>
<%}else if(pageId==129){ %>
<%@ include file="/pensioners_healthcardsteps.jsp" %>
<%}else if(pageId==73){ %>
<%@ include file="/pensioners_login.jsp" %>
<%}else if(pageId==127){ %>
<%@ include file="/pensioners_meeseva.jsp" %>
<%}else if(pageId==109){ %>
<%@ include file="/usermanual_addingbenificiary.jsp" %>
<%}else if(pageId==105){ %>
<%@ include file="/usermanual_enrolmentstatus.jsp" %>
<%}else if(pageId==101){ %>
<%@ include file="/usermanual_healthcard.jsp" %>
<%}else if(pageId==97){ %>
<%@ include file="/usermanual_medicalreimbursment.jsp" %>
<%}else{ %>
PageIsNotFound IN ehs
<%}
%>










			 