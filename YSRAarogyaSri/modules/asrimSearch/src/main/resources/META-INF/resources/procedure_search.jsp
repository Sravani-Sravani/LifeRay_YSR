<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="com.kpmg.asrimSearch.util.DataGridDisplayManageUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<%@ include file="/html/dataTableIncludes.jspf" %>  

<link href="/o/com.kpmg.asrimSearch/css/select2.min.css" rel="stylesheet" />
<script src="/o/com.kpmg.asrimSearch/js/select2.min.js"></script> 
<portlet:resourceURL var="getAjaxDataURL1"></portlet:resourceURL>
<% 
themeDisplay  = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long pageId1=themeDisplay.getPlid();
%>

<portlet:resourceURL var="asrimHProceduresURL">
<portlet:param name="cmd" value="proceduredList"/>
<portlet:param name="pageId" value="<%=String.valueOf(pageId1)  %>"/>
<portlet:param name="cmdType" value="AsrimProceduresList"/>
</portlet:resourceURL>
<script>
function stoploader(){
	document.getElementById("loader").style.display = "none";
}
    $(document).ready(function () {
	   $("select").select2();
	}); 
</script>
<style>
/* search_panel .table td, .search_panel .table th {
    width:10%;
    } */ 
   table.dataTable thead th, table.dataTable tr td{ width:auto !important;}
</style>

<% 

 String diseaseName=ParamUtil.getString(request, "diseaseName").trim();
//String specialityId= ParamUtil.getString(request,"specialityId").trim();//ParamUtil.getString(request, "DIST_ID");
//String splcode="";
String specialityId = ParamUtil.getString(request, "specialityId").trim();
String proc_type=ParamUtil.getString(request, "proc_type").trim();
 
 if(diseaseName.length()>5 && diseaseName!=null && diseaseName!=""){
	 int postion1=diseaseName.indexOf("(");
	 if(postion1!=0)
	   diseaseName=diseaseName.substring(0, postion1-1).trim();
 }
    
 %>
 <% //System.out.println("proc_type>>>"+proc_type); %>
