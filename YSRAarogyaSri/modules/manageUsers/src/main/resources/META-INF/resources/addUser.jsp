<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%> 
<%@page import="com.kpmg.manageusers.constants.ManageUsersPortletKeys"%>
<%@page import="com.liferay.portal.kernel.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="java.text.SimpleDateFormat"%> 
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%> 
<%@ include file="/init.jsp" %>

 
  <style>
/*****************************Events In JhansiForm CSS Start**************************************/

.tenderspage-main .tendersdata-table h1, .tenderspage-main h1.tendertext-main {
  color: #001A46;
  text-align: center;
  margin-bottom: 30px;
  
}


.tenderspage-main .tendersdata-table h1 span, .tenderspage-main h1.tendertext-main span {
  border-bottom: 10px solid #FF6F0C;
} 


/*.tenderspage-main .tender-form {
  width: 500px;
  margin: 0px auto;
}*/

.tenderspage-main .tender-form  .btn-submit{
  background-color: #83C127;
  color: #fff;
  padding: 10px 20px;
  border-radius: 8px;
  width: 32%;
}

.tenderspage-main .tender-form .form-group label {
    color: #04537A;
    font-weight: bold;
}
.btn-complaint {
  border: 1px solid #707070;
  text-align: left;
}

/*****************************Events In JhansiForm CSS End**************************************/
  </style>
<portlet:actionURL var="userCreateURL" name="manageUsers">

 </portlet:actionURL>
 
<portlet:resourceURL var="emailAddressValidationURL"></portlet:resourceURL>
 <%
    long userId = ParamUtil.getLong(request, "userId");
    String tabval = ParamUtil.getString(request, "tabval");
    System.out.println("userId >>>"+userId );
    User userData=null;
    String firstName="";
    String lastName="";
    String screenName="";
    String emailAddress="";
    long departmentId=0;
    long roleId=0;
    String startTime="";
    String endTime="";
    long fileEntryId=0L;
    String fileUrl="";
    String address="";
    long userRole=0L;
    String mobileNumber="";
    int gender=0; 
    long[] userRoles=null; 
    long userDepartment=0;
    if(userId!=0){
    	try{
    		userData=UserLocalServiceUtil.fetchUser(userId);
    		 if(userData!=null){
    			 firstName=userData.getFirstName();
    			 lastName=userData.getLastName();
    			 screenName=userData.getScreenName();
    			 emailAddress =userData.getEmailAddress();
    			 if(emailAddress.contains("no-emailaddress.com")){
		      			emailAddress="";	
		      		}
    			userRoles= userData.getRoleIds();  
    			long[] userOrganization= userData.getOrganizationIds();
    			if(userOrganization.length>0){
    			   userDepartment=userOrganization[0];
    			   System.out.println("userDepartment"+userDepartment);
    			}
    			
    			List<Role> userRolesList= userData.getRoles();
    			  //System.out.println(roles);
    				if(userRolesList != null && userRolesList.size() > 0){
    					for(Role roleData:userRolesList ){
    						if(roleData.getRoleId()==ManageUsersPortletKeys.IT_DEPARTMENT_USER){
    							      userRole=roleData.getRoleId();
    							break;
    						}
    			        }
    			    }
    				 
    				
    			 }
    	}
    	catch(Exception e){
    		
    	}
    }
    System.out.println("userRoles>>>"+userRoles);
    %>
  
  
  <div class="jhansiall-pages">
  <div class="tenderspage-main my-5">
    <div class="container">
    <liferay-ui:error key="userRole.errorMsg.missing" message="userRole.errorMsg.missing"/>
    <liferay-ui:error key="firstName.errorMsg.missing" message="firstName.errorMsg.missing"/>
    <liferay-ui:error key="lastName.errorMsg.missing" message="lastName.errorMsg.missing"/>
    <liferay-ui:error key="email.errorMsg.missing" message="email.errorMsg.missing"/>
    <liferay-ui:error key="mobileNumber.errorMsg.missing" message="mobileNumber.errorMsg.missing"/>
    <liferay-ui:error key="userName.errorMsg.missing" message="userName.errorMsg.missing"/>
    <liferay-ui:error key="address.errorMsg.missing" message="address.errorMsg.missing"/>
    <liferay-ui:error key="gender.errorMsg.missing" message="gender.errorMsg.missing"/>
          <div class="col-md-12">
                <h1 class="tendertext-main"><span><% if(userId==0){ %>Create <% }else{ %>Update<% } %> User</span></h1>
          </div>

      <div class="tender-form">
        <aui:form  action="<%=userCreateURL %>" method="post" name="createUserForm">
	       <aui:input type="hidden" label="" name="userId" value="<%=userId %>"></aui:input>
	       <aui:input type="hidden" label="" name="tabval" value="<%=tabval %>"></aui:input>
	       
	       <div class="row">
	       <div class="col-md-6">
	       
	       <div class="form-group"> 
	        	<aui:select name="userRole" onchange="manageDepartment(this.value)" cssClass="form-control selectfieldstyle" label="User Role" value="<%=userRole %>"  showRequiredLabel="<%= true %>">											
					<aui:option value="">Select</aui:option> 
					<%  String roleName = ""; %>.
	        	       <aui:option value="<%=ManageUsersPortletKeys.IT_DEPARTMENT_USER %>">IT Department User</aui:option> 
					 <%  //} } %>
					 <aui:validator name="required"></aui:validator>
				</aui:select>
			 </div>
			 <script>
			 function manageDepartment(userRole){ 
					 $("#departmentDiv").hide();
					 $("#<portlet:namespace />department").val("");
				 
			 }
			 </script>
			  
	       <div class="form-group"> 
	           <aui:input type="text" label="First Name" onkeypress="return ((event.charCode > 64 && 
