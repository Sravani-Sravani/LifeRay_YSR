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

import com.keyPeopleService.model.KeyPeople;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the key people service. This utility wraps <code>com.keyPeopleService.service.persistence.impl.KeyPeoplePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KeyPeoplePersistence
 * @generated
 */
public class KeyPeopleUtil {

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
	public static void clearCache(KeyPeople keyPeople) {
		getPersistence().clearCache(keyPeople);
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
	public static Map<Serializable, KeyPeople> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<KeyPeople> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KeyPeople> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KeyPeople> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<KeyPeople> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static KeyPeople update(KeyPeople keyPeople) {
		return getPersistence().update(keyPeople);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static KeyPeople update(
		KeyPeople keyPeople, ServiceContext serviceContext) {

		return getPersistence().update(keyPeople, serviceContext);
	}

	/**
	 * Caches the key people in the entity cache if it is enabled.
	 *
	 * @param keyPeople the key people
	 */
	public static void cacheResult(KeyPeople keyPeople) {
		getPersistence().cacheResult(keyPeople);
	}

	/**
	 * Caches the key peoples in the entity cache if it is enabled.
	 *
	 * @param keyPeoples the key peoples
	 */
	public static void cacheResult(List<KeyPeople> keyPeoples) {
		getPersistence().cacheResult(keyPeoples);
	}

	/**
	 * Creates a new key people with the primary key. Does not add the key people to the database.
	 *
	 * @param trust_userId the primary key for the new key people
	 * @return the new key people
	 */
	public static KeyPeople create(long trust_userId) {
		return getPersistence().create(trust_userId);
	}

	/**
	 * Removes the key people with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people that was removed
	 * @throws NoSuchKeyPeopleException if a key people with the primary key could not be found
	 */
	public static KeyPeople remove(long trust_userId)
		throws com.keyPeopleService.exception.NoSuchKeyPeopleException {

		return getPersistence().remove(trust_userId);
	}

	public static KeyPeople updateImpl(KeyPeople keyPeople) {
		return getPersistence().updateImpl(keyPeople);
	}

	/**
	 * Returns the key people with the primary key or throws a <code>NoSuchKeyPeopleException</code> if it could not be found.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people
	 * @throws NoSuchKeyPeopleException if a key people with the primary key could not be found
	 */
	public static KeyPeople findByPrimaryKey(long trust_userId)
		throws com.keyPeopleService.exception.NoSuchKeyPeopleException {

		return getPersistence().findByPrimaryKey(trust_userId);
	}

	/**
	 * Returns the key people with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people, or <code>null</code> if a key people with the primary key could not be found
	 */
	public static KeyPeople fetchByPrimaryKey(long trust_userId) {
		return getPersistence().fetchByPrimaryKey(trust_userId);
	}

	/**
	 * Returns all the key peoples.
	 *
	 * @return the key peoples
	 */
	public static List<KeyPeople> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the key peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KeyPeopleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of key peoples
	 * @param end the upper bound of the range of key peoples (not inclusive)
	 * @return the range of key peoples
	 */
	public static List<KeyPeople> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the key peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KeyPeopleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of key peoples
	 * @param end the upper bound of the range of key peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of key peoples
	 */
	public static List<KeyPeople> findAll(
		int start, int end, OrderByComparator<KeyPeople> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the key peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KeyPeopleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of key peoples
	 * @param end the upper bound of the range of key peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of key peoples
	 */
	public static List<KeyPeople> findAll(
		int start, int end, OrderByComparator<KeyPeople> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the key peoples from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of key peoples.
	 *
	 * @return the number of key peoples
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static KeyPeoplePersistence getPersistence() {
		return _persistence;
	}

	private static volatile KeyPeoplePersistence _persistence;

}