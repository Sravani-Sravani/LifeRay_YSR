<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="java.util.List"%>
<%@page
	import="com.kpmg.login.constants.CitizenLoginPortletKeys"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page
	import="com.liferay.portal.kernel.exception.ContactNameException"%>
<%@page
	import="com.liferay.portal.kernel.exception.ContactBirthdayException"%>
<%@page
	import="com.liferay.portal.kernel.captcha.CaptchaConfigurationException"%>
<%@page
	import="com.liferay.portal.kernel.exception.CompanyMaxUsersException"%>
<%@page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@page
	import="com.liferay.portal.kernel.module.configuration.ConfigurationProviderUtil"%>
<%@page import="com.liferay.captcha.configuration.CaptchaConfiguration"%>
<%@page import="com.liferay.portal.kernel.util.PrefsPropsUtil"%>
<%@page import="com.liferay.portal.kernel.util.PropsKeys"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/html/init.jsp"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha"%>

<script src="/o/com.kpmg.login/js/jquery.min.js"></script>
<link href="/o/com.kpmg.login/css/main.css" rel="stylesheet" />
<link href="/o/com.kpmg.login/css/intlTellnput.css" rel="stylesheet" media="screen" />
<script src="/o/com.kpmg.login/js/intlTelInput.js"></script>
<script src="/o/com.kpmg.login/js/intlTelInput.min.js"></script>
<script src="/o/com.kpmg.login/js/utils.js"></script>
 
<liferay-theme:defineObjects />
<portlet:defineObjects /> 

 <liferay-ui:error key="accountLocked" message="Your account has been locked, please try again after sometime." />
<%
SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
String currURL = PortalUtil.getCurrentURL(request);
HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(renderRequest);
HttpServletRequest httpOrigReq = PortalUtil.getOriginalServletRequest(httpReq);
 
HttpServletRequest request1 = PortalUtil.getHttpServletRequest(renderRequest);
String redirect_path = httpOrigReq.getParameter("_com_liferay_login_web_portlet_LoginPortlet_redirect");
 
System.out.println("redirect_path>>>>>"+redirect_path);
 
	 String emailAddress = ParamUtil.getString(request, "emailAddress");
	String userName = "";
   if(ParamUtil.getString(request, "userName")!=null)
	 userName = ParamUtil.getString(request, "userName"); 
   String accountLocked="";
   String tabVal="1";
   if(request.getAttribute("accountLocked")!=null){
	     accountLocked=(String) request.getAttribute("accountLocked");
	   System.out.println("accountLocked>>>"+accountLocked);
   }
   
    String InValidCredentials="";
    if(request.getAttribute("InValidCredentials")!=null){
    	InValidCredentials=(String) request.getAttribute("InValidCredentials");
	   System.out.println("InValidCredentials>>>"+InValidCredentials);
   }
    System.out.println("InValidCredentials>>----->"+InValidCredentials);
   if(request.getAttribute("tabVal")!=null){
	     tabVal=(String) request.getAttribute("tabVal");
	     System.out.println("tabVal>>>"+tabVal);
   }
   System.out.println("accountLocked>>>>>>>>>>>>>>"+accountLocked);
%>

<portlet:renderURL var="forgetPasswordURL">
	<portlet:param name="mvcRenderCommandName" value="/citizen/forgot_password" />
</portlet:renderURL>
 
<portlet:renderURL var="forgetUserNameURL">
	<portlet:param name="mvcRenderCommandName" value="/citizen/forgot_username" />
</portlet:renderURL>

