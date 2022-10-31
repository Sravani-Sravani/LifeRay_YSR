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

package com.kpmg.asrimTables.service.persistence;

import com.kpmg.asrimTables.model.AsrimHospitals;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the asrim hospitals service. This utility wraps <code>com.kpmg.asrimTables.service.persistence.impl.AsrimHospitalsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AsrimHospitalsPersistence
 * @generated
 */
public class AsrimHospitalsUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AsrimHospitals asrimHospitals) {
		getPersistence().clearCache(asrimHospitals);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, AsrimHospitals> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AsrimHospitals> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AsrimHospitals> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AsrimHospitals> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AsrimHospitals> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AsrimHospitals update(AsrimHospitals asrimHospitals) {
		return getPersistence().update(asrimHospitals);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AsrimHospitals update(
		AsrimHospitals asrimHospitals, ServiceContext serviceContext) {

		return getPersistence().update(asrimHospitals, serviceContext);
	}

	/**
	 * Caches the asrim hospitals in the entity cache if it is enabled.
	 *
	 * @param asrimHospitals the asrim hospitals
	 */
	public static void cacheResult(AsrimHospitals asrimHospitals) {
		getPersistence().cacheResult(asrimHospitals);
	}

	/**
	 * Caches the asrim hospitalses in the entity cache if it is enabled.
	 *
	 * @param asrimHospitalses the asrim hospitalses
	 */
	public static void cacheResult(List<AsrimHospitals> asrimHospitalses) {
		getPersistence().cacheResult(asrimHospitalses);
	}

	/**
	 * Creates a new asrim hospitals with the primary key. Does not add the asrim hospitals to the database.
	 *
	 * @param HOSP_ID the primary key for the new asrim hospitals
	 * @return the new asrim hospitals
	 */
	public static AsrimHospitals create(String HOSP_ID) {
		return getPersistence().create(HOSP_ID);
	}

	/**
	 * Removes the asrim hospitals with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param HOSP_ID the primary key of the asrim hospitals
	 * @return the asrim hospitals that was removed
	 * @throws NoSuchAsrimHospitalsException if a asrim hospitals with the primary key could not be found
	 */
	public static AsrimHospitals remove(String HOSP_ID)
		throws com.kpmg.asrimTables.exception.NoSuchAsrimHospitalsException {

		return getPersistence().remove(HOSP_ID);
	}

	public static AsrimHospitals updateImpl(AsrimHospitals asrimHospitals) {
		return getPersistence().updateImpl(asrimHospitals);
	}

	/**
	 * Returns the asrim hospitals with the primary key or throws a <code>NoSuchAsrimHospitalsException</code> if it could not be found.
	 *
	 * @param HOSP_ID the primary key of the asrim hospitals
	 * @return the asrim hospitals
	 * @throws NoSuchAsrimHospitalsException if a asrim hospitals with the primary key could not be found
	 */
	public static AsrimHospitals findByPrimaryKey(String HOSP_ID)
		throws com.kpmg.asrimTables.exception.NoSuchAsrimHospitalsException {

		return getPersistence().findByPrimaryKey(HOSP_ID);
	}

	/**
	 * Returns the asrim hospitals with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param HOSP_ID the primary key of the asrim hospitals
	 * @return the asrim hospitals, or <code>null</code> if a asrim hospitals with the primary key could not be found
	 */
	public static AsrimHospitals fetchByPrimaryKey(String HOSP_ID) {
		return getPersistence().fetchByPrimaryKey(HOSP_ID);
	}

	/**
	 * Returns all the asrim hospitalses.
	 *
	 * @return the asrim hospitalses
	 */
	public static List<AsrimHospitals> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the asrim hospitalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AsrimHospitalsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim hospitalses
	 * @param end the upper bound of the range of asrim hospitalses (not inclusive)
	 * @return the range of asrim hospitalses
	 */
	public static List<AsrimHospitals> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the asrim hospitalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AsrimHospitalsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim hospitalses
	 * @param end the upper bound of the range of asrim hospitalses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of asrim hospitalses
	 */
	public static List<AsrimHospitals> findAll(
		int start, int end,
		OrderByComparator<AsrimHospitals> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the asrim hospitalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AsrimHospitalsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim hospitalses
	 * @param end the upper bound of the range of asrim hospitalses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of asrim hospitalses
	 */
	public static List<AsrimHospitals> findAll(
		int start, int end, OrderByComparator<AsrimHospitals> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the asrim hospitalses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of asrim hospitalses.
	 *
	 * @return the number of asrim hospitalses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AsrimHospitalsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile AsrimHospitalsPersistence _persistence;

}