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

package com.keyPeopleService.service.persistence.impl;

import com.keyPeopleService.exception.NoSuchWingException;
import com.keyPeopleService.model.Wing;
import com.keyPeopleService.model.WingTable;
import com.keyPeopleService.model.impl.WingImpl;
import com.keyPeopleService.model.impl.WingModelImpl;
import com.keyPeopleService.service.persistence.WingPersistence;
import com.keyPeopleService.service.persistence.WingUtil;
import com.keyPeopleService.service.persistence.impl.constants.FOOPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the wing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {WingPersistence.class, BasePersistence.class})
public class WingPersistenceImpl
	extends BasePersistenceImpl<Wing> implements WingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WingUtil</code> to access the wing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public WingPersistenceImpl() {
		setModelClass(Wing.class);

		setModelImplClass(WingImpl.class);
		setModelPKClass(long.class);

		setTable(WingTable.INSTANCE);
	}

	/**
	 * Caches the wing in the entity cache if it is enabled.
	 *
	 * @param wing the wing
	 */
	@Override
	public void cacheResult(Wing wing) {
		entityCache.putResult(WingImpl.class, wing.getPrimaryKey(), wing);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wings in the entity cache if it is enabled.
	 *
	 * @param wings the wings
	 */
	@Override
	public void cacheResult(List<Wing> wings) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wings.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Wing wing : wings) {
			if (entityCache.getResult(WingImpl.class, wing.getPrimaryKey()) ==
					null) {

				cacheResult(wing);
			}
		}
	}

	/**
	 * Clears the cache for all wings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WingImpl.class);

		finderCache.clearCache(WingImpl.class);
	}

	/**
	 * Clears the cache for the wing.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Wing wing) {
		entityCache.removeResult(WingImpl.class, wing);
	}

	@Override
	public void clearCache(List<Wing> wings) {
		for (Wing wing : wings) {
			entityCache.removeResult(WingImpl.class, wing);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WingImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(WingImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new wing with the primary key. Does not add the wing to the database.
	 *
	 * @param wid the primary key for the new wing
	 * @return the new wing
	 */
	@Override
	public Wing create(long wid) {
		Wing wing = new WingImpl();

		wing.setNew(true);
		wing.setPrimaryKey(wid);

		return wing;
	}

	/**
	 * Removes the wing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wid the primary key of the wing
	 * @return the wing that was removed
	 * @throws NoSuchWingException if a wing with the primary key could not be found
	 */
	@Override
	public Wing remove(long wid) throws NoSuchWingException {
		return remove((Serializable)wid);
	}

	/**
	 * Removes the wing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wing
	 * @return the wing that was removed
	 * @throws NoSuchWingException if a wing with the primary key could not be found
	 */
	@Override
	public Wing remove(Serializable primaryKey) throws NoSuchWingException {
		Session session = null;

		try {
			session = openSession();

			Wing wing = (Wing)session.get(WingImpl.class, primaryKey);

			if (wing == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wing);
		}
		catch (NoSuchWingException noSuchEntityException) {
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
	protected Wing removeImpl(Wing wing) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wing)) {
				wing = (Wing)session.get(
					WingImpl.class, wing.getPrimaryKeyObj());
			}

			if (wing != null) {
				session.delete(wing);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wing != null) {
			clearCache(wing);
		}

		return wing;
	}

	@Override
	public Wing updateImpl(Wing wing) {
		boolean isNew = wing.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wing);
			}
			else {
				wing = (Wing)session.merge(wing);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(WingImpl.class, wing, false, true);

		if (isNew) {
			wing.setNew(false);
		}

		wing.resetOriginalValues();

		return wing;
	}

	/**
	 * Returns the wing with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wing
	 * @return the wing
	 * @throws NoSuchWingException if a wing with the primary key could not be found
	 */
	@Override
	public Wing findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWingException {

		Wing wing = fetchByPrimaryKey(primaryKey);

		if (wing == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wing;
	}

	/**
	 * Returns the wing with the primary key or throws a <code>NoSuchWingException</code> if it could not be found.
	 *
	 * @param wid the primary key of the wing
	 * @return the wing
	 * @throws NoSuchWingException if a wing with the primary key could not be found
	 */
	@Override
	public Wing findByPrimaryKey(long wid) throws NoSuchWingException {
		return findByPrimaryKey((Serializable)wid);
	}

	/**
	 * Returns the wing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wid the primary key of the wing
	 * @return the wing, or <code>null</code> if a wing with the primary key could not be found
	 */
	@Override
	public Wing fetchByPrimaryKey(long wid) {
		return fetchByPrimaryKey((Serializable)wid);
	}

	/**
	 * Returns all the wings.
	 *
	 * @return the wings
	 */
	@Override
	public List<Wing> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wings
	 * @param end the upper bound of the range of wings (not inclusive)
	 * @return the range of wings
	 */
	@Override
	public List<Wing> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wings
	 * @param end the upper bound of the range of wings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wings
	 */
	@Override
	public List<Wing> findAll(
		int start, int end, OrderByComparator<Wing> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wings
	 * @param end the upper bound of the range of wings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wings
	 */
	@Override
	public List<Wing> findAll(
		int start, int end, OrderByComparator<Wing> orderByComparator,
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

		List<Wing> list = null;

		if (useFinderCache) {
			list = (List<Wing>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WING;

				sql = sql.concat(WingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Wing>)QueryUtil.list(
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
	 * Removes all the wings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Wing wing : findAll()) {
			remove(wing);
		}
	}

	/**
	 * Returns the number of wings.
	 *
	 * @return the number of wings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_WING);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "wid";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wing persistence.
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

		_setWingUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setWingUtilPersistence(null);

		entityCache.removeCache(WingImpl.class.getName());
	}

	private void _setWingUtilPersistence(WingPersistence wingPersistence) {
		try {
			Field field = WingUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, wingPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_WING = "SELECT wing FROM Wing wing";

	private static final String _SQL_COUNT_WING =
		"SELECT COUNT(wing) FROM Wing wing";

	private static final String _ORDER_BY_ENTITY_ALIAS = "wing.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Wing exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		WingPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private WingModelArgumentsResolver _wingModelArgumentsResolver;

}