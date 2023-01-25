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

package com.keyPeopleService.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WingLocalService
 * @generated
 */
public class WingLocalServiceWrapper
	implements ServiceWrapper<WingLocalService>, WingLocalService {

	public WingLocalServiceWrapper() {
		this(null);
	}

	public WingLocalServiceWrapper(WingLocalService wingLocalService) {
		_wingLocalService = wingLocalService;
	}

	/**
	 * Adds the wing to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wing the wing
	 * @return the wing that was added
	 */
	@Override
	public com.keyPeopleService.model.Wing addWing(
		com.keyPeopleService.model.Wing wing) {

		return _wingLocalService.addWing(wing);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wingLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new wing with the primary key. Does not add the wing to the database.
	 *
	 * @param wid the primary key for the new wing
	 * @return the new wing
	 */
	@Override
	public com.keyPeopleService.model.Wing createWing(long wid) {
		return _wingLocalService.createWing(wid);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wingLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the wing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wid the primary key of the wing
	 * @return the wing that was removed
	 * @throws PortalException if a wing with the primary key could not be found
	 */
	@Override
	public com.keyPeopleService.model.Wing deleteWing(long wid)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wingLocalService.deleteWing(wid);
	}

	/**
	 * Deletes the wing from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wing the wing
	 * @return the wing that was removed
	 */
	@Override
	public com.keyPeopleService.model.Wing deleteWing(
		com.keyPeopleService.model.Wing wing) {

		return _wingLocalService.deleteWing(wing);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wingLocalService.dynamicQuery();
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

		return _wingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.keyPeopleService.model.impl.WingModelImpl</code>.
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

		return _wingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.keyPeopleService.model.impl.WingModelImpl</code>.
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

		return _wingLocalService.dynamicQuery(
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

		return _wingLocalService.dynamicQueryCount(dynamicQuery);
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

		return _wingLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.keyPeopleService.model.Wing fetchWing(long wid) {
		return _wingLocalService.fetchWing(wid);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the wing with the primary key.
	 *
	 * @param wid the primary key of the wing
	 * @return the wing
	 * @throws PortalException if a wing with the primary key could not be found
	 */
	@Override
	public com.keyPeopleService.model.Wing getWing(long wid)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wingLocalService.getWing(wid);
	}

	/**
	 * Returns a range of all the wings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.keyPeopleService.model.impl.WingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wings
	 * @param end the upper bound of the range of wings (not inclusive)
	 * @return the range of wings
	 */
	@Override
	public java.util.List<com.keyPeopleService.model.Wing> getWings(
		int start, int end) {

		return _wingLocalService.getWings(start, end);
	}

	/**
	 * Returns the number of wings.
	 *
	 * @return the number of wings
	 */
	@Override
	public int getWingsCount() {
		return _wingLocalService.getWingsCount();
	}

	/**
	 * Updates the wing in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wing the wing
	 * @return the wing that was updated
	 */
	@Override
	public com.keyPeopleService.model.Wing updateWing(
		com.keyPeopleService.model.Wing wing) {

		return _wingLocalService.updateWing(wing);
	}

	@Override
	public WingLocalService getWrappedService() {
		return _wingLocalService;
	}

	@Override
	public void setWrappedService(WingLocalService wingLocalService) {
		_wingLocalService = wingLocalService;
	}

	private WingLocalService _wingLocalService;

}