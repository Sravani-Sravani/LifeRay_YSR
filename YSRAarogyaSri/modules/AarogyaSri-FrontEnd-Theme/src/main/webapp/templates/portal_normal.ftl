<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">
 
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Dr. YSR Aarogyasri Health Care Trust</title>
    <link rel="icon" type="image/x-icon" href="https://115.124.110.149/documents/d/guest/favicon">
<meta content="initial-scale=1.0, width=device-width" name="viewport" />
  
     
	  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

	  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
	
	<link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">	  
	 <!-- Libraries Stylesheet -->
   
<@liferay_util["include"] page=top_head_include />
<link href="/o/AarogyaSri-FrontEnd-Theme/css/style.css" rel="stylesheet" />
<link href="/o/AarogyaSri-FrontEnd-Theme/css/newfilestyle.css" rel="stylesheet" />

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
crossorigin="anonymous" referrerpolicy="no-referrer"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
crossorigin="anonymous"></script>
 <link rel="stylesheet" href="https://site-assets.fontawesome.com/releases/v6.2.0/css/all.css" />
<link rel="stylesheet" href="https://site-assets.fontawesome.com/releases/v6.2.0/css/sharp-solid.css" />
    <script src="https://site-assets.fontawesome.com/releases/v6.2.0/js/all.js" data-auto-add-css="false" data-auto-replace-svg="false"></script>
<script src="https://site-assets.fontawesome.com/releases/v6.2.0/js/sharp-solid.js" data-auto-add-css="false" data-auto-replace-svg="false"></script>
  </head>
  
<body>

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />
<#if w3c_language_id=="te-IN">
          <#assign 
		   language_file="language_te.ftl" 
		/>
      <#else>
       <#assign language_file="language.ftl" />
      </#if>
 <#include "${full_templates_path}/content/${language_file}" />
<#assign pageId = page.plid>
<div id="wrapper">

<header class="main_ysriHeader">

<div class="header_topbar">	
		<div class="container">
		
		<div class="row">
				 <div class="col-lg-6 left_topbar"> 
	
<#if w3c_language_id=="te-IN">
		<a href="/te/c/portal/update_language?p_l_id=${page.plid}&redirect=${themeDisplay.getURLCurrent()}&languageId=en_US" class="language-entry-long-text" lang="en-US">English</a>
		 <span class="language-entry-long-text" lang="te-IN">తెలుగు</span>
<#else>
		 <span class="language-entry-long-text" lang="en-US">English</span>
		 <a href="/c/portal/update_language?p_l_id=${page.plid}&redirect=${themeDisplay.getURLCurrent()}&languageId=te_IN" class="language-entry-long-text" lang="te-IN">తెలుగు</a>
