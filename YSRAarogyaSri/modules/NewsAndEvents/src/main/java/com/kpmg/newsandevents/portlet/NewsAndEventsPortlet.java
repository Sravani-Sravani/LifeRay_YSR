package com.kpmg.newsandevents.portlet;

import com.kpmg.customtables.model.NewsAndEvents;
import com.kpmg.customtables.model.impl.NewsAndEventsImpl;
import com.kpmg.customtables.service.NewsAndEventsLocalServiceUtil;
import com.kpmg.newsandevents.constants.NewsAndEventsPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author AppsTek Corp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=NewsAndEvents",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + NewsAndEventsPortletKeys.NEWS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class NewsAndEventsPortlet extends MVCPortlet {
	
	
	private static Log _log = LogFactoryUtil.getLog(NewsAndEventsPortlet.class.getName());
	
	public void manageNews(ActionRequest request, ActionResponse response) throws Exception {
		
         ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		 long userId = themeDisplay.getUserId();
		 String newsDescription = ParamUtil.getString(request, "newsDescription");  
		 long recordId = ParamUtil.getLong(request, "recordId");
		 String newsDate = ParamUtil.getString(request, "newsDate"); 
		 SimpleDateFormat DbDataFormate=new SimpleDateFormat("yyyy-MM-dd");
		 boolean isnewRecord=true;
		 Date publishedDate = null;
	     if(newsDate!=""){
	    	 
				try {
					publishedDate=DbDataFormate.parse(newsDate);
				} catch (java.text.ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}					 
		NewsAndEvents newsAndEvents=null;
	  if(recordId==0) {
		   newsAndEvents=new NewsAndEventsImpl();
		   recordId=CounterLocalServiceUtil.increment(NewsAndEventsPortlet.class.getName());
		   newsAndEvents.setNewsId(recordId);
		   newsAndEvents.setCreatedDate(new Date());
		   newsAndEvents.setCreatedBy(userId);
	  }
	  else {
		  isnewRecord=false;
		  newsAndEvents=NewsAndEventsLocalServiceUtil.fetchNewsAndEvents(recordId);
		  newsAndEvents.setModifiedDate(new Date());
		   newsAndEvents.setModifiedBy(userId);
	  }
		 
	  newsAndEvents.setNewsdescription(newsDescription);
	   newsAndEvents.setNewsDate(publishedDate);
	    
		 long userFolderId = getUserFolderId(themeDisplay, request);
       
		 
		 boolean flag=true;
		  try {
			 
	 		    UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
					String uploadFileName = null;
					String uploadType="newsDocument";
					uploadFileName = uploadPortletRequest.getFileName(uploadType);
					
					 String nameArray[]=uploadFileName.split("\\."); 
					 if (uploadFileName != null && !uploadFileName.isEmpty()) {
						 long uploadSize =  uploadPortletRequest.getSize(uploadType);
							int fileSize= Math.round((uploadSize / 1024)); 
				             if (fileSize > 20480) {
				            	    SessionErrors.add(request, "document.errorMsg.sizeIssue");
									flag =false; 
				             }
						 String[] extensionsList= new String[]  {"pdf"};
					     if(nameArray.length>2 || !(Arrays.asList(extensionsList).contains(nameArray[nameArray.length-1]))){
							SessionErrors.add(request, "document.errorMsg.missing");
							flag =false;
						 }
			    		     if(flag) {
					    	 FileEntry entry = fileUpload(themeDisplay, request, "newsDocument","", themeDisplay.getUserId(),userFolderId, recordId);
								if(entry!=null){
									newsAndEvents.setFileEntryId(entry.getFileEntryId());
								} 
					     }
					 }
			  }
	 	catch(Exception e) {
	    	SessionErrors.add(request, "document.errorMsg.missing");
	    	flag=false;
		}
		/*
		 * String[] specialChars= new String[] {";","<",">","{","}"}; for (String item :
		 * specialChars) { if (Validator.isNotNull(newsDescription) &&
		 * newsDescription.contains(item)) { SessionErrors.add(request,
		 * "title.errorMsg.missing"); flag =false; } }
		 */
		  
        if(flag) {
		        if(isnewRecord) {
		    	   NewsAndEventsLocalServiceUtil.addNewsAndEvents(newsAndEvents);
		    	   SessionMessages.add(request, "entryAdded");
		       }
		       else {
		    	   NewsAndEventsLocalServiceUtil.updateNewsAndEvents(newsAndEvents);
		    	   SessionMessages.add(request, "entryUpdated");
		       }
        }
        else {
        	response.setRenderParameter("jspPage","/createNewsAndEvents.jsp");
        }
	}
 
	public void deleteNews(ActionRequest request, ActionResponse response) throws Exception {
		
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY); 
		long recordId = ParamUtil.getLong(request, "recordId");   
	  if(recordId!=0) {
		  try { 
            NewsAndEventsLocalServiceUtil.deleteNewsAndEvents(recordId);
            SessionMessages.add(request, "entryDeleted");
		  }
		  catch(Exception e) {
			  
		  }
	  }   
	}
	public long getUserFolderId(ThemeDisplay themeDisplay, ActionRequest request) {

		long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
		String usersFolderName = "users";
		String usersFolderDesc = "This folder is created for Upload all Users documnets";
		String rootFolderDescription = "This folder is create for Upload User(" + themeDisplay.getUserId()
				+ ") documents";
		Folder usersRootFolder = null;
		long userFolderId = 0L;
		String rootFolderName = Long.toString(themeDisplay.getUserId());

		boolean UsersFolderExist = isFolderExist(themeDisplay.getScopeGroupId(), parentFolderId, usersFolderName);
		long usersRootFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
		if (!UsersFolderExist) {
			usersRootFolder = createFolder(request, themeDisplay, parentFolderId, usersFolderName, usersFolderDesc);
			usersRootFolderId = usersRootFolder.getFolderId();
		} else {
			usersRootFolder = getFolder(themeDisplay.getScopeGroupId(), parentFolderId, usersFolderName);
			usersRootFolderId = usersRootFolder.getFolderId();
		}

		boolean folderExist = isFolderExist(themeDisplay.getScopeGroupId(), usersRootFolderId, rootFolderName);
		if (!folderExist) {
			Folder userFolder = createFolder(request, themeDisplay, usersRootFolderId, rootFolderName,
					rootFolderDescription);
			userFolderId = userFolder.getFolderId();
		} else {
			Folder userFolder = getFolder(themeDisplay.getScopeGroupId(), usersRootFolderId, rootFolderName);
			userFolderId = userFolder.getFolderId();
		}
		return userFolderId;
	}
	public Folder getFolder(long scopeGroupId, long parentFolderId, String rootFolderName) {
		Folder folder = null;
		try {
			folder = DLAppServiceUtil.getFolder(scopeGroupId, parentFolderId, rootFolderName);
		} catch (Exception e) {
			_log.info(e.getMessage());
		}
		return folder;
	}

	public boolean isFolderExist(long scopeGroupId, long parentFolderId, String rootFolderName) {
		boolean folderExist = false;
		try {
			DLAppServiceUtil.getFolder(scopeGroupId, parentFolderId, rootFolderName);
			folderExist = true;
			_log.info("Folder is already Exist");
		} catch (Exception e) {
			_log.info(e.getMessage());
		}
		return folderExist;
	}

	public Folder createFolder(ActionRequest actionRequest, ThemeDisplay themeDisplay, long parentFolderId,
			String rootFolderName, String rootFolderDescription) {
		Folder folder = null;
		long repositoryId = themeDisplay.getScopeGroupId();
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
			folder = DLAppServiceUtil.addFolder(repositoryId, parentFolderId, rootFolderName, rootFolderDescription,
					serviceContext);
		} catch (PortalException e1) {
			e1.printStackTrace();
		} catch (SystemException e1) {
			e1.printStackTrace();
		}
		return folder;
	}

