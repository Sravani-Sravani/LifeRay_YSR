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

import com.keyPeopleService.exception.NoSuchDesignationException;
import com.keyPeopleService.model.Designation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the designation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DesignationUtil
 * @generated
 */
@ProviderType
public interface DesignationPersistence extends BasePersistence<Designation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DesignationUtil} to access the designation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the designation in the entity cache if it is enabled.
	 *
	 * @param designation the designation
	 */
	public void cacheResult(Designation designation);

	/**
	 * Caches the designations in the entity cache if it is enabled.
	 *
	 * @param designations the designations
	 */
	public void cacheResult(java.util.List<Designation> designations);

	/**
	 * Creates a new designation with the primary key. Does not add the designation to the database.
	 *
	 * @param did the primary key for the new designation
	 * @return the new designation
	 */
	public Designation create(long did);

	/**
	 * Removes the designation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param did the primary key of the designation
	 * @return the designation that was removed
	 * @throws NoSuchDesignationException if a designation with the primary key could not be found
	 */
	public Designation remove(long did) throws NoSuchDesignationException;

	public Designation updateImpl(Designation designation);

	/**
	 * Returns the designation with the primary key or throws a <code>NoSuchDesignationException</code> if it could not be found.
	 *
	 * @param did the primary key of the designation
	 * @return the designation
	 * @throws NoSuchDesignationException if a designation with the primary key could not be found
	 */
	public Designation findByPrimaryKey(long did)
		throws NoSuchDesignationException;

	/**
	 * Returns the designation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param did the primary key of the designation
	 * @return the designation, or <code>null</code> if a designation with the primary key could not be found
	 */
	public Designation fetchByPrimaryKey(long did);

	/**
	 * Returns all the designations.
	 *
	 * @return the designations
	 */
	public java.util.List<Designation> findAll();

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
	public java.util.List<Designation> findAll(int start, int end);

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
	public java.util.List<Designation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Designation>
			orderByComparator);

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
	public java.util.List<Designation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Designation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the designations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of designations.
	 *
	 * @return the number of designations
	 */
	public int countAll();

}