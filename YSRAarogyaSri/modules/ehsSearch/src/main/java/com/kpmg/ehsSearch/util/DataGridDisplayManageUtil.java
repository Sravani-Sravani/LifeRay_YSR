package com.kpmg.ehsSearch.util;
 
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
		   URL obj = new URL("http://10.48.19.54:8093/ehsportalsearchapi/public/ehs-hospitalsearch-statewisecount");
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
		
		 final String POST_PARAMS = "{\n" + "\"stateVal\": \""+stateId+ "\"\n}";
//		    System.out.println(POST_PARAMS);
		    
		   URL obj = new URL("http://10.48.19.54:8093/ehsportalsearchapi/public/ehs-hospital-districtwisecount");
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
		   URL obj = new URL("http://10.48.19.54:8093/ehsportalsearchapi/public/ehs-mitra-statewisecount");
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
		
		 final String POST_PARAMS = "{\n" + "\"stateid\": \""+stateId+ "\"\n}";
		   // System.out.println(POST_PARAMS);
		    
		   URL obj = new URL("http://10.48.19.54:8093/ehsportalsearchapi/public/ehs-mitra-districtwisecount");
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
		   URL obj = new URL("http://10.48.19.54:8093/ehsportalsearchapi/public/ehs-specialitysearch-count");
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
		        //System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		       //  System.out.println("myObject"+myObject.getString("result"));
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



public static org.json.JSONArray getEhsStateList() {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	try {
		 //final String POST_PARAMS = "{\n" + "\"specialityId\": "+ "\n}";
		    //System.out.println(POST_PARAMS);
		   URL obj = new URL("http://10.48.19.62:8093/ehsportalsearchapi/public/ehs-statelist");
	       HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		   postConnection.setRequestMethod("GET");
		   postConnection.setRequestProperty("Content-Type", "application/json;odata=verbose");
		    postConnection.setRequestProperty("Accept", "application/json;odata=verbose");
	          postConnection.setDoOutput(true);
	 	      postConnection.setDoInput(true);
			    //OutputStream os = postConnection.getOutputStream();
			/*
			 * BufferedWriter writer = new BufferedWriter( new OutputStreamWriter(os,
			 * "UTF-8"));
			 */
			    //os.write(POST_PARAMS.getBytes());
			    //os.flush();
			    //os.close();
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
		        //System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		       //  System.out.println("myObject"+myObject.getString("result"));
		         array = new org.json.JSONArray(myObject.getString("result")); 		         
		     } 
		     else {
		        System.out.println("ehsstateList get is not working");
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return array;
 }


public static org.json.JSONArray getEhsmandalList(String districtId) {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	try {
		 final String POST_PARAMS = "{\n" + "\"districtId\": "+districtId+ "\n}";
		    System.out.println(POST_PARAMS);
		   URL obj = new URL("http://10.48.19.62:8093/ehsportalsearchapi/public/ehs-mandallist");
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
		        //System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		       //  System.out.println("myObject"+myObject.getString("result"));
		         array = new org.json.JSONArray(myObject.getString("result")); 		         
		     } 
		     else {
		        System.out.println("POST NOT WORKED in mandal");
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return array;
 }


public static org.json.JSONArray getEhsdistrictList(String stateId) {
	org.json.JSONObject myObject =null;
	org.json.JSONArray array = null;
	try {
		 final String POST_PARAMS = "{\n" + "\"stateId\": "+stateId+ "\n}";
		    System.out.println(POST_PARAMS);
		   URL obj = new URL("http://10.48.19.62:8093/ehsportalsearchapi/public/ehs-districtlist");
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
		        //System.out.println("myObject"+response.toString());
		         myObject = new org.json.JSONObject(response.toString());
		       //  System.out.println("myObject"+myObject.getString("result"));
		         array = new org.json.JSONArray(myObject.getString("result")); 		         
		     } 
		     else {
		        System.out.println("POST NOT WORKED in ehs districtlist");
		       }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return array;
 }


}
