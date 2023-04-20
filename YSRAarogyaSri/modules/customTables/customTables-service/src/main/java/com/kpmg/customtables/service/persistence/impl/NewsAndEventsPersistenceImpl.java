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

package com.kpmg.customtables.service.persistence.impl;

import com.kpmg.customtables.exception.NoSuchNewsAndEventsException;
import com.kpmg.customtables.model.NewsAndEvents;
import com.kpmg.customtables.model.NewsAndEventsTable;
import com.kpmg.customtables.model.impl.NewsAndEventsImpl;
import com.kpmg.customtables.model.impl.NewsAndEventsModelImpl;
import com.kpmg.customtables.service.persistence.NewsAndEventsPersistence;
import com.kpmg.customtables.service.persistence.NewsAndEventsUtil;
import com.kpmg.customtables.service.persistence.impl.constants.APGovtPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the news and events service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {NewsAndEventsPersistence.class, BasePersistence.class})
public class NewsAndEventsPersistenceImpl
	extends BasePersistenceImpl<NewsAndEvents>
	implements NewsAndEventsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NewsAndEventsUtil</code> to access the news and events persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NewsAndEventsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the news and eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching news and eventses
	 */
	@Override
	public List<NewsAndEvents> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<NewsAndEvents> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<NewsAndEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NewsAndEvents> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<NewsAndEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NewsAndEvents> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<NewsAndEvents> list = null;

		if (useFinderCache) {
			list = (List<NewsAndEvents>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (NewsAndEvents newsAndEvents : list) {
					if (!uuid.equals(newsAndEvents.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_NEWSANDEVENTS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NewsAndEventsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<NewsAndEvents>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news and events
	 * @throws NoSuchNewsAndEventsException if a matching news and events could not be found
	 */
	@Override
	public NewsAndEvents findByUuid_First(
			String uuid, OrderByComparator<NewsAndEvents> orderByComparator)
		throws NoSuchNewsAndEventsException {

		NewsAndEvents newsAndEvents = fetchByUuid_First(
			uuid, orderByComparator);

		if (newsAndEvents != null) {
			return newsAndEvents;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNewsAndEventsException(sb.toString());
	}

	/**
	 * Returns the first news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news and events, or <code>null</code> if a matching news and events could not be found
	 */
	@Override
	public NewsAndEvents fetchByUuid_First(
		String uuid, OrderByComparator<NewsAndEvents> orderByComparator) {

		List<NewsAndEvents> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news and events
	 * @throws NoSuchNewsAndEventsException if a matching news and events could not be found
	 */
	@Override
	public NewsAndEvents findByUuid_Last(
			String uuid, OrderByComparator<NewsAndEvents> orderByComparator)
		throws NoSuchNewsAndEventsException {

		NewsAndEvents newsAndEvents = fetchByUuid_Last(uuid, orderByComparator);

		if (newsAndEvents != null) {
			return newsAndEvents;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNewsAndEventsException(sb.toString());
	}

	/**
	 * Returns the last news and events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news and events, or <code>null</code> if a matching news and events could not be found
	 */
	@Override
	public NewsAndEvents fetchByUuid_Last(
		String uuid, OrderByComparator<NewsAndEvents> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<NewsAndEvents> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public NewsAndEvents[] findByUuid_PrevAndNext(
			long newsId, String uuid,
			OrderByComparator<NewsAndEvents> orderByComparator)
		throws NoSuchNewsAndEventsException {

		uuid = Objects.toString(uuid, "");

		NewsAndEvents newsAndEvents = findByPrimaryKey(newsId);

		Session session = null;

		try {
			session = openSession();

			NewsAndEvents[] array = new NewsAndEventsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, newsAndEvents, uuid, orderByComparator, true);

			array[1] = newsAndEvents;

			array[2] = getByUuid_PrevAndNext(
				session, newsAndEvents, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NewsAndEvents getByUuid_PrevAndNext(
		Session session, NewsAndEvents newsAndEvents, String uuid,
		OrderByComparator<NewsAndEvents> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NEWSANDEVENTS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(NewsAndEventsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						newsAndEvents)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NewsAndEvents> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the news and eventses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (NewsAndEvents newsAndEvents :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(newsAndEvents);
		}
	}

	/**
	 * Returns the number of news and eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching news and eventses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NEWSANDEVENTS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"newsAndEvents.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(newsAndEvents.uuid IS NULL OR newsAndEvents.uuid = '')";

	public NewsAndEventsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(NewsAndEvents.class);

		setModelImplClass(NewsAndEventsImpl.class);
		setModelPKClass(long.class);

		setTable(NewsAndEventsTable.INSTANCE);
	}

	/**
	 * Caches the news and events in the entity cache if it is enabled.
	 *
	 * @param newsAndEvents the news and events
	 */
	@Override
	public void cacheResult(NewsAndEvents newsAndEvents) {
		entityCache.putResult(
			NewsAndEventsImpl.class, newsAndEvents.getPrimaryKey(),
			newsAndEvents);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the news and eventses in the entity cache if it is enabled.
	 *
	 * @param newsAndEventses the news and eventses
	 */
	@Override
	public void cacheResult(List<NewsAndEvents> newsAndEventses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (newsAndEventses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NewsAndEvents newsAndEvents : newsAndEventses) {
			if (entityCache.getResult(
					NewsAndEventsImpl.class, newsAndEvents.getPrimaryKey()) ==
						null) {

				cacheResult(newsAndEvents);
			}
		}
	}

	/**
	 * Clears the cache for all news and eventses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NewsAndEventsImpl.class);

		finderCache.clearCache(NewsAndEventsImpl.class);
	}

	/**
	 * Clears the cache for the news and events.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NewsAndEvents newsAndEvents) {
		entityCache.removeResult(NewsAndEventsImpl.class, newsAndEvents);
	}

	@Override
	public void clearCache(List<NewsAndEvents> newsAndEventses) {
		for (NewsAndEvents newsAndEvents : newsAndEventses) {
			entityCache.removeResult(NewsAndEventsImpl.class, newsAndEvents);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NewsAndEventsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NewsAndEventsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new news and events with the primary key. Does not add the news and events to the database.
	 *
	 * @param newsId the primary key for the new news and events
	 * @return the new news and events
	 */
	@Override
	public NewsAndEvents create(long newsId) {
		NewsAndEvents newsAndEvents = new NewsAndEventsImpl();

		newsAndEvents.setNew(true);
		newsAndEvents.setPrimaryKey(newsId);

		String uuid = PortalUUIDUtil.generate();

		newsAndEvents.setUuid(uuid);

		return newsAndEvents;
	}

	/**
	 * Removes the news and events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events that was removed
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	@Override
	public NewsAndEvents remove(long newsId)
		throws NoSuchNewsAndEventsException {

		return remove((Serializable)newsId);
	}

	/**
	 * Removes the news and events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the news and events
	 * @return the news and events that was removed
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	@Override
	public NewsAndEvents remove(Serializable primaryKey)
		throws NoSuchNewsAndEventsException {

		Session session = null;

		try {
			session = openSession();

			NewsAndEvents newsAndEvents = (NewsAndEvents)session.get(
				NewsAndEventsImpl.class, primaryKey);

			if (newsAndEvents == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNewsAndEventsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(newsAndEvents);
		}
		catch (NoSuchNewsAndEventsException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected NewsAndEvents removeImpl(NewsAndEvents newsAndEvents) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newsAndEvents)) {
				newsAndEvents = (NewsAndEvents)session.get(
					NewsAndEventsImpl.class, newsAndEvents.getPrimaryKeyObj());
			}

			if (newsAndEvents != null) {
				session.delete(newsAndEvents);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (newsAndEvents != null) {
			clearCache(newsAndEvents);
		}

		return newsAndEvents;
	}

	@Override
	public NewsAndEvents updateImpl(NewsAndEvents newsAndEvents) {
		boolean isNew = newsAndEvents.isNew();

		if (!(newsAndEvents instanceof NewsAndEventsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(newsAndEvents.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					newsAndEvents);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in newsAndEvents proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NewsAndEvents implementation " +
					newsAndEvents.getClass());
		}

		NewsAndEventsModelImpl newsAndEventsModelImpl =
			(NewsAndEventsModelImpl)newsAndEvents;

		if (Validator.isNull(newsAndEvents.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			newsAndEvents.setUuid(uuid);
		}

		if (!newsAndEventsModelImpl.hasSetModifiedDate()) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			Date date = new Date();

			if (serviceContext == null) {
				newsAndEvents.setModifiedDate(date);
			}
			else {
				newsAndEvents.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(newsAndEvents);
			}
			else {
				newsAndEvents = (NewsAndEvents)session.merge(newsAndEvents);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NewsAndEventsImpl.class, newsAndEventsModelImpl, false, true);

		if (isNew) {
			newsAndEvents.setNew(false);
		}

		newsAndEvents.resetOriginalValues();

		return newsAndEvents;
	}

	/**
	 * Returns the news and events with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the news and events
	 * @return the news and events
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	@Override
	public NewsAndEvents findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNewsAndEventsException {

		NewsAndEvents newsAndEvents = fetchByPrimaryKey(primaryKey);

		if (newsAndEvents == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNewsAndEventsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return newsAndEvents;
	}

	/**
	 * Returns the news and events with the primary key or throws a <code>NoSuchNewsAndEventsException</code> if it could not be found.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events
	 * @throws NoSuchNewsAndEventsException if a news and events with the primary key could not be found
	 */
	@Override
	public NewsAndEvents findByPrimaryKey(long newsId)
		throws NoSuchNewsAndEventsException {

		return findByPrimaryKey((Serializable)newsId);
	}

	/**
	 * Returns the news and events with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsId the primary key of the news and events
	 * @return the news and events, or <code>null</code> if a news and events with the primary key could not be found
	 */
	@Override
	public NewsAndEvents fetchByPrimaryKey(long newsId) {
		return fetchByPrimaryKey((Serializable)newsId);
	}

	/**
	 * Returns all the news and eventses.
	 *
	 * @return the news and eventses
	 */
	@Override
	public List<NewsAndEvents> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<NewsAndEvents> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<NewsAndEvents> findAll(
		int start, int end,
		OrderByComparator<NewsAndEvents> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<NewsAndEvents> findAll(
		int start, int end, OrderByComparator<NewsAndEvents> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<NewsAndEvents> list = null;

		if (useFinderCache) {
			list = (List<NewsAndEvents>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NEWSANDEVENTS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NEWSANDEVENTS;

				sql = sql.concat(NewsAndEventsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NewsAndEvents>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the news and eventses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NewsAndEvents newsAndEvents : findAll()) {
			remove(newsAndEvents);
		}
	}

	/**
	 * Returns the number of news and eventses.
	 *
	 * @return the number of news and eventses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NEWSANDEVENTS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "newsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NEWSANDEVENTS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NewsAndEventsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the news and events persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_setNewsAndEventsUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setNewsAndEventsUtilPersistence(null);

		entityCache.removeCache(NewsAndEventsImpl.class.getName());
	}

	private void _setNewsAndEventsUtilPersistence(
		NewsAndEventsPersistence newsAndEventsPersistence) {

		try {
			Field field = NewsAndEventsUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, newsAndEventsPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = APGovtPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = APGovtPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = APGovtPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NEWSANDEVENTS =
		"SELECT newsAndEvents FROM NewsAndEvents newsAndEvents";

	private static final String _SQL_SELECT_NEWSANDEVENTS_WHERE =
		"SELECT newsAndEvents FROM NewsAndEvents newsAndEvents WHERE ";

	private static final String _SQL_COUNT_NEWSANDEVENTS =
		"SELECT COUNT(newsAndEvents) FROM NewsAndEvents newsAndEvents";

	private static final String _SQL_COUNT_NEWSANDEVENTS_WHERE =
		"SELECT COUNT(newsAndEvents) FROM NewsAndEvents newsAndEvents WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "newsAndEvents.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NewsAndEvents exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NewsAndEvents exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NewsAndEventsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private NewsAndEventsModelArgumentsResolver
		_newsAndEventsModelArgumentsResolver;

}