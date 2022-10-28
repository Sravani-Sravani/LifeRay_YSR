<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">
 
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Dr. YSR Aarogyasri Health Care Trust</title>
<meta content="initial-scale=1.0, width=device-width" name="viewport" />
  
     
	  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

	  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
	
	<link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@400;700&family=Roboto:wght@400;700&display=swap" rel="stylesheet"> 	  
	 <!-- Libraries Stylesheet -->
   
<@liferay_util["include"] page=top_head_include />
<link href="/o/AarogyaSri-FrontEnd-Theme/css/style.css" rel="stylesheet" />

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
<#assign pageId = page.plid>
<div id="wrapper">
	<header class="main_ysriHeader">
	<div class="header_topbar px-1">	
	   <div class="container-fluid">
		  <span class="rounded-circle px-2 py-1 bg-black"><i class="bi bi-telephone"></i></span>104 | <div class="btn btn-success btn-sm">SIGN IN</div>
	</div></div><!--TOPBAR-->
  <nav id="main_navbar" class="navbar navbar-expand-md">
    <div class="container-fluid">
      <a class="navbar-brand" href="/home"><img src="/o/AarogyaSri-FrontEnd-Theme/images/logo.svg" alt="Dr. YSR Aarogyasri Health Care Trust" class="img-fluid" /></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-end" id="navbarCollapse">
        <ul class="navbar-nav mb-2 mb-md-0">
			<li class="nav-item"><a class="nav-link <#if pageId==6> active </#if> ${page.plid}" href="/home">Home </a></li>        
			<li class="nav-item"><a class="nav-link" href="#">About</a></li>        
			<li class="nav-item dropdown">
		  <a class="dropdown-toggle nav-link <#if pageId==29> active </#if>" data-bs-toggle="dropdown" aria-expanded="false">
			Schemes
		  </a>
		  <ul class="dropdown-menu" style="overflow: inherit;">
			<li><a class="dropdown-item <#if pageId==29> active </#if>" href="/asri">Dr. YSR Aarogyasri<span>&rsaquo;</span></a>
			  <ul class="submenu dropdown-menu">
                <li><a class="dropdown-item" href="#">Hospitals</a></li>
                <li><a class="dropdown-item" href="#">Procedures</a></li>
				  <li><a class="dropdown-item" href="#">Aarogya mitra</a></li>
              </ul>
			  </li>
				<li><a class="dropdown-item" href="#">Aarogya Raksha</a></li>
				<li><a class="dropdown-item" href="#">WJHS</a></li>
				<li><a class="dropdown-item" href="#">EHS</a></li>
			  </ul>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">Know More</a></li>         
			<li class="nav-item"><a class="nav-link" href="#">FAQ </a></li>        
			<li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
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
				 <h4 class="bordertitle container" style="width:16%">Useful Links</h4>
				<div class="row mb-3">
    			  <div class="col-lg-2"><a href="https://www.spandana.ap.gov.in/" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/1.jpg" alt="" class="img-fluid importantLinks" /></a></div>
				  <div class="col-lg-2"><a href="https://gramawardsachivalayam.ap.gov.in/GSWS/Home/Main" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/2.jpg" alt="" class="img-fluid importantLinks"  /></a></div>
					<div class="col-lg-2"><a href="https://apcos.ap.gov.in/" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/3.jpg" alt="" class="img-fluid importantLinks"  /></a></div>
					<div class="col-lg-2"><a href="https://nhsrcindia.org/" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/nhsrc-logo.png" alt="" class="img-fluid importantLinks" /></a></div>
					<div class="col-lg-2"><a href="https://www.pmjay.gov.in/" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/5.jpg" alt="" class="img-fluid importantLinks"  /></a></div>
					<div class="col-lg-2"><a href="https://eoffice.ap.gov.in/cas/login" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/quicklinks/6.jpg" alt="" class="img-fluid importantLinks"  /></a></div>
					</div>	
				</div>	
		</div>


	<div class=" top_footer container">
    <div class="row mb-3">
      <div class="col-lg-4">
        <img src="/o/AarogyaSri-FrontEnd-Theme/images/footer_logo.svg" alt="YSR" class="pb-3 img-fluid">
        <p class="mb-2"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="white" class="bi bi-geo-alt-fill" viewBox="0 0 16 16">
  <path d="M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10zm0-7a3 3 0 1 1 0-6 3 3 0 0 1 0 6z"/>
</svg>  Door No. � 241,<br /> MGM Capital Building, <br />
Chinnakakani, Mangalagiri, <br />
Guntur Dist, <br />
Pin:522503 <br />
		  Andhra Pradesh, India</p>
		  <br />
		  <p class="mb-2"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="white" class="bi bi-telephone-fill" viewBox="0 0 16 16">
  <path fill-rule="evenodd" d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z"/>
</svg>  0863-2259861</p>
		  <br />
		  <div class="btn btn-success">Call 104 for any information to the schemes of Trust</div>
      </div>

      <div class="col-lg-3">
        <h5 class="bordertitle">Services</h5>
        <ul class="nav flex-column">
            <li><a href="/asri">Dr.YSR Aarogyasri</a></li> 
			<li><a href="#">Employee Health Scheme</a></li> 
			<li><a href="#">Working Journalist Health Scheme</a></li> 
			<li><a href="#">Aarogya-Raksha</a></li> 
			
			<!--<li><a href="#">Aarogyashri App</a></li> 
			<li><a href="#">Mitra App</a></li> 
			<li><a href="#">EHS App</a></li> -->
        </ul>
      </div>

      <div class="col-lg-3">
         <h5 class="bordertitle">Useful Links</h5>
        <ul class="nav flex-column">
            <li><a href="#">AP Treasury Site</a></li> 
			<li><a href="#">Aadhar Site </a></li>
			<li><a href="#">Copyright Policy </a></li>
			<li><a href="#">Hyperlink Policy </a></li>
			<li><a href="#">Terms and Conditions </a></li>
			<li><a href="#">Accessibility Statement </a></li>
			<li><a href="#">Sitemap</a></li>
        </ul>
      </div>

      <div class="col-lg-2">
           <h5 class="bordertitle">FIND US ON</h5>
          <div class="d-flex flex-column flex-sm-row w-100 gap-2" style="padding-bottom:5px;">
           <img src="/o/AarogyaSri-FrontEnd-Theme/images/btn_googlePlay.svg" class="img-fluid" alt="Get on Playstore" />
                 </div>
          <div>
             <ul class="nav flex-column">
                <li><a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ysraarogyasri_app&amp;hl=en" target="_blank">Aarogyasri App</button></a></li>
                <li><a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ysr_mithra&amp;hl=en" target="_blank">Mithra App</button></a></li>
				<li><a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ehs_app&amp;hl=en" target="_blank">EHS App</button></a></li>
		     </ul>
		     </div>
       </div>
    </div>

    
    </div>
	  <div class="copyright">
		 <div class="container">
      &copy; Site Maintained By KPMG Advisory Services Pvt. Ltd. (In Consortium With SRIT India Pvt. Ltd.). The Contents Are Owned By Govt.Of AP, India.</div> 
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
.importantLinks{
position: relative;
    overflow: hidden;
    box-shadow: 0.1rem 0.1rem 1rem rgb(0 0 0 / 10%);
    background-color: #fff;
    min-height: 150px;
    border-radius: 6px;
    box-shadow: 0px 0px 9px #00274d;
    }
   .card-body{
         
element.style {
}

</style>
</body>

</html>