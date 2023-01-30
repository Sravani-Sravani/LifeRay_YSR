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
  <link rel="stylesheet" href="/o/com.Department/css/jquery-ui.css">
  <link rel="stylesheet" href="/o/com.Department/css/style.css">
  <link rel="stylesheet" href="/o/com.Department/css/main.css">
<style>
  #sortable { list-style-type: none; margin: 0; padding: 0; width: 60%; }
  #sortable li { margin: 0 3px 3px 3px; padding: 0.4em; padding-left: 1.5em; font-size: 1.4em; height: 18px; }
  #sortable li span { position: absolute; margin-left: -1.3em; }
  </style>
  
  
<%
PortletURL iteratorNewURL = renderResponse.createRenderURL(); 
iteratorNewURL.setParameter("mvcPath", "/view.jsp");
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId1=themeDisplay.getPlid();

	        List<Department> resultList=null;
	        List<Department> DepartmentList =null;
		     int size=0;
		     try{
			     size=DepartmentLocalServiceUtil.getDepartmentsCount();
			     DepartmentList =DepartmentLocalServiceUtil.getDepartments(0, size);
			     System.out.println("Count="+DepartmentList.size());
		     }
		     catch(Exception e){
		    	 e.getMessage();
		     }
 if(role.equalsIgnoreCase("Departmentuser")){ %>
<style>
h1{
margin:auto;
}
</style>
<div class="createuser-page">
  <div class="tenderspage-main">
	<div class="container">
		  <div class="col-md-12">
                <h1 style="text-align:center;margin-bottom: 30px;"><span style="border-bottom: 10px solid #FF6F0C;">Manage Alert</span></h1>
           </div>
<div class="tendersdata-table">
       <%--   <div class="row">
             <div class="col-md-12" style="justify-content: flex-end;">
                            <a href ="<%=addNewUrl %>" cssClass="btn btn-black btn-sm-block" >    
                           	<button type="button" style="width: auto;" class="btn btn-defaulter btn-createTender float-right""> Add</button>
                           </a>                      
                     </div>                  
        </div> --%>
     <div class="table-responsive">
     <div id="complaintTable">
     
		         <liferay-ui:search-container deltaConfigurable="true" delta="20" total="<%=size %>" emptyResultsMessage="No records found" iteratorURL="<%= iteratorNewURL %>" >			 
	                 <% try{
		                resultList = ListUtil.subList(DepartmentList, searchContainer.getStart(),searchContainer.getEnd());
	                      }catch(Exception e){
	                    	  e.getMessage();
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
				      		e.getMessage();
				      	}
				      	
					           
		          %>
 		<liferay-ui:search-container-column-text name="title" value="<%=title %>" /> 

		 <liferay-ui:search-container-column-text name="description" value="<%=description %>" />
		<liferay-ui:search-container-column-text name="Status" value="<%=status %>" />
		
		<liferay-ui:search-container-column-text name="Manage">
		<div style="display: inline-flex;">
			<a class="btn btn-primary m-0 mr-1 hotooltip" onClick="updateRecord('<%=did %>');"><i class="fas fa-edit editicon"><span class="hotooltiptext"></span></i></a>
			<%-- <a class="btn btn-primary m-0 hotooltip" onClick="return deleteRecord('<%=did %>');"><i class="fas fa-trash-alt deleteicon"><span class="hotooltiptext"></span></i></a>
		 --%>
		 </div>
		</liferay-ui:search-container-column-text>
		 
		
		     </liferay-ui:search-container-row>
		<liferay-ui:search-iterator  />
             </liferay-ui:search-container>
            </div>   
       </div>  
</div>  
</div> </div></div>
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


<% }else { 
		       try{
		    	   Department department=null;
		    	   if(DepartmentList!=null){
				      department=DepartmentList.get(0);
		    	   }
				      	long did =0;
				      	String description ="";
				      	String title="";
				      	int depval= 0;
				      	String status="InActive";
				    
				      	try{
				      		depval = department.getDepartment();  
				      		description =department.getDescription(); 
				       		title =department.getTitle();
				        }
				      	catch(Exception e)
				      	{
				      		e.getMessage();
				      	}
if(depval == 1){ %>
		      
<style>
.modal-box h3 { font-size: 1.3em; } 
.modal-box .btn {
  font-size: 3vmin;
  padding: 0.75em 1.5em;
  background-color: #fff;
  border: 1px solid #bbb;
  color: #333;
  text-decoration: none;
  display: inline;
  border-radius: 4px;
  -webkit-transition: background-color 1s ease;
  -moz-transition: background-color 1s ease;
  transition: background-color 1s ease;
}

.modal-box .btn:hover {
  background-color: #ddd;
  -webkit-transition: background-color 1s ease;
  -moz-transition: background-color 1s ease;
  transition: background-color 1s ease;
}

.modal-box .btn-small {
  padding: .75em 1em;
  font-size: 0.8em;
}

.modal-box {
  display: none;
  border-bottom: 1px solid #aaa;
  border-radius: 4px;
  background-clip: padding-box;
  position: fixed; /* Stay in place */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
} 
.modal-box header,
.modal-box .modal-header {
text-align: center;
background-color: #fefefe;
  padding: 1.25em 1.5em;
  border-bottom: 1px solid #ddd;
}

.modal-box header h3,
.modal-box header h4,
.modal-box .modal-header h3,
.modal-box .modal-header h4 { margin: 0; }

.modal-box .modal-body { background-color: #fefefe; padding: 2em 1.5em; }

.modal-box footer,
.modal-box .modal-footer {
  padding: 1em;
  border-top: 1px solid #ddd;
  background-color: #fefefe;
  text-align: right;
}

.modal-overlay {
  opacity: 0;
  filter: alpha(opacity=0);
  position: fixed;
  top: 0;
  left: 0;
  z-index: 1;
  width: 100%;
  height: 100%;
  background-color: rgba(0,0,0,0.4);
} 
/* Modal Content */
.modal-content {
  background-color: #fefefe;
  margin: auto;
  padding: 10px;
  border: 1px solid #888;
  width: 80%;
}


/* The Close Button */
.modal-box .close {
  float: right;
  font-size: 28px;
  font-weight: bold;
  text-decoration: none;
  color: #aaaaaa;
}

.modal-box .close:hover,
.modal-box .close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}
.modal-box .js-modal-close:hover,
.modal-box .js-modal-close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}
</style>
<div id="popup" class="modal-box" style="z-index:99999;">
<div class="modal-content">
  <header> <a class="js-modal-close close">×</a>
    <h3 style="text-align:center;color:red;"><%=title %></h3>
  </header>
  <div class="modal-body">
    <p><%=description %></p>
  </div>
  <footer> <a class="btn btn-small js-modal-close">Close</a> </footer>
</div>
</div>
<script>
$(function(){ 
		 var modal = document.getElementById("popup");
		 modal.style.display = "block";
			
		 $(".js-modal-close, .modal-overlay").click(function() {
			 modal.style.display = "none";
		});
 		$(".close").click(function() {
		  modal.style.display = "none";
		});
		 window.onclick = function(event) {
			  if (event.target == modal) {
			      modal.style.display = "none";
			  }
         }
}); 
 </script> 
   <%
   } 
  }
  catch(Exception e){
	   e.getMessage();
  } 
} 
%>

       