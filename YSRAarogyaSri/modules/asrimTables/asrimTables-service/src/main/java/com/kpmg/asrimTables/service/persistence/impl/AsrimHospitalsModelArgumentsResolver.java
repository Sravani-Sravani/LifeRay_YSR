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

import com.kpmg.asrimTables.model.AsrimHospitalsTable;
import com.kpmg.asrimTables.model.impl.AsrimHospitalsImpl;
import com.kpmg.asrimTables.model.impl.AsrimHospitalsModelImpl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Objects;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AsrimHospitals.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	immediate = true,
	service = {
		AsrimHospitalsModelArgumentsResolver.class, ArgumentsResolver.class
	}
)
public class AsrimHospitalsModelArgumentsResolver implements ArgumentsResolver {

	@Override
	public Object[] getArguments(
		FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
		boolean original) {

		String[] columnNames = finderPath.getColumnNames();

		if ((columnNames == null) || (columnNames.length == 0)) {
			if (baseModel.isNew()) {
				return new Object[0];
			}

			return null;
		}

		AsrimHospitalsModelImpl asrimHospitalsModelImpl =
			(AsrimHospitalsModelImpl)baseModel;

		if (!checkColumn ||
			_hasModifiedColumns(asrimHospitalsModelImpl, columnNames)) {

			return _getValue(asrimHospitalsModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AsrimHospitalsImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AsrimHospitalsTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AsrimHospitalsModelImpl asrimHospitalsModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = asrimHospitalsModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = asrimHospitalsModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static boolean _hasModifiedColumns(
		AsrimHospitalsModelImpl asrimHospitalsModelImpl, String[] columnNames) {

		if (columnNames.length == 0) {
			return false;
		}

		for (String columnName : columnNames) {
			if (!Objects.equals(
					asrimHospitalsModelImpl.getColumnOriginalValue(columnName),
					asrimHospitalsModelImpl.getColumnValue(columnName))) {

				return true;
			}
		}

		return false;
	}

}