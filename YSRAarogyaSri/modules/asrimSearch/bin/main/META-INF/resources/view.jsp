<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>
  <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
%>



<!--End of header-->
<%if(pageId==589){ %> 
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
				</div>
			</div>
		</div>
	</div> -->
	<!--main_heading_breadcrum-->
	
 
  <div class="container">
	<h2 class="subheading">Network Hospitals</h2> 
	<div class="row mb-5 p-5 rounded-2 shadow-lg" id="Aarogyasri_section">
 			<div class="col-lg-4">
				<p><a href="/web/guest/asri_hospitalsearch" target="_blank" class="button_blueshade"><i class="fa-solid fa-location-dot"></i> Search by Geography</a></p>
		  </div> <!--end of col-->

		  <div class="col-lg-4">
			<p><a href="/web/guest/asri_specilitysearch" class="button_blueshade" target="_blank"><i class="fa-solid fa-user-doctor"></i> Search by Speciality</a></p>

	 	  </div> <!--end of col-->

	 	<div class="col-lg-4">
			<p><a href="https://115.124.110.149/web/guest/nearby-hospitals" class="button_blueshade" target="_blank"><i class="fa-solid fa-hospital"></i> Hospitals Near Me</a></p>
 		 </div> <!--end of col-->
	</div>
</div>
 
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