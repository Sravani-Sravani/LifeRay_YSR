<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="com.kpmg.asrimSearch.util.DataGridDisplayManageUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<%@ include file="/html/dataTableIncludes.jspf" %>  
<portlet:resourceURL var="asrimHospitalsURL">
<portlet:param name="cmd" value="hospitalsList"/>
<portlet:param name="cmdType" value="AsrimHospitalsList"/>
</portlet:resourceURL>
<link href="/o/com.kpmg.asrimSearch/css/select2.min.css" rel="stylesheet" />
<script src="/o/com.kpmg.asrimSearch/js/select2.min.js"></script> 
<script>
function stoploader(){
	document.getElementById("loader").style.display = "none";
}
    $(document).ready(function () {
	 //  $("select").select2();
	}); 
</script>
 <style>
/* Center the loader */
#loader {
  position: absolute;
  left: 50%;
  top: 50%;
  z-index: 1;
  width: 120px;
  height: 120px;
  margin: -76px 0 0 -76px;
  border: 16px solid #f3f3f3;
/*   border-top: 16px solid blue;
  border-right: 16px solid green;
  border-bottom: 16px solid red;
  border-left: 16px solid pink; */
  border-radius: 50%;
  border-top: 16px solid #3498db;
  -webkit-animation: spin 2s linear infinite;
  animation: spin 2s linear infinite;
} 
@-webkit-keyframes spin {
  0% { -webkit-transform: rotate(0deg); }
  100% { -webkit-transform: rotate(360deg); }
}

@keyframes spin {
  0% { transform: rotate(0deg); }
  100% { transform: rotate(360deg); }
}

/* Add animation to "page content" */
.animate-bottom {
  position: relative;
  -webkit-animation-name: animatebottom;
  -webkit-animation-duration: 1s;
  animation-name: animatebottom;
  animation-duration: 1s
}

@-webkit-keyframes animatebottom {
  from { bottom:-100px; opacity:0 } 
  to { bottom:0px; opacity:1 }
}

@keyframes animatebottom { 
  from{ bottom:-100px; opacity:0 } 
  to{ bottom:0; opacity:1 }
}

