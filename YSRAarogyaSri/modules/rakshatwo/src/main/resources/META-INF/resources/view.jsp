<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>


<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
System.out.println("pageId="+pageId);


if(pageId==469 || pageId==6){ %>
<%@ include file="/guidelines_manuals_sops.jsp" %>
<%}else if(pageId==459){ %>
<%@ include file="/bids_agreements.jsp" %>
<%}else if(pageId==473){ %>
<%@ include file="/processflow_documents.jsp" %>
<%}else if(pageId==475){ %>
<%@ include file="/board_resolutions.jsp" %>
<%}else if(pageId==477){ %>
<%@ include file="/reports_and_working_pages.jsp" %>
<%}else if(pageId==479){ %>
<%@ include file="/publicity.jsp" %>
<%}else if(pageId==481){ %>
<%@ include file="/govt_orders.jsp" %>
<%}else if(pageId==525){ %>
<%@ include file="/notifications.jsp" %>
<%}else if(pageId==117){ %>
<%@ include file="/notifications.jsp" %>
<%}else if(pageId==312){ %>
<%@ include file="/bids_agree_child2.jsp" %>
<%}else if(pageId==664 || pageId==680){ %>
<%@ include file="/arogyamithra.jsp" %>
<%}else if(pageId==85){ %>
<%@ include file="/ysr_rti_act.jsp" %>
<%}else if(pageId==660 || pageId==678){ %>
<%@ include file="/treatments2.jsp" %>
<%}else if(pageId==549){ %>
<%@ include file="/new_govt_orders.jsp" %>
<%}else if(pageId==547){ %>
<%@ include file="/ar_bids_-_agree_trust_-_hosp.jsp" %>
<%}
else{ %>
page not found in rakshatwo
<%}
%>


