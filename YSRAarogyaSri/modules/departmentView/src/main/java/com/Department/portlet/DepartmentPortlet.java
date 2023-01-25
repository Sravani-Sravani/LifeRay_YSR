package com.Department.portlet;

import com.Department.constants.DepartmentPortletKeys;
import com.departmentService.model.Department;
import com.departmentService.service.DepartmentLocalServiceUtil;
import com.departmentService.service.impl.DepartmentLocalServiceImpl;
import com.liferay.adaptive.media.exception.AMRuntimeException.IOException;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

/**
 * @author akashdeep chauhan
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Department",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DepartmentPortletKeys.DEPARTMENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DepartmentPortlet extends MVCPortlet {
	public void manageData(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException , IOException
	{
		
			String title = ParamUtil.getString(actionRequest, "title");
			String description = ParamUtil.getString(actionRequest, "description");
			int dvalue = ParamUtil.getInteger(actionRequest,"department" );
			Department department = null;
			long did= ParamUtil.getLong(actionRequest, "did");
			boolean isNewRecord = false;
			if(did == 0)
			{
				did = CounterLocalServiceUtil.increment();
				isNewRecord = true;
				System.out.println("title "+title +" description "+description+ " radio : "+dvalue);
				try {
				department =  DepartmentLocalServiceUtil.createDepartment(did);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			else {
				department = DepartmentLocalServiceUtil.fetchDepartment(did);
				
			}
				
			
			department.setDescription(description);
			department.setTitle(title);
			department.setDepartment(dvalue);
			if(isNewRecord)
			{
				DepartmentLocalServiceUtil.addDepartment(department);
				
			}
			else {
				
			    DepartmentLocalServiceUtil.updateDepartment(department);
			}
			
						System.out.println("transaction Successfull");
	}
	
public void deletePlaces(ActionRequest request, ActionResponse response) throws Exception {
		
       
		long did = ParamUtil.getLong(request, "did");
		System.out.print("placeId>>>"+did);
	  if(did!=0) {
		  try {
            DepartmentLocalServiceUtil.deleteDepartment(did);
            SessionMessages.add(request, "entryDeleted");
		  }
		  catch(Exception e) {
			  
		  }
	  }   
	}
}