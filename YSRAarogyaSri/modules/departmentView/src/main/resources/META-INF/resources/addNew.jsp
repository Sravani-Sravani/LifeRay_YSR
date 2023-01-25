<%@page import="com.departmentService.service.DepartmentLocalServiceUtil"%>
<%@page import="com.departmentService.model.Department"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<style>
.formContainer{
margin:auto;
padding : 5px;
height:70%;
width:80%;

}
</style>
<%
    long did = ParamUtil.getLong(request, "did");
System.out.println("id is"+did);
   
    String description1 = "";
    String title = "";
    int dval =0;
    boolean istrue = false;
    Department department = null;
    if(did!=0){
    	try{
    		department = DepartmentLocalServiceUtil.fetchDepartment(did);
    		 if(department!=null)
    		 {
    			 description1=department.getDescription();
    		    
    			 title=department.getTitle();
    			 dval = department.getDepartment();
    			// session.setAttribute("description", description1);
    			 System.out.println("description valye  is =====>"+description1+ "<=======");
    		 }
    		
    	}
    	catch(Exception e){
    		
    	}
    }
    
%>
<div class = "formContainer">
<portlet:actionURL name="manageData" var="manageData" />

<aui:form name="myForm"  method="post" action="<%= manageData%>">
                 <h2>Add & Update</h2>
                 <aui:input type="text" value="<%=title %>" name="title" label="Title"  ></aui:input>
	             <aui:input type="hidden" value="<%=did %>" name="did" label=""  >  </aui:input>
                 <br>
     
      
      
            <label class="aui-field-label">Department (Y/N) </label>
            <%if(dval == 1){ %>
			<aui:input label="Yes" id="divCheckbox" name="department" type="radio" value="1" checked="<%=true %>" />
			<aui:input label="No" id="divCheckbox" name="department" type="radio" value="0"  />
			<%}else{ %>
			<aui:input label="Yes" id="divCheckbox" name="department" type="radio" value="1"  />
			<aui:input label="No" id="divCheckbox" name="department" type="radio" value="0" checked="<%=true%>" />
			<%} %>
	  
     
             <label>Description</label>
	         <liferay-ui:input-editor  name="description" initMethod="initEditor" width="50" height="40" 
                         resizable="true"  >
             </liferay-ui:input-editor>   
        
        
             <aui:button type="submit" value="SUBMIT" />                    
     
</aui:form>
</div>
<script>
function showDiv(divid){	   
	   document.getElementById("<portlet:namespace/>department").value = dval;
	  
	}
</script>

 <aui:script>
 function <portlet:namespace/>initEditor(){
 return  "<%= UnicodeFormatter.toString(description1) %>";
 }
 
 
 
 

</aui:script>