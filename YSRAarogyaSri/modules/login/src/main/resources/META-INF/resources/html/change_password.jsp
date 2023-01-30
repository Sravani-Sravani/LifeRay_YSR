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
 
<%@page import="com.kpmg.login.constants.CitizenLoginPortletKeys"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ include file="/html/init.jsp" %>
<<style>
.new-password {
    font-size: 13px !important;
    background-color: #83C127 !important;
    border: 0px !important;
}
</style>

<%
	String cmd = ParamUtil.getString(request, CitizenLoginPortletKeys.CMD);
%>


<portlet:actionURL name="/citizen/change_password" var="changePasswordURL" />
	
<div class="jhansiback-background">
<div class="jhansiLogin-page jhansiall-pages">
		<div class="container registertab">
			<div class="row">
				<div class="col-md-12">
<aui:form action="<%= changePasswordURL %>" method="post" name="fm" cssClass="sign-in-form change-passwpord">
	
	<aui:fieldset column="<%= true %>">
	
	</aui:fieldset>
		<aui:col >
			<h1 class="mb-5" style="color:#fff">Enter new password</h1>
			
			<aui:input cssClass="cardfieldstyle" label="password" name="password1" size="30" showRequiredLabel="<%= true %>" type="password" value="" >
				<aui:validator name="required" />
			</aui:input>

			<aui:input cssClass="cardfieldstyle" label="enter-again" name="password2" size="30" showRequiredLabel="<%= true %>" required="<%= true %>" type="password" value="">
				<aui:validator name="equalTo">
					'#<portlet:namespace />password1'
				</aui:validator>
			</aui:input>
		
			<aui:button-row style="">
				<aui:button cssClass="btn btn-primary btn-lg btn-block btn-radiusbtn-lg new-password" type="submit"  value="submit"/>
			</aui:button-row>
	</aui:col>
</aui:form>
</div>
</div>
</div>
</div>
</div>