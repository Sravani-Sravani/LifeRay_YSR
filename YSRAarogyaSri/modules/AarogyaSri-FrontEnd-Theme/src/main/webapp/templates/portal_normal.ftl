<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">
 
<head>

   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script async src="https://api.countapi.xyz/hit/ysraarogyasri.ap.gov.in/892a2160-7ba7-4d80-b413-4555bc7f6372?callback=websiteVisits"></script>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Dr. YSR Aarogyasri Health Care Trust</title>
    <link rel="icon" type="image/x-icon" href="/documents/d/guest/favicon">
    <meta content="initial-scale=1.0, width=device-width" name="viewport" />  
	  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

	  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
	
	<link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">	  
	 <!-- Libraries Stylesheet -->

<@liferay_util["include"] page=top_head_include />


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
 <link href="/o/AarogyaSri-FrontEnd-Theme/css/style.css" rel="stylesheet" />
<link href="/o/AarogyaSri-FrontEnd-Theme/css/newfilestyle.css" rel="stylesheet" />
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
		<div class="container-fluid">
		
		<div class="row align-items-center">
		
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
<p class="blink-bg"><a href="tel:104"><span class="btn btn-sm"><i class="fa-regular fa-phone"></i> 104 - ${medical} </span></a></p>

				 <p class="btn btn-success btn-sm"><i class="fa-regular fa-right-to-bracket"></i><a href="/web/guest/signin">${sign_in}</a></p>      
				 <p class="btn btn-success btn-sm"><i class="fa-regular fa-virus-covid"></i> <a href="/web/guest/covid_19">${covid}</a></p>    
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


  <nav class="navbar navbar-expand-md">
    <div class="container-fluid">
      <a class="navbar-brand" href="/home"><img src="/documents/d/guest/logo1" alt="Dr. YSR Aarogyasri Health Care Trust" class="img-fluid" /></a>
            <a class="navbar-brandg20" href="https://www.g20.org/en/" target="_blank"><img src="https://ysraarogyasri.ap.gov.in/documents/d/guest/g20-logo" style="width:60px; height:32px; "alt="" class="img-fluid" /></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span> MAIN MENU
     
     
      </button>
      <div class="collapse navbar-collapse justify-content-end" id="navbarCollapse">
        <ul class="navbar-nav mb-2 mb-md-0">
			<li class="nav-item"><a class="nav-link <#if pageId==6> active </#if> ${page.plid}" href="/home">${home} </a></li>        
			
		<li class="nav-item"><a class="nav-link <#if pageId==159> active </#if>" href="/aboutus">${about}</a></li>        
			
			<li class="nav-item dropdown">
		  <a class="nav-link dropdown-toggle <#if pageId==19 || pageId==21 || pageId==25 || pageId==27 > active </#if>" data-bs-toggle="dropdown" aria-expanded="false">
			${schemes}
		  </a>
		  <ul class="dropdown-menu">
			<li><a class="dropdown-item <#if pageId==19> active </#if>" href="/asri" >${asri}<span></span></a>
			  </li>
				<li><a class="dropdown-item <#if pageId==27> active </#if>" href="/ehs">${ehs_short}</a>
				</li>
			<li><a class="dropdown-item <#if pageId==599> active </#if>" href="/web/guest/aarogya-aasara" >${aasara}<span></span></a>
			  </li>
			  <li><a class="dropdown-item <#if pageId==21> active </#if>" href="/arogyaraksha">${ar}</a>
				
				</li>
				<li><a class="dropdown-item <#if pageId==25> active </#if>"  href="/wjhs">${wjhs_short}</a>
				</li>
				
			  </ul>
			</li>
			
			
		<li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle <#if pageId==589 || pageId==585 ||pageId==593 || pageId==595 > active </#if>" data-bs-toggle="dropdown" aria-expanded="false">${netwrk}</a>
        <ul class="dropdown-menu">
        <li><a class="dropdown-item" <#if pageId==589> active </#if> href="/web/guest/search-by-geography">${asri}</a></li>
        <li><a class="dropdown-item"  <#if pageId==585> active </#if> href="/web/guest/ehs-v4">${ehs_short}</a></li>
         </ul>
      </li> 
      
            <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle <#if pageId==517 || pageId==495 > active </#if>" data-bs-toggle="dropdown" aria-expanded="false">${treatments}</a>
        <ul class="dropdown-menu">
        <li><a class="dropdown-item" <#if pageId==517> active </#if> href="/web/guest/asri_proceduresearch">${asri}</a></li>
          <li><a class="dropdown-item" <#if pageId==495> active </#if> href="/web/guest/ehs_proceduresearch">${ehs_short}</a></li>
         </ul>
      </li>  
			<!--<li class="nav-item"><a class="nav-link" href="#">${know_more}</a></li>  --> 
		      
			<li class="nav-item"><a class="nav-link <#if pageId==157> active </#if>" href="/faq">${faq} </a></li>        
			
			<li class="nav-item"><a class="nav-link <#if pageId==161> active </#if>" href="/contact">${contact}</a></li>
