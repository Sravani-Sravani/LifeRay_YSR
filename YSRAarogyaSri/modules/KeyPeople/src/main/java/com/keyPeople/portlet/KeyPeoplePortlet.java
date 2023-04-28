package com.keyPeople.portlet;

import com.keyPeople.constants.KeyPeoplePortletKeys;
import com.keyPeopleService.model.impl.DesignationImpl;
import com.keyPeopleService.model.impl.KeyPeopleImpl;
import com.keyPeopleService.model.impl.WingImpl;
import com.keyPeopleService.model.Designation;
import com.keyPeopleService.model.KeyPeople;
import com.keyPeopleService.model.Wing;
import com.keyPeopleService.model.impl.KeyPeopleImpl;
import com.keyPeopleService.service.DesignationLocalServiceUtil;
import com.keyPeopleService.service.KeyPeopleLocalServiceUtil;
import com.keyPeopleService.service.WingLocalServiceUtil;
import com.keyPeopleService.service.impl.WingLocalServiceImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

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
		"javax.portlet.display-name=KeyPeople",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + KeyPeoplePortletKeys.KEYPEOPLE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)

public class KeyPeoplePortlet extends MVCPortlet {
	public void manageForms(ActionRequest actionRequest, ActionResponse actionResponse)
	{
		String name = ParamUtil.getString(actionRequest, "name");
		String email = ParamUtil.getString(actionRequest, "email");
		String mobile = ParamUtil.getString(actionRequest, "mobile");
		String status = ParamUtil.getString(actionRequest, "department");
		long desigID = ParamUtil.getLong(actionRequest, "degSelect");
		long wingId = ParamUtil.getLong(actionRequest, "wingId");
		long kpId = ParamUtil.getLong(actionRequest, "keyPeopleId");
		KeyPeople keyPeople = null;
		boolean isNew = false;
		System.out.println("Your name, email and mob no is "+wingId+" "+desigID+" kpId"+kpId);
		try {
		if(kpId == 0)
		{
			
			kpId = CounterLocalServiceUtil.increment(KeyPeople.class.getName());
			keyPeople = new KeyPeopleImpl();
			
		//	kpId = CounterLocalServiceUtil.increment();
			//keyPeople = KeyPeopleLocalServiceUtil.createKeyPeople(kpId);
			isNew = true;
			
		//	System.out.println("value of sid is"+kpId);
			keyPeople.setCreateDate(new Date());
			keyPeople.setCreatedBy("Admin");
			
		}
		else {
			
			keyPeople = KeyPeopleLocalServiceUtil.fetchKeyPeople(kpId);
		//	System.out.println("Under Else Condition");
			keyPeople.setModifyDate(new Date());
			keyPeople.setModifyBy("test1");
			}
					
		keyPeople.setTrust_userId(kpId);
		keyPeople.setEmpname(name);
		keyPeople.setEmail(email);
		keyPeople.setDesignationId(desigID);
		keyPeople.setWingId(wingId);
		keyPeople.setStatus(status);
		keyPeople.setPhone(mobile);
		
	
		
		if(isNew)
		{
			KeyPeopleLocalServiceUtil.addKeyPeople(keyPeople);
		}
		else {
			KeyPeopleLocalServiceUtil.updateKeyPeople(keyPeople);
		}
		System.out.println("transaction Successfull");
	}  catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void deleteImportantLink(ActionRequest request, ActionResponse response) throws Exception {
		  
		long keyPeopleId = ParamUtil.getLong(request, "keyPeopleId");  
		KeyPeople keypeople = null;
	  if(keyPeopleId!=0) {
		  try { 
			 // KeyPeopleLocalServiceUtil.deleteKeyPeople(keyPeopleId);
			  keypeople = KeyPeopleLocalServiceUtil.fetchKeyPeople(keyPeopleId);
			  keypeople.setStatus("N");
			  KeyPeopleLocalServiceUtil.updateKeyPeople(keypeople);
			  SessionMessages.add(request, "entryDeleted");
		  }
		  catch(Exception e) {
			  
		  }
	  }   
	}
	
	private static Log _log = LogFactoryUtil.getLog(KeyPeoplePortlet.class.getName());
	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {

	 	 String cmd = ParamUtil.getString(request, "cmd");
 
	 	 //_log.info("cmd----------->"+cmd);
	 	PrintWriter out = response.getWriter();
	 	JSONObject jsonUser = JSONFactoryUtil.createJSONObject();
	 	ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	 	String model = ParamUtil.getString(request, "model");
		//  _log.info("model----------->"+model); 
			   if(cmd.equalsIgnoreCase("keyPeopleOrderUpdate")) {
				  //String model = ParamUtil.getString(request, "model");
				   String[] modelArray=model.split(",");
				   if(modelArray.length>0) {
					   for (String modelData : modelArray) {
						   String[] sequency_id=modelData.split("_"); 
						   if(sequency_id.length==2) {
						   int keyPeopleOrder=Integer.parseInt(sequency_id[0]);
						//   System.out.println("Key People ID is " +keyPeopleOrder );
						   String EmployeeOrder = String.valueOf(keyPeopleOrder);
						   long keyPeopleId=Long.parseLong(sequency_id[1]);
						   KeyPeople keyPeople=null;
						     try {
						         keyPeople=KeyPeopleLocalServiceUtil.fetchKeyPeople(keyPeopleId);
						         keyPeople.setEmpOrder(EmployeeOrder); 
						         KeyPeopleLocalServiceUtil.updateKeyPeople(keyPeople);
						        // jsonUser.put("updated", "true");
						     }
						     catch (Exception e) {
								e.getMessage();
								//jsonUser.put("updated", "false");
							} 
						   }
					}
					   
				   }
				   out.println(jsonUser.toString());
			  }
			  
			 	
					  
			   else if(cmd.equalsIgnoreCase("getdesignation")) {
						  long wingId = ParamUtil.getLong(request, "wingId");
						  _log.info("wardId>>"+wingId);
							try {
						              JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
						              DynamicQuery dynamicQuery = null; 
										dynamicQuery = DesignationLocalServiceUtil.dynamicQuery();
				                      //  dynamicQuery.add(RestrictionsFactoryUtil.eq("languageId", "en_US")); 
				                        if(wingId!=0) {
				                        	dynamicQuery.add(RestrictionsFactoryUtil.eq("wid", wingId)); 
				                        	System.out.println("Wing Id is "+wingId);
				                        }
										dynamicQuery.addOrder(OrderFactoryUtil.asc("dname"));
										try {
										List<Designation> desigList=DesignationLocalServiceUtil.dynamicQuery(dynamicQuery);
				 	        	 		_log.info("DesignationList.size>>"+desigList.size());
										for(Designation data:desigList) {
											JSONObject jsonOb = JSONFactoryUtil.createJSONObject();
											jsonOb.put("id", data.getDid());
											String str = data.getDname();
							                String words[]=str.split("\\s");
							                String capitalizeStr="";
							                for(String word:words){
							                    String firstLetter=word.substring(0,1);
							                    String remainingLetters=word.substring(1).toLowerCase();
							                    capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
							                }
										
											jsonOb.put("name",capitalizeStr);
											jsonArray.put(jsonOb); 
										}
							}
										catch(Exception e)
										{
											e.printStackTrace();
										}
										System.out.println("jsonArray length"+jsonArray.length());
									PrintWriter writer = response.getWriter();
									writer.print( jsonArray.toJSONString());
							} catch (Exception e) {
								_log.info(e.getMessage());
							}
					  }
			   
			   else if(cmd.equalsIgnoreCase("getwing")) {
					  long desiId = ParamUtil.getLong(request, "desigId");
					  _log.info("desiId>>"+desiId);
						try {
					              JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
					              DynamicQuery dynamicQuery = null; 
									dynamicQuery = WingLocalServiceUtil.dynamicQuery();
			                     //   dynamicQuery.add(RestrictionsFactoryUtil.eq("languageId", "en_US")); 
			                        if(desiId!=0) {
			                        	dynamicQuery.add(RestrictionsFactoryUtil.eq("did", desiId)); 
			                        }
									dynamicQuery.addOrder(OrderFactoryUtil.asc("wname"));
									List<Wing> WingList=WingLocalServiceUtil.dynamicQuery(dynamicQuery, 0, WingLocalServiceUtil.getWingsCount());;
			 	        	 		_log.info("DesignationList.size>>"+WingList.size());
									for(Wing data:WingList) {
										JSONObject jsonOb = JSONFactoryUtil.createJSONObject();
										jsonOb.put("id", data.getWid());
										String str = data.getWname();
						                String words[]=str.split("\\s");
						                String capitalizeStr="";
						                for(String word:words){
						                    String firstLetter=word.substring(0,1);
						                    String remainingLetters=word.substring(1).toLowerCase();
						                    capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
						                }
										jsonOb.put("name",capitalizeStr);
										jsonArray.put(jsonOb); 
									}
									System.out.println("jsonArray length"+jsonArray.length());
								PrintWriter writer = response.getWriter();
								writer.print( jsonArray.toJSONString());
						} catch (Exception e) {
							_log.info(e.getMessage());
						}
				  }
	}
	public void manageWing(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception
	{
		String name = ParamUtil.getString(actionRequest, "wname");
		String status = ParamUtil.getString(actionRequest, "status");
		long wid = ParamUtil.getLong(actionRequest, "wid");
		//String status = ParamUtil.getString(actionRequest, "status");
		System.out.println("name>>>"+name);
		System.out.println("status>>>"+status);
		System.out.println("wid>>>"+wid);
		boolean isNew = false;
		Wing wing = null;
		if(wid==0)
		{
			isNew = true;
			wid = CounterLocalServiceUtil.increment(Wing.class.getName());
			wing = new WingImpl();
			System.out.println("wid>>>"+wid);
			wing.setWid(wid);
			
		}
		else {
			try {
			wing = WingLocalServiceUtil.fetchWing(wid);
			}
			catch(Exception e) {
				
			}
		}
		wing.setStatus(status);
		wing.setWname(name);
		try {
			System.out.println("isNew>>>"+isNew);
			if(isNew)
			{
				System.out.println("Step-1> Inside Add");
				System.out.println(wing.getWid());
				System.out.println(wing.getWname());
				wing=WingLocalServiceUtil.createWing(wid);
				
				
				System.out.println("Step-2>>>");
			}
			wing.setStatus(status);
			wing.setWname(name);
		 
				//WingLocalServiceUtil.updateWing(wing);
			
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println("Wing Added successfully");
		
	} 
	
	public void manageDesig(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception
	{
		
		long did = ParamUtil.getLong(actionRequest, "did");
		String dname = ParamUtil.getString(actionRequest, "dname");
		String status = ParamUtil.getString(actionRequest, "status");
	
		long wid = ParamUtil.getLong(actionRequest, "Wing");
		System.out.println(" did :"+did + " Wing" + wid);
		//String status = ParamUtil.getString(actionRequest, "status");
		boolean isNew = false;
		Designation desig = null;
		if(did==0)
		{
			isNew = true;
			did = CounterLocalServiceUtil.increment(Designation.class.getName());
			desig = new DesignationImpl();
			
			
		}
		else {
			desig = DesignationLocalServiceUtil.fetchDesignation(did);
		}
		
		
		desig.setStatus(status);
		desig.setDname(dname);
		desig.setWid(wid);
		
		
		
		if(isNew)
		{
			DesignationLocalServiceUtil.addDesignation(desig);
		}
		else {
			DesignationLocalServiceUtil.updateDesignation(desig);
		}
		
		System.out.println("Degisnation Added successfully");
		
	}

}
	
	