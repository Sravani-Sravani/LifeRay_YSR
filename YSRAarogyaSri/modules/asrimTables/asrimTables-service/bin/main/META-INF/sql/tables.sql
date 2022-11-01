create table ASRIM_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);

create table asrim_hospitals (
	HOSP_ID VARCHAR(75) not null primary key,
	HOSP_NAME VARCHAR(75) null,
	HOSP_DISP_CODE VARCHAR(75) null,
	HOSP_CONTACT_PERSON VARCHAR(75) null,
	HOSP_CONTACT_NO VARCHAR(75) null,
	HOSP_MITHRA VARCHAR(75) null,
	CUG_NO VARCHAR(75) null,
	HOSP_SPECIALITY VARCHAR(75) null,
	HOSP_CITY VARCHAR(75) null,
	HOSP_ADDR1 VARCHAR(75) null,
	HOSP_ADDR2 VARCHAR(75) null,
	HOSP_ADDR3 VARCHAR(75) null,
	HOSP_FAX_NO VARCHAR(75) null,
	HOSP_EMAIL VARCHAR(75) null,
	HOSP_ACTIVE_YN VARCHAR(75) null,
	CRT_DT DATE null,
	CRT_USR VARCHAR(75) null,
	LST_UPD_DT DATE null,
	LST_UPD_USR VARCHAR(75) null,
	LANG_ID VARCHAR(75) null,
	HOSP_DIST_CD VARCHAR(75) null,
	HOSP_VIL_CD VARCHAR(75) null,
	ACCOUNT_NO VARCHAR(75) null,
	BANK_ID VARCHAR(75) null,
	DEPO_ID VARCHAR(75) null,
	HOSP_ACCOUNT_NAME VARCHAR(75) null,
	HOSP_TYPE VARCHAR(75) null,
	BILL_HEAD_NAME VARCHAR(75) null,
	BILL_HEAD_CONTACT_NO VARCHAR(75) null,
	BILL_HEAD_EMAIL VARCHAR(75) null,
	RAMCO_NAME VARCHAR(75) null,
	RAMCO_CONTACT_NO VARCHAR(75) null,
	RAMCO_EMAIL VARCHAR(75) null,
	AMCCO_NAME VARCHAR(75) null,
	AMCCO_CONTACT_NO VARCHAR(75) null,
	AMCCO_EMAIL VARCHAR(75) null,
	DIST_ID VARCHAR(75) null,
	DELIST_SUSP_REMARKS VARCHAR(75) null,
	HOSP_EMPNL_REF_NUM VARCHAR(75) null,
	PAYMENTS VARCHAR(75) null,
	HOSP_CATEGORY VARCHAR(75) null,
	ONBED_PATIENTS INTEGER,
	GOVT_HOSP_TYPE VARCHAR(75) null,
	LST_UPD_STATUS_DT DATE null,
	LST_UPD_STATUS_USR VARCHAR(75) null,
	HOSP_NOTICE VARCHAR(75) null,
	TDS_EXEMP_STATUS VARCHAR(75) null,
	TDS_FROM_DT DATE null,
	TDS_TO_DT DATE null,
	TDS_REMARKS VARCHAR(75) null,
	EXEMP_REF_NO VARCHAR(75) null,
	PAN_int VARCHAR(75) null,
	REV_FUND_ACTIVE VARCHAR(75) null,
	COMPLAINT_TYPE VARCHAR(75) null,
	PAN_HOLDER_NAME VARCHAR(75) null,
	HOSP_EMPNL_DATE DATE null,
	HOSP_ESTAB_YR VARCHAR(75) null,
	HOSP_AMCCO_QUAL VARCHAR(75) null,
	HOSP_RAMCO_QUAL VARCHAR(75) null,
	HOSP_BILLINGHEAD_QUAL VARCHAR(75) null,
	USR_MACID VARCHAR(75) null,
	HOSP_MACID VARCHAR(75) null,
	BIOM_REQUIRED VARCHAR(75) null,
	ORG_TYPE VARCHAR(75) null,
	DLIST_CLAIM_CONFM VARCHAR(75) null,
	DCT_FUND_ACTIVE VARCHAR(75) null,
	ISACTIVE_TG VARCHAR(75) null,
	ISACTIVE_AP VARCHAR(75) null,
	COMPLAINT_TYPE_TG VARCHAR(75) null,
	BLOCK_CLAIMS_TG VARCHAR(75) null,
	APPLICATION_TYPE VARCHAR(75) null,
	AP_ACCOUNT_NO VARCHAR(75) null,
	AP_BANK_ID VARCHAR(75) null,
	AP_HOSP_ACCOUNT_NAME VARCHAR(75) null,
	BIOM_REQUIRED_AP VARCHAR(75) null,
	MEDCO_LOGIN_CREATED VARCHAR(75) null,
	DIST_ID_OLD VARCHAR(75) null,
	AP_PATIENT_CARE_BANKID VARCHAR(75) null,
	AP_INCENTIVE_CARE_BANK_ID VARCHAR(75) null,
	PATIENT_CARE_ACCOUNT_NO VARCHAR(75) null,
	INCENTIVE_CARE_ACCOUNT_NO VARCHAR(75) null,
	AP_PATCARE_HOSP_AC_NAME VARCHAR(75) null,
	AP_INCCARE_HOSP_AC_NAME VARCHAR(75) null,
	ERR_MSGS VARCHAR(75) null,
	NHPM_UPD VARCHAR(75) null,
	EHS_REFERENCE_NUMBE VARCHAR(75) null,
	NHPM_UPD_ADD VARCHAR(75) null,
	ERR_MSGS_ADD VARCHAR(75) null,
	NHPM_UPM_HOSP_ATTACH VARCHAR(75) null,
	HOSP_NAME_TEL VARCHAR(75) null,
	INFRA_UPD VARCHAR(75) null,
	ERR_MSGS_INFRA VARCHAR(75) null,
	COVID_NWH_STATUS VARCHAR(75) null,
	TEMPORARY_HOSPITAL VARCHAR(75) null,
	NHPM_HOSP_ID VARCHAR(75) null,
	NHPM_UPD_DT DATE null,
	NHPM_UPD_ADD_DT DATE null,
	NHPM_UPD_HOSP_ATTACH_DT DATE null,
	INFRA_UPD_DT DATE null,
	RESPONSE_CNT VARCHAR(75) null,
	ERR_MSGS_HOSP_ATTACH VARCHAR(75) null,
	PAN_NUMBER VARCHAR(75) null
);

create table asrim_locations (
	LOC_ID VARCHAR(75) not null primary key,
	LOC_NAME VARCHAR(75) null,
	LOC_PARNT_ID VARCHAR(75) null,
	LOC_ORDER VARCHAR(75) null,
	LOC_DESC VARCHAR(75) null,
	LOC_VAL VARCHAR(75) null,
	LANG_ID VARCHAR(75) null,
	CRT_USR VARCHAR(75) null,
	CRT_DT DATE null,
	LST_UPD_USR VARCHAR(75) null,
	LST_UPD_DT DATE null,
	LOC_HDR_ID VARCHAR(75) null,
	ACTIVE_YN VARCHAR(75) null,
	ITDA VARCHAR(75) null,
	ITDA_AREA VARCHAR(75) null,
	URBAN_RURAL VARCHAR(75) null,
	PINCODE VARCHAR(75) null,
	IS_CRDA_LOCATION VARCHAR(75) null,
	EHS_LOCATION_ID VARCHAR(75) null,
	RURAL_URBAN VARCHAR(75) null,
	LOC_DESC_TEL VARCHAR(75) null,
	LOC_STATE_VAL VARCHAR(75) null
);