
<%@page import="com.keyPeopleService.model.KeyPeople"%>
<%@page import="com.keyPeopleService.model.Designation"%>
<%@page import="com.keyPeopleService.service.KeyPeopleLocalServiceUtil"%>
<%@page import="com.keyPeopleService.service.WingLocalServiceUtil"%>
<%@page import="com.keyPeopleService.service.DesignationLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp"%>  
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.keyPeopleService.model.Wing"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
 <portlet:actionURL var="manageFormsURL" name="manageForms">
 </portlet:actionURL>
 <%
    long keyPeopleId = ParamUtil.getLong(request, "keyPeopleId");
    System.out.println("keyPeopleId >>>"+keyPeopleId );
    KeyPeople keyPeople=null; 
   
    String name="";
    String email = "";
    String mobile = "";
    long desigId = 0L;
    long wingId =0L;
    String status = "";
    
    
    if(keyPeopleId!=0){
    	try{
    		keyPeople=KeyPeopleLocalServiceUtil.fetchKeyPeople(keyPeopleId);
    		 if(keyPeople!=null){
    			 name = keyPeople.getEmpname();
    			 email = keyPeople.getEmail();
    			 mobile = keyPeople.getPhone();
    			 status = keyPeople.getStatus();
    			 desigId = keyPeople.getDesignationId();
    			 wingId = keyPeople.getWingId();
    			 
    			
    		 }
    	}
    	catch(Exception e){
    		
    	}
    }
    %>
<div class="createuser-page">
<div class="">
	<div>
  <div class="tenderspage-main">
  	<div class="container">
  	<liferay-ui:error key="name.errorMsg.missing" message="name.errorMsg.missing"/>
    <liferay-ui:error key="hi_name.errorMsg.missing" message="hi_name.errorMsg.missing"/>
    <liferay-ui:error key="designation.errorMsg.missing" message="designation.errorMsg.missing"/>
    <liferay-ui:error key="hi_designation.errorMsg.missing" message="hi_designation.errorMsg.missing"/>
    <liferay-ui:error key="officeNumber.errorMsg.missing" message="officeNumber.errorMsg.missing"/>
    
  		  <div class="col-md-12">
                <h1 class="tendertext-main"><span><% if(keyPeopleId==0){ %>Create <% } else { %>Update <% } %><liferay-ui:message key=" key people"/></span></h1>
           </div>	
	    <div class="tender-form">
	      <aui:form  action="<%=manageFormsURL %>" method="post" name="fm">
	       <aui:input type="hidden" label="" name="keyPeopleId" value="<%=keyPeopleId %>"></aui:input>  
	       <div class="row">
	       <div class="col-md-6">
	  
	        <div class="form-group">
	          <aui:input type="text" value="<%=name %>" onkeypress="return ((event.charCode > 64 && 
