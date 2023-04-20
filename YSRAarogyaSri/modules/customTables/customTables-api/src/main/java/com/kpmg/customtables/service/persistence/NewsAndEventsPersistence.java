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

import com.kpmg.customtables.exception.NoSuchNewsAndEventsException;
import com.kpmg.customtables.model.NewsAndEvents;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the news and events service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndEventsUtil
 * @generated
 */
@ProviderType
public interface NewsAndEventsPersistence
	extends BasePersistence<NewsAndEvents> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewsAndEventsUtil} to access the news and events persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the news and eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching news and eventses
	 */
	public java.util.List<NewsAndEvents> findByUuid(String uuid);

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
	public java.util.List<NewsAndEvents> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<NewsAndEvents> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsAndEvents>
			orderByComparator);

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
	public java.util.List<NewsAndEvents> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsAndEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news and events
	 * @throws NoSuchNewsAndEventsException if a matching news and events could not be found
	 */
	public NewsAndEvents findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<NewsAndEvents>
				orderByComparator)
		throws NoSuchNewsAndEventsException;

	/**
	 * Returns the first news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news and events, or <code>null</code> if a matching news and events could not be found
	 */
	public NewsAndEvents fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NewsAndEvents>
			orderByComparator);

	/**
	 * Returns the last news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news and events
	 * @throws NoSuchNewsAndEventsException if a matching news and events could not be found
	 */
	public NewsAndEvents findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<NewsAndEvents>
				orderByComparator)
		throws NoSuchNewsAndEventsException;

	/**
	 * Returns the last news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news and events, or <code>null</code> if a matching news and events could not be found
	 */
	public NewsAndEvents fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NewsAndEvents>
			orderByComparator);

	/**
	 * Returns the news and eventses before and after the current news and events in the ordered set where uuid = &#63;.
	 *
	 * @param newsId the primary key of the current news and events
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next news and events
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	public NewsAndEvents[] findByUuid_PrevAndNext(
			long newsId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<NewsAndEvents>
				orderByComparator)
		throws NoSuchNewsAndEventsException;

	/**
	 * Removes all the news and eventses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of news and eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching news and eventses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the news and events in the entity cache if it is enabled.
	 *
	 * @param newsAndEvents the news and events
	 */
	public void cacheResult(NewsAndEvents newsAndEvents);

	/**
	 * Caches the news and eventses in the entity cache if it is enabled.
	 *
	 * @param newsAndEventses the news and eventses
	 */
	public void cacheResult(java.util.List<NewsAndEvents> newsAndEventses);

	/**
	 * Creates a new news and events with the primary key. Does not add the news and events to the database.
	 *
	 * @param newsId the primary key for the new news and events
	 * @return the new news and events
	 */
	public NewsAndEvents create(long newsId);

	/**
	 * Removes the news and events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events that was removed
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	public NewsAndEvents remove(long newsId)
		throws NoSuchNewsAndEventsException;

	public NewsAndEvents updateImpl(NewsAndEvents newsAndEvents);

	/**
	 * Returns the news and events with the primary key or throws a <code>NoSuchNewsAndEventsException</code> if it could not be found.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	public NewsAndEvents findByPrimaryKey(long newsId)
		throws NoSuchNewsAndEventsException;

	/**
	 * Returns the news and events with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events, or <code>null</code> if a news and events with the primary key could not be found
	 */
	public NewsAndEvents fetchByPrimaryKey(long newsId);

	/**
	 * Returns all the news and eventses.
	 *
	 * @return the news and eventses
	 */
	public java.util.List<NewsAndEvents> findAll();

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
	public java.util.List<NewsAndEvents> findAll(int start, int end);

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
	public java.util.List<NewsAndEvents> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsAndEvents>
			orderByComparator);

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
	public java.util.List<NewsAndEvents> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsAndEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the news and eventses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of news and eventses.
	 *
	 * @return the number of news and eventses
	 */
	public int countAll();

}