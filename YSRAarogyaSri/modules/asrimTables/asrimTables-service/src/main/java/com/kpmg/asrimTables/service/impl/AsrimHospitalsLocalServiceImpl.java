/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.kpmg.asrimTables.service.impl;
import com.kpmg.asrimTables.model.AsrimHospitals;
import com.kpmg.asrimTables.service.AsrimHospitalsLocalServiceUtil;
import com.kpmg.asrimTables.service.base.AsrimHospitalsLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.kpmg.asrimTables.model.AsrimHospitals",
	service = AopService.class
)
public class AsrimHospitalsLocalServiceImpl
	extends AsrimHospitalsLocalServiceBaseImpl {
	
	public List<AsrimHospitals> getSearchHospitals(String DIST_ID,String HOSP_NAME,String hospital_type,String stateId,List<String> list) {

		List<AsrimHospitals> hospitalsList = new ArrayList<AsrimHospitals>();
 
		DynamicQuery dynamicQuery = null;
		//Criterion criterion = null;
		 System.out.println("DIST_ID>>>"+DIST_ID);
		 System.out.println("HOSP_NAME>>>"+HOSP_NAME);
		 System.out.println("hospital_type>>>"+hospital_type);
		 System.out.println("stateId>>>"+stateId);
		 System.out.println("list.size()>>>"+list.size());
		 
		 
		dynamicQuery = AsrimHospitalsLocalServiceUtil.dynamicQuery(); 
		dynamicQuery.add(RestrictionsFactoryUtil.eq("HOSP_ACTIVE_YN", "Y"));
		if (!Validator.isBlank(DIST_ID)) {
			System.out.println("Step-1");
			dynamicQuery.add(RestrictionsFactoryUtil.eq("DIST_ID", DIST_ID));
		}
		if (!Validator.isBlank(HOSP_NAME)) {
			System.out.println("Step-2");
			dynamicQuery.add(RestrictionsFactoryUtil.eq("HOSP_ID", HOSP_NAME));
			 //_log.info("raisedBy>>>"+raisedBy);
		}
		if (!Validator.isBlank(hospital_type)) {
			System.out.println("Step-3");
			dynamicQuery.add(RestrictionsFactoryUtil.eq("HOSP_TYPE", hospital_type));
			 //_log.info("raisedBy>>>"+raisedBy);
		}
		/*
		 * if (!Validator.isBlank(DIST_ID) || !Validator.isBlank(HOSP_NAME) ||
		 * !Validator.isBlank(hospital_type)) {
		 * System.out.println("Step-4 before"+list.size()); hospitalsList =
		 * AsrimHospitalsLocalServiceUtil.dynamicQuery(dynamicQuery);
		 * System.out.println("hospitalsList1>>>>"+hospitalsList.size());
		 * 
		 * for(AsrimHospitals data:hospitalsList) { list.add(data.getHOSP_ID()); } }
		 */		
		
		 if(list.size()>0) {
			System.out.println("Step-4 after"+list.size());
			
		     dynamicQuery.add(RestrictionsFactoryUtil.in("HOSP_ID", list));
		}
		 
 		Order order = OrderFactoryUtil.asc("HOSP_NAME");
		dynamicQuery.addOrder(order); 
		
		hospitalsList =  AsrimHospitalsLocalServiceUtil.dynamicQuery(dynamicQuery);
		System.out.println("hospitalsList1>>>>"+hospitalsList.size());
		 
		return hospitalsList;
	}
	public List<AsrimHospitals> getHospitalsBySearch(String DIST_ID,String HOSP_TYPE, List<String>hospitalList){
		return asrimHospitalsFinder.getHospitalsBySearch(DIST_ID, HOSP_TYPE, hospitalList);
	}
}