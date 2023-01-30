<!-- /**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */ -->
<%@page import="com.appstek.norka.customtables.service.NorkaLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.appstek.norka.customtables.service.DocumentLocalServiceUtil"%>
<%@page import="com.appstek.norka.customtables.model.Document"%>
<%@page import="java.util.List"%>
<%@page import="com.norka.portlet.login.constants.NorkaLoginPortletKeys"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portal.kernel.model.Phone"%>
<%@page import="com.liferay.portal.kernel.service.PhoneLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Contact"%>
<%@page import="com.liferay.portal.kernel.service.ContactLocalServiceUtil"%>
<%@page import="com.norka.portlet.login.portlet.util.CustomUtil"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.liferay.portal.kernel.model.Country"%>
<%@page import="com.liferay.portal.kernel.service.CountryServiceUtil"%>
<%@ include file="/html/init.jsp" %>
<link href="/o/com.norka.portlet.login/css/bootstrap.min.css" rel="stylesheet" type="text/css"  />
<script src="/o/com.norka.portlet.login/js/bootstrap.min.js"></script>
<link href="/o/com.norka.portlet.login/css/main.css" rel="stylesheet" />
<link href="/o/com.norka.portlet.login/css/intlTellnput.css"  rel="stylesheet" media="screen"/>
<script src="/o/com.norka.portlet.login/js/intlTelInput.js"></script>
<script src="/o/com.norka.portlet.login/js/intlTelInput.min.js"></script>
<script src="/o/com.norka.portlet.login/js/utils.js"></script>



<%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<style>
	.forget-msg{
		color: #a94442;
	font-size: 16px;
	font-weight: bold;
	
	}
		.pwd-checkmark {
  position: absolute;
     top: 2px;
    left: 0px !important;

}
.sms-otp-sec input { height:42px;}
.captcha{
		padding-left: 2px !important;
	}
	table{
	border-collapse: collapse;
}
.contry-code-input input {width:301px !important;}
table td{
	padding: 10px;
}
table th{
	background-color: #02579a;
	color: #fff;
	padding: 10px;
}
.modal-dialog {
    position: initial;
}
@media (min-width: 576px){
.modal-dialog {
    max-width: 650px !important;
    margin: 1.75rem auto;
}	
}
@media (min-width: 768px){
.mb-spacing {
    
    margin: 30px 0px 0px;;
}	
}

.intl-tel-input {
    position: relative;
    display: inline-block;
    width: 90%;
    height: 43px;
}
#mobileNumber{
 width:301px !important;
 }
</style>
<portlet:defineObjects />

<head>
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
</head>
<%
String cmd = ParamUtil.getString(request, NorkaLoginPortletKeys.CMD);
String passportNumber = (String) request.getAttribute("passportNumber");
String mobileNumber = (String) request.getAttribute("mobileNumber");
String firstName = (String) request.getAttribute("firstName");
String dob = (String) request.getAttribute("dob");

String norkaId = (String) request.getAttribute("norkaId");
String radioCheck = (String) request.getAttribute("radioButtonValueCheck");
System.out.println("passportNumber>"+passportNumber);
String phoneNum1 = "";
String countryCode = "";
User userData =null;
String unMaskedNumber = "";
String message ="";
String userName = "";
List<Long> usersList = null;

List<Country> countryList=CountryServiceUtil.getCountries();
HashMap<String,String> countryDetails =new HashMap<String,String>();  
for(Country country : countryList){
	countryDetails.put(country.getIdd(), country.getA2());
}

String mobileNo ="";
String countryModelCode ="";


%>
<portlet:resourceURL var="userNameSendOtpURL"></portlet:resourceURL>



    <portlet:actionURL name="/citizen/forgot_username" var="editPhoneNumberURL">
    	
    </portlet:actionURL>
    
    <portlet:actionURL name="passReset" var="passResetURL">
    	
    </portlet:actionURL> 
    
     <portlet:actionURL name="login" var="loginURL">
    	
    </portlet:actionURL> 
    
    
    
    <portlet:actionURL name="/norka/forgot_username" var="sendOTPURL">
    	
    </portlet:actionURL>
