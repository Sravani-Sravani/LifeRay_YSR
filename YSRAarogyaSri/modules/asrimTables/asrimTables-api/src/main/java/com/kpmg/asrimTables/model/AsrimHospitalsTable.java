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
 * The table class for the &quot;asrim_hospitals&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AsrimHospitals
 * @generated
 */
public class AsrimHospitalsTable extends BaseTable<AsrimHospitalsTable> {

	public static final AsrimHospitalsTable INSTANCE =
		new AsrimHospitalsTable();

	public final Column<AsrimHospitalsTable, String> HOSP_ID = createColumn(
		"HOSP_ID", String.class, Types.VARCHAR, Column.FLAG_PRIMARY);

	public final Column<AsrimHospitalsTable, String> HOSP_NAME = createColumn(
		"HOSP_NAME", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_DISP_CODE =
		createColumn(
			"HOSP_DISP_CODE", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_CONTACT_PERSON =
		createColumn(
			"HOSP_CONTACT_PERSON", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_CONTACT_NO =
		createColumn(
			"HOSP_CONTACT_NO", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_MITHRA = createColumn(
		"HOSP_MITHRA", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> CUG_NO = createColumn(
		"CUG_NO", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_SPECIALITY =
		createColumn(
			"HOSP_SPECIALITY", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_CITY = createColumn(
		"HOSP_CITY", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_ADDR1 = createColumn(
		"HOSP_ADDR1", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_ADDR2 = createColumn(
		"HOSP_ADDR2", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_ADDR3 = createColumn(
		"HOSP_ADDR3", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_FAX_NO = createColumn(
		"HOSP_FAX_NO", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_EMAIL = createColumn(
		"HOSP_EMAIL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_ACTIVE_YN =
		createColumn(
			"HOSP_ACTIVE_YN", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> CRT_DT = createColumn(
		"CRT_DT", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> CRT_USR = createColumn(
		"CRT_USR", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> LST_UPD_DT = createColumn(
		"LST_UPD_DT", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> LST_UPD_USR = createColumn(
		"LST_UPD_USR", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> LANG_ID = createColumn(
		"LANG_ID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_DIST_CD =
		createColumn(
			"HOSP_DIST_CD", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_VIL_CD = createColumn(
		"HOSP_VIL_CD", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> ACCOUNT_NO = createColumn(
		"ACCOUNT_NO", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> BANK_ID = createColumn(
		"BANK_ID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> DEPO_ID = createColumn(
		"DEPO_ID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_ACCOUNT_NAME =
		createColumn(
			"HOSP_ACCOUNT_NAME", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_TYPE = createColumn(
		"HOSP_TYPE", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> BILL_HEAD_NAME =
		createColumn(
			"BILL_HEAD_NAME", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> BILL_HEAD_CONTACT_NO =
		createColumn(
			"BILL_HEAD_CONTACT_NO", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> BILL_HEAD_EMAIL =
		createColumn(
			"BILL_HEAD_EMAIL", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> RAMCO_NAME = createColumn(
		"RAMCO_NAME", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> RAMCO_CONTACT_NO =
		createColumn(
			"RAMCO_CONTACT_NO", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> RAMCO_EMAIL = createColumn(
		"RAMCO_EMAIL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AMCCO_NAME = createColumn(
		"AMCCO_NAME", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AMCCO_CONTACT_NO =
		createColumn(
			"AMCCO_CONTACT_NO", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AMCCO_EMAIL = createColumn(
		"AMCCO_EMAIL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> DIST_ID = createColumn(
		"DIST_ID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> DELIST_SUSP_REMARKS =
		createColumn(
			"DELIST_SUSP_REMARKS", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_EMPNL_REF_NUM =
		createColumn(
			"HOSP_EMPNL_REF_NUM", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> PAYMENTS = createColumn(
		"PAYMENTS", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_CATEGORY =
		createColumn(
			"HOSP_CATEGORY", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Integer> ONBED_PATIENTS =
		createColumn(
			"ONBED_PATIENTS", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> GOVT_HOSP_TYPE =
		createColumn(
			"GOVT_HOSP_TYPE", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> LST_UPD_STATUS_DT =
		createColumn(
			"LST_UPD_STATUS_DT", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> LST_UPD_STATUS_USR =
		createColumn(
			"LST_UPD_STATUS_USR", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_NOTICE = createColumn(
		"HOSP_NOTICE", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> TDS_EXEMP_STATUS =
		createColumn(
			"TDS_EXEMP_STATUS", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> TDS_FROM_DT = createColumn(
		"TDS_FROM_DT", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> TDS_TO_DT = createColumn(
		"TDS_TO_DT", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> TDS_REMARKS = createColumn(
		"TDS_REMARKS", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> EXEMP_REF_NO =
		createColumn(
			"EXEMP_REF_NO", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> PAN_int = createColumn(
		"PAN_int", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> REV_FUND_ACTIVE =
		createColumn(
			"REV_FUND_ACTIVE", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> COMPLAINT_TYPE =
		createColumn(
			"COMPLAINT_TYPE", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> PAN_HOLDER_NAME =
		createColumn(
			"PAN_HOLDER_NAME", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> HOSP_EMPNL_DATE =
		createColumn(
			"HOSP_EMPNL_DATE", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_ESTAB_YR =
		createColumn(
			"HOSP_ESTAB_YR", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_AMCCO_QUAL =
		createColumn(
			"HOSP_AMCCO_QUAL", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_RAMCO_QUAL =
		createColumn(
			"HOSP_RAMCO_QUAL", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_BILLINGHEAD_QUAL =
		createColumn(
			"HOSP_BILLINGHEAD_QUAL", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> USR_MACID = createColumn(
		"USR_MACID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_MACID = createColumn(
		"HOSP_MACID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> BIOM_REQUIRED =
		createColumn(
			"BIOM_REQUIRED", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> ORG_TYPE = createColumn(
		"ORG_TYPE", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> DLIST_CLAIM_CONFM =
		createColumn(
			"DLIST_CLAIM_CONFM", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> DCT_FUND_ACTIVE =
		createColumn(
			"DCT_FUND_ACTIVE", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> ISACTIVE_TG = createColumn(
		"ISACTIVE_TG", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> ISACTIVE_AP = createColumn(
		"ISACTIVE_AP", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> COMPLAINT_TYPE_TG =
		createColumn(
			"COMPLAINT_TYPE_TG", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> BLOCK_CLAIMS_TG =
		createColumn(
			"BLOCK_CLAIMS_TG", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> APPLICATION_TYPE =
		createColumn(
			"APPLICATION_TYPE", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AP_ACCOUNT_NO =
		createColumn(
			"AP_ACCOUNT_NO", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AP_BANK_ID = createColumn(
		"AP_BANK_ID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AP_HOSP_ACCOUNT_NAME =
		createColumn(
			"AP_HOSP_ACCOUNT_NAME", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> BIOM_REQUIRED_AP =
		createColumn(
			"BIOM_REQUIRED_AP", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> MEDCO_LOGIN_CREATED =
		createColumn(
			"MEDCO_LOGIN_CREATED", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> DIST_ID_OLD = createColumn(
		"DIST_ID_OLD", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AP_PATIENT_CARE_BANKID =
		createColumn(
			"AP_PATIENT_CARE_BANKID", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AP_INCENTIVE_CARE_BANK_ID =
		createColumn(
			"AP_INCENTIVE_CARE_BANK_ID", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> PATIENT_CARE_ACCOUNT_NO =
		createColumn(
			"PATIENT_CARE_ACCOUNT_NO", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> INCENTIVE_CARE_ACCOUNT_NO =
		createColumn(
			"INCENTIVE_CARE_ACCOUNT_NO", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AP_PATCARE_HOSP_AC_NAME =
		createColumn(
			"AP_PATCARE_HOSP_AC_NAME", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> AP_INCCARE_HOSP_AC_NAME =
		createColumn(
			"AP_INCCARE_HOSP_AC_NAME", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> ERR_MSGS = createColumn(
		"ERR_MSGS", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> NHPM_UPD = createColumn(
		"NHPM_UPD", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> EHS_REFERENCE_NUMBE =
		createColumn(
			"EHS_REFERENCE_NUMBE", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> NHPM_UPD_ADD =
		createColumn(
			"NHPM_UPD_ADD", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> ERR_MSGS_ADD =
		createColumn(
			"ERR_MSGS_ADD", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> NHPM_UPM_HOSP_ATTACH =
		createColumn(
			"NHPM_UPM_HOSP_ATTACH", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> HOSP_NAME_TEL =
		createColumn(
			"HOSP_NAME_TEL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> INFRA_UPD = createColumn(
		"INFRA_UPD", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> ERR_MSGS_INFRA =
		createColumn(
			"ERR_MSGS_INFRA", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> COVID_NWH_STATUS =
		createColumn(
			"COVID_NWH_STATUS", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> TEMPORARY_HOSPITAL =
		createColumn(
			"TEMPORARY_HOSPITAL", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> NHPM_HOSP_ID =
		createColumn(
			"NHPM_HOSP_ID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> NHPM_UPD_DT = createColumn(
		"NHPM_UPD_DT", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> NHPM_UPD_ADD_DT =
		createColumn(
			"NHPM_UPD_ADD_DT", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> NHPM_UPD_HOSP_ATTACH_DT =
		createColumn(
			"NHPM_UPD_HOSP_ATTACH_DT", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, Date> INFRA_UPD_DT = createColumn(
		"INFRA_UPD_DT", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> RESPONSE_CNT =
		createColumn(
			"RESPONSE_CNT", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> ERR_MSGS_HOSP_ATTACH =
		createColumn(
			"ERR_MSGS_HOSP_ATTACH", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	public final Column<AsrimHospitalsTable, String> PAN_NUMBER = createColumn(
		"PAN_NUMBER", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AsrimHospitalsTable() {
		super("asrim_hospitals", AsrimHospitalsTable::new);
	}

}