</#if>
				 <a href="/web/guest/screen_reader_11"><i class="fa-solid fa-mobile-screen"></i> ${screen_reader} </a> 
				 <a href="/web/guest/glossary"><i class="fa-solid fa-book-open-cover"></i> ${glossary} </a>   
        
				 </div>
				 <div class="col-lg-6 right_topbar"> 
					<p class="btn btn-danger btn-sm"><i class="fa-regular fa-phone"></i> 104</p>
				 <p class="btn btn-success btn-sm"><i class="fa-regular fa-right-to-bracket"></i> <a href="https://115.124.110.149/web/guest/signin">${sign_in}</a></p>      
				 <p class="btn btn-success btn-sm"><i class="fa-regular fa-virus-covid"></i> <a href="https://115.124.110.149/web/guest/covid_19">${covid}</a></p>    
				 </div>	
			 </div>
		<div class="portlet-body" style="float: left;" id="languages-section">
	  <style>
	 .language-entry-long-text {
		 display: inline-block;
		 padding: 0 0.5em;
	 }
 </style>

 </div>
		  
	 </div></div><!--TOPBAR-->


  <nav id="main_navbar" class="navbar navbar-expand-md">
    <div class="container">
      <a class="navbar-brand" href="/home"><img src="https://115.124.110.149/documents/d/guest/logo1" alt="Dr. YSR Aarogyasri Health Care Trust" class="img-fluid" /></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-end" id="navbarCollapse">
        <ul class="navbar-nav mb-2 mb-md-0">
			<li class="nav-item"><a class="nav-link <#if pageId==6> active </#if> ${page.plid}" href="/home">${home} </a></li>        
			<li class="nav-item"><a class="nav-link <#if pageId==159> active </#if>" href="/aboutus">${about}</a></li>        
			<li class="nav-item dropdown">
		  <a class="dropdown-toggle nav-link <#if pageId==19 || pageId==21 || pageId==25 || pageId==27 > active </#if>" data-bs-toggle="dropdown" aria-expanded="false">
			${schemes}
		  </a>
		  <ul class="dropdown-menu" style="overflow: inherit;">
			<li><a class="dropdown-item <#if pageId==19> active </#if>" href="/asri">${asri}<span>&rsaquo;</span></a>
			  <ul class="submenu dropdown-menu">
                <li><a class="dropdown-item" href="/web/guest/asri_hospitalsearch">${hospitals}</a></li>
                <li><a class="dropdown-item" href="/web/guest/asri_proceduresearch">${procedures}</a></li>
                 <li><a class="dropdown-item" href="/web/guest/asri_specilitysearch">${speciality_search}</a></li>
				  <li><a class="dropdown-item" href="/web/guest/asri_mitrasearch">${arogya_mitra}</a></li>
              </ul>
			  </li>
				<li><a class="dropdown-item <#if pageId==21> active </#if>" href="/arogyaraksha">${ar}</a>
				<ul class="submenu dropdown-menu">
                <li><a class="dropdown-item" href="/web/guest/arogyaraksha_hospitalsearch">${hospitals}</a></li>
                <li><a class="dropdown-item" href="/web/guest/arogyaraksha_proceduresearch">${procedures}</a></li>
                 <li><a class="dropdown-item" href="/web/guest/arogyaraksha_specilitysearch">${speciality_search}</a></li>
				  <li><a class="dropdown-item" href="/web/guest/arogyaraksha_mitrasearch">${arogya_mitra}</a></li>
              </ul>
				</li>
				<li><a class="dropdown-item <#if pageId==25> active </#if>"  href="/wjhs">${wjhs_short}</a>
				<ul class="submenu dropdown-menu">
                <li><a class="dropdown-item" href="/web/guest/wjhs_hospitalsearch">${hospitals}</a></li>
                <li><a class="dropdown-item" href="/web/guest/wjhs_proceduresearch">${procedures}</a></li>
                 <li><a class="dropdown-item" href="/web/guest/wjhs_specilitysearch">${speciality_search}</a></li>
				  <li><a class="dropdown-item" href="/web/guest/wjhs_mitrasearch">${arogya_mitra}</a></li>
              </ul>
				</li>
				<li><a class="dropdown-item <#if pageId==27> active </#if>" href="/ehs">${ehs_short}</a>
							  <ul class="submenu dropdown-menu">
                <li><a class="dropdown-item" href="/web/guest/ehs_hospitalsearch">${hospitals}</a></li>
                <li><a class="dropdown-item" href="/web/guest/ehs_proceduresearch">${procedures}</a></li>
                 <li><a class="dropdown-item" href="/web/guest/ehs_specilitysearch">${speciality_search}</a></li>
				  <li><a class="dropdown-item" href="/web/guest/ehs_mitrasearch1">${arogya_mitra}</a></li>
              </ul>
				</li>
			  </ul>
			</li>
			<!--<li class="nav-item"><a class="nav-link" href="#">${know_more}</a></li>  -->       
			<li class="nav-item"><a class="nav-link <#if pageId==157> active </#if>" href="/faq">${faq} </a></li>        
			<li class="nav-item"><a class="nav-link <#if pageId==161> active </#if>" href="/contact">${contact}</a></li>
			<li><img src="/o/AarogyaSri-FrontEnd-Theme/images/Ayushman_Bharat_logo.png" alt="Ayushman_Bharat_logo" class="img-fluid ayushman_header_logo" /></li>
        </ul>
      </div>
    </div>
  </nav>
</header>
<main>
	<section class="ysrportal" id="content">
		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>
</main>
	<!--START of footer-->	
	
	 	  
<footer>

      <div class="quick_links">
        <div class="container">
          <h4>Quick Links</h4>
          <div class="row">
            <div class="col">
              <div class="content-grid">
                <div class="row content-grid-row ps-3 pe-3">
                  <div class="content-grid-item col-md-4 col-lg-2 text-center">
                    <a href="https://www.spandana.ap.gov.in/" target="_blank"><img src="https://115.124.110.149/documents/d/guest/1" alt="" class="img-fluid" /></a>
                  </div>
                  <div class="content-grid-item col-md-4 col-lg-2 text-center">
                    <a href="https://gramawardsachivalayam.ap.gov.in/GSWS/Home/Main" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/2.jpg" alt="" class="img-fluid" /></a>
                  </div>
                  <div class="content-grid-item col-md-4 col-lg-2 text-center">
                    <a href="https://apcos.ap.gov.in/" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/3.jpg" alt="" class="img-fluid" /></a>
                  </div>
                  <div class="content-grid-item col-md-4 col-lg-2 text-center">
                    <a href="https://nhsrcindia.org/" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/nhsrc-logo.png" alt="" class="img-fluid" /></a>
                  </div>
                  <div class="content-grid-item col-md-4 col-lg-2 text-center">
                    <a href="https://www.pmjay.gov.in/" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/5.jpg" alt="" class="img-fluid" /></a>
                  </div>
                  <div class="content-grid-item col-md-4 col-lg-2 text-center">
                    <a href="https://eoffice.ap.gov.in/cas/login" target="_blank"><img src="/documents/d/guest/eofficelogo" alt="" class="img-fluid" /></a>
                  </div>
                </div>
              </div>
            </div>
          </div>
          
        </div>
      </div>

	<div class=" top_footer container">
    <div class="row mb-3">
      <div class="col-lg-4">
        <img src="/o/AarogyaSri-FrontEnd-Theme/images/footer_logo.svg" alt="YSR" class="pb-3 img-fluid">
        <p class="mb-2"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="white" class="bi bi-geo-alt-fill" viewBox="0 0 16 16">
  <path d="M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10zm0-7a3 3 0 1 1 0-6 3 3 0 0 1 0 6z"/>
