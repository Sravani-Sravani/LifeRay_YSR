<%@page import="java.util.Map"%>
<%-- <%@page import="com.emudhra.openid.OpenIDParser"%>
<%@page import="com.emudhra.openid.OpenIDAttributes"%> --%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page
	import="com.kpmg.login.constants.CitizenLoginPortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<liferay-theme:defineObjects />

<portlet:defineObjects /> 

	
<%@ include file="/html/init.jsp"%>
<%

//
	//out.println("redirect_path>>>>>11111111111111");

 
//String code = request1.getParameter("code");
//out.println("code>>>"+code);
	String currURL = PortalUtil.getCurrentURL(request);
HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(renderRequest);
HttpServletRequest httpOrigReq = PortalUtil.getOriginalServletRequest(httpReq);
String code=httpOrigReq.getParameter("code");
System.out.println("code>>> "+code);
System.out.println("currURL>>> "+currURL);
HttpServletRequest request1 = PortalUtil.getHttpServletRequest(renderRequest);
String redirect_path = httpOrigReq.getParameter("_com_liferay_login_web_portlet_LoginPortlet_redirect");
 
System.out.println("redirect_path>>>>>"+redirect_path);

 /* OpenIDAttributes attributes = new OpenIDAttributes(); 
attributes.setClientId(CitizenLoginPortletKeys.ClientId); 
attributes.setAuthorizationCode(code); 
attributes.setGrantType("authorization_code"); 
attributes.setRedirectUri(CitizenLoginPortletKeys.redirect_URL); 
String accessToken = OpenIDParser.getAccessToken(attributes); 
Map<String, String> parseAccessToken = OpenIDParser.parseAccessToken(accessToken); 
String idToken = parseAccessToken.get("idToken"); 
String sid = parseAccessToken.get("sessionId");
System.out.println("idToken>>"+idToken);
System.out.println("sid>>"+sid); 
 */

String cmd = ParamUtil.getString(request, CitizenLoginPortletKeys.CMD);
	String emailAddress = ParamUtil.getString(request, "emailAddress");
	String userName = "";
   if(ParamUtil.getString(request, "userName")!=null)
	 userName = ParamUtil.getString(request, "userName"); 
 
%>

<portlet:renderURL var="forgetPasswordURL">
	<portlet:param name="mvcRenderCommandName"
		value="/citizen/forgot_password" />
</portlet:renderURL>
 
<portlet:renderURL var="forgetUserNameURL">
	<portlet:param name="mvcRenderCommandName"
		value="/citizen/forgot_username" />
</portlet:renderURL>
<c:choose>
	<c:when test="<%= themeDisplay.isSignedIn() %>">
		<%
		String signedInAs = HtmlUtil.escape(user.getFullName());
		if (themeDisplay.isShowMyAccountIcon() && (themeDisplay.getURLMyAccount() != null)) {
			String myAccountURL = String.valueOf(themeDisplay.getURLMyAccount());
			signedInAs = "<a class=\"signed-in\" href=\"" + HtmlUtil.escape(myAccountURL) + "\">" + signedInAs + "</a>";
		}
		%>
		<liferay-ui:message arguments="<%= signedInAs %>"
			key="you-are-signed-in-as-x" translateArguments="<%= false %>" />
	</c:when>
	<c:otherwise>
		<%
		//sString redirect = ParamUtil.getString(request, "redirect");
		%>
		<portlet:actionURL name="/citizen/login" var="loginURL">
			<portlet:param name="mvcRenderCommandName" value="/citizen/login" />
		</portlet:actionURL>
 			<div class="jhansiback-background">
			<div class="jhansiLogin-page jhansiall-pages">
		<div class="col-md-12">
		<%
   String successMessageValue="";
   if(request.getAttribute("passWordResetMessage")!=null)
	   successMessageValue=(String) request.getAttribute("passWordResetMessage");
   //redirect_path
   
   if(successMessageValue.equals("succ")){ %>
   <div class="alert alert-success" role="alert">
<liferay-ui:message key="your-password-is-changed-successfully-please-login"
	translateArguments="<%= false %>" />
	</div>
<% } else if(successMessageValue.equals("fail")){ %>
<div class="alert alert-warning" role="alert">
<liferay-ui:success key="successMessage"
	message=" Unable to Reset Password. Please contact customer care if required." />
</div>
<% } %>
<c:choose>
	<c:when
		test="<%= CitizenLoginPortletKeys.CMD_CREATE_USER.equalsIgnoreCase(cmd) %>">
		<div class="alert alert-success" role="alert"><liferay-ui:message arguments="<%= emailAddress %>"
			key="your-account-is-created-successfully-please-login"
			translateArguments="<%= false %>" />
			</div>
	</c:when>
