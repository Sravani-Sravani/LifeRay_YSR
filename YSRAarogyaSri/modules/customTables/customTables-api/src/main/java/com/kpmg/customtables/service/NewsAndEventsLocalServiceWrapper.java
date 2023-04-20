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

package com.kpmg.customtables.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewsAndEventsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndEventsLocalService
 * @generated
 */
public class NewsAndEventsLocalServiceWrapper
	implements NewsAndEventsLocalService,
			   ServiceWrapper<NewsAndEventsLocalService> {

	public NewsAndEventsLocalServiceWrapper() {
		this(null);
	}

	public NewsAndEventsLocalServiceWrapper(
		NewsAndEventsLocalService newsAndEventsLocalService) {

		_newsAndEventsLocalService = newsAndEventsLocalService;
	}

	/**
	 * Adds the news and events to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NewsAndEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param newsAndEvents the news and events
	 * @return the news and events that was added
	 */
	@Override
	public com.kpmg.customtables.model.NewsAndEvents addNewsAndEvents(
		com.kpmg.customtables.model.NewsAndEvents newsAndEvents) {

		return _newsAndEventsLocalService.addNewsAndEvents(newsAndEvents);
	}

	/**
	 * Creates a new news and events with the primary key. Does not add the news and events to the database.
	 *
	 * @param newsId the primary key for the new news and events
	 * @return the new news and events
	 */
	@Override
	public com.kpmg.customtables.model.NewsAndEvents createNewsAndEvents(
		long newsId) {

		return _newsAndEventsLocalService.createNewsAndEvents(newsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsAndEventsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the news and events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NewsAndEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events that was removed
	 * @throws PortalException if a news and events with the primary key could not be found
	 */
	@Override
	public com.kpmg.customtables.model.NewsAndEvents deleteNewsAndEvents(
			long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsAndEventsLocalService.deleteNewsAndEvents(newsId);
	}

	/**
	 * Deletes the news and events from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NewsAndEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param newsAndEvents the news and events
	 * @return the news and events that was removed
	 */
	@Override
	public com.kpmg.customtables.model.NewsAndEvents deleteNewsAndEvents(
		com.kpmg.customtables.model.NewsAndEvents newsAndEvents) {

		return _newsAndEventsLocalService.deleteNewsAndEvents(newsAndEvents);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsAndEventsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _newsAndEventsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _newsAndEventsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newsAndEventsLocalService.dynamicQuery();
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

		return _newsAndEventsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.kpmg.customtables.model.impl.NewsAndEventsModelImpl</code>.
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

		return _newsAndEventsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.kpmg.customtables.model.impl.NewsAndEventsModelImpl</code>.
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

		return _newsAndEventsLocalService.dynamicQuery(
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

		return _newsAndEventsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _newsAndEventsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.kpmg.customtables.model.NewsAndEvents fetchNewsAndEvents(
		long newsId) {

		return _newsAndEventsLocalService.fetchNewsAndEvents(newsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _newsAndEventsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _newsAndEventsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the news and events with the primary key.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events
	 * @throws PortalException if a news and events with the primary key could not be found
	 */
	@Override
	public com.kpmg.customtables.model.NewsAndEvents getNewsAndEvents(
			long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsAndEventsLocalService.getNewsAndEvents(newsId);
	}

	/**
	 * Returns a range of all the news and eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.kpmg.customtables.model.impl.NewsAndEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news and eventses
	 * @param end the upper bound of the range of news and eventses (not inclusive)
	 * @return the range of news and eventses
	 */
	@Override
	public java.util.List<com.kpmg.customtables.model.NewsAndEvents>
		getNewsAndEventses(int start, int end) {

		return _newsAndEventsLocalService.getNewsAndEventses(start, end);
	}

	/**
	 * Returns the number of news and eventses.
	 *
	 * @return the number of news and eventses
	 */
	@Override
	public int getNewsAndEventsesCount() {
		return _newsAndEventsLocalService.getNewsAndEventsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newsAndEventsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsAndEventsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the news and events in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NewsAndEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param newsAndEvents the news and events
	 * @return the news and events that was updated
	 */
	@Override
	public com.kpmg.customtables.model.NewsAndEvents updateNewsAndEvents(
		com.kpmg.customtables.model.NewsAndEvents newsAndEvents) {

		return _newsAndEventsLocalService.updateNewsAndEvents(newsAndEvents);
	}

	@Override
	public NewsAndEventsLocalService getWrappedService() {
		return _newsAndEventsLocalService;
	}

	@Override
	public void setWrappedService(
		NewsAndEventsLocalService newsAndEventsLocalService) {

		_newsAndEventsLocalService = newsAndEventsLocalService;
	}

	private NewsAndEventsLocalService _newsAndEventsLocalService;

}