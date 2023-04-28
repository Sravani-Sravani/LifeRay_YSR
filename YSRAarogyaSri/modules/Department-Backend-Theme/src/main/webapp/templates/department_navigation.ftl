<style>
.sidenavclasses {
   /* margin-left: -15px;*/
    position: fixed;
    background-color: #ccc;
    z-index: 1;
    border-right: 1px solid #ccc;
    min-height: 700px;
}

@media screen and (max-width: 768px) {
img.logo-img {
    height: 55px;
    width: 100px !important;
     
}

}
ul.listoful {
    padding-left: 0px;
}
ul.listoful li a {
    padding: 8px 10px;
    display: block;
}
ul.listoful li a:hover {
    padding: 9px 10px;
    background-color: #fff;
    display: block;
}
.copyright-sec p {
    color: #fff;
    margin: 0;
}
.copyright-sec {
    background: #2e2e2e;
    padding: 10px 0px;
    position: fixed;
    text-align: center;
    left: 0;
    bottom: 0;
    width: 100%;
    z-index: 999;
}
.headerlogo {
    display: flex;
    padding: 10px;
    border-bottom: 1px solid #c0bdbd;
}
img.logo-img {
     
    height: 72px;
    width: 170px !important;
    /* border: 1px solid #e9e8e8; */
}
#wrapper{padding-top: 0px;padding:0px;}
span.signoutsec {
    float: right;
}
nav#navigation {
    overflow-y: scroll;
    /*height: 1000px;*/
    max-height: none;
    margin-bottom: 50px;
}
button.btn-createTender:hover{color:#fff;text-decoration: underline;}
.tendersdata-table .btn.btn-primary:hover {
    background-color: #337ab7 !important;
    color: #fff;
    border: 1px solid #fff;
}
.hotooltip {
  position: relative;
  display: inline-block;
  
}

.hotooltip .hotooltiptext {
  visibility: hidden;
  width: 79px;
  background-color: black;
  color: #fff;
  text-align: center;
  border-radius: 6px;
  padding: 5px 3px;
  position: absolute;
  z-index: 1;
  bottom: 120%;
  left: 80%;
  margin-left: -58px;
}

.hotooltip .hotooltiptext::after {
  content: "";
  position: absolute;
  top: 100%;
  left: 50%;
  margin-left: -5px;
  border-width: 5px;
  border-style: solid;
  border-color: black transparent transparent transparent;
}

.hotooltip:hover .hotooltiptext {
  visibility: visible;
}
.tendersdata-table thead tr th {text-align: center;}

 /***********************Firefox issues started************************************/

@-moz-document url-prefix() { 
@media (min-width:992px) {
 .col-md-1,
 .col-md-10,
 .col-md-11,
 .col-md-12,
 .col-md-2,
 .col-md-3,
 .col-md-4,
 .col-md-5,
 .col-md-6,
 .col-md-7,
 .col-md-8,
 .col-md-9 {
  float:none;
 }
 }
} 

 /***********************Firefox issues Ended************************************/
 
  @keyframes swing {
  0% {
    transform: rotate(0deg);
  }
  10% {
    transform: rotate(10deg);
  }
  30% {
    transform: rotate(0deg);
  }
  40% {
    transform: rotate(-10deg);
  }
  50% {
    transform: rotate(0deg);
  }
  60% {
    transform: rotate(5deg);
  }
  70% {
    transform: rotate(0deg);
  }
  80% {
    transform: rotate(-5deg);
  }
  100% {
    transform: rotate(0deg);
  }
}

@keyframes sonar {
  0% {
    transform: scale(0.9);
    opacity: 1;
  }
  100% {
    transform: scale(2);
    opacity: 0;
  }
}
 
.page-wrapper .sidebar-wrapper,
.sidebar-wrapper .sidebar-brand > a,
.sidebar-wrapper .sidebar-dropdown > a:after,
.sidebar-wrapper .sidebar-menu .sidebar-dropdown .sidebar-submenu li a:before,
.sidebar-wrapper ul li a i,
.page-wrapper .page-content,
.sidebar-wrapper .sidebar-search input.search-menu,
.sidebar-wrapper .sidebar-search .input-group-text,
.sidebar-wrapper .sidebar-menu ul li a,
#show-sidebar,
#close-sidebar {
  -webkit-transition: all 0.3s ease;
  -moz-transition: all 0.3s ease;
  -ms-transition: all 0.3s ease;
  -o-transition: all 0.3s ease;
  transition: all 0.3s ease;
}

/*----------------page-wrapper----------------*/

.page-wrapper {
  height: 100vh;
}

.page-wrapper .theme {
  width: 40px;
  height: 40px;
  display: inline-block;
  border-radius: 4px;
  margin: 2px;
}

.page-wrapper .theme.chiller-theme {
  background: #1e2229;
}

