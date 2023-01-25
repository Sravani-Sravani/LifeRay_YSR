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

import com.keyPeopleService.model.Wing;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wing service. This utility wraps <code>com.keyPeopleService.service.persistence.impl.WingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WingPersistence
 * @generated
 */
public class WingUtil {

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
	public static void clearCache(Wing wing) {
		getPersistence().clearCache(wing);
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
	public static Map<Serializable, Wing> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Wing> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Wing> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Wing> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Wing> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Wing update(Wing wing) {
		return getPersistence().update(wing);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Wing update(Wing wing, ServiceContext serviceContext) {
		return getPersistence().update(wing, serviceContext);
	}

	/**
	 * Caches the wing in the entity cache if it is enabled.
	 *
	 * @param wing the wing
	 */
	public static void cacheResult(Wing wing) {
		getPersistence().cacheResult(wing);
	}

	/**
	 * Caches the wings in the entity cache if it is enabled.
	 *
	 * @param wings the wings
	 */
	public static void cacheResult(List<Wing> wings) {
		getPersistence().cacheResult(wings);
	}

	/**
	 * Creates a new wing with the primary key. Does not add the wing to the database.
	 *
	 * @param wid the primary key for the new wing
	 * @return the new wing
	 */
	public static Wing create(long wid) {
		return getPersistence().create(wid);
	}

	/**
	 * Removes the wing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wid the primary key of the wing
	 * @return the wing that was removed
	 * @throws NoSuchWingException if a wing with the primary key could not be found
	 */
	public static Wing remove(long wid)
		throws com.keyPeopleService.exception.NoSuchWingException {

		return getPersistence().remove(wid);
	}

	public static Wing updateImpl(Wing wing) {
		return getPersistence().updateImpl(wing);
	}

	/**
	 * Returns the wing with the primary key or throws a <code>NoSuchWingException</code> if it could not be found.
	 *
	 * @param wid the primary key of the wing
	 * @return the wing
	 * @throws NoSuchWingException if a wing with the primary key could not be found
	 */
	public static Wing findByPrimaryKey(long wid)
		throws com.keyPeopleService.exception.NoSuchWingException {

		return getPersistence().findByPrimaryKey(wid);
	}

	/**
	 * Returns the wing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wid the primary key of the wing
	 * @return the wing, or <code>null</code> if a wing with the primary key could not be found
	 */
	public static Wing fetchByPrimaryKey(long wid) {
		return getPersistence().fetchByPrimaryKey(wid);
	}

	/**
	 * Returns all the wings.
	 *
	 * @return the wings
	 */
	public static List<Wing> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wings
	 * @param end the upper bound of the range of wings (not inclusive)
	 * @return the range of wings
	 */
	public static List<Wing> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wings
	 * @param end the upper bound of the range of wings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wings
	 */
	public static List<Wing> findAll(
		int start, int end, OrderByComparator<Wing> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wings
	 * @param end the upper bound of the range of wings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wings
	 */
	public static List<Wing> findAll(
		int start, int end, OrderByComparator<Wing> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wings.
	 *
	 * @return the number of wings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WingPersistence getPersistence() {
		return _persistence;
	}

	private static volatile WingPersistence _persistence;

}