<script>
	var primaryKeyColumn = 1;
	var primaryKeyColumnName = "Name of Hospital";
	
	
	var dataTables = {
	        tables:[
	            {
	                select: "By Associate Number	",
	                dataURL:"<%=asrimHProceduresURL.toString()%>",
	                columns:["Code","Speciality Name","Treatments Code","Treatments Name","Treatments Type","Package Amount","Aasara Amount","Pre Investigation","Post Operative/Treatments Investigation"],
	                options:{},
	                scrollX: false,
	                header: true,
	                footer: true
	            }
	       ]
	    };
	<%   if(pageId1==511){ %>
	  dataTables = {
		        tables:[
		            {
		                select: "By Associate Number	",
		                dataURL:"<%=asrimHProceduresURL.toString()%>",
		                columns:["Code","Speciality Name","Treatments Code","Treatments Name","Package Amount","Pre Investigation","Post Operative/Treatments Investigation"],
		                options:{},
		                scrollX: false,
		                header: true,
		                footer: true
		            }
		       ]
		    };
	  <% }  %>
	<%   if(pageId1==495 || pageId1==505){ %>
	  dataTables = {
	        tables:[
	            {
	                select: "By Associate Number	",
	                dataURL:"<%=asrimHProceduresURL.toString()%>",
	                columns:["Code","Speciality Name","Treatments Code","Treatments Name","Preauth Evidence","Price for Semi private ward - Non NABH","Price for Private ward - Non NABH"],
	                options:{},
	                scrollX: false,
	                header: true,
	                footer: true
	            }
	       ]
	    };
<% }  %>

	function clearAndLoadData(selectedFilter){
	var booleanflag=true;
	   if(selectedFilter==5){ 
		 booleanflag=false; 
		 }                                                    
		$("#recordList").html("<table id='datatables' class='table table-bordered table-hover table-striped'><thead><tr></tr></thead></table>");
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
        	    { width: "200", targets: 0 }
        	  ],
        	  fixedColumns: true,
         initComplete: function () {
        	var j=1;
            this.api()
                .columns([1,3,4])
                .every(function () {
                    var column = this; 
                    /* .appendTo($(column.footer()));
                    .appendTo( $(column.footer()).empty() );
                     */
                 	$('#select-'+column[0][0]).on('change', function () {
                 		console.log("onchange action for >>>"+"#select-"+column[0][0]);
                        var val = $('#select-'+column[0][0]).val();                        
                        var id=$('#select-'+column[0][0]).find(':selected').attr('data');
                        console.log("id>>>"+id);
                        if(id!=undefined){
                            if(column[0][0]==1){
                        	    procedureData(id);
                            }
                        }
                   /* column.search(val,true,false,true).draw(); */
                   var val = $.fn.dataTable.util.escapeRegex(
                                         $(this).val()
                                     );
                        /* alert("Asche::"+val); */
                        column.search(val ? '^' + val + '$' : '', true, false).draw();
                        
               });
                 	/* column.data().unique().sort().each(function (d, j) {
                        select.append('<option style="text-align-last: right;" value="' + d + '">' + d + '</option>');
                        }); */
                 	
                  	if(column[0][0]==4){
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
            
        	
            <% if(proc_type!="" && proc_type!=null){ %>
            var procedureType="<%=proc_type%>";
           if(procedureType!=null && procedureType!=""){

            //   console.log("hospitalType>>>>"+ hospitalType);
             $("#select-4").val(procedureType).trigger('change');
           }
            
            <% } %> 
        	
            
            
            
            stoploader();
        }, 
        //bStateSave: true 
        processing: true, 
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

	function getCookie(cname) {
		console.log("get test" +cname);
	    var name = cname + "=";
	    var decodedCookie = decodeURIComponent(document.cookie);
	    var ca = decodedCookie.split(';');
	    for(var i = 0; i < ca.length; i++) {
	        var c = ca[i];
	        while (c.charAt(0) == ' ') {
	            c = c.substring(1);
	        }
	        if (c.indexOf(name) == 0) {
	            return c.substring(name.length, c.length);
	        }
	    }
	    return "";
	}
	
    $(document).ready(function() {
    	console.log("testa");
    	var previouslySelectedFilter = getCookie('hma-wms-position-list-filter');
    	var previouslySelectedFilterIndex = 0;
    	
    	console.log("previouslySelectedFilter:"+previouslySelectedFilter);
    	 
    	clearAndLoadData( 0 );
	    
	});
    
 	 </script>
 	 
 	 <div id="loader"></div>
 	 <div class="ysri_section">
	<section class="blue_section">
	<%String pageTitle="";
	if(pageId1==517){
		pageTitle="Aarogyasri ";
	}
	else if(pageId1==495){
		pageTitle="EHS ";
	} else if(pageId1==505){
		pageTitle="WJHS";
	}
	else if(pageId1==511){
		pageTitle="Aarogya Raksha";
	}
	%>
	<!-- <div class="row col-md-12" id="loader"  style="display:none;">
  <div class="col-md-5"></div>
  <div class="col-md-3">
  <div class="loader"></div>
  </div>
  <div class="col-md-3"></div>
  </div> -->
	  <div class="container-fluid search_panel">
		  <h3><%=pageTitle %> / Treatments Search</h3>
		   <div id="searchData">
		   <form class="row row-cols-lg-auto align-items-center" action="" name="hospitalSearch" method="post" >
 <!--
 <div class="col-auto">
	<h6>Procedures Search</h6>		 
</div>
           
 <!-- <div class="col-3">
				<label  for="Hospital Speciality">Hospital Speciality</label>
				<select class="form-select" id="select-1" label="Hospital Speciality" name="select-1">
				    <option value="">Show All</option>
				 </select>
				</div>  -->
               
				 <!-- <div class="col-2">
				<label  for="Code">Speciality Code</label>
				<select class="form-select" id="select-0" name="select-0">
				    <option value="">Show All</option>
				 </select>
				</div> -->
				<div class="col-lg-3">
				<label  for="Speciality Name"><span class="text-danger">*</span> Speciality Name</label>
				<select class="form-select" id="select-1" name="select-1">
				    <option value="">Show All</option>
				  <%
				      JSONArray speciality_List= DataGridDisplayManageUtil.getAsriSpecialityCount(null, pageId1,serverName);
				      //System.out.print("speciality_List 123"+speciality_List.toString());
				      for(int j=0;j<speciality_List.length();j++){
			        	org.json.JSONArray data=new org.json.JSONArray(speciality_List.get(j).toString());
			    	  
			        	
			        	long proceduresCount=0;
				    	   long hospitalCount=0;
				    	   String diseaseId="";
				    	   String disease_Name="";
			        	
			    	     if(pageId1==495 || pageId1==505 ||pageId1==491){ //ehs

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
			    	   
			    	   if(postion_1!=0 && (pageId1==495 || pageId1==505)){
			    		  // System.out.println("disease_Name>>>"+disease_Name);
			    		  diseaseId=disease_Name.substring(postion_1+1,disease_Name.length()-1).trim();
			    	   //System.out.println("diseaseId>>>"+diseaseId);
			    	   }
			    	   
			    	   if(postion_1!=0)
			    	     disease_Name=disease_Name.substring(0, postion_1-1).trim();
			    	   
			    	  
				    %>
				    <option data="<%=diseaseId %>" value="<%=disease_Name%>"><%=disease_Name %></option>
				    <% } %>
				 </select>
				</div>
				 
				<!--<label  for="Procedure Type">Procedure Type</label>
				<select class="form-select" id="select-4" name="select-4">
				    <option value="">Show All</option>
				 </select>
				</div>-->
				<div class="col-lg-6">
				<label  for="Procedure Name">Treatments Name</label>
				<select class="form-select" id="select-3" name="select-3">
				    <option value="">Show All</option>

				 </select>
				</div>
				<%if(pageId1==517) {%>
				<div class="col-auto">
				<label  for="Procedure Name">Type</label>
				<select class="form-select" id="select-4" name="select-4">
				    <option value="">Show All</option>

				 </select>
				</div>
				<% } %>
					<div class="col-auto">
                  <div class="serchbtn-sec"> 
				      <button type="button" id="resetBtnS" class="btn btn-secondary resetbtnclass" style="margin-top: 23px;width: 100%;font-size:13px;">Clear All</button>
                  </div>
              </div>
			<script>
			$("#resetBtnS").click(function(){
				//alert("Clear");
				 $("#select-1").val("").trigger('change');
				 $("#select-3").val("").trigger('change');
				 $('#select-3').find('option').remove().end().append('<option value="">Show all</option>');
				 $("#select-4").val("").trigger('change');
				 $("input[type='search']").val("").trigger('keyup');
			});
			
			
				function procedureData(specialityId){
				$('#select-3').prop("disabled", true);
				 AUI().use('aui-base','aui-io-request-deprecated', 'aui-node', function(A){
				    A.io.request('<%=getAjaxDataURL1.toString() %>',{
					    dataType : 'json',
					    method : 'GET',
					    data : {
						    <portlet:namespace />specialityId :$.trim(specialityId),
						    <portlet:namespace />cmd:'List',
						    <portlet:namespace />pageId:'<%=pageId1 %>'
					    },
					    on : {
					    success : function() {
					    	 console.log("Success 12345");
				           			 var response=this.get('responseData');
				           			 console.log(response);
						
				           			 
				           			 $('#select-3').find('option').remove().end().append('<option value="">Show all</option>'); 
				           			 $('#<portlet:namespace />searchComplaintTypeId').html("");
				           			 jQuery.each(response, function(i, val) {
				           		 	 $('#select-3').append("<option data='"+val.specialityCode+"' value='"+val.procedureName+"'>"+val.procedureName+"</option>");
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

 </form>
  </div>
 <div id="recordList" class="table-responsive-md">
  </div>
	 </div>
	 </section>
	 </div>
<script type="text/javascript"> 
$(document).ready(function() {
	$('.modal-backdrop').remove();
	$('.modal-backdrop').remove();
} );
 
</script>
 
