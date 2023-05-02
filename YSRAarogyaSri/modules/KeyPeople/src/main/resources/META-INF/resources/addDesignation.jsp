<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.keyPeopleService.model.Wing"%>

<%@page import="com.keyPeopleService.service.WingLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<style>
.formContainer{
margin:auto;
padding : 5px;
height:70%;
width:80%;

}
</style>
<%
String dname = "";
String status ="";
long did=0;

try{
     did = ParamUtil.getLong(request, "did");
  //  System.out.println("id is"+did);
    long wid = ParamUtil.getLong(request, "wid");
    boolean istrue = false;
}
    catch(Exception e){
    	e.printStackTrace();
    }
  
%>
<div class = "formContainer">
<portlet:actionURL name="manageDesig" var="manageDesigURl" />

<aui:form name="myForm"  method="post" action="<%= manageDesigURl%>">
                 <h2>Add & Update Designation</h2>
                  <% 
		        List<Wing> resultList=null;
			    int size=WingLocalServiceUtil.getWingsCount();
			     List<Wing> WingList = WingLocalServiceUtil.getWings(0, size);
			   //  System.out.println("Count="+WingList.size());
		        %> 	
		       
                 <aui:select name="Wing">
                     <c:forEach items="<%=WingList%>" var="WingItem">
                         <aui:option value="${WingItem.wid}">${WingItem.wname}</aui:option>
                     </c:forEach>
                 </aui:select> 
                 
                 <aui:input type="text" value="<%=dname %>" name="dname" label="Designation Name : "  ></aui:input>
	             <aui:input type="hidden" value="<%=did %>" name="did" label=""  >  </aui:input>
	            
                 <br>
     
      
      
            <label class="aui-field-label">Status </label>
            <%if(status.equals("Y")){ %>
			<aui:input label="Yes" id="divCheckbox" name="status" type="radio" value="Y" checked="<%=true %>" />
			<aui:input label="No" id="divCheckbox" name="status" type="radio" value="N"  />
			<%}else{ %>
			<aui:input label="Yes" id="divCheckbox" name="status" type="radio" value="Y"  />
			<aui:input label="No" id="divCheckbox" name="status" type="radio" value="N" checked="<%=true%>" />
			<%} %>
	  
     
            
        
        
             <aui:button type="submit" value="SUBMIT" />                    
     
</aui:form>
</div>
<script>
function showDiv(divid){	   
	   document.getElementById("<portlet:namespace/>status").value = dval;
	  
	}
</script>
