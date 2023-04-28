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

import java.util.Date;

/**
 * The table class for the &quot;apgovt_keyPeople&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see KeyPeople
 * @generated
 */
public class KeyPeopleTable extends BaseTable<KeyPeopleTable> {

	public static final KeyPeopleTable INSTANCE = new KeyPeopleTable();

	public final Column<KeyPeopleTable, Long> trust_userId = createColumn(
		"trust_userId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<KeyPeopleTable, String> empname = createColumn(
		"empname", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, String> phone = createColumn(
		"phone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, Long> wingId = createColumn(
		"wingId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, Long> designationId = createColumn(
		"designationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, String> empOrder = createColumn(
		"empOrder", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, String> createdBy = createColumn(
		"createdBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, Date> modifyDate = createColumn(
		"modifyDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<KeyPeopleTable, String> modifyBy = createColumn(
		"modifyBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private KeyPeopleTable() {
		super("apgovt_keyPeople", KeyPeopleTable::new);
	}

}