#myDiv {
  display: none;
  text-align: center;
} 
/* End loader slider*/
 .search_panel .table thead th {background-color: #2169B2; color: #ffff;} 
.search_panel .table thead td {
    width: 100px !important;
    text-align: justify;
    overflow-x: scroll;
    }
main ul li{ border: 1px solid #ddd;padding: 5px 10px;border-radius: 25px;}
.lfr-search-container-wrapper .lfr-icon-menu > .dropdown-toggle {color: #fff;}
.specialitys{overflow-y: scroll; height: 125px;  width: auto;    }
.lfr-tooltip-scope{disaply:none;}
.alert-dismissible{disaply:none;}
.alert-danger{disaply:none;}
</style>
<%
 String DIST_ID = request.getParameter("districtId").trim();//ParamUtil.getString(request, "DIST_ID");
 String stateId = ParamUtil.getString(request, "stateId").trim();
 String stateName="";
 String distId="";
 String HOSP_TYPE=ParamUtil.getString(request, "HOSP_TYPE").trim();
 String diseaseName=ParamUtil.getString(request, "diseaseName").trim();
 if(diseaseName.length()>5 && diseaseName!=null && diseaseName!=""){
 int postion1=diseaseName.indexOf("(");
 if(postion1!=0)
   diseaseName=diseaseName.substring(0, postion1-1).trim();
 }
  
 JSONObject states_List= DataGridDisplayManageUtil.getStates();
   
 JSONArray statesJsonArray = (JSONArray) states_List.get("result"); 
    for(int j=0;j<statesJsonArray.length();j++){
  	org.json.JSONObject data=new org.json.JSONObject(statesJsonArray.get(j).toString());
  	System.out.println(data.get("stateName"));
 	System.out.println(data.get("stateId"));
 	 if(data.get("stateId").equals(stateId)){
 		stateName=data.get("stateName").toString();
 	}
   }  
 JSONObject districts_List= DataGridDisplayManageUtil.getDistricts(stateId);
 JSONArray destrictsJsonArray = (JSONArray) districts_List.get("result"); 
 
 
 System.out.println("State Name:"+stateName);
 System.out.println("districtId>>>"+DIST_ID);
 System.out.println("stateId>>>"+stateId);
 System.out.println("HOSP_TYPE>>>"+HOSP_TYPE); 
 System.out.println("diseaseName>>>"+diseaseName);
 %>
<script>
	var primaryKeyColumn = 1;
	var primaryKeyColumnName = "Name of Hospital";
	var dataTables = {
        tables:[
            {
                select: "By Associate Number",
                dataURL:"<%=asrimHospitalsURL.toString()%>",
                columns:["Name of Hospital","Hospital Type","State","District","Mandal","Specialities","Mitra Contact No","Name of Mitra","Medco Contact No","Name of Medco"],
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
         }/*,
          {
             extend: 'pdfHtml5',
             orientation: 'landscape',
             pageSize: 'LEGAL'
         }, */
         /* {
         	extend: 'print' 
         } */],
         columnDefs: [
             {
                 //target: [ 2, 3 ],
                 //visible: false,
               //  searchable: true,
             },
        	    { width: "200", targets: 0 }
        	  ],
        	  fixedColumns: true,
        	//  search: { regex: true,  },
         initComplete: function () {
        	
        	 stoploader();
        	 var j=1;
            this.api()
                .columns([2,3,4,5])
                .every(function () {
                    var column = this; 
                     	$('#select-'+column[0][0]).on('change', function () {
                     		console.log("onchange action for >>>"+"#select-"+column[0][0]);
                            var val = $('#select-'+column[0][0]).val();
                            var id=$('#select-'+column[0][0]).find(':selected').attr('data');
                           if(column[0][0]==2){
                        	  // districtsData(id);
                            }
                           if(column[0][0]==3){
                        	  // mandalData(id);
                            }
                           
                       column.search(val,true,false,true).draw();
                                 
                   });
                  	
                });

<%--             <% if(HOSP_TYPE!="" && HOSP_TYPE!=null){ %>
             var hospitalType="<%=HOSP_TYPE%>";
            if(hospitalType!=null && hospitalType!=""){

             //   console.log("hospitalType>>>>"+ hospitalType);
              $("#select-1").val(hospitalType).trigger('change');
            }
             
             <% } %>  --%>
             <% if(stateName!="" && stateName!=null){ %>
             
             var stateName="<%=stateName%>";
             if(stateName!=null && stateName!=""){
            	 console.log("state selection");
                $("#select-2").val(stateName).trigger('change');
                <% if((DIST_ID!="" && DIST_ID!=null)){ %>
                var districtId="<%=DIST_ID%>"; 
                districtId=$.trim(districtId);
                if((districtId!=null && districtId!="")){
               	 console.log("district selection");
                     $("#select-3").val(districtId).trigger('change');
                }
                 <% } %>
                //var id=$('#select-2').find(':selected').attr('data');
                //console.log("state Id>>>"+id); 
            	  // districtsData(id);
             }
             <% } %>
             
           <% if(diseaseName!="" && diseaseName!=null){ %>
 
             var diseaseName="<%=diseaseName%>";
             if(diseaseName!=null && diseaseName!=""){
            	// $("input[type='search']").val(diseaseName).trigger('keyup');
            	 $("#select-5").val(diseaseName).trigger('change');
              //   console.log("diseaseName>>>>"+ diseaseName); 
                }
  
             <% } %>
             

            stoploader();
        },
        search: {
            smart: false
         },
       // searching: false,
        processing: true, 
        bStateSave: true 
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
	

	  <div class="container search_panel">
		  <h3>Empanelled Hospitals List- In Aarogyasri Scheme</h3>
		   <form class="row row-cols-lg-auto align-items-center" action="" name="hospitalSearch" method="post" >
 <div id="searchData" class="row col-md-12">
 <div class="col-md-12"  style="padding-top: 0px;">
	<h6>Search Hospitals:</h6>	 
</div>
				  <div class="col-2">
				<label  for="State">State</label>
				<select class="form-select" id="select-2" name="select-2">
				    <option value="">Show All</option>
				    <% 
    for(int j=0;j<statesJsonArray.length();j++){
  	org.json.JSONObject data=new org.json.JSONObject(statesJsonArray.get(j).toString());
  	  
     %>
				    <option data="<%=data.get("stateId")  %>" value="<%=data.get("stateName") %>"><%=data.get("stateName")  %></option>
				    <% } %> 
				   </select>
				</div> 
				<div class="col-2">
				<label  for="District">District</label>
				<select class="form-select" id="select-3" name="select-3">
				    <option value="">Show All</option>
				     <% 
					    for(int j=0;j<destrictsJsonArray.length();j++){
					  	org.json.JSONObject data=new org.json.JSONObject(destrictsJsonArray.get(j).toString());
					  	
					  	 if(data.get("districtName").equals(DIST_ID)){
					  		distId=data.get("districtId").toString();
					  	}
					  	
  	                  %>
				    <option data="<%=data.get("districtId")  %>" value="<%=data.get("districtName") %>"><%=data.get("districtName")  %></option>
				    <% } %>
				 </select>
				</div>
				<!-- <div class="col-2"> 
				<label  for="Type">Type</label>
				<select class="form-select" id="select-1" name="select-1">
				    <option value="">Show All</option>
				 </select>
				</div>  -->
				<div class="col-3">
				<label  for="Mandal">Mandal</label>
				<select class="form-select" id="select-4" name="select-4">
				    <option value="">Show All</option>
				      <%
				      JSONObject mandal_List= DataGridDisplayManageUtil.getMandal(distId);
				     // System.out.print("mandal_List 123"+mandal_List.toString());
						 JSONArray mandalJsonArray = (JSONArray) mandal_List.get("result"); 
						for(int j=0;j<mandalJsonArray.length();j++){
			        	org.json.JSONObject data=new org.json.JSONObject(mandalJsonArray.get(j).toString());
			    	   String id=data.get("mandalId").toString();
			    	   String mandalName=data.get("mandalName").toString();  
				    %>
				    <option data="<%=id %>" value="<%=mandalName%>"><%=mandalName %></option>
				    <% } %> 
				 </select>
				</div>
						<div class="col-3">
				
				<label  for="Speciality Name">Speciality Name</label>
				<select class="form-select" id="select-5" label="Speciality Name" name="select-5">
				    <option value="">Show All</option>
				    <%
				      JSONArray speciality_List= DataGridDisplayManageUtil.getAsriSpecialityCount(null);
				      System.out.print("speciality_List 123"+speciality_List.toString());
				      for(int j=0;j<speciality_List.length();j++){
			        	org.json.JSONArray data=new org.json.JSONArray(speciality_List.get(j).toString());
			    	   long proceduresCount=data.getLong(0);
			    	   long hospitalCount=data.getLong(1);
			    	   String diseaseId=data.getString(2);
			    	   String disease_Name=data.getString(3);
			    	   int postion_1=disease_Name.indexOf("(");
			    	   if(postion_1!=0)
			    	     disease_Name=disease_Name.substring(0, postion_1-1).trim();
				    %>
				    <option value="<%=disease_Name%>"><%=disease_Name %></option>
				    <% } %>
				    
				 </select>
				</div> 
				<div class="col-md-2">
                  <div class="serchbtn-sec"> 
				      <button type="button" id="resetBtnS" class="btn btn-secondary resetbtnclass" style="margin-top: 23px;width: 100%;font-size:13px;">Reset</button>
                  </div>
              </div>
			<script>
			$("#resetBtnS").click(function(){
				//alert("Clear");
				$("#select-2").val("").trigger('change');
				$("#select-3").val("").trigger('change');
				$("#select-4").val("").trigger('change');
				$("#select-5").val("").trigger('change');
				 $("input[type='search']").val("").trigger('keyup');
			});
			
		     function districtsData(stateId){
		    	   console.log("stateId>>>"+stateId);
		    	 $.ajax({
		    		  url: "http://10.48.19.62:8091/portalsearchapi/public/ASRI-statelist",
		    		  type: "get", //send it through get method
		    		  // url: "http://10.48.19.62:8091/portalsearchapi/public/ASRI-districtlist",
		    		 // type: "post", //send it through get method
		    		  contentType: "application/json",
 		    		 // data: {
		    			//  "stateId":"6"
		    		  //},
		    		  dataType: 'json',
		    		  success: function(response) {
		    		   console.log("Success");
		    		  // console.log(response);
		    		   $('#select-3').find('option').remove().end().append('<option value="">Show all</option>');
		    		 for(var i=0;i<response.result.length;i++){
		    			 var data=response.result[i];
		    			 $('#select-3').append("<option data='"+data.stateId+"' value='"+data.stateName+"'>"+data.stateName+"</option>");
		    			
		    			  //console.log(response.result[i].stateId);
		    			//  console.log(response.result[i].stateName);
		    		  } 
		    		// $('#select-3').trigger('change');
		    		  },
		    		  error: function(xhr) {
		    			  console.log("Error");
		    		  }
		    		});
		    	  
		     }
		     function mandalData(districtId){
			    	  console.log("districtId>>>"+districtId);
			    	 $.ajax({
			    		  url: "http://10.48.19.62:8091/portalsearchapi/public/ASRI-statelist",
			    		  type: "get", //send it through get method
			    		  // url: "http://10.48.19.62:8091/portalsearchapi/public/ASRI-districtlist",
			    		 // type: "post", //send it through get method
			    		  contentType: "application/json",
	 		    		 // data: {
			    			//  "stateId":"6"
			    		  //},
			    		  dataType: 'json',
			    		  success: function(response) {
			    		   console.log("Success");
			    		//   console.log(response); 
			    		   $('#select-4').find('option').remove().end().append('<option value="">Show all</option>');
			    		 for(var i=0;i<response.result.length;i++){ 
			    			 var data=response.result[i];
			    			 $('#select-4').append("<option data='"+data.stateId+"' value='"+data.stateName+"'>"+data.stateName+"</option>");
			    			 
			    		  } 
			    		// $('#select-4').trigger('change');
			    		  },
			    		  error: function(xhr) {
			    			  console.log("Error");
			    		  }
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
 </div>
 </form>
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
 
<style>
 th, td { white-space: nowrap; }
    div.dataTables_wrapper {
        margin: 0 auto;
    }
 
    div.container {
        width: 80%;
    }
</style>