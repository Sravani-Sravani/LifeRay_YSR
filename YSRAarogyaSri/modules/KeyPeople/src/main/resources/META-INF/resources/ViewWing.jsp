 
<%@page import="com.keyPeopleService.service.WingLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>   
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.keyPeopleService.model.Wing"%>
<liferay-ui:success key="entryAdded" message="Key People added successfully." />
<liferay-ui:success key="entryUpdated" message="Key People updated successfully."  />
<liferay-ui:success key="entryDeleted" message="Key People deleted successfully." />
 <% 

 PortletURL iteratorNewURL = renderResponse.createRenderURL(); 
 iteratorNewURL.setParameter("mvcPath", "/view.jsp");
 long cur = 1;
 long delta=20;

 long sNo=(delta * (cur-1))+1;
 long order=sNo;
 themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
 long pageId1=themeDisplay.getPlid();
 String thSno = "S.No.";
 
%>
<portlet:renderURL var="addwingURL">
	<portlet:param name="mvcPath" value="/addwing.jsp"/>
</portlet:renderURL> 



<div class="createuser-page">

<div class="tenderspage-main">
	<div class="tendersdata-table">
		  <div class="col-md-12">
               <h1>Wing Manager</h1>
           </div>
         
		<div class="container">
					<div class="row">
	   					<div class="col-md-12" style="justify-content: flex-end;">
                           	<a href ="<%=addwingURL %>" cssClass="btn btn-black btn-sm-block" >    
                           	<button type="button" style="width: auto;" class="btn btn-defaulter btn-createTender float-right">Add wing </button></a>
                          
                           </div>
                      </div>     
                                                      
                      <div class="table-responsive">
		<% 
		    List<Wing> resultList=null;
		    int size=0;
		    List<Wing> wingList=null;
		    size = WingLocalServiceUtil.getWingsCount();
		    wingList =WingLocalServiceUtil.getWings(0, size);
			 
		 %>
	     		
	 <liferay-ui:search-container deltaConfigurable="true" delta="20" total="<%=size %>" emptyResultsMessage="No records found" iteratorURL="<%= iteratorNewURL %>" >
	 <% try{
		resultList = ListUtil.subList(wingList, searchContainer.getStart(),searchContainer.getEnd());
	}catch(Exception e){
		e.printStackTrace();
	}
	%>			 
 <liferay-ui:search-container-results results="<%=resultList %>"  /> 
	 <liferay-ui:search-container-row cssClass="ui-state-default" className="com.keyPeopleService.model.Wing" keyProperty="wid" modelVar="wing">
		      		
				      	<%
				      	
				      	long wid =0L;
				      	String wname ="";		    	
                        String status="";
				      	try{
				      		wid = wing.getWid();
				      		wname =wing.getWname();
				      		status = wing.getStatus();
				      		
				            System.out.println("name"+wname+" status"+status);
				      		
					      		
					      	  
			                }catch(Exception e){
				                 e.printStackTrace();
			                } 
		                 %>
		
		 <liferay-ui:search-container-column-text cssClass="<%= String.valueOf(wid) %>" name="<%=thSno %>">	 		
	    <%= String.valueOf(sNo++) %></liferay-ui:search-container-column-text> 
	    <liferay-ui:search-container-column-text name="Wing" value="<%=wname %>" /> 
		<liferay-ui:search-container-column-text name="Status" value="<%=status %>" />
		
		<liferay-ui:search-container-column-text name="Manage" cssClass="managewdth">
		<div>
	 
			<a class="btn btn-primary m-0 hotooltip" onClick="updateRecord('<%=wid %>');"><i class="fas fa-edit editicon"><span class="hotooltiptext"></span></i></a> 
			<%if(status.equals("Y")) { %><a class="btn btn-primary m-0 hotooltip" onClick="return deleteRecord('<%=wid %>');"> <i class="fas fa-trash-alt deleteicon"><span class="hotooltiptext"></span></i></a>
			<%} %>
		</div>
		</liferay-ui:search-container-column-text>
		
		
	

		
		
 	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator  />
					</liferay-ui:search-container>
		    </div>
                     
			
	    </div>
	</div>
  </div> 
 </div>
 
 
<portlet:renderURL var="updateRecordURL">
			<portlet:param name="mvcPath" value="/addwing.jsp"/>  
		</portlet:renderURL>
		
		 <portlet:actionURL var="deleteRecordURL" name="deleteImportantLink"> 
         </portlet:actionURL>
         
<script>
function updateRecord(recordId){
	$('#<portlet:namespace />update').find('input[name=<portlet:namespace />wid]').val(recordId);
	$("#<portlet:namespace />update").submit();
}
function deleteRecord(recordId){
	if(confirm('Are you sure you want to delete?')){
		$('#<portlet:namespace />delete').find('input[name=<portlet:namespace />wid]').val(recordId);
		$('#<portlet:namespace />delete').submit();
	}
	else{
		return false;
	}
}
</script>


 

<aui:form name="update" method="post" action="<%=updateRecordURL %>" style="display:none;">
   <aui:input type="text" name="wid" value=""></aui:input>
</aui:form>
<aui:form name="delete" method="post" action="<%=deleteRecordURL %>" style="display:none;">
   <aui:input type="text" name="wid" value=""></aui:input>
</aui:form>


