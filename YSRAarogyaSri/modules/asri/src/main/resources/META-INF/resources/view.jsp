<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>



<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);

if(pageId==443||pageId==6 || pageId==19){ %>
<%@ include file="/asri.jsp" %>
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
<%}else if(pageId==425){ %>
<%@ include file="/empanlementguidelines.jsp" %>
<%}else if(pageId==427){ %>
<%@ include file="/changerequest.jsp" %>
<%}else if(pageId==613 || pageId==591){ %>
<%@ include file="/asri_treats.jsp" %>
<%}else if(pageId==615 ||pageId==593){ %>
<%@ include file="/asri-entitle.jsp" %>
<%}else if(pageId==601 ||pageId==589){ %>
<%@ include file="/amieligible.jsp" %>
<%}else if(pageId==429){ %>
<%@ include file="/fix_incl.jsp" %>
<%}else{ %>
PageIsNotFound in asri
<%}
%>