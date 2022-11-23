<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>
    <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pId=themeDisplay.getPlid();
%>
  <%if(pId==45 || pId==49 || pId==6){ %>
 
 <%@ include file="/hospital_search.jsp" %>
 <% }else if(pId==43 || pId==165){ %>
 <%@ include file="/speciality_search.jsp" %>
 <% }else if(pId==41 || pId==163){ %>
 <%@ include file="/procedure_search.jsp" %>
 <% }else if(pId==47 || pId==167){ %>
   <%@ include file="/mitra_search.jsp" %>
   <% } %>
              
   