<c:choose>
	<c:when test="<%= themeDisplay.isSignedIn() %>">
		<% String signedInAs = HtmlUtil.escape(user.getFullName());
		if (themeDisplay.isShowMyAccountIcon() && (themeDisplay.getURLMyAccount() != null)) {
			String myAccountURL = String.valueOf(themeDisplay.getURLMyAccount());
			signedInAs = "<a class=\"signed-in\" href=\"" + HtmlUtil.escape(myAccountURL) + "\">" + signedInAs + "</a>";
		} %>
		<liferay-ui:message arguments="<%= signedInAs %>" key="you-are-signed-in-as-x" translateArguments="<%= false %>" />
	</c:when> 
	</c:choose>
		<%
		//sString redirect = ParamUtil.getString(request, "redirect");
		%>
		<portlet:actionURL name="/citizen/login" var="loginURL">
			<portlet:param name="mvcRenderCommandName" value="/citizen/login" />
		</portlet:actionURL>
        <portlet:actionURL name="/citizen/login" var="departmentloginURL">
			<portlet:param name="mvcRenderCommandName" value="/citizen/login" />
		</portlet:actionURL>
  
			<div class="jhansiback-background">
			<div class="jhansiLogin-page jhansiall-pages">
		<div class="col-md-12">
		 		<%
   String successMessageValue="";
   if(request.getAttribute("passWordResetMessage")!=null)
	   successMessageValue=(String) request.getAttribute("passWordResetMessage");
    
   if(successMessageValue.equals("succ")){ %>
   <div class="alert alert-success" role="alert">
<liferay-ui:message key="your-password-is-changed-successfully-please-login" translateArguments="<%= false %>" />
	</div>
<% } else if(successMessageValue.equals("fail")){ %>
<div class="alert alert-warning" role="alert">
<liferay-ui:success key="successMessage" message=" Unable to Reset Password. Please contact customer care if required." />
</div>
<% } %>

<liferay-ui:success key="successMessage" message=""></liferay-ui:success>
<%
System.out.println("accountLocked"+accountLocked);
if(accountLocked.equals("1")){ %>
   <div class="alert alert-dismissible alert-danger" role="alert">
<strong class="lead">Error:</strong>
<liferay-ui:message key="account-locked" translateArguments="<%= false %>" />
   </div>
	<% } %>
<% if(InValidCredentials.equals("1")){ %>
   <div class="alert alert-dismissible alert-danger" role="alert">
<strong class="lead">Error:</strong>
<liferay-ui:message key="invlid-credentials" translateArguments="<%= false %>" />
   </div>
	<% } %>	
		     
			<div class="container"> 
				<div class="row">
					 
				<div class="logmiddle-sec">
	<div class="jhansiregister-pagefirst">
		
		 
			<!-- Nav tabs -->
			<ul class="nav nav-tabs jhansiround-sqare-tabs">
			  <li class="nav-item">
			    <a class="nav-link active" data-toggle="tab" href="#home">
			    <span class="txt-white">Login</span>
			</a>
			  </li>
			    
              
          </ul>

			<div class="tab-content">
			  <div class="tab-pane col-md-12 <% if(tabVal.equals("1")){ %> active <% } %>" id="home">
			  
				  <div class="row">
			      <div class="col-md-12">
					<aui:form action="<%= loginURL %>" autocomplete='on' cssClass="sign-in-form register-block" method="post" name="loginForm">
					<aui:input name="tabVal" type="hidden" value="1" />
					<aui:input name="redirect_path" type="hidden" value="<%= redirect_path %>" />
					<aui:input name="saveLastPath" type="hidden" value="<%= false %>" />
                       <div class="form-group">
                       <label>User Name</label>
					<aui:input autoFocus="true" cssClass="cardfieldstyle form-control" label="" name="login" showRequiredLabel="<%= false %>"
						type="text" value="<%=userName %>" placeholder="User Name">
						  
					<aui:validator name="required" />
					</aui:input>
				</div>
					<div class="form-group input-text-wrapper">
					<label><liferay-ui:message key="password"/></label>
						<aui:input name="password" label="" cssClass="form-control pwdCheckBox cardfieldstyle"
							showRequiredLabel="<%= false %>" type="password" placeholder="password">
							<aui:validator name="required" />
							 </aui:input>
					</div>
					 
					<div class="button-holder ">
					 	<button  type="submit" class="createSuggestionForm" class="btn btn-submit">
	  Sign In
							</button>
					</div> 
					
		       </aui:form>
				 
                </div>
 
			</div>
		</div>
		  
			</div>
		
		 
	</div>
	</div>
				 
			</div>
		</div>
		</div>
		</div>
		</div>	
	  
<style>
.loginsgnup-page label.control-label {
	color: #02579a !important;
}
</style>