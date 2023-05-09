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

package com.keyPeopleService.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;apgovt_designation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Designation
 * @generated
 */
public class DesignationTable extends BaseTable<DesignationTable> {

	public static final DesignationTable INSTANCE = new DesignationTable();

	public final Column<DesignationTable, Long> did = createColumn(
		"did", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DesignationTable, Long> wid = createColumn(
		"wid", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DesignationTable, String> dname = createColumn(
		"dname", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DesignationTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DesignationTable, Integer> dorder = createColumn(
		"dorder", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private DesignationTable() {
		super("apgovt_designation", DesignationTable::new);
	}

}