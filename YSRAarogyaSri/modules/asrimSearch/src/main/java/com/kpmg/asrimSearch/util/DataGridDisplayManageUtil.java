package com.kpmg.asrimSearch.util;
 
import com.kpmg.asrimSearch.constants.AsrimSearchPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.BufferedReader;  
import java.io.InputStreamReader;
import java.io.OutputStream; 
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
 public class DataGridDisplayManageUtil {
	static Log _log=LogFactoryUtil.getLog(DataGridDisplayManageUtil.class);
	
 public static org.json.JSONArray getStateLevelAsrimHospCount(long pId, String serverName) {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	String serverIP=AsrimSearchPortletKeys.UAT_API_ID; //UAT
	try {
		if(serverName.equals(AsrimSearchPortletKeys.PROD_SERVER_NAME)) {
			serverIP=AsrimSearchPortletKeys.PROD_API_ID;//PRODUCTION
		}
		
		String url="";
		if(pId==513 ||pId==589 ||pId==581){
			url="http://"+serverIP+":8091/portalsearchapi/public-asri/hospital-statewisecount";
		}
		else if(pId==507 ) {
			url="http://"+serverIP+":8092/portalsearchapi/public-ar/hospital-statewisecount";
		}
		else if(pId==499 || pId==491 ||pId==585) { //pId==499 || pId==491
			url="http://"+serverIP+":8093/ehsportalsearchapi/public-ehs/hospital-statewisecount";
		}
		
		   URL obj = new URL(url);
	       HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		    postConnection.setRequestMethod("GET");
		     postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
		    postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
	          postConnection.setDoOutput(true);
	 	      postConnection.setDoInput(true); 
			    int responseCode = postConnection.getResponseCode();
		    System.out.println("url"+url);
		    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
		    	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
		         while ((inputLine = in .readLine()) != null) {
		        	 response.append(inputLine);
		             
		        } in .close();
		       // System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		         //System.out.println("myObject"+myObject.getString("result"));
		         array = new org.json.JSONArray(myObject.getString("result")); 
		           
		     } 
		     else {
		        System.out.println("hospital API NOT WORKEING responseCode>>>>"+responseCode);
		       } 
	} catch (Exception e) {
		e.printStackTrace();
	}
	return array;
 }
 

public static org.json.JSONArray getDistrictAsrimHospCount(String stateId,long pId,String serverName) {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	String serverIP=AsrimSearchPortletKeys.UAT_API_ID; //UAT
	try {
		if(serverName.equals(AsrimSearchPortletKeys.PROD_SERVER_NAME)) {
			serverIP=AsrimSearchPortletKeys.PROD_API_ID;//PRODUCTION
		}
		String url="";
		if(pId==513){
			url="http://"+serverIP+":8091/portalsearchapi/public-asri/hospital-districtwisecount";
		}
		else if(pId==507) {
			url="http://"+serverIP+":8092/portalsearchapi/public-ar/hospital-districtwisecount";
		}
		else if(pId==491 || pId==499){ //pId==499 || pId==491
			url="http://"+serverIP+":8093/ehsportalsearchapi/public-ehs/hospital-districtwisecount";
		}
		 final String POST_PARAMS = "{\n" + "\"stateVal\": \""+stateId+ "\"\n}";
//		    System.out.println(POST_PARAMS);
		    
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
			   // System.out.println("responseCode"+responseCode);
		    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
		    	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
		         while ((inputLine = in .readLine()) != null) {
		        	 response.append(inputLine);
		             
		        } in .close();
		        //System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		        // System.out.println("myObject"+myObject.getString("result"));
		         array = new org.json.JSONArray(myObject.getString("result")); 
		              
		     } 
		     else {
		        System.out.println("hospitals districtwisecount API NOT WORKEING responseCode>>>"+responseCode);
		       } 
	} catch (Exception e) {
		e.printStackTrace();
	}
	return array;
 }
