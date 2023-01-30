package com.kpmg.manageusers.portlet;

 
import com.kpmg.manageusers.constants.ManageUsersPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.pwd.PasswordEncryptorUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author AppsTek Dell1
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ManageUsers",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ManageUsersPortletKeys.MANAGEUSERS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=DepartmentUser"
	},
	service = Portlet.class
)
public class ManageUsersPortlet extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(ManageUsersPortlet.class.getName());
	
	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response) throws PortletException {

	 	 String cmd = ParamUtil.getString(request, "cmd");
	 	String cmd1 = ParamUtil.getString(request, "cmd1");
	 	 _log.info("cmd----------->"+cmd);
	 	 _log.info("cmd1----------->"+cmd1);
	 	PortletSession session = request.getPortletSession(true);
	 	 if(cmd1!=null && !cmd1.equals(""))
	 	 {
	 		cmd =cmd1;
	 	 }
	 	 _log.info("cmd----------->"+cmd);
	 	JSONObject jsonUser = JSONFactoryUtil.createJSONObject();
	 	JSONObject reponseOtp = JSONFactoryUtil.createJSONObject();
	 	ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			    
	}
	
	public void manageUsers(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		     long loginUserId = themeDisplay.getUserId();
		  
			String screenName = ParamUtil.getString(actionRequest, "screenName");
			long userId = ParamUtil.getLong(actionRequest, "userId");
			String emailAddress = ParamUtil.getString(actionRequest, "emailAddress"); 
			String firstName = ParamUtil.getString(actionRequest, "firstName"); 
			String lastName = ParamUtil.getString(actionRequest, "lastName"); 
			String mobileNumber = ParamUtil.getString(actionRequest, "mobileNumber"); 
			int gender= ParamUtil.getInteger(actionRequest, "gender"); 
			long userRole= ParamUtil.getLong(actionRequest, "userRole"); 
			String address = ParamUtil.getString(actionRequest, "address");
            String tabval = ParamUtil.getString(actionRequest, "tabval");
            long department=ParamUtil.getLong(actionRequest, "department");
             
            _log.info("userId>>>"+userId);
            _log.info("tabval>>>"+tabval);
            tabval=(String)actionRequest.getAttribute("tabval");
            _log.info("tabval>><<<<>"+tabval);
			boolean male =false;
 			 
			if(gender==1) {
				male=true;
			}
			long companyId=20097L;
			long groupId=20121L;
		    boolean autoPassword=false;
		    boolean autoScreenName=false;
			User newUser = null;
			long facebookId=0; 
			long[] userGroupIds = null;
			long[] groupIds = null;
			long[] organizationIds ={department};
			if(department==0) {
				 organizationIds = null;
			}
			long[] roleIds = {userRole}; 
			int prefixId = 0;
			int suffixId = 0;
			Locale locale =new Locale("en_US");
			int birthdayDay = 0;
			int birthdayMonth = 0;
			int birthdayYear = 0;
			Date dtBirth=null;

				//if(birthDate.isEmpty()) {
					String birthDate = "1970-01-01";
				//}
			SimpleDateFormat simpledate=new SimpleDateFormat("yyyy-MM-dd");
		    dtBirth=simpledate.parse(birthDate);
		    Calendar cal = Calendar.getInstance();
		    cal.setTime(dtBirth);
		    birthdayDay = cal.get(Calendar.DATE);
		    birthdayMonth = cal.get(Calendar.MONTH);
		    birthdayYear = cal.get(Calendar.YEAR);
		    boolean sendEmail = true;
		    
		    ServiceContext serviceContext = new ServiceContext();
		    serviceContext.setAddGroupPermissions(true);
		    
		    boolean flag=true;
			 
			 if(flag) {
		    
		    if(userId==0) {
			try {
				
				 long creatorUserId=loginUserId;//CounterLocalServiceUtil.increment(User.class.getName());
				_log.info("creatorUserId>>>>"+creatorUserId);
		
				newUser= UserLocalServiceUtil.addUser(creatorUserId, companyId, autoPassword, screenName, screenName, autoScreenName, screenName, emailAddress, locale, firstName, "", lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, "", groupIds, organizationIds, roleIds, userGroupIds, sendEmail, serviceContext); 
				
				_log.info("newUser.getUserId>>>>"+newUser.getUserId());
	
 
			} catch (Exception e) {
				e.getMessage(); 
				e.printStackTrace();
			}
			
			if(newUser != null) {
				 
				newUser.setEmailAddressVerified(true);
				newUser.setPasswordReset(true);
				newUser=UserLocalServiceUtil.updateUser(newUser);
				
				GroupLocalServiceUtil.addUserGroup(newUser.getUserId(),groupId); 
 
			 SessionMessages.add(actionRequest, "entryAdded");
		    }
		    else {
		    	User userData=null;
		    	
		    	// System.out.println("Enter to else>>>"+organizationIds.toString());
		    	    System.out.println("userId>>>"+userId);
		    	   
		    	try {
		    		 System.out.println("step-1>>>"+userId);
		    	    userData=UserLocalServiceUtil.fetchUser(userId);
		    	    userData.setFirstName(firstName);
		    	    userData.setLastName(lastName);
		    	    userData.setEmailAddress(emailAddress);
		    	    //userData.resetOriginalValues();
		    	    System.out.println("step-2.a>>>");
		    	   //	 userData.setScreenName(screenName);
		    	    String password1 = ParamUtil.getString(actionRequest, "password1");
		    	    System.out.println("step-2.1>>>");
		    	    if(password1!=null && password1!="") {
		    	    	System.out.println("step-2.3>>>"+password1);
						 String encrypedPassword=PasswordEncryptorUtil.encrypt(password1);
					  	 userData.setPassword(encrypedPassword);
		    	    }
		    	    System.out.println("step-3>>>"); 
		    	    try {
		    	    userData=UserLocalServiceUtil.updateUser(userData);
		    	    }
		    	    catch(Exception e) {
		    	    	e.getMessage();
		    	    }
		    	    System.out.println("organizationIds>>>"+department);
		    	    System.out.println("userId>>>"+userId);
		    	    
		    	    OrganizationLocalServiceUtil.deleteUserOrganizations(userId, userData.getOrganizationIds());
		    	    OrganizationLocalServiceUtil.addUserOrganizations(userId, organizationIds);
		    	    System.out.println("done>>>");
		    	    boolean newRecod=false;
		    	   
		    	    
		    	}
		    	catch (Exception e) {
					// TODO: handle exception
		    		e.getMessage();
				}
		    	 SessionMessages.add(actionRequest, "entryUpdated");
		    }
			}
			else {	
				 System.out.println("Enter to else flag");
				actionResponse.setRenderParameter("jspPage","/addUser.jsp");
			}
		}
		    actionRequest.setAttribute("tabval", tabval);
	}
public void deleteUser(ActionRequest request, ActionResponse response) throws Exception {
		
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY); 
		long userId = ParamUtil.getLong(request, "userId");
		String tabval = ParamUtil.getString(request, "tabval");
	  if(userId!=0) {
		  try {
            UserLocalServiceUtil.deleteUser(userId);
            SessionMessages.add(request, "entryDeleted");
		  }
		  catch(Exception e) {
			  
		  }
	  } 
	  request.setAttribute("tabval", tabval);
	}
}