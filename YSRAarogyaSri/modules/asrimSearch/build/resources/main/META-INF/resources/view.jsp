<%@page import="com.kpmg.asrimTables.service.FooLocalServiceUtil"%>
<%@page import="com.kpmg.asrimTables.model.AsrimHospitals"%>
<%@page import="com.kpmg.asrimTables.service.AsrimHospitalsLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
 <%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletURL"%>
 <%@ include file="/init.jsp" %>
<!-- 
<p>
	<b><liferay-ui:message key="asrimsearch.caption"/></b>
</p>
 -->
<%
//int count=FooLocalServiceUtil.getFoosCount();
//System.out.println("Count 123>>>"+count);
  int count=AsrimHospitalsLocalServiceUtil.getAsrimHospitalsesCount();
 System.out.println("Count 123>>>"+count);
%>
<% 
 PortletURL iteratorNewURL = renderResponse.createRenderURL(); 
 iteratorNewURL.setParameter("mvcPath", "/view.jsp");
 long cur = 1;
 long delta=1;
 if(ParamUtil.getLong(request, "cur")!=0){
 	cur =ParamUtil.getLong(request, "cur");
 }
 if(ParamUtil.getLong(request, "delta")!=0){
 	delta =ParamUtil.getLong(request, "delta");
 }
 long sNo=(delta * (cur-1))+1;
%>

<div class="ysri_section">
	<section class="blue_section">
	  <div class="container search_panel">
		  <h3>Empanalled Hospitals List- In Aarogyasri Scheme</h3>
		 
		  <form class="row row-cols-lg-auto align-items-center" >
				<div class="col-2">
				<h6>Search Hospitals</h6>
				</div>
				<div class="col-2">
				<label class="visually-hidden" for="District">District</label>
				<select class="form-select" id="District">
				<option selected>Select District</option>
				<option value="1">District 1</option>
				<option value="2">District 2</option>
				<option value="3">District 3</option>
				<option value="3">District 4</option>
				<option value="3">District 5</option>
				<option value="3">District 6</option>		
				</select>
				</div>
				<div class="col-2">
				<label class="visually-hidden" for="Mandal">Mandal</label>
				<select class="form-select" id="Mandal">
				<option selected>Select Mandal</option>
				<option value="1">Mandal 1</option>
				<option value="2">Mandal 2</option>
				<option value="3">Mandal 3</option>
				<option value="3">Mandal 4</option>
				<option value="3">Mandal 5</option>
				<option value="3">Mandal 6</option>		
				</select>
				</div>	
				<div class="col-2">
				<label class="visually-hidden" for="hospital_name">Name of Hospitals</label>
				<select class="form-select" id="hospital_name">
				<option selected>Name of Hospitals</option>
				<option value="1">Hospital 1</option>
				<option value="2">Hospital 2</option>
				<option value="3">Hospital 3</option>
				<option value="3">Hospital 4</option>
				<option value="3">Hospital 5</option>
				<option value="3">Hospital 6</option>		
				</select>
				</div>  
				<div class="col-2">
				<label class="visually-hidden" for="hospital_type">Hospital Type</label>
				<select class="form-select" id="hospital_type">
				<option selected>Hospital Type</option>
				<option value="1">Government</option>
				<option value="2">Private</option>
				</select>
				</div>	
				<div class="col-2">
				<button type="submit" class="btn btn-primary">Submit</button>
				<button type="submit" class="btn btn-primary">Reset</button>
				</div>
			</form>
		  
		  
		  
		  <div class="row align-items-center">
			  <div class="col-lg-6 align"><h6>List of Hospitals</h6></div>  
		  	<div class="col-lg-6 download_list_btn"><a href="#"><i class="fa-solid fa-download"></i></a></div>
		  </div>
		  <div class="row">
			<div class="table-responsive-md">  
		  	
		  	<% 
		    List<AsrimHospitals> resultList=null;
		List<AsrimHospitals> hospitalsList =null;
		int size=0;
		hospitalsList =AsrimHospitalsLocalServiceUtil.getAsrimHospitalses(0, AsrimHospitalsLocalServiceUtil.getAsrimHospitalsesCount()) ;
				 
		
		//hospitalsList.get(0).getHOSP_NAMEE()()
		size=hospitalsList.size();
		 
			
		 %> 
		  	
		  	
		  	 <liferay-ui:search-container deltaConfigurable="true" delta="20" total="<%=size %>" emptyResultsMessage="No records found" iteratorURL="<%= iteratorNewURL %>" >			 
	<% try{
		resultList = ListUtil.subList(hospitalsList, searchContainer.getStart(),searchContainer.getEnd());
	}catch(Exception e){
		e.printStackTrace();
	}
	//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	%>
	 <liferay-ui:search-container-results results="<%=resultList %>"  /> 
	 <liferay-ui:search-container-row className="com.kpmg.asrimTables.model.AsrimHospitals" keyProperty="HOSP_ID" modelVar="hospitals">
		  <%
				      	String HOSP_ID ="";
				      	String HOSP_NAME ="";
				      	String HOSP_DISP_CODE="";
				      	 String HOSP_CONTACT_PERSON="";  
				      	String HOSP_CONTACT_NO="";
				      	 String HOSP_MITHRA=""; 
				      	 String CUG_NO="";
				      	 String HOSP_SPECIALITY="";
				      	 
				      	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				       		HOSP_ID =hospitals.getHOSP_ID();
				      		HOSP_NAME =hospitals.getHOSP_NAME(); 
				      		HOSP_DISP_CODE =hospitals.getHOSP_DISP_CODE(); 
				      		HOSP_CONTACT_PERSON=hospitals.getHOSP_CONTACT_PERSON(); 
				      		//HOSP_CONTACT_NO=hospitals.getHOSP_CONTACT_NO();
				      		HOSP_SPECIALITY=hospitals.getHOSP_SPECIALITY();
		 	%>
	
        <liferay-ui:search-container-column-text name="s No." value="<%= String.valueOf(sNo++) %>" />
         <liferay-ui:search-container-column-text name="Name of Hospital" value="<%=HOSP_NAME %>" />
         
	    <liferay-ui:search-container-column-text name="Hospital Code" value="<%= HOSP_DISP_CODE %>" />
	     <liferay-ui:search-container-column-text name="Contact Person" value="<%= HOSP_CONTACT_PERSON %>" />
	     <liferay-ui:search-container-column-text name="Specialities" value="<%= HOSP_SPECIALITY %>" />
		</liferay-ui:search-container-row>
	<liferay-ui:search-iterator  />
					</liferay-ui:search-container>
 
		  	
		  	</div>
		  </div>
		   
	  </div>
	</section> 	<!-- Hospital List -->
	</div><!--ysri_section-->	  
  