<!DOCTYPE html>

<#include init />
<#assign currentUrl = themeDisplay.getPortalURL() + themeDisplay.getURLCurrent() />
  <#assign extUrl = themeDisplay.getURLCurrent() />
<#assign portalURL = themeDisplay.getPortalURL() />
<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${html_title}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
		 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css"/>
      <link rel="stylesheet" href="${css_folder}/bootstrap.min.css">
	  <script src="${javascript_folder}/jquery.min.js"></script> 
	  <script src="${javascript_folder}/bootstrap.min.js"></script> 
	  <link rel="stylesheet" href="${css_folder}/simplePagination.css">
  <style>
    div.alert .lead{display:none;}
    div.alert-notifications.alert-notifications-fixed{min-width:500px;} 
    div.alert {width:100%;}
    div.autofit-col.autofit-col-expand{width:100%;}
    img.logo-img {
    height: 72px;
    width: 170px !important;
}
   </style>
	
</head>

<body class="${css_class}">
 <#assign dashboardPage = "/group/guest/dashboard"
		                     navigation="department_navigation.ftl" 
 showMenu = "style='display:block;'"
/>

<#assign dashboardPage = htmlUtil.escape(dashboardPage) />


<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />
<div class="container-fluid page-wrapper chiller-theme toggled" id="wrapper"> 
<a id="show-sidebar" class="btn btn-sm btn-dark" href="#">
    <i class="fas fa-bars"></i>
  </a>
<nav class="w3-sidenav w3-light-grey sidenavclasses sidebar-wrapper" id="sidebar">
 <div class="sidebar-content">
    <div class="sidebar-brand">
        <div id="close-sidebar">
          <i class="fas fa-times"></i>
        </div>
      </div>
    <div class="navlogotop">
        <div class="headerlogo">
            <a href="${dashboardPage}"><img src="/documents/d/guest/logo1" alt="Dr. YSR Aarogyasri Health Care Trust" class="logo-img"></a>            
             </div>
    </div>
    <#if has_navigation && is_setup_complete>
  <#include "${full_templates_path}/${navigation}" />
  </#if>
  </div>
</nav>
<div style=" ">
 <div class="complaintDepartment page-content">
<div class="">
    <header class="w3-container w3-dark-grey text-center">
        <#assign pageId = page.plid>
        <div class="container-fluid">
                    <span class="signoutsec">
                        <#if is_signed_in> 
                        <liferay-ui:message key="birthCertForm.motherAadhaarNumber"/>
                                <label class="pr-2"><a class="welword" style="color:#000 !important; font-weight: 500;"  href=" ${sign_out_url}"><i class="fas fa-power-off pr-1"></i>Logout</a></label>
                                </#if>
                    </span> 
                    <span class="welcomesecinhead">
                            <#if is_signed_in> 
                            <liferay-ui:message key="birthCertForm.motherAadhaarNumber"/>
                            <label class="pr-2"><p class="welword" style="color:#000 !important; font-weight: 500;">Welcome ${user_first_name} ${user_last_name}</p></label>
                                </#if>
                    </span>          
        </div>
    </header>
</div>
	<section id="content" class="pageID-${page.plid}">
		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			 

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>

	<footer id="footer" role="contentinfo">
		<div class="copyright-sec">
      <div class="container">
        <div class=" ">
          <p class="powered-by" style="text-align: center;"><em>&copy;Site maintained by KPMG Advisory Services Pvt. Ltd. (in consortium with SRIT India Pvt. Ltd.). The contents are owned by Govt.of AP,India.
      </em></p>
        </div>
      </div>
    </div>
	</footer>
</div>
</div>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />
<script>
        jQuery(function ($) {

$(".sidebar-dropdown > a").click(function() {
$(".sidebar-submenu").slideUp(200);
if (
$(this)
  .parent()
  .hasClass("active")
) {
$(".sidebar-dropdown").removeClass("active");
$(this)
  .parent()
  .removeClass("active");
} else {
$(".sidebar-dropdown").removeClass("active");
$(this)
  .next(".sidebar-submenu")
  .slideDown(200);
$(this)
  .parent()
  .addClass("active");
}
});

$("#close-sidebar").click(function() {
$(".page-wrapper").removeClass("toggled");
});
$("#show-sidebar").click(function() {
$(".page-wrapper").addClass("toggled");
});
});
    </script>
</body>
</html>