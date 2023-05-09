
  <%@page import="com.liferay.portal.kernel.portlet.PortletClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactory;import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.keyPeopleService.service.DesignationLocalServiceUtil"%>
<%@page import="com.keyPeopleService.model.Designation"%>
<%@page import="com.keyPeopleService.service.WingLocalServiceUtil"%>
<%@page import="com.keyPeopleService.model.Wing"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
   <style>
  #sortable { list-style-type: none; margin: 0; padding: 0; width: 60%; }
  #sortable li { margin: 0 3px 3px 3px; padding: 0.4em; padding-left: 1.5em; font-size: 1.4em; height: 18px; }
  #sortable li span { position: absolute; margin-left: -1.3em; }
 
  </style>

  
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>   
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.keyPeopleService.model.KeyPeople"%>
<%@page import="com.keyPeopleService.service.KeyPeopleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

 <link rel="stylesheet" href="/o/com.keyPeople/css/jquery-ui.css">
  <link rel="stylesheet" href="/o/com.keyPeople/css/style.css">
   <link rel="stylesheet" href="/o/com.keyPeople/css/main.css">
  
  <%if(!role.equalsIgnoreCase("Departmentuser")){ %>
 <main><div class="ysri_section">
    <div class="main_heading_breadcrum">
      <div class="container-fluid">
          <div class="row">
              <div class="col-md-8 p-static">
                  <h1>Who Is Who</h1>
                  <span class="sub-title">Get to know us...</span>
              </div>
              <div class="col-md-4 order-1 order-md-2 align-self-center">
                  <ul class="breadcrumb d-block text-md-end breadcrumb-light">
                      <li><a href="index.html">Home</a></li>
                      <li class="active">Who Is Who</li>
                  </ul>
              </div>
          </div>
      </div>
  </div><!--main_heading_breadcrum-->
      <div class="container-fluid">
          <div class="row">
              <div class="col-lg-12">
                 <div class="table-responsive fixed_header_table">  
                   <table class="table table-bordered">
                      <tbody>
                         <tr>
                            <th style="width:20%;font-weight: bold;font-weight:750;font-family: poppins,Arial,sans-serif;">Wing</th>
                            <th style="width:30%;font-weight: bold;;font-weight:750;font-family: poppins,Arial,sans-serif;">Designation</th>
                            <th style="width:30%;font-weight: bold;font-weight:750;font-family: poppins,Arial,sans-serif;">Name of the Employee</th>
                            <th style="width:30%;font-weight: bold;font-weight:750;font-family: poppins,Arial,sans-serif;">Phone Number</th>
                            <th style="width:10%;font-weight: bold;font-weight:750;font-family: poppins,Arial,sans-serif;">E-mail</th>
                         </tr>
                         
                         <% 
		    List<Wing> wingList=null;
		    List<Designation> designationList=null;
		    List<KeyPeople> keypeopleList=null;
		    DynamicQuery dq1 = null;
		    DynamicQuery dq2 = null; 
		    DynamicQuery dq3 = null; 
		    dq1 =WingLocalServiceUtil.dynamicQuery();
		    dq1.add(RestrictionsFactoryUtil.eq("status", "Y"));
		    dq1.addOrder(OrderFactoryUtil.asc("wid"));
		    dq2 =DesignationLocalServiceUtil.dynamicQuery();
		    dq2.add(RestrictionsFactoryUtil.eq("status", "Y"));
		    dq2.addOrder(OrderFactoryUtil.asc("wid"));
		    dq2.addOrder(OrderFactoryUtil.asc("did"));
		    dq3 =KeyPeopleLocalServiceUtil.dynamicQuery();
		    dq3.add(RestrictionsFactoryUtil.eq("status", "Y"));
		    dq3.addOrder(OrderFactoryUtil.asc("wingId"));
		  //dq3.addOrder(OrderFactoryUtil.asc("designationId"));
		    dq3.addOrder(OrderFactoryUtil.asc("trust_userId"));
		    try{
		    	wingList=WingLocalServiceUtil.dynamicQuery(dq1, 0,
		    			WingLocalServiceUtil.getWingsCount());
		    	designationList=DesignationLocalServiceUtil.dynamicQuery(dq2,0,
		    			DesignationLocalServiceUtil.getDesignationsCount());
		    	keypeopleList=KeyPeopleLocalServiceUtil.dynamicQuery(dq3,0,
		    			KeyPeopleLocalServiceUtil.getKeyPeoplesCount());
		    	
	 		}
	 		catch(Exception e){}
		    try
		    {
		    	int t=0;
		    	for(Wing wing:wingList){
		            long wid = wing.getWid();
		            String wname = wing.getWname();
		            int c= 0;
		            
		            for(Designation designation:designationList){
		                if(designation.getWid() == wid){
		                    long did = designation.getDid();
		                    String dname = designation.getDname();
		                    
		                    for(KeyPeople keypeople:keypeopleList){
		                        if(keypeople.getWingId() == wid && keypeople.getDesignationId() == did){
		                            c++;
		                        }
		                    }
		                }
		            }
		            
		            int p = 0;
		            
		            for(Designation designation:designationList)
		            {
		                if(designation.getWid() == wid){
		                    long did = designation.getDid();
		                    String dname = designation.getDname();
		                    
		                    for(KeyPeople keypeople:keypeopleList)
		                    {
		                        if(keypeople.getWingId() == wid && keypeople.getDesignationId() == did){
		                            String empname = keypeople.getEmpname();
		                            if(empname.equals("NULL"))
		                            {
		                            	empname=" ";
		                            	//System.out.println(empname);
		                            }
		                            String pn = keypeople.getPhone();
		                            if(pn.equals("NULL"))
		                            {
		                            	pn=" ";
		                            //	System.out.println(pn);
		                            }
		                            String email1=keypeople.getEmail();
		                            String email2=email1.replace("@","[at]");
		                            String email = email2.replace(".","[dot]");
		                            System.out.println(empname);
		                            String color="#ececec";
		                            if(t%2==0)
		                            {
		                            	color="white";
		                            }
		                            if(p == 0){
		                                %>
		                                <tr >
		                                  <td style="font-size:12px;font-weight:400;text-align:center;" rowspan="<%=c%>"><font color="#404040"><span style="font-weight: 400;font-family: poppins,Arial,sans-serif;"><%=wname%></span></font></td>
		                                  <td style="background-color:<%=color%>;font-size:12px;font-weight:400;text-align:center;"><font color="#404040"><span style="font-weight: 400;font-family: poppins,Arial,sans-serif;"><%=dname%></span></font></td>
		                                  <td style="background-color:<%=color%>;font-size:12px;font-weight:400;text-align:center;"><font color="#404040"><span style="font-weight: 400;font-family: poppins,Arial,sans-serif;"><%=empname%></span></font></td>
		                                  <td style="background-color:<%=color%>;font-size:12px;font-weight:400;text-align:center;" ><font color="#404040"><span style="font-weight: 400;font-family: poppins,Arial,sans-serif;"><%=pn%></span></font></td>
		                                  <td style="background-color:<%=color%>;font-size:12px;font-weight:400;text-align:center;"><font color="#404040"><span style="font-weight: 400;font-family: poppins,Arial,sans-serif;"><%=email%></span></font></td>
		                                </tr>
		                                <%
		                            } else {
		                            	
		                                %>
		                                <tr style="background-color:<%=color%>">
		                                  <td style="font-size:12px;font-weight:400;text-align:center;"><font color="#404040"><span style="font-weight: 400;font-family: poppins,Arial,sans-serif;"><%=dname%></span></font></td>
		                                  <td style="font-size:12px;font-weight:400;text-align:center;"><font color="#404040"><span style="font-weight: 400;font-family: poppins,Arial,sans-serif;"><%=empname%></span></font></td>
		                                  <td style="font-size:12px;font-weight:400;text-align:center;"><font color="#404040"><span style="font-weight: 400;font-family: poppins,Arial,sans-serif;"><%=pn%></span></font></td>
		                                  <td style="font-size:12px;font-weight:400;text-align:center;"><font color="#404040"><span style="font-weight: 400;font-family: poppins,Arial,sans-serif;"><%=email%></span></font></td>
		                                </tr>
		                                <%
		                            }
		                            t++;
		                            p++;
		                          //  System.out.println(t);
		                        }
		                    }
		                }
		            }
		           // System.out.println(t);
		        }
		    } catch(Exception e){} 
	%>
         
         
         
      
        
                      </tbody>
                   </table>
                  </div> <!-- end of table-responsive--> 
              </div>
                  
              </div>
  </div>

  </div><!--ysri_section-->     
</main>
  <%  }else {%>
  
<liferay-ui:success key="entryAdded" message="Key People added successfully." />
<liferay-ui:success key="entryUpdated" message="Key People updated successfully."  />
<liferay-ui:success key="entryDeleted" message="Key People deleted successfully." />
 <% 

 PortletURL iteratorNewURL = renderResponse.createRenderURL(); 
 iteratorNewURL.setParameter("mvcPath", "/view.jsp");
 long cur = 1;
 long delta=20;

 long sNo=(delta * (cur-1))+1;
 long order=sNo;
 themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
 long pageId1=themeDisplay.getPlid();
 String thSno = "S.No.";
 
%>
<portlet:renderURL var="createFormsURL">
	<portlet:param name="mvcPath" value="/createForm.jsp"/>
</portlet:renderURL> 
<portlet:renderURL var="createWingURL">
	<portlet:param name="mvcPath" value="/ViewWing.jsp"/>
</portlet:renderURL> 
<portlet:renderURL var="createDesignationURL">
	<portlet:param name="mvcPath" value="/ViewDesignation.jsp"/>
</portlet:renderURL>


<div class="createuser-page">

<div class="tenderspage-main">
	<div class="tendersdata-table">
		  <div class="col-md-12">
               <h1> Department view</h1>
           </div>
         
		<div class="container">
		<%if(role.equalsIgnoreCase("Departmentuser")){ %>
					<div class="row">
	   					<div class="col-md-12" style="justify-content: flex-end;">
                           	<a href ="<%=createFormsURL %>" cssClass="btn btn-black btn-sm-block" >    
                           	<button type="button" style="width: auto;" class="btn btn-defaulter btn-createTender float-right">Add Key People</button></a>
                            <a href ="<%=createWingURL %>" cssClass="btn btn-black btn-sm-block" >    
                           	<button type="button" style="width: auto;" class="btn btn-defaulter btn-createTender float-right">Manage Wings</button></a>
                           	<a href ="<%=createDesignationURL %>" cssClass="btn btn-black btn-sm-block" >    
                           	<button type="button" style="width: auto;" class="btn btn-defaulter btn-createTender float-right">Manage Designation</button></a>
                           </div>
                      </div>     
                      <%} %>                                    
                      <div class="table-responsive">
		<% 
		    List<KeyPeople> resultList=null;
		    int size=0;
		    List<KeyPeople> kpList =null;
		    try{
		    	size = KeyPeopleLocalServiceUtil.getKeyPeoplesCount();
		    		kpList =KeyPeopleLocalServiceUtil.getKeyPeoples(0, size) ;
		    }
		    catch(Exception e){
		    	
		    }
		 %>
	   <div class = "paginationButton"> 		
	 <liferay-ui:search-container deltaConfigurable="true" delta="20" total="<%=size %>" emptyResultsMessage="No records found" iteratorURL="<%= iteratorNewURL %>" >			 
	<% try{
		resultList = ListUtil.subList(kpList, searchContainer.getStart(),searchContainer.getEnd());
	}catch(Exception e){
		e.printStackTrace();
	}
	%>
	
	 
	  <script src="/o/com.keyPeople/js/jquery-1.12.4.js"></script>
  <script src="/o/com.keyPeople/js/jquery-ui.js"></script>
   

	 <liferay-ui:search-container-results results="<%=resultList %>"  /> 
	 <liferay-ui:search-container-row cssClass="ui-state-default" className="com.keyPeopleService.model.KeyPeople" keyProperty="keyPeopleId" modelVar="keyPeople">
		      		
				      	<%
				      	
				      	long keyPeopleId =0L;
				      	String name ="";
				      	String mobile ="";
				      	long desigId=0L;
				      	long wingId=0L;
				      	String empOrder = "";
				    	String email ="";				    	
                        String status="";
				      	try{
				      	    keyPeopleId =  keyPeople.getTrust_userId();
				      		name =keyPeople.getEmpname(); 
				      		mobile=keyPeople.getPhone();
				      		email = keyPeople.getEmail();
				      		wingId = keyPeople.getWingId();
				      		desigId =  keyPeople.getDesignationId();
				      		status = keyPeople.getStatus();
				      		empOrder = keyPeople.getEmpOrder();
				      	//	System.out.println("name"+name+" mobile"+mobile + " email"+email+" wingId"+wingId+ " desigId"+desigId);
				      		
					      		
					      	  
			                }catch(Exception e){
				                 e.printStackTrace();
			                } 
		                   %>
		
		 <liferay-ui:search-container-column-text cssClass="<%= String.valueOf(keyPeopleId) %>" name="<%=thSno %>">	 
		<%if(role.equalsIgnoreCase("Departmentuser")){    %> 	
	    <span class="ui-icon ui-icon-arrowthick-2-n-s"></span>	  
	    <% }%>
	    <%= String.valueOf(sNo++) %></liferay-ui:search-container-column-text>
 
	    
	    <liferay-ui:search-container-column-text name="Employee Name" value="<%=name %>" /> 
		 <liferay-ui:search-container-column-text name="Phone" value="<%=mobile %>" />
		<liferay-ui:search-container-column-text name="Email" value="<%=email %>" />
		<%if(role.equalsIgnoreCase("Departmentuser")){ %>
		<liferay-ui:search-container-column-text name="Status" value="<%=status %>" />
		<%} %>
		<%if(role.equalsIgnoreCase("Departmentuser")){ %>
		<liferay-ui:search-container-column-text name="Manage" cssClass="managewdth">
		<div>
	 
			<a class="btn btn-primary m-0 hotooltip" onClick="updateRecord('<%=keyPeopleId %>');"><i class="fas fa-edit editicon"><span class="hotooltiptext"></span></i></a> 
			<%if(status.equals("Y")) { %><a class="btn btn-primary m-0 hotooltip" onClick="return deleteRecord('<%=keyPeopleId %>');"> <i class="fas fa-trash-alt deleteicon"><span class="hotooltiptext"></span></i></a>
			<%} %>
		</div>
		</liferay-ui:search-container-column-text>
		<%} %>
		
	</div> 

		
		
 	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator  />
					</liferay-ui:search-container>
		    </div>
                     
			
	    </div>
	</div>
  </div> 
 </div>
 
 
<portlet:renderURL var="updateRecordURL">
			<portlet:param name="mvcPath" value="/createForm.jsp"/>  
		</portlet:renderURL>
		
		 <portlet:actionURL var="deleteRecordURL" name="deleteImportantLink"> 
         </portlet:actionURL>
        
         
<script>
function updateRecord(recordId){
	$('#<portlet:namespace />update').find('input[name=<portlet:namespace />keyPeopleId]').val(recordId);
	$("#<portlet:namespace />update").submit();
}
function deleteRecord(recordId){
	if(confirm('Are you sure you want to delete?')){
		$('#<portlet:namespace />delete').find('input[name=<portlet:namespace />keyPeopleId]').val(recordId);
		$('#<portlet:namespace />delete').submit();
	}
	else{
		return false;
	}
}
</script>
<portlet:resourceURL var="getkeyPeopleURL"></portlet:resourceURL>
<script type="text/javascript">

 
 
  $('tbody').sortable({
      axis: 'y',
      update: function (event, table) {
          var order = "<%=order%>";
          var model = "";
          $("tbody tr td.first").each(function () {
        	  var idVal=$(this).attr("class");
        	 idVal = idVal.replace("table-cell", "");
        	 idVal = idVal.replace("first", "");
        	 idVal=$.trim(idVal);
        	  console.log(idVal);
              //building a new object and pushing in modal array 
              //Here I am setting OrderNo property which is i am using in my db and building my object
            //  var objModel = { order:idVal }; //This is for example to build your object and push in a modal array.
            if(model==""){  
               model=order+"_"+idVal;
            }
            else{
            	model= model+","+ order+"_"+idVal;
            }
              order++;
          });
          console.log(model);
     
               $.ajax({
                  type: "GET",                            
                  contentType: "json",
                  url: "<%=getkeyPeopleURL.toString() %>",
                  data:  {
                	  <portlet:namespace />model : model,
                	  <portlet:namespace />cmd: 'keyPeopleOrderUpdate' 
                	  },
                  success: function (data) {
                	  console.log("success");
                      //do something
                  },
                  error: function (e) {
                	  console.log("failed");
                      //do something
                  }
              });
          }
      
  });     
  </script>
<aui:form name="update" method="post" action="<%=updateRecordURL %>" style="display:none;">
   <aui:input type="text" name="keyPeopleId" value=""></aui:input>
</aui:form>
<aui:form name="delete" method="post" action="<%=deleteRecordURL %>" style="display:none;">
   <aui:input type="text" name="keyPeopleId" value=""></aui:input>
</aui:form>

 <%} %>
