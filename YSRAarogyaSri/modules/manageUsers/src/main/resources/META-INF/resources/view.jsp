<%@page import="java.util.Collections"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.kpmg.manageusers.constants.ManageUsersPortletKeys"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ include file="/init.jsp" %>

<style>
.jhansiuserstab-page .nav-tabs .nav-link.active span.txt-orange {
    color: #FF6F0C !important;
    font-size: 16px;
}
.jhansiuserstab-page .nav-tabs .nav-link span.txt-orange {
    font-size: 16px;
    color: #001A46;
}
 
.jhansiuserstab-page .nav-tabs .nav-link a {
    padding:0px;
    font-size: 16px;
    background-color: #6b6957;  
}
.jhansiuserstab-page .nav-tabs .nav-link {
    color: #fff;
    font-size: 6px;
    border: none;
}
.jhansiuserstab-page .nav-tabs {
    border-bottom: none;
    margin-bottom: 35px;
}

.jhansiuserstab-page .nav-tabs .nav-item.show .nav-link, .jhansiuserstab-page .nav-tabs .nav-link.active {
    background-color: transparent;
    border: none;
    font-weight: bold;
    border-bottom: 4px solid #001A46;
}
  </style>
 <liferay-ui:success key="entryAdded" message="User added successfully." />
<liferay-ui:success key="entryUpdated" message="User updated successfully."  />
<liferay-ui:success key="entryDeleted" message="User deleted successfully." />
  <% String tabval="1"; 
  
  if(ParamUtil.getString(request, "tabval")!=null && ParamUtil.getString(request, "tabval")!=""){
		 tabval =ParamUtil.getString(request, "tabval");
		 	 System.out.println("tabval>>>"+tabval);
		 }
 
	 if(request.getAttribute("tabval")!=null && request.getAttribute("tabval")!=""){
		 tabval=(String) request.getAttribute("tabval");
	 System.out.println("tabval1>>>>>"+tabval);
	 }
  %>
  
  <portlet:renderURL var="addUserURL">
	<portlet:param name="mvcPath" value="/addUser.jsp"/>
</portlet:renderURL> 
<div class="tenderspage-main">
	<div class="tendersdata-table">
		  <div class="col-md-12">
                <h1><span>Manage Users</span></h1>
           </div>
         
	 <div class="jhansiuserstab-page jhansiall-pages">
		
		 
  <% 
 String languageId=themeDisplay.getLanguageId();
  
  
 
 PortletURL iteratorNewURLMenu1 = renderResponse.createRenderURL(); 
 iteratorNewURLMenu1.setParameter("mvcPath", "/view.jsp");
 iteratorNewURLMenu1.setParameter("tabval", "1");
 
 PortletURL iteratorNewURLMenu2 = renderResponse.createRenderURL(); 
 iteratorNewURLMenu2.setParameter("mvcPath", "/view.jsp");
 iteratorNewURLMenu2.setParameter("tabval", "2");
 
 PortletURL iteratorNewURLMenu3 = renderResponse.createRenderURL(); 
 iteratorNewURLMenu3.setParameter("mvcPath", "/view.jsp");
 iteratorNewURLMenu3.setParameter("tabval", "3");
 
 PortletURL iteratorNewURLMenu4 = renderResponse.createRenderURL(); 
 iteratorNewURLMenu4.setParameter("mvcPath", "/view.jsp");
 iteratorNewURLMenu4.setParameter("tabval", "4");
 

 long menu1=1;
 long menu2=1;
 long menu3=1;
 long menu4=1;
 
 long deltamenu1=1;
 long deltamenu2=1;
 long deltamenu3=1;
 long deltamenu4=1;
 
 if(ParamUtil.getLong(request, "menu1")!=0){
	 menu1 =ParamUtil.getLong(request, "menu1");
 }
 if(ParamUtil.getLong(request, "menu2")!=0){
	 menu2 =ParamUtil.getLong(request, "menu2");
 }
 if(ParamUtil.getLong(request, "menu3")!=0){
	 menu3 =ParamUtil.getLong(request, "menu3");
 }
 if(ParamUtil.getLong(request, "menu4")!=0){
	 menu4 =ParamUtil.getLong(request, "menu4");
 }

 
 if(ParamUtil.getLong(request, "deltamenu1")!=0){
	 deltamenu1 =ParamUtil.getLong(request, "deltamenu1");
 }
 if(ParamUtil.getLong(request, "deltamenu2")!=0){
	 deltamenu2 =ParamUtil.getLong(request, "deltamenu2");
	 }
 if(ParamUtil.getLong(request, "deltamenu3")!=0){
	 deltamenu3 =ParamUtil.getLong(request, "deltamenu3");
	 }
 if(ParamUtil.getLong(request, "deltamenu4")!=0){
	 deltamenu4 =ParamUtil.getLong(request, "deltamenu4");
	 }
 
 
long menu1SNo=(deltamenu1 * (menu1-1))+1;
long menu2SNo=(deltamenu2 * (menu2-1))+1;
long menu3SNo=(deltamenu3 * (menu3-1))+1;
long menu4SNo=(deltamenu4 * (menu4-1))+1;

 
 