<li><a href="https://pmjay.gov.in/" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/Ayushman_Bharat_logo.png" alt="Ayushman_Bharat_logo" class="img-fluid ayushman_header_logo" /></a></li>

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


<button onclick="topFunction()" id="myBtn" title="Go to top"><i class="fa-regular fa-chevrons-up"></i></button>

<script>
let mybutton = document.getElementById("myBtn");

<button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>
<script>
// Get the button
let mybutton = document.getElementById("myBtn");

// When the user scrolls down 20px from the top of the document, show the button 
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}

</script>		

      <div class="quick_links">
        <div class="container-fluid">
          <h4>Quick Links</h4>
          <div class="row">
            <div class="col">
              <div class="content-grid">
                <div class="row content-grid-row ps-3 pe-3">
                  <div class="content-grid-item col-md-4 col-lg-2 text-center">
                    <a href="https://www.spandana.ap.gov.in/" target="_blank"><img src="/documents/d/guest/1" alt="" class="img-fluid" /></a>
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
                    <a href="https://eoffice.ap.gov.in/cas/login" target="_blank"><img src="https://ysraarogyasri.ap.gov.in/documents/d/guest/elogo" alt="" class="img-fluid" /></a>
                  </div>
                </div>
              </div>
            </div>
          </div>
          
        </div>
      </div>

	<div class=" top_footer container-fluid">
    <div class="row">
      <div class="col-lg-4">
        <img src="/o/AarogyaSri-FrontEnd-Theme/images/footer_logo.svg" alt="YSR" class="footer_logo img-fluid">
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
		 
      </div>

      <div class="col-lg-3">
        <h5 class="bordertitle">${services}</h5>
        <ul class="nav flex-column">
            <li><a href="/web/guest/asri" target="_blank">${asri}</a></li> 
			<li><a href="/web/guest/ehs" target="_blank">${ehs}</a></li> 
			<li><a href="/web/guest/wjhs" target="_blank">${wjhs}</a></li> 
			<li><a href="/web/guest/arogyaraksha" target="_blank">${ar}</a></li> 
			<li> <a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ysraarogyasri_app&hl=en&pli=1" target="_blank">${asri_app}</a></li>
			<li> <a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ysr_mithra&hl=en" target="_blank">${mitra_app}</a></li>
			<li> <a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ehs_app&hl=en" target="_blank">${ehs_app}</a></li>
			
			
        </ul>
      </div>
