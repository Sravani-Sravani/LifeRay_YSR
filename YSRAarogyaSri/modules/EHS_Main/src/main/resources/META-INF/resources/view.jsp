<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>

<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);


if(pageId==6|| pageId==33||pageId==27){ %>
<%@ include file="/about_fieldoperations.jsp" %>
<% }else if(pageId==179){ %>
<%@ include file="/hospital_chronicpatient.jsp" %>
<%}else if(pageId==184){ %>
<%@ include file="/hospital_claims.jsp" %>
<%}else if(pageId==190){ %>
<%@ include file="/hospital_edm.jsp" %>
<%}else if(pageId==194){ %>
<%@ include file="/hospital_empanelmentdoc.jsp" %>
<%}else if(pageId==196){ %>
<%@ include file="/hospital_empanelmentgovtdoc.jsp" %>
<%}else if(pageId==198){ %>
<%@ include file="/hospital_empanelmentguidelines.jsp" %>
<%}else if(pageId==200){ %>
<%@ include file="/hospital_networkhospitals.jsp" %>
<%}else if(pageId==202){ %>
<%@ include file="/hospital_nwh.jsp" %>
<%}else if(pageId==206){ %>
<%@ include file="/hospital_packagefollowup.jsp" %>
<%}else if(pageId==210){ %>
<%@ include file="/hospital_packageprice.jsp" %>
<%}else if(pageId==212){ %>
<%@ include file="/hospital_preauthorization.jsp" %>
<%}else if(pageId==214){ %>
<%@ include file="/hospital_specialization.jsp" %>
<%}else if(pageId==541){ %>
<%@ include file="/hospital_dental.jsp" %>
<%}else{ %>
PageIsNotFound IN ehsmain
<%}
%>










			 