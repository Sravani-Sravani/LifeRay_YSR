<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="com.kpmg.asrimSearch.util.DataGridDisplayManageUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<%@ include file="/html/dataTableIncludes.jspf" %>
<link href="/o/com.kpmg.asrimSearch/css/select2.min.css" rel="stylesheet" />
<script src="/o/com.kpmg.asrimSearch/js/select2.min.js"></script> 
<meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests" />
<portlet:resourceURL var="getAjaxDataURL"></portlet:resourceURL>
<% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId1=themeDisplay.getPlid();
String serverName1=request.getServerName();
%>

<script>
function stoploader(){
	document.getElementById("loader").style.display = "none";
}
    $(document).ready(function () {
<%--     	<% if(pageId1==589 || pageId1==585){ %> --%>
        $("#select-1").select2();
<%--         <% } %> --%>
	   $("#select-2").select2();
	   $("#select-3").select2();
	   $("#select-4").select2();
/* 	   $("#select-1").select2(); */
	   
	}); 
</script>
 <style>
</style>

<portlet:resourceURL var="asrimHospitalsURL">
<portlet:param name="cmd" value="hospitalsList"/>
<portlet:param name="pageId" value="<%=String.valueOf(pageId1) %>"/>
<portlet:param name="cmdType" value="AsrimHospitalsList"/>
</portlet:resourceURL>
<%


 String DIST_ID = ParamUtil.getString(request,"districtId").trim();//ParamUtil.getString(request, "DIST_ID");
 String stateId = ParamUtil.getString(request, "stateId").trim();
 String stateName="";
 String specialityId = ParamUtil.getString(request, "specialityId").trim();
 String distId="";
 String HOSP_TYPE=ParamUtil.getString(request, "HOSP_TYPE").trim();
 
 String diseaseName=ParamUtil.getString(request, "diseaseName").trim();
 
 if(diseaseName.length()>5 && diseaseName!=null && diseaseName!=""){
	 int postion1=diseaseName.indexOf("(");
	 if(postion1!=0)
	   diseaseName=diseaseName.substring(0, postion1-1).trim();
 }
  
 JSONObject states_List= DataGridDisplayManageUtil.getStates(pageId1,serverName1);
 
 JSONArray statesJsonArray =new JSONArray();
 
 if(states_List!=null){
	 statesJsonArray =(JSONArray) states_List.get("result"); 
    for(int j=0;j<statesJsonArray.length();j++){
  	org.json.JSONObject data=new org.json.JSONObject(statesJsonArray.get(j).toString());
  	//System.out.println(data.get("stateName"));
 	//System.out.println(data.get("stateId"));
 	 if(data.get("stateId").equals(stateId)){
 		stateName=data.get("stateName").toString();
 	}
   }  
 }
 
 
 JSONObject districts_List=new JSONObject();
 JSONArray destrictsJsonArray =null;
 if(stateId!=null && stateId!=""){
  districts_List= DataGridDisplayManageUtil.getDistricts(stateId,pageId1,serverName1);
  
  destrictsJsonArray=(JSONArray) districts_List.get("result"); 
 }
  
 /* System.out.println("State Name:"+stateName);
 System.out.println("districtId>>>"+DIST_ID);
 System.out.println("stateId>>>"+stateId);
 System.out.println("HOSP_TYPE>>>"+HOSP_TYPE); 
 System.out.println("diseaseName>>>"+diseaseName); */
 %>
 
