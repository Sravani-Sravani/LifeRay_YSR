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

import com.kpmg.asrimTables.model.AsrimLocations;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the asrim locations service. This utility wraps <code>com.kpmg.asrimTables.service.persistence.impl.AsrimLocationsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AsrimLocationsPersistence
 * @generated
 */
public class AsrimLocationsUtil {

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
	public static void clearCache(AsrimLocations asrimLocations) {
		getPersistence().clearCache(asrimLocations);
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
	public static Map<Serializable, AsrimLocations> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AsrimLocations> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AsrimLocations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AsrimLocations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AsrimLocations> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AsrimLocations update(AsrimLocations asrimLocations) {
		return getPersistence().update(asrimLocations);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AsrimLocations update(
		AsrimLocations asrimLocations, ServiceContext serviceContext) {

		return getPersistence().update(asrimLocations, serviceContext);
	}

	/**
	 * Caches the asrim locations in the entity cache if it is enabled.
	 *
	 * @param asrimLocations the asrim locations
	 */
	public static void cacheResult(AsrimLocations asrimLocations) {
		getPersistence().cacheResult(asrimLocations);
	}

	/**
	 * Caches the asrim locationses in the entity cache if it is enabled.
	 *
	 * @param asrimLocationses the asrim locationses
	 */
	public static void cacheResult(List<AsrimLocations> asrimLocationses) {
		getPersistence().cacheResult(asrimLocationses);
	}

	/**
	 * Creates a new asrim locations with the primary key. Does not add the asrim locations to the database.
	 *
	 * @param LOC_ID the primary key for the new asrim locations
	 * @return the new asrim locations
	 */
	public static AsrimLocations create(String LOC_ID) {
		return getPersistence().create(LOC_ID);
	}

	/**
	 * Removes the asrim locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations that was removed
	 * @throws NoSuchAsrimLocationsException if a asrim locations with the primary key could not be found
	 */
	public static AsrimLocations remove(String LOC_ID)
		throws com.kpmg.asrimTables.exception.NoSuchAsrimLocationsException {

		return getPersistence().remove(LOC_ID);
	}

	public static AsrimLocations updateImpl(AsrimLocations asrimLocations) {
		return getPersistence().updateImpl(asrimLocations);
	}

	/**
	 * Returns the asrim locations with the primary key or throws a <code>NoSuchAsrimLocationsException</code> if it could not be found.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations
	 * @throws NoSuchAsrimLocationsException if a asrim locations with the primary key could not be found
	 */
	public static AsrimLocations findByPrimaryKey(String LOC_ID)
		throws com.kpmg.asrimTables.exception.NoSuchAsrimLocationsException {

		return getPersistence().findByPrimaryKey(LOC_ID);
	}

	/**
	 * Returns the asrim locations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations, or <code>null</code> if a asrim locations with the primary key could not be found
	 */
	public static AsrimLocations fetchByPrimaryKey(String LOC_ID) {
		return getPersistence().fetchByPrimaryKey(LOC_ID);
	}

	/**
	 * Returns all the asrim locationses.
	 *
	 * @return the asrim locationses
	 */
	public static List<AsrimLocations> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the asrim locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AsrimLocationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim locationses
	 * @param end the upper bound of the range of asrim locationses (not inclusive)
	 * @return the range of asrim locationses
	 */
	public static List<AsrimLocations> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the asrim locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AsrimLocationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim locationses
	 * @param end the upper bound of the range of asrim locationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of asrim locationses
	 */
	public static List<AsrimLocations> findAll(
		int start, int end,
		OrderByComparator<AsrimLocations> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the asrim locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AsrimLocationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim locationses
	 * @param end the upper bound of the range of asrim locationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of asrim locationses
	 */
	public static List<AsrimLocations> findAll(
		int start, int end, OrderByComparator<AsrimLocations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the asrim locationses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of asrim locationses.
	 *
	 * @return the number of asrim locationses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AsrimLocationsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile AsrimLocationsPersistence _persistence;

}