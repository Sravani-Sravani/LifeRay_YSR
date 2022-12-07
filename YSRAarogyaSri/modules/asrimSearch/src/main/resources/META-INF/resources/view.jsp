<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>
    <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pId=themeDisplay.getPlid();
%>
  <%if(pId==513 ){ %>
 
 <%@ include file="/hospital_search.jsp" %>
 <% }else if(pId==515){ %>
 <%@ include file="/speciality_search.jsp" %>
 <% }else if(pId==517 ){ %>
 <%@ include file="/procedure_search.jsp" %>
 <% }else if(pId==519){ %>
   <%@ include file="/mitra_search.jsp" %>
   <% }else if(pId==6){ %>
   <%@ include file="/web/guest/asri_hospitalsearch" %>
   <% }else{ %>
   Asrim Search Page not Created
   <% } %>
                 