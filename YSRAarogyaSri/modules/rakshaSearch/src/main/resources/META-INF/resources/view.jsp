<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>
    <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pId=themeDisplay.getPlid();
%>
  <%if(pId==507){ %>
 
 <%@ include file="/hospital_search.jsp" %>
 <% }else if(pId==509){ %>
 <%@ include file="/speciality_search.jsp" %>
 <% }else if(pId==511 || pId==6){ %>
 <%@ include file="/procedure_search.jsp" %>
 <% }else if(pId==523){ %>
   <%@ include file="/mitra_search.jsp" %>
   <% }else{ %>
   Page ID not assigned in raksha search.
   <% } %>
              
   