<portlet:actionURL name="/norka/validate_opt" var="submitOtpURL" >
	<portlet:param name="<%= NorkaLoginPortletKeys.CMD %>" value="<%= cmd %>"/>
</portlet:actionURL>
	
<div class="loginsgnup-page">
<div class="">
<aui:form action="<%= submitOtpURL %>" method="post" name="fm" cssClass="form sign-in-form otp-form">	
	<aui:fieldset column="<%= true %>">
	</aui:fieldset>
		<aui:col cssClass="col-md-8 col-lg-8 col-sm-6 col-xs-12" >
		 <%-- <h3>Passport Number :<b> <%=passportNumber %></b></h3> --%>
			<ul>
		    <%	
		    message="";
		    if(radioCheck.equals("doc"))
		    {
		    	message="No UserName exist with the submitted document  ";
		      usersList = NorkaLocalServiceUtil.getUserIdByDocumentNumber(passportNumber);
		    }
		    else  if(radioCheck.equals("mob"))
		    {
		    	message="No UserName exist with the submitted Mobile Number ";
		    	  usersList = NorkaLocalServiceUtil.getUserIdByMobileNumber(mobileNumber);
		    }
		    else  if(radioCheck.equals("dob"))
		    {
		    	message="No UserName exist with the First Name matching DOB ";
		    	  usersList = NorkaLocalServiceUtil.getUserIdByFN_DOB(firstName,dob);
		    }
		    else  if(radioCheck.equals("nor"))
		    {
		    	message="No UserName exist with the Norka ID ";
		    	  usersList = NorkaLocalServiceUtil.getUserIdByNorkaId(norkaId);
		    }
		    //  System.out.println("docs.size() 12345>>>"+docs.size());
			  if(usersList.size()>0){
				  
				  
				  %>
				    <table border="1" >
			      <tr>
			       <th>
			        <b>UserName </b>
			        </th>
			         <th>
			        <b>Country Code </b>
			        </th>
			         <th>
			        <b>Mobile No </b>
			        </th>
			        <th>
			        <b>Action</b>
			        </th>
			        </tr>
				  <%
				//  System.out.println("docs.size()>>>"+docs.size());
				  for(long userId  :usersList){ %>
		       <li>
		    	   
		    	 <%  phoneNum1="";
		    	   countryCode ="";
		    	   unMaskedNumber="";
		    	   userName ="";
		    	 //  System.out.println("test passport:"+doc.getUserId());
		    	userData =null;
			        userData=UserLocalServiceUtil.fetchUser(userId);
			       if(userData!=null){
			   	List<Phone> phoneList = PhoneLocalServiceUtil.getPhones(userData.getCompanyId(), Contact.class.getName(), userData.getContactId());
				for(Phone phone: phoneList) {
					if((NorkaLoginPortletKeys.MOBILE_NUMBER_TYPE == phone.getTypeId())) {
						phoneNum1 = CustomUtil.getMaskedMobileNumber(phone.getNumber());						
						countryCode = phone.getExtension();
						unMaskedNumber =phone.getNumber();
					 
					}
				}
				
					userName=userData.getScreenName();
			       %>
			    
			        <tr>
			        <td><%=userData.getScreenName()%></td>
			          <td><%=countryCode%></td>
			             <td><%=phoneNum1%></td>
			             <% 
			             if(unMaskedNumber== null || unMaskedNumber.equals(""))
			             {
			            	 unMaskedNumber ="0";
			             }
			             if(countryCode== null || countryCode.equals(""))
			             {
			            	 countryCode="+91";
			             }
			          
			            	 %>
			     		 <td><a href="<%="javascript:editPhoneNumber("+userId+","+unMaskedNumber+","+countryCode+",'"+userName+"');"%>" class="btn btn-primary btn-pay"> <strong>Edit</strong></a></td> 
			            </tr>
			       
			        
		     <% } %></li>
		   <% }%> </table><% } else{ %>
			    <li class="forget-msg"><%=message %></li>
			   <% } %>
		</ul>
		<br/>
		<div class="form-group form-check mb-4 text-center" style="float:left;padding:0;"> 
			<label class="form-check-label">
		
		   <a href="/login"  rel="nofollow" data-redirect="false" id="sign_in" class="sign_in_custom" ">
		   <b><% if(usersList.size()>0){ %> Login <% }else{ %> Back <% } %></b>
		   </a>
			
						    </label>
				  </div>				  

				  
		
		
	</aui:col>