/*----------------toggeled sidebar----------------*/

.page-wrapper.toggled .sidebar-wrapper {
  left: 0px;
}

@media screen and (min-width: 768px) {
  .page-wrapper.toggled .page-content {
    padding-left: 260px;
  }
}
/*----------------show sidebar button----------------*/
#show-sidebar {
  position: fixed;
  left: 0;
  top: 10px;
  z-index: 1;
  border-radius: 0 4px 4px 0px;
  width: 35px;
  transition-delay: 0.3s;
      display: block !important;
}
.page-wrapper.toggled #show-sidebar {
  left: -40px;
}
/*----------------sidebar-wrapper----------------*/

.sidebar-wrapper {
  width: 260px;
  height: 100%;
  max-height: 100%;
  position: fixed;
  top: 0;
  left: -300px;
  z-index: 999;
}

.sidebar-wrapper ul {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

.sidebar-wrapper a {
  text-decoration: none;
}

/*----------------sidebar-content----------------*/

.sidebar-content {
  max-height: calc(100% - 30px);
  height: calc(100% - 30px);
  overflow-y: auto;
  position: relative;
}

.sidebar-content.desktop {
  overflow-y: hidden;
}

/*--------------------sidebar-brand----------------------*/

.sidebar-wrapper .sidebar-brand {
  padding: 0px 20px;
  display: block !important;
  text-align: right;
  align-items: center;
}

.sidebar-wrapper .sidebar-brand > a {
  text-transform: uppercase;
  font-weight: bold;
  flex-grow: 1;
}

.sidebar-wrapper .sidebar-brand #close-sidebar {
  cursor: pointer;
  font-size: 20px;
}
/*--------------------sidebar-header----------------------*/

.sidebar-wrapper .sidebar-header {
  padding:5px 20px;
  overflow: hidden;
}

.sidebar-wrapper .sidebar-header .user-pic {
  float: left;
  /*width: 60px;*/
  padding: 2px;
  border-radius: 12px;
  margin-right: 15px;
  overflow: hidden;
}

.sidebar-wrapper .sidebar-header .user-pic img {
  object-fit: cover;
  height: 100%;
  width: 100%;
}

.sidebar-wrapper .sidebar-header .user-info {
  float: left;
}

.sidebar-wrapper .sidebar-header .user-info > span {
  display: block;
}

.sidebar-wrapper .sidebar-header .user-info .user-role {
  font-size: 12px;
}

.sidebar-wrapper .sidebar-header .user-info .user-status {
  font-size: 11px;
  margin-top: 4px;
}

.sidebar-wrapper .sidebar-header .user-info .user-status i {
  font-size: 8px;
  margin-right: 4px;
  color: #5cb85c;
}

 

/*--------------------------page-content-----------------------------*/

.page-wrapper .page-content {
  display: inline-block;
  width: 100%;
  padding-left: 0px;
  padding-top: 20px;
}

.page-wrapper .page-content > div {
  padding: 0px 40px;
}

.page-wrapper .page-content {
  overflow-x: hidden;
}

/*------scroll bar---------------------*/

::-webkit-scrollbar {
  width: 5px;
  height: 7px;
}
::-webkit-scrollbar-button {
  width: 0px;
  height: 0px;
}
::-webkit-scrollbar-thumb {
  background: #525965;
  border: 0px none #ffffff;
  border-radius: 0px;
}
::-webkit-scrollbar-thumb:hover {
  background: #525965;
}
::-webkit-scrollbar-thumb:active {
  background: #525965;
}
::-webkit-scrollbar-track {
  background: transparent;
  border: 0px none #ffffff;
  border-radius: 50px;
}
::-webkit-scrollbar-track:hover {
  background: transparent;
}
::-webkit-scrollbar-track:active {
  background: transparent;
}
::-webkit-scrollbar-corner {
  background: transparent;
}


/*-----------------------------chiller-theme-------------------------------------------------*/

.chiller-theme .sidebar-wrapper {
    background: #ccc;
}

.chiller-theme .sidebar-wrapper .sidebar-header,
.chiller-theme .sidebar-wrapper .sidebar-search,
.chiller-theme .sidebar-wrapper .sidebar-menu {
    border-top: 1px solid #dddbdb;
}

.chiller-theme .sidebar-wrapper .sidebar-search input.search-menu,
.chiller-theme .sidebar-wrapper .sidebar-search .input-group-text {
    border-color: transparent;
    box-shadow: none;
}

.chiller-theme .sidebar-wrapper .sidebar-header .user-info .user-role,
.chiller-theme .sidebar-wrapper .sidebar-header .user-info .user-status,
.chiller-theme .sidebar-wrapper .sidebar-search input.search-menu,
.chiller-theme .sidebar-wrapper .sidebar-search .input-group-text,
.chiller-theme .sidebar-wrapper .sidebar-brand>a,
.chiller-theme .sidebar-wrapper .sidebar-menu ul li a,
.chiller-theme .sidebar-footer>a {
    color: #000;
}

