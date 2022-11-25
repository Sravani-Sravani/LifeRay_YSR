package com.kpmg.rakshaSearch.portlet;

import com.kpmg.rakshaSearch.constants.RakshaSearchPortletKeys;
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
		"javax.portlet.name=" + RakshaSearchPortletKeys.RAKSHASEARCH,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RakshaSearchPortlet extends MVCPortlet {
	Log _log=LogFactoryUtil.getLog(RakshaSearchPortlet.class.getName());
	@Override
		public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
		 	super.doView(renderRequest, renderResponse);
	}
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String cmd = ParamUtil.getString(resourceRequest, "cmd");
		String cmdType = ParamUtil.getString(resourceRequest, "cmdType");
		
		if (cmd.equals("hospitalsList")) {
			try {
				try {
					getHospitalsList(cmdType, resourceRequest, resourceResponse);
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
					getProceduresList(cmdType, resourceRequest, resourceResponse);
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
	public static void getHospitalsList(String type, ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws SystemException, PortalException, JSONException {
		JSONObject myObject =null;
		try {
			     final String POST_PARAMS = "{\n" + "\"districtid\": null\r\n"+ "\n}";
			    //System.out.println(POST_PARAMS);
				    URL obj = new URL("http://10.48.19.54:8092/portalsearchapi/public/AR-hospitalsearch-districtwise");
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
	public static void getProceduresList(String type, ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws SystemException, PortalException, JSONException {
	 
		JSONObject myObject =null;
		try {
			     final String POST_PARAMS = "{\n" + "\"surgeryid\": null\r\n" +"}";
			    //System.out.println(POST_PARAMS);
				    URL obj = new URL("http://10.48.19.54:8092/portalsearchapi/public/AR-searchprocedure");
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
			        System.out.println("Procedures API NOT WORKING responseCode>>>"+responseCode);
			    }
  			    JSONObject jo = new JSONObject();
	 		   JSONArray array = new JSONArray(myObject.get("result").toString());
	 		    jo.put("data",array);
	    	  System.out.println("--------Procedures Count------------"+array.length());
	    	  System.out.println("--------Procedures Array------------"+array);
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
				    URL obj = new URL("http://10.48.19.54:8091/portalsearchapi/public/searchspeciality");
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
				    URL obj = new URL("http://10.48.19.54:8092/portalsearchapi/public/ARmitra-search-districtwise");
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