</aui:form>
</div>
</div>


<div class="modal fade" id="callEdit" role="dialog" style="display:none;">



<div>
<aui:form action="<%=passResetURL%>" method="post" name="passResetForm">
	<aui:input type="hidden" name="userId" value=""></aui:input>
	</aui:form>
</div>
<div>
<aui:form action="<%=loginURL%>" method="post" name="loginForm">
	<aui:input type="hidden" name="loginUserId" value=""></aui:input>
		
	</aui:form>
</div>
			    <div class="modal-dialog">

			    <aui:form method="post" action="" name="editPhoneNumForm">
			      <!-- Modal content-->
			      <div class="modal-content sms-otp-sec">
			        <div class="modal-header"  style="background: #02579a; padding: 23px;">
		          <h4 class="modal-title" style="font-weight: bold; font-size: 17px; text-align: center;color: #FFFFFF;">Edit Mobile Number</h4>
		      <!--     <button type="button" class="close" data-dismiss="modal" style="color: #fff;opacity: 1;" id="fromclose">&times;</button>  -->
		        </div>
		        
		       
		        <div class="modal-body " >
		         <div class="col-md-12">
		        	<div class="row">
		        	 <div class="col-md-7" style="margin-top:15px">
					 <aui:input cssClass="form-control cardfieldstyle" name="usrName" label="User Name"  type="text" readOnly="true" value="">
					 </aui:input>
				 </div>
		        	</div>
		        </div>
		            
		            
		         	<%
		         	 String coutryInitials="";
		         	 for(Map.Entry m:countryDetails.entrySet())  
                     {  
                     	if(countryCode.equals(m.getKey())){
                            coutryInitials = (String)m.getValue();
                     	}
                       // System.out.println(m.getKey()+" "+m.getValue());
                     }  
		         	%>
		        <aui:input type="hidden" name="usr" value=""/>
		        <input type="hidden" id="cCode" value="<%=countryModelCode %>"/>
                        <input type="hidden"  id="cInitials" value="<%=coutryInitials %>"/>
                        
                <div class="col-md-12">

                 <div class=" row">
                 <div class="col-md-7 contry-code-input">
		              <aui:input cssClass="form-control cardfieldstyle" name="countryCode"  id="countryCode" type="hidden" value="<%=countryCode %>" />
		              <aui:input cssClass="cardfieldstyle form-control" id="mobileNumber" placeholder="Enter Mobile Number" onkeypress="return (event.charCode > 47 && event.charCode < 58) ||  event.charCode==43 || event.charCode==0" value="<%=mobileNo%>" name="mobileNumber" label="Mobile Number with Country Code" type="tel" >

					    <aui:validator name="required"></aui:validator>
					</aui:input>
					<aui:input type="hidden" value="" name="phoneNumberValidate" />
					 <span id="error-msg" style="color: #a94442;" class="hide">Please Enter Valid Number</span>			      
			        <div class="modal-footer" style="margin-top: 30px;float: left;padding: 0px;">
			        
			        
			        	
						
						</div>
						</div>
						<div class="col-md-3">
			           <div class="ta-left">
							 <aui:button type="button" cssClass="btn btn-black btn-sm-block" style="    background-color: #02579a;
    border-color: #02579a; margin-top:24px;
    color: white;"value="Send OTP To Validate" name="sendOTP" onClick="return sendOTP();"></aui:button>
					         
					   </div>
					   
					   <div id="loginDisplay" style="display: none;float: left;">
									<div class="form-group form-check mb-4" style="padding:0px 0px 0px 0xp;">
										
									</div>
								</div>
					   </div>
								

							</div> 
							<div class="row">
							<div id ="labelDisplay"  style="display:none;text-align: left;" >
			        	<label  class="control-label" style="font-weight: bold;">Please click on Password Reset button to get the password through SMS.</label>
						
						<div class="col-md-5">
						<aui:button type="button" cssClass="btn btn-primary mb-3" style="display:none;border-radius: 25px !important;
    padding: 6px 20px;
    color: #FFFFFF;
    margin: 0;
    font-weight: bold;
    background: #ef5350 !important;
    width: 100%;" value="Password Reset" name="passwordRest" onClick="passReset();"></aui:button>
						</div>
	<div class="col-md-3">
							
    <label class="form-check-label">  
										<aui:button type="button" style="margin-left: -14px;   background-color: #02579a;
    border-color: #02579a;
    color: white;" cssClass="btn btn-primary mb-3" value="Login" name="login" onClick="login();"></aui:button>
										</label></div></div>
							</div>
			    </div>              
            <div class="col-md-12" id="validate_opt" Style="display:none;">
            	<div class="row">
                  <div class="col-md-7">
					 <aui:input cssClass="form-control cardfieldstyle" name="otpInputText" label="Enter OTP"  type="text" value="">
					 </aui:input>
				 </div>
				 <div class="col-md-3">
					  <div id="otpInputText_error_msg" style="display: none;color: red; margin-top : -7px;"></div> <br/>
			       
					 <div class="">					
				 <aui:button type="button" cssClass="btn btn-primary" style="margin-top:3px;    background-color: #02579a;
    border-color: #02579a;
    color: white;"value="Validate OTP To Update" name="submitMobile" onClick="return updateMobileNumberFunc();"></aui:button>    
			    </div>
			    </div>
			    </div>
			</div>
			  <div class="col-md-12">
			      </div>

