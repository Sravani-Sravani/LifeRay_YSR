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
<div class="formContainer" style="padding-bottom: 50px;">
<portlet:actionURL name="manageData" var="manageData" />

<aui:form name="myForm"  method="post" action="<%= manageData%>">
                 <aui:input type="hidden" value="<%=did %>" name="did" label=""  >  </aui:input>
                  <div class="col-md-12">
                <h1 style="text-align:center;margin-bottom: 30px;"><span style="border-bottom: 10px solid #FF6F0C;">Update Alert</span></h1>
           </div>
                <div class="row">
			<div class="col-6">
			<div class="form-group"> 
                 <aui:input type="text" value="<%=title %>" name="title" label="Title"  ></aui:input>
	             </div>
	             </div>   
			<div class="col-6">
			<div class="form-group"> 
            <label class="aui-field-label">Status: </label>
           <div class="row col-12">
           <div class="col-6">
			<aui:input label="Active" id="divCheckbox" name="department" type="radio" value="1"  checked="<%=dval==1 %>"  />
			</div><div class="col-6">
			<aui:input label="InActive" id="divCheckbox" name="department" type="radio" checked="<%=dval != 1 %>" value="0"  />
	 </div></div>
	 </div></div></div>
	 <div class="row">
			<div class="col-12">
			<div class="form-group"> 
             <label>Description</label>
	         <liferay-ui:input-editor  name="description" initMethod="initEditor" width="50" height="20" 
                         resizable="true"  >
             </liferay-ui:input-editor>   
        </div></div></div>
         <div class="col-md-12 row">
			
             <aui:button style="float:right" cssClass="createSuggestionForm btn btn-submit" type="submit" value="SUBMIT" />                    
     </div>
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