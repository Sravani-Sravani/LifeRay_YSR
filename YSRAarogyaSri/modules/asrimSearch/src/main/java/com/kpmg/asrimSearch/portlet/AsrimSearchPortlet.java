package com.kpmg.asrimSearch.portlet;
import com.kpmg.asrimSearch.util.DataGridDisplayManageUtil;
import com.kpmg.asrimSearch.constants.AsrimSearchPortletKeys;
 import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
 
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import org.json.JSONObject;  
import org.json.JSONArray;
import org.osgi.service.component.annotations.Component;

/**
 * @author jaganmohan
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=AsrimSearch",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AsrimSearchPortletKeys.ASRIMSEARCH,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AsrimSearchPortlet extends MVCPortlet {
	Log _log=LogFactoryUtil.getLog(AsrimSearchPortlet.class.getName());
	@Override
		public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
		 	super.doView(renderRequest, renderResponse);
	}
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String cmd = ParamUtil.getString(resourceRequest, "cmd");
		String cmdType = ParamUtil.getString(resourceRequest, "cmdType");
		long pageId= ParamUtil.getLong(resourceRequest, "pageId");
		
		if(cmd.equals("destrictsList")) {
			PrintWriter out = resourceResponse.getWriter();
			String state_Id = ParamUtil.getString(resourceRequest, "state_Id");
			
			System.out.println("state_Id>>>"+state_Id);
			 JSONArray destrictsJsonArray =null;
			 JSONObject districts_List=new JSONObject();
			try {
				  districts_List=DataGridDisplayManageUtil.getDistricts(state_Id, pageId);
				  destrictsJsonArray=(JSONArray) districts_List.get("result"); 
				  PrintWriter writer = resourceResponse.getWriter();
					writer.print(destrictsJsonArray);
				System.out.println(destrictsJsonArray);
			}
			catch(Exception e) {
				
			}
		}
		if(cmd.equals("mandalList")) {
			PrintWriter out = resourceResponse.getWriter();
			String district_Id = ParamUtil.getString(resourceRequest, "district_Id");
			System.out.println("district_Id>>>"+district_Id);
			 JSONArray destrictsJsonArray =null;
			 JSONObject districts_List=new JSONObject();
			try {
				  districts_List=DataGridDisplayManageUtil.getMandal(district_Id,pageId);
				  destrictsJsonArray=(JSONArray) districts_List.get("result"); 
				  PrintWriter writer = resourceResponse.getWriter();
					writer.print(destrictsJsonArray);
				System.out.println(destrictsJsonArray);
			}
			catch(Exception e) {
				
			}
		}
		
		if(cmd.equals("List")) {
		//	PrintWriter out = resourceResponse.getWriter();
			String specialityId= ParamUtil.getString(resourceRequest, "specialityId");
			 System.out.println("specialityId>>>"+specialityId);
			 JSONArray prJsonArray =null;
			 JSONObject pr_List=new JSONObject();
			try {
				  pr_List=DataGridDisplayManageUtil.getprocedureList(specialityId,pageId);
				  prJsonArray=(JSONArray) pr_List.get("result"); 
				  PrintWriter writer = resourceResponse.getWriter();
					writer.print(prJsonArray);
				System.out.println(prJsonArray);
			}
			catch(Exception e) {
				
			}
		}
		else if (cmd.equals("hospitalsList")) {
			try {
				try {
					getHospitalsList(cmdType,pageId, resourceRequest, resourceResponse);
				} catch (PortalException e) {
					e.printStackTrace();
				}
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		else if (cmd.equals("proceduredList")) {
			try {
				
				try {
					System.out.println("hell");
					//console.log("hii");
					getProceduresList(cmdType, pageId,resourceRequest, resourceResponse);
				} catch (PortalException e) {
					e.printStackTrace();
				}
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		else if (cmd.equals("specialityList")) {
			try {
				try {
					getSpecialityList(cmdType, resourceRequest, resourceResponse);
				} catch (PortalException e) {
					e.printStackTrace();
				}
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		else if (cmd.equals("asrimMitrasList")) {
			try {
				try {
					getAsrimMitrasList(cmdType, resourceRequest, resourceResponse);
				} catch (PortalException e) {
					e.printStackTrace();
				}
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} 
	}
	public static void getHospitalsList(String type,long pId, ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws SystemException, PortalException, JSONException {
		JSONObject myObject =null;
		try {
			
			
			       String POST_PARAMS="";
			    //System.out.println(POST_PARAMS);
			     
			     
			     String url="";
					if(pId==513 || pId==589 ||pId==581 || pId==593 ||pId==579 ||pId==515){
						url="http://10.48.19.62:8091/portalsearchapi/public-asri/searchHospital";
						////POST_PARAMS = "{\n" + "\"districtid\": null,\r\n" +
						        //"    \"hospitalid\": null,\r\n" +
						        //"    \"hospitaltype\": null\r\n" + "\n}";
						POST_PARAMS = "{\n" + "\"districtid\": null\r\n"+ "\n}";
					}
					else if(pId==507 ||pId==509) {
 
				url="http://10.48.19.62:8092/portalsearchapi/public-ar/searchHospital";
						
						     POST_PARAMS = "{\n" + "\"districtid\": null\r\n"+ "\n}";

						    //System.out.println(POST_PARAMS);
							    //URL obj = new URL("http://10.48.19.54:8092/portalsearchapi/public/AR-hospitalsearch-districtwise");
					}
					else { //pId==499 || pId==491
						   POST_PARAMS = "{\n" + "\"districtid\": null" + "\n}";
						url="http://10.48.19.62:8093/ehsportalsearchapi/public-ehs/searchHospital";
					}
			     
				    URL obj = new URL(url);
				    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
			    postConnection.setRequestMethod("POST");
		 	    postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
			    postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
		   	    postConnection.setDoOutput(true);
		 	   postConnection.setDoInput(true);
		 	   
			    OutputStream os = postConnection.getOutputStream();
			     os.write(POST_PARAMS.getBytes());
			    os.flush();
			    os.close();
			    int responseCode = postConnection.getResponseCode();
			     if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
			     	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
			         while ((inputLine = in .readLine()) != null) {
			        	 response.append(inputLine);
			             
			        } in .close();
			        
			         myObject = new JSONObject(response.toString());
			     } else {
			        System.out.println("Hospitals API NOT WORKEING responseCode>>>"+responseCode);
			    }
   
			    JSONObject jo = new JSONObject();
	 		   JSONArray array = new JSONArray(myObject.get("result").toString());
	 		    jo.put("data",array);
				    
		  System.out.println("--------Hospitals Count------------"+array.length());
	  	    
			    PrintWriter writer1 = resourceResponse.getWriter();
			writer1.print(jo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void getProceduresList(String type,long pId, ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws SystemException, PortalException, JSONException {
	 JSONArray jsonarray =new JSONArray();
		JSONObject myObject =null;
		try {
			     String POST_PARAMS = "";
			    
			     String rl5="";
			     String method="";
			     if(pId==517 || pId==515){
			    	 POST_PARAMS = "{\n" + "\"surgeryid\": \"M1.8\"" +"}";
			    	 method="POST";
			    	 rl5="http://10.48.19.62:8091/portalsearchapi/public-asri/searchProcedure";
					}
					else if(pId==511 ||pId==507) {
						POST_PARAMS = "{\n" + "\"surgeryid\": \"M1.8\"" +"}";
						method="POST";
						rl5="http://10.48.19.62:8092/portalsearchapi/public-ar/searchProcedure";
					}
					else if(pId==495 || pId==505) {
						method="GET";
						rl5="http://10.48.19.62:8093/ehsportalsearchapi/public-ehs/searchProcedure"; 
					}
			     System.out.println(POST_PARAMS);
			     System.out.println("urls is"+rl5);
				    URL obj = new URL(rl5);
				    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
				    postConnection.setRequestMethod(method);   
			      postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
			      postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
		          postConnection.setDoOutput(true);
		 	      postConnection.setDoInput(true);
		 	     if(pId==517 || pId==515 || pId==511 ||pId==507){
			    OutputStream os = postConnection.getOutputStream();
			    System.out.println("hell");
			    os.write(POST_PARAMS.getBytes());
			    os.flush();
			    os.close();
		 	     }
			    int responseCode = postConnection.getResponseCode();
			     
			    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
			     	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
			         while ((inputLine = in .readLine()) != null) {
			        	 response.append(inputLine);
			             
			        } in .close();
			        System.out.println("re"+response.toString());
			         myObject = new JSONObject(response.toString());
			     			    } else {
			        System.out.println("Procedures API NOT WORKING responseCode>>>"+responseCode);
			    }
  			    JSONObject jo = new JSONObject();
	 		   JSONArray array = new JSONArray(myObject.get("result").toString());
	 		   jo.put("data",array);
	    	  System.out.println("--------Procedures Count------------"+array.length());		    
			    PrintWriter writer1 = resourceResponse.getWriter();
			writer1.print(jo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void getSpecialityList(String type, ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws SystemException, PortalException, JSONException {
	 
		JSONObject myObject =null;
		try {
			 final String POST_PARAMS = "{\n" + "\"specialityid\": null,\r\n" +
				        "    \"hospitalid\": null,\r\n" +
				        "    \"specialitycode\": null,\r\n" + 
				        "    \"procedurename\": null,\r\n" + 
				        "    \"proceduretypeid\": null\r\n" + "\n}";
			    //System.out.println(POST_PARAMS);
				    URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/searchspeciality");
				    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
			    postConnection.setRequestMethod("POST");
			     postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
			    postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
		          postConnection.setDoOutput(true);
		 	      postConnection.setDoInput(true);
		 	   
			    OutputStream os = postConnection.getOutputStream();
			     os.write(POST_PARAMS.getBytes());
			    os.flush();
			    os.close();
			    int responseCode = postConnection.getResponseCode();
			     
			    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
			     	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
			         while ((inputLine = in .readLine()) != null) {
			        	 response.append(inputLine);
			             
			        } in .close();
			        
			         myObject = new JSONObject(response.toString());
			     			    } else {
			        System.out.println("Speciality API NOT WORKED responseCode >>"+responseCode);
			    }
  			    JSONObject jo = new JSONObject();
	 		   JSONArray array = new JSONArray(myObject.get("result").toString());
	 		    jo.put("data",array);
	    	  System.out.println("--------Speciality Count------------"+array.length());		    
			    PrintWriter writer1 = resourceResponse.getWriter();
			writer1.print(jo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void getAsrimMitrasList(String type, ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws SystemException, PortalException, JSONException {
	 
		JSONObject myObject =null;
		try {
			 final String POST_PARAMS = "{\n" + "\"districtid\": null\r\n" + "\n}";
			  //  System.out.println(POST_PARAMS);
				    URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/mitra-search-districtwise");
				    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
			    postConnection.setRequestMethod("POST");
			     postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
			    postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
		          postConnection.setDoOutput(true);
		 	      postConnection.setDoInput(true);
		 	   
			    OutputStream os = postConnection.getOutputStream();
		 
			    os.write(POST_PARAMS.getBytes());
			    os.flush();
			    os.close();
			    int responseCode = postConnection.getResponseCode();
			     
			    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
			     	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
			         while ((inputLine = in .readLine()) != null) {
			        	 response.append(inputLine);
			             
			        } in .close();
			        
			         myObject = new JSONObject(response.toString());
			     			    } else {
			        System.out.println("Mitras API NOT WORKED responseCode>>"+responseCode);
			    }
  			    JSONObject jo = new JSONObject();
	 		   JSONArray array = new JSONArray(myObject.get("result").toString());
	 		    jo.put("data",array);
	    	  System.out.println("--------Mitras Count------------"+array.length());		    
			    PrintWriter writer1 = resourceResponse.getWriter();
			writer1.print(jo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
}