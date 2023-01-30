package com.kpmg.login.portlet.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SendSms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Your user name
        String username = "norkarts";
        //Your authentication key
        String authkey = "8bab309fa6XX";
        //Multiple mobiles numbers separated by comma (max 200)
        String mobiles = "919440758801,96594073300,919640019659";
        //Sender ID,While using route4 sender id should be 6 characters long.
        String senderId = "NORKAR";
        //Your message to send, Add URL encoding here.
        String message = "Test message From Appstek Corp";    //33 =>+919440758801
        //define route
        String accusage="3";

        //Prepare Url
        URLConnection myURLConnection=null;
        URL myURL=null;
        BufferedReader reader=null;

        //encoding message
        String encoded_message=URLEncoder.encode(message);

        //Send SMS API
       String mainUrl="https://www.proactivesms.in/sendsms.jsp?";
      //String mainUrl="http://api.esms.kerala.gov.in/fastclient/SMSclientdr.php?username=norkaroots&password=password123&message=Test Message From PHP API&numbers=9440758801&senderid=KLMGov";
        //Prepare parameter string
        StringBuilder sbPostData= new StringBuilder(mainUrl);
        sbPostData.append("user="+username);
        sbPostData.append("&password="+authkey);
        sbPostData.append("&mobiles="+mobiles);
        sbPostData.append("&sms="+encoded_message);
        sbPostData.append("&accusage="+accusage);
        sbPostData.append("&senderid="+senderId);
 
        //final string
        mainUrl = sbPostData.toString();
        try
        {
        //prepare connection
        myURL = new URL(mainUrl);
        myURLConnection = myURL.openConnection();
        myURLConnection.connect();
        reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
        //reading response
        String response;
        while ((response = reader.readLine()) != null)
        //print response
        System.out.println(response);
       
        //finally close connection
        reader.close();
        }
        catch (IOException e)
        {
        e.printStackTrace();
        }
	}

}