%>
			<div class="container">
			<% //if(role.equalsIgnoreCase("Departmentuser")){ %>
					<div class="row">
	   					<div class="col-md-12" style="justify-content: flex-end;">
                           	<a href ="<%=addUserURL %>" cssClass="btn btn-black btn-sm-block" >    
                           	<button type="button" style="width: auto;" class="btn btn-defaulter btn-createTender float-right"> Add User</button></a>
                           </div>
                      </div>
         <% //} %>
					<ul class="nav nav-tabs"> 
						    <li  class="nav-item"><a class="nav-link  active" data-toggle="tab" href="#menu4">
						    <span class="txt-orange">IT Department User</span>
						    </a>
						    </li> 
						  </ul>
						  <div class="tab-content"> 
                          <div id="menu4" class="tab-pane in active ">
                                <%  
                                
                                List<User> resultList=null;
			           List<User> usersList =UserLocalServiceUtil.getRoleUsers(ManageUsersPortletKeys.IT_DEPARTMENT_USER);
                        int size =usersList.size();
		             %>
	     		
	 <liferay-ui:search-container curParam="menu4" deltaConfigurable="true" delta="10" total="<%=size %>" emptyResultsMessage="No records found" iteratorURL="<%= iteratorNewURLMenu4 %>" >			 
	<% try{
		 resultList = ListUtil.subList(usersList, searchContainer.getStart(),searchContainer.getEnd());
	}catch(Exception e){
		e.printStackTrace();
	}
	%>
	
	 <liferay-ui:search-container-results results="<%=resultList %>"  /> 
	 <liferay-ui:search-container-row className="com.liferay.portal.kernel.model.User" keyProperty="userId" modelVar="user">
		      		
				      	<%
				      	
				      	long userId =0L;
				      	String firstName ="";
				      	String lastName="";
				      	String emailAddress="";
				      	String mobileNumber="";
				      	String screenName="";
				      	int gender=0;
				      	String address="";
				      	try{

				      		 userId =user.getUserId();
				      		firstName =user.getFirstName(); 
				      		lastName =user.getLastName(); 
				      		emailAddress=user.getEmailAddress();
				      		if(emailAddress.contains("no-emailaddress.com")){
				      			emailAddress="";	
				      		}
				      		screenName=user.getScreenName();                                
			 }catch(Exception e){
				e.printStackTrace();
			}
				       	      
		%>
	 
         <liferay-ui:search-container-column-text name="S.No." value="<%= String.valueOf(menu4SNo++) %>" />
	     <liferay-ui:search-container-column-text name="First Name" value="<%= firstName %>" /> 
		 <liferay-ui:search-container-column-text name="last Name" value="<%= lastName %>" />
		 <liferay-ui:search-container-column-text name="Screen Name" cssClass="discptwdth">
		 <%=screenName %>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Email Address" cssClass="Desinhidwdth" >
		 <%=emailAddress %>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Mobile Number" value="<%=mobileNumber %>"  /> 
		<liferay-ui:search-container-column-text name="Manage">
		<div style="display: inline-flex;">
		     <a class="btn btn-primary m-0 mr-1 hotooltip" onClick="updateRecord('<%=userId %>','4');"><i class="fas fa-edit editicon"><span class="hotooltiptext">Edit</span></i></a> 
			 <a class="btn btn-primary m-0 hotooltip" onClick="return deleteRecord('<%=userId %>','4');"><i class="fas fa-trash-alt deleteicon"><span class="hotooltiptext">Delete</span></i></a>
		</liferay-ui:search-container-column-text>
      
 	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator  />
					</liferay-ui:search-container>
                          </div>
                          </div>
  </div>
  </div>
  </div>
  </div>
  
  
  		<portlet:renderURL var="updateRecordURL">
			<portlet:param name="mvcPath" value="/addUser.jsp"/>
		</portlet:renderURL>
		
		 <portlet:actionURL var="deleteRecordURL" name="deleteUser"> 
         </portlet:actionURL> 
         
          <script>
function updateRecord(recordId,tabval){
	$('#<portlet:namespace />update').find('input[name=<portlet:namespace />userId]').val(recordId);
	$('#<portlet:namespace />update').find('input[name=<portlet:namespace />tabval]').val(tabval);
	$("#<portlet:namespace />update").submit();
}
function deleteRecord(recordId,tabval){
	if(confirm('Are you sure you want to delete?')){
		$('#<portlet:namespace />delete').find('input[name=<portlet:namespace />userId]').val(recordId);
		$('#<portlet:namespace />delete').find('input[name=<portlet:namespace />tabval]').val(tabval);
		$('#<portlet:namespace />delete').submit();
	}
	else{
		return false;
	}
}
</script>
<aui:form name="update" method="post" action="<%=updateRecordURL %>" style="display:none;">
   <aui:input type="text" name="userId" value=""></aui:input>
   <aui:input type="text" name="tabval" value=""></aui:input>
</aui:form>
<aui:form name="delete" method="post" action="<%=deleteRecordURL %>" style="display:none;">
   <aui:input type="text" name="userId" value=""></aui:input>
   <aui:input type="text" name="tabval" value=""></aui:input>
   
</aui:form>
          
         
         