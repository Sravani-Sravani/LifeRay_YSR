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

import com.keyPeopleService.exception.NoSuchKeyPeopleException;
import com.keyPeopleService.model.KeyPeople;
import com.keyPeopleService.model.KeyPeopleTable;
import com.keyPeopleService.model.impl.KeyPeopleImpl;
import com.keyPeopleService.model.impl.KeyPeopleModelImpl;
import com.keyPeopleService.service.persistence.KeyPeoplePersistence;
import com.keyPeopleService.service.persistence.KeyPeopleUtil;
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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the key people service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {KeyPeoplePersistence.class, BasePersistence.class})
public class KeyPeoplePersistenceImpl
	extends BasePersistenceImpl<KeyPeople> implements KeyPeoplePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>KeyPeopleUtil</code> to access the key people persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		KeyPeopleImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public KeyPeoplePersistenceImpl() {
		setModelClass(KeyPeople.class);

		setModelImplClass(KeyPeopleImpl.class);
		setModelPKClass(long.class);

		setTable(KeyPeopleTable.INSTANCE);
	}

	/**
	 * Caches the key people in the entity cache if it is enabled.
	 *
	 * @param keyPeople the key people
	 */
	@Override
	public void cacheResult(KeyPeople keyPeople) {
		entityCache.putResult(
			KeyPeopleImpl.class, keyPeople.getPrimaryKey(), keyPeople);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the key peoples in the entity cache if it is enabled.
	 *
	 * @param keyPeoples the key peoples
	 */
	@Override
	public void cacheResult(List<KeyPeople> keyPeoples) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (keyPeoples.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (KeyPeople keyPeople : keyPeoples) {
			if (entityCache.getResult(
					KeyPeopleImpl.class, keyPeople.getPrimaryKey()) == null) {

				cacheResult(keyPeople);
			}
		}
	}

	/**
	 * Clears the cache for all key peoples.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(KeyPeopleImpl.class);

		finderCache.clearCache(KeyPeopleImpl.class);
	}

	/**
	 * Clears the cache for the key people.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KeyPeople keyPeople) {
		entityCache.removeResult(KeyPeopleImpl.class, keyPeople);
	}

	@Override
	public void clearCache(List<KeyPeople> keyPeoples) {
		for (KeyPeople keyPeople : keyPeoples) {
			entityCache.removeResult(KeyPeopleImpl.class, keyPeople);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(KeyPeopleImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(KeyPeopleImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new key people with the primary key. Does not add the key people to the database.
	 *
	 * @param trust_userId the primary key for the new key people
	 * @return the new key people
	 */
	@Override
	public KeyPeople create(long trust_userId) {
		KeyPeople keyPeople = new KeyPeopleImpl();

		keyPeople.setNew(true);
		keyPeople.setPrimaryKey(trust_userId);

		return keyPeople;
	}

	/**
	 * Removes the key people with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people that was removed
	 * @throws NoSuchKeyPeopleException if a key people with the primary key could not be found
	 */
	@Override
	public KeyPeople remove(long trust_userId) throws NoSuchKeyPeopleException {
		return remove((Serializable)trust_userId);
	}

	/**
	 * Removes the key people with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the key people
	 * @return the key people that was removed
	 * @throws NoSuchKeyPeopleException if a key people with the primary key could not be found
	 */
	@Override
	public KeyPeople remove(Serializable primaryKey)
		throws NoSuchKeyPeopleException {

		Session session = null;

		try {
			session = openSession();

			KeyPeople keyPeople = (KeyPeople)session.get(
				KeyPeopleImpl.class, primaryKey);

			if (keyPeople == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKeyPeopleException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(keyPeople);
		}
		catch (NoSuchKeyPeopleException noSuchEntityException) {
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
	protected KeyPeople removeImpl(KeyPeople keyPeople) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(keyPeople)) {
				keyPeople = (KeyPeople)session.get(
					KeyPeopleImpl.class, keyPeople.getPrimaryKeyObj());
			}

			if (keyPeople != null) {
				session.delete(keyPeople);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (keyPeople != null) {
			clearCache(keyPeople);
		}

		return keyPeople;
	}

	@Override
	public KeyPeople updateImpl(KeyPeople keyPeople) {
		boolean isNew = keyPeople.isNew();

		if (!(keyPeople instanceof KeyPeopleModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(keyPeople.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(keyPeople);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in keyPeople proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom KeyPeople implementation " +
					keyPeople.getClass());
		}

		KeyPeopleModelImpl keyPeopleModelImpl = (KeyPeopleModelImpl)keyPeople;

		if (isNew && (keyPeople.getCreateDate() == null)) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			Date date = new Date();

			if (serviceContext == null) {
				keyPeople.setCreateDate(date);
			}
			else {
				keyPeople.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(keyPeople);
			}
			else {
				keyPeople = (KeyPeople)session.merge(keyPeople);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(KeyPeopleImpl.class, keyPeople, false, true);

		if (isNew) {
			keyPeople.setNew(false);
		}

		keyPeople.resetOriginalValues();

		return keyPeople;
	}

	/**
	 * Returns the key people with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the key people
	 * @return the key people
	 * @throws NoSuchKeyPeopleException if a key people with the primary key could not be found
	 */
	@Override
	public KeyPeople findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKeyPeopleException {

		KeyPeople keyPeople = fetchByPrimaryKey(primaryKey);

		if (keyPeople == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKeyPeopleException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return keyPeople;
	}

	/**
	 * Returns the key people with the primary key or throws a <code>NoSuchKeyPeopleException</code> if it could not be found.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people
	 * @throws NoSuchKeyPeopleException if a key people with the primary key could not be found
	 */
	@Override
	public KeyPeople findByPrimaryKey(long trust_userId)
		throws NoSuchKeyPeopleException {

		return findByPrimaryKey((Serializable)trust_userId);
	}

	/**
	 * Returns the key people with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param trust_userId the primary key of the key people
	 * @return the key people, or <code>null</code> if a key people with the primary key could not be found
	 */
	@Override
	public KeyPeople fetchByPrimaryKey(long trust_userId) {
		return fetchByPrimaryKey((Serializable)trust_userId);
	}

	/**
	 * Returns all the key peoples.
	 *
	 * @return the key peoples
	 */
	@Override
	public List<KeyPeople> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the key peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KeyPeopleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of key peoples
	 * @param end the upper bound of the range of key peoples (not inclusive)
	 * @return the range of key peoples
	 */
	@Override
	public List<KeyPeople> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the key peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KeyPeopleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of key peoples
	 * @param end the upper bound of the range of key peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of key peoples
	 */
	@Override
	public List<KeyPeople> findAll(
		int start, int end, OrderByComparator<KeyPeople> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the key peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KeyPeopleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of key peoples
	 * @param end the upper bound of the range of key peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of key peoples
	 */
	@Override
	public List<KeyPeople> findAll(
		int start, int end, OrderByComparator<KeyPeople> orderByComparator,
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

		List<KeyPeople> list = null;

		if (useFinderCache) {
			list = (List<KeyPeople>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_KEYPEOPLE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_KEYPEOPLE;

				sql = sql.concat(KeyPeopleModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<KeyPeople>)QueryUtil.list(
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
	 * Removes all the key peoples from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (KeyPeople keyPeople : findAll()) {
			remove(keyPeople);
		}
	}

	/**
	 * Returns the number of key peoples.
	 *
	 * @return the number of key peoples
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_KEYPEOPLE);

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
		return "trust_userId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_KEYPEOPLE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return KeyPeopleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the key people persistence.
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

		_setKeyPeopleUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setKeyPeopleUtilPersistence(null);

		entityCache.removeCache(KeyPeopleImpl.class.getName());
	}

	private void _setKeyPeopleUtilPersistence(
		KeyPeoplePersistence keyPeoplePersistence) {

		try {
			Field field = KeyPeopleUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, keyPeoplePersistence);
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

	private static final String _SQL_SELECT_KEYPEOPLE =
		"SELECT keyPeople FROM KeyPeople keyPeople";

	private static final String _SQL_COUNT_KEYPEOPLE =
		"SELECT COUNT(keyPeople) FROM KeyPeople keyPeople";

	private static final String _ORDER_BY_ENTITY_ALIAS = "keyPeople.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No KeyPeople exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		KeyPeoplePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private KeyPeopleModelArgumentsResolver _keyPeopleModelArgumentsResolver;

}