<p>
I do hereby declare that the Mobile Number entered above is in my possession and, based on this declaration, you are requested to record the aforesaid Mobile Number in my account and any 
discrepancies noted in this regard I shall be held responsible for the same. 
</p>
			       <div style="margin-left: 18px;margin-top: 10px;"> 
			        	<button type="button" class="btn btn-primary mb-3" data-dismiss="modal" id="resetBtnCancel">Cancel</button>

			        </div>
			        </div>
			      </div>
			      
			      
			 	</aui:form>
			    </div>
			  </div>
<aui:script>

var telInput =  $("#<portlet:namespace />mobileNumber"),
errorMsg = $("#error-msg"),
validMsg = $("#valid-msg");
var cInitals = $("#cInitials").val();
var cCode =$("#cCode");

if(cInitals !== null && cInitals !== ''){
	cInitals =cInitals;
}else{
	cInitals ="IN";
}
// initialise plugin
telInput.intlTelInput("setCountry", "IN");
telInput.intlTelInput({
	
allowExtensions: true,
formatOnDisplay: true,
autoFormat: true,
autoHideDialCode: true,
autoPlaceholder: true,
defaultCountry: "auto",
ipinfoToken: "yolo",

nationalMode: false,
numberType: "MOBILE",
//onlyCountries: ['us', 'gb', 'ch', 'ca', 'do'],
preferredCountries: ['sa', 'ae', 'qa','om','bh','kw','ma'],
preventInvalidNumbers: true,
separateDialCode: true,
initialCountry: cInitals,
geoIpLookup: function(callback) {
$.get("http://ipinfo.io", function() {}, "jsonp").always(function(resp) {
  var countryCode = (resp && resp.country) ? resp.country : "";
  callback(countryCode);
  
});
},
utilsScript: "/o/com.norka.portlet.login/js/utils.js"
}); console.log("contry code2");

var reset = function() {
telInput.removeClass("error");
errorMsg.addClass("hide");
validMsg.addClass("hide");
};