/*
public static org.json.JSONArray getStateLevelAsrimMitrasCount() {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	try {
	
		   URL obj = new URL("http://10.48.19.54:8091/portalsearchapi/public/mitra-search");
	       HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		    postConnection.setRequestMethod("GET");
		     postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
		    postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
	          postConnection.setDoOutput(true);
	 	      postConnection.setDoInput(true);
	 	     int responseCode = postConnection.getResponseCode();
			 //   System.out.println("responseCode"+responseCode);
		    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
		    	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
		         while ((inputLine = in .readLine()) != null) {
		        	 response.append(inputLine);
		             
		        } in .close();
		     //   System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		       //  System.out.println("myObject"+myObject.getString("result"));
		         array = new org.json.JSONArray(myObject.getString("result")); 		         
		     } 
		     else {
		        System.out.println("mitra-search API NOT WORKING responseCode>>>"+responseCode);
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return array;
 }
public static org.json.JSONArray getDistrictAsrimMitrasCount(String stateId) {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	try {  
		
		 final String POST_PARAMS = "{\n" + "\"stateid\": "+stateId+ "\n}";
		   // System.out.println(POST_PARAMS);
		    
		   URL obj = new URL("http://10.48.19.54:8091/portalsearchapi/public/mitra-search-statewise");
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
			    System.out.println("responseCode"+responseCode);
		    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
		    	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
		         while ((inputLine = in .readLine()) != null) {
		        	 response.append(inputLine);
		             
		        } in .close();
		        System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		         System.out.println("myObject"+myObject.getString("result"));
		         array = new org.json.JSONArray(myObject.getString("result")); 		         
		     } 
		     else {
		        System.out.println("POST NOT WORKED");
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return array;
 }
*/
public static org.json.JSONArray getAsriSpecialityCount(String specialityId, long pId,String serverName) {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	String serverIP=AsrimSearchPortletKeys.UAT_API_ID; //UAT
	try {
		if(serverName.equals(AsrimSearchPortletKeys.PROD_SERVER_NAME)) {
			serverIP=AsrimSearchPortletKeys.PROD_API_ID;//PRODUCTION
		}
		 final String POST_PARAMS = "{\n" + "\"specialityId\": "+specialityId+ "\n}";
		   // System.out.println(POST_PARAMS);
		    
		    //System.out.println("pId>>>>"+pId);
		    
		    
		    String rl4="";
		    if(pId==517 || pId==589 ||pId==581 || pId==593 ||pId==579|| pId==515 ||pId==513) {  //593=asrispeciality, 515=asri_specilitysearch
		    	rl4="http://"+serverIP+":8091/portalsearchapi/public-asri/specialitysearchcount";
		    }
		    else if(pId==507 || pId==509 ||pId==511) {
		    	rl4="http://"+serverIP+":8092/portalsearchapi/public-ar/specialitysearchcount";
		    }
		    else if(pId==495  || pId==585 || pId==595||pId==587 || pId==497 || pId==503 || pId==499 || pId==505 ||pId==491){    //499=wjhs  495=EHS hospitallist, 585=  ,      503=wjhs, 595 = ehsspeciality, 497=ehs
		    	rl4="http://"+serverIP+":8093/ehsportalsearchapi/public-ehs/specialitysearchcount";
		    }
		   
		   URL obj = new URL(rl4);
	       HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		   postConnection.setRequestMethod("POST");
		   postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
		    postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
	          postConnection.setDoOutput(true);
	 	      postConnection.setDoInput(true);
			    OutputStream os = postConnection.getOutputStream();
			/*
			 * BufferedWriter writer = new BufferedWriter( new OutputStreamWriter(os,
			 * "UTF-8"));
			 */
			    os.write(POST_PARAMS.getBytes());
			    os.flush();
			    os.close();
			    int responseCode = postConnection.getResponseCode();
			  //  System.out.println("responseCode"+responseCode);
		    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
		    	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
		         while ((inputLine = in .readLine()) != null) {
		        	 response.append(inputLine);
		             
		        } in .close();
		        //System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		         //System.out.println("myObject"+myObject.getString("result"));
		         array = new org.json.JSONArray(myObject.getString("result")); 		         
		     } 
		     else {
		        System.out.println("POST NOT WORKED");
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return array;
 }


public static org.json.JSONObject getStates(long pId,String serverName) {
	org.json.JSONObject myObject =null;
	org.json.JSONObject object = null;
	String serverIP=AsrimSearchPortletKeys.UAT_API_ID; //UAT
	try {
		if(serverName.equals(AsrimSearchPortletKeys.PROD_SERVER_NAME)) {
			serverIP=AsrimSearchPortletKeys.PROD_API_ID;//PRODUCTION
		}
		String url="";
		if(pId==513 || pId==589 ||pId==581 ||pId==515 ||pId==593 ||pId==579 ){
			url="http://"+serverIP+":8091/portalsearchapi/public-asri/statelist";
		}
		else if(pId==507 || pId==509) {
			url="http://"+serverIP+":8092/portalsearchapi/public-ar/statelist";
		}
		else if(pId==499 || pId==491 || pId==585 ||pId==497 || pId==503 || pId==595 ||pId==587){ //pId==499 || pId==491
			url="http://"+serverIP+":8093/ehsportalsearchapi/public-ehs/statelist";
		}
		   URL obj = new URL(url);
	       HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		   postConnection.setRequestMethod("GET");
		   postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
		    postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
	          postConnection.setDoOutput(true);
	 	      postConnection.setDoInput(true); 
			    int responseCode = postConnection.getResponseCode();
			    System.out.println("States API responseCode>"+responseCode);
		    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
		    	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
		         while ((inputLine = in .readLine()) != null) {
		        	 response.append(inputLine);
		             
		        } in .close();
		          //System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		        // System.out.println("myObject 123>>"+myObject.get("result"));
		      	         
		     } 
		     else {
		        System.out.println("States API NOT WORKED");
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
//	System.out.println("object 12345>>"+object);
	return myObject;
 }

public static org.json.JSONObject getDistricts(String stateId,long pId,String serverName) {
	org.json.JSONObject myObject =null;
	org.json.JSONObject object = null;
//	org.json.JSONArray array = null;
	String serverIP=AsrimSearchPortletKeys.UAT_API_ID; //UAT
	try {
		if(serverName.equals(AsrimSearchPortletKeys.PROD_SERVER_NAME)) {
			serverIP=AsrimSearchPortletKeys.PROD_API_ID;//PRODUCTION
		}
		 final String POST_PARAMS = "{\n" + "\"stateId\": \""+stateId+ "\"\n}";
		   // System.out.println(POST_PARAMS);
		    String url="";
			if(pId==513 || pId==589 ||pId==581 || pId==515 ||pId==593 ||pId==579){
				url="http://"+serverIP+":8091/portalsearchapi/public-asri/districtlist";
			}
			else if(pId==507 ||pId==509) {
				url="http://"+serverIP+":8092/portalsearchapi/public-ar/districtlist";
			}
			else if(pId==499 || pId==585 || pId==491 ||pId==497 ||pId==595 ||pId==587 ||pId==503) { //pId==499 || pId==491
				url="http://"+serverIP+":8093/ehsportalsearchapi/public-ehs/districtlist";
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
			   // System.out.println("Districts API responseCode>"+responseCode);
		    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
		    	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
		         while ((inputLine = in .readLine()) != null) {
		        	 response.append(inputLine);
		             
		        } in .close();
		        //System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		       //  System.out.println("district myObject"+myObject.get("result"));
		       //  object = new org.json.JSONObject(myObject.get("result")); 		         
		     } 
		     else {
		        System.out.println("Districts API NOT WORKED");
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return myObject;
 }

public static org.json.JSONObject getMandal(String districtId,long pId,String serverName) {
	org.json.JSONObject myObject =null;
	org.json.JSONObject object = null;
	String serverIP=AsrimSearchPortletKeys.UAT_API_ID; //UAT
	try {
		if(serverName.equals(AsrimSearchPortletKeys.PROD_SERVER_NAME)) {
			serverIP=AsrimSearchPortletKeys.PROD_API_ID;//PRODUCTION
		}
		//  System.out.println("--------------------------------------------");
		 final String POST_PARAMS = "{\n" + "\"districtId\": \""+districtId+ "\"\n}";
		    //System.out.println(POST_PARAMS);
		    String url="";
			if(pId==513 || pId==589 ||pId==581 || pId==515 || pId==593 ||pId==579) {
				url="http://"+serverIP+":8091/portalsearchapi/public-asri/mandallist";
			}
			else if(pId==507 ||pId==509) {
				url="http://"+serverIP+":8092/portalsearchapi/public-ar/mandallist";
			}
			else if(pId==585 || pId==499 || pId==491 || pId==497 || pId==595 ||pId==503 ||pId==587 ){ //pId==499 || pId==491
				url="http://"+serverIP+":8093/ehsportalsearchapi/public-ehs/mandallist";
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
			   // System.out.println("Mandal API responseCode>"+responseCode);
		    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
		    	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
		         while ((inputLine = in .readLine()) != null) {
		        	 response.append(inputLine);
		             
		        } in .close();
		        //System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
	//	         System.out.println("mandal Object >>> "+myObject.get("result"));
		       //  object = new org.json.JSONObject(myObject.get("result")); 		         
		     } 
		     else {
		        System.out.println("Mandal API NOT WORKED");
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return myObject;
 }

public static org.json.JSONObject getprocedureList(String specialityId,long pId,String serverName) {
	org.json.JSONObject myObject =null;
	//org.json.JSONObject object = null;
//	org.json.JSONArray array = null;
	String serverIP=AsrimSearchPortletKeys.UAT_API_ID; //UAT
	try {
		if(serverName.equals(AsrimSearchPortletKeys.PROD_SERVER_NAME)) {
			serverIP=AsrimSearchPortletKeys.PROD_API_ID;//PRODUCTION
		}
		 final String POST_PARAMS = "{\n" + "\"specialityId\": \""+specialityId+ "\"\n}";
		  //  System.out.println(POST_PARAMS);
		    String url="";
			if(pId==517 || pId==515){
				url="http://"+serverIP+":8091/portalsearchapi/public-asri/procedurebyspeciality";
			}
			else if(pId==511) {
				url="http://"+serverIP+":8092/portalsearchapi/public-ar/procedurebyspeciality";
			}
			else if(pId==495 || pId==505 || pId==585) {
				url="http://"+serverIP+":8093/ehsportalsearchapi/public-ehs/procedurebyspeciality";
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
			  //  System.out.println("procedure API responseCode>"+responseCode);
		    if (responseCode == 200 || responseCode == HttpURLConnection.HTTP_CREATED) { //success
		    	BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
		         while ((inputLine = in .readLine()) != null) {
		        	 response.append(inputLine);
		             
		        } in .close();
		        //System.out.println("myObject"+response.toString());
		       // System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		        //System.out.println("district myObject"+myObject.get("result"));
		       //  object = new org.json.JSONObject(myObject.get("result")); 		         
		     } 
		     else {
		        System.out.println("pr API NOT WORKED");
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return myObject;
 }

}
