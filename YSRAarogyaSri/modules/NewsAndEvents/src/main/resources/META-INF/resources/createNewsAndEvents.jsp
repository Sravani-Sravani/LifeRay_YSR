 <%@page import="com.kpmg.customtables.service.NewsAndEventsLocalServiceUtil"%>
<%@page import="com.kpmg.customtables.model.NewsAndEvents"%>
 <%@page import="com.kpmg.newsandevents.constants.NewsAndEventsPortletKeys"%>
 <%@page import="java.text.SimpleDateFormat"%>
 <%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp"%>  
 <portlet:actionURL var="newsAndEventsCreateURL" name="manageNews">
 </portlet:actionURL>
 <%
 	long recordId = ParamUtil.getLong(request, "recordId");
     System.out.println("recordId >>>"+recordId );
     NewsAndEvents news=null;
     String newsDescription=""; 
     String newsDate="";
     long fileEntryId=0L;
     SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
     if(recordId!=0){
     	try{
     		news=NewsAndEventsLocalServiceUtil.fetchNewsAndEvents(recordId);
     		 if(news!=null){
     		 	 newsDescription=news.getNewsdescription();
     		 	 if(news.getNewsDate()!=null){
     				 newsDate = dateformat.format(news.getNewsDate());
     			 }
     			 fileEntryId=news.getFileEntryId();
     		 }
     	}
     	catch(Exception e){
     		
     	}
     }
 %>
<div class="createuser-page">
<div class="">
	<div class=" jhansiall-pages">
  <div class="tenderspage-main">
  	<div class="container">
  	 <liferay-ui:error key="title.errorMsg.missing" message="title.errorMsg.missing" /> 
  	 <liferay-ui:error key="document.errorMsg.missing" message="document.errorMsg.missing"/>
     <liferay-ui:error key="document.errorMsg.sizeIssue" message="document.errorMsg.sizeIssue"/>
  		  <div class="col-md-12">
                <h1 class="tendertext-main"><span><%
                	if(recordId==0){
                %>Create <%
                	} else {
                %>Update <%
                	}
                %> News & Events</span></h1>
          </div>	
	    <div class="tender-form">
	      <aui:form  action="<%=newsAndEventsCreateURL%>" method="post" name="fm" enctype="multipart/form-data">
	      <aui:input type="hidden" label="" name="recordId" value="<%=recordId%>"></aui:input>
	      <div class="col-md-12 row">
	       <div class="col-md-6">
	       <div class="form-group"> 
	       
	       <aui:input type="textarea" value="<%=newsDescription %>" name="newsDescription" label="News Descrption"   rows="3" cssClass="form-control">
	         <aui:validator name="required"></aui:validator>

	          </aui:input> 
	       
	         </div>
	        
	       </div>
	       <div class="col-md-6"> 
	       <div class="form-group">
	          <aui:input type="file" name="newsDocument" label="Upload Document (Note: Upload document accept only .pdf,.jpg,.png,.gif and .webp format.)" accept="<%=NewsAndEventsPortletKeys.NEWS_FILE_CHOOSE_TYPE%>" cssClass="form-control">
	         <%--  <aui:validator name="acceptFiles">'<%=NewsAndEventsPortletKeys.NEWS_FILE_UPLOAD_TYPES%>'</aui:validator>
	          --%> <%-- <% if(recordId==0){ %>
	          <aui:validator name="required"></aui:validator>	
	          <% } %> --%>
	           <aui:validator name="custom" errorMessage="File too Big, please select a file less than 20mb.">
					 function (val, fieldNode, ruleValue) {
							 const fi = document.getElementById('<portlet:namespace />newsDocument');
							 var returnValue = true;
						        if (fi.files.length > 0) { 
						                const fsize = fi.files.item(0).size; 
						                const fileSize = Math.round((fsize / 1024)); 
											if (fileSize > 20480) { 
							                 returnValue = false;
							                }
									}        
				                      return returnValue;
								    }
				 </aui:validator>
	          </aui:input>
	          <p><b>Max file upload size 20MB</b></p>
	        </div>
	       </div> 
	       </div>
	       
	       
	         <div class="col-md-12 row">
	       <div class="col-md-3">
	       
	       
	       <div class="form-group">
	          <aui:input type="date" value="<%=newsDate%>" name="newsDate" label="Date of News" cssClass="form-control">
	              <aui:validator name="required"></aui:validator>
	          </aui:input>
	        </div> 
	        </div>
	         <div class="col-md-3">
	        <div class="form-group" style="padding-top: 20px;">
	        <aui:button type="submit" name="createNewsForm" value="Submit" cssClass="btn btn-submit" />
	        </div>
	       </div>
	        </div>
	       
	       
	       </div>
	      </aui:form>
	    </div>
	</div>
  </div>
 </div></div>
 </div>