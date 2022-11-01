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

package com.kpmg.asrimTables.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AsrimLocationsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AsrimLocationsLocalService
 * @generated
 */
public class AsrimLocationsLocalServiceWrapper
	implements AsrimLocationsLocalService,
			   ServiceWrapper<AsrimLocationsLocalService> {

	public AsrimLocationsLocalServiceWrapper() {
		this(null);
	}

	public AsrimLocationsLocalServiceWrapper(
		AsrimLocationsLocalService asrimLocationsLocalService) {

		_asrimLocationsLocalService = asrimLocationsLocalService;
	}

	/**
	 * Adds the asrim locations to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AsrimLocationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asrimLocations the asrim locations
	 * @return the asrim locations that was added
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimLocations addAsrimLocations(
		com.kpmg.asrimTables.model.AsrimLocations asrimLocations) {

		return _asrimLocationsLocalService.addAsrimLocations(asrimLocations);
	}

	/**
	 * Creates a new asrim locations with the primary key. Does not add the asrim locations to the database.
	 *
	 * @param LOC_ID the primary key for the new asrim locations
	 * @return the new asrim locations
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimLocations createAsrimLocations(
		String LOC_ID) {

		return _asrimLocationsLocalService.createAsrimLocations(LOC_ID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimLocationsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the asrim locations from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AsrimLocationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asrimLocations the asrim locations
	 * @return the asrim locations that was removed
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimLocations deleteAsrimLocations(
		com.kpmg.asrimTables.model.AsrimLocations asrimLocations) {

		return _asrimLocationsLocalService.deleteAsrimLocations(asrimLocations);
	}

	/**
	 * Deletes the asrim locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AsrimLocationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations that was removed
	 * @throws PortalException if a asrim locations with the primary key could not be found
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimLocations deleteAsrimLocations(
			String LOC_ID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimLocationsLocalService.deleteAsrimLocations(LOC_ID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimLocationsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _asrimLocationsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _asrimLocationsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _asrimLocationsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _asrimLocationsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.kpmg.asrimTables.model.impl.AsrimLocationsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _asrimLocationsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.kpmg.asrimTables.model.impl.AsrimLocationsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _asrimLocationsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _asrimLocationsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _asrimLocationsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.kpmg.asrimTables.model.AsrimLocations fetchAsrimLocations(
		String LOC_ID) {

		return _asrimLocationsLocalService.fetchAsrimLocations(LOC_ID);
	}

	/**
	 * Returns the asrim locations with the primary key.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations
	 * @throws PortalException if a asrim locations with the primary key could not be found
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimLocations getAsrimLocations(
			String LOC_ID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimLocationsLocalService.getAsrimLocations(LOC_ID);
	}

	/**
	 * Returns a range of all the asrim locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.kpmg.asrimTables.model.impl.AsrimLocationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim locationses
	 * @param end the upper bound of the range of asrim locationses (not inclusive)
	 * @return the range of asrim locationses
	 */
	@Override
	public java.util.List<com.kpmg.asrimTables.model.AsrimLocations>
		getAsrimLocationses(int start, int end) {

		return _asrimLocationsLocalService.getAsrimLocationses(start, end);
	}

	/**
	 * Returns the number of asrim locationses.
	 *
	 * @return the number of asrim locationses
	 */
	@Override
	public int getAsrimLocationsesCount() {
		return _asrimLocationsLocalService.getAsrimLocationsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _asrimLocationsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimLocationsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the asrim locations in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AsrimLocationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asrimLocations the asrim locations
	 * @return the asrim locations that was updated
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimLocations updateAsrimLocations(
		com.kpmg.asrimTables.model.AsrimLocations asrimLocations) {

		return _asrimLocationsLocalService.updateAsrimLocations(asrimLocations);
	}

	@Override
	public AsrimLocationsLocalService getWrappedService() {
		return _asrimLocationsLocalService;
	}

	@Override
	public void setWrappedService(
		AsrimLocationsLocalService asrimLocationsLocalService) {

		_asrimLocationsLocalService = asrimLocationsLocalService;
	}

	private AsrimLocationsLocalService _asrimLocationsLocalService;

}