public FileEntry fileUpload(ThemeDisplay themeDisplay, ActionRequest actionRequest, String uploadType, String docNumber, long userId, long folderId, long jobPortalJobId) {
	_log.info("calling file uplodad" + docNumber);
	UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
	String uploadFileName = null;
	FileEntry fileEntry = null;
	_log.info("uploadType>>" + uploadType);
	uploadFileName = uploadPortletRequest.getFileName(uploadType);
	File uploadFile = uploadPortletRequest.getFile(uploadType);
	long uploadSize =  uploadPortletRequest.getSize(uploadType);
	String uploadMimeType = uploadPortletRequest.getContentType(uploadType);
	_log.info("uploadFileName>>" + uploadFileName);
	String description = "This file is added via programatically";
	long repositoryId = themeDisplay.getScopeGroupId();
	if (uploadFileName != null && !uploadFileName.isEmpty()) {
		try {
			Date currentDate = new Date();
			ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(),
					actionRequest);
			serviceContext.setScopeGroupId(repositoryId);
			uploadFileName = uploadFileName.replaceAll(" ", "_");
			String ProfilePictureTitle = currentDate.getTime() + "_-_" + uploadFileName;
			fileEntry = DLAppServiceUtil.addFileEntry(repositoryId, folderId, uploadFileName, uploadMimeType, ProfilePictureTitle, description, "changeLog",uploadFile, serviceContext);
				 
		} catch (Exception e) {
			_log.info(e.getMessage());
			e.printStackTrace();
		}
	}
	return fileEntry;
}
public static String getFile(long docEntryId,long scopeId){
	String fileUrl="";
	 FileEntry fileEntry;
	 _log.info("Enter to getFile");
	 _log.info("docEntryId>>>>>"+docEntryId);
	 _log.info("scopeId>>>>"+scopeId);
	try {
		fileEntry = DLAppServiceUtil.getFileEntry(docEntryId);
		if(fileEntry!=null){
			_log.info("Enter to fileEntry not empty");
			fileUrl = "/documents/" + scopeId + "/" + 
					fileEntry.getFolderId() +  "/" +fileEntry.getTitle();
		  }
	} catch (PortalException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return fileUrl;	  
 }
}