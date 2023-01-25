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

import com.keyPeopleService.exception.NoSuchKeyPeopleException;
import com.keyPeopleService.model.KeyPeople;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the key people service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KeyPeopleUtil
 * @generated
 */
@ProviderType
public interface KeyPeoplePersistence extends BasePersistence<KeyPeople> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KeyPeopleUtil} to access the key people persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the key people in the entity cache if it is enabled.
	 *
	 * @param keyPeople the key people
	 */
	public void cacheResult(KeyPeople keyPeople);

	/**
	 * Caches the key peoples in the entity cache if it is enabled.
	 *
	 * @param keyPeoples the key peoples
	 */
	public void cacheResult(java.util.List<KeyPeople> keyPeoples);

	/**
	 * Creates a new key people with the primary key. Does not add the key people to the database.
	 *
	 * @param trust_userId the primary key for the new key people
	 * @return the new key people
	 */
	public KeyPeople create(long trust_userId);

	/**
	 * Removes the key people with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people that was removed
	 * @throws NoSuchKeyPeopleException if a key people with the primary key could not be found
	 */
	public KeyPeople remove(long trust_userId) throws NoSuchKeyPeopleException;

	public KeyPeople updateImpl(KeyPeople keyPeople);

	/**
	 * Returns the key people with the primary key or throws a <code>NoSuchKeyPeopleException</code> if it could not be found.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people
	 * @throws NoSuchKeyPeopleException if a key people with the primary key could not be found
	 */
	public KeyPeople findByPrimaryKey(long trust_userId)
		throws NoSuchKeyPeopleException;

	/**
	 * Returns the key people with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people, or <code>null</code> if a key people with the primary key could not be found
	 */
	public KeyPeople fetchByPrimaryKey(long trust_userId);

	/**
	 * Returns all the key peoples.
	 *
	 * @return the key peoples
	 */
	public java.util.List<KeyPeople> findAll();

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
	public java.util.List<KeyPeople> findAll(int start, int end);

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
	public java.util.List<KeyPeople> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KeyPeople>
			orderByComparator);

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
	public java.util.List<KeyPeople> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KeyPeople>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the key peoples from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of key peoples.
	 *
	 * @return the number of key peoples
	 */
	public int countAll();

}