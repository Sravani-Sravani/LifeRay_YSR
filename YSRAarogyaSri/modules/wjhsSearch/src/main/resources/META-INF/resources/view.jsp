<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>
    <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pId=themeDisplay.getPlid();
%>
  <%if(pId==499 || pId==491){ %>
 
 <%@ include file="/hospital_search.jsp" %>
 <% }else if(pId==503 || pId==497){ %>
 <%@ include file="/speciality_search.jsp" %>
 <% }else if(pId==505 || pId==495){ %>
 <%@ include file="/procedure_search.jsp" %>
 <% }else if(pId==501 || pId==521){ %>
   <%@ include file="/mitra_search.jsp" %>
   <% } else{ %>
   pagen
   <% }%>
              
   