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
 * Provides a wrapper for {@link DesignationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DesignationLocalService
 * @generated
 */
public class DesignationLocalServiceWrapper
	implements DesignationLocalService,
			   ServiceWrapper<DesignationLocalService> {

	public DesignationLocalServiceWrapper() {
		this(null);
	}

	public DesignationLocalServiceWrapper(
		DesignationLocalService designationLocalService) {

		_designationLocalService = designationLocalService;
	}

	/**
	 * Adds the designation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DesignationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param designation the designation
	 * @return the designation that was added
	 */
	@Override
	public com.keyPeopleService.model.Designation addDesignation(
		com.keyPeopleService.model.Designation designation) {

		return _designationLocalService.addDesignation(designation);
	}

	/**
	 * Creates a new designation with the primary key. Does not add the designation to the database.
	 *
	 * @param did the primary key for the new designation
	 * @return the new designation
	 */
	@Override
	public com.keyPeopleService.model.Designation createDesignation(long did) {
		return _designationLocalService.createDesignation(did);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the designation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DesignationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param designation the designation
	 * @return the designation that was removed
	 */
	@Override
	public com.keyPeopleService.model.Designation deleteDesignation(
		com.keyPeopleService.model.Designation designation) {

		return _designationLocalService.deleteDesignation(designation);
	}

	/**
	 * Deletes the designation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DesignationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param did the primary key of the designation
	 * @return the designation that was removed
	 * @throws PortalException if a designation with the primary key could not be found
	 */
	@Override
	public com.keyPeopleService.model.Designation deleteDesignation(long did)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationLocalService.deleteDesignation(did);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _designationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _designationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _designationLocalService.dynamicQuery();
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

		return _designationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.keyPeopleService.model.impl.DesignationModelImpl</code>.
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

		return _designationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.keyPeopleService.model.impl.DesignationModelImpl</code>.
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

		return _designationLocalService.dynamicQuery(
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

		return _designationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _designationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.keyPeopleService.model.Designation fetchDesignation(long did) {
		return _designationLocalService.fetchDesignation(did);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _designationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the designation with the primary key.
	 *
	 * @param did the primary key of the designation
	 * @return the designation
	 * @throws PortalException if a designation with the primary key could not be found
	 */
	@Override
	public com.keyPeopleService.model.Designation getDesignation(long did)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationLocalService.getDesignation(did);
	}

	/**
	 * Returns a range of all the designations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.keyPeopleService.model.impl.DesignationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of designations
	 * @param end the upper bound of the range of designations (not inclusive)
	 * @return the range of designations
	 */
	@Override
	public java.util.List<com.keyPeopleService.model.Designation>
		getDesignations(int start, int end) {

		return _designationLocalService.getDesignations(start, end);
	}

	/**
	 * Returns the number of designations.
	 *
	 * @return the number of designations
	 */
	@Override
	public int getDesignationsCount() {
		return _designationLocalService.getDesignationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _designationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _designationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the designation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DesignationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param designation the designation
	 * @return the designation that was updated
	 */
	@Override
	public com.keyPeopleService.model.Designation updateDesignation(
		com.keyPeopleService.model.Designation designation) {

		return _designationLocalService.updateDesignation(designation);
	}

	@Override
	public DesignationLocalService getWrappedService() {
		return _designationLocalService;
	}

	@Override
	public void setWrappedService(
		DesignationLocalService designationLocalService) {

		_designationLocalService = designationLocalService;
	}

	private DesignationLocalService _designationLocalService;

}