// on blur: validate
telInput.blur(function() {
reset();
if ($.trim(telInput.val())) {
	 if (telInput.intlTelInput("isValidNumber")) {
	    	$("#<portlet:namespace/>phoneNumberValidate").val("");
	      validMsg.removeClass("hide");
	    } else {
	    	$("#<portlet:namespace/>phoneNumberValidate").val("1");
	      telInput.addClass("error");
	      errorMsg.removeClass("hide");
	    }
}
var code = $(".selected-dial-code").text();
console.log("code>>>"+code);
$("#<portlet:namespace />countryCode").val(code);
//console.log(code);
});
// on keyup / change flag: reset
telInput.on("keyup change", reset);
function editPhoneNumber(userid,mobNum,countryCode,usrName)
{
	console.log("userName>>>>"+usrName);
	$("#<portlet:namespace/>usr").val("");
	$("#<portlet:namespace/>usrName").val("");
	$("#<portlet:namespace/>countryCode").val("");
	$("#<portlet:namespace/>otpInputText").val("");
	$("#<portlet:namespace/>mobileNumber").val("");
	$("#cCode").val("");
	$("#cInitials").val("");
	 $("#<portlet:namespace/>sendOTP").show();
 	$("#otpInputText_error_msg").html("");
	 $("#<portlet:namespace/>passwordRest").hide();
	 $("#validate_opt").hide();
	
	console.log("userid>>>>"+userid);
	console.log("countryCode>>>>"+countryCode);
	console.log("mobNum>>>>"+mobNum);
	$("#<portlet:namespace />usr").val(userid);
	$("#cCode").val("");
	$("#cInitials").val("");
	$("#labelDisplay").hide();
 	$("#loginDisplay").hide();
	$("#<portlet:namespace />countryCode").val(countryCode);
	$("#<portlet:namespace/>usrName").val(usrName);
	$("#<portlet:namespace />mobileNumber").val(mobNum);
	$('#callEdit').modal({ backdrop: 'static',keyboard: true, show: true});
	console.log("mobNum>>>1>"+mobNum);
}


function passReset(){
	
	  var userID=$.trim($("#<portlet:namespace/>usr").val());
	  console.log("enter to userID>>>"+userID);
		$("#<portlet:namespace/>userId").val(userID);
	   $("#<portlet:namespace/>passResetForm").submit();
	   console.log("enter to SUBMIT>>>"+userID);
	}	 

function login(){
	 
	  var userID=$.trim($("#<portlet:namespace/>usr").val());
	  console.log("enter to userID>>>"+userID);
		$("#<portlet:namespace/>loginUserId").val(userID);
	   $("#<portlet:namespace/>loginForm").submit();
	   console.log("enter to SUBMIT>>>"+userID);
	}	 


