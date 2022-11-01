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

package com.kpmg.asrimTables.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;asrim_locations&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AsrimLocations
 * @generated
 */
public class AsrimLocationsTable extends BaseTable<AsrimLocationsTable> {

	public static final AsrimLocationsTable INSTANCE =
		new AsrimLocationsTable();

	public final Column<AsrimLocationsTable, String> LOC_ID = createColumn(
		"LOC_ID", String.class, Types.VARCHAR, Column.FLAG_PRIMARY);

	public final Column<AsrimLocationsTable, String> LOC_NAME = createColumn(
		"LOC_NAME", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> LOC_PARNT_ID =
		createColumn(
			"LOC_PARNT_ID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> LOC_ORDER = createColumn(
		"LOC_ORDER", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> LOC_DESC = createColumn(
		"LOC_DESC", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> LOC_VAL = createColumn(
		"LOC_VAL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> LANG_ID = createColumn(
		"LANG_ID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> CRT_USR = createColumn(
		"CRT_USR", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, Date> CRT_DT = createColumn(
		"CRT_DT", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> LST_UPD_USR = createColumn(
		"LST_UPD_USR", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, Date> LST_UPD_DT = createColumn(
		"LST_UPD_DT", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> LOC_HDR_ID = createColumn(
		"LOC_HDR_ID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> ACTIVE_YN = createColumn(
		"ACTIVE_YN", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> ITDA = createColumn(
		"ITDA", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> ITDA_AREA = createColumn(
		"ITDA_AREA", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> URBAN_RURAL = createColumn(
		"URBAN_RURAL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> PINCODE = createColumn(
		"PINCODE", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> IS_CRDA_LOCATION =
		createColumn(
			"IS_CRDA_LOCATION", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> EHS_LOCATION_ID =
		createColumn(
			"EHS_LOCATION_ID", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> RURAL_URBAN = createColumn(
		"RURAL_URBAN", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> LOC_DESC_TEL =
		createColumn(
			"LOC_DESC_TEL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimLocationsTable, String> LOC_STATE_VAL =
		createColumn(
			"LOC_STATE_VAL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AsrimLocationsTable() {
		super("asrim_locations", AsrimLocationsTable::new);
	}

}