</c:choose>

<c:choose>
	<c:when
		test="<%= CitizenLoginPortletKeys.CMD_FORGOT_PASSWORD.equalsIgnoreCase(cmd) %>">
		<div class="alert alert-success" role="alert"><liferay-ui:message
			key="your-password-is-changed-successfully-please-login"
			translateArguments="<%= false %>" /></div>
	</c:when>
</c:choose> 
		     
			<div class="container"> 
				<div class="row">
					 
				<div class="logmiddle-sec">
	<div class="jhansiregister-pagefirst">
		
		 
			<!-- Nav tabs -->
			<ul class="nav nav-tabs jhansiround-sqare-tabs">
			  <%-- <li class="nav-item">
			    <a class="nav-link active" data-toggle="tab" href="#home">
			    <span class="txt-white"><liferay-ui:message key="citizen"/></span>
			</a>
			  </li> --%>
			  <li class="nav-item" style="width: 100%;text-align: center;">
			    <a class="nav-link active" data-toggle="tab" href="#menu1">
			    <span class="txt-white"><liferay-ui:message key="department"/></span>
			Test </a>
              </li>
             <%--  <li class="nav-item">
			    <a class="nav-link" data-toggle="tab" href="#menu2">
			    <span class="txt-white"><liferay-ui:message key="vendor"/></span>
			</a>
              </li> --%>
              
			
			</ul>

			<div class="tab-content">
			  <div class="tab-pane col-md-12" id="home">
				  
				  <div class="row">
			      <div class="col-md-12">
					<aui:form action="https://10.10.11.34/emIDAM/oauth/authorize?response_type=code&client_id=cd4985ccbd6fe3efd19dfd692cb625cd8abb09d&scope=openid+profile&redirect_uri=http://172.16.4.11&state=12345" autocomplete='on'
					cssClass="sign-in-form register-block" method="post" name="loginForm">
					
					
					<aui:input name="redirect_path" type="hidden" value="<%= redirect_path %>" />
					<aui:input name="saveLastPath" type="hidden" value="<%= false %>" />
                       <div class="form-group">
                       <label><liferay-ui:message key="mobile-number"/></label>
					<aui:input autoFocus="true" cssClass="cardfieldstyle form-control"
						label="" name="login" showRequiredLabel="<%= false %>"
						type="text" value="<%=userName %>" onkeypress="return (event.charCode > 47 && event.charCode < 58)" placeholder="Mobile Number">
						<aui:validator name="maxLength"  errorMessage="Please enter valid 10 digits mobile number">10</aui:validator>
					<aui:validator name="minLength"  errorMessage="Please enter valid 10 digits mobile number">10</aui:validator>
					<aui:validator name="number"/>
						<aui:validator name="required" />
					</aui:input>
				</div>
					<div class="form-group input-text-wrapper">
					<label><liferay-ui:message key="password"/></label>
						<aui:input name="password" label=""
							cssClass="form-control pwdCheckBox cardfieldstyle"
							showRequiredLabel="<%= false %>" type="password"
							placeholder="password">
							<aui:validator name="required" />
						</aui:input>
					</div>
					 
					<div class="button-holder ">
						<aui:button-row>
							<aui:button
								cssClass="btn btn-submit" type="submit" value="sign-in" />
						</aui:button-row>
					</div>


				</aui:form>
				<div class="form-group form-check forgot-spacing"
					style="text-align:right;margin-bottom:0px">
					 
					<p class="form-check-label"> <a label=""
						href="<%= forgetPasswordURL %>" class="anch-color"><liferay-ui:message
								key="forgot-password" /></a>
					</p>
				</div> 
				<p style="text-align:right;margin-bottom:0px"><a href="/web/guest/register" class="anch-color"><liferay-ui:message key="register-now"/></a></p>
                </div>
 
			</div>
		</div>
		<div class="tab-pane col-md-12 active" id="menu1">
			   
                   
				     <div class="row">
						<div class="col-md-12">
					<aui:form action="https://10.10.11.34/emIDAM/oauth/authorize?response_type=code&client_id=cd4985ccbd6fe3efd19dfd692cb625cd8abb09d&scope=openid+profile&redirect_uri=http://172.16.4.11&state=12345" autocomplete='on'
					cssClass="sign-in-form register-block" method="post" name="loginForm">
					<aui:input name="saveLastPath" type="hidden" value="<%= false %>" />
					<aui:input name="redirect_path" type="hidden" value="<%= redirect_path %>" />
 
					 
 
                     <div class="form-group">
                     <label><liferay-ui:message key="user-name"/></label>
					<aui:input autoFocus="true" cssClass="cardfieldstyle form-control"
						label="" name="login" showRequiredLabel="<%= false %>"
						type="text" value="<%=userName %>" placeholder="User Name">
						<aui:validator name="required" />
					</aui:input>
 
						</div>

					<div class="form-group input-text-wrapper">

						<aui:input name="password" cssClass="form-control pwdCheckBox cardfieldstyle"
							showRequiredLabel="<%= false %>" type="password"
							placeholder="password">
							<aui:validator name="required" />
						</aui:input>

					</div>
					<!-- <div>
						<label class="pwd-container"> <input type="checkbox"
							id="pwdCheckBox" onclick="passwordToggle()"> <span
							class="pwd-checkmark"></span>Show Password
						</label>
					</div> -->
					<div class="button-holder ">
						<aui:button-row>
							<aui:button
								cssClass="btn btn-submit" type="submit" value="sign-in" />
						</aui:button-row>
					</div>

				</aui:form>
				<div class="form-group form-check forgot-spacing"
					style="text-align:right;margin-bottom:0px;display: none;">
					<p class="form-check-label"> <a
						href="<%= forgetPasswordURL %>" class="anch-color"><liferay-ui:message
								key="forgot-password" /></a>
					</p>
				</div> 
				 </div>
                    
                </div>
              </div>
               <div class="tab-pane col-md-12" id="menu2">
			     	   
                 <div class="row">
					<div class="col-md-12">
					<aui:form action="<%= loginURL %>" autocomplete='on'
					cssClass="sign-in-form register-block" method="post" name="loginForm">
					<aui:input name="saveLastPath" type="hidden" value="<%= false %>" />
					<aui:input name="redirect_path" type="hidden" value="<%= redirect_path %>" />
 
					 
 
                     <div class="form-group">
                     <label><liferay-ui:message key="user-name"/></label>
					<aui:input autoFocus="true" cssClass="cardfieldstyle form-control"
						label="" name="login" showRequiredLabel="<%= false %>"
						type="text" value="<%=userName %>" placeholder="User Name">
						<aui:validator name="required" />
					</aui:input>
 
						</div>

					<div class="form-group input-text-wrapper">

						<aui:input name="password"
							cssClass="form-control pwdCheckBox cardfieldstyle"
							showRequiredLabel="<%= false %>" type="password"
							placeholder="password">
							<aui:validator name="required" />
						</aui:input>

					</div>
					<!-- <div>
						<label class="pwd-container"> <input type="checkbox"
							id="pwdCheckBox" onclick="passwordToggle()"> <span
							class="pwd-checkmark"></span>Show Password
						</label>
					</div> -->
					<div class="button-holder ">
						<aui:button-row>
							<aui:button
								cssClass="btn btn-submit" type="submit" value="sign-in" />
						</aui:button-row>
					</div>


				</aui:form>
				<div class="form-group form-check forgot-spacing"
					style="text-align:right;margin-bottom:0px">
					<p class="form-check-label"> <a
						href="<%= forgetPasswordURL %>" class="anch-color"><liferay-ui:message
								key="forgot-password" /></a>
					</p>
				</div>
				<p style="text-align:right;margin-bottom:0px"><a href="/web/guest/register" class="anch-color"><liferay-ui:message key="register-now"/></a></p>
                </div>
			</div>
		</div>
			</div>
		
		 
	</div>
	</div>
				
				 
				 
				 
				<%-- <div class="form-group form-check mb-4 text-center"
					style="padding-left: 0px; display: inline-block;">
					<label class="form-check-label"
						style="font-size: 13px; font-weight: bold; padding-left: 8px;">
						<a href="<%= forgetUserNameURL %>" class="anch-color">Forgot
							Username</a>
					</label>
				</div> --%>
			</div>
		</div>
		</div>
		</div>
		</div>	
			</div>	
	 
	</c:otherwise>
</c:choose>
<script>
function passwordToggle() {
	var x = $( "#pwdCheckBox" ).is( ':checked' );
	console.log("x>>>>"+x);
	  if (x) {
		  $( "#<portlet:namespace/>password" ).attr( "type", "text" );
	  } else {
		  $( "#<portlet:namespace/>password" ).attr( "type", "password" );
	  }
	}

</script>
<style>
.loginsgnup-page label.control-label {
	color: #02579a !important;
}
</style>