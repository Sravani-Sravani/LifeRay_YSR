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
 * Provides a wrapper for {@link KeyPeopleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see KeyPeopleLocalService
 * @generated
 */
public class KeyPeopleLocalServiceWrapper
	implements KeyPeopleLocalService, ServiceWrapper<KeyPeopleLocalService> {

	public KeyPeopleLocalServiceWrapper() {
		this(null);
	}

	public KeyPeopleLocalServiceWrapper(
		KeyPeopleLocalService keyPeopleLocalService) {

		_keyPeopleLocalService = keyPeopleLocalService;
	}

	/**
	 * Adds the key people to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KeyPeopleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param keyPeople the key people
	 * @return the key people that was added
	 */
	@Override
	public com.keyPeopleService.model.KeyPeople addKeyPeople(
		com.keyPeopleService.model.KeyPeople keyPeople) {

		return _keyPeopleLocalService.addKeyPeople(keyPeople);
	}

	/**
	 * Creates a new key people with the primary key. Does not add the key people to the database.
	 *
	 * @param trust_userId the primary key for the new key people
	 * @return the new key people
	 */
	@Override
	public com.keyPeopleService.model.KeyPeople createKeyPeople(
		long trust_userId) {

		return _keyPeopleLocalService.createKeyPeople(trust_userId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _keyPeopleLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the key people from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KeyPeopleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param keyPeople the key people
	 * @return the key people that was removed
	 */
	@Override
	public com.keyPeopleService.model.KeyPeople deleteKeyPeople(
		com.keyPeopleService.model.KeyPeople keyPeople) {

		return _keyPeopleLocalService.deleteKeyPeople(keyPeople);
	}

	/**
	 * Deletes the key people with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KeyPeopleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people that was removed
	 * @throws PortalException if a key people with the primary key could not be found
	 */
	@Override
	public com.keyPeopleService.model.KeyPeople deleteKeyPeople(
			long trust_userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _keyPeopleLocalService.deleteKeyPeople(trust_userId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _keyPeopleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _keyPeopleLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _keyPeopleLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _keyPeopleLocalService.dynamicQuery();
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

		return _keyPeopleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.keyPeopleService.model.impl.KeyPeopleModelImpl</code>.
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

		return _keyPeopleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.keyPeopleService.model.impl.KeyPeopleModelImpl</code>.
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

		return _keyPeopleLocalService.dynamicQuery(
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

		return _keyPeopleLocalService.dynamicQueryCount(dynamicQuery);
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

		return _keyPeopleLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.keyPeopleService.model.KeyPeople fetchKeyPeople(
		long trust_userId) {

		return _keyPeopleLocalService.fetchKeyPeople(trust_userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _keyPeopleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _keyPeopleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the key people with the primary key.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people
	 * @throws PortalException if a key people with the primary key could not be found
	 */
	@Override
	public com.keyPeopleService.model.KeyPeople getKeyPeople(long trust_userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _keyPeopleLocalService.getKeyPeople(trust_userId);
	}

	/**
	 * Returns a range of all the key peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.keyPeopleService.model.impl.KeyPeopleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of key peoples
	 * @param end the upper bound of the range of key peoples (not inclusive)
	 * @return the range of key peoples
	 */
	@Override
	public java.util.List<com.keyPeopleService.model.KeyPeople> getKeyPeoples(
		int start, int end) {

		return _keyPeopleLocalService.getKeyPeoples(start, end);
	}

	/**
	 * Returns the number of key peoples.
	 *
	 * @return the number of key peoples
	 */
	@Override
	public int getKeyPeoplesCount() {
		return _keyPeopleLocalService.getKeyPeoplesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _keyPeopleLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _keyPeopleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the key people in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KeyPeopleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param keyPeople the key people
	 * @return the key people that was updated
	 */
	@Override
	public com.keyPeopleService.model.KeyPeople updateKeyPeople(
		com.keyPeopleService.model.KeyPeople keyPeople) {

		return _keyPeopleLocalService.updateKeyPeople(keyPeople);
	}

	@Override
	public KeyPeopleLocalService getWrappedService() {
		return _keyPeopleLocalService;
	}

	@Override
	public void setWrappedService(KeyPeopleLocalService keyPeopleLocalService) {
		_keyPeopleLocalService = keyPeopleLocalService;
	}

	private KeyPeopleLocalService _keyPeopleLocalService;

}