event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || (event.charCode > 39 && event.charCode < 58) || event.charCode == 0 || event.charCode == 32)" name="name" label="Employee Name" cssClass="form-control">
	          <aui:validator name="required"></aui:validator>

	          </aui:input>
	        </div>
	        <div class="form-group"> 
	           <aui:input type="text" label="Email:"  name="email" value="<%=email %>" cssClass="form-control">
	           <aui:validator name="required"></aui:validator>
	          </aui:input>
	        </div> 
	          <div class="form-group"> 
	           <aui:input type="text" label="Mobie No" name="mobile" value="<%=mobile %>" cssClass="form-control">
	           <aui:validator name="required"></aui:validator>

	          </aui:input>
	        </div>
	       </div>
	       <div class="col-md-6">
	        <div class="form-group"> 
	           <label class="aui-field-label">Status </label>
            <%if(status.equals("Y")){ %>
			<aui:input label="Yes" id="" name="department" type="radio" value="Y" checked="<%=true %>" />
			<aui:input label="No" id="" name="department" type="radio" value="N"  />
			<%}else{ %>
			<aui:input label="Yes" id="" name="department" type="radio" value="Y"  />
			<aui:input label="No" id="" name="department" type="radio" value="N" checked="<%=true%>" />
			<%} %>
	        </div>
	        
	        <div class="form-group">
	        
	            <aui:select name="wingId" onchange="getdesignation(this.value)"  cssClass="form-control selectfieldstyle" label="Wing" value="<%=wingId %>">											
					<aui:option value="">Select</aui:option> 
					 <%  DynamicQuery dynamicQuery = null; 
						dynamicQuery = WingLocalServiceUtil.dynamicQuery();
                     // dynamicQuery.add(RestrictionsFactoryUtil.eq("languageId", "en_US")); 
						dynamicQuery.addOrder(OrderFactoryUtil.asc("wname"));
						List<Wing> wings=WingLocalServiceUtil.dynamicQuery(dynamicQuery, 0, WingLocalServiceUtil.getWingsCount());
               	for(Wing wing:wings){
	        		String str = wing.getWname();
	                String words[]=str.split("\\s");
	                String capitalizeStr="";
	                for(String word:words){ 
	                    String firstLetter=word.substring(0,1);
	                    String remainingLetters=word.substring(1).toLowerCase();
	                    capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";   } %>										
					 <aui:option value="<%=wing.getWid() %>"><%=capitalizeStr+" ("+wing.getWname()+")" %></aui:option>
					 <% } %> 
				</aui:select>
	        </div>
	        
	         <div class="form-group"> 
	         
			  <aui:select  name="degSelect" onchange="getwing(this.value)" cssClass="form-control selectfieldstyle" label="Designation" value="<%=desigId %>">											
					 <aui:option value="">Select</aui:option> 
					  <%  DynamicQuery dynamicQuery = null; 
							dynamicQuery = DesignationLocalServiceUtil.dynamicQuery();
	                       // dynamicQuery.add(RestrictionsFactoryUtil.eq("languageId", "en_US")); 
							dynamicQuery.addOrder(OrderFactoryUtil.asc("dname"));
							
							  List<Designation> desig=DesignationLocalServiceUtil.dynamicQuery(dynamicQuery, 0, DesignationLocalServiceUtil.getDesignationsCount());
	 	        		 for(Designation data:desig) { 
								String str = data.getDname();
				                String words[]=str.split("\\s");
				                String capitalizeStr="";
				                for(String word:words){ 
				                    String firstLetter=word.substring(0,1);
				                    String remainingLetters=word.substring(1).toLowerCase();
				                    capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" "; }			%>
					  <aui:option value="<%=data.getDid() %>"><%=capitalizeStr %></aui:option> 
					 <% } %>
				</aui:select>
	        </div>

	        <aui:button type="submit" name="createkeyPeople" value="Submit" cssClass="btn btn-submit" />
	       </div>
	       </div>
	            
	         
	      </aui:form>
	    </div>
	</div>
  </div>
 </div></div>
 </div>
 <link href="/o/com.keypeople/css/select2.min.css" rel="stylesheet" />
<script src="/o/com.keypeople/js/select2.min.js"></script>  
<portlet:resourceURL var="getkeyPeopleURL"></portlet:resourceURL> 

<script>
function showDiv(divid){	   
	   document.getElementById("<portlet:namespace/>department").value = status;
	  
	}
	
function selectElement(id, valueToSelect) {    
    let element = document.getElementById(id);
    element.value = valueToSelect;
}

selectElement('wing', wingId);

///  Dynamic dropdown for Designation

function getdesignation(wingId){
	 AUI().use('aui-base','aui-io-request-deprecated', 'aui-node', function(A){
	    A.io.request('<%=getkeyPeopleURL.toString() %>',{
		    dataType : 'json',
		    method : 'GET',
		    data : {
			    <portlet:namespace />wingId :wingId,
			    <portlet:namespace />cmd:'getdesignation'
		    },
		    on : {
		    success : function() {
	           			 var data=this.get('responseData');
	           			 console.log(data);
	           			 var textElement="";
	           			 textElement= textElement+"<option value=''>Select</option>";
	           			 $('#<portlet:namespace />degSelect').html("");
	           			 jQuery.each(data, function(i, val) {
	           			 textElement=textElement+"<option value='" + val.id + "'>"+ val.name + "</option>";
	           			});
	           			 $('#<portlet:namespace />degSelect').append(textElement);
	           			 
	           			 }  
	           }
	       });
	}); 
	
}

</script>
       

 