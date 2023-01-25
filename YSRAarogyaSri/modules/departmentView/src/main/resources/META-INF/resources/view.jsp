<%@page import="com.departmentService.service.DepartmentLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.portal.kernel.model.PortletPreferences"%>
<%@page import="com.departmentService.model.Department"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<portlet:renderURL var="addNewUrl">
	<portlet:param name="mvcPath" value="/addNew.jsp"/>
</portlet:renderURL> 
<style>
 
/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
  background-color: #fefefe;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
}

/* The Close Button */
.close {
  color: #aaaaaa;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}
<style>
.formContainer{
margin:auto;
padding : 5px;
height:70%;
width:80%;

}
h1{
margin:auto;
}
</style>

  <script>
// Get the modal

function closeFun()
{
	
	var modal = document.getElementById("myModal");
	 
	// Get the <span> element that closes the modal
	var span = document.getElementsByClassName("close")[0];

	//  modal.style.display = "block";

	span.onclick = function() {
	  modal.style.display = "none";
	}

	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
	  if (event.target == modal) {
	    modal.style.display = "none";
	  }
	}
	modal.style.display = "none";

}
</script>
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

<%if(pageId1 == 618){ %>

<div >

        <aui:form>      
        <div class="row">
              <h1 >Department view</h1>
	   				<div class="col-md-12" style="justify-content: flex-end;">
                           <a href ="<%=addNewUrl %>" cssClass="btn btn-black btn-sm-block" >    
                           	<button type="button" style="width: auto;" class="btn btn-primary m-0 mr-1 hotooltip""> Add</button>
                           </a>                      
                     </div>                  
        </div>
 </aui:form>  
 
 </div>  
 
 <div>
     <div class="table-responsive">
			 
         <div class="col-md-12 ">
               <div class="row mb-3">

		       <% 
		        List<Department> resultList=null;
			    int size=DepartmentLocalServiceUtil.getDepartmentsCount();
			     List<Department> DepartmentList =DepartmentLocalServiceUtil.getDepartments(0, size);
			     System.out.println("Count="+DepartmentList.size());
		        %> 		
		         <liferay-ui:search-container deltaConfigurable="true" delta="20" total="<%=size %>" emptyResultsMessage="No records found" iteratorURL="<%= iteratorNewURL %>" >			 
	                 <% try{
		                resultList = ListUtil.subList(DepartmentList, searchContainer.getStart(),searchContainer.getEnd());
	                      }catch(Exception e){
		                  e.printStackTrace();
	                      }
	                %>
	                <liferay-ui:search-container-results results="<%=resultList %>"  /> 
	             
	            <liferay-ui:search-container-row className="com.departmentService.model.Department" keyProperty="did" modelVar="department">
		          <%
				      	long did =0;
				      	String description ="";
				      	String title="";
				      	int depval= 0;
				      	String status="InActive";
				    
				      	try{
				      		  
				      		description =department.getDescription(); 				      		
				      		//System.out.println("description="+description);
				      		title =department.getTitle();
				      		depval = department.getDepartment();
				      		did = department.getDid();
				      		if(depval==1){
				      		  status="Active";
				      		} 
				      		
				      	}
				      	catch(Exception e)
				      	{
				      		e.printStackTrace();
				      	}
				      	
					           
		          %>
		
		     
		  <liferay-ui:search-container-column-text cssClass="<%= String.valueOf(did) %>" name="<%=thSno %>">	 
		
	    <%= String.valueOf(sNo++) %></liferay-ui:search-container-column-text>
	    <liferay-ui:search-container-column-text name="title" value="<%=title %>" /> 
		 <liferay-ui:search-container-column-text name="description" value="<%=description %>" />
		<liferay-ui:search-container-column-text name="Status" value="<%=status %>" />
		
		<liferay-ui:search-container-column-text name="Manage">
		<div style="display: inline-flex;">
			<a class="btn btn-primary m-0 mr-1 hotooltip" onClick="updateRecord('<%=did %>');"><i class="fas fa-edit editicon"><span class="hotooltiptext"></span></i></a>
			<a class="btn btn-primary m-0 hotooltip" onClick="return deleteRecord('<%=did %>');"><i class="fas fa-trash-alt deleteicon"><span class="hotooltiptext"></span></i></a>
		</div>
		</liferay-ui:search-container-column-text>
		 
		
		     </liferay-ui:search-container-row>
		<liferay-ui:search-iterator  />
             </liferay-ui:search-container>
            </div>   
       </div>  
</div>  
</div> 
 
		<portlet:renderURL var="updateRecordURL">
			<portlet:param name="mvcPath" value="/addNew.jsp"/>  
		</portlet:renderURL>
		 <portlet:actionURL var="deleteRecordURL" name="deletePlaces"> 
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
   <aui:input type="text" id="<portlet:namespace />did" name="did" value=""></aui:input>
</aui:form>
<aui:form name="delete" method="post" action="<%=deleteRecordURL %>" style="display:none;">
   <aui:input type="text" name="did" value=""></aui:input>
</aui:form>


<%}else if(pageId1 == 620){ %>
    <html>
    
   
<body>
 
<% 
		        List<Department> resultList=null;
			    int size=DepartmentLocalServiceUtil.getDepartmentsCount();
			     List<Department> DepartmentList =DepartmentLocalServiceUtil.getDepartments(0, size);
			     System.out.println("Count="+DepartmentList.size());
		        %> 		
		         <liferay-ui:search-container deltaConfigurable="true" delta="20" total="<%=size %>" emptyResultsMessage="No records found" iteratorURL="<%= iteratorNewURL %>" >			 
	                 <% try{
		                resultList = ListUtil.subList(DepartmentList, searchContainer.getStart(),searchContainer.getEnd());
	                      }catch(Exception e){
		                  e.printStackTrace();
	                      }
	                %>
	                <liferay-ui:search-container-results results="<%=resultList %>"  /> 
	             
	            <liferay-ui:search-container-row className="com.departmentService.model.Department" keyProperty="did" modelVar="department">
		          <%
				      	long did =0;
				      	String description ="";
				      	String title="";
				      	int depval= 0;
				      	String status="InActive";
				    
				      	try{
				      		depval = department.getDepartment();  
				      		description =department.getDescription(); 
				      		
				      		//System.out.println("description="+description);
				      		title =department.getTitle();
				      		
				      		
				      		
				      		
				      	}
				      	catch(Exception e)
				      	{
				      		e.printStackTrace();
				      	}
				      	
					           
		          %>
		          <%if(depval == 1){ %>
		          
		         <div id="myModal" class="modal" role="dialog" style="display: block;z-index:99999;"> <!-- Modal content -->
    <div class="modal-content">
     <div class="modal-header">
      <h4 class="modal-title" style="text-align:center;color:red;"><%=title %></h4>
      <button type="button" class="close" style="color: #000;" data-dismiss="modal" onclick="closeFun()">×</button>
     </div> 
     <div class="modal-body"> 
	  
      <p style="color: #000;"><%=description %></p>
     </div>
    </div>
   </div>
   <%} %>

		          </liferay-ui:search-container-row>
		          
		           </liferay-ui:search-container>
</body>
</html>
<%} %>

       