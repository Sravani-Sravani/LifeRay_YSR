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

package com.departmentService.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;department&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Department
 * @generated
 */
public class DepartmentTable extends BaseTable<DepartmentTable> {

	public static final DepartmentTable INSTANCE = new DepartmentTable();

	public final Column<DepartmentTable, Long> did = createColumn(
		"did", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DepartmentTable, String> title = createColumn(
		"title", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DepartmentTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DepartmentTable, Integer> department = createColumn(
		"department", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private DepartmentTable() {
		super("department", DepartmentTable::new);
	}

}