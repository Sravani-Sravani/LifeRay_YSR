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

package com.kpmg.asrimTables.service.persistence.impl;

import com.kpmg.asrimTables.exception.NoSuchAsrimLocationsException;
import com.kpmg.asrimTables.model.AsrimLocations;
import com.kpmg.asrimTables.model.AsrimLocationsTable;
import com.kpmg.asrimTables.model.impl.AsrimLocationsImpl;
import com.kpmg.asrimTables.model.impl.AsrimLocationsModelImpl;
import com.kpmg.asrimTables.service.persistence.AsrimLocationsPersistence;
import com.kpmg.asrimTables.service.persistence.AsrimLocationsUtil;
import com.kpmg.asrimTables.service.persistence.impl.constants.ASRIMPersistenceConstants;

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
 * The persistence implementation for the asrim locations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {AsrimLocationsPersistence.class, BasePersistence.class})
public class AsrimLocationsPersistenceImpl
	extends BasePersistenceImpl<AsrimLocations>
	implements AsrimLocationsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AsrimLocationsUtil</code> to access the asrim locations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AsrimLocationsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public AsrimLocationsPersistenceImpl() {
		setModelClass(AsrimLocations.class);

		setModelImplClass(AsrimLocationsImpl.class);
		setModelPKClass(String.class);

		setTable(AsrimLocationsTable.INSTANCE);
	}

	/**
	 * Caches the asrim locations in the entity cache if it is enabled.
	 *
	 * @param asrimLocations the asrim locations
	 */
	@Override
	public void cacheResult(AsrimLocations asrimLocations) {
		entityCache.putResult(
			AsrimLocationsImpl.class, asrimLocations.getPrimaryKey(),
			asrimLocations);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the asrim locationses in the entity cache if it is enabled.
	 *
	 * @param asrimLocationses the asrim locationses
	 */
	@Override
	public void cacheResult(List<AsrimLocations> asrimLocationses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (asrimLocationses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AsrimLocations asrimLocations : asrimLocationses) {
			if (entityCache.getResult(
					AsrimLocationsImpl.class, asrimLocations.getPrimaryKey()) ==
						null) {

				cacheResult(asrimLocations);
			}
		}
	}

	/**
	 * Clears the cache for all asrim locationses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AsrimLocationsImpl.class);

		finderCache.clearCache(AsrimLocationsImpl.class);
	}

	/**
	 * Clears the cache for the asrim locations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AsrimLocations asrimLocations) {
		entityCache.removeResult(AsrimLocationsImpl.class, asrimLocations);
	}

	@Override
	public void clearCache(List<AsrimLocations> asrimLocationses) {
		for (AsrimLocations asrimLocations : asrimLocationses) {
			entityCache.removeResult(AsrimLocationsImpl.class, asrimLocations);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AsrimLocationsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AsrimLocationsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new asrim locations with the primary key. Does not add the asrim locations to the database.
	 *
	 * @param LOC_ID the primary key for the new asrim locations
	 * @return the new asrim locations
	 */
	@Override
	public AsrimLocations create(String LOC_ID) {
		AsrimLocations asrimLocations = new AsrimLocationsImpl();

		asrimLocations.setNew(true);
		asrimLocations.setPrimaryKey(LOC_ID);

		return asrimLocations;
	}

	/**
	 * Removes the asrim locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations that was removed
	 * @throws NoSuchAsrimLocationsException if a asrim locations with the primary key could not be found
	 */
	@Override
	public AsrimLocations remove(String LOC_ID)
		throws NoSuchAsrimLocationsException {

		return remove((Serializable)LOC_ID);
	}

	/**
	 * Removes the asrim locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the asrim locations
	 * @return the asrim locations that was removed
	 * @throws NoSuchAsrimLocationsException if a asrim locations with the primary key could not be found
	 */
	@Override
	public AsrimLocations remove(Serializable primaryKey)
		throws NoSuchAsrimLocationsException {

		Session session = null;

		try {
			session = openSession();

			AsrimLocations asrimLocations = (AsrimLocations)session.get(
				AsrimLocationsImpl.class, primaryKey);

			if (asrimLocations == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAsrimLocationsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(asrimLocations);
		}
		catch (NoSuchAsrimLocationsException noSuchEntityException) {
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
	protected AsrimLocations removeImpl(AsrimLocations asrimLocations) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(asrimLocations)) {
				asrimLocations = (AsrimLocations)session.get(
					AsrimLocationsImpl.class,
					asrimLocations.getPrimaryKeyObj());
			}

			if (asrimLocations != null) {
				session.delete(asrimLocations);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (asrimLocations != null) {
			clearCache(asrimLocations);
		}

		return asrimLocations;
	}

	@Override
	public AsrimLocations updateImpl(AsrimLocations asrimLocations) {
		boolean isNew = asrimLocations.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(asrimLocations);
			}
			else {
				asrimLocations = (AsrimLocations)session.merge(asrimLocations);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AsrimLocationsImpl.class, asrimLocations, false, true);

		if (isNew) {
			asrimLocations.setNew(false);
		}

		asrimLocations.resetOriginalValues();

		return asrimLocations;
	}

	/**
	 * Returns the asrim locations with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the asrim locations
	 * @return the asrim locations
	 * @throws NoSuchAsrimLocationsException if a asrim locations with the primary key could not be found
	 */
	@Override
	public AsrimLocations findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAsrimLocationsException {

		AsrimLocations asrimLocations = fetchByPrimaryKey(primaryKey);

		if (asrimLocations == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAsrimLocationsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return asrimLocations;
	}

	/**
	 * Returns the asrim locations with the primary key or throws a <code>NoSuchAsrimLocationsException</code> if it could not be found.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations
	 * @throws NoSuchAsrimLocationsException if a asrim locations with the primary key could not be found
	 */
	@Override
	public AsrimLocations findByPrimaryKey(String LOC_ID)
		throws NoSuchAsrimLocationsException {

		return findByPrimaryKey((Serializable)LOC_ID);
	}

	/**
	 * Returns the asrim locations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param LOC_ID the primary key of the asrim locations
	 * @return the asrim locations, or <code>null</code> if a asrim locations with the primary key could not be found
	 */
	@Override
	public AsrimLocations fetchByPrimaryKey(String LOC_ID) {
		return fetchByPrimaryKey((Serializable)LOC_ID);
	}

	/**
	 * Returns all the asrim locationses.
	 *
	 * @return the asrim locationses
	 */
	@Override
	public List<AsrimLocations> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the asrim locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AsrimLocationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim locationses
	 * @param end the upper bound of the range of asrim locationses (not inclusive)
	 * @return the range of asrim locationses
	 */
	@Override
	public List<AsrimLocations> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the asrim locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AsrimLocationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim locationses
	 * @param end the upper bound of the range of asrim locationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of asrim locationses
	 */
	@Override
	public List<AsrimLocations> findAll(
		int start, int end,
		OrderByComparator<AsrimLocations> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the asrim locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AsrimLocationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asrim locationses
	 * @param end the upper bound of the range of asrim locationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of asrim locationses
	 */
	@Override
	public List<AsrimLocations> findAll(
		int start, int end, OrderByComparator<AsrimLocations> orderByComparator,
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

		List<AsrimLocations> list = null;

		if (useFinderCache) {
			list = (List<AsrimLocations>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ASRIMLOCATIONS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ASRIMLOCATIONS;

				sql = sql.concat(AsrimLocationsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AsrimLocations>)QueryUtil.list(
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
	 * Removes all the asrim locationses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AsrimLocations asrimLocations : findAll()) {
			remove(asrimLocations);
		}
	}

	/**
	 * Returns the number of asrim locationses.
	 *
	 * @return the number of asrim locationses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ASRIMLOCATIONS);

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
		return "LOC_ID";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ASRIMLOCATIONS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AsrimLocationsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the asrim locations persistence.
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

		_setAsrimLocationsUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAsrimLocationsUtilPersistence(null);

		entityCache.removeCache(AsrimLocationsImpl.class.getName());
	}

	private void _setAsrimLocationsUtilPersistence(
		AsrimLocationsPersistence asrimLocationsPersistence) {

		try {
			Field field = AsrimLocationsUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, asrimLocationsPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = ASRIMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ASRIMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ASRIMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ASRIMLOCATIONS =
		"SELECT asrimLocations FROM AsrimLocations asrimLocations";

	private static final String _SQL_COUNT_ASRIMLOCATIONS =
		"SELECT COUNT(asrimLocations) FROM AsrimLocations asrimLocations";

	private static final String _ORDER_BY_ENTITY_ALIAS = "asrimLocations.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AsrimLocations exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		AsrimLocationsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private AsrimLocationsModelArgumentsResolver
		_asrimLocationsModelArgumentsResolver;

}