<script>
	var primaryKeyColumn = 1;
	var primaryKeyColumnName = "Name of Hospital";
	var dataTables = {
        tables:[
            {
                select: "By Associate Number",
                dataURL:"<%=asrimHospitalsURL.toString()%>",
                columns:["Name of Hospital","State","District","Mandal","Specialities","Mitra Contact No"],
                options:{},
                scrollX: false,
                header: true,
                footer: true/* ,
                aoColumnDefs: [
	                { "visible": false, "targets": [5] }
	              ] */
            }
       ]
    };
	<%   if(pageId1==589 || pageId1==581 || pageId1==513 || pageId1==579 || pageId1==515){ %>
	dataTables = {
	        tables:[
	            {
	                select: "By Associate Number",
	                dataURL:"<%=asrimHospitalsURL.toString()%>",
	                columns:["Name of Hospital","State","District","Mandal","Specialities","Address","Mitra Contact No"],
	                options:{},
	                scrollX: false,
	                header: true,
	                footer: true/* ,
	                aoColumnDefs: [
		                { "visible": false, "targets": [5] }
		              ] */
	            }
	       ]
	    };
	<%}%>	
	function clearAndLoadData(selectedFilter){
		var booleanflag=true;
	   if(selectedFilter==5){ 
		 booleanflag=false; 
		 }                                                    
		//$("#recordList").html("");                       
		$("#recordList").html("<table id='datatables' class='table table-bordered table-hover table-striped' cellspacing='0' style='width:100%'><thead><tr></tr></thead></table>");
		var columns = dataTables.tables[selectedFilter].columns;
		var dataURL = dataTables.tables[selectedFilter].dataURL;
		var scrollXVal = dataTables.tables[selectedFilter].scrollX;
		var aoCustomColumn=dataTables.tables[selectedFilter].aoColumnDefs;
		 for(i=0;i<columns.length;i++){
			if(primaryKeyColumnName==columns[i]) primaryKeyColumn=i; 
			$("#recordList tr").append("<th scope='col'>"+columns[i]+"</th>");
		} 
     datatable = $('#recordList table').removeAttr('width').DataTable({
    	 ajax: dataURL,
    	 dom: 'Blfrtip',
	     lengthMenu: [10, 25, 50, 100],
	     order: [[ 0, "asc" ]],
          scrollY: false,
          scrollx: true,
         sScrollX: '100%',
         aoColumnDefs: aoCustomColumn,
			buttons: [ {
             extend: 'copy'      
         },
         {
             extend: 'excel'
         },
          {
             extend: 'pdfHtml5',
             orientation: 'landscape',
             pageSize: 'LEGAL'
         },
          {
         	extend: 'print' 
         }],
         columnDefs: [
             {
                 //target: [ 2, 3 ],
                 //visible: false,
               //  searchable: true,
             },
        	    { width: "200", targets: 0 }
        	  ],
        	  fixedColumns: true,
        	//  search: { regex: true,  },
         initComplete: function () {
        	
        	 stoploader();
        	 var j=1;
            this.api()
                .columns([1,2,3,4,5])
                .every(function () {
                    var column = this; 
                     	$('#select-'+column[0][0]).on('change', function () {
                     		console.log("onchange action for >>>"+"#select-"+column[0][0]);
                            var val = $('#select-'+column[0][0]).val();
                            var id=$('#select-'+column[0][0]).find(':selected').attr('data');
                            console.log("id>>>"+id);
                            if(id!=undefined){
	                            if(column[0][0]==1){
	                        	    districtsData(id);
	                            }
	                            else if(column[0][0]==2){
	                        	  mandalData(id);
	                            }
                            }
                       column.search(val,true,false,true).draw();
                   });
                     	
                     	
                     	
                      	if(column[0][0]==0){
                            column
                               .data()
                               .unique()
                               .sort()
                               .each(function (d, j) {
       							d=$.trim(d);
       							if(d!="" && d!=null){
       								if(column.search() === '^'+d+'$'){
       	                         		$('#select-'+column[0][0]).append('<option value="'+d+'" selected="selected">'+d.substr(0,30)+'</option>' )
       								} else {
       									$('#select-'+column[0][0]).append( '<option value="'+d+'">'+d.substr(0,30)+'</option>' )
       								}
       							}	
                               });
                         	}   	
                  
                  	
                });

      <%--     <% if(HOSP_TYPE!="" && HOSP_TYPE!=null){ %>
             var hospitalType="<%=HOSP_TYPE%>";
            if(hospitalType!=null && hospitalType!=""){

             //   console.log("hospitalType>>>>"+ hospitalType);
              $("#select-1").val(hospitalType).trigger('change');
            }
             
             <% } %>  --%>
         <%--     <% if(stateName!="" && stateName!=null){ %>
             
             var stateName="<%=stateName%>";
             if(stateName!=null && stateName!=""){
            	 console.log("state selection");
                 $("#select-1").val(stateName);
                 //
                //var id=$('#select-2').find(':selected').attr('data');
                //console.log("state Id>>>"+id); 
            	  // districtsData(id);
             }
             <% } %> --%>
             <% if((DIST_ID!="" && DIST_ID!=null)){ %>
             var districtId="<%=DIST_ID%>"; 
             districtId=$.trim(districtId);
             if((districtId!=null && districtId!="")){
            	 console.log("district selection");
                  $("#select-2").val(districtId).trigger('change');
             }
              <% } %>
           <% if(diseaseName!="" && diseaseName!=null){ %>
 
             var diseaseName="<%=diseaseName%>";
             if(diseaseName!=null && diseaseName!=""){
            	// $("input[type='search']").val(diseaseName).trigger('keyup');
            	 $("#select-4").val(diseaseName).trigger('change');
              //   console.log("diseaseName>>>>"+ diseaseName); 
                }
  
             <% } %>
             

            stoploader();
        },
       /*  search: {
            smart: false
         }, */
       // searching: false,
        processing: true, 
       // bStateSave: true 
    });
//}); 
	
	}
	
	function setCookie(cname,cvalue,exdays) {
		alert("set test");
	    var d = new Date();
	    d.setTime(d.getTime() + (exdays*24*60*60*1000));
	    var expires = "expires=" + d.toGMTString();
	    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
	}
     $(document).ready(function() {
    	console.log("testa");
    //	var previouslySelectedFilter = getCookie('hma-wms-position-list-filter');
    	//var previouslySelectedFilterIndex = 0;
    	
    //	console.log("previouslySelectedFilter:"+previouslySelectedFilter);
    	
    	/* for(i=0;i<dataTables.tables.length;i++){
    		if(previouslySelectedFilter==dataTables.tables[i].select){
        		$(positionFilter).append("<option selected='selected'>"+dataTables.tables[i].select+"</option>");
        		previouslySelectedFilterIndex = i;
    		}else{
        		$(positionFilter).append("<option>"+dataTables.tables[i].select+"</option>");
    		}
    	}
    	
    	$("#positionFilter").on("change",function(){
    		setCookie('hma-wms-position-list-filter',$(this).find(":selected").text(),1);
    		clearAndLoadData( $(this).find(":selected").index() );
    		$("#successmessage").hide();
    	}); */
    	
    	clearAndLoadData( 0 );
	    
	});
    
 	 </script>
 	 
 	 <div id="loader"></div>
 	 <div class="ysri_section">
	<section class="blue_section">
	
	

	<%
	String pageTitle="";
	if(pageId1==589 || pageId1==513 || pageId1==515 || pageId1==593 ||pageId1==579 ||pageId1==581){
		pageTitle="Aarogyasri ";
	}
	else if(pageId1==507 || pageId1==509){
		pageTitle="Aarogya Raksha ";
	}
	else if(pageId1==499 || pageId1==503){
		pageTitle="WJHS ";
	}
	else if(pageId1==585 ||pageId1==491 || pageId1==497 ||pageId1==595 ||pageId1==587){
		pageTitle="EHS ";
	}
	%>
	
	
	  <div class="container-fluid search_panel">
	  <%
	String geography="";
	String speciality="";
	String nearbyhptls="";
	if(pageId1==589|| pageId1==593 ||pageId1==579 || pageId1==581 || pageId1==579){
		geography="/web/guest/search-by-geography";
		speciality="/web/guest/asrispeciality";
		nearbyhptls="/web/guest/nearby-hospitals";
	}
	else if(pageId1==497|| pageId1==585||pageId1==595 ||pageId1==587 ||pageId1==503){
		geography="/web/guest/ehs-v4";
		speciality="/web/guest/ehsspeciality";
		nearbyhptls="/web/guest/nearby-hospitals";
	}
	
	if(pageId1==589 || pageId1==593 ||pageId1==579 || pageId1==585||pageId1==595 ||pageId1==587 ||pageId1==503 ||pageId1==581){
	 %>
	
			<div class="row">
				<div class="col-lg-12 text-end">
				<a href="<%=geography %>" <%if(pageId1==585 ||pageId1==589 || pageId1==581){ %>class="btn search_sm_btn_active" <%} %>  class="btn search_sm_btn"><i class="fa-solid fa-location-dot"></i> Search by Geography</a>
				<a href="<%=speciality %>"  <%if(pageId1==593 ||pageId1==579 ||pageId1==595 || pageId1==587){ %>class="btn search_sm_btn_active" <%} %> class="btn search_sm_btn"><i class="fa-solid fa-user-doctor"></i> Search by Speciality</a>
				<a href="<%=nearbyhptls %>"  class="btn search_sm_btn"><i class="fa-solid fa-hospital"></i> Hospitals Near Me</a>
			  </div> <!--end of col-->
			</div>
<% } %>

		  <h3><%=pageTitle %> State Empanelled Hospitals</h3>

		  <div id="searchData">
		   <form class="row row-cols-lg-auto align-items-center" action="" name="hospitalSearch" method="post" >
 			
 			<%if(pageId1==595 ||pageId1==587|| pageId1==593 ||pageId1==579 || pageId1==515 ||pageId1==497 || pageId1==509 ||pageId1==503){ %>
 							<div class="col-auto">
				<label  for="Speciality Name"><span class="text-danger">*</span>Speciality Name</label>
				<select class="form-select" id="select-4" label="Speciality Name" name="select-4">
				    <option value="">Show All</option>
				    <%
				    //String specialityId=null;
				      JSONArray speciality_List= DataGridDisplayManageUtil.getAsriSpecialityCount(null,pageId1,serverName1);
				     // System.out.print("speciality_List 123"+speciality_List.toString());
				      for(int j=0;j<speciality_List.length();j++){
			        	org.json.JSONArray data=new org.json.JSONArray(speciality_List.get(j).toString());
			        	long proceduresCount=0;
				    	   long hospitalCount=0;
				    	   String diseaseId="";
				    	   String disease_Name="";
			        	
			    	     if(pageId1==495 || pageId1==505 || pageId1==585 || pageId1==595 ||pageId1==587 || pageId1==499 || pageId1==491 || pageId1==497 || pageId1==503){ //ehs

			    	    	     proceduresCount=data.getLong(1);
					    	     hospitalCount=data.getLong(2);
					    	     diseaseId=data.getString(2);
					    	     disease_Name=data.getString(0); 
			    	     }
			    	     else{
                             	 proceduresCount=data.getLong(0);
					    	     hospitalCount=data.getLong(1);
					    	     diseaseId=data.getString(2);
					    	     disease_Name=data.getString(3); 
			    	    	 
			    	     }
			    	   int postion_1=disease_Name.indexOf("(");
			    	   if(postion_1!=0)
			    	     disease_Name=disease_Name.substring(0, postion_1-1).trim();
				    %>
				    <option value="<%=disease_Name%>"><%=disease_Name %></option>
				    <% } %>
				    
				 </select>
				</div> 
 			<%} %>
		 <p style="display: none;"> <%=serverName1%></p>
				<div class="col-auto">
				<label  for="State"><span class="text-danger">*</span> State</label>
				<select class="form-select" id="select-1" name="select-1">
		 <option data="" value="">Show All</option>
				    <% 
    for(int j=0;j<statesJsonArray.length();j++){
  	org.json.JSONObject data=new org.json.JSONObject(statesJsonArray.get(j).toString()); 
  	%>
	 <option data="<%=data.get("stateId")  %>""><%=data.get("stateName")  %></option>
	<% } %> 
   </select>
		</div> 
				<div class="col-auto">
				<label  for="District">District</label>
				<select class="form-select" id="select-2" name="select-2">
				    <option value="">Show All</option>
				     <% 
				     if(destrictsJsonArray!=null){
					    for(int j=0;j<destrictsJsonArray.length();j++){
					  	org.json.JSONObject data=new org.json.JSONObject(destrictsJsonArray.get(j).toString());
					  	
					  	 if(data.get("districtName").equals(DIST_ID)){
					  		distId=data.get("districtId").toString();
					  	}
					  	
  	                  %>
				    <option data="<%=data.get("districtId")  %>" value="<%=data.get("districtName") %>"><%=data.get("districtName")  %></option>
				    <% } } %>
				    
				 </select>
				</div>
				<!-- <div class="col-2"> 
				<label  for="Type">Type</label>
				<select class="form-select" id="select-1" name="select-1">
				    <option value="">Show All</option>
				 </select>
				</div>  -->
				<div class="col-auto">
				<label  for="Mandal">Mandal</label>
				<select class="form-select" id="select-3" name="select-3">
				    <option value="">Show All</option>
				      <%
				      if(stateId!=null && stateId!=""){
				      JSONObject mandal_List= DataGridDisplayManageUtil.getMandal(distId,pageId1,serverName1);
				     // System.out.print("mandal_List 123"+mandal_List.toString());
						 JSONArray mandalJsonArray = (JSONArray) mandal_List.get("result"); 
						for(int j=0;j<mandalJsonArray.length();j++){
			        	org.json.JSONObject data=new org.json.JSONObject(mandalJsonArray.get(j).toString());
			    	   String id=data.get("mandalId").toString();
			    	   String mandalName="";   
			    	  // System.out.print("page id is"+ pageId1);
			    	   if(pageId1==513 || pageId1==507 || pageId1==515 || pageId1==595 ||pageId1==587 || pageId1==509 ){
			    		     mandalName=data.get("mandalName").toString();  
			    	   }
			    	   else if(pageId1==499 || pageId1==585 || pageId1==491 ){
			    		   
			    		     mandalName=data.get("mandal").toString();  
			    		     //System.out.print("page id is"+ mandalName);
			    	   }
			    	  
				    %>
				    <option data="<%=id %>" value="<%=mandalName%>"><%=mandalName %></option>
				    <% } } %> 
				 </select>
				</div>
				
			<!-- 	<div class="col-auto">
				 <label  for="Type">Type</label>
				<select class="form-select" id="select-1" name="select-1">
				    <option value="">Show All</option>
				 </select>
				</div> -->
				<%if(pageId1==585 || pageId1==589 ||pageId1==581 ||pageId1==513 ||pageId1==491||pageId1==507 || pageId1==499){ %>
				<div class="col-auto">
				<label  for="Speciality Name">Speciality Name</label>
				<select class="form-select" id="select-4" label="Speciality Name" name="select-4">
				    <option value="">Show All</option>
				    <%
				    //String specialityId=null;
				      JSONArray speciality_List= DataGridDisplayManageUtil.getAsriSpecialityCount(null,pageId1,serverName1);
				    //  System.out.print("speciality_List 123"+speciality_List.toString());
				      for(int j=0;j<speciality_List.length();j++){
			        	org.json.JSONArray data=new org.json.JSONArray(speciality_List.get(j).toString());
			        	long proceduresCount=0;
				    	   long hospitalCount=0;
				    	   String diseaseId="";
				    	   String disease_Name="";
			        	
			    	     if(pageId1==495 || pageId1==505 || pageId1==585 || pageId1==595 ||pageId1==587 || pageId1==499 || pageId1==491 || pageId1==497 || pageId1==503){ //ehs

			    	    	     proceduresCount=data.getLong(1);
					    	     hospitalCount=data.getLong(2);
					    	     diseaseId=data.getString(2);
					    	     disease_Name=data.getString(0); 
			    	     }
			    	     else{
                             	 proceduresCount=data.getLong(0);
					    	     hospitalCount=data.getLong(1);
					    	     diseaseId=data.getString(2);
					    	     disease_Name=data.getString(3); 
			    	    	 
			    	     }
			    	   int postion_1=disease_Name.indexOf("(");
			    	   if(postion_1!=0)
			    	     disease_Name=disease_Name.substring(0, postion_1-1).trim();
				    %>
				    <option value="<%=disease_Name%>"><%=disease_Name %></option>
				    <% } %>
				    
				 </select>
				</div> 
				<%} %>
				<div class="col-auto">
                  <div class="serchbtn-sec"> 
				      <button type="button" id="resetBtnS" class="btn btn-secondary resetbtnclass" style="margin-top: 23px;width: 100%;font-size:13px;">Clear All</button>
                  </div>	
              </div>
			<script>
			$("#resetBtnS").click(function(){
				//alert("Clear");
				$("#select-1").val("").trigger('change');
				$('#select-2').find('option').remove().end().append('<option value="">Show all</option>');
				$("#select-2").val("").trigger('change');
				$('#select-3').find('option').remove().end().append('<option value="">Show all</option>');
				$("#select-3").val("").trigger('change'); 
				$("#select-4").val("").trigger('change');
				/* $("#select-1").val("").trigger('change'); */
				
				 $("input[type='search']").val("").trigger('keyup');
			});
			
			
			function districtsData(state_Id){
	    		   $('#select-2').prop("disabled", true);
				 AUI().use('aui-base','aui-io-request-deprecated', 'aui-node', function(A){
				    A.io.request('<%=getAjaxDataURL.toString() %>',{
					    dataType : 'json',
					    method : 'GET',
					    data : {
						    <portlet:namespace />state_Id :$.trim(state_Id),
						    <portlet:namespace />cmd:'destrictsList',
						    <portlet:namespace />pageId:'<%=pageId1 %>'
					    },
					    on : {
					    success : function() {
					    	 console.log("Success 123");
				           			 var response=this.get('responseData');
				           			 console.log(response);
						
				           			 
				           			 $('#select-2').find('option').remove().end().append('<option value="">Show all</option>'); 
				           			 $('#select-3').find('option').remove().end().append('<option value="">Show all</option>');
				           			 $('#<portlet:namespace />searchComplaintTypeId').html("");
				           			/* if(state_Id=="6"){ */
				        
				           			 jQuery.each(response, function(i, val) {
				           		 	 $('#select-2').append("<option data='"+val.districtId+"' value='"+val.districtName+"'>"+val.districtName+"</option>");
				           			});
				           			
				           			 $('#select-2').trigger('change');
						    		   $('#select-2').prop("disabled", false);
						    		   
				           			 },  
                                     error: function(xhr) {
						    			  console.log("Error");
						    		  }
				           	 	 }
				       });
				});        
			}

				function mandalData(district_Id){
					console.log("Success 1256789" + district_Id);
				 AUI().use('aui-base','aui-io-request-deprecated', 'aui-node', function(A){
				    A.io.request('<%=getAjaxDataURL.toString() %>',{
					    dataType : 'json',
					    method : 'GET',
					    data : {
						    <portlet:namespace />district_Id :$.trim(district_Id),
						    <portlet:namespace />cmd:'mandalList',
						    <portlet:namespace />pageId:'<%=pageId1 %>'
					    },
					    on : {
					    success : function() {
					    	 console.log("Success 12567");
				           			 var response=this.get('responseData');
				           			 console.log(response);
				           			 $('#select-3').find('option').remove().end().append('<option value="">Show all</option>'); 
				           			 $('#<portlet:namespace />searchComplaintTypeId').html("");
				           			 jQuery.each(response, function(i, val) {
				           				<% if(pageId1==589 ||pageId1==581 || pageId1==513 || pageId1==507 ||pageId1==515 || pageId1==593 ||pageId1==579 ||pageId1==509){ %>
				           		 	 $('#select-3').append("<option data='"+val.mandalId+"' value='"+val.mandalName+"'>"+val.mandalName+"</option>");
				           			<% }else{ %>
				           			$('#select-3').append("<option data='"+val.mandalId+"' value='"+val.mandal+"'>"+val.mandal+"</option>");
				           			<% } %>
				           				});
				           			 $('#select-3').trigger('change');
						    		   $('#select-3').prop("disabled", false);
				           			 },  
                                     error: function(xhr) {
						    			  console.log("Error");
						    		  }
				           	 	 }
				       });
				});        
			}
		     
		     
			</script>	
				
				<%-- <div class="col-2">
				<label  for="District">Speciality</label>
				<select class="form-select" id="Speciality" name="Speciality">
				    <option value="">Show All</option>
				    <%
				    String specialityId=null;
				      org.json.JSONArray speciality_List= DataGridDisplayManageUtil.getAsriSpecialityCount(specialityId);
				     // System.out.print("speciality_List 123"+speciality_List.toString());
				  	  
				      for(int j=0;j<speciality_List.length();j++){
			        	org.json.JSONArray data=new org.json.JSONArray(speciality_List.get(j).toString());
			    	   
			    	   int postion=data.getString(3).indexOf("(");
			    	   String disease_Name=data.getString(3).substring(0, postion-1).trim();
				    %>
				    <option value="<%=disease_Name%>"><%=disease_Name%></option>
				    <% } %>
				 </select>
				</div> --%>

 </form>
  </div>
        <div id="recordList" class="table-responsive-md">
  <!--       <table id="datatables" class="table table-bordered table-striped table-hover display nowrap" cellspacing="0" style=""width:100%">
        <thead class='table-dark'> 
        <th>Name of Hospital</th>
        <th>Hospital Type</th>
        <th>Hospital Address</th>
        <th>District</th>
        <th>Specialities</th>
        <th>Empanalled Date</th>
        <th>Name of Medco</th>
        <th>Medco Contact No</th>
        <th>Name of Mitra</th>
        <th>Mitra Contact No</th>
        </thead>
        <thead class='table-dark'> 
        <th>Name of Hospital</th>
        <th>Hospital Type</th>
        
        <th>Hospital Address</th>
        <th>District</th>
        <th>Specialities</th>
        <th>Empanalled Date</th>
        <th>Name of Medco</th>
        <th>Medco Contact No</th>
        <th>Name of Mitra</th>
        <th>Mitra Contact No</th>
        </thead>
        </table>
      -->   </div>
	 </div>
	 </section>
	 </div>
<script type="text/javascript"> 

$(document).ready(function() {

	
});
$(document).ready(function() {
	$('.modal-backdrop').remove();
	$('.modal-backdrop').remove();
} );
 
</script>
 
