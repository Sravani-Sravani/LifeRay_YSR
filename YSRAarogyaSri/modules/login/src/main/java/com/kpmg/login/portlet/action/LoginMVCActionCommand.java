package com.kpmg.login.portlet.action;

import com.kpmg.login.constants.CitizenLoginPortletKeys;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.security.RandomUtil;
import com.liferay.portal.kernel.security.auth.session.AuthenticatedSessionManagerUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;

/**
 * @author AppsTek Corp
 *
 */
@Component(
		property = {
			"javax.portlet.name=" + CitizenLoginPortletKeys.CitizenLogin,
			"mvc.command.name=/citizen/login",
			"service.ranking:Integer=10000"
		},
		service = MVCActionCommand.class
	)
public class LoginMVCActionCommand extends BaseMVCActionCommand {

	/* (non-Javadoc)
	 * @see com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand#doProcessAction(javax.portlet.ActionRequest, javax.portlet.ActionResponse)
	 */
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		    ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			HttpServletRequest request = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(actionRequest));
			HttpServletResponse response = PortalUtil.getHttpServletResponse(actionResponse);
			String login = ParamUtil.getString(actionRequest, "login");
			String password = actionRequest.getParameter("password");
			String tabVal = actionRequest.getParameter("tabVal"); 
			
			System.out.println("tabVal>>>>"+tabVal);
			
			if (Validator.isNotNull(login) && Validator.isNotNull(password)) {
			boolean rememberMe = ParamUtil.getBoolean(actionRequest, "rememberMe");
			String authType = CompanyConstants.AUTH_TYPE_SN; 
			 
			   System.out.println("login="+login);
			   String redirect_path = ParamUtil.getString(actionRequest, "redirect_path"); 
			   System.out.println("redirect_path="+redirect_path);
			   HttpSession session = request.getSession(false);
			   session.setAttribute("redirect_path", redirect_path);
			   request.setAttribute("tabVal", tabVal);
			   User userdetails=null;
			   boolean errorStatus=true;
			   try {
				    Company company = themeDisplay.getCompany();
					long companyId = company.getCompanyId();
			                  userdetails=UserLocalServiceUtil.getUserByScreenName(companyId, login); 
			                   if(userdetails!=null && userdetails.getLockout()) {
							         request.setAttribute("accountLocked", "1");
							         errorStatus=false;
							   }
			   }
			   catch(Exception e) {
				   
			   }
			   if(errorStatus ) {
			       request.setAttribute("InValidCredentials", "1");
			   } 
			       AuthenticatedSessionManagerUtil.login(request, response, login, password, rememberMe, authType); 
			   
			   }
		 actionResponse.sendRedirect(themeDisplay.getPathMain()); 
	  }
}