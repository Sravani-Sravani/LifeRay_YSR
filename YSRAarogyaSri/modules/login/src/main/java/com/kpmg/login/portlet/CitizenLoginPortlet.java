package com.kpmg.login.portlet;

import com.kpmg.login.constants.CitizenLoginPortletKeys;
import com.kpmg.login.portlet.util.CustomUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CompanyConstants; 
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.auth.session.AuthenticatedSessionManagerUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil; 
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.osgi.service.component.annotations.Component;

/**
 * @author AppsTek Corp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.display-name=CitizenLogin",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"javax.portlet.init-param.view-template=/html/login.jsp",
		"javax.portlet.init-param.add-process-action-success-action=false",
		"javax.portlet.name=" + CitizenLoginPortletKeys.CitizenLogin,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CitizenLoginPortlet extends MVCPortlet {

	
	public void departmentUserLogin(ActionRequest actionRequest, ActionResponse actionResponse) {
		HttpServletRequest request = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(actionRequest));
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
            		_log.info("departmentUserLogin stei -1");
		HttpServletResponse response = PortalUtil.getHttpServletResponse(actionResponse);
		String login = ParamUtil.getString(actionRequest, "login");
		String password = actionRequest.getParameter("password");
		boolean rememberMe = ParamUtil.getBoolean(actionRequest, "rememberMe");
		String authType = CompanyConstants.AUTH_TYPE_SN; 
	   try {
		   _log.info("departmentUserLogin stei -2");
		AuthenticatedSessionManagerUtil.login(request, response, login, password, rememberMe, authType);
	
	    } catch (Exception e) {
	    	_log.info("departmentUserLogin stei -3");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   _log.info("departmentUserLogin stei -4");
	   try {
		actionResponse.sendRedirect(themeDisplay.getPathMain());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}	   
	public void passReset(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("Enter passReset(...)");
		String userid = ParamUtil.getString(actionRequest, "userId");
		_log.info("pass reset"+userid);
		String userName="";
		String newPass="";
		boolean flag =false;
		int otp =0;
		// _log.info("screenName>>>>>>>"+screenName);
		User userData=null;
		try {
			userData=UserLocalServiceUtil.fetchUser(Long.parseLong(userid.trim()));
			if (userData != null) {
				userName  = userData.getScreenName()==null?"":userData.getScreenName();
				otp = CustomUtil.generateOtp();
				newPass = "jhansi@"+otp;
				try {
					UserLocalServiceUtil.updatePassword(userData.getUserId(), newPass, newPass, false, true);
					flag =true;
				} catch (PortalException e) {
					flag =false;
					e.printStackTrace();
				}

			}
		} catch (Exception e) {
			flag =false;
			e.printStackTrace();
		}
		SessionMessages.add(actionRequest, "passWordResetMessage");
		if(flag)
		{
			actionRequest.setAttribute("passWordResetMessage", "succ");
			try {
				//CitizensLocalServiceUtil.sendSMSMessage(userData.getUserId(), "New Norka Password::"+newPass, NorkaLoginPortletKeys.MOBILE_NUMBER_TYPE );
				_log.info("passReset SMS::success");
			} catch (Exception e) {

				_log.error("passReset SMS Message Error :: Unable to send the SMS for userid :"+userData.getUserId());
			}
		}
		else
		{
			actionRequest.setAttribute("passWordResetMessage", "fail");
		}

		actionResponse.setRenderParameter("emailAddress", userData.getEmailAddress());
		actionResponse.setRenderParameter("userName", userData.getScreenName());
		actionResponse.setRenderParameter("mvcPath","/html/login.jsp");	

	}
	
	
	public void login(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		 
		_log.info("Enter login(...)");
		String userid = ParamUtil.getString(actionRequest, "loginUserId");
		_log.info("User ID"+userid);
		String userName="";
		User userData=null;
		try {
			userData=UserLocalServiceUtil.fetchUser(Long.parseLong(userid.trim()));
			if (userData != null) {
				userName  = userData.getScreenName()==null?"":userData.getScreenName();
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		actionResponse.setRenderParameter("emailAddress", userData.getEmailAddress());
		actionResponse.setRenderParameter("userName", userData.getScreenName());
		actionResponse.setRenderParameter("mvcPath","/html/login.jsp");	
	}

	private static final Log _log = LogFactoryUtil.getLog(CitizenLoginPortlet.class.getName());
}