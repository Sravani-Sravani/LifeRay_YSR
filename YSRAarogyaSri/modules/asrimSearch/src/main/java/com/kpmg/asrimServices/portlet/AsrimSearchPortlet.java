package com.kpmg.asrimServices.portlet;

import com.kpmg.asrimServices.constants.AsrimSearchPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author jaganmohan
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=AsrimSearch",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AsrimSearchPortletKeys.ASRIMSEARCH,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AsrimSearchPortlet extends MVCPortlet {
	Log _log =LogFactoryUtil.getLog(AsrimSearchPortlet.class);
	public Connection getConnection() throws ClassNotFoundException,SQLException
	{			
		Connection conn = null;
		String dburl = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		//	String env = PropsUtil.get("norka.site.environment");
			//if(env.equalsIgnoreCase("PROD"))
			//{
				//dburl = "jdbc:mysql://10.2.67.14:3306/lportal?zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8";
			//}
			//else
			//{
				 dburl = "jdbc:mysql://localhost:3306/lportal_ga40_27_10_2022?zeroDateTimeBehavior=convertToNull";//103.248.209.132
				 //dburl = "jdbc:mysql://192.168.2.67:3306/lportal_uat_14_02_2020?zeroDateTimeBehavior=convertToNull";
			//}
			
			//_log.info("PropsUtil.get jdbc.default.username "+PropsUtil.get("jdbc.default.username"));
		//	_log.info("PropsUtil.get jdbc.default.password"+PropsUtil.get("jdbc.default.password"));
		   //conn = DriverManager.getConnection(dburl,PropsUtil.get("jdbc.default.username"),PropsUtil.get("jdbc.default.password"));
				  conn = DriverManager.getConnection(dburl,"root","root");
		} catch (SQLException e1) {
			
			_log.info("Error in getting connection for RenewalJobScheduler class "+e1.getMessage());
		} 
		return conn;
	}
	
	public  long getRenewalUser() 
	{			
		ResultSet resultSet = null;
		Statement statement = null;
		Connection conn = null;
		Norka norka = null;
		long noOfApplicationsAffected =0;
		 List<Norka> norkaExistingData =null;
		if(conn==null)
		{
			try {
				conn = getConnection();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		try {

			LocalDate today = LocalDate.now();					
			norkaIdList =  new ArrayList<Long>();			
			LocalDate last90Day = today.plusDays(90);
			
			_log.info("Date After 90 day : " + last90Day);
			if(conn!=null)
			{
				statement = conn.createStatement();
				//commented as part of fixing the issue for expiry status  issue
				//String sql = "select userid from nrk_norka  where norkaexpirydate <='"+last90Day+"' and   norkaexpirydate <>'0000-00-00 00:00:00.000000' and applicationstatus <> "+SchedulerJobPortletKeys.RENEWAL_STATUS_EXPIRE;
				String sql = "select userid from nrk_norka  where norkaexpirydate <='"+last90Day+"' and   norkaexpirydate <>'0000-00-00 00:00:00.000000' and applicationstatus = "+SchedulerJobPortletKeys.RENEWAL_STATUS_PRINT;
			 	_log.info("sql-------->" + sql);
				//_log.info("Date After SQL : " + sql);
				resultSet = statement.executeQuery(sql);
				int count=0;
				while (resultSet.next()) {
					count++;

				}
			}
		}
		catch(Exception e) {
			
		}
	}
}