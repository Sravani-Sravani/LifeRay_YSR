<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.kpmg.customtables.service.NewsAndEventsLocalServiceUtil"%>
<%@page import="com.kpmg.customtables.model.NewsAndEvents"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.kpmg.newsandevents.portlet.NewsAndEventsPortlet"%> 
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="/init.jsp" %>


<style>
.alert-notifications{
display:none;
} 
.alert-notifications-fixed{
display:none;
} 
</style>
<%
//System.out.println(".getURLCurrent()()>>>"+themeDisplay.getURLCurrent());

String pageUrl=themeDisplay.getURLCurrent();
//System.out.println("pageUrl>>>"+pageUrl);
if(!role.equalsIgnoreCase("Departmentuser")){
	%>
	
	<link crossorigin="anonymous" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" integrity="sha512-tS3S5qG0BlhnQROyJXvNjeEM4UpMXHrQfTGmbQ1gKmelCxlSEBUaxhRBj/EFTzpbP4RVSrpEikbmdJobCvhE3g==" referrerpolicy="no-referrer" rel="stylesheet">
<link crossorigin="anonymous" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.theme.default.min.css" integrity="sha512-sMXtMNL1zRzolHYKEujM2AqCLUR9F2C4/05cdbxjjLSRvMQIciEPCQZo++nk7go3BtSuK9kfa/s+a4f4i5pLkw==" referrerpolicy="no-referrer" rel="stylesheet">

<%
themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId=themeDisplay.getPlid();
//System.out.println("pageId="+pageId);

if(pageId==6){ %>

<section class="newsEvents_section">
<div class="container-fluid">
  <h2 class="text-start">Latest News &amp; <span>Events</span></h2>
  
<div class="row">
<div class="col-lg-4">
<section class="spotlight p-4">
<h3 class="bordertitle">Spotlight</h3>
<marquee direction="up" scrolldelay="300" class="spotlight_section" id="scroll_news"><div onmouseover="document.getElementById('scroll_news').stop();" onmouseout="document.getElementById('scroll_news').start();">
<ul class="spotlight_news"> 

<%
 	List<NewsAndEvents> resultList=null;
 //int size=NewsAndEventsLocalServiceUtil.getNewsAndEventsesCount();
 //List<NewsAndEvents> NewsAndEventsList =NewsAndEventsLocalServiceUtil.getNewsAndEventses(0, size) ;
   DynamicQuery dynamicQuery = null; 
 				dynamicQuery =NewsAndEventsLocalServiceUtil.dynamicQuery(); 				
 				
                       dynamicQuery.add(RestrictionsFactoryUtil.eq("spotlight", 1));
                       dynamicQuery.addOrder(OrderFactoryUtil.desc("newsDate"));          
 		List<NewsAndEvents> newsAndEventsList =null;
 		try{
 			newsAndEventsList=NewsAndEventsLocalServiceUtil.dynamicQuery(dynamicQuery, 0,
 				NewsAndEventsLocalServiceUtil.getNewsAndEventsesCount());
 		}
 		catch(Exception e){
 			
 		}
 		try{
 		  
 		for (NewsAndEvents newsAndEvents : newsAndEventsList) {
 			long newsId = 0L;
 			String newsDescription = "";
 			String publishDate = "";
 			long fileEntryId = 0L;
 			String fileUrl = "";
 			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
 			try {

 				newsId = newsAndEvents.getNewsId();
 				newsDescription = newsAndEvents.getNewsdescription();
 				fileEntryId = newsAndEvents.getFileEntryId();
 				if (fileEntryId != 0L) {
 					try {
 						fileUrl = NewsAndEventsPortlet.getFile(fileEntryId, themeDisplay.getScopeGroupId());
 					} catch (Exception e) {

 					}
 				}
 				try {
 					Date dt = newsAndEvents.getNewsDate();
 					publishDate = sdf.format(dt);
 				} catch (Exception e) {
 					//e.printStackTrace();
 				}

 			} catch (Exception e) {
 				//e.printStackTrace();
 			}
 %>

<li><span class="fw-bold"><%=publishDate %> </span><br><%=newsDescription %>
<% if(fileUrl!=null && fileUrl!=""){ %><a href="<%=fileUrl %>" target="_blank">( Click here to download)</a>&nbsp;<% } %></li>
<% } }catch(Exception e){} %>    </ul>
</div></marquee>
  </section>
</div>
  
<!-- /.col-lg-4 -->

<div class="col-lg-8">
          <h3 class="bordertitlegreen">News &amp; Events</h3>
  <p class="clearfix archive_btn"><a href="https://ysraarogyasri.ap.gov.in/archives" class="float-end btn btn-success btn-sm" target="_blank">Archives</a></p>
  <div class="owl-carousel owl-theme newsScroller owl-loaded owl-drag">

  
   <div class="owl-stage-outer">
      <div class="owl-stage" style="transform: translate3d(-9286px, 0px, 0px); transition: all 0.25s ease 0s; width: auto;">

  <%  
  DynamicQuery dynamicQuery1 = null;
	dynamicQuery1 = NewsAndEventsLocalServiceUtil.dynamicQuery();
	dynamicQuery1.add(RestrictionsFactoryUtil.eq("home", 1));
	dynamicQuery1.addOrder(OrderFactoryUtil.desc("newsDate"));
	List<NewsAndEvents> newsAndEventsList1 =null;
	try{
	   newsAndEventsList1 = NewsAndEventsLocalServiceUtil.dynamicQuery(dynamicQuery1, 0,
			NewsAndEventsLocalServiceUtil.getNewsAndEventsesCount());
	}
	catch(Exception e)
	{}
  try
  {
   for(NewsAndEvents newsAndEvents:newsAndEventsList1)
   {
    long newsId =0L;
  	String newsDescription ="";
  	String publishDate1="";
  	long fileEntryId=0L;
  	String fileUrl="";
  	String nd="";
  	SimpleDateFormat sdf1 = new SimpleDateFormat("MMM ''yy");
  	 int day=0;
  	try{
  	
  	      newsId =newsAndEvents.getNewsId();
  		  newsDescription =newsAndEvents.getNewsdescription();
  		  nd=newsDescription.replace('"',' ');
  		  fileEntryId=newsAndEvents.getFileEntryId();
      	  if(fileEntryId!=0L){
				try{
					fileUrl = NewsAndEventsPortlet.getFile(fileEntryId, themeDisplay.getScopeGroupId());	  
				}
				catch(Exception e){
					
				}
      	  }
      	 
        try{
			Date dt = newsAndEvents.getNewsDate();
			publishDate1 = sdf1.format(dt);
			day=dt.getDate();
		}catch(Exception e){
			//e.printStackTrace();
		}
               
}catch(Exception e){
//e.printStackTrace();
}
  
%>
            <div class="owl-item active" style="width: 230.983px; margin-right: 20px;">
            
            <div class="item">

      <div class=" card ">

        <div class=" card-body card-main-box">

    <div class="card-title text-center fw-bold card-top-box">

      <p class="card-top-box-p1"><%=publishDate1 %></p>

      <p class=" card-top-box-p2"><%=day %></p>

    </div>

    <p class="card-text card-text-p">
    <% if(newsDescription.length()>120){ %> 
<%= newsDescription.substring(0, 120)+". . . " %>
<% }else{ %><%= newsDescription %><% } %>
    
    </p>

  <% if(fileUrl!=null && fileUrl!=""){ %>
  <div class="btn_downloadnews">
<a href="<%=fileUrl%>" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-original-title="<%=nd%>" >Download</a>
</div>
    <% } %>

  </div>

</div>

</div></div>
<% }
}
catch(Exception e)
{
}
  
  %>
    
                      
         
    </div></div>
    
    
    
    <div class="owl-nav">
     </div><div class="owl-dots disabled"></div></div><!--News & Events-->
     
</div><!-- end of col-lg-8 -->

    <!-- end of col-lg-8 -->
  
  
<script type="" src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script><!-- News & Events --> 
<script type="text/javascript">
  $(document).ready(function() {
    $('.owl-carousel').owlCarousel({
      loop: true,
      responsiveClass: true,
      autoplay: true,
      autoplayTimeout: 2000,
      autoplayHoverPause: true,
      dots:false,
      margin:10,
      responsive: {
        0: {
          items: 1,
          nav: true,
          loop: true
        },
        600: {
          items: 2,
          nav: true
        },
        1000: {
          items: 3,
          nav: true,
          loop: true
        }
}
    })
  });
</script>

</div></div></section>
<%}  else{ %>
<section class="blue_section">  
  <div class="container">
    <h2>Our Healthcare <span>Services</span></h2>
    <div class="row">

  <div class="col-lg-5 p-3">
    <section class="spotlight p-4">
      <h3 class="bordertitle">News &amp; Events</h3>
  <marquee direction="up" scrolldelay="300" class="spotlight_section" id="scroll_news"><div onmouseover="document.getElementById('scroll_news').stop();" onmouseout="document.getElementById('scroll_news').start();">
   <ul class="spotlight_news">
  
  <%
     List<NewsAndEvents> resultList=null;
  // int size=NewsAndEventsLocalServiceUtil.getNewsAndEventsesCount();
   //List<NewsAndEvents> NewsAndEventsList =NewsAndEventsLocalServiceUtil.getNewsAndEventses(0, size) ;
     DynamicQuery dynamicQuery = null; 
           dynamicQuery =NewsAndEventsLocalServiceUtil.dynamicQuery(); 		
           String link1="";
           String link2="";
           String link3="";
           String link4="";
                         if(pageId==19)
                         {
                         dynamicQuery.add(RestrictionsFactoryUtil.eq("asri", 1));
                         link1="/web/guest/asri_hospitalsearch";
                         link2="/web/guest/asri_specilitysearch";
                         link3="/web/guest/arogyamithra";
                         link4="/web/guest/asri_proceduresearch";
                         }
                         else if(pageId==25)
                         {
                        	 dynamicQuery.add(RestrictionsFactoryUtil.eq("wjhs", 1));
                        	 link1="/web/guest/wjhs_hospitalsearch";
                        	 link2="/web/guest/wjhs_specilitysearch";
                        	 link3="/web/guest/mithrawjhs";
                        	 link4="/web/guest/wjhs_proceduresearch";
                         }
                         else if(pageId==21)
                         {
                        	 dynamicQuery.add(RestrictionsFactoryUtil.eq("aarogyaraksha", 1));
                        	 link1="/web/guest/arogyaraksha_hospitalsearch";
                        	 link2="/web/guest/arogyaraksha_specilitysearch";
                        	 link3="https://115.124.110.149/web/guest/mithraraksha";
                        	 link4="/web/guest/arogyaraksha_proceduresearch";
                         }
                         else if(pageId==27)
                         {
                        	 dynamicQuery.add(RestrictionsFactoryUtil.eq("ehs", 1));
                        	 link1="/web/guest/ehs_hospitalsearch";
                        	 link2="/web/guest/ehs_specilitysearch";
                        	 link3="https://115.124.110.149/web/guest/mithraehs";
                        	 link4="/web/guest/ehs_proceduresearch";
                         }
                         dynamicQuery.addOrder(OrderFactoryUtil.desc("newsDate"));
       List<NewsAndEvents> newsAndEventsList =null;
       try{
    	   newsAndEventsList=NewsAndEventsLocalServiceUtil.dynamicQuery(dynamicQuery, 0,
           NewsAndEventsLocalServiceUtil.getNewsAndEventsesCount());
       }
       catch(Exception e){} 
       if(newsAndEventsList!=null){
       for (NewsAndEvents newsAndEvents : newsAndEventsList) {
         long newsId = 0L;
         String newsDescription = "";
         String publishDate = "";
         long fileEntryId = 0L;
         String fileUrl = "";
         SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
         try {
  
           newsId = newsAndEvents.getNewsId();
           newsDescription = newsAndEvents.getNewsdescription();
           fileEntryId = newsAndEvents.getFileEntryId();
           if (fileEntryId != 0L) {
             try {
               fileUrl = NewsAndEventsPortlet.getFile(fileEntryId, themeDisplay.getScopeGroupId());
             } catch (Exception e) {
  
             }
           }
           try {
             Date dt = newsAndEvents.getNewsDate();
             publishDate = sdf.format(dt);
           } catch (Exception e) {
             //e.printStackTrace();
           }
  
         } catch (Exception e) {
           //e.printStackTrace();
         }
   %>
  
  <li><span class="fw-bold"><%=publishDate %> </span><br><%=newsDescription %>
  <% if(fileUrl!=null && fileUrl!=""){ %><a href="<%=fileUrl %>" target="_blank">( Click here to download)</a>&nbsp;<% } %></li>
  <% } } %>    </ul>
  </div></marquee>
    </section>
  </div>
    
  <div class="col-lg-7 p-3">
        <div class="container">
          <div class="row">
         
             <div class="col-lg-6">
            <div class="flip-container">
              <div class="flipper">
                <div class="front">
                    <div class="caption text-center">
                      <i class="fa-solid fa-hospitals"></i>
                        <h5>Hospital Search </h5>
                      <a href=<%=link1 %> class="btn btn-success">Learn More</a>
                  </div>
                </div>
                <div class="back">
                  <p>List of Empanelled Hospitals with their District, Location and speciality...
                  </p>
                  <a href=<%=link1 %> class="btn btn-success">Learn More</a>
                </div>
              </div>
            </div>
          </div><!-- /.col-lg-6 -->

         <div class="col-lg-6">
            <div class="flip-container">
              <div class="flipper">
                <div class="front">
                    <div class="caption text-center">
                        <i class="fa-solid fa-hands-holding-diamond"></i>
                        <h5 class="service_heading">Speciality Search</h5>
                      <a href=<%=link2 %> class="btn btn-success">Learn More</a>
                  </div>
                </div>
                <div class="back">
                  <p>Hospital List based on Specialities...</p>
                  <a href=<%=link2 %> class="btn btn-success">Learn More</a>
                </div>
              </div>
            </div>
          </div><!-- /.col-lg-6 -->
          </div><!--end of row -->
          <div class="row">		
          <div class="col-lg-6">
            <div class="flip-container">
              <div class="flipper">
                <div class="front">
                        <i class="fa-solid fa-list-check"></i>
                        <h5>Mitra Search</h5>
                      <a href=<%=link3 %> class="btn btn-success">Learn More</a>
                  </div>
                
                <div class="back">
                  <p>Know your Mitra of Hospitals...</p>
                  <a href=<%=link3 %> class="btn btn-success">Learn More</a>
                </div>
              </div></div>
            </div> <!-- /.col-lg-6 -->
             <div class="col-lg-6">
            <div class="flip-container">
              <div class="flipper">
                <div class="front">
                <div class="caption text-center">
                      <i class="fa-solid fa-bed-pulse"></i>
                    <h5>Procedure Search</h5>
                   <a href=<%=link4 %> class="btn btn-success">Learn More</a>
                  </div>
                </div>
                <div class="back">
                  <p>Search for the surgeries and therapies available...</p>
                  <a href=<%=link4 %> class="btn btn-success">Learn More</a>
                </div>
              </div>
            </div>
          </div><!-- /.col-lg-6 -->
  </div><!--end of row -->
        

          </div>
        </div>
      


      </div>
    </div>
</section>

<%}
%>

	
 <% 
}
else{


%>

<liferay-ui:success key="entryAdded" message="News added successfully." />
<liferay-ui:success key="entryUpdated" message="News updated successfully."  />
<liferay-ui:success key="entryDeleted" message="News deleted successfully." />



<div class="createuser-page">
<div class="">
 <div class="<%if(!role.equalsIgnoreCase("Departmentuser")){%>  jhansiall-pages <%}%>">
 <%
 	String languageId=themeDisplay.getLanguageId();
  String thSno="S.No.";
  String thBooktitle="News Description";
  String thPublishdate="News Date";
  String thDownload="Download";
  String tnd="News Telugu Description";
 
  PortletURL iteratorNewURL = renderResponse.createRenderURL(); 
  iteratorNewURL.setParameter("mvcPath", "/view.jsp");
  long cur = 1;
  long delta=1;
  if(ParamUtil.getLong(request, "cur")!=0){
  	cur =ParamUtil.getLong(request, "cur");
  }
  if(ParamUtil.getLong(request, "delta")!=0){
  	delta =ParamUtil.getLong(request, "delta");
  }
  long sNo=(delta * (cur-1))+1;
  
  String friendlyURL= themeDisplay.getPortalURL();//http://localhost:7070/
  //System.out.println("getPortalURL()>>>"+friendlyURL);
  //System.out.println("role>>>"+role);
  
  
  
  
  
  //System.out.println(".getURLCurrent()()>>>"+themeDisplay.getURLCurrent());
  //System.out.println("getURLHome()>>>"+themeDisplay.getURLHome());
  //System.out.t.println("getPortalURL()>>>"+themeDisplay);
   
  
 %>
<portlet:renderURL var="createNewsAndEventsURL">
	<portlet:param name="mvcPath" value="/createNewsAndEvents.jsp"/>
</portlet:renderURL> 
<div class="tenderspage-main">
	<div class="tendersdata-table">
		  <div class="col-md-12">
                <h1><span>News & Events</span></h1>
           </div>
         
		<div class="container">
		 
					<div class="row">
	   					<div class="col-md-12" style="justify-content: flex-end;">
                           	<a href ="<%=createNewsAndEventsURL%>" cssClass="btn btn-black btn-sm-block" >    
                           	<button type="button" style="width: auto;" class="btn btn-defaulter btn-createTender float-right"> Create News</button></a>
                           </div>
                      </div>
                     
                      
			<div class="table-responsive">
		<%
			List<NewsAndEvents> resultList=null;
		List<NewsAndEvents> NewsAndEventsList =null;
			int size=0;
			try{
				size=NewsAndEventsLocalServiceUtil.getNewsAndEventsesCount();
				NewsAndEventsList =NewsAndEventsLocalServiceUtil.getNewsAndEventses(0, size) ;
			}
			catch(Exception e){
				
			}
		%>
	     		
	 <liferay-ui:search-container deltaConfigurable="true" delta="10" total="<%=size%>" emptyResultsMessage="No records found" iteratorURL="<%=iteratorNewURL%>" >			 
	<%
			 		try{
			 			resultList = ListUtil.subList(NewsAndEventsList, searchContainer.getStart(),searchContainer.getEnd());
			 		}catch(Exception e){
			 			////e.printStackTrace();
			 		}
			 	%>
	
	 <liferay-ui:search-container-results results="<%=resultList%>"  /> 
	 <liferay-ui:search-container-row className="com.kpmg.customtables.model.NewsAndEvents" keyProperty="newsId" modelVar="newsAndEvents">
		      		
				      	<%
		      						      		long newsId =0L;
		      						      			      	String newsDescription ="";
		      						      			      	String publishDate="";
		      						      			      	long fileEntryId=0L;
		      						      			      	String fileUrl="";
		      						      			    String tnewsdescription="";
		      						      			      	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		      						      			      	try{
		      						      			      	
		      						      			      	newsId =newsAndEvents.getNewsId();
		      						      			      		  newsDescription =newsAndEvents.getNewsdescription();
		      						      			      	tnewsdescription=newsAndEvents.getTi_newsdescription();
		      						      			      		  fileEntryId=newsAndEvents.getFileEntryId();
		      						      				      	  if(fileEntryId!=0L){
		      						      								try{
		      						      									fileUrl = NewsAndEventsPortlet.getFile(fileEntryId, themeDisplay.getScopeGroupId());	  
		      						      								}
		      						      								catch(Exception e){
		      						      									
		      						      								}
		      						      				      	  }
		      						      	                           try{	
		      						      							Date dt = newsAndEvents.getNewsDate();
		      						      							publishDate = sdf.format(dt);
		      						      						}catch(Exception e){
		      						      							//e.printStackTrace();
		      						      						}
		      						      	                           
		      						      		 }catch(Exception e){
		      						      			////e.printStackTrace();
		      						      		}
		      						      	%>
	  	<liferay-ui:search-container-column-text name="<%=thSno %>" value="<%= String.valueOf(sNo++) %>" />
		<liferay-ui:search-container-column-text name="<%=thBooktitle %>" value="<%= newsDescription %>" />
	  			 <liferay-ui:search-container-column-text name="<%=tnd %>" value="<%=tnewsdescription %>"  /> 
	  	
	  	<liferay-ui:search-container-column-text name="<%=thPublishdate %>" value="<%=publishDate %>"  /> 
		<% if(role.equalsIgnoreCase("Departmentuser")){ %>
		<liferay-ui:search-container-column-text name="Manage">
		<div>
		     <% if(!fileUrl.isEmpty()){ %> <a href="<%=fileUrl %>?download=true" class="btn btn-primary m-0 hotooltip" target="_blank"><i class="fas fa-download"><span class="hotooltiptext">Download</span></i></a><% } %>
			<a class="btn btn-primary m-0 hotooltip" onClick="updateRecord('<%=newsId %>');"><i class="fas fa-edit editicon"><span class="hotooltiptext">Edit</span></i></a> 
			<a class="btn btn-primary m-0 hotooltip" onClick="return deleteRecord('<%=newsId %>');"><i class="fas fa-trash-alt deleteicon"><span class="hotooltiptext">Delete</span></i></a>
		</div>
		</liferay-ui:search-container-column-text>
		<% }else{ %>
		<liferay-ui:search-container-column-text name="<%=thDownload %>">

		    <% if(!fileUrl.isEmpty()){ %> <a href="<%=fileUrl %>?download=true" class="btn btn-primary m-0 hotooltip" target="_blank"><i class="fas fa-download"><span class="hotooltiptext">Download</span></i></a><% } %>
		 </liferay-ui:search-container-column-text>
		<% } %>
 
 	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator  />
    </liferay-ui:search-container>
		    </div>
	    </div>
	</div>
</div> 
</div></div></div>
<% if(role.equalsIgnoreCase("Departmentuser")){ %>
		<portlet:renderURL var="updateRecordURL">
			<portlet:param name="mvcPath" value="/createNewsAndEvents.jsp"/>  
		</portlet:renderURL>
		
		 <portlet:actionURL var="deleteRecordURL" name="deleteNews"> 
         </portlet:actionURL>
<script>
function updateRecord(recordId){
	$('#<portlet:namespace />update').find('input[name=<portlet:namespace />recordId]').val(recordId);
	$("#<portlet:namespace />update").submit();
}
function deleteRecord(recordId){
	if(confirm('Are you sure you want to delete?')){
		$('#<portlet:namespace />delete').find('input[name=<portlet:namespace />recordId]').val(recordId);
		$('#<portlet:namespace />delete').submit();
	}
	else{
		return false;
	}
}

</script>
<aui:form name="update" method="post" action="<%=updateRecordURL %>" style="display:none;">
   <aui:input type="text" name="recordId" value=""></aui:input>
</aui:form>
<aui:form name="delete" method="post" action="<%=deleteRecordURL %>" style="display:none;">
   <aui:input type="text" name="recordId" value=""></aui:input>
</aui:form>
<% } } %>

<script>
var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {
return new bootstrap.Tooltip(tooltipTriggerEl)
})

</script>