</svg>  ${door_number}. 241,<br /> ${building}, <br />
${chinakakani}, ${mangalagiri}, <br />
${guntur}, <br />
${pin_code}:522503 <br />
		  ${ap}, ${india}</p>
		  <br />
		  <p class="mb-2"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="white" class="bi bi-telephone-fill" viewBox="0 0 16 16">
  <path fill-rule="evenodd" d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z"/>
</svg>  0863-2259861</p>
		  <br />
		 <p class="emergency_no">${call} 
      </div>

      <div class="col-lg-3">
        <h5 class="bordertitle">${services}</h5>
        <ul class="nav flex-column">
            <li><a href="/web/guest/asri">${asri}</a></li> 
			<li><a href="/web/guest/ehs">${ehs}</a></li> 
			<li><a href="/web/guest/wjhs">${wjhs}</a></li> 
			<li><a href="/web/guest/arogyaraksha">${ar}</a></li> 
			<li> <a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ysraarogyasri_app&hl=en&pli=1" target="_blank">${asri_app}</a></li>
			<li> <a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ysr_mithra&hl=en"  target="_blank">${mitra_app}</a></li>
			<li> <a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ehs_app&hl=en" target="_blank">${ehs_app}</a></li>
			
			
        </ul>
      </div>
<!--
      <div class="col-lg-3">
         <h5 class="bordertitle"> Links</h5>
        <ul class="nav flex-column">
            <li><a target="_blank" href="https://treasury.ap.gov.in/aptry/">${ap_treasury_site}</a></li> 
			<li><a target="_blank" href="http://uidai.gov.in/">${aadhar_site}</a></li>
			<li><a href="/web/guest/copyrite-policy">${copyright_policy}</a></li>
			<li><a href="/web/guest/hyperlink-policy">${hyperlink_policy} </a></li>
			<li><a href="/web/guest/terms-conditions">${terms_conditions} </a></li>
			<li><a href="/web/guest/accessibility-statement">${accessibility_statement} </a></li>
			<li><a href="/web/guest/sitemap">${sitemap} </a></li>
        </ul>
      </div>
      -->
      <div class="col-lg-3">
            <h5 class="bordertitle">Useful Links</h5>
            <ul class="nav flex-column">

              <li>
                <a href="https://treasury.ap.gov.in/aptry/">${ap_treasury_site}</a>
              </li>
              <li><a href="https://appointments.uidai.gov.in/?AspxAutoDetectCookieSupport=1">${aadhar_site}</a></li>
              <li>
                <a href="/web/guest/copyright_policy"
                  >${copyright_policy}
                </a>
              </li>
              <li>
                <a href="/web/guest/hyperlink-policy"
                  >${hyperlink_policy}
                </a>
              </li>
              <li>
                <a href="/web/guest/terms_conditions_use"
                  >${terms_conditions}
                </a>
              </li>
              <li>
                <a
                  href="/web/guest/accessibility-statement"
                  >${accessibility_statement}
                </a>
              </li>
              <!--<li><a href="#">${sitemap}</a></li>-->
              <li>
                <a
                  href="https://nhsrcindia.org/"
                  >${nhsrc}
                </a>
              </li>
               <li>
                <a
                  href="http://www.mohfw.nic.in/"
                  >${mohfw}
                </a>
              </li>
            <li>
                <a
                  href="https://cfw.ap.nic.in/"
                  >${cohfw}
                </a>
              </li>
              <li>
                <a
                  href="https://www.nppaindia.nic.in/en/"
                  >${nppa_india}
                </a>
              </li>
            </ul>
          </div>
      
      

      <div class="col-lg-2">
           <h5 class="bordertitle">FIND US ON</h5>
          <div class="d-flex flex-column flex-sm-row w-100 gap-2" style="padding-bottom:5px;">
           <a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ysraarogyasri_app&hl=en&pli=1" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/btn_googlePlay.svg" class="img-fluid" alt="Get on Playstore" /></a>
                 </div>
                
       </div>
    </div>

    
    </div>
	  <div class="copyright">
		 <div class="container">
      &copy;Site maintained by KPMG Advisory Services Pvt. Ltd. (in consortium with SRIT India Pvt. Ltd.). The contents are owned by Govt.of AP,India.</div> 
    </div>		  
  </footer>
<!--End of footer-->	
	  
 
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />
<style>

.portlet-header{
	display:none;
}
 </style>
</body>

</html>