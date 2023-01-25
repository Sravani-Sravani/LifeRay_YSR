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

package com.keyPeopleService.service.persistence;

import com.keyPeopleService.model.Designation;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the designation service. This utility wraps <code>com.keyPeopleService.service.persistence.impl.DesignationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DesignationPersistence
 * @generated
 */
public class DesignationUtil {

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
	public static void clearCache(Designation designation) {
		getPersistence().clearCache(designation);
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
	public static Map<Serializable, Designation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Designation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Designation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Designation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Designation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Designation update(Designation designation) {
		return getPersistence().update(designation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Designation update(
		Designation designation, ServiceContext serviceContext) {

		return getPersistence().update(designation, serviceContext);
	}

	/**
	 * Caches the designation in the entity cache if it is enabled.
	 *
	 * @param designation the designation
	 */
	public static void cacheResult(Designation designation) {
		getPersistence().cacheResult(designation);
	}

	/**
	 * Caches the designations in the entity cache if it is enabled.
	 *
	 * @param designations the designations
	 */
	public static void cacheResult(List<Designation> designations) {
		getPersistence().cacheResult(designations);
	}

	/**
	 * Creates a new designation with the primary key. Does not add the designation to the database.
	 *
	 * @param did the primary key for the new designation
	 * @return the new designation
	 */
	public static Designation create(long did) {
		return getPersistence().create(did);
	}

	/**
	 * Removes the designation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param did the primary key of the designation
	 * @return the designation that was removed
	 * @throws NoSuchDesignationException if a designation with the primary key could not be found
	 */
	public static Designation remove(long did)
		throws com.keyPeopleService.exception.NoSuchDesignationException {

		return getPersistence().remove(did);
	}

	public static Designation updateImpl(Designation designation) {
		return getPersistence().updateImpl(designation);
	}

	/**
	 * Returns the designation with the primary key or throws a <code>NoSuchDesignationException</code> if it could not be found.
	 *
	 * @param did the primary key of the designation
	 * @return the designation
	 * @throws NoSuchDesignationException if a designation with the primary key could not be found
	 */
	public static Designation findByPrimaryKey(long did)
		throws com.keyPeopleService.exception.NoSuchDesignationException {

		return getPersistence().findByPrimaryKey(did);
	}

	/**
	 * Returns the designation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param did the primary key of the designation
	 * @return the designation, or <code>null</code> if a designation with the primary key could not be found
	 */
	public static Designation fetchByPrimaryKey(long did) {
		return getPersistence().fetchByPrimaryKey(did);
	}

	/**
	 * Returns all the designations.
	 *
	 * @return the designations
	 */
	public static List<Designation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the designations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of designations
	 * @param end the upper bound of the range of designations (not inclusive)
	 * @return the range of designations
	 */
	public static List<Designation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the designations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of designations
	 * @param end the upper bound of the range of designations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of designations
	 */
	public static List<Designation> findAll(
		int start, int end, OrderByComparator<Designation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the designations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of designations
	 * @param end the upper bound of the range of designations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of designations
	 */
	public static List<Designation> findAll(
		int start, int end, OrderByComparator<Designation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the designations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of designations.
	 *
	 * @return the number of designations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DesignationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile DesignationPersistence _persistence;

}