function sendOTP(){
	var mobileNumber=$.trim($("#<portlet:namespace/>mobileNumber").val());
	var countryCode=$.trim($("#<portlet:namespace/>countryCode").val());
	var userid =$.trim($("#<portlet:namespace/>usr").val());
	console.log(mobileNumber);
	console.log(countryCode);
	console.log(userid);
	var buttonValue=$.trim($("#<portlet:namespace/>sendOTP").text());
	console.log("buttonValue>>>"+buttonValue);
	var phoneNumberValidate=$("#<portlet:namespace/>phoneNumberValidate").val();
	if((mobileNumber=="" || phoneNumberValidate=="1")){
		console.log("enter to if");
		//$("#mobileName_error_msg").html("This field is required.");
		//$("#mobileName_error_msg").show();
		$("#<portlet:namespace/>mobileNumber").focus();
		   return false;
	}
	else{
		// $("#<portlet:namespace/>sendOTP").attr("disabled",true);
    	 AUI().use('aui-base','aui-io-request-deprecated', 'aui-node', function(A){
	    	 A.io.request('<%=userNameSendOtpURL.toString()%>',{
	    	 dataType: 'json', 
	    	 cache: false,
	    	 method: 'POST',   
	    	 data:
	    	 {
	    		 <portlet:namespace/>mobileNumber1: mobileNumber,
	     		 <portlet:namespace/>userid: userid,
	     		 <portlet:namespace/>countryCode1: countryCode,
	     		 <portlet:namespace/>cmd1: "sendOtpUserName" 
	    	  },   
	    	 on: {
	    		 success: function() {
	       			var data = this.get('responseData');
	       			console.log(data);
	       			var isotpExist=data.otpMessage;
	       		 	if(isotpExist=='success'){
     		 		   console.log(isotpExist);
           			   /* $("#otp_input_text_display").css('display','block');
           			   $("#otp_input_btn_display").css('display','none'); */
           			   $("#validate_opt").show();		
	       			}
	       		 	else{
	       		 			console.log("false");
	       		 		}
	       		  }
	    	 	 }
	    	 });
          });
		}
	   }
	   
	    function updateMobileNumberFunc(){
		   	var mobileNumber=$.trim($("#<portlet:namespace/>mobileNumber").val());
		   	var countryCode=$.trim($("#<portlet:namespace/>countryCode").val());
		   	var otpInputText=$.trim($("#<portlet:namespace/>otpInputText").val());
		   	var userid =$.trim($("#<portlet:namespace/>usr").val());
		   	console.log(mobileNumber);
		   	console.log(countryCode);
		   	console.log(userid);
		   	if(otpInputText==""){
		   		console.log("enter to if");
		   		$("#otpInputText_error_msg").html("This field is required.");
		   		$("#otpInputText_error_msg").show();
		   		$("#<portlet:namespace/>otpInputText").focus();
		   		   return false;
		   	}
		   	else
	   		{
		   		
		   	 $("#otpInputText_error_msg").hide();
	       	 AUI().use('aui-base','aui-io-request-deprecated', 'aui-node', function(A){
	       	 A.io.request('<%=userNameSendOtpURL.toString()%>',{
	       	 dataType: 'json', 
	       	 cache: false,
	       	 method: 'POST',   
	       	 data:
	       	 {
	       		     <portlet:namespace/>mobileNumber2: mobileNumber ,
	        		 <portlet:namespace/>userid2: userid ,
	        		 <portlet:namespace/>country2: countryCode ,
	        		 <portlet:namespace/>otpInputText: otpInputText ,
	        		 <portlet:namespace/>cmd1: "updateUserMobileNumber" 
	       	  },   
	       	 on: {
	       		 success: function() {
	          			var data = this.get('responseData');
	          			console.log(data);
	          			var isNumberUpdated=data.updatedNumber;
	          		 	if(isNumberUpdated=='true'){
         		 			   console.log(isNumberUpdated);
         		 			   $("#<portlet:namespace/>sendOTP").hide();
  		           			   $("#<portlet:namespace/>passwordRest").show();
  		           			   $("#validate_opt").hide();
  		           		  		$("#labelDisplay").show();
  		           		  		$("#loginDisplay").show();
  		           			
	   		           	 }
	   		           	 else{
			   		           	$("#otpInputText_error_msg").html("Please enter valid OTP.");
			   			   		$("#otpInputText_error_msg").show();
	   		           		    $("#validate_opt").show();
	   		           		    $("#labelDisplay").hide();
  		           		  		$("#loginDisplay").hide();
	   		           	 }
	          		  }
	       	 	 }
	       	   });
	         }); 
	   		}
	   	   }
	    
		$('#resetBtnCancel').click(function(){
			console.log("called cancel");
			$("#<portlet:namespace/>usr").val("");
			$("#<portlet:namespace/>countryCode").val("");
			$("#<portlet:namespace/>otpInputText").val("");
			$("#<portlet:namespace/>mobileNumber").val("");
			$("#cCode").val("");
			$("#cInitials").val("");
		 	$("#otpInputText_error_msg").html("");
			 $("#<portlet:namespace/>passwordRest").hide();
			 $("#validate_opt").hide();
			 $("#labelDisplay").hide();
  		  		$("#loginDisplay").hide();
		});
 
	   


</aui:script>