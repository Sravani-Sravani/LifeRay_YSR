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
 * Provides a wrapper for {@link AsrimHospitalsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AsrimHospitalsLocalService
 * @generated
 */
public class AsrimHospitalsLocalServiceWrapper
	implements AsrimHospitalsLocalService,
			   ServiceWrapper<AsrimHospitalsLocalService> {

	public AsrimHospitalsLocalServiceWrapper() {
		this(null);
	}

	public AsrimHospitalsLocalServiceWrapper(
		AsrimHospitalsLocalService asrimHospitalsLocalService) {

		_asrimHospitalsLocalService = asrimHospitalsLocalService;
	}

	/**
	 * Adds the asrim hospitals to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AsrimHospitalsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asrimHospitals the asrim hospitals
	 * @return the asrim hospitals that was added
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimHospitals addAsrimHospitals(
		com.kpmg.asrimTables.model.AsrimHospitals asrimHospitals) {

		return _asrimHospitalsLocalService.addAsrimHospitals(asrimHospitals);
	}

	/**
	 * Creates a new asrim hospitals with the primary key. Does not add the asrim hospitals to the database.
	 *
	 * @param HOSP_ID the primary key for the new asrim hospitals
	 * @return the new asrim hospitals
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimHospitals createAsrimHospitals(
		String HOSP_ID) {

		return _asrimHospitalsLocalService.createAsrimHospitals(HOSP_ID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimHospitalsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the asrim hospitals from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AsrimHospitalsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asrimHospitals the asrim hospitals
	 * @return the asrim hospitals that was removed
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimHospitals deleteAsrimHospitals(
		com.kpmg.asrimTables.model.AsrimHospitals asrimHospitals) {

		return _asrimHospitalsLocalService.deleteAsrimHospitals(asrimHospitals);
	}

	/**
	 * Deletes the asrim hospitals with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AsrimHospitalsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param HOSP_ID the primary key of the asrim hospitals
	 * @return the asrim hospitals that was removed
	 * @throws PortalException if a asrim hospitals with the primary key could not be found
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimHospitals deleteAsrimHospitals(
			String HOSP_ID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimHospitalsLocalService.deleteAsrimHospitals(HOSP_ID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimHospitalsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _asrimHospitalsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _asrimHospitalsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _asrimHospitalsLocalService.dynamicQuery();
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

		return _asrimHospitalsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.kpmg.asrimTables.model.impl.AsrimHospitalsModelImpl</code>.
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

		return _asrimHospitalsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.kpmg.asrimTables.model.impl.AsrimHospitalsModelImpl</code>.
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

		return _asrimHospitalsLocalService.dynamicQuery(
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

		return _asrimHospitalsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _asrimHospitalsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.kpmg.asrimTables.model.AsrimHospitals fetchAsrimHospitals(
		String HOSP_ID) {

		return _asrimHospitalsLocalService.fetchAsrimHospitals(HOSP_ID);
	}

	/**
	 * Returns the asrim hospitals with the primary key.
	 *
	 * @param HOSP_ID the primary key of the asrim hospitals
	 * @return the asrim hospitals
	 * @throws PortalException if a asrim hospitals with the primary key could not be found
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimHospitals getAsrimHospitals(
			String HOSP_ID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimHospitalsLocalService.getAsrimHospitals(HOSP_ID);
	}

	/**
	 * Returns a range of all the asrim hospitalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.kpmg.asrimTables.model.impl.AsrimHospitalsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim hospitalses
	 * @param end the upper bound of the range of asrim hospitalses (not inclusive)
	 * @return the range of asrim hospitalses
	 */
	@Override
	public java.util.List<com.kpmg.asrimTables.model.AsrimHospitals>
		getAsrimHospitalses(int start, int end) {

		return _asrimHospitalsLocalService.getAsrimHospitalses(start, end);
	}

	/**
	 * Returns the number of asrim hospitalses.
	 *
	 * @return the number of asrim hospitalses
	 */
	@Override
	public int getAsrimHospitalsesCount() {
		return _asrimHospitalsLocalService.getAsrimHospitalsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _asrimHospitalsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _asrimHospitalsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the asrim hospitals in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AsrimHospitalsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asrimHospitals the asrim hospitals
	 * @return the asrim hospitals that was updated
	 */
	@Override
	public com.kpmg.asrimTables.model.AsrimHospitals updateAsrimHospitals(
		com.kpmg.asrimTables.model.AsrimHospitals asrimHospitals) {

		return _asrimHospitalsLocalService.updateAsrimHospitals(asrimHospitals);
	}

	@Override
	public AsrimHospitalsLocalService getWrappedService() {
		return _asrimHospitalsLocalService;
	}

	@Override
	public void setWrappedService(
		AsrimHospitalsLocalService asrimHospitalsLocalService) {

		_asrimHospitalsLocalService = asrimHospitalsLocalService;
	}

	private AsrimHospitalsLocalService _asrimHospitalsLocalService;

}