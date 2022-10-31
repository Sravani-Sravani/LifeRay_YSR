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

package com.kpmg.asrimTables.model.impl;

import com.kpmg.asrimTables.model.AsrimHospitals;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AsrimHospitals in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AsrimHospitalsCacheModel
	implements CacheModel<AsrimHospitals>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AsrimHospitalsCacheModel)) {
			return false;
		}

		AsrimHospitalsCacheModel asrimHospitalsCacheModel =
			(AsrimHospitalsCacheModel)object;

		if (HOSP_ID.equals(asrimHospitalsCacheModel.HOSP_ID)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, HOSP_ID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(205);

		sb.append("{HOSP_ID=");
		sb.append(HOSP_ID);
		sb.append(", HOSP_NAME=");
		sb.append(HOSP_NAME);
		sb.append(", HOSP_DISP_CODE=");
		sb.append(HOSP_DISP_CODE);
		sb.append(", HOSP_CONTACT_PERSON=");
		sb.append(HOSP_CONTACT_PERSON);
		sb.append(", HOSP_CONTACT_NO=");
		sb.append(HOSP_CONTACT_NO);
		sb.append(", HOSP_MITHRA=");
		sb.append(HOSP_MITHRA);
		sb.append(", CUG_NO=");
		sb.append(CUG_NO);
		sb.append(", HOSP_SPECIALITY=");
		sb.append(HOSP_SPECIALITY);
		sb.append(", HOSP_CITY=");
		sb.append(HOSP_CITY);
		sb.append(", HOSP_ADDR1=");
		sb.append(HOSP_ADDR1);
		sb.append(", HOSP_ADDR2=");
		sb.append(HOSP_ADDR2);
		sb.append(", HOSP_ADDR3=");
		sb.append(HOSP_ADDR3);
		sb.append(", HOSP_FAX_NO=");
		sb.append(HOSP_FAX_NO);
		sb.append(", HOSP_EMAIL=");
		sb.append(HOSP_EMAIL);
		sb.append(", HOSP_ACTIVE_YN=");
		sb.append(HOSP_ACTIVE_YN);
		sb.append(", CRT_DT=");
		sb.append(CRT_DT);
		sb.append(", CRT_USR=");
		sb.append(CRT_USR);
		sb.append(", LST_UPD_DT=");
		sb.append(LST_UPD_DT);
		sb.append(", LST_UPD_USR=");
		sb.append(LST_UPD_USR);
		sb.append(", LANG_ID=");
		sb.append(LANG_ID);
		sb.append(", HOSP_DIST_CD=");
		sb.append(HOSP_DIST_CD);
		sb.append(", HOSP_VIL_CD=");
		sb.append(HOSP_VIL_CD);
		sb.append(", ACCOUNT_NO=");
		sb.append(ACCOUNT_NO);
		sb.append(", BANK_ID=");
		sb.append(BANK_ID);
		sb.append(", DEPO_ID=");
		sb.append(DEPO_ID);
		sb.append(", HOSP_ACCOUNT_NAME=");
		sb.append(HOSP_ACCOUNT_NAME);
		sb.append(", HOSP_TYPE=");
		sb.append(HOSP_TYPE);
		sb.append(", BILL_HEAD_NAME=");
		sb.append(BILL_HEAD_NAME);
		sb.append(", BILL_HEAD_CONTACT_NO=");
		sb.append(BILL_HEAD_CONTACT_NO);
		sb.append(", BILL_HEAD_EMAIL=");
		sb.append(BILL_HEAD_EMAIL);
		sb.append(", RAMCO_NAME=");
		sb.append(RAMCO_NAME);
		sb.append(", RAMCO_CONTACT_NO=");
		sb.append(RAMCO_CONTACT_NO);
		sb.append(", RAMCO_EMAIL=");
		sb.append(RAMCO_EMAIL);
		sb.append(", AMCCO_NAME=");
		sb.append(AMCCO_NAME);
		sb.append(", AMCCO_CONTACT_NO=");
		sb.append(AMCCO_CONTACT_NO);
		sb.append(", AMCCO_EMAIL=");
		sb.append(AMCCO_EMAIL);
		sb.append(", DIST_ID=");
		sb.append(DIST_ID);
		sb.append(", DELIST_SUSP_REMARKS=");
		sb.append(DELIST_SUSP_REMARKS);
		sb.append(", HOSP_EMPNL_REF_NUM=");
		sb.append(HOSP_EMPNL_REF_NUM);
		sb.append(", PAYMENTS=");
		sb.append(PAYMENTS);
		sb.append(", HOSP_CATEGORY=");
		sb.append(HOSP_CATEGORY);
		sb.append(", ONBED_PATIENTS=");
		sb.append(ONBED_PATIENTS);
		sb.append(", GOVT_HOSP_TYPE=");
		sb.append(GOVT_HOSP_TYPE);
		sb.append(", LST_UPD_STATUS_DT=");
		sb.append(LST_UPD_STATUS_DT);
		sb.append(", LST_UPD_STATUS_USR=");
		sb.append(LST_UPD_STATUS_USR);
		sb.append(", HOSP_NOTICE=");
		sb.append(HOSP_NOTICE);
		sb.append(", TDS_EXEMP_STATUS=");
		sb.append(TDS_EXEMP_STATUS);
		sb.append(", TDS_FROM_DT=");
		sb.append(TDS_FROM_DT);
		sb.append(", TDS_TO_DT=");
		sb.append(TDS_TO_DT);
		sb.append(", TDS_REMARKS=");
		sb.append(TDS_REMARKS);
		sb.append(", EXEMP_REF_NO=");
		sb.append(EXEMP_REF_NO);
		sb.append(", PAN_int=");
		sb.append(PAN_int);
		sb.append(", REV_FUND_ACTIVE=");
		sb.append(REV_FUND_ACTIVE);
		sb.append(", COMPLAINT_TYPE=");
		sb.append(COMPLAINT_TYPE);
		sb.append(", PAN_HOLDER_NAME=");
		sb.append(PAN_HOLDER_NAME);
		sb.append(", HOSP_EMPNL_DATE=");
		sb.append(HOSP_EMPNL_DATE);
		sb.append(", HOSP_ESTAB_YR=");
		sb.append(HOSP_ESTAB_YR);
		sb.append(", HOSP_AMCCO_QUAL=");
		sb.append(HOSP_AMCCO_QUAL);
		sb.append(", HOSP_RAMCO_QUAL=");
		sb.append(HOSP_RAMCO_QUAL);
		sb.append(", HOSP_BILLINGHEAD_QUAL=");
		sb.append(HOSP_BILLINGHEAD_QUAL);
		sb.append(", USR_MACID=");
		sb.append(USR_MACID);
		sb.append(", HOSP_MACID=");
		sb.append(HOSP_MACID);
		sb.append(", BIOM_REQUIRED=");
		sb.append(BIOM_REQUIRED);
		sb.append(", ORG_TYPE=");
		sb.append(ORG_TYPE);
		sb.append(", DLIST_CLAIM_CONFM=");
		sb.append(DLIST_CLAIM_CONFM);
		sb.append(", DCT_FUND_ACTIVE=");
		sb.append(DCT_FUND_ACTIVE);
		sb.append(", ISACTIVE_TG=");
		sb.append(ISACTIVE_TG);
		sb.append(", ISACTIVE_AP=");
		sb.append(ISACTIVE_AP);
		sb.append(", COMPLAINT_TYPE_TG=");
		sb.append(COMPLAINT_TYPE_TG);
		sb.append(", BLOCK_CLAIMS_TG=");
		sb.append(BLOCK_CLAIMS_TG);
		sb.append(", APPLICATION_TYPE=");
		sb.append(APPLICATION_TYPE);
		sb.append(", AP_ACCOUNT_NO=");
		sb.append(AP_ACCOUNT_NO);
		sb.append(", AP_BANK_ID=");
		sb.append(AP_BANK_ID);
		sb.append(", AP_HOSP_ACCOUNT_NAME=");
		sb.append(AP_HOSP_ACCOUNT_NAME);
		sb.append(", BIOM_REQUIRED_AP=");
		sb.append(BIOM_REQUIRED_AP);
		sb.append(", MEDCO_LOGIN_CREATED=");
		sb.append(MEDCO_LOGIN_CREATED);
		sb.append(", DIST_ID_OLD=");
		sb.append(DIST_ID_OLD);
		sb.append(", AP_PATIENT_CARE_BANKID=");
		sb.append(AP_PATIENT_CARE_BANKID);
		sb.append(", AP_INCENTIVE_CARE_BANK_ID=");
		sb.append(AP_INCENTIVE_CARE_BANK_ID);
		sb.append(", PATIENT_CARE_ACCOUNT_NO=");
		sb.append(PATIENT_CARE_ACCOUNT_NO);
		sb.append(", INCENTIVE_CARE_ACCOUNT_NO=");
		sb.append(INCENTIVE_CARE_ACCOUNT_NO);
		sb.append(", AP_PATCARE_HOSP_AC_NAME=");
		sb.append(AP_PATCARE_HOSP_AC_NAME);
		sb.append(", AP_INCCARE_HOSP_AC_NAME=");
		sb.append(AP_INCCARE_HOSP_AC_NAME);
		sb.append(", ERR_MSGS=");
		sb.append(ERR_MSGS);
		sb.append(", NHPM_UPD=");
		sb.append(NHPM_UPD);
		sb.append(", EHS_REFERENCE_NUMBE=");
		sb.append(EHS_REFERENCE_NUMBE);
		sb.append(", NHPM_UPD_ADD=");
		sb.append(NHPM_UPD_ADD);
		sb.append(", ERR_MSGS_ADD=");
		sb.append(ERR_MSGS_ADD);
		sb.append(", NHPM_UPM_HOSP_ATTACH=");
		sb.append(NHPM_UPM_HOSP_ATTACH);
		sb.append(", HOSP_NAME_TEL=");
		sb.append(HOSP_NAME_TEL);
		sb.append(", INFRA_UPD=");
		sb.append(INFRA_UPD);
		sb.append(", ERR_MSGS_INFRA=");
		sb.append(ERR_MSGS_INFRA);
		sb.append(", COVID_NWH_STATUS=");
		sb.append(COVID_NWH_STATUS);
		sb.append(", TEMPORARY_HOSPITAL=");
		sb.append(TEMPORARY_HOSPITAL);
		sb.append(", NHPM_HOSP_ID=");
		sb.append(NHPM_HOSP_ID);
		sb.append(", NHPM_UPD_DT=");
		sb.append(NHPM_UPD_DT);
		sb.append(", NHPM_UPD_ADD_DT=");
		sb.append(NHPM_UPD_ADD_DT);
		sb.append(", NHPM_UPD_HOSP_ATTACH_DT=");
		sb.append(NHPM_UPD_HOSP_ATTACH_DT);
		sb.append(", INFRA_UPD_DT=");
		sb.append(INFRA_UPD_DT);
		sb.append(", RESPONSE_CNT=");
		sb.append(RESPONSE_CNT);
		sb.append(", ERR_MSGS_HOSP_ATTACH=");
		sb.append(ERR_MSGS_HOSP_ATTACH);
		sb.append(", PAN_NUMBER=");
		sb.append(PAN_NUMBER);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AsrimHospitals toEntityModel() {
		AsrimHospitalsImpl asrimHospitalsImpl = new AsrimHospitalsImpl();

		if (HOSP_ID == null) {
			asrimHospitalsImpl.setHOSP_ID("");
		}
		else {
			asrimHospitalsImpl.setHOSP_ID(HOSP_ID);
		}

		if (HOSP_NAME == null) {
			asrimHospitalsImpl.setHOSP_NAME("");
		}
		else {
			asrimHospitalsImpl.setHOSP_NAME(HOSP_NAME);
		}

		if (HOSP_DISP_CODE == null) {
			asrimHospitalsImpl.setHOSP_DISP_CODE("");
		}
		else {
			asrimHospitalsImpl.setHOSP_DISP_CODE(HOSP_DISP_CODE);
		}

		if (HOSP_CONTACT_PERSON == null) {
			asrimHospitalsImpl.setHOSP_CONTACT_PERSON("");
		}
		else {
			asrimHospitalsImpl.setHOSP_CONTACT_PERSON(HOSP_CONTACT_PERSON);
		}

		if (HOSP_CONTACT_NO == null) {
			asrimHospitalsImpl.setHOSP_CONTACT_NO("");
		}
		else {
			asrimHospitalsImpl.setHOSP_CONTACT_NO(HOSP_CONTACT_NO);
		}

		if (HOSP_MITHRA == null) {
			asrimHospitalsImpl.setHOSP_MITHRA("");
		}
		else {
			asrimHospitalsImpl.setHOSP_MITHRA(HOSP_MITHRA);
		}

		if (CUG_NO == null) {
			asrimHospitalsImpl.setCUG_NO("");
		}
		else {
			asrimHospitalsImpl.setCUG_NO(CUG_NO);
		}

		if (HOSP_SPECIALITY == null) {
			asrimHospitalsImpl.setHOSP_SPECIALITY("");
		}
		else {
			asrimHospitalsImpl.setHOSP_SPECIALITY(HOSP_SPECIALITY);
		}

		if (HOSP_CITY == null) {
			asrimHospitalsImpl.setHOSP_CITY("");
		}
		else {
			asrimHospitalsImpl.setHOSP_CITY(HOSP_CITY);
		}

		if (HOSP_ADDR1 == null) {
			asrimHospitalsImpl.setHOSP_ADDR1("");
		}
		else {
			asrimHospitalsImpl.setHOSP_ADDR1(HOSP_ADDR1);
		}

		if (HOSP_ADDR2 == null) {
			asrimHospitalsImpl.setHOSP_ADDR2("");
		}
		else {
			asrimHospitalsImpl.setHOSP_ADDR2(HOSP_ADDR2);
		}

		if (HOSP_ADDR3 == null) {
			asrimHospitalsImpl.setHOSP_ADDR3("");
		}
		else {
			asrimHospitalsImpl.setHOSP_ADDR3(HOSP_ADDR3);
		}

		if (HOSP_FAX_NO == null) {
			asrimHospitalsImpl.setHOSP_FAX_NO("");
		}
		else {
			asrimHospitalsImpl.setHOSP_FAX_NO(HOSP_FAX_NO);
		}

		if (HOSP_EMAIL == null) {
			asrimHospitalsImpl.setHOSP_EMAIL("");
		}
		else {
			asrimHospitalsImpl.setHOSP_EMAIL(HOSP_EMAIL);
		}

		if (HOSP_ACTIVE_YN == null) {
			asrimHospitalsImpl.setHOSP_ACTIVE_YN("");
		}
		else {
			asrimHospitalsImpl.setHOSP_ACTIVE_YN(HOSP_ACTIVE_YN);
		}

		if (CRT_DT == Long.MIN_VALUE) {
			asrimHospitalsImpl.setCRT_DT(null);
		}
		else {
			asrimHospitalsImpl.setCRT_DT(new Date(CRT_DT));
		}

		if (CRT_USR == null) {
			asrimHospitalsImpl.setCRT_USR("");
		}
		else {
			asrimHospitalsImpl.setCRT_USR(CRT_USR);
		}

		if (LST_UPD_DT == Long.MIN_VALUE) {
			asrimHospitalsImpl.setLST_UPD_DT(null);
		}
		else {
			asrimHospitalsImpl.setLST_UPD_DT(new Date(LST_UPD_DT));
		}

		if (LST_UPD_USR == null) {
			asrimHospitalsImpl.setLST_UPD_USR("");
		}
		else {
			asrimHospitalsImpl.setLST_UPD_USR(LST_UPD_USR);
		}

		if (LANG_ID == null) {
			asrimHospitalsImpl.setLANG_ID("");
		}
		else {
			asrimHospitalsImpl.setLANG_ID(LANG_ID);
		}

		if (HOSP_DIST_CD == null) {
			asrimHospitalsImpl.setHOSP_DIST_CD("");
		}
		else {
			asrimHospitalsImpl.setHOSP_DIST_CD(HOSP_DIST_CD);
		}

		if (HOSP_VIL_CD == null) {
			asrimHospitalsImpl.setHOSP_VIL_CD("");
		}
		else {
			asrimHospitalsImpl.setHOSP_VIL_CD(HOSP_VIL_CD);
		}

		if (ACCOUNT_NO == null) {
			asrimHospitalsImpl.setACCOUNT_NO("");
		}
		else {
			asrimHospitalsImpl.setACCOUNT_NO(ACCOUNT_NO);
		}

		if (BANK_ID == null) {
			asrimHospitalsImpl.setBANK_ID("");
		}
		else {
			asrimHospitalsImpl.setBANK_ID(BANK_ID);
		}

		if (DEPO_ID == null) {
			asrimHospitalsImpl.setDEPO_ID("");
		}
		else {
			asrimHospitalsImpl.setDEPO_ID(DEPO_ID);
		}

		if (HOSP_ACCOUNT_NAME == null) {
			asrimHospitalsImpl.setHOSP_ACCOUNT_NAME("");
		}
		else {
			asrimHospitalsImpl.setHOSP_ACCOUNT_NAME(HOSP_ACCOUNT_NAME);
		}

		if (HOSP_TYPE == null) {
			asrimHospitalsImpl.setHOSP_TYPE("");
		}
		else {
			asrimHospitalsImpl.setHOSP_TYPE(HOSP_TYPE);
		}

		if (BILL_HEAD_NAME == null) {
			asrimHospitalsImpl.setBILL_HEAD_NAME("");
		}
		else {
			asrimHospitalsImpl.setBILL_HEAD_NAME(BILL_HEAD_NAME);
		}

		if (BILL_HEAD_CONTACT_NO == null) {
			asrimHospitalsImpl.setBILL_HEAD_CONTACT_NO("");
		}
		else {
			asrimHospitalsImpl.setBILL_HEAD_CONTACT_NO(BILL_HEAD_CONTACT_NO);
		}

		if (BILL_HEAD_EMAIL == null) {
			asrimHospitalsImpl.setBILL_HEAD_EMAIL("");
		}
		else {
			asrimHospitalsImpl.setBILL_HEAD_EMAIL(BILL_HEAD_EMAIL);
		}

		if (RAMCO_NAME == null) {
			asrimHospitalsImpl.setRAMCO_NAME("");
		}
		else {
			asrimHospitalsImpl.setRAMCO_NAME(RAMCO_NAME);
		}

		if (RAMCO_CONTACT_NO == null) {
			asrimHospitalsImpl.setRAMCO_CONTACT_NO("");
		}
		else {
			asrimHospitalsImpl.setRAMCO_CONTACT_NO(RAMCO_CONTACT_NO);
		}

		if (RAMCO_EMAIL == null) {
			asrimHospitalsImpl.setRAMCO_EMAIL("");
		}
		else {
			asrimHospitalsImpl.setRAMCO_EMAIL(RAMCO_EMAIL);
		}

		if (AMCCO_NAME == null) {
			asrimHospitalsImpl.setAMCCO_NAME("");
		}
		else {
			asrimHospitalsImpl.setAMCCO_NAME(AMCCO_NAME);
		}

		if (AMCCO_CONTACT_NO == null) {
			asrimHospitalsImpl.setAMCCO_CONTACT_NO("");
		}
		else {
			asrimHospitalsImpl.setAMCCO_CONTACT_NO(AMCCO_CONTACT_NO);
		}

		if (AMCCO_EMAIL == null) {
			asrimHospitalsImpl.setAMCCO_EMAIL("");
		}
		else {
			asrimHospitalsImpl.setAMCCO_EMAIL(AMCCO_EMAIL);
		}

		if (DIST_ID == null) {
			asrimHospitalsImpl.setDIST_ID("");
		}
		else {
			asrimHospitalsImpl.setDIST_ID(DIST_ID);
		}

		if (DELIST_SUSP_REMARKS == null) {
			asrimHospitalsImpl.setDELIST_SUSP_REMARKS("");
		}
		else {
			asrimHospitalsImpl.setDELIST_SUSP_REMARKS(DELIST_SUSP_REMARKS);
		}

		if (HOSP_EMPNL_REF_NUM == null) {
			asrimHospitalsImpl.setHOSP_EMPNL_REF_NUM("");
		}
		else {
			asrimHospitalsImpl.setHOSP_EMPNL_REF_NUM(HOSP_EMPNL_REF_NUM);
		}

		if (PAYMENTS == null) {
			asrimHospitalsImpl.setPAYMENTS("");
		}
		else {
			asrimHospitalsImpl.setPAYMENTS(PAYMENTS);
		}

		if (HOSP_CATEGORY == null) {
			asrimHospitalsImpl.setHOSP_CATEGORY("");
		}
		else {
			asrimHospitalsImpl.setHOSP_CATEGORY(HOSP_CATEGORY);
		}

		asrimHospitalsImpl.setONBED_PATIENTS(ONBED_PATIENTS);

		if (GOVT_HOSP_TYPE == null) {
			asrimHospitalsImpl.setGOVT_HOSP_TYPE("");
		}
		else {
			asrimHospitalsImpl.setGOVT_HOSP_TYPE(GOVT_HOSP_TYPE);
		}

		if (LST_UPD_STATUS_DT == Long.MIN_VALUE) {
			asrimHospitalsImpl.setLST_UPD_STATUS_DT(null);
		}
		else {
			asrimHospitalsImpl.setLST_UPD_STATUS_DT(
				new Date(LST_UPD_STATUS_DT));
		}

		if (LST_UPD_STATUS_USR == null) {
			asrimHospitalsImpl.setLST_UPD_STATUS_USR("");
		}
		else {
			asrimHospitalsImpl.setLST_UPD_STATUS_USR(LST_UPD_STATUS_USR);
		}

		if (HOSP_NOTICE == null) {
			asrimHospitalsImpl.setHOSP_NOTICE("");
		}
		else {
			asrimHospitalsImpl.setHOSP_NOTICE(HOSP_NOTICE);
		}

		if (TDS_EXEMP_STATUS == null) {
			asrimHospitalsImpl.setTDS_EXEMP_STATUS("");
		}
		else {
			asrimHospitalsImpl.setTDS_EXEMP_STATUS(TDS_EXEMP_STATUS);
		}

		if (TDS_FROM_DT == Long.MIN_VALUE) {
			asrimHospitalsImpl.setTDS_FROM_DT(null);
		}
		else {
			asrimHospitalsImpl.setTDS_FROM_DT(new Date(TDS_FROM_DT));
		}

		if (TDS_TO_DT == Long.MIN_VALUE) {
			asrimHospitalsImpl.setTDS_TO_DT(null);
		}
		else {
			asrimHospitalsImpl.setTDS_TO_DT(new Date(TDS_TO_DT));
		}

		if (TDS_REMARKS == null) {
			asrimHospitalsImpl.setTDS_REMARKS("");
		}
		else {
			asrimHospitalsImpl.setTDS_REMARKS(TDS_REMARKS);
		}

		if (EXEMP_REF_NO == null) {
			asrimHospitalsImpl.setEXEMP_REF_NO("");
		}
		else {
			asrimHospitalsImpl.setEXEMP_REF_NO(EXEMP_REF_NO);
		}

		if (PAN_int == null) {
			asrimHospitalsImpl.setPAN_int("");
		}
		else {
			asrimHospitalsImpl.setPAN_int(PAN_int);
		}

		if (REV_FUND_ACTIVE == null) {
			asrimHospitalsImpl.setREV_FUND_ACTIVE("");
		}
		else {
			asrimHospitalsImpl.setREV_FUND_ACTIVE(REV_FUND_ACTIVE);
		}

		if (COMPLAINT_TYPE == null) {
			asrimHospitalsImpl.setCOMPLAINT_TYPE("");
		}
		else {
			asrimHospitalsImpl.setCOMPLAINT_TYPE(COMPLAINT_TYPE);
		}

		if (PAN_HOLDER_NAME == null) {
			asrimHospitalsImpl.setPAN_HOLDER_NAME("");
		}
		else {
			asrimHospitalsImpl.setPAN_HOLDER_NAME(PAN_HOLDER_NAME);
		}

		if (HOSP_EMPNL_DATE == Long.MIN_VALUE) {
			asrimHospitalsImpl.setHOSP_EMPNL_DATE(null);
		}
		else {
			asrimHospitalsImpl.setHOSP_EMPNL_DATE(new Date(HOSP_EMPNL_DATE));
		}

		if (HOSP_ESTAB_YR == null) {
			asrimHospitalsImpl.setHOSP_ESTAB_YR("");
		}
		else {
			asrimHospitalsImpl.setHOSP_ESTAB_YR(HOSP_ESTAB_YR);
		}

		if (HOSP_AMCCO_QUAL == null) {
			asrimHospitalsImpl.setHOSP_AMCCO_QUAL("");
		}
		else {
			asrimHospitalsImpl.setHOSP_AMCCO_QUAL(HOSP_AMCCO_QUAL);
		}

		if (HOSP_RAMCO_QUAL == null) {
			asrimHospitalsImpl.setHOSP_RAMCO_QUAL("");
		}
		else {
			asrimHospitalsImpl.setHOSP_RAMCO_QUAL(HOSP_RAMCO_QUAL);
		}

		if (HOSP_BILLINGHEAD_QUAL == null) {
			asrimHospitalsImpl.setHOSP_BILLINGHEAD_QUAL("");
		}
		else {
			asrimHospitalsImpl.setHOSP_BILLINGHEAD_QUAL(HOSP_BILLINGHEAD_QUAL);
		}

		if (USR_MACID == null) {
			asrimHospitalsImpl.setUSR_MACID("");
		}
		else {
			asrimHospitalsImpl.setUSR_MACID(USR_MACID);
		}

		if (HOSP_MACID == null) {
			asrimHospitalsImpl.setHOSP_MACID("");
		}
		else {
			asrimHospitalsImpl.setHOSP_MACID(HOSP_MACID);
		}

		if (BIOM_REQUIRED == null) {
			asrimHospitalsImpl.setBIOM_REQUIRED("");
		}
		else {
			asrimHospitalsImpl.setBIOM_REQUIRED(BIOM_REQUIRED);
		}

		if (ORG_TYPE == null) {
			asrimHospitalsImpl.setORG_TYPE("");
		}
		else {
			asrimHospitalsImpl.setORG_TYPE(ORG_TYPE);
		}

		if (DLIST_CLAIM_CONFM == null) {
			asrimHospitalsImpl.setDLIST_CLAIM_CONFM("");
		}
		else {
			asrimHospitalsImpl.setDLIST_CLAIM_CONFM(DLIST_CLAIM_CONFM);
		}

		if (DCT_FUND_ACTIVE == null) {
			asrimHospitalsImpl.setDCT_FUND_ACTIVE("");
		}
		else {
			asrimHospitalsImpl.setDCT_FUND_ACTIVE(DCT_FUND_ACTIVE);
		}

		if (ISACTIVE_TG == null) {
			asrimHospitalsImpl.setISACTIVE_TG("");
		}
		else {
			asrimHospitalsImpl.setISACTIVE_TG(ISACTIVE_TG);
		}

		if (ISACTIVE_AP == null) {
			asrimHospitalsImpl.setISACTIVE_AP("");
		}
		else {
			asrimHospitalsImpl.setISACTIVE_AP(ISACTIVE_AP);
		}

		if (COMPLAINT_TYPE_TG == null) {
			asrimHospitalsImpl.setCOMPLAINT_TYPE_TG("");
		}
		else {
			asrimHospitalsImpl.setCOMPLAINT_TYPE_TG(COMPLAINT_TYPE_TG);
		}

		if (BLOCK_CLAIMS_TG == null) {
			asrimHospitalsImpl.setBLOCK_CLAIMS_TG("");
		}
		else {
			asrimHospitalsImpl.setBLOCK_CLAIMS_TG(BLOCK_CLAIMS_TG);
		}

		if (APPLICATION_TYPE == null) {
			asrimHospitalsImpl.setAPPLICATION_TYPE("");
		}
		else {
			asrimHospitalsImpl.setAPPLICATION_TYPE(APPLICATION_TYPE);
		}

		if (AP_ACCOUNT_NO == null) {
			asrimHospitalsImpl.setAP_ACCOUNT_NO("");
		}
		else {
			asrimHospitalsImpl.setAP_ACCOUNT_NO(AP_ACCOUNT_NO);
		}

		if (AP_BANK_ID == null) {
			asrimHospitalsImpl.setAP_BANK_ID("");
		}
		else {
			asrimHospitalsImpl.setAP_BANK_ID(AP_BANK_ID);
		}

		if (AP_HOSP_ACCOUNT_NAME == null) {
			asrimHospitalsImpl.setAP_HOSP_ACCOUNT_NAME("");
		}
		else {
			asrimHospitalsImpl.setAP_HOSP_ACCOUNT_NAME(AP_HOSP_ACCOUNT_NAME);
		}

		if (BIOM_REQUIRED_AP == null) {
			asrimHospitalsImpl.setBIOM_REQUIRED_AP("");
		}
		else {
			asrimHospitalsImpl.setBIOM_REQUIRED_AP(BIOM_REQUIRED_AP);
		}

		if (MEDCO_LOGIN_CREATED == null) {
			asrimHospitalsImpl.setMEDCO_LOGIN_CREATED("");
		}
		else {
			asrimHospitalsImpl.setMEDCO_LOGIN_CREATED(MEDCO_LOGIN_CREATED);
		}

		if (DIST_ID_OLD == null) {
			asrimHospitalsImpl.setDIST_ID_OLD("");
		}
		else {
			asrimHospitalsImpl.setDIST_ID_OLD(DIST_ID_OLD);
		}

		if (AP_PATIENT_CARE_BANKID == null) {
			asrimHospitalsImpl.setAP_PATIENT_CARE_BANKID("");
		}
		else {
			asrimHospitalsImpl.setAP_PATIENT_CARE_BANKID(
				AP_PATIENT_CARE_BANKID);
		}

		if (AP_INCENTIVE_CARE_BANK_ID == null) {
			asrimHospitalsImpl.setAP_INCENTIVE_CARE_BANK_ID("");
		}
		else {
			asrimHospitalsImpl.setAP_INCENTIVE_CARE_BANK_ID(
				AP_INCENTIVE_CARE_BANK_ID);
		}

		if (PATIENT_CARE_ACCOUNT_NO == null) {
			asrimHospitalsImpl.setPATIENT_CARE_ACCOUNT_NO("");
		}
		else {
			asrimHospitalsImpl.setPATIENT_CARE_ACCOUNT_NO(
				PATIENT_CARE_ACCOUNT_NO);
		}

		if (INCENTIVE_CARE_ACCOUNT_NO == null) {
			asrimHospitalsImpl.setINCENTIVE_CARE_ACCOUNT_NO("");
		}
		else {
			asrimHospitalsImpl.setINCENTIVE_CARE_ACCOUNT_NO(
				INCENTIVE_CARE_ACCOUNT_NO);
		}

		if (AP_PATCARE_HOSP_AC_NAME == null) {
			asrimHospitalsImpl.setAP_PATCARE_HOSP_AC_NAME("");
		}
		else {
			asrimHospitalsImpl.setAP_PATCARE_HOSP_AC_NAME(
				AP_PATCARE_HOSP_AC_NAME);
		}

		if (AP_INCCARE_HOSP_AC_NAME == null) {
			asrimHospitalsImpl.setAP_INCCARE_HOSP_AC_NAME("");
		}
		else {
			asrimHospitalsImpl.setAP_INCCARE_HOSP_AC_NAME(
				AP_INCCARE_HOSP_AC_NAME);
		}

		if (ERR_MSGS == null) {
			asrimHospitalsImpl.setERR_MSGS("");
		}
		else {
			asrimHospitalsImpl.setERR_MSGS(ERR_MSGS);
		}

		if (NHPM_UPD == null) {
			asrimHospitalsImpl.setNHPM_UPD("");
		}
		else {
			asrimHospitalsImpl.setNHPM_UPD(NHPM_UPD);
		}

		if (EHS_REFERENCE_NUMBE == null) {
			asrimHospitalsImpl.setEHS_REFERENCE_NUMBE("");
		}
		else {
			asrimHospitalsImpl.setEHS_REFERENCE_NUMBE(EHS_REFERENCE_NUMBE);
		}

		if (NHPM_UPD_ADD == null) {
			asrimHospitalsImpl.setNHPM_UPD_ADD("");
		}
		else {
			asrimHospitalsImpl.setNHPM_UPD_ADD(NHPM_UPD_ADD);
		}

		if (ERR_MSGS_ADD == null) {
			asrimHospitalsImpl.setERR_MSGS_ADD("");
		}
		else {
			asrimHospitalsImpl.setERR_MSGS_ADD(ERR_MSGS_ADD);
		}

		if (NHPM_UPM_HOSP_ATTACH == null) {
			asrimHospitalsImpl.setNHPM_UPM_HOSP_ATTACH("");
		}
		else {
			asrimHospitalsImpl.setNHPM_UPM_HOSP_ATTACH(NHPM_UPM_HOSP_ATTACH);
		}

		if (HOSP_NAME_TEL == null) {
			asrimHospitalsImpl.setHOSP_NAME_TEL("");
		}
		else {
			asrimHospitalsImpl.setHOSP_NAME_TEL(HOSP_NAME_TEL);
		}

		if (INFRA_UPD == null) {
			asrimHospitalsImpl.setINFRA_UPD("");
		}
		else {
			asrimHospitalsImpl.setINFRA_UPD(INFRA_UPD);
		}

		if (ERR_MSGS_INFRA == null) {
			asrimHospitalsImpl.setERR_MSGS_INFRA("");
		}
		else {
			asrimHospitalsImpl.setERR_MSGS_INFRA(ERR_MSGS_INFRA);
		}

		if (COVID_NWH_STATUS == null) {
			asrimHospitalsImpl.setCOVID_NWH_STATUS("");
		}
		else {
			asrimHospitalsImpl.setCOVID_NWH_STATUS(COVID_NWH_STATUS);
		}

		if (TEMPORARY_HOSPITAL == null) {
			asrimHospitalsImpl.setTEMPORARY_HOSPITAL("");
		}
		else {
			asrimHospitalsImpl.setTEMPORARY_HOSPITAL(TEMPORARY_HOSPITAL);
		}

		if (NHPM_HOSP_ID == null) {
			asrimHospitalsImpl.setNHPM_HOSP_ID("");
		}
		else {
			asrimHospitalsImpl.setNHPM_HOSP_ID(NHPM_HOSP_ID);
		}

		if (NHPM_UPD_DT == Long.MIN_VALUE) {
			asrimHospitalsImpl.setNHPM_UPD_DT(null);
		}
		else {
			asrimHospitalsImpl.setNHPM_UPD_DT(new Date(NHPM_UPD_DT));
		}

		if (NHPM_UPD_ADD_DT == Long.MIN_VALUE) {
			asrimHospitalsImpl.setNHPM_UPD_ADD_DT(null);
		}
		else {
			asrimHospitalsImpl.setNHPM_UPD_ADD_DT(new Date(NHPM_UPD_ADD_DT));
		}

		if (NHPM_UPD_HOSP_ATTACH_DT == Long.MIN_VALUE) {
			asrimHospitalsImpl.setNHPM_UPD_HOSP_ATTACH_DT(null);
		}
		else {
			asrimHospitalsImpl.setNHPM_UPD_HOSP_ATTACH_DT(
				new Date(NHPM_UPD_HOSP_ATTACH_DT));
		}

		if (INFRA_UPD_DT == Long.MIN_VALUE) {
			asrimHospitalsImpl.setINFRA_UPD_DT(null);
		}
		else {
			asrimHospitalsImpl.setINFRA_UPD_DT(new Date(INFRA_UPD_DT));
		}

		if (RESPONSE_CNT == null) {
			asrimHospitalsImpl.setRESPONSE_CNT("");
		}
		else {
			asrimHospitalsImpl.setRESPONSE_CNT(RESPONSE_CNT);
		}

		if (ERR_MSGS_HOSP_ATTACH == null) {
			asrimHospitalsImpl.setERR_MSGS_HOSP_ATTACH("");
		}
		else {
			asrimHospitalsImpl.setERR_MSGS_HOSP_ATTACH(ERR_MSGS_HOSP_ATTACH);
		}

		if (PAN_NUMBER == null) {
			asrimHospitalsImpl.setPAN_NUMBER("");
		}
		else {
			asrimHospitalsImpl.setPAN_NUMBER(PAN_NUMBER);
		}

		asrimHospitalsImpl.resetOriginalValues();

		return asrimHospitalsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		HOSP_ID = objectInput.readUTF();
		HOSP_NAME = objectInput.readUTF();
		HOSP_DISP_CODE = objectInput.readUTF();
		HOSP_CONTACT_PERSON = objectInput.readUTF();
		HOSP_CONTACT_NO = objectInput.readUTF();
		HOSP_MITHRA = objectInput.readUTF();
		CUG_NO = objectInput.readUTF();
		HOSP_SPECIALITY = objectInput.readUTF();
		HOSP_CITY = objectInput.readUTF();
		HOSP_ADDR1 = objectInput.readUTF();
		HOSP_ADDR2 = objectInput.readUTF();
		HOSP_ADDR3 = objectInput.readUTF();
		HOSP_FAX_NO = objectInput.readUTF();
		HOSP_EMAIL = objectInput.readUTF();
		HOSP_ACTIVE_YN = objectInput.readUTF();
		CRT_DT = objectInput.readLong();
		CRT_USR = objectInput.readUTF();
		LST_UPD_DT = objectInput.readLong();
		LST_UPD_USR = objectInput.readUTF();
		LANG_ID = objectInput.readUTF();
		HOSP_DIST_CD = objectInput.readUTF();
		HOSP_VIL_CD = objectInput.readUTF();
		ACCOUNT_NO = objectInput.readUTF();
		BANK_ID = objectInput.readUTF();
		DEPO_ID = objectInput.readUTF();
		HOSP_ACCOUNT_NAME = objectInput.readUTF();
		HOSP_TYPE = objectInput.readUTF();
		BILL_HEAD_NAME = objectInput.readUTF();
		BILL_HEAD_CONTACT_NO = objectInput.readUTF();
		BILL_HEAD_EMAIL = objectInput.readUTF();
		RAMCO_NAME = objectInput.readUTF();
		RAMCO_CONTACT_NO = objectInput.readUTF();
		RAMCO_EMAIL = objectInput.readUTF();
		AMCCO_NAME = objectInput.readUTF();
		AMCCO_CONTACT_NO = objectInput.readUTF();
		AMCCO_EMAIL = objectInput.readUTF();
		DIST_ID = objectInput.readUTF();
		DELIST_SUSP_REMARKS = objectInput.readUTF();
		HOSP_EMPNL_REF_NUM = objectInput.readUTF();
		PAYMENTS = objectInput.readUTF();
		HOSP_CATEGORY = objectInput.readUTF();

		ONBED_PATIENTS = objectInput.readInt();
		GOVT_HOSP_TYPE = objectInput.readUTF();
		LST_UPD_STATUS_DT = objectInput.readLong();
		LST_UPD_STATUS_USR = objectInput.readUTF();
		HOSP_NOTICE = objectInput.readUTF();
		TDS_EXEMP_STATUS = objectInput.readUTF();
		TDS_FROM_DT = objectInput.readLong();
		TDS_TO_DT = objectInput.readLong();
		TDS_REMARKS = objectInput.readUTF();
		EXEMP_REF_NO = objectInput.readUTF();
		PAN_int = objectInput.readUTF();
		REV_FUND_ACTIVE = objectInput.readUTF();
		COMPLAINT_TYPE = objectInput.readUTF();
		PAN_HOLDER_NAME = objectInput.readUTF();
		HOSP_EMPNL_DATE = objectInput.readLong();
		HOSP_ESTAB_YR = objectInput.readUTF();
		HOSP_AMCCO_QUAL = objectInput.readUTF();
		HOSP_RAMCO_QUAL = objectInput.readUTF();
		HOSP_BILLINGHEAD_QUAL = objectInput.readUTF();
		USR_MACID = objectInput.readUTF();
		HOSP_MACID = objectInput.readUTF();
		BIOM_REQUIRED = objectInput.readUTF();
		ORG_TYPE = objectInput.readUTF();
		DLIST_CLAIM_CONFM = objectInput.readUTF();
		DCT_FUND_ACTIVE = objectInput.readUTF();
		ISACTIVE_TG = objectInput.readUTF();
		ISACTIVE_AP = objectInput.readUTF();
		COMPLAINT_TYPE_TG = objectInput.readUTF();
		BLOCK_CLAIMS_TG = objectInput.readUTF();
		APPLICATION_TYPE = objectInput.readUTF();
		AP_ACCOUNT_NO = objectInput.readUTF();
		AP_BANK_ID = objectInput.readUTF();
		AP_HOSP_ACCOUNT_NAME = objectInput.readUTF();
		BIOM_REQUIRED_AP = objectInput.readUTF();
		MEDCO_LOGIN_CREATED = objectInput.readUTF();
		DIST_ID_OLD = objectInput.readUTF();
		AP_PATIENT_CARE_BANKID = objectInput.readUTF();
		AP_INCENTIVE_CARE_BANK_ID = objectInput.readUTF();
		PATIENT_CARE_ACCOUNT_NO = objectInput.readUTF();
		INCENTIVE_CARE_ACCOUNT_NO = objectInput.readUTF();
		AP_PATCARE_HOSP_AC_NAME = objectInput.readUTF();
		AP_INCCARE_HOSP_AC_NAME = objectInput.readUTF();
		ERR_MSGS = objectInput.readUTF();
		NHPM_UPD = objectInput.readUTF();
		EHS_REFERENCE_NUMBE = objectInput.readUTF();
		NHPM_UPD_ADD = objectInput.readUTF();
		ERR_MSGS_ADD = objectInput.readUTF();
		NHPM_UPM_HOSP_ATTACH = objectInput.readUTF();
		HOSP_NAME_TEL = objectInput.readUTF();
		INFRA_UPD = objectInput.readUTF();
		ERR_MSGS_INFRA = objectInput.readUTF();
		COVID_NWH_STATUS = objectInput.readUTF();
		TEMPORARY_HOSPITAL = objectInput.readUTF();
		NHPM_HOSP_ID = objectInput.readUTF();
		NHPM_UPD_DT = objectInput.readLong();
		NHPM_UPD_ADD_DT = objectInput.readLong();
		NHPM_UPD_HOSP_ATTACH_DT = objectInput.readLong();
		INFRA_UPD_DT = objectInput.readLong();
		RESPONSE_CNT = objectInput.readUTF();
		ERR_MSGS_HOSP_ATTACH = objectInput.readUTF();
		PAN_NUMBER = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (HOSP_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_ID);
		}

		if (HOSP_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_NAME);
		}

		if (HOSP_DISP_CODE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_DISP_CODE);
		}

		if (HOSP_CONTACT_PERSON == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_CONTACT_PERSON);
		}

		if (HOSP_CONTACT_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_CONTACT_NO);
		}

		if (HOSP_MITHRA == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_MITHRA);
		}

		if (CUG_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CUG_NO);
		}

		if (HOSP_SPECIALITY == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_SPECIALITY);
		}

		if (HOSP_CITY == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_CITY);
		}

		if (HOSP_ADDR1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_ADDR1);
		}

		if (HOSP_ADDR2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_ADDR2);
		}

		if (HOSP_ADDR3 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_ADDR3);
		}

		if (HOSP_FAX_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_FAX_NO);
		}

		if (HOSP_EMAIL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_EMAIL);
		}

		if (HOSP_ACTIVE_YN == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_ACTIVE_YN);
		}

		objectOutput.writeLong(CRT_DT);

		if (CRT_USR == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CRT_USR);
		}

		objectOutput.writeLong(LST_UPD_DT);

		if (LST_UPD_USR == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LST_UPD_USR);
		}

		if (LANG_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LANG_ID);
		}

		if (HOSP_DIST_CD == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_DIST_CD);
		}

		if (HOSP_VIL_CD == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_VIL_CD);
		}

		if (ACCOUNT_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ACCOUNT_NO);
		}

		if (BANK_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(BANK_ID);
		}

		if (DEPO_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(DEPO_ID);
		}

		if (HOSP_ACCOUNT_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_ACCOUNT_NAME);
		}

		if (HOSP_TYPE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_TYPE);
		}

		if (BILL_HEAD_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(BILL_HEAD_NAME);
		}

		if (BILL_HEAD_CONTACT_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(BILL_HEAD_CONTACT_NO);
		}

		if (BILL_HEAD_EMAIL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(BILL_HEAD_EMAIL);
		}

		if (RAMCO_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(RAMCO_NAME);
		}

		if (RAMCO_CONTACT_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(RAMCO_CONTACT_NO);
		}

		if (RAMCO_EMAIL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(RAMCO_EMAIL);
		}

		if (AMCCO_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AMCCO_NAME);
		}

		if (AMCCO_CONTACT_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AMCCO_CONTACT_NO);
		}

		if (AMCCO_EMAIL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AMCCO_EMAIL);
		}

		if (DIST_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(DIST_ID);
		}

		if (DELIST_SUSP_REMARKS == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(DELIST_SUSP_REMARKS);
		}

		if (HOSP_EMPNL_REF_NUM == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_EMPNL_REF_NUM);
		}

		if (PAYMENTS == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(PAYMENTS);
		}

		if (HOSP_CATEGORY == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_CATEGORY);
		}

		objectOutput.writeInt(ONBED_PATIENTS);

		if (GOVT_HOSP_TYPE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(GOVT_HOSP_TYPE);
		}

		objectOutput.writeLong(LST_UPD_STATUS_DT);

		if (LST_UPD_STATUS_USR == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LST_UPD_STATUS_USR);
		}

		if (HOSP_NOTICE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_NOTICE);
		}

		if (TDS_EXEMP_STATUS == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(TDS_EXEMP_STATUS);
		}

		objectOutput.writeLong(TDS_FROM_DT);
		objectOutput.writeLong(TDS_TO_DT);

		if (TDS_REMARKS == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(TDS_REMARKS);
		}

		if (EXEMP_REF_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(EXEMP_REF_NO);
		}

		if (PAN_int == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(PAN_int);
		}

		if (REV_FUND_ACTIVE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(REV_FUND_ACTIVE);
		}

		if (COMPLAINT_TYPE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(COMPLAINT_TYPE);
		}

		if (PAN_HOLDER_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(PAN_HOLDER_NAME);
		}

		objectOutput.writeLong(HOSP_EMPNL_DATE);

		if (HOSP_ESTAB_YR == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_ESTAB_YR);
		}

		if (HOSP_AMCCO_QUAL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_AMCCO_QUAL);
		}

		if (HOSP_RAMCO_QUAL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_RAMCO_QUAL);
		}

		if (HOSP_BILLINGHEAD_QUAL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_BILLINGHEAD_QUAL);
		}

		if (USR_MACID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(USR_MACID);
		}

		if (HOSP_MACID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_MACID);
		}

		if (BIOM_REQUIRED == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(BIOM_REQUIRED);
		}

		if (ORG_TYPE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ORG_TYPE);
		}

		if (DLIST_CLAIM_CONFM == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(DLIST_CLAIM_CONFM);
		}

		if (DCT_FUND_ACTIVE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(DCT_FUND_ACTIVE);
		}

		if (ISACTIVE_TG == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ISACTIVE_TG);
		}

		if (ISACTIVE_AP == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ISACTIVE_AP);
		}

		if (COMPLAINT_TYPE_TG == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(COMPLAINT_TYPE_TG);
		}

		if (BLOCK_CLAIMS_TG == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(BLOCK_CLAIMS_TG);
		}

		if (APPLICATION_TYPE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(APPLICATION_TYPE);
		}

		if (AP_ACCOUNT_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AP_ACCOUNT_NO);
		}

		if (AP_BANK_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AP_BANK_ID);
		}

		if (AP_HOSP_ACCOUNT_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AP_HOSP_ACCOUNT_NAME);
		}

		if (BIOM_REQUIRED_AP == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(BIOM_REQUIRED_AP);
		}

		if (MEDCO_LOGIN_CREATED == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(MEDCO_LOGIN_CREATED);
		}

		if (DIST_ID_OLD == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(DIST_ID_OLD);
		}

		if (AP_PATIENT_CARE_BANKID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AP_PATIENT_CARE_BANKID);
		}

		if (AP_INCENTIVE_CARE_BANK_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AP_INCENTIVE_CARE_BANK_ID);
		}

		if (PATIENT_CARE_ACCOUNT_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(PATIENT_CARE_ACCOUNT_NO);
		}

		if (INCENTIVE_CARE_ACCOUNT_NO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(INCENTIVE_CARE_ACCOUNT_NO);
		}

		if (AP_PATCARE_HOSP_AC_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AP_PATCARE_HOSP_AC_NAME);
		}

		if (AP_INCCARE_HOSP_AC_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AP_INCCARE_HOSP_AC_NAME);
		}

		if (ERR_MSGS == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ERR_MSGS);
		}

		if (NHPM_UPD == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(NHPM_UPD);
		}

		if (EHS_REFERENCE_NUMBE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(EHS_REFERENCE_NUMBE);
		}

		if (NHPM_UPD_ADD == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(NHPM_UPD_ADD);
		}

		if (ERR_MSGS_ADD == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ERR_MSGS_ADD);
		}

		if (NHPM_UPM_HOSP_ATTACH == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(NHPM_UPM_HOSP_ATTACH);
		}

		if (HOSP_NAME_TEL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HOSP_NAME_TEL);
		}

		if (INFRA_UPD == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(INFRA_UPD);
		}

		if (ERR_MSGS_INFRA == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ERR_MSGS_INFRA);
		}

		if (COVID_NWH_STATUS == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(COVID_NWH_STATUS);
		}

		if (TEMPORARY_HOSPITAL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(TEMPORARY_HOSPITAL);
		}

		if (NHPM_HOSP_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(NHPM_HOSP_ID);
		}

		objectOutput.writeLong(NHPM_UPD_DT);
		objectOutput.writeLong(NHPM_UPD_ADD_DT);
		objectOutput.writeLong(NHPM_UPD_HOSP_ATTACH_DT);
		objectOutput.writeLong(INFRA_UPD_DT);

		if (RESPONSE_CNT == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(RESPONSE_CNT);
		}

		if (ERR_MSGS_HOSP_ATTACH == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ERR_MSGS_HOSP_ATTACH);
		}

		if (PAN_NUMBER == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(PAN_NUMBER);
		}
	}

	public String HOSP_ID;

	public String HOSP_NAME;

	public String HOSP_DISP_CODE;

	public String HOSP_CONTACT_PERSON;

	public String HOSP_CONTACT_NO;

	public String HOSP_MITHRA;

	public String CUG_NO;

	public String HOSP_SPECIALITY;

	public String HOSP_CITY;

	public String HOSP_ADDR1;

	public String HOSP_ADDR2;

	public String HOSP_ADDR3;

	public String HOSP_FAX_NO;

	public String HOSP_EMAIL;

	public String HOSP_ACTIVE_YN;

	public long CRT_DT;

	public String CRT_USR;

	public long LST_UPD_DT;

	public String LST_UPD_USR;

	public String LANG_ID;

	public String HOSP_DIST_CD;

	public String HOSP_VIL_CD;

	public String ACCOUNT_NO;

	public String BANK_ID;

	public String DEPO_ID;

	public String HOSP_ACCOUNT_NAME;

	public String HOSP_TYPE;

	public String BILL_HEAD_NAME;

	public String BILL_HEAD_CONTACT_NO;

	public String BILL_HEAD_EMAIL;

	public String RAMCO_NAME;

	public String RAMCO_CONTACT_NO;

	public String RAMCO_EMAIL;

	public String AMCCO_NAME;

	public String AMCCO_CONTACT_NO;

	public String AMCCO_EMAIL;

	public String DIST_ID;

	public String DELIST_SUSP_REMARKS;

	public String HOSP_EMPNL_REF_NUM;

	public String PAYMENTS;

	public String HOSP_CATEGORY;

	public int ONBED_PATIENTS;

	public String GOVT_HOSP_TYPE;

	public long LST_UPD_STATUS_DT;

	public String LST_UPD_STATUS_USR;

	public String HOSP_NOTICE;

	public String TDS_EXEMP_STATUS;

	public long TDS_FROM_DT;

	public long TDS_TO_DT;

	public String TDS_REMARKS;

	public String EXEMP_REF_NO;

	public String PAN_int;

	public String REV_FUND_ACTIVE;

	public String COMPLAINT_TYPE;

	public String PAN_HOLDER_NAME;

	public long HOSP_EMPNL_DATE;

	public String HOSP_ESTAB_YR;

	public String HOSP_AMCCO_QUAL;

	public String HOSP_RAMCO_QUAL;

	public String HOSP_BILLINGHEAD_QUAL;

	public String USR_MACID;

	public String HOSP_MACID;

	public String BIOM_REQUIRED;

	public String ORG_TYPE;

	public String DLIST_CLAIM_CONFM;

	public String DCT_FUND_ACTIVE;

	public String ISACTIVE_TG;

	public String ISACTIVE_AP;

	public String COMPLAINT_TYPE_TG;

	public String BLOCK_CLAIMS_TG;

	public String APPLICATION_TYPE;

	public String AP_ACCOUNT_NO;

	public String AP_BANK_ID;

	public String AP_HOSP_ACCOUNT_NAME;

	public String BIOM_REQUIRED_AP;

	public String MEDCO_LOGIN_CREATED;

	public String DIST_ID_OLD;

	public String AP_PATIENT_CARE_BANKID;

	public String AP_INCENTIVE_CARE_BANK_ID;

	public String PATIENT_CARE_ACCOUNT_NO;

	public String INCENTIVE_CARE_ACCOUNT_NO;

	public String AP_PATCARE_HOSP_AC_NAME;

	public String AP_INCCARE_HOSP_AC_NAME;

	public String ERR_MSGS;

	public String NHPM_UPD;

	public String EHS_REFERENCE_NUMBE;

	public String NHPM_UPD_ADD;

	public String ERR_MSGS_ADD;

	public String NHPM_UPM_HOSP_ATTACH;

	public String HOSP_NAME_TEL;

	public String INFRA_UPD;

	public String ERR_MSGS_INFRA;

	public String COVID_NWH_STATUS;

	public String TEMPORARY_HOSPITAL;

	public String NHPM_HOSP_ID;

	public long NHPM_UPD_DT;

	public long NHPM_UPD_ADD_DT;

	public long NHPM_UPD_HOSP_ATTACH_DT;

	public long INFRA_UPD_DT;

	public String RESPONSE_CNT;

	public String ERR_MSGS_HOSP_ATTACH;

	public String PAN_NUMBER;

}