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
<%@page import="java.util.Random"%>
<%@page import="com.liferay.portal.kernel.exception.NoSuchUserException"%>
<%@page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@page import="com.liferay.portal.kernel.module.configuration.ConfigurationProviderUtil"%>
<%@page import="com.liferay.captcha.configuration.CaptchaConfiguration"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>
<%@ include file="/html/init.jsp" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:resourceURL id="/citizen/captcha" var="captchaURL"/>
<portlet:actionURL name="/citizen/forgot_password" var="submitForgotPasswordURL"/>
<style>
.form-control{font-size: 13px;}
</style>
<div class="jhansiback-background">
<div class="jhansiLogin-page jhansiall-pages">
<div class="registertab">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
<aui:form action="<%= submitForgotPasswordURL %>" method="post" name="fm" cssClass="sign-in-form forgot-page">
	<aui:fieldset column="<%= true %>">
	</aui:fieldset>
		<aui:col >
		<h3 class="mb-4" style="color:#fff"><liferay-ui:message key="forgot-password"/></h3>
			<%-- <liferay-ui:error exception="<%= CaptchaTextException.class %>" message="text-verification-failed" /> --%>
			<liferay-ui:error exception="<%= NoSuchUserException.class %>" message="Mobile Number does not exist." />
			<liferay-ui:error key="SendSmsFailed" message="maximumForgotAttempts" />
			<liferay-ui:error key="otpAttempts" message="You've reached the maximum otp attempts. Exit your browser and try after 1 hour." />
			<label><liferay-ui:message key="mobile-number"/></label>
			<aui:input cssClass="form-control cardfieldstyle" name="screenName" label="" onkeypress="return (event.charCode > 47 && event.charCode < 58)" showRequiredLabel="<%= true %>" type="text" value="">
				<aui:validator name="maxLength"  errorMessage="Please enter valid 10 digits mobile number">10</aui:validator>
					<aui:validator name="minLength"  errorMessage="Please enter valid 10 digits mobile number">10</aui:validator>
					<aui:validator name="number"/>
					<aui:validator name="required" />
			</aui:input>
				<%-- <liferay-captcha:captcha url="<%= captchaURL %>" /> --%>
			 
			<button  type="submit" class="createSuggestionForm" class="btn btn-submit">
	 <liferay-ui:message key="login.submit"/>
							</button>
	</aui:col>
</aui:form>
</div>
</div>
</div>
</div>
</div>
</div>
<!-- <script>
	$(document).ready(function () {
       $("#<portlet:namespace />captchaText").attr('autocomplete', 'off');
	});
	</script> -->