<!--
      <div class="col-lg-3">
         <h5 class="bordertitle"> Links</h5>
        <ul class="nav flex-column">
            <li><a href="https://treasury.ap.gov.in/aptry/" target="_blank">${ap_treasury_site}</a></li> 
			<li><a href="http://uidai.gov.in/" target="_blank">${aadhar_site}</a></li>
			<li><a href="/web/guest/copyrite-policy" target="_blank">${copyright_policy}</a></li>
			<li><a href="/web/guest/hyperlink-policy" target="_blank">${hyperlink_policy} </a></li>
			<li><a href="/web/guest/terms-conditions" target="_blank">${terms_conditions} </a></li>
			<li><a href="/web/guest/accessibility-statement" target="_blank">${accessibility_statement} </a></li>
			<li><a href="/web/guest/sitemap" target="_blank">${sitemap} </a></li>
        </ul>
      </div>
      -->
      <div class="col-lg-3">
            <h5 class="bordertitle">${links}</h5>
            <ul class="nav flex-column">
            

              <li>
                <a href="https://treasury.ap.gov.in/aptry/" target="_blank">${ap_treasury_site}</a>
              </li>
              <li><a href="https://appointments.uidai.gov.in/?AspxAutoDetectCookieSupport=1" target="_blank">${aadhar_site}</a></li>
              <li>
                <a href="/web/guest/copyright_policy" target="_blank"
                  >${copyright_policy}
                </a>
              </li>
              <li>
                <a href="/web/guest/hyperlink-policy" target="_blank"
                  >${hyperlink_policy}
                </a>
              </li>
              <li>
                <a href="/web/guest/terms_conditions_use" target="_blank"
                  >${terms_conditions}
                </a>
              </li>
              <li>
                <a
                  href="/web/guest/accessibility-statement" target="_blank"
                  >${accessibility_statement}
                </a>
              </li>
              <!--<li><a href="#">${sitemap}</a></li>-->
              <li>
                <a
                  href="https://nhsrcindia.org/" target="_blank"
                  >${nhsrc}
                </a>
              </li>
               <li>
                <a
                  href="http://www.mohfw.nic.in/" target="_blank"
                  >${mohfw}
                </a>
              </li>
            <li>
                <a
                  href="https://cfw.ap.nic.in/" target="_blank"
                  >${cohfw}
                </a>
              </li>
              <li>
                <a
                  href="https://www.nppaindia.nic.in/en/" target="_blank"
                  >${nppa_india}
                </a>
              </li>
            </ul>
          </div>
  <script>

function increaser(){
    $.getJSON("https://api.countapi.xyz/hit/ysraarogyasri.ap.gov.in/visits", function(response) {
        $("#visits").text(response.value);
    });
}

function reader(){
    $.getJSON("https://api.countapi.xyz/get/ysraarogyasri.ap.gov.in/visits", function(response) {
        $("#visits").text(response.value);
    });
}

//Invoke jquery if aarogyasri url for home page matches
//alert(window.location.href); //-> Get Current Page URL before validation

if(window.location.href === "https://www.ysraarogyasri.ap.gov.in/"){
    increaser(); // Increase counter on asri homepage url only.
}

// For this statement, any page which loads the footer but is not HomePage will show count as blank.
// Lets add a read-count mode

else{
    reader(); // Read counter value without incrementing
}



/*
// For Custom Developed API, Replace JQuery with this JS KPMG Function [where response == getjsonClass.value]
function websiteVisits(response) {
    document.querySelector("#visits").textContent = response.value;
}
*/


</script>

<!--
<p> <span id="visits"></span> times.</p>
-->
  

      <div class="col-lg-2">
           <h5 class="bordertitle">${find}</h5>
           <p><a href="https://play.google.com/store/apps/details?id=com.sritindiapvtltd.ysraarogyasri_app&hl=en&pli=1" target="_blank"><img src="/o/AarogyaSri-FrontEnd-Theme/images/btn_googlePlay.svg" class="img-fluid" alt="Get on Playstore" /></a></p>
                 <p class="visits"> ${visitors} : <span id="visits"></span> </p>            
       </div>

   </div>
    </div>
	  <div class="copyright">
		 <div class="container-fluid">
      &copy;Site maintained by KPMG Advisory Services Pvt. Ltd. (in consortium with SRIT India Pvt. Ltd.). The contents are owned by Govt.of AP,India.
      </div> 
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