event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || (event.charCode > 43 && event.charCode < 58) || event.charCode == 0 || event.charCode == 32)"  name="firstName" value="<%=firstName %>" cssClass="form-control">
	           <aui:validator name="required"></aui:validator>
	           	          
	          </aui:input>
	        </div>
	          <div class="form-group">
	          <aui:input type="text" onkeypress="return ((event.charCode > 64 && 
event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || (event.charCode > 43 && event.charCode < 58) || event.charCode == 0 || event.charCode == 32)" value="<%=lastName %>" name="lastName" label="Last Name" cssClass="form-control">
	          
	          <aui:validator name="required"></aui:validator>
	          	     
	          </aui:input> 
	        </div>
	           <div class="form-group">
	          <aui:input autoFocus="false" cssClass="form-control cardfieldstyle"
				name="emailAddress" type="text" value="<%=emailAddress %>" autocomplete='off'>
				<aui:validator name="email" />
				<aui:validator name="required"></aui:validator>
					 
			</aui:input>
			<div class="form-validator-stack has-error  custom_email_unique"
				style="display: none">
				<div class="help-block" role="alert">Email address already exists. please try again with another Email address</div>
			</div>
	        </div>
	        <% if(userId!=0){ %>
	        <div class="form-group">
	        <aui:input cssClass="cardfieldstyle password_field" label="Update Password"  autocomplete="off"
				name="password1" size="30" type="password" value="">
				<aui:validator name="minLength"  errorMessage="Please enter min 8 characters">8</aui:validator>
				 
			</aui:input>
			<div class="alert alert-info ">(Note: Password is Encrypted you can't see but you can update the password.)</div>
</div>
 
 <% } %>
       </div>
	       <div class="col-md-6">
	       <div class="form-group"> 
			<aui:input cssClass="form-control cardfieldstyle" name="mobileNumber" autocomplete='off'
				label="Mobile Number"  showRequiredLabel="<%= true %>"
				onkeypress="return (event.charCode > 47 && event.charCode < 58)"
				type="text" value="<%=mobileNumber %>">
					<aui:validator name="maxLength"  errorMessage="Please enter valid 10 digits mobile number">10</aui:validator>
					<aui:validator name="minLength"  errorMessage="Please enter valid 10 digits mobile number">10</aui:validator>
					<aui:validator name="number"/>
					<aui:validator name="required" />
					 
			</aui:input>
			</div>
	       <div class="form-group"> 
	           <aui:input type="text" label="User Name" onkeypress="return ((event.charCode > 64 && 
event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || (event.charCode > 43 && event.charCode < 58) || event.charCode == 0 || event.charCode == 32)"  name="screenName" value="<%=screenName %>" cssClass="form-control">
	           <aui:validator name="required"></aui:validator>
	           	      
	          </aui:input>
	          <div class="form-validator-stack has-error custom_screen_unique" style="display: none">
				<div class="help-block" role="alert">User Name is already registered. please try again with another User Name.</div>
			</div>
	        </div>
	        <div class="form-group"> 
	          <aui:select label="gender" cssClass="cardfieldstyle" name="gender"
					showRequiredLabel="<%= true %>" required="<%= true %>" value="<%=gender %>">
					<aui:option label="Select" value="" />
					<aui:option label="male" value="1" />
					<aui:option label="female" value="2" />
					<aui:validator name="required" />
				</aui:select>
	         </div>
	        <div class="form-group">
	          <aui:input type="textarea" onkeypress="" value="<%=address %>" name="address" label="Address" cssClass="form-control"> 
	          	       
	          </aui:input> 
	        </div>
	          
	      </div>  
	           
	        </div>
 
	          <div class="row">
	          <div class="col-md-12">
	          <div class="text-center">
	              <aui:button type="submit" name="addUser" value="Submit" cssClass="btn btn-submit" />
	              </div>
	              </div>
	              </div>
	      </aui:form>
	          </div>
	          </div>
	          </div>
      </div>
<script>
function getUploadImageURL(uploader){
	if ( uploader.files && uploader.files[0] ){
	 
        $('#uploadImage').attr('src',  window.URL.createObjectURL(uploader.files[0]) );	
         $('#uploadImage').show();
    }
	else{
		$('#uploadImage').attr('src',"");
		 $('#uploadImage').hide();
	}

} 
</script>
 