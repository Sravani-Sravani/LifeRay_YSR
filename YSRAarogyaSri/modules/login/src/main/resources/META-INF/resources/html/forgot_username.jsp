<%--
/**
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
 */
--%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.norka.portlet.login.constants.NorkaLoginPortletKeys"%>
<%@page import="java.util.Random"%>
<%@page import="com.liferay.portal.kernel.exception.NoSuchUserException"%>
<%@page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@page import="com.liferay.portal.kernel.module.configuration.ConfigurationProviderUtil"%>
<%@page import="com.liferay.captcha.configuration.CaptchaConfiguration"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>
<%@ include file="/html/init.jsp" %>
<link href="/o/com.norka.portlet.login/css/main.css" rel="stylesheet" />
<link href="/o/com.norka.portlet.login/css/intlTellnput.css"  rel="stylesheet" media="screen"/>
<script src="/o/com.norka.portlet.login/js/intlTelInput.js"></script>
<script src="/o/com.norka.portlet.login/js/intlTelInput.min.js"></script>
<script src="/o/com.norka.portlet.login/js/utils.js"></script>


<style>
	.pwd-checkmark {
  position: absolute;
     top: 2px;
    left: 0px !important;

}
	.captcha{
		padding-left: 2px !important;
	}
	
	.box{  
        display: none;
    }
 

 .loginsgnup-page input[type="date"].form-control.forgotUsername_date,.loginsgnup-page input[type="number"].form-control.forgotUsername_number {
        width: 100%;
    border-radius: 8px;
    height: 43px;
}
@media screen and (min-width: 990px){
.loginsgnup-page input[type="tel"].form-control.forgotUsername_number{
	width: 135% !important;
}
}
.content-container div#content1,.content-container div#content2,.content-container div#content3 {
    border: 1px solid black;
    padding: 15px;
  
}
.loginsgnup-page label.control-label, .forgot-page label.control-label, .createuser-page label.control-label {
    font-weight: 600;
    font-size: 15px;
    }
label.mb-spacing{
	margin-bottom: 10px;
}

</style>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<portlet:resourceURL id="/citizen/captcha" var="captchaURL"/>

<portlet:actionURL name="/citizen/forgot_username" var="submitForgotUserNameURL"/>
	
<portlet:resourceURL id="/citizen/captcha" var="captchaURL" />
<%

SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
Calendar startCalendar = CalendarFactoryUtil.getCalendar();

startCalendar.set(Calendar.MONTH, Calendar.JANUARY);
startCalendar.set(Calendar.DATE, 1);
startCalendar.set(Calendar.YEAR, 1970);

Calendar cal = Calendar.getInstance();
int day = cal.get(Calendar.DATE);
int month = cal.get(Calendar.MONTH);
int year = cal.get(Calendar.YEAR);//-18;	
cal.set(year, month , day); // 1999 jan 20
String maxDateofBirth=dateformat.format(cal.getTime());
%>
<style>
.vl {
  border-left: 2px solid black;
  height: 45px;
  margin-left: 13px;
    padding: 5px 5px 29px;
}
</style>
<div class="jhansiLogin-page jhansiall-pages">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
 
