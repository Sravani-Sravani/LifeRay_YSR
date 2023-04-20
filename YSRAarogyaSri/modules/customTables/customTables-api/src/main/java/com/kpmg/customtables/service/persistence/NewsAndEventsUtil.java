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

package com.kpmg.customtables.service.persistence;

import com.kpmg.customtables.model.NewsAndEvents;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the news and events service. This utility wraps <code>com.kpmg.customtables.service.persistence.impl.NewsAndEventsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndEventsPersistence
 * @generated
 */
public class NewsAndEventsUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(NewsAndEvents newsAndEvents) {
		getPersistence().clearCache(newsAndEvents);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, NewsAndEvents> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NewsAndEvents> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NewsAndEvents> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NewsAndEvents> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NewsAndEvents> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NewsAndEvents update(NewsAndEvents newsAndEvents) {
		return getPersistence().update(newsAndEvents);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NewsAndEvents update(
		NewsAndEvents newsAndEvents, ServiceContext serviceContext) {

		return getPersistence().update(newsAndEvents, serviceContext);
	}

	/**
	 * Returns all the news and eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching news and eventses
	 */
	public static List<NewsAndEvents> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the news and eventses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsAndEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of news and eventses
	 * @param end the upper bound of the range of news and eventses (not inclusive)
	 * @return the range of matching news and eventses
	 */
	public static List<NewsAndEvents> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the news and eventses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsAndEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of news and eventses
	 * @param end the upper bound of the range of news and eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching news and eventses
	 */
	public static List<NewsAndEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NewsAndEvents> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the news and eventses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsAndEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of news and eventses
	 * @param end the upper bound of the range of news and eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching news and eventses
	 */
	public static List<NewsAndEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NewsAndEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news and events
	 * @throws NoSuchNewsAndEventsException if a matching news and events could not be found
	 */
	public static NewsAndEvents findByUuid_First(
			String uuid, OrderByComparator<NewsAndEvents> orderByComparator)
		throws com.kpmg.customtables.exception.NoSuchNewsAndEventsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news and events, or <code>null</code> if a matching news and events could not be found
	 */
	public static NewsAndEvents fetchByUuid_First(
		String uuid, OrderByComparator<NewsAndEvents> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news and events
	 * @throws NoSuchNewsAndEventsException if a matching news and events could not be found
	 */
	public static NewsAndEvents findByUuid_Last(
			String uuid, OrderByComparator<NewsAndEvents> orderByComparator)
		throws com.kpmg.customtables.exception.NoSuchNewsAndEventsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news and events, or <code>null</code> if a matching news and events could not be found
	 */
	public static NewsAndEvents fetchByUuid_Last(
		String uuid, OrderByComparator<NewsAndEvents> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the news and eventses before and after the current news and events in the ordered set where uuid = &#63;.
	 *
	 * @param newsId the primary key of the current news and events
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next news and events
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	public static NewsAndEvents[] findByUuid_PrevAndNext(
			long newsId, String uuid,
			OrderByComparator<NewsAndEvents> orderByComparator)
		throws com.kpmg.customtables.exception.NoSuchNewsAndEventsException {

		return getPersistence().findByUuid_PrevAndNext(
			newsId, uuid, orderByComparator);
	}

	/**
	 * Removes all the news and eventses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of news and eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching news and eventses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the news and events in the entity cache if it is enabled.
	 *
	 * @param newsAndEvents the news and events
	 */
	public static void cacheResult(NewsAndEvents newsAndEvents) {
		getPersistence().cacheResult(newsAndEvents);
	}

	/**
	 * Caches the news and eventses in the entity cache if it is enabled.
	 *
	 * @param newsAndEventses the news and eventses
	 */
	public static void cacheResult(List<NewsAndEvents> newsAndEventses) {
		getPersistence().cacheResult(newsAndEventses);
	}

	/**
	 * Creates a new news and events with the primary key. Does not add the news and events to the database.
	 *
	 * @param newsId the primary key for the new news and events
	 * @return the new news and events
	 */
	public static NewsAndEvents create(long newsId) {
		return getPersistence().create(newsId);
	}

	/**
	 * Removes the news and events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events that was removed
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	public static NewsAndEvents remove(long newsId)
		throws com.kpmg.customtables.exception.NoSuchNewsAndEventsException {

		return getPersistence().remove(newsId);
	}

	public static NewsAndEvents updateImpl(NewsAndEvents newsAndEvents) {
		return getPersistence().updateImpl(newsAndEvents);
	}

	/**
	 * Returns the news and events with the primary key or throws a <code>NoSuchNewsAndEventsException</code> if it could not be found.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	public static NewsAndEvents findByPrimaryKey(long newsId)
		throws com.kpmg.customtables.exception.NoSuchNewsAndEventsException {

		return getPersistence().findByPrimaryKey(newsId);
	}

	/**
	 * Returns the news and events with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events, or <code>null</code> if a news and events with the primary key could not be found
	 */
	public static NewsAndEvents fetchByPrimaryKey(long newsId) {
		return getPersistence().fetchByPrimaryKey(newsId);
	}

	/**
	 * Returns all the news and eventses.
	 *
	 * @return the news and eventses
	 */
	public static List<NewsAndEvents> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the news and eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsAndEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news and eventses
	 * @param end the upper bound of the range of news and eventses (not inclusive)
	 * @return the range of news and eventses
	 */
	public static List<NewsAndEvents> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the news and eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsAndEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news and eventses
	 * @param end the upper bound of the range of news and eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of news and eventses
	 */
	public static List<NewsAndEvents> findAll(
		int start, int end,
		OrderByComparator<NewsAndEvents> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the news and eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsAndEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news and eventses
	 * @param end the upper bound of the range of news and eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of news and eventses
	 */
	public static List<NewsAndEvents> findAll(
		int start, int end, OrderByComparator<NewsAndEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the news and eventses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of news and eventses.
	 *
	 * @return the number of news and eventses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NewsAndEventsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile NewsAndEventsPersistence _persistence;

}