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

import com.kpmg.asrimTables.exception.NoSuchAsrimLocationsException;
import com.kpmg.asrimTables.model.AsrimLocations;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the asrim locations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AsrimLocationsUtil
 * @generated
 */
@ProviderType
public interface AsrimLocationsPersistence
	extends BasePersistence<AsrimLocations> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AsrimLocationsUtil} to access the asrim locations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the asrim locations in the entity cache if it is enabled.
	 *
	 * @param asrimLocations the asrim locations
	 */
	public void cacheResult(AsrimLocations asrimLocations);

	/**
	 * Caches the asrim locationses in the entity cache if it is enabled.
	 *
	 * @param asrimLocationses the asrim locationses
	 */
	public void cacheResult(java.util.List<AsrimLocations> asrimLocationses);

	/**
	 * Creates a new asrim locations with the primary key. Does not add the asrim locations to the database.
	 *
	 * @param LOC_ID the primary key for the new asrim locations
	 * @return the new asrim locations
	 */
	public AsrimLocations create(String LOC_ID);

	/**
	 * Removes the asrim locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations that was removed
	 * @throws NoSuchAsrimLocationsException if a asrim locations with the primary key could not be found
	 */
	public AsrimLocations remove(String LOC_ID)
		throws NoSuchAsrimLocationsException;

	public AsrimLocations updateImpl(AsrimLocations asrimLocations);

	/**
	 * Returns the asrim locations with the primary key or throws a <code>NoSuchAsrimLocationsException</code> if it could not be found.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations
	 * @throws NoSuchAsrimLocationsException if a asrim locations with the primary key could not be found
	 */
	public AsrimLocations findByPrimaryKey(String LOC_ID)
		throws NoSuchAsrimLocationsException;

	/**
	 * Returns the asrim locations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations, or <code>null</code> if a asrim locations with the primary key could not be found
	 */
	public AsrimLocations fetchByPrimaryKey(String LOC_ID);

	/**
	 * Returns all the asrim locationses.
	 *
	 * @return the asrim locationses
	 */
	public java.util.List<AsrimLocations> findAll();

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
	public java.util.List<AsrimLocations> findAll(int start, int end);

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
	public java.util.List<AsrimLocations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AsrimLocations>
			orderByComparator);

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
	public java.util.List<AsrimLocations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AsrimLocations>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the asrim locationses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of asrim locationses.
	 *
	 * @return the number of asrim locationses
	 */
	public int countAll();

}