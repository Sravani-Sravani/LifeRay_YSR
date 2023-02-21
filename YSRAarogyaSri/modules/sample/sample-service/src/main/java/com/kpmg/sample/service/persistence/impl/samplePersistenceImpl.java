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

package com.kpmg.sample.service.persistence.impl;

import com.kpmg.sample.exception.NoSuchsampleException;
import com.kpmg.sample.model.impl.sampleImpl;
import com.kpmg.sample.model.impl.sampleModelImpl;
import com.kpmg.sample.model.sample;
import com.kpmg.sample.model.sampleTable;
import com.kpmg.sample.service.persistence.impl.constants.anajaPersistenceConstants;
import com.kpmg.sample.service.persistence.samplePersistence;
import com.kpmg.sample.service.persistence.sampleUtil;

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
import com.liferay.portal.kernel.util.SetUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the sample service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {samplePersistence.class, BasePersistence.class})
public class samplePersistenceImpl
	extends BasePersistenceImpl<sample> implements samplePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>sampleUtil</code> to access the sample persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		sampleImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public samplePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);

		setModelClass(sample.class);

		setModelImplClass(sampleImpl.class);
		setModelPKClass(long.class);

		setTable(sampleTable.INSTANCE);
	}

	/**
	 * Caches the sample in the entity cache if it is enabled.
	 *
	 * @param sample the sample
	 */
	@Override
	public void cacheResult(sample sample) {
		entityCache.putResult(sampleImpl.class, sample.getPrimaryKey(), sample);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the samples in the entity cache if it is enabled.
	 *
	 * @param samples the samples
	 */
	@Override
	public void cacheResult(List<sample> samples) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (samples.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (sample sample : samples) {
			if (entityCache.getResult(
					sampleImpl.class, sample.getPrimaryKey()) == null) {

				cacheResult(sample);
			}
		}
	}

	/**
	 * Clears the cache for all samples.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(sampleImpl.class);

		finderCache.clearCache(sampleImpl.class);
	}

	/**
	 * Clears the cache for the sample.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(sample sample) {
		entityCache.removeResult(sampleImpl.class, sample);
	}

	@Override
	public void clearCache(List<sample> samples) {
		for (sample sample : samples) {
			entityCache.removeResult(sampleImpl.class, sample);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(sampleImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(sampleImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sample with the primary key. Does not add the sample to the database.
	 *
	 * @param id the primary key for the new sample
	 * @return the new sample
	 */
	@Override
	public sample create(long id) {
		sample sample = new sampleImpl();

		sample.setNew(true);
		sample.setPrimaryKey(id);

		return sample;
	}

	/**
	 * Removes the sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the sample
	 * @return the sample that was removed
	 * @throws NoSuchsampleException if a sample with the primary key could not be found
	 */
	@Override
	public sample remove(long id) throws NoSuchsampleException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sample
	 * @return the sample that was removed
	 * @throws NoSuchsampleException if a sample with the primary key could not be found
	 */
	@Override
	public sample remove(Serializable primaryKey) throws NoSuchsampleException {
		Session session = null;

		try {
			session = openSession();

			sample sample = (sample)session.get(sampleImpl.class, primaryKey);

			if (sample == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsampleException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sample);
		}
		catch (NoSuchsampleException noSuchEntityException) {
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
	protected sample removeImpl(sample sample) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sample)) {
				sample = (sample)session.get(
					sampleImpl.class, sample.getPrimaryKeyObj());
			}

			if (sample != null) {
				session.delete(sample);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sample != null) {
			clearCache(sample);
		}

		return sample;
	}

	@Override
	public sample updateImpl(sample sample) {
		boolean isNew = sample.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sample);
			}
			else {
				sample = (sample)session.merge(sample);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(sampleImpl.class, sample, false, true);

		if (isNew) {
			sample.setNew(false);
		}

		sample.resetOriginalValues();

		return sample;
	}

	/**
	 * Returns the sample with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sample
	 * @return the sample
	 * @throws NoSuchsampleException if a sample with the primary key could not be found
	 */
	@Override
	public sample findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsampleException {

		sample sample = fetchByPrimaryKey(primaryKey);

		if (sample == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsampleException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sample;
	}

	/**
	 * Returns the sample with the primary key or throws a <code>NoSuchsampleException</code> if it could not be found.
	 *
	 * @param id the primary key of the sample
	 * @return the sample
	 * @throws NoSuchsampleException if a sample with the primary key could not be found
	 */
	@Override
	public sample findByPrimaryKey(long id) throws NoSuchsampleException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the sample with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the sample
	 * @return the sample, or <code>null</code> if a sample with the primary key could not be found
	 */
	@Override
	public sample fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the samples.
	 *
	 * @return the samples
	 */
	@Override
	public List<sample> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @return the range of samples
	 */
	@Override
	public List<sample> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of samples
	 */
	@Override
	public List<sample> findAll(
		int start, int end, OrderByComparator<sample> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of samples
	 */
	@Override
	public List<sample> findAll(
		int start, int end, OrderByComparator<sample> orderByComparator,
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

		List<sample> list = null;

		if (useFinderCache) {
			list = (List<sample>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SAMPLE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SAMPLE;

				sql = sql.concat(sampleModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<sample>)QueryUtil.list(
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
	 * Removes all the samples from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (sample sample : findAll()) {
			remove(sample);
		}
	}

	/**
	 * Returns the number of samples.
	 *
	 * @return the number of samples
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SAMPLE);

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
		return "id_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SAMPLE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return sampleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sample persistence.
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

		_setsampleUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setsampleUtilPersistence(null);

		entityCache.removeCache(sampleImpl.class.getName());
	}

	private void _setsampleUtilPersistence(
		samplePersistence samplePersistence) {

		try {
			Field field = sampleUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, samplePersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = anajaPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = anajaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = anajaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SAMPLE =
		"SELECT sample FROM sample sample";

	private static final String _SQL_COUNT_SAMPLE =
		"SELECT COUNT(sample) FROM sample sample";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sample.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No sample exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		samplePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private sampleModelArgumentsResolver _sampleModelArgumentsResolver;

}