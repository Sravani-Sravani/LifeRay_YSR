<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>
  <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
%>
 <%if(pageId==513 || pageId==507 || pageId==499 || pageId==491){ %>
 
 <%@ include file="/hospital_search.jsp" %>
 <% }else if(pageId==515){ %>
 <%@ include file="/speciality_search.jsp" %>
 <% }else if(pageId==517){ %>
 <%@ include file="/procedure_search.jsp" %>
 <% }else if(pageId==519){ %>
   <%@ include file="/mitra_search.jsp" %>
   <% }else{ %>
   Asrim Search Page not Created
   <% } %> 