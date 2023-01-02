<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>
  <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
%>



<!--End of header-->

<%-- <%if(pageId==589|| pageId==585){ %> 
	<!-- <div class="main_heading_breadcrum">
		<div class="container">
			<div class="row">
				<div class="col-md-8 p-static">
					<h1>Network Hospitals</h1>
					<span class="sub-title">Search Your Area Hospital</span>
				</div>
				<div class="col-md-4 order-1 order-md-2 align-self-center">
					<ul class="breadcrumb d-block text-md-end breadcrumb-light">
						<li><a href="index.html">Home</a></li>
						<li class="active">NWH</li>
					</ul>
				</div >
			</div>
		</div>
		
	</div> -->
	<!--main_heading_breadcrum-->
	
 
<%@ include file="/hospitalsList.jsp" %> --%>
</section>  <!-- faq_section -->	    
 
<%if(pageId==591){ %> 

<%@ include file="/speciality_procedures.jsp" %>
</section>  <!-- faq_section -->	    
 
<% } %>


 <%if(pageId==513 || pageId==507 || pageId==499 || pageId==491){ %>
 
 <%@ include file="/hospital_search.jsp" %>
 <% }else if(pageId==497  ||pageId==595 ||pageId==587 || pageId==593 ||pageId==579||pageId==515|| pageId==503 || pageId==509){ %>
 <%@ include file="/speciality_search.jsp" %>
 <% }else if(pageId==517 || pageId==495 || pageId==505 ||pageId==511){ %>
 <%@ include file="/procedure_search.jsp" %>
 <% }else if(pageId==519){ %>
   <%@ include file="/mitra_search.jsp" %>
   <% }else if(pageId==589 || pageId==585 ||pageId==581){ %>
   <%@ include file="/hospitalsList.jsp" %>
   <% }else{ %>
   Asrim Search Page not Created
   <% } %> 