.chiller-theme .sidebar-wrapper .sidebar-menu ul li:hover>a,
.chiller-theme .sidebar-wrapper .sidebar-menu .sidebar-dropdown.active>a,
.chiller-theme .sidebar-wrapper .sidebar-header .user-info,
.chiller-theme .sidebar-wrapper .sidebar-brand>a:hover,
.chiller-theme .sidebar-footer>a:hover i {
    color: #b8bfce;
}

.page-wrapper.chiller-theme.toggled #close-sidebar {
    color: #bdbdbd;
}

.page-wrapper.chiller-theme.toggled #close-sidebar:hover {
    color: #ffffff;
}

.chiller-theme .sidebar-wrapper ul li:hover a i,
.chiller-theme .sidebar-wrapper .sidebar-dropdown .sidebar-submenu li a:hover:before,
.chiller-theme .sidebar-wrapper .sidebar-search input.search-menu:focus+span,
.chiller-theme .sidebar-wrapper .sidebar-menu .sidebar-dropdown.active a i {
    color: #16c7ff;
    text-shadow:0px 0px 10px rgba(22, 199, 255, 0.5);
}

.chiller-theme .sidebar-wrapper .sidebar-menu ul li a i,
.chiller-theme .sidebar-wrapper .sidebar-menu .sidebar-dropdown div,
.chiller-theme .sidebar-wrapper .sidebar-search input.search-menu,
.chiller-theme .sidebar-wrapper .sidebar-search .input-group-text {
    background: #d9dadb;
}

.chiller-theme .sidebar-wrapper .sidebar-menu .header-menu span {
    color: #6c7b88;
}

.chiller-theme .sidebar-footer {
    background: #3a3f48;
    box-shadow: 0px -1px 5px #282c33;
    border-top: 1px solid #464a52;
}

.chiller-theme .sidebar-footer>a:first-child {
    border-left: none;
}

.chiller-theme .sidebar-footer>a:last-child {
    border-right: none;
}
.fa-times:before {
    content: "\f00d";
    color: #727171;
}
.taglib-page-iterator .search-results {
    float: left;
    line-height: 35px;
    margin-left: 10px;
}
.taglib-page-iterator .lfr-pagination-config {
    float: left;
    line-height: 0px;
}
li.selected.anchoroful{background-color: #fff;}
.anchoroful{width:100%;}

.sheet-header {
    margin-bottom: 10px !important;
}
.sheet.sheet-lg {
    border: none;
    max-width: 500px;
    background-color: #4f4f49 !important;
    color: #fff;
}
.btn-monospaced { 
    display: none;
}
button#rfis {
    width: 100%;
    background-color: #83C127 !important;
}
.sheet.sheet-lg .text-truncate {
    display: none;
}
@media screen and (min-width: 768px) and (max-width: 991.99px) {
.taglib-page-iterator .lfr-pagination-buttons > li {width: 29%;}
.taglib-page-iterator .lfr-pagination-buttons{width: 72%;}
}
@media screen and (min-width: 425px) and (max-width: 767.99px) {
.taglib-page-iterator .lfr-pagination-buttons > li {width: 27%;}
.taglib-page-iterator .lfr-pagination-buttons{
	width: 84%;
	margin-top: 0px;
}
}
@media screen and (min-width: 320px) and (max-width: 424.99px) {
.taglib-page-iterator .lfr-pagination-buttons > li {width: 30%;}
.taglib-page-iterator .lfr-pagination-buttons{
	width: 100%;
	margin-top: 0px;
}
}

@media screen and (min-width: 320px) and (max-width: 991.99px) {
.taglib-page-iterator .lfr-pagination-buttons > li > a{padding: 6px 19px;}
}
</style>
 <nav class="smartcity-nav navbar navbar-expand-md" >
  
          <div class="collapse mainmenunavbar navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
       <!-- <li class=" anchoroful" id="layout_59" role="presentation">
         <a aria-labelledby="layout_59" href="/web/guest/dashboard" role="menuitem"><span class="tendermenutext"> Dashboard</span></a>
        </li> -->
         <li  class="anchoroful">
            <a href="/web/guest/manage-alert" class="${page.plid}  active  nav-link Complaitsec">Manage
 Alert</a>
        </li>
         <li  class="anchoroful">
            <a href="/web/guest/manage_who-is-who" class="${page.plid}  active  nav-link Complaitsec">Manage Who is Who</a>
        </li>
         <li  class="anchoroful">
            <a href="/web/guest/news-and-events1" class="${page.plid}  active  nav-link Complaitsec">News and Events</a>
        </li>
        </ul>
    </div>
  </nav>