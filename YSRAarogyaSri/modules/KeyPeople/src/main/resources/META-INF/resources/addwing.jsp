
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.keyPeopleService.model.Wing"%>
<%@page import="com.keyPeopleService.service.WingLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<style>
.formContainer{
margin:auto;
padding : 5px;
height:70%;
width:80%;

}
</style>
<%
PortletURL iteratorNewURL = renderResponse.createRenderURL(); 
iteratorNewURL.setParameter("mvcPath", "/addwing.jsp");

/* catch(Exception e){
	e.printStackTrace();
} */
   
    String wname = "";
    String status ="";
    boolean istrue = false;
    Wing wing = null;
	long wid = ParamUtil.getLong(request, "wid");
	System.out.println("idsssss is"+wid);

	System.out.println("isgfgg");

    try{


    if(wid!=0){
    
    		wing=WingLocalServiceUtil.fetchWing(wid);
    		 if(wing!=null){
    			 wname = wing.getWname();
    			 status = wing.getStatus();
    			  
    		 }
    	}
	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    
   
  
%>
<portlet:actionURL name="manageWing" var="manageWingURL" />
<div class = "formContainer">


<aui:form name="myForm"  method="post" action="<%=manageWingURL%>">
                 <h2>Add & Update</h2>
                 <aui:input type="text" value="<%=wname %>" name="wname" label="Wing Name : "  ></aui:input>
	             <aui:input type="hidden" value="<%=wid %>" name="wid" label=""  >  </aui:input>
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
