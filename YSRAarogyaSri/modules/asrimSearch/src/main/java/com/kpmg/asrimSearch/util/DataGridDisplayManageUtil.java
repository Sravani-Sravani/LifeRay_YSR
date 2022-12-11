package com.kpmg.asrimSearch.util;
 
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.BufferedReader;  
import java.io.InputStreamReader;
import java.io.OutputStream; 
import java.net.HttpURLConnection;
import java.net.URL;
 public class DataGridDisplayManageUtil {
	static Log _log=LogFactoryUtil.getLog(DataGridDisplayManageUtil.class);
 public static org.json.JSONArray getStateLevelAsrimHospCount() {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	try {
		   URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/asri-hospital-statewisecount");
	       HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		    postConnection.setRequestMethod("GET");
		     postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
		    postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
	          postConnection.setDoOutput(true);
	 	      postConnection.setDoInput(true); 
			    int responseCode = postConnection.getResponseCode();
			//    System.out.println("responseCode"+responseCode);
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
 

public static org.json.JSONArray getDistrictAsrimHospCount(String stateId) {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	try {  
		
		 final String POST_PARAMS = "{\n" + "\"stateVal\": "+stateId+ "\n}";
//		    System.out.println(POST_PARAMS);
		    
		   URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/asri-hospital-districtwisecount");
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

public static org.json.JSONArray getStateLevelAsrimMitrasCount() {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	try {
		   URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/mitra-search");
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
		    
		   URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/mitra-search-statewise");
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

public static org.json.JSONArray getAsriSpecialityCount(String specialityId) {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	try {
		 final String POST_PARAMS = "{\n" + "\"specialityId\": "+specialityId+ "\n}";
		    System.out.println(POST_PARAMS);
		   URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/count-specialitysearch");
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


public static org.json.JSONObject getStates() {
	org.json.JSONObject myObject =null;
	org.json.JSONObject object = null;
	try { 
		   URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/ASRI-statelist");
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

public static org.json.JSONObject getDistricts(String stateId) {
	org.json.JSONObject myObject =null;
	org.json.JSONObject object = null;
//	org.json.JSONArray array = null;
	try { 
		 final String POST_PARAMS = "{\n" + "\"stateId\": \""+stateId+ "\"\n}";
		    System.out.println(POST_PARAMS);
		   URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/ASRI-districtlist");
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
			    System.out.println("Districts API responseCode>"+responseCode);
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

public static org.json.JSONObject getMandal(String districtId) {
	org.json.JSONObject myObject =null;
	org.json.JSONObject object = null;
	try { 
		//  System.out.println("--------------------------------------------");
		 final String POST_PARAMS = "{\n" + "\"districtId\": \""+districtId+ "\"\n}";
		    System.out.println(POST_PARAMS);
		   URL obj = new URL("http://10.48.19.62:8091/portalsearchapi/public/ASRI-mandallist");
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
			    System.out.println("Mandal API responseCode>"+responseCode);
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

}
