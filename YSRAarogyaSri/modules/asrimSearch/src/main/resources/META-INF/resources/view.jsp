<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>
  <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
%>



<!--End of header-->
<%if(pageId==589){ %> 	
<%@ include file="/hospitalsList.jsp" %>
</section>  <!-- faq_section -->	    
 
<% } %>

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
   
   
   
   
   
   
   
   
   *****************ASRI********************

1. http://10.48.19.62:8091/portalsearchapi/public-asri/procedurebyspeciality -POST
{
"specialityId":"S13"
}

*****************AR********************
2. http://10.48.19.62:8092/portalsearchapi/public-ar/procedurebyspeciality -POST
{
"specialityId":"S13"
}

*****************EHS********************
3. http://10.48.19.62:8093/ehsportalsearchapi/public-ehs/procedurebyspeciality -POST
{
"specialityId":"S13"
}


output sequence is same as searchProcedure api.