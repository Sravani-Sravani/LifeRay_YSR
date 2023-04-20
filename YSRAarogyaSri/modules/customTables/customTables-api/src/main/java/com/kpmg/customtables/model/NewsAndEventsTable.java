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

package com.kpmg.customtables.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;apgovt_newsandevents&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndEvents
 * @generated
 */
public class NewsAndEventsTable extends BaseTable<NewsAndEventsTable> {

	public static final NewsAndEventsTable INSTANCE = new NewsAndEventsTable();

	public final Column<NewsAndEventsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NewsAndEventsTable, Long> newsId = createColumn(
		"newsId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NewsAndEventsTable, String> newsdescription =
		createColumn(
			"newsdescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NewsAndEventsTable, String> ti_newsdescription =
		createColumn(
			"ti_newsdescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NewsAndEventsTable, Date> newsDate = createColumn(
		"newsDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NewsAndEventsTable, Long> fileEntryId = createColumn(
		"fileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NewsAndEventsTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NewsAndEventsTable, Date> createdDate = createColumn(
		"createdDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NewsAndEventsTable, Long> createdBy = createColumn(
		"createdBy", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NewsAndEventsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NewsAndEventsTable, Long> modifiedBy = createColumn(
		"modifiedBy", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NewsAndEventsTable() {
		super("apgovt_newsandevents", NewsAndEventsTable::new);
	}

}