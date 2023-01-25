
  
<%@page import="com.keyPeopleService.service.WingLocalServiceUtil"%>
<%@page import="com.keyPeopleService.service.DesignationLocalServiceUtil"%>
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
<%@page import="com.keyPeopleService.model.Designation"%>
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
<portlet:renderURL var="addDesigURL">
	<portlet:param name="mvcPath" value="/addDesignation.jsp"/>
</portlet:renderURL> 


<div class="createuser-page">

<div class="tenderspage-main">
	<div class="tendersdata-table">
		  <div class="col-md-12">
               <h1>Designation Manager</h1>
           </div>
         
		<div class="container">
					<div class="row">
	   					<div class="col-md-12" style="justify-content: flex-end;">
                           	<a href ="<%=addDesigURL %>" cssClass="btn btn-black btn-sm-block" >    
                           	<button type="button" style="width: auto;" class="btn btn-defaulter btn-createTender float-right">Add Designnation </button></a>
                          
                           </div>
                      </div>     
                                                      
                      <div class="table-responsive">
		<% 
		    List <Designation> resultList=null;
		    int size=0;
		    List<Designation> desigList=null;
		    size = DesignationLocalServiceUtil.getDesignationsCount();
		    desigList  = DesignationLocalServiceUtil.getDesignations(0, size);
		    
		   
			 
		 %>
	     		
	 <liferay-ui:search-container deltaConfigurable="true" delta="20" total="<%=size %>" emptyResultsMessage="No records found" iteratorURL="<%= iteratorNewURL %>" >
	 <% try{
		resultList = ListUtil.subList(desigList, searchContainer.getStart(),searchContainer.getEnd());
	}catch(Exception e){
		e.printStackTrace();
	}
	%>			 
 <liferay-ui:search-container-results results="<%=resultList %>"  /> 
	 <liferay-ui:search-container-row cssClass="ui-state-default" className="com.keyPeopleService.model.Designation" keyProperty="did" modelVar="desig">
		      		
				      	<%
				      	
				      	long did =0L;
				      	String dname ="";		    	
                        String status="";
                        long wingId = 0L;
                        String wingId1 = "";
				      	try{
				      		did = desig.getDid();
				      		dname =desig.getDname();
				      		status = desig.getStatus();
				      		wingId = desig.getWid();
				      		wingId1 = String.valueOf(wingId);
				            System.out.println("name"+dname+" status"+status);
				      		
					      		
					      	  
			                }catch(Exception e){
				                 e.printStackTrace();
			                } 
		                 %>
		
		 <liferay-ui:search-container-column-text cssClass="<%= String.valueOf(did) %>" name="<%=thSno %>">	 		
	    <%= String.valueOf(sNo++) %></liferay-ui:search-container-column-text> 
	     <liferay-ui:search-container-column-text name="Designation" value="<%=dname %>" />
		<liferay-ui:search-container-column-text name="Status" value="<%=status %>" />
		<liferay-ui:search-container-column-text name="WingId" value="<%=wingId1 %>" />
		<liferay-ui:search-container-column-text name="Manage" cssClass="managewdth">
		<div>
	 
			<a class="btn btn-primary m-0 hotooltip" onClick="updateRecord('<%=did %>');"><i class="fas fa-edit editicon"><span class="hotooltiptext"></span></i></a> 
			<%if(status.equals("Y")) { %><a class="btn btn-primary m-0 hotooltip" onClick="return deleteRecord('<%=did %>');"> <i class="fas fa-trash-alt deleteicon"><span class="hotooltiptext"></span></i></a>
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
			<portlet:param name="mvcPath" value="/addDesignation.jsp"/>  
		</portlet:renderURL>
		
		 <portlet:actionURL var="deleteRecordURL" name="deleteImportantLink"> 
         </portlet:actionURL>
         
<script>
function updateRecord(recordId){
	$('#<portlet:namespace />update').find('input[name=<portlet:namespace />did]').val(recordId);
	$("#<portlet:namespace />update").submit();
}
function deleteRecord(recordId){
	if(confirm('Are you sure you want to delete?')){
		$('#<portlet:namespace />delete').find('input[name=<portlet:namespace />did]').val(recordId);
		$('#<portlet:namespace />delete').submit();
	}
	else{
		return false;
	}
}
</script>


 

<aui:form name="update" method="post" action="<%=updateRecordURL %>" style="display:none;">
   <aui:input type="text" name="did" value=""></aui:input>
</aui:form>
<aui:form name="delete" method="post" action="<%=deleteRecordURL %>" style="display:none;">
   <aui:input type="text" name="did" value=""></aui:input>
</aui:form>


