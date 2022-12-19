 <%@page import="java.util.HashMap"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.kpmg.asrimSearch.util.DataGridDisplayManageUtil"%>
<%@page import="org.json.JSONArray"%> 
<%@page import="com.liferay.portal.kernel.dao.orm.Order"%> 
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
 <%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
 <%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
 <%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletURL"%>
 <%@ include file="/init.jsp" %>
 <style>
.lfr-tooltip-scope{disaply:none;}
 .alert-dismissible{disaply:none;}
.alert-danger{disaply:none;}
</style>
  <% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId1=themeDisplay.getPlid();
 
 String stateId = ParamUtil.getString(request, "recordId");
 System.out.println("stateId>>>"+stateId);
 JSONArray districts_List=DataGridDisplayManageUtil.getDistrictAsrimHospCount(stateId,pageId1);
 System.out.print("districts_List"+districts_List.toString());
%>
<%
String pageTitle="";
if(pageId1==513){
	pageTitle="Aarogyasri ";
}
else if(pageId1==491){
	pageTitle="EHS ";
}
else if(pageId1==499){
	pageTitle="WJHS";
}
else if(pageId1==507){
	pageTitle="Aarogya Raksha";
}
%>
<div class="ysri_section">
	<section class="blue_section">
	  <div class="container search_panel">
		  <h3><%=pageTitle %> / District Wise - Empanelled Hospitals</h3><br>
		  <div class="row">
		  
		  <%  
		  
		  HashMap<String,String> map = new HashMap<>();
		  
	        // Adding elements to the Map
	        // using standard put() method
	        map.put("Anantapur","https://www.google.com/maps/d/embed?mid=14tqwuuKn1UaDbIOW6xfwELswCfFh598&ehbc=2E312F");
	        map.put("Srikakulam", "https://www.google.com/maps/d/embed?mid=1-Tu6dwO_HAeP9EpdhKUqX7CaPQrbF04&ehbc=2E312F");
	        map.put("Vizianagaram", "https://www.google.com/maps/d/embed?mid=1qd2a9x2Kf3yzx4LT3b2np5w8sAmOOlA&ehbc=2E312F");
	        map.put("Vishakhapatnam", "https://www.google.com/maps/d/embed?mid=1Od_0i56xAi5YFdoAw2O0aydJocVQWgw&ehbc=2E312F");
	        map.put("East Godavari", "https://www.google.com/maps/d/embed?mid=1oVsc7DbVd91hX3qH2KbOm8SLDFpuiVw&ehbc=2E312F");
	        map.put("West Godavari", "https://www.google.com/maps/d/embed?mid=1gOcT_CYheCtn0mROa5RBnx8Fa38WbwA&ehbc=2E312F");
	        map.put("Krishna", "https://www.google.com/maps/d/embed?mid=1GqdN27mfUDwEY4YWWqFhzlyCJYAAhls&ehbc=2E312F");
	        map.put("Prakasam", "https://www.google.com/maps/d/embed?mid=1XeaGTNF2Fk-xuhLsCKxjBx9MZXYy5P4&ehbc=2E312F");
	        map.put("Nellore", "https://www.google.com/maps/d/embed?mid=1U6ckgDtxI5SjOjlwUgn7nAclqcb59yE&ehbc=2E312F");
	        map.put("Chittoor", "https://www.google.com/maps/d/embed?mid=1zB1PyIUCib5bbcy-X50ky1GYarJAJUE&ehbc=2E312F");
	        map.put("YSR Kadapa", "https://www.google.com/maps/d/embed?mid=1hWKsG4zWJw8yMD5kBeLLbzOMTF6pX_4&ehbc=2E312F");
	        map.put("Kurnool", "https://www.google.com/maps/d/embed?mid=1gsdxrqA-dgnXnllMo51svZZcFA8M4-w&ehbc=2E312F");
	        map.put("Guntur", "https://www.google.com/maps/d/embed?mid=17ZSiCA8vUZxU1yGxe2F1wzde8zsnKjQ&ehbc=2E312F");
	        
	        HashMap<String,String> image = new HashMap<>();
	        image.put("Anantapur", "http://localhost:8080/documents/d/guest/677ecec6-ebb6-46c0-b356-18fef06c1eb6");
	        image.put("", "");
	        image.put("r", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
	        image.put("", "");
		  try{
			  
			   
			  for(int i=0;i<districts_List.length();i++){
		    	 	org.json.JSONArray data=new org.json.JSONArray(districts_List.get(i).toString());
		   
		    	 String districtId="";	
		    	 	String districtName=data.getString(0);
		    	   long govtHospitalCount=data.getLong(1);
		 		   long privateHospitalCount=data.getLong(2); 
		  %>
		  <portlet:renderURL var="viewGovtHospitalsURL">
			<portlet:param name="mvcPath" value="/hospitalsList.jsp"/>
			<portlet:param name="districtId" value="<%=districtName %>"/> 
			<portlet:param name="HOSP_TYPE" value="Government"/> 
			<portlet:param name="stateId" value="<%= stateId %>"/> 
		</portlet:renderURL>
		 <portlet:renderURL var="viewPrivateHospitalsURL">
			<portlet:param name="mvcPath" value="/hospitalsList.jsp"/>
			<portlet:param name="districtId" value="<%=districtName %>"/> 
			<portlet:param name="HOSP_TYPE" value="Private"/> 
			<portlet:param name="stateId" value="<%= stateId %>"/> 
		</portlet:renderURL>
		      <div class="col-lg-3">
			  	<div class="card">
				  <div class="card-body">
				  
				  <%
				  String flag="";
				  flag=image.get(districtName.trim());
				  System.out.println("image is " + flag);
				  String link="";
				  //if(districtName.trim().equalsIgnoreCase("Anantapur")){
				         link= map.get(districtName.trim());
				         //System.out.println("hi " + districtName);
				  //}
				  //System.out.println("sample is " + districtName);
			      //System.out.println("sample is " + link);
				  
				  %>
					<h5 class="card-title"><%=districtName %> &nbsp;<%if(link!=null){ %><a href=<%=link %> onclick="basicPopup(this.href);return false" ><img src="<%=flag %>" style="height:30px; width:40px;"/></a><%} %></h5>
					
					<%-- <a style="cursor: pointer;" onClick="viewRecords('<%=districtName %>','Government');" class="card-link">Government - <%=String.valueOf(govtHospitalCount) %> </a>
					<a style="cursor: pointer;" onClick="viewRecords('<%=districtName %>','Private');" class="card-link">Private - <%=String.valueOf(privateHospitalCount) %></a>
				  --%> 
				  
				  <a href="<%=viewGovtHospitalsURL %>" style="cursor: pointer;"  class="card-link">Government - <%=String.valueOf(govtHospitalCount) %> </a>
				<a href="<%=viewPrivateHospitalsURL %>" style="cursor: pointer;" class="card-link">Private - <%=String.valueOf(privateHospitalCount) %></a>
				  
				  </div>
				  
				</div>
			  </div>
			  <%  } }catch(Exception e){e.printStackTrace();} %>
		 </div>
	</section>  <!-- services_section -->
	   </div>
	</div><!--ysri_section-->	
<script>
function viewRecords(recordId,HOSP_TYPE){
	$('#<portlet:namespace />viewRecords').find('input[name=<portlet:namespace />districtId]').val(recordId);
	$('#<portlet:namespace />viewRecords').find('input[name=<portlet:namespace />HOSP_TYPE]').val(HOSP_TYPE);
	$("#<portlet:namespace />viewRecords").submit();
}
</script>

<script type="">
	// JavaScript popup window function
	function basicPopup(url) {
	  popupWindow = window.open(
		url,
		"popUpWindow",
		"height=700,width=700,left=00,top=0,resizable=yes,scrollbars=yes,toolbar=yes,menubar=no,location=no,directories=no, status=yes"
	  );
	}
  </script>

		<portlet:renderURL var="viewRecordsURL">
			<portlet:param name="mvcPath" value="/hospitalsList.jsp"/> 
		</portlet:renderURL> 
<aui:form name="viewRecords" method="post" action="<%=viewRecordsURL %>" style="display:none;">
   <aui:input type="text" name="districtId" value=""></aui:input>
   <aui:input type="text" name="HOSP_TYPE" value=""></aui:input>
   <aui:input type="text" name="stateId" value="<%=stateId %>"></aui:input>
</aui:form>  
 