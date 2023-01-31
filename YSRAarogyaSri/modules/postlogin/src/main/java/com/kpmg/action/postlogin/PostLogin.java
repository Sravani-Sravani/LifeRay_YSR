 package com.kpmg.action.postlogin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

/**
 * @author AppsTek Corp
 */
@Component(
	immediate = true,
	property = {
			"key=login.events.post"
	},
	service = LifecycleAction.class
)
public class PostLogin implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		System.out.println("====Post Login ====");
		
		//String currURL = PortalUtil.getCurrentURL(request);
		//http://localhost:8081/group/guest/inside
		
		// /c/portal/update_language?p_l_id=185&redirect=null&languageId=hi_IN&showUserLocaleOptionsMessage=false
		String userRedirectURL = "/web/guest/home";
		String keyPeopleURL = "/web/guest/manage_who-is-who";
		String departmentuserURL = "/web/guest/manage-alert";
		//String birthandDeathRegister = "/group/guest/dashboard";
		String hotelVendorURL = "/group/guest/hotelVendor-dashboard";
		String complaintsManageDepartmentURL = "/group/guest/citizen-complaints";
		String superAdminURL="/group/guest/~/control_panel/manage?p_p_id=com_liferay_journal_web_portlet_JournalPortlet";
		HttpServletRequest request = lifecycleEvent.getRequest();
		System.out.println("redirect>>>>111"+request.getParameter("_com_liferay_login_web_portlet_LoginPortlet_redirect"));
		System.out.println("redirect>>>>222"+request.getParameter("redirect"));
		String currURL = PortalUtil.getCurrentURL(request);
		System.out.println("redirect>>>>333"+currURL);
		/*
		 * try { lifecycleEvent.getResponse().sendRedirect(redirect); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
		String redirect_path =null;
		boolean redirectSet=false;
		HttpSession session = request.getSession(false);
		try {
			 redirect_path = (String) session.getAttribute("redirect_path");
			 System.out.println("post login redirect_path>>>>"+redirect_path);
			 if(redirect_path!=null && !redirect_path.equals("")) {
			    redirectSet=true;
			 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		String language="en_US";
		String redirectpath=null;
		System.out.println("currURL.length()="+currURL.length());
		if(currURL.length()>2) {
			System.out.println("currURL.substring(0, 3)="+currURL.substring(0, 3));
			  redirectpath=currURL.substring(3, currURL.length());
			  System.out.println("redirectpath="+redirectpath);
			if(currURL.substring(0, 3).equals("/hi")) {
				  language="hi_IN";
			}
		}
		String redirectURL ="/c/portal/update_language?p_l_id=19&languageId="+language;// "/web/guest/home";
		String p_l_id="19";
		
		  if(redirectSet && redirect_path.length()>2) {
		  System.out.println("redirect_path.substring(0, 3)="+redirect_path.substring( 0, 3));
		  
		  if(redirect_path.substring(0, 3).equals("/hi")) { 
			    language="hi_IN";
		       redirect_path=redirect_path.substring(3, redirect_path.length());
	         //  System.out.println("redirect_path="+redirect_path); } else {
		  
		 }
		    
			  if(redirect_path.contains("/birth-certificates")) {
				  p_l_id="185";
				  
			  } 
			  else  if(redirect_path.contains("/death-certificates")) {
				  p_l_id="187";
				  
			  } 
			  else  if(redirect_path.contains("/my-complaints")) {
				  p_l_id="203";
				  
			  } 
			  else  if(redirect_path.contains("/suggestions")) {
				  p_l_id="195";
				  
			  }
			  else  if(redirect_path.contains("/event")) {
				  p_l_id="421";
				  
			  } 
			  else  if(redirect_path.contains("/multiple-quiz")) {
				  p_l_id="429";
				  
			  } 
			   
			  } 
			//redirect_path="/c/portal/update_language?p_l_id="+p_l_id+"&redirect="+redirect_path+"&languageId="+language;// "/web/guest/home";
 
		System.out.println("Test 345"+redirect_path);
		User user = null;
		boolean isMember = false;
		boolean isDepartmentUser=false;
		boolean ishotelVendor=false;
		boolean isL1ComplaintsDepartment=false;
		boolean isL2ComplaintsDepartment=false;
		boolean isL3ComplaintsDepartment=false;
		boolean isL4ComplaintsDepartment=false;
		boolean isICCCUser=false;
		boolean isBirthandDeathRegister=false;
		boolean isAdministrator=false;
		boolean isUser=false;
		try {
			//System.out.println("Step-1");
			user = PortalUtil.getUser(request);
			System.out.println("Step-2");
			System.out.println("Step-2>>>>>>>>"+user.getFirstName());
			System.out.println("Step-2>>>>>>>>"+user.getFullName());
			PrincipalThreadLocal.setName(user.getUserId());
			//System.out.println("Step-3");
			PermissionChecker permissionChecker;
			//System.out.println("Step-4");
			permissionChecker = PermissionCheckerFactoryUtil.create(user);
			//System.out.println("Step-5");
			PermissionThreadLocal.setPermissionChecker(permissionChecker);	
			//System.out.println("Step-6");
			
			  isDepartmentUser = RoleLocalServiceUtil.hasUserRole(user.getUserId(),
			  user.getCompanyId(), "Departmentuser", true); isBirthandDeathRegister =
			  RoleLocalServiceUtil.hasUserRole(user.getUserId(), user.getCompanyId(),
			  "BirthandDeathRegister", true);
			  
			  ishotelVendor= RoleLocalServiceUtil.hasUserRole(user.getUserId(),
			 user.getCompanyId(), "Hotel Vendor", true); //System.out.println("Step-7");
			  isL1ComplaintsDepartment= RoleLocalServiceUtil.hasUserRole(user.getUserId(),
			  user.getCompanyId(), "L1 Designation", true); 
			  isL2ComplaintsDepartment= RoleLocalServiceUtil.hasUserRole(user.getUserId(), user.getCompanyId(), "L2 Designation", true); 
			  isL3ComplaintsDepartment=RoleLocalServiceUtil.hasUserRole(user.getUserId(), user.getCompanyId(),
			  "L3 Designation", true); 
			  isL4ComplaintsDepartment=
			  RoleLocalServiceUtil.hasUserRole(user.getUserId(), user.getCompanyId(),
			  "L4 Designation", true); 
			  isICCCUser=
			  RoleLocalServiceUtil.hasUserRole(user.getUserId(), user.getCompanyId(),
			  "ICCCUser", true); 
			  isAdministrator=RoleLocalServiceUtil.hasUserRole(user.getUserId(), user.getCompanyId(),"Administrator", true);
			  isUser=RoleLocalServiceUtil.hasUserRole(user.getUserId(), user.getCompanyId(),"User", true);
			System.out.println("isUser>>>"+isUser);
			//String friendlyUrl = user.getSiteGroups().get(0).getFriendlyURL();			
		} catch (Exception e) {
			//System.out.println("Step-8");
			e.printStackTrace();
		}
		try {
			
			if(isAdministrator) {
				System.out.println("teep-1");
				lifecycleEvent.getResponse().sendRedirect(superAdminURL);
			}
			else if(isDepartmentUser || isBirthandDeathRegister){
				//System.out.println("Step-10");
				System.out.println("teep-2");
					lifecycleEvent.getResponse().sendRedirect(departmentuserURL);
			} else if(ishotelVendor){
				System.out.println("teep-3");
					lifecycleEvent.getResponse().sendRedirect(hotelVendorURL);
	
			} else if(isL1ComplaintsDepartment || isL2ComplaintsDepartment || isL3ComplaintsDepartment|| isL4ComplaintsDepartment){
				System.out.println("teep-4");
				lifecycleEvent.getResponse().sendRedirect(departmentuserURL); 
			}
			else if(isICCCUser){
				System.out.println("teep-5");
				lifecycleEvent.getResponse().sendRedirect(departmentuserURL); 
		    }
			else if(redirectSet) {
				System.out.println("teep-6");
				//System.out.println("Step-9");
				lifecycleEvent.getResponse().sendRedirect(redirect_path);
			}
			else if(isMember){
				System.out.println("teep-7");
					lifecycleEvent.getResponse().sendRedirect(userRedirectURL); 
			}
			else if(isUser){
				System.out.println("teep-7-1");
					lifecycleEvent.getResponse().sendRedirect(userRedirectURL); 
			}
			else{
				System.out.println("teep-8");//System.out.println("Step-11");
				lifecycleEvent.getResponse().sendRedirect(redirectURL); 
			}
		} catch (IOException e) {
			//System.out.println("Step-12");
			e.printStackTrace();
		}
	}
}