<aui:form action="<%= submitForgotUserNameURL %>" method="post" name="fm" cssClass="form sign-in-form forgot-page">
	
	<aui:fieldset column="<%= true %>">
	</aui:fieldset>
		<aui:col cssClass="col-md-8 col-lg-8 col-sm-6 col-xs-12" style="">
		<label class="" style="font-size: 18px;display: flex;color:#fff;"><strong style="margin:auto;">Forgot User Name</strong><div class="vl"></div> <strong  style="margin:auto;">Renewal Now</strong></label>
			<liferay-ui:error exception="<%= CaptchaTextException.class %>" message="text-verification-failed" />
			<liferay-ui:error exception="<%= NoSuchUserException.class %>" message="Passport Number does not exist." />
			<liferay-ui:error key="SendSmsFailed" message="Failed to send OTP to user." />
			
		          <aui:input checked="true"  name="userNameRadio" type="radio" value="doc" label="PassportNo/VoterNo/PAN No etc" >
          
        </aui:input> 
          <aui:input name="userNameRadio" type="radio" value="nor" label="NorkaID" /> 
        <aui:input name="userNameRadio" type="radio" value="mob" label="Mobile Number"/> 
          
        <aui:input name="userNameRadio" type="radio" value="dob" label="Name With DOB" />
		
	<div class="content-container">
		    	<div id="content1" class="doc box">
		    	
				<aui:input cssClass="form-control cardfieldstyle forgotUsername_date" name="passportNumber" label="Document Number"  type="text" value="">
				 <aui:validator name="required">
				    function() {
							 if(AUI.$('#<portlet:namespace />radioSel').val() =='doc' || AUI.$('#<portlet:namespace />radioSel').val() =="")
						 {
							 return  true;
						 }
						 else
						 {
						    return  false;
						 }
					}
				  </aui:validator>
					</aui:input> 
		    	</div>
		    	
		    		<div id="content1" class="nor box"  >
		    	
				<aui:input cssClass="form-control cardfieldstyle" name="norkaId" label="Norka ID"  type="text" value="">
				 <aui:validator name="required" >
				  function() {
					 if(AUI.$('#<portlet:namespace />radioSel').val() =='nor' )
						 {
							 return  true;
						 }
						 else
						 {
						    return  false;
						 }
						 }
						 </aui:validator>
					</aui:input> 
		    	</div>
		    	<div id="content2" class="mob box" >
		    		<aui:input  cssClass="form-control cardfieldstyle forgotUsername_number" name="mobileNumber" id="mobileNumber" label="Mobile Number" onkeypress="return (event.charCode > 47 && event.charCode < 58) || event.charCode==43 || event.charCode==0"  type="tel">
					 <aui:validator name="required" >
					  function() {
						 if(AUI.$('#<portlet:namespace />radioSel').val() =='mob' )
						 {
							 return  true;
						 }
						 else
						 {
						    return  false;
						 }
						 }
						 </aui:validator>
					</aui:input>
					<span id="error-msg" style= "color: #a94442;" class="hide"> Please Enter Valid Number</span>
		 			<aui:input cssClass="form-control cardfieldstyle" name="countryCode"  id="countryCode" type="hidden"  />
					 <span id="cCode" ></span>
		    	</div>
		    	<div id="content3" class="dob box" >
		    	<aui:input cssClass="form-control cardfieldstyle" name="firstName" label="First Name"  type="text" value="">
				<aui:validator name="required">
					  function() {
					   if(AUI.$('#<portlet:namespace />radioSel').val() =='dob' )
					  	{
					  	var form = Liferay.Form.get('<portlet:namespace />fm');
						var oldFieldRules = form.get('fieldRules');

						var birthDayValidation = [
		   				{
		           		 fieldName: '<portlet:namespace />dob',
		          		 validatorName: 'required'
		    			},
		    			{
                		body: function (val, fieldNode, ruleValue) {
                     	var  year= val.substring(0, 4);
                      	var month = val.substring(5, 7);
                      	var day = val.substring(8, 10);
                      	var age = 0;//18;
                      	var set18YearsDate = new Date(Number(year) + Number(age), month - 1, day);
                      	var currdate = new Date();
              
                      if (currdate >= set18YearsDate && year >= 1900 && year <= currdate.getFullYear()) {
                    	  return true;
                      } else {
                    	  return false;
                      } 
                },
                custom: true,	
                errorMessage: '<%=NorkaLoginPortletKeys.DATE_OF_BIRTH_VALIDATION_MESSAGE %>',
                fieldName: '<portlet:namespace />dob',
                validatorName: 'custom_forBirthDate'
           }
		];
		var birthDayRules = oldFieldRules.concat(birthDayValidation);
		form.set('fieldRules', birthDayRules);
		
							   return  true;
						 }
						 else
						 {
						    return  false;
						 }
						 }
						   </aui:validator>
					</aui:input> 
		    		
					<label class="control-label forgotUsername_date">DOB:-</label>
		    		<input type="date" name="<portlet:namespace />dob"  min="1900-01-01" max="<%=maxDateofBirth %>" class="form-control cardfieldstyle forgotUsername_date"/>
		    	</div>
		   	<aui:input type="hidden" value="" name="radioSel" id = "radioSel" />
			</div>
				<liferay-captcha:captcha url="<%= captchaURL %>"/>
			<aui:button-row>
				<aui:button cssClass="btn btn btn-primary btn-lg btn-block btn-radiusbtn-lg btn-primary btn-default" name="forgotUserNameButton" type="submit"  value="submit"/>
			</aui:button-row>
	</aui:col>
</aui:form>
</div>
</div>
</div>
</div>
<script>



var telInput =  $("#<portlet:namespace />mobileNumber"),
errorMsg = $("#error-msg"),
validMsg = $("#valid-msg");
console.log("contry code1"+telInput);
// initialise plugin
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
initialCountry: "IN",
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
    validMsg.removeClass("hide");
  } else {
    telInput.addClass("error");
    errorMsg.removeClass("hide");
  }
}
var code = $(".selected-dial-code").text();
$("#<portlet:namespace />countryCode").val(code);
console.log(code);
});

// on keyup / change flag: reset
telInput.on("keyup change", reset);

$(document).ready(function () {
	
	
    $("#<portlet:namespace />captchaText").attr('autocomplete', 'off');
    $("#content1").css('display','block');
    $('input[type="radio"]').click(function(){
    	 $("#<portlet:namespace />radioSel").val('');
	        var inputValue = $(this).attr("value");
	        var targetBox = $("." + inputValue);
	        $(".box").not(targetBox).hide();
	        $(targetBox).show();
	        $("#<portlet:namespace />radioSel").val(inputValue);
	    });
	});
	
//birthdate validation


//end birthdate validation
	
	
</script>
