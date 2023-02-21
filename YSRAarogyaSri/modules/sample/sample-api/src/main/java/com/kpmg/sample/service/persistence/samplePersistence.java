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

package com.kpmg.sample.service.persistence;

import com.kpmg.sample.exception.NoSuchsampleException;
import com.kpmg.sample.model.sample;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sample service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sampleUtil
 * @generated
 */
@ProviderType
public interface samplePersistence extends BasePersistence<sample> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link sampleUtil} to access the sample persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the sample in the entity cache if it is enabled.
	 *
	 * @param sample the sample
	 */
	public void cacheResult(sample sample);

	/**
	 * Caches the samples in the entity cache if it is enabled.
	 *
	 * @param samples the samples
	 */
	public void cacheResult(java.util.List<sample> samples);

	/**
	 * Creates a new sample with the primary key. Does not add the sample to the database.
	 *
	 * @param id the primary key for the new sample
	 * @return the new sample
	 */
	public sample create(long id);

	/**
	 * Removes the sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the sample
	 * @return the sample that was removed
	 * @throws NoSuchsampleException if a sample with the primary key could not be found
	 */
	public sample remove(long id) throws NoSuchsampleException;

	public sample updateImpl(sample sample);

	/**
	 * Returns the sample with the primary key or throws a <code>NoSuchsampleException</code> if it could not be found.
	 *
	 * @param id the primary key of the sample
	 * @return the sample
	 * @throws NoSuchsampleException if a sample with the primary key could not be found
	 */
	public sample findByPrimaryKey(long id) throws NoSuchsampleException;

	/**
	 * Returns the sample with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the sample
	 * @return the sample, or <code>null</code> if a sample with the primary key could not be found
	 */
	public sample fetchByPrimaryKey(long id);

	/**
	 * Returns all the samples.
	 *
	 * @return the samples
	 */
	public java.util.List<sample> findAll();

	/**
	 * Returns a range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @return the range of samples
	 */
	public java.util.List<sample> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of samples
	 */
	public java.util.List<sample> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<sample>
			orderByComparator);

	/**
	 * Returns an ordered range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of samples
	 */
	public java.util.List<sample> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<sample>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the samples from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of samples.
	 *
	 * @return the number of samples
	 */
	public int countAll();

}