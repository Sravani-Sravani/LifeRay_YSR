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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AsrimHospitals}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AsrimHospitals
 * @generated
 */
public class AsrimHospitalsWrapper
	extends BaseModelWrapper<AsrimHospitals>
	implements AsrimHospitals, ModelWrapper<AsrimHospitals> {

	public AsrimHospitalsWrapper(AsrimHospitals asrimHospitals) {
		super(asrimHospitals);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("HOSP_ID", getHOSP_ID());
		attributes.put("HOSP_NAME", getHOSP_NAME());
		attributes.put("HOSP_DISP_CODE", getHOSP_DISP_CODE());
		attributes.put("HOSP_CONTACT_PERSON", getHOSP_CONTACT_PERSON());
		attributes.put("HOSP_CONTACT_NO", getHOSP_CONTACT_NO());
		attributes.put("HOSP_MITHRA", getHOSP_MITHRA());
		attributes.put("CUG_NO", getCUG_NO());
		attributes.put("HOSP_SPECIALITY", getHOSP_SPECIALITY());
		attributes.put("HOSP_CITY", getHOSP_CITY());
		attributes.put("HOSP_ADDR1", getHOSP_ADDR1());
		attributes.put("HOSP_ADDR2", getHOSP_ADDR2());
		attributes.put("HOSP_ADDR3", getHOSP_ADDR3());
		attributes.put("HOSP_FAX_NO", getHOSP_FAX_NO());
		attributes.put("HOSP_EMAIL", getHOSP_EMAIL());
		attributes.put("HOSP_ACTIVE_YN", getHOSP_ACTIVE_YN());
		attributes.put("CRT_DT", getCRT_DT());
		attributes.put("CRT_USR", getCRT_USR());
		attributes.put("LST_UPD_DT", getLST_UPD_DT());
		attributes.put("LST_UPD_USR", getLST_UPD_USR());
		attributes.put("LANG_ID", getLANG_ID());
		attributes.put("HOSP_DIST_CD", getHOSP_DIST_CD());
		attributes.put("HOSP_VIL_CD", getHOSP_VIL_CD());
		attributes.put("ACCOUNT_NO", getACCOUNT_NO());
		attributes.put("BANK_ID", getBANK_ID());
		attributes.put("DEPO_ID", getDEPO_ID());
		attributes.put("HOSP_ACCOUNT_NAME", getHOSP_ACCOUNT_NAME());
		attributes.put("HOSP_TYPE", getHOSP_TYPE());
		attributes.put("BILL_HEAD_NAME", getBILL_HEAD_NAME());
		attributes.put("BILL_HEAD_CONTACT_NO", getBILL_HEAD_CONTACT_NO());
		attributes.put("BILL_HEAD_EMAIL", getBILL_HEAD_EMAIL());
		attributes.put("RAMCO_NAME", getRAMCO_NAME());
		attributes.put("RAMCO_CONTACT_NO", getRAMCO_CONTACT_NO());
		attributes.put("RAMCO_EMAIL", getRAMCO_EMAIL());
		attributes.put("AMCCO_NAME", getAMCCO_NAME());
		attributes.put("AMCCO_CONTACT_NO", getAMCCO_CONTACT_NO());
		attributes.put("AMCCO_EMAIL", getAMCCO_EMAIL());
		attributes.put("DIST_ID", getDIST_ID());
		attributes.put("DELIST_SUSP_REMARKS", getDELIST_SUSP_REMARKS());
		attributes.put("HOSP_EMPNL_REF_NUM", getHOSP_EMPNL_REF_NUM());
		attributes.put("PAYMENTS", getPAYMENTS());
		attributes.put("HOSP_CATEGORY", getHOSP_CATEGORY());
		attributes.put("ONBED_PATIENTS", getONBED_PATIENTS());
		attributes.put("GOVT_HOSP_TYPE", getGOVT_HOSP_TYPE());
		attributes.put("LST_UPD_STATUS_DT", getLST_UPD_STATUS_DT());
		attributes.put("LST_UPD_STATUS_USR", getLST_UPD_STATUS_USR());
		attributes.put("HOSP_NOTICE", getHOSP_NOTICE());
		attributes.put("TDS_EXEMP_STATUS", getTDS_EXEMP_STATUS());
		attributes.put("TDS_FROM_DT", getTDS_FROM_DT());
		attributes.put("TDS_TO_DT", getTDS_TO_DT());
		attributes.put("TDS_REMARKS", getTDS_REMARKS());
		attributes.put("EXEMP_REF_NO", getEXEMP_REF_NO());
		attributes.put("PAN_int", getPAN_int());
		attributes.put("REV_FUND_ACTIVE", getREV_FUND_ACTIVE());
		attributes.put("COMPLAINT_TYPE", getCOMPLAINT_TYPE());
		attributes.put("PAN_HOLDER_NAME", getPAN_HOLDER_NAME());
		attributes.put("HOSP_EMPNL_DATE", getHOSP_EMPNL_DATE());
		attributes.put("HOSP_ESTAB_YR", getHOSP_ESTAB_YR());
		attributes.put("HOSP_AMCCO_QUAL", getHOSP_AMCCO_QUAL());
		attributes.put("HOSP_RAMCO_QUAL", getHOSP_RAMCO_QUAL());
		attributes.put("HOSP_BILLINGHEAD_QUAL", getHOSP_BILLINGHEAD_QUAL());
		attributes.put("USR_MACID", getUSR_MACID());
		attributes.put("HOSP_MACID", getHOSP_MACID());
		attributes.put("BIOM_REQUIRED", getBIOM_REQUIRED());
		attributes.put("ORG_TYPE", getORG_TYPE());
		attributes.put("DLIST_CLAIM_CONFM", getDLIST_CLAIM_CONFM());
		attributes.put("DCT_FUND_ACTIVE", getDCT_FUND_ACTIVE());
		attributes.put("ISACTIVE_TG", getISACTIVE_TG());
		attributes.put("ISACTIVE_AP", getISACTIVE_AP());
		attributes.put("COMPLAINT_TYPE_TG", getCOMPLAINT_TYPE_TG());
		attributes.put("BLOCK_CLAIMS_TG", getBLOCK_CLAIMS_TG());
		attributes.put("APPLICATION_TYPE", getAPPLICATION_TYPE());
		attributes.put("AP_ACCOUNT_NO", getAP_ACCOUNT_NO());
		attributes.put("AP_BANK_ID", getAP_BANK_ID());
		attributes.put("AP_HOSP_ACCOUNT_NAME", getAP_HOSP_ACCOUNT_NAME());
		attributes.put("BIOM_REQUIRED_AP", getBIOM_REQUIRED_AP());
		attributes.put("MEDCO_LOGIN_CREATED", getMEDCO_LOGIN_CREATED());
		attributes.put("DIST_ID_OLD", getDIST_ID_OLD());
		attributes.put("AP_PATIENT_CARE_BANKID", getAP_PATIENT_CARE_BANKID());
		attributes.put(
			"AP_INCENTIVE_CARE_BANK_ID", getAP_INCENTIVE_CARE_BANK_ID());
		attributes.put("PATIENT_CARE_ACCOUNT_NO", getPATIENT_CARE_ACCOUNT_NO());
		attributes.put(
			"INCENTIVE_CARE_ACCOUNT_NO", getINCENTIVE_CARE_ACCOUNT_NO());
		attributes.put("AP_PATCARE_HOSP_AC_NAME", getAP_PATCARE_HOSP_AC_NAME());
		attributes.put("AP_INCCARE_HOSP_AC_NAME", getAP_INCCARE_HOSP_AC_NAME());
		attributes.put("ERR_MSGS", getERR_MSGS());
		attributes.put("NHPM_UPD", getNHPM_UPD());
		attributes.put("EHS_REFERENCE_NUMBE", getEHS_REFERENCE_NUMBE());
		attributes.put("NHPM_UPD_ADD", getNHPM_UPD_ADD());
		attributes.put("ERR_MSGS_ADD", getERR_MSGS_ADD());
		attributes.put("NHPM_UPM_HOSP_ATTACH", getNHPM_UPM_HOSP_ATTACH());
		attributes.put("HOSP_NAME_TEL", getHOSP_NAME_TEL());
		attributes.put("INFRA_UPD", getINFRA_UPD());
		attributes.put("ERR_MSGS_INFRA", getERR_MSGS_INFRA());
		attributes.put("COVID_NWH_STATUS", getCOVID_NWH_STATUS());
		attributes.put("TEMPORARY_HOSPITAL", getTEMPORARY_HOSPITAL());
		attributes.put("NHPM_HOSP_ID", getNHPM_HOSP_ID());
		attributes.put("NHPM_UPD_DT", getNHPM_UPD_DT());
		attributes.put("NHPM_UPD_ADD_DT", getNHPM_UPD_ADD_DT());
		attributes.put("NHPM_UPD_HOSP_ATTACH_DT", getNHPM_UPD_HOSP_ATTACH_DT());
		attributes.put("INFRA_UPD_DT", getINFRA_UPD_DT());
		attributes.put("RESPONSE_CNT", getRESPONSE_CNT());
		attributes.put("ERR_MSGS_HOSP_ATTACH", getERR_MSGS_HOSP_ATTACH());
		attributes.put("PAN_NUMBER", getPAN_NUMBER());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String HOSP_ID = (String)attributes.get("HOSP_ID");

		if (HOSP_ID != null) {
			setHOSP_ID(HOSP_ID);
		}

		String HOSP_NAME = (String)attributes.get("HOSP_NAME");

		if (HOSP_NAME != null) {
			setHOSP_NAME(HOSP_NAME);
		}

		String HOSP_DISP_CODE = (String)attributes.get("HOSP_DISP_CODE");

		if (HOSP_DISP_CODE != null) {
			setHOSP_DISP_CODE(HOSP_DISP_CODE);
		}

		String HOSP_CONTACT_PERSON = (String)attributes.get(
			"HOSP_CONTACT_PERSON");

		if (HOSP_CONTACT_PERSON != null) {
			setHOSP_CONTACT_PERSON(HOSP_CONTACT_PERSON);
		}

		String HOSP_CONTACT_NO = (String)attributes.get("HOSP_CONTACT_NO");

		if (HOSP_CONTACT_NO != null) {
			setHOSP_CONTACT_NO(HOSP_CONTACT_NO);
		}

		String HOSP_MITHRA = (String)attributes.get("HOSP_MITHRA");

		if (HOSP_MITHRA != null) {
			setHOSP_MITHRA(HOSP_MITHRA);
		}

		String CUG_NO = (String)attributes.get("CUG_NO");

		if (CUG_NO != null) {
			setCUG_NO(CUG_NO);
		}

		String HOSP_SPECIALITY = (String)attributes.get("HOSP_SPECIALITY");

		if (HOSP_SPECIALITY != null) {
			setHOSP_SPECIALITY(HOSP_SPECIALITY);
		}

		String HOSP_CITY = (String)attributes.get("HOSP_CITY");

		if (HOSP_CITY != null) {
			setHOSP_CITY(HOSP_CITY);
		}

		String HOSP_ADDR1 = (String)attributes.get("HOSP_ADDR1");

		if (HOSP_ADDR1 != null) {
			setHOSP_ADDR1(HOSP_ADDR1);
		}

		String HOSP_ADDR2 = (String)attributes.get("HOSP_ADDR2");

		if (HOSP_ADDR2 != null) {
			setHOSP_ADDR2(HOSP_ADDR2);
		}

		String HOSP_ADDR3 = (String)attributes.get("HOSP_ADDR3");

		if (HOSP_ADDR3 != null) {
			setHOSP_ADDR3(HOSP_ADDR3);
		}

		String HOSP_FAX_NO = (String)attributes.get("HOSP_FAX_NO");

		if (HOSP_FAX_NO != null) {
			setHOSP_FAX_NO(HOSP_FAX_NO);
		}

		String HOSP_EMAIL = (String)attributes.get("HOSP_EMAIL");

		if (HOSP_EMAIL != null) {
			setHOSP_EMAIL(HOSP_EMAIL);
		}

		String HOSP_ACTIVE_YN = (String)attributes.get("HOSP_ACTIVE_YN");

		if (HOSP_ACTIVE_YN != null) {
			setHOSP_ACTIVE_YN(HOSP_ACTIVE_YN);
		}

		Date CRT_DT = (Date)attributes.get("CRT_DT");

		if (CRT_DT != null) {
			setCRT_DT(CRT_DT);
		}

		String CRT_USR = (String)attributes.get("CRT_USR");

		if (CRT_USR != null) {
			setCRT_USR(CRT_USR);
		}

		Date LST_UPD_DT = (Date)attributes.get("LST_UPD_DT");

		if (LST_UPD_DT != null) {
			setLST_UPD_DT(LST_UPD_DT);
		}

		String LST_UPD_USR = (String)attributes.get("LST_UPD_USR");

		if (LST_UPD_USR != null) {
			setLST_UPD_USR(LST_UPD_USR);
		}

		String LANG_ID = (String)attributes.get("LANG_ID");

		if (LANG_ID != null) {
			setLANG_ID(LANG_ID);
		}

		String HOSP_DIST_CD = (String)attributes.get("HOSP_DIST_CD");

		if (HOSP_DIST_CD != null) {
			setHOSP_DIST_CD(HOSP_DIST_CD);
		}

		String HOSP_VIL_CD = (String)attributes.get("HOSP_VIL_CD");

		if (HOSP_VIL_CD != null) {
			setHOSP_VIL_CD(HOSP_VIL_CD);
		}

		String ACCOUNT_NO = (String)attributes.get("ACCOUNT_NO");

		if (ACCOUNT_NO != null) {
			setACCOUNT_NO(ACCOUNT_NO);
		}

		String BANK_ID = (String)attributes.get("BANK_ID");

		if (BANK_ID != null) {
			setBANK_ID(BANK_ID);
		}

		String DEPO_ID = (String)attributes.get("DEPO_ID");

		if (DEPO_ID != null) {
			setDEPO_ID(DEPO_ID);
		}

		String HOSP_ACCOUNT_NAME = (String)attributes.get("HOSP_ACCOUNT_NAME");

		if (HOSP_ACCOUNT_NAME != null) {
			setHOSP_ACCOUNT_NAME(HOSP_ACCOUNT_NAME);
		}

		String HOSP_TYPE = (String)attributes.get("HOSP_TYPE");

		if (HOSP_TYPE != null) {
			setHOSP_TYPE(HOSP_TYPE);
		}

		String BILL_HEAD_NAME = (String)attributes.get("BILL_HEAD_NAME");

		if (BILL_HEAD_NAME != null) {
			setBILL_HEAD_NAME(BILL_HEAD_NAME);
		}

		String BILL_HEAD_CONTACT_NO = (String)attributes.get(
			"BILL_HEAD_CONTACT_NO");

		if (BILL_HEAD_CONTACT_NO != null) {
			setBILL_HEAD_CONTACT_NO(BILL_HEAD_CONTACT_NO);
		}

		String BILL_HEAD_EMAIL = (String)attributes.get("BILL_HEAD_EMAIL");

		if (BILL_HEAD_EMAIL != null) {
			setBILL_HEAD_EMAIL(BILL_HEAD_EMAIL);
		}

		String RAMCO_NAME = (String)attributes.get("RAMCO_NAME");

		if (RAMCO_NAME != null) {
			setRAMCO_NAME(RAMCO_NAME);
		}

		String RAMCO_CONTACT_NO = (String)attributes.get("RAMCO_CONTACT_NO");

		if (RAMCO_CONTACT_NO != null) {
			setRAMCO_CONTACT_NO(RAMCO_CONTACT_NO);
		}

		String RAMCO_EMAIL = (String)attributes.get("RAMCO_EMAIL");

		if (RAMCO_EMAIL != null) {
			setRAMCO_EMAIL(RAMCO_EMAIL);
		}

		String AMCCO_NAME = (String)attributes.get("AMCCO_NAME");

		if (AMCCO_NAME != null) {
			setAMCCO_NAME(AMCCO_NAME);
		}

		String AMCCO_CONTACT_NO = (String)attributes.get("AMCCO_CONTACT_NO");

		if (AMCCO_CONTACT_NO != null) {
			setAMCCO_CONTACT_NO(AMCCO_CONTACT_NO);
		}

		String AMCCO_EMAIL = (String)attributes.get("AMCCO_EMAIL");

		if (AMCCO_EMAIL != null) {
			setAMCCO_EMAIL(AMCCO_EMAIL);
		}

		String DIST_ID = (String)attributes.get("DIST_ID");

		if (DIST_ID != null) {
			setDIST_ID(DIST_ID);
		}

		String DELIST_SUSP_REMARKS = (String)attributes.get(
			"DELIST_SUSP_REMARKS");

		if (DELIST_SUSP_REMARKS != null) {
			setDELIST_SUSP_REMARKS(DELIST_SUSP_REMARKS);
		}

		String HOSP_EMPNL_REF_NUM = (String)attributes.get(
			"HOSP_EMPNL_REF_NUM");

		if (HOSP_EMPNL_REF_NUM != null) {
			setHOSP_EMPNL_REF_NUM(HOSP_EMPNL_REF_NUM);
		}

		String PAYMENTS = (String)attributes.get("PAYMENTS");

		if (PAYMENTS != null) {
			setPAYMENTS(PAYMENTS);
		}

		String HOSP_CATEGORY = (String)attributes.get("HOSP_CATEGORY");

		if (HOSP_CATEGORY != null) {
			setHOSP_CATEGORY(HOSP_CATEGORY);
		}

		Integer ONBED_PATIENTS = (Integer)attributes.get("ONBED_PATIENTS");

		if (ONBED_PATIENTS != null) {
			setONBED_PATIENTS(ONBED_PATIENTS);
		}

		String GOVT_HOSP_TYPE = (String)attributes.get("GOVT_HOSP_TYPE");

		if (GOVT_HOSP_TYPE != null) {
			setGOVT_HOSP_TYPE(GOVT_HOSP_TYPE);
		}

		Date LST_UPD_STATUS_DT = (Date)attributes.get("LST_UPD_STATUS_DT");

		if (LST_UPD_STATUS_DT != null) {
			setLST_UPD_STATUS_DT(LST_UPD_STATUS_DT);
		}

		String LST_UPD_STATUS_USR = (String)attributes.get(
			"LST_UPD_STATUS_USR");

		if (LST_UPD_STATUS_USR != null) {
			setLST_UPD_STATUS_USR(LST_UPD_STATUS_USR);
		}

		String HOSP_NOTICE = (String)attributes.get("HOSP_NOTICE");

		if (HOSP_NOTICE != null) {
			setHOSP_NOTICE(HOSP_NOTICE);
		}

		String TDS_EXEMP_STATUS = (String)attributes.get("TDS_EXEMP_STATUS");

		if (TDS_EXEMP_STATUS != null) {
			setTDS_EXEMP_STATUS(TDS_EXEMP_STATUS);
		}

		Date TDS_FROM_DT = (Date)attributes.get("TDS_FROM_DT");

		if (TDS_FROM_DT != null) {
			setTDS_FROM_DT(TDS_FROM_DT);
		}

		Date TDS_TO_DT = (Date)attributes.get("TDS_TO_DT");

		if (TDS_TO_DT != null) {
			setTDS_TO_DT(TDS_TO_DT);
		}

		String TDS_REMARKS = (String)attributes.get("TDS_REMARKS");

		if (TDS_REMARKS != null) {
			setTDS_REMARKS(TDS_REMARKS);
		}

		String EXEMP_REF_NO = (String)attributes.get("EXEMP_REF_NO");

		if (EXEMP_REF_NO != null) {
			setEXEMP_REF_NO(EXEMP_REF_NO);
		}

		String PAN_int = (String)attributes.get("PAN_int");

		if (PAN_int != null) {
			setPAN_int(PAN_int);
		}

		String REV_FUND_ACTIVE = (String)attributes.get("REV_FUND_ACTIVE");

		if (REV_FUND_ACTIVE != null) {
			setREV_FUND_ACTIVE(REV_FUND_ACTIVE);
		}

		String COMPLAINT_TYPE = (String)attributes.get("COMPLAINT_TYPE");

		if (COMPLAINT_TYPE != null) {
			setCOMPLAINT_TYPE(COMPLAINT_TYPE);
		}

		String PAN_HOLDER_NAME = (String)attributes.get("PAN_HOLDER_NAME");

		if (PAN_HOLDER_NAME != null) {
			setPAN_HOLDER_NAME(PAN_HOLDER_NAME);
		}

		Date HOSP_EMPNL_DATE = (Date)attributes.get("HOSP_EMPNL_DATE");

		if (HOSP_EMPNL_DATE != null) {
			setHOSP_EMPNL_DATE(HOSP_EMPNL_DATE);
		}

		String HOSP_ESTAB_YR = (String)attributes.get("HOSP_ESTAB_YR");

		if (HOSP_ESTAB_YR != null) {
			setHOSP_ESTAB_YR(HOSP_ESTAB_YR);
		}

		String HOSP_AMCCO_QUAL = (String)attributes.get("HOSP_AMCCO_QUAL");

		if (HOSP_AMCCO_QUAL != null) {
			setHOSP_AMCCO_QUAL(HOSP_AMCCO_QUAL);
		}

		String HOSP_RAMCO_QUAL = (String)attributes.get("HOSP_RAMCO_QUAL");

		if (HOSP_RAMCO_QUAL != null) {
			setHOSP_RAMCO_QUAL(HOSP_RAMCO_QUAL);
		}

		String HOSP_BILLINGHEAD_QUAL = (String)attributes.get(
			"HOSP_BILLINGHEAD_QUAL");

		if (HOSP_BILLINGHEAD_QUAL != null) {
			setHOSP_BILLINGHEAD_QUAL(HOSP_BILLINGHEAD_QUAL);
		}

		String USR_MACID = (String)attributes.get("USR_MACID");

		if (USR_MACID != null) {
			setUSR_MACID(USR_MACID);
		}

		String HOSP_MACID = (String)attributes.get("HOSP_MACID");

		if (HOSP_MACID != null) {
			setHOSP_MACID(HOSP_MACID);
		}

		String BIOM_REQUIRED = (String)attributes.get("BIOM_REQUIRED");

		if (BIOM_REQUIRED != null) {
			setBIOM_REQUIRED(BIOM_REQUIRED);
		}

		String ORG_TYPE = (String)attributes.get("ORG_TYPE");

		if (ORG_TYPE != null) {
			setORG_TYPE(ORG_TYPE);
		}

		String DLIST_CLAIM_CONFM = (String)attributes.get("DLIST_CLAIM_CONFM");

		if (DLIST_CLAIM_CONFM != null) {
			setDLIST_CLAIM_CONFM(DLIST_CLAIM_CONFM);
		}

		String DCT_FUND_ACTIVE = (String)attributes.get("DCT_FUND_ACTIVE");

		if (DCT_FUND_ACTIVE != null) {
			setDCT_FUND_ACTIVE(DCT_FUND_ACTIVE);
		}

		String ISACTIVE_TG = (String)attributes.get("ISACTIVE_TG");

		if (ISACTIVE_TG != null) {
			setISACTIVE_TG(ISACTIVE_TG);
		}

		String ISACTIVE_AP = (String)attributes.get("ISACTIVE_AP");

		if (ISACTIVE_AP != null) {
			setISACTIVE_AP(ISACTIVE_AP);
		}

		String COMPLAINT_TYPE_TG = (String)attributes.get("COMPLAINT_TYPE_TG");

		if (COMPLAINT_TYPE_TG != null) {
			setCOMPLAINT_TYPE_TG(COMPLAINT_TYPE_TG);
		}

		String BLOCK_CLAIMS_TG = (String)attributes.get("BLOCK_CLAIMS_TG");

		if (BLOCK_CLAIMS_TG != null) {
			setBLOCK_CLAIMS_TG(BLOCK_CLAIMS_TG);
		}

		String APPLICATION_TYPE = (String)attributes.get("APPLICATION_TYPE");

		if (APPLICATION_TYPE != null) {
			setAPPLICATION_TYPE(APPLICATION_TYPE);
		}

		String AP_ACCOUNT_NO = (String)attributes.get("AP_ACCOUNT_NO");

		if (AP_ACCOUNT_NO != null) {
			setAP_ACCOUNT_NO(AP_ACCOUNT_NO);
		}

		String AP_BANK_ID = (String)attributes.get("AP_BANK_ID");

		if (AP_BANK_ID != null) {
			setAP_BANK_ID(AP_BANK_ID);
		}

		String AP_HOSP_ACCOUNT_NAME = (String)attributes.get(
			"AP_HOSP_ACCOUNT_NAME");

		if (AP_HOSP_ACCOUNT_NAME != null) {
			setAP_HOSP_ACCOUNT_NAME(AP_HOSP_ACCOUNT_NAME);
		}

		String BIOM_REQUIRED_AP = (String)attributes.get("BIOM_REQUIRED_AP");

		if (BIOM_REQUIRED_AP != null) {
			setBIOM_REQUIRED_AP(BIOM_REQUIRED_AP);
		}

		String MEDCO_LOGIN_CREATED = (String)attributes.get(
			"MEDCO_LOGIN_CREATED");

		if (MEDCO_LOGIN_CREATED != null) {
			setMEDCO_LOGIN_CREATED(MEDCO_LOGIN_CREATED);
		}

		String DIST_ID_OLD = (String)attributes.get("DIST_ID_OLD");

		if (DIST_ID_OLD != null) {
			setDIST_ID_OLD(DIST_ID_OLD);
		}

		String AP_PATIENT_CARE_BANKID = (String)attributes.get(
			"AP_PATIENT_CARE_BANKID");

		if (AP_PATIENT_CARE_BANKID != null) {
			setAP_PATIENT_CARE_BANKID(AP_PATIENT_CARE_BANKID);
		}

		String AP_INCENTIVE_CARE_BANK_ID = (String)attributes.get(
			"AP_INCENTIVE_CARE_BANK_ID");

		if (AP_INCENTIVE_CARE_BANK_ID != null) {
			setAP_INCENTIVE_CARE_BANK_ID(AP_INCENTIVE_CARE_BANK_ID);
		}

		String PATIENT_CARE_ACCOUNT_NO = (String)attributes.get(
			"PATIENT_CARE_ACCOUNT_NO");

		if (PATIENT_CARE_ACCOUNT_NO != null) {
			setPATIENT_CARE_ACCOUNT_NO(PATIENT_CARE_ACCOUNT_NO);
		}

		String INCENTIVE_CARE_ACCOUNT_NO = (String)attributes.get(
			"INCENTIVE_CARE_ACCOUNT_NO");

		if (INCENTIVE_CARE_ACCOUNT_NO != null) {
			setINCENTIVE_CARE_ACCOUNT_NO(INCENTIVE_CARE_ACCOUNT_NO);
		}

		String AP_PATCARE_HOSP_AC_NAME = (String)attributes.get(
			"AP_PATCARE_HOSP_AC_NAME");

		if (AP_PATCARE_HOSP_AC_NAME != null) {
			setAP_PATCARE_HOSP_AC_NAME(AP_PATCARE_HOSP_AC_NAME);
		}

		String AP_INCCARE_HOSP_AC_NAME = (String)attributes.get(
			"AP_INCCARE_HOSP_AC_NAME");

		if (AP_INCCARE_HOSP_AC_NAME != null) {
			setAP_INCCARE_HOSP_AC_NAME(AP_INCCARE_HOSP_AC_NAME);
		}

		String ERR_MSGS = (String)attributes.get("ERR_MSGS");

		if (ERR_MSGS != null) {
			setERR_MSGS(ERR_MSGS);
		}

		String NHPM_UPD = (String)attributes.get("NHPM_UPD");

		if (NHPM_UPD != null) {
			setNHPM_UPD(NHPM_UPD);
		}

		String EHS_REFERENCE_NUMBE = (String)attributes.get(
			"EHS_REFERENCE_NUMBE");

		if (EHS_REFERENCE_NUMBE != null) {
			setEHS_REFERENCE_NUMBE(EHS_REFERENCE_NUMBE);
		}

		String NHPM_UPD_ADD = (String)attributes.get("NHPM_UPD_ADD");

		if (NHPM_UPD_ADD != null) {
			setNHPM_UPD_ADD(NHPM_UPD_ADD);
		}

		String ERR_MSGS_ADD = (String)attributes.get("ERR_MSGS_ADD");

		if (ERR_MSGS_ADD != null) {
			setERR_MSGS_ADD(ERR_MSGS_ADD);
		}

		String NHPM_UPM_HOSP_ATTACH = (String)attributes.get(
			"NHPM_UPM_HOSP_ATTACH");

		if (NHPM_UPM_HOSP_ATTACH != null) {
			setNHPM_UPM_HOSP_ATTACH(NHPM_UPM_HOSP_ATTACH);
		}

		String HOSP_NAME_TEL = (String)attributes.get("HOSP_NAME_TEL");

		if (HOSP_NAME_TEL != null) {
			setHOSP_NAME_TEL(HOSP_NAME_TEL);
		}

		String INFRA_UPD = (String)attributes.get("INFRA_UPD");

		if (INFRA_UPD != null) {
			setINFRA_UPD(INFRA_UPD);
		}

		String ERR_MSGS_INFRA = (String)attributes.get("ERR_MSGS_INFRA");

		if (ERR_MSGS_INFRA != null) {
			setERR_MSGS_INFRA(ERR_MSGS_INFRA);
		}

		String COVID_NWH_STATUS = (String)attributes.get("COVID_NWH_STATUS");

		if (COVID_NWH_STATUS != null) {
			setCOVID_NWH_STATUS(COVID_NWH_STATUS);
		}

		String TEMPORARY_HOSPITAL = (String)attributes.get(
			"TEMPORARY_HOSPITAL");

		if (TEMPORARY_HOSPITAL != null) {
			setTEMPORARY_HOSPITAL(TEMPORARY_HOSPITAL);
		}

		String NHPM_HOSP_ID = (String)attributes.get("NHPM_HOSP_ID");

		if (NHPM_HOSP_ID != null) {
			setNHPM_HOSP_ID(NHPM_HOSP_ID);
		}

		Date NHPM_UPD_DT = (Date)attributes.get("NHPM_UPD_DT");

		if (NHPM_UPD_DT != null) {
			setNHPM_UPD_DT(NHPM_UPD_DT);
		}

		Date NHPM_UPD_ADD_DT = (Date)attributes.get("NHPM_UPD_ADD_DT");

		if (NHPM_UPD_ADD_DT != null) {
			setNHPM_UPD_ADD_DT(NHPM_UPD_ADD_DT);
		}

		Date NHPM_UPD_HOSP_ATTACH_DT = (Date)attributes.get(
			"NHPM_UPD_HOSP_ATTACH_DT");

		if (NHPM_UPD_HOSP_ATTACH_DT != null) {
			setNHPM_UPD_HOSP_ATTACH_DT(NHPM_UPD_HOSP_ATTACH_DT);
		}

		Date INFRA_UPD_DT = (Date)attributes.get("INFRA_UPD_DT");

		if (INFRA_UPD_DT != null) {
			setINFRA_UPD_DT(INFRA_UPD_DT);
		}

		String RESPONSE_CNT = (String)attributes.get("RESPONSE_CNT");

		if (RESPONSE_CNT != null) {
			setRESPONSE_CNT(RESPONSE_CNT);
		}

		String ERR_MSGS_HOSP_ATTACH = (String)attributes.get(
			"ERR_MSGS_HOSP_ATTACH");

		if (ERR_MSGS_HOSP_ATTACH != null) {
			setERR_MSGS_HOSP_ATTACH(ERR_MSGS_HOSP_ATTACH);
		}

		String PAN_NUMBER = (String)attributes.get("PAN_NUMBER");

		if (PAN_NUMBER != null) {
			setPAN_NUMBER(PAN_NUMBER);
		}
	}

	@Override
	public AsrimHospitals cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the account_no of this asrim hospitals.
	 *
	 * @return the account_no of this asrim hospitals
	 */
	@Override
	public String getACCOUNT_NO() {
		return model.getACCOUNT_NO();
	}

	/**
	 * Returns the amcco_contact_no of this asrim hospitals.
	 *
	 * @return the amcco_contact_no of this asrim hospitals
	 */
	@Override
	public String getAMCCO_CONTACT_NO() {
		return model.getAMCCO_CONTACT_NO();
	}

	/**
	 * Returns the amcco_email of this asrim hospitals.
	 *
	 * @return the amcco_email of this asrim hospitals
	 */
	@Override
	public String getAMCCO_EMAIL() {
		return model.getAMCCO_EMAIL();
	}

	/**
	 * Returns the amcco_name of this asrim hospitals.
	 *
	 * @return the amcco_name of this asrim hospitals
	 */
	@Override
	public String getAMCCO_NAME() {
		return model.getAMCCO_NAME();
	}

	/**
	 * Returns the ap_account_no of this asrim hospitals.
	 *
	 * @return the ap_account_no of this asrim hospitals
	 */
	@Override
	public String getAP_ACCOUNT_NO() {
		return model.getAP_ACCOUNT_NO();
	}

	/**
	 * Returns the ap_bank_id of this asrim hospitals.
	 *
	 * @return the ap_bank_id of this asrim hospitals
	 */
	@Override
	public String getAP_BANK_ID() {
		return model.getAP_BANK_ID();
	}

	/**
	 * Returns the ap_hosp_account_name of this asrim hospitals.
	 *
	 * @return the ap_hosp_account_name of this asrim hospitals
	 */
	@Override
	public String getAP_HOSP_ACCOUNT_NAME() {
		return model.getAP_HOSP_ACCOUNT_NAME();
	}

	/**
	 * Returns the ap_inccare_hosp_ac_name of this asrim hospitals.
	 *
	 * @return the ap_inccare_hosp_ac_name of this asrim hospitals
	 */
	@Override
	public String getAP_INCCARE_HOSP_AC_NAME() {
		return model.getAP_INCCARE_HOSP_AC_NAME();
	}

	/**
	 * Returns the ap_incentive_care_bank_id of this asrim hospitals.
	 *
	 * @return the ap_incentive_care_bank_id of this asrim hospitals
	 */
	@Override
	public String getAP_INCENTIVE_CARE_BANK_ID() {
		return model.getAP_INCENTIVE_CARE_BANK_ID();
	}

	/**
	 * Returns the ap_patcare_hosp_ac_name of this asrim hospitals.
	 *
	 * @return the ap_patcare_hosp_ac_name of this asrim hospitals
	 */
	@Override
	public String getAP_PATCARE_HOSP_AC_NAME() {
		return model.getAP_PATCARE_HOSP_AC_NAME();
	}

	/**
	 * Returns the ap_patient_care_bankid of this asrim hospitals.
	 *
	 * @return the ap_patient_care_bankid of this asrim hospitals
	 */
	@Override
	public String getAP_PATIENT_CARE_BANKID() {
		return model.getAP_PATIENT_CARE_BANKID();
	}

	/**
	 * Returns the application_type of this asrim hospitals.
	 *
	 * @return the application_type of this asrim hospitals
	 */
	@Override
	public String getAPPLICATION_TYPE() {
		return model.getAPPLICATION_TYPE();
	}

	/**
	 * Returns the bank_id of this asrim hospitals.
	 *
	 * @return the bank_id of this asrim hospitals
	 */
	@Override
	public String getBANK_ID() {
		return model.getBANK_ID();
	}

	/**
	 * Returns the bill_head_contact_no of this asrim hospitals.
	 *
	 * @return the bill_head_contact_no of this asrim hospitals
	 */
	@Override
	public String getBILL_HEAD_CONTACT_NO() {
		return model.getBILL_HEAD_CONTACT_NO();
	}

	/**
	 * Returns the bill_head_email of this asrim hospitals.
	 *
	 * @return the bill_head_email of this asrim hospitals
	 */
	@Override
	public String getBILL_HEAD_EMAIL() {
		return model.getBILL_HEAD_EMAIL();
	}

	/**
	 * Returns the bill_head_name of this asrim hospitals.
	 *
	 * @return the bill_head_name of this asrim hospitals
	 */
	@Override
	public String getBILL_HEAD_NAME() {
		return model.getBILL_HEAD_NAME();
	}

	/**
	 * Returns the biom_required of this asrim hospitals.
	 *
	 * @return the biom_required of this asrim hospitals
	 */
	@Override
	public String getBIOM_REQUIRED() {
		return model.getBIOM_REQUIRED();
	}

	/**
	 * Returns the biom_required_ap of this asrim hospitals.
	 *
	 * @return the biom_required_ap of this asrim hospitals
	 */
	@Override
	public String getBIOM_REQUIRED_AP() {
		return model.getBIOM_REQUIRED_AP();
	}

	/**
	 * Returns the block_claims_tg of this asrim hospitals.
	 *
	 * @return the block_claims_tg of this asrim hospitals
	 */
	@Override
	public String getBLOCK_CLAIMS_TG() {
		return model.getBLOCK_CLAIMS_TG();
	}

	/**
	 * Returns the complaint_type of this asrim hospitals.
	 *
	 * @return the complaint_type of this asrim hospitals
	 */
	@Override
	public String getCOMPLAINT_TYPE() {
		return model.getCOMPLAINT_TYPE();
	}

	/**
	 * Returns the complaint_type_tg of this asrim hospitals.
	 *
	 * @return the complaint_type_tg of this asrim hospitals
	 */
	@Override
	public String getCOMPLAINT_TYPE_TG() {
		return model.getCOMPLAINT_TYPE_TG();
	}

	/**
	 * Returns the covid_nwh_status of this asrim hospitals.
	 *
	 * @return the covid_nwh_status of this asrim hospitals
	 */
	@Override
	public String getCOVID_NWH_STATUS() {
		return model.getCOVID_NWH_STATUS();
	}

	/**
	 * Returns the crt_dt of this asrim hospitals.
	 *
	 * @return the crt_dt of this asrim hospitals
	 */
	@Override
	public Date getCRT_DT() {
		return model.getCRT_DT();
	}

	/**
	 * Returns the crt_usr of this asrim hospitals.
	 *
	 * @return the crt_usr of this asrim hospitals
	 */
	@Override
	public String getCRT_USR() {
		return model.getCRT_USR();
	}

	/**
	 * Returns the cug_no of this asrim hospitals.
	 *
	 * @return the cug_no of this asrim hospitals
	 */
	@Override
	public String getCUG_NO() {
		return model.getCUG_NO();
	}

	/**
	 * Returns the dct_fund_active of this asrim hospitals.
	 *
	 * @return the dct_fund_active of this asrim hospitals
	 */
	@Override
	public String getDCT_FUND_ACTIVE() {
		return model.getDCT_FUND_ACTIVE();
	}

	/**
	 * Returns the delist_susp_remarks of this asrim hospitals.
	 *
	 * @return the delist_susp_remarks of this asrim hospitals
	 */
	@Override
	public String getDELIST_SUSP_REMARKS() {
		return model.getDELIST_SUSP_REMARKS();
	}

	/**
	 * Returns the depo_id of this asrim hospitals.
	 *
	 * @return the depo_id of this asrim hospitals
	 */
	@Override
	public String getDEPO_ID() {
		return model.getDEPO_ID();
	}

	/**
	 * Returns the dist_id of this asrim hospitals.
	 *
	 * @return the dist_id of this asrim hospitals
	 */
	@Override
	public String getDIST_ID() {
		return model.getDIST_ID();
	}

	/**
	 * Returns the dist_id_old of this asrim hospitals.
	 *
	 * @return the dist_id_old of this asrim hospitals
	 */
	@Override
	public String getDIST_ID_OLD() {
		return model.getDIST_ID_OLD();
	}

	/**
	 * Returns the dlist_claim_confm of this asrim hospitals.
	 *
	 * @return the dlist_claim_confm of this asrim hospitals
	 */
	@Override
	public String getDLIST_CLAIM_CONFM() {
		return model.getDLIST_CLAIM_CONFM();
	}

	/**
	 * Returns the ehs_reference_numbe of this asrim hospitals.
	 *
	 * @return the ehs_reference_numbe of this asrim hospitals
	 */
	@Override
	public String getEHS_REFERENCE_NUMBE() {
		return model.getEHS_REFERENCE_NUMBE();
	}

	/**
	 * Returns the err_msgs of this asrim hospitals.
	 *
	 * @return the err_msgs of this asrim hospitals
	 */
	@Override
	public String getERR_MSGS() {
		return model.getERR_MSGS();
	}

	/**
	 * Returns the err_msgs_add of this asrim hospitals.
	 *
	 * @return the err_msgs_add of this asrim hospitals
	 */
	@Override
	public String getERR_MSGS_ADD() {
		return model.getERR_MSGS_ADD();
	}

	/**
	 * Returns the err_msgs_hosp_attach of this asrim hospitals.
	 *
	 * @return the err_msgs_hosp_attach of this asrim hospitals
	 */
	@Override
	public String getERR_MSGS_HOSP_ATTACH() {
		return model.getERR_MSGS_HOSP_ATTACH();
	}

	/**
	 * Returns the err_msgs_infra of this asrim hospitals.
	 *
	 * @return the err_msgs_infra of this asrim hospitals
	 */
	@Override
	public String getERR_MSGS_INFRA() {
		return model.getERR_MSGS_INFRA();
	}

	/**
	 * Returns the exemp_ref_no of this asrim hospitals.
	 *
	 * @return the exemp_ref_no of this asrim hospitals
	 */
	@Override
	public String getEXEMP_REF_NO() {
		return model.getEXEMP_REF_NO();
	}

	/**
	 * Returns the govt_hosp_type of this asrim hospitals.
	 *
	 * @return the govt_hosp_type of this asrim hospitals
	 */
	@Override
	public String getGOVT_HOSP_TYPE() {
		return model.getGOVT_HOSP_TYPE();
	}

	/**
	 * Returns the hosp_account_name of this asrim hospitals.
	 *
	 * @return the hosp_account_name of this asrim hospitals
	 */
	@Override
	public String getHOSP_ACCOUNT_NAME() {
		return model.getHOSP_ACCOUNT_NAME();
	}

	/**
	 * Returns the hosp_active_yn of this asrim hospitals.
	 *
	 * @return the hosp_active_yn of this asrim hospitals
	 */
	@Override
	public String getHOSP_ACTIVE_YN() {
		return model.getHOSP_ACTIVE_YN();
	}

	/**
	 * Returns the hosp_addr1 of this asrim hospitals.
	 *
	 * @return the hosp_addr1 of this asrim hospitals
	 */
	@Override
	public String getHOSP_ADDR1() {
		return model.getHOSP_ADDR1();
	}

	/**
	 * Returns the hosp_addr2 of this asrim hospitals.
	 *
	 * @return the hosp_addr2 of this asrim hospitals
	 */
	@Override
	public String getHOSP_ADDR2() {
		return model.getHOSP_ADDR2();
	}

	/**
	 * Returns the hosp_addr3 of this asrim hospitals.
	 *
	 * @return the hosp_addr3 of this asrim hospitals
	 */
	@Override
	public String getHOSP_ADDR3() {
		return model.getHOSP_ADDR3();
	}

	/**
	 * Returns the hosp_amcco_qual of this asrim hospitals.
	 *
	 * @return the hosp_amcco_qual of this asrim hospitals
	 */
	@Override
	public String getHOSP_AMCCO_QUAL() {
		return model.getHOSP_AMCCO_QUAL();
	}

	/**
	 * Returns the hosp_billinghead_qual of this asrim hospitals.
	 *
	 * @return the hosp_billinghead_qual of this asrim hospitals
	 */
	@Override
	public String getHOSP_BILLINGHEAD_QUAL() {
		return model.getHOSP_BILLINGHEAD_QUAL();
	}

	/**
	 * Returns the hosp_category of this asrim hospitals.
	 *
	 * @return the hosp_category of this asrim hospitals
	 */
	@Override
	public String getHOSP_CATEGORY() {
		return model.getHOSP_CATEGORY();
	}

	/**
	 * Returns the hosp_city of this asrim hospitals.
	 *
	 * @return the hosp_city of this asrim hospitals
	 */
	@Override
	public String getHOSP_CITY() {
		return model.getHOSP_CITY();
	}

	/**
	 * Returns the hosp_contact_no of this asrim hospitals.
	 *
	 * @return the hosp_contact_no of this asrim hospitals
	 */
	@Override
	public String getHOSP_CONTACT_NO() {
		return model.getHOSP_CONTACT_NO();
	}

	/**
	 * Returns the hosp_contact_person of this asrim hospitals.
	 *
	 * @return the hosp_contact_person of this asrim hospitals
	 */
	@Override
	public String getHOSP_CONTACT_PERSON() {
		return model.getHOSP_CONTACT_PERSON();
	}

	/**
	 * Returns the hosp_disp_code of this asrim hospitals.
	 *
	 * @return the hosp_disp_code of this asrim hospitals
	 */
	@Override
	public String getHOSP_DISP_CODE() {
		return model.getHOSP_DISP_CODE();
	}

	/**
	 * Returns the hosp_dist_cd of this asrim hospitals.
	 *
	 * @return the hosp_dist_cd of this asrim hospitals
	 */
	@Override
	public String getHOSP_DIST_CD() {
		return model.getHOSP_DIST_CD();
	}

	/**
	 * Returns the hosp_email of this asrim hospitals.
	 *
	 * @return the hosp_email of this asrim hospitals
	 */
	@Override
	public String getHOSP_EMAIL() {
		return model.getHOSP_EMAIL();
	}

	/**
	 * Returns the hosp_empnl_date of this asrim hospitals.
	 *
	 * @return the hosp_empnl_date of this asrim hospitals
	 */
	@Override
	public Date getHOSP_EMPNL_DATE() {
		return model.getHOSP_EMPNL_DATE();
	}

	/**
	 * Returns the hosp_empnl_ref_num of this asrim hospitals.
	 *
	 * @return the hosp_empnl_ref_num of this asrim hospitals
	 */
	@Override
	public String getHOSP_EMPNL_REF_NUM() {
		return model.getHOSP_EMPNL_REF_NUM();
	}

	/**
	 * Returns the hosp_estab_yr of this asrim hospitals.
	 *
	 * @return the hosp_estab_yr of this asrim hospitals
	 */
	@Override
	public String getHOSP_ESTAB_YR() {
		return model.getHOSP_ESTAB_YR();
	}

	/**
	 * Returns the hosp_fax_no of this asrim hospitals.
	 *
	 * @return the hosp_fax_no of this asrim hospitals
	 */
	@Override
	public String getHOSP_FAX_NO() {
		return model.getHOSP_FAX_NO();
	}

	/**
	 * Returns the hosp_id of this asrim hospitals.
	 *
	 * @return the hosp_id of this asrim hospitals
	 */
	@Override
	public String getHOSP_ID() {
		return model.getHOSP_ID();
	}

	/**
	 * Returns the hosp_macid of this asrim hospitals.
	 *
	 * @return the hosp_macid of this asrim hospitals
	 */
	@Override
	public String getHOSP_MACID() {
		return model.getHOSP_MACID();
	}

	/**
	 * Returns the hosp_mithra of this asrim hospitals.
	 *
	 * @return the hosp_mithra of this asrim hospitals
	 */
	@Override
	public String getHOSP_MITHRA() {
		return model.getHOSP_MITHRA();
	}

	/**
	 * Returns the hosp_name of this asrim hospitals.
	 *
	 * @return the hosp_name of this asrim hospitals
	 */
	@Override
	public String getHOSP_NAME() {
		return model.getHOSP_NAME();
	}

	/**
	 * Returns the hosp_name_tel of this asrim hospitals.
	 *
	 * @return the hosp_name_tel of this asrim hospitals
	 */
	@Override
	public String getHOSP_NAME_TEL() {
		return model.getHOSP_NAME_TEL();
	}

	/**
	 * Returns the hosp_notice of this asrim hospitals.
	 *
	 * @return the hosp_notice of this asrim hospitals
	 */
	@Override
	public String getHOSP_NOTICE() {
		return model.getHOSP_NOTICE();
	}

	/**
	 * Returns the hosp_ramco_qual of this asrim hospitals.
	 *
	 * @return the hosp_ramco_qual of this asrim hospitals
	 */
	@Override
	public String getHOSP_RAMCO_QUAL() {
		return model.getHOSP_RAMCO_QUAL();
	}

	/**
	 * Returns the hosp_speciality of this asrim hospitals.
	 *
	 * @return the hosp_speciality of this asrim hospitals
	 */
	@Override
	public String getHOSP_SPECIALITY() {
		return model.getHOSP_SPECIALITY();
	}

	/**
	 * Returns the hosp_type of this asrim hospitals.
	 *
	 * @return the hosp_type of this asrim hospitals
	 */
	@Override
	public String getHOSP_TYPE() {
		return model.getHOSP_TYPE();
	}

	/**
	 * Returns the hosp_vil_cd of this asrim hospitals.
	 *
	 * @return the hosp_vil_cd of this asrim hospitals
	 */
	@Override
	public String getHOSP_VIL_CD() {
		return model.getHOSP_VIL_CD();
	}

	/**
	 * Returns the incentive_care_account_no of this asrim hospitals.
	 *
	 * @return the incentive_care_account_no of this asrim hospitals
	 */
	@Override
	public String getINCENTIVE_CARE_ACCOUNT_NO() {
		return model.getINCENTIVE_CARE_ACCOUNT_NO();
	}

	/**
	 * Returns the infra_upd of this asrim hospitals.
	 *
	 * @return the infra_upd of this asrim hospitals
	 */
	@Override
	public String getINFRA_UPD() {
		return model.getINFRA_UPD();
	}

	/**
	 * Returns the infra_upd_dt of this asrim hospitals.
	 *
	 * @return the infra_upd_dt of this asrim hospitals
	 */
	@Override
	public Date getINFRA_UPD_DT() {
		return model.getINFRA_UPD_DT();
	}

	/**
	 * Returns the isactive_ap of this asrim hospitals.
	 *
	 * @return the isactive_ap of this asrim hospitals
	 */
	@Override
	public String getISACTIVE_AP() {
		return model.getISACTIVE_AP();
	}

	/**
	 * Returns the isactive_tg of this asrim hospitals.
	 *
	 * @return the isactive_tg of this asrim hospitals
	 */
	@Override
	public String getISACTIVE_TG() {
		return model.getISACTIVE_TG();
	}

	/**
	 * Returns the lang_id of this asrim hospitals.
	 *
	 * @return the lang_id of this asrim hospitals
	 */
	@Override
	public String getLANG_ID() {
		return model.getLANG_ID();
	}

	/**
	 * Returns the lst_upd_dt of this asrim hospitals.
	 *
	 * @return the lst_upd_dt of this asrim hospitals
	 */
	@Override
	public Date getLST_UPD_DT() {
		return model.getLST_UPD_DT();
	}

	/**
	 * Returns the lst_upd_status_dt of this asrim hospitals.
	 *
	 * @return the lst_upd_status_dt of this asrim hospitals
	 */
	@Override
	public Date getLST_UPD_STATUS_DT() {
		return model.getLST_UPD_STATUS_DT();
	}

	/**
	 * Returns the lst_upd_status_usr of this asrim hospitals.
	 *
	 * @return the lst_upd_status_usr of this asrim hospitals
	 */
	@Override
	public String getLST_UPD_STATUS_USR() {
		return model.getLST_UPD_STATUS_USR();
	}

	/**
	 * Returns the lst_upd_usr of this asrim hospitals.
	 *
	 * @return the lst_upd_usr of this asrim hospitals
	 */
	@Override
	public String getLST_UPD_USR() {
		return model.getLST_UPD_USR();
	}

	/**
	 * Returns the medco_login_created of this asrim hospitals.
	 *
	 * @return the medco_login_created of this asrim hospitals
	 */
	@Override
	public String getMEDCO_LOGIN_CREATED() {
		return model.getMEDCO_LOGIN_CREATED();
	}

	/**
	 * Returns the nhpm_hosp_id of this asrim hospitals.
	 *
	 * @return the nhpm_hosp_id of this asrim hospitals
	 */
	@Override
	public String getNHPM_HOSP_ID() {
		return model.getNHPM_HOSP_ID();
	}

	/**
	 * Returns the nhpm_upd of this asrim hospitals.
	 *
	 * @return the nhpm_upd of this asrim hospitals
	 */
	@Override
	public String getNHPM_UPD() {
		return model.getNHPM_UPD();
	}

	/**
	 * Returns the nhpm_upd_add of this asrim hospitals.
	 *
	 * @return the nhpm_upd_add of this asrim hospitals
	 */
	@Override
	public String getNHPM_UPD_ADD() {
		return model.getNHPM_UPD_ADD();
	}

	/**
	 * Returns the nhpm_upd_add_dt of this asrim hospitals.
	 *
	 * @return the nhpm_upd_add_dt of this asrim hospitals
	 */
	@Override
	public Date getNHPM_UPD_ADD_DT() {
		return model.getNHPM_UPD_ADD_DT();
	}

	/**
	 * Returns the nhpm_upd_dt of this asrim hospitals.
	 *
	 * @return the nhpm_upd_dt of this asrim hospitals
	 */
	@Override
	public Date getNHPM_UPD_DT() {
		return model.getNHPM_UPD_DT();
	}

	/**
	 * Returns the nhpm_upd_hosp_attach_dt of this asrim hospitals.
	 *
	 * @return the nhpm_upd_hosp_attach_dt of this asrim hospitals
	 */
	@Override
	public Date getNHPM_UPD_HOSP_ATTACH_DT() {
		return model.getNHPM_UPD_HOSP_ATTACH_DT();
	}

	/**
	 * Returns the nhpm_upm_hosp_attach of this asrim hospitals.
	 *
	 * @return the nhpm_upm_hosp_attach of this asrim hospitals
	 */
	@Override
	public String getNHPM_UPM_HOSP_ATTACH() {
		return model.getNHPM_UPM_HOSP_ATTACH();
	}

	/**
	 * Returns the onbed_patients of this asrim hospitals.
	 *
	 * @return the onbed_patients of this asrim hospitals
	 */
	@Override
	public int getONBED_PATIENTS() {
		return model.getONBED_PATIENTS();
	}

	/**
	 * Returns the org_type of this asrim hospitals.
	 *
	 * @return the org_type of this asrim hospitals
	 */
	@Override
	public String getORG_TYPE() {
		return model.getORG_TYPE();
	}

	/**
	 * Returns the pan_holder_name of this asrim hospitals.
	 *
	 * @return the pan_holder_name of this asrim hospitals
	 */
	@Override
	public String getPAN_HOLDER_NAME() {
		return model.getPAN_HOLDER_NAME();
	}

	/**
	 * Returns the pan_int of this asrim hospitals.
	 *
	 * @return the pan_int of this asrim hospitals
	 */
	@Override
	public String getPAN_int() {
		return model.getPAN_int();
	}

	/**
	 * Returns the pan_number of this asrim hospitals.
	 *
	 * @return the pan_number of this asrim hospitals
	 */
	@Override
	public String getPAN_NUMBER() {
		return model.getPAN_NUMBER();
	}

	/**
	 * Returns the patient_care_account_no of this asrim hospitals.
	 *
	 * @return the patient_care_account_no of this asrim hospitals
	 */
	@Override
	public String getPATIENT_CARE_ACCOUNT_NO() {
		return model.getPATIENT_CARE_ACCOUNT_NO();
	}

	/**
	 * Returns the payments of this asrim hospitals.
	 *
	 * @return the payments of this asrim hospitals
	 */
	@Override
	public String getPAYMENTS() {
		return model.getPAYMENTS();
	}

	/**
	 * Returns the primary key of this asrim hospitals.
	 *
	 * @return the primary key of this asrim hospitals
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the ramco_contact_no of this asrim hospitals.
	 *
	 * @return the ramco_contact_no of this asrim hospitals
	 */
	@Override
	public String getRAMCO_CONTACT_NO() {
		return model.getRAMCO_CONTACT_NO();
	}

	/**
	 * Returns the ramco_email of this asrim hospitals.
	 *
	 * @return the ramco_email of this asrim hospitals
	 */
	@Override
	public String getRAMCO_EMAIL() {
		return model.getRAMCO_EMAIL();
	}

	/**
	 * Returns the ramco_name of this asrim hospitals.
	 *
	 * @return the ramco_name of this asrim hospitals
	 */
	@Override
	public String getRAMCO_NAME() {
		return model.getRAMCO_NAME();
	}

	/**
	 * Returns the response_cnt of this asrim hospitals.
	 *
	 * @return the response_cnt of this asrim hospitals
	 */
	@Override
	public String getRESPONSE_CNT() {
		return model.getRESPONSE_CNT();
	}

	/**
	 * Returns the rev_fund_active of this asrim hospitals.
	 *
	 * @return the rev_fund_active of this asrim hospitals
	 */
	@Override
	public String getREV_FUND_ACTIVE() {
		return model.getREV_FUND_ACTIVE();
	}

	/**
	 * Returns the tds_exemp_status of this asrim hospitals.
	 *
	 * @return the tds_exemp_status of this asrim hospitals
	 */
	@Override
	public String getTDS_EXEMP_STATUS() {
		return model.getTDS_EXEMP_STATUS();
	}

	/**
	 * Returns the tds_from_dt of this asrim hospitals.
	 *
	 * @return the tds_from_dt of this asrim hospitals
	 */
	@Override
	public Date getTDS_FROM_DT() {
		return model.getTDS_FROM_DT();
	}

	/**
	 * Returns the tds_remarks of this asrim hospitals.
	 *
	 * @return the tds_remarks of this asrim hospitals
	 */
	@Override
	public String getTDS_REMARKS() {
		return model.getTDS_REMARKS();
	}

	/**
	 * Returns the tds_to_dt of this asrim hospitals.
	 *
	 * @return the tds_to_dt of this asrim hospitals
	 */
	@Override
	public Date getTDS_TO_DT() {
		return model.getTDS_TO_DT();
	}

	/**
	 * Returns the temporary_hospital of this asrim hospitals.
	 *
	 * @return the temporary_hospital of this asrim hospitals
	 */
	@Override
	public String getTEMPORARY_HOSPITAL() {
		return model.getTEMPORARY_HOSPITAL();
	}

	/**
	 * Returns the usr_macid of this asrim hospitals.
	 *
	 * @return the usr_macid of this asrim hospitals
	 */
	@Override
	public String getUSR_MACID() {
		return model.getUSR_MACID();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the account_no of this asrim hospitals.
	 *
	 * @param ACCOUNT_NO the account_no of this asrim hospitals
	 */
	@Override
	public void setACCOUNT_NO(String ACCOUNT_NO) {
		model.setACCOUNT_NO(ACCOUNT_NO);
	}

	/**
	 * Sets the amcco_contact_no of this asrim hospitals.
	 *
	 * @param AMCCO_CONTACT_NO the amcco_contact_no of this asrim hospitals
	 */
	@Override
	public void setAMCCO_CONTACT_NO(String AMCCO_CONTACT_NO) {
		model.setAMCCO_CONTACT_NO(AMCCO_CONTACT_NO);
	}

	/**
	 * Sets the amcco_email of this asrim hospitals.
	 *
	 * @param AMCCO_EMAIL the amcco_email of this asrim hospitals
	 */
	@Override
	public void setAMCCO_EMAIL(String AMCCO_EMAIL) {
		model.setAMCCO_EMAIL(AMCCO_EMAIL);
	}

	/**
	 * Sets the amcco_name of this asrim hospitals.
	 *
	 * @param AMCCO_NAME the amcco_name of this asrim hospitals
	 */
	@Override
	public void setAMCCO_NAME(String AMCCO_NAME) {
		model.setAMCCO_NAME(AMCCO_NAME);
	}

	/**
	 * Sets the ap_account_no of this asrim hospitals.
	 *
	 * @param AP_ACCOUNT_NO the ap_account_no of this asrim hospitals
	 */
	@Override
	public void setAP_ACCOUNT_NO(String AP_ACCOUNT_NO) {
		model.setAP_ACCOUNT_NO(AP_ACCOUNT_NO);
	}

	/**
	 * Sets the ap_bank_id of this asrim hospitals.
	 *
	 * @param AP_BANK_ID the ap_bank_id of this asrim hospitals
	 */
	@Override
	public void setAP_BANK_ID(String AP_BANK_ID) {
		model.setAP_BANK_ID(AP_BANK_ID);
	}

	/**
	 * Sets the ap_hosp_account_name of this asrim hospitals.
	 *
	 * @param AP_HOSP_ACCOUNT_NAME the ap_hosp_account_name of this asrim hospitals
	 */
	@Override
	public void setAP_HOSP_ACCOUNT_NAME(String AP_HOSP_ACCOUNT_NAME) {
		model.setAP_HOSP_ACCOUNT_NAME(AP_HOSP_ACCOUNT_NAME);
	}

	/**
	 * Sets the ap_inccare_hosp_ac_name of this asrim hospitals.
	 *
	 * @param AP_INCCARE_HOSP_AC_NAME the ap_inccare_hosp_ac_name of this asrim hospitals
	 */
	@Override
	public void setAP_INCCARE_HOSP_AC_NAME(String AP_INCCARE_HOSP_AC_NAME) {
		model.setAP_INCCARE_HOSP_AC_NAME(AP_INCCARE_HOSP_AC_NAME);
	}

	/**
	 * Sets the ap_incentive_care_bank_id of this asrim hospitals.
	 *
	 * @param AP_INCENTIVE_CARE_BANK_ID the ap_incentive_care_bank_id of this asrim hospitals
	 */
	@Override
	public void setAP_INCENTIVE_CARE_BANK_ID(String AP_INCENTIVE_CARE_BANK_ID) {
		model.setAP_INCENTIVE_CARE_BANK_ID(AP_INCENTIVE_CARE_BANK_ID);
	}

	/**
	 * Sets the ap_patcare_hosp_ac_name of this asrim hospitals.
	 *
	 * @param AP_PATCARE_HOSP_AC_NAME the ap_patcare_hosp_ac_name of this asrim hospitals
	 */
	@Override
	public void setAP_PATCARE_HOSP_AC_NAME(String AP_PATCARE_HOSP_AC_NAME) {
		model.setAP_PATCARE_HOSP_AC_NAME(AP_PATCARE_HOSP_AC_NAME);
	}

	/**
	 * Sets the ap_patient_care_bankid of this asrim hospitals.
	 *
	 * @param AP_PATIENT_CARE_BANKID the ap_patient_care_bankid of this asrim hospitals
	 */
	@Override
	public void setAP_PATIENT_CARE_BANKID(String AP_PATIENT_CARE_BANKID) {
		model.setAP_PATIENT_CARE_BANKID(AP_PATIENT_CARE_BANKID);
	}

	/**
	 * Sets the application_type of this asrim hospitals.
	 *
	 * @param APPLICATION_TYPE the application_type of this asrim hospitals
	 */
	@Override
	public void setAPPLICATION_TYPE(String APPLICATION_TYPE) {
		model.setAPPLICATION_TYPE(APPLICATION_TYPE);
	}

	/**
	 * Sets the bank_id of this asrim hospitals.
	 *
	 * @param BANK_ID the bank_id of this asrim hospitals
	 */
	@Override
	public void setBANK_ID(String BANK_ID) {
		model.setBANK_ID(BANK_ID);
	}

	/**
	 * Sets the bill_head_contact_no of this asrim hospitals.
	 *
	 * @param BILL_HEAD_CONTACT_NO the bill_head_contact_no of this asrim hospitals
	 */
	@Override
	public void setBILL_HEAD_CONTACT_NO(String BILL_HEAD_CONTACT_NO) {
		model.setBILL_HEAD_CONTACT_NO(BILL_HEAD_CONTACT_NO);
	}

	/**
	 * Sets the bill_head_email of this asrim hospitals.
	 *
	 * @param BILL_HEAD_EMAIL the bill_head_email of this asrim hospitals
	 */
	@Override
	public void setBILL_HEAD_EMAIL(String BILL_HEAD_EMAIL) {
		model.setBILL_HEAD_EMAIL(BILL_HEAD_EMAIL);
	}

	/**
	 * Sets the bill_head_name of this asrim hospitals.
	 *
	 * @param BILL_HEAD_NAME the bill_head_name of this asrim hospitals
	 */
	@Override
	public void setBILL_HEAD_NAME(String BILL_HEAD_NAME) {
		model.setBILL_HEAD_NAME(BILL_HEAD_NAME);
	}

	/**
	 * Sets the biom_required of this asrim hospitals.
	 *
	 * @param BIOM_REQUIRED the biom_required of this asrim hospitals
	 */
	@Override
	public void setBIOM_REQUIRED(String BIOM_REQUIRED) {
		model.setBIOM_REQUIRED(BIOM_REQUIRED);
	}

	/**
	 * Sets the biom_required_ap of this asrim hospitals.
	 *
	 * @param BIOM_REQUIRED_AP the biom_required_ap of this asrim hospitals
	 */
	@Override
	public void setBIOM_REQUIRED_AP(String BIOM_REQUIRED_AP) {
		model.setBIOM_REQUIRED_AP(BIOM_REQUIRED_AP);
	}

	/**
	 * Sets the block_claims_tg of this asrim hospitals.
	 *
	 * @param BLOCK_CLAIMS_TG the block_claims_tg of this asrim hospitals
	 */
	@Override
	public void setBLOCK_CLAIMS_TG(String BLOCK_CLAIMS_TG) {
		model.setBLOCK_CLAIMS_TG(BLOCK_CLAIMS_TG);
	}

	/**
	 * Sets the complaint_type of this asrim hospitals.
	 *
	 * @param COMPLAINT_TYPE the complaint_type of this asrim hospitals
	 */
	@Override
	public void setCOMPLAINT_TYPE(String COMPLAINT_TYPE) {
		model.setCOMPLAINT_TYPE(COMPLAINT_TYPE);
	}

	/**
	 * Sets the complaint_type_tg of this asrim hospitals.
	 *
	 * @param COMPLAINT_TYPE_TG the complaint_type_tg of this asrim hospitals
	 */
	@Override
	public void setCOMPLAINT_TYPE_TG(String COMPLAINT_TYPE_TG) {
		model.setCOMPLAINT_TYPE_TG(COMPLAINT_TYPE_TG);
	}

	/**
	 * Sets the covid_nwh_status of this asrim hospitals.
	 *
	 * @param COVID_NWH_STATUS the covid_nwh_status of this asrim hospitals
	 */
	@Override
	public void setCOVID_NWH_STATUS(String COVID_NWH_STATUS) {
		model.setCOVID_NWH_STATUS(COVID_NWH_STATUS);
	}

	/**
	 * Sets the crt_dt of this asrim hospitals.
	 *
	 * @param CRT_DT the crt_dt of this asrim hospitals
	 */
	@Override
	public void setCRT_DT(Date CRT_DT) {
		model.setCRT_DT(CRT_DT);
	}

	/**
	 * Sets the crt_usr of this asrim hospitals.
	 *
	 * @param CRT_USR the crt_usr of this asrim hospitals
	 */
	@Override
	public void setCRT_USR(String CRT_USR) {
		model.setCRT_USR(CRT_USR);
	}

	/**
	 * Sets the cug_no of this asrim hospitals.
	 *
	 * @param CUG_NO the cug_no of this asrim hospitals
	 */
	@Override
	public void setCUG_NO(String CUG_NO) {
		model.setCUG_NO(CUG_NO);
	}

	/**
	 * Sets the dct_fund_active of this asrim hospitals.
	 *
	 * @param DCT_FUND_ACTIVE the dct_fund_active of this asrim hospitals
	 */
	@Override
	public void setDCT_FUND_ACTIVE(String DCT_FUND_ACTIVE) {
		model.setDCT_FUND_ACTIVE(DCT_FUND_ACTIVE);
	}

	/**
	 * Sets the delist_susp_remarks of this asrim hospitals.
	 *
	 * @param DELIST_SUSP_REMARKS the delist_susp_remarks of this asrim hospitals
	 */
	@Override
	public void setDELIST_SUSP_REMARKS(String DELIST_SUSP_REMARKS) {
		model.setDELIST_SUSP_REMARKS(DELIST_SUSP_REMARKS);
	}

	/**
	 * Sets the depo_id of this asrim hospitals.
	 *
	 * @param DEPO_ID the depo_id of this asrim hospitals
	 */
	@Override
	public void setDEPO_ID(String DEPO_ID) {
		model.setDEPO_ID(DEPO_ID);
	}

	/**
	 * Sets the dist_id of this asrim hospitals.
	 *
	 * @param DIST_ID the dist_id of this asrim hospitals
	 */
	@Override
	public void setDIST_ID(String DIST_ID) {
		model.setDIST_ID(DIST_ID);
	}

	/**
	 * Sets the dist_id_old of this asrim hospitals.
	 *
	 * @param DIST_ID_OLD the dist_id_old of this asrim hospitals
	 */
	@Override
	public void setDIST_ID_OLD(String DIST_ID_OLD) {
		model.setDIST_ID_OLD(DIST_ID_OLD);
	}

	/**
	 * Sets the dlist_claim_confm of this asrim hospitals.
	 *
	 * @param DLIST_CLAIM_CONFM the dlist_claim_confm of this asrim hospitals
	 */
	@Override
	public void setDLIST_CLAIM_CONFM(String DLIST_CLAIM_CONFM) {
		model.setDLIST_CLAIM_CONFM(DLIST_CLAIM_CONFM);
	}

	/**
	 * Sets the ehs_reference_numbe of this asrim hospitals.
	 *
	 * @param EHS_REFERENCE_NUMBE the ehs_reference_numbe of this asrim hospitals
	 */
	@Override
	public void setEHS_REFERENCE_NUMBE(String EHS_REFERENCE_NUMBE) {
		model.setEHS_REFERENCE_NUMBE(EHS_REFERENCE_NUMBE);
	}

	/**
	 * Sets the err_msgs of this asrim hospitals.
	 *
	 * @param ERR_MSGS the err_msgs of this asrim hospitals
	 */
	@Override
	public void setERR_MSGS(String ERR_MSGS) {
		model.setERR_MSGS(ERR_MSGS);
	}

	/**
	 * Sets the err_msgs_add of this asrim hospitals.
	 *
	 * @param ERR_MSGS_ADD the err_msgs_add of this asrim hospitals
	 */
	@Override
	public void setERR_MSGS_ADD(String ERR_MSGS_ADD) {
		model.setERR_MSGS_ADD(ERR_MSGS_ADD);
	}

	/**
	 * Sets the err_msgs_hosp_attach of this asrim hospitals.
	 *
	 * @param ERR_MSGS_HOSP_ATTACH the err_msgs_hosp_attach of this asrim hospitals
	 */
	@Override
	public void setERR_MSGS_HOSP_ATTACH(String ERR_MSGS_HOSP_ATTACH) {
		model.setERR_MSGS_HOSP_ATTACH(ERR_MSGS_HOSP_ATTACH);
	}

	/**
	 * Sets the err_msgs_infra of this asrim hospitals.
	 *
	 * @param ERR_MSGS_INFRA the err_msgs_infra of this asrim hospitals
	 */
	@Override
	public void setERR_MSGS_INFRA(String ERR_MSGS_INFRA) {
		model.setERR_MSGS_INFRA(ERR_MSGS_INFRA);
	}

	/**
	 * Sets the exemp_ref_no of this asrim hospitals.
	 *
	 * @param EXEMP_REF_NO the exemp_ref_no of this asrim hospitals
	 */
	@Override
	public void setEXEMP_REF_NO(String EXEMP_REF_NO) {
		model.setEXEMP_REF_NO(EXEMP_REF_NO);
	}

	/**
	 * Sets the govt_hosp_type of this asrim hospitals.
	 *
	 * @param GOVT_HOSP_TYPE the govt_hosp_type of this asrim hospitals
	 */
	@Override
	public void setGOVT_HOSP_TYPE(String GOVT_HOSP_TYPE) {
		model.setGOVT_HOSP_TYPE(GOVT_HOSP_TYPE);
	}

	/**
	 * Sets the hosp_account_name of this asrim hospitals.
	 *
	 * @param HOSP_ACCOUNT_NAME the hosp_account_name of this asrim hospitals
	 */
	@Override
	public void setHOSP_ACCOUNT_NAME(String HOSP_ACCOUNT_NAME) {
		model.setHOSP_ACCOUNT_NAME(HOSP_ACCOUNT_NAME);
	}

	/**
	 * Sets the hosp_active_yn of this asrim hospitals.
	 *
	 * @param HOSP_ACTIVE_YN the hosp_active_yn of this asrim hospitals
	 */
	@Override
	public void setHOSP_ACTIVE_YN(String HOSP_ACTIVE_YN) {
		model.setHOSP_ACTIVE_YN(HOSP_ACTIVE_YN);
	}

	/**
	 * Sets the hosp_addr1 of this asrim hospitals.
	 *
	 * @param HOSP_ADDR1 the hosp_addr1 of this asrim hospitals
	 */
	@Override
	public void setHOSP_ADDR1(String HOSP_ADDR1) {
		model.setHOSP_ADDR1(HOSP_ADDR1);
	}

	/**
	 * Sets the hosp_addr2 of this asrim hospitals.
	 *
	 * @param HOSP_ADDR2 the hosp_addr2 of this asrim hospitals
	 */
	@Override
	public void setHOSP_ADDR2(String HOSP_ADDR2) {
		model.setHOSP_ADDR2(HOSP_ADDR2);
	}

	/**
	 * Sets the hosp_addr3 of this asrim hospitals.
	 *
	 * @param HOSP_ADDR3 the hosp_addr3 of this asrim hospitals
	 */
	@Override
	public void setHOSP_ADDR3(String HOSP_ADDR3) {
		model.setHOSP_ADDR3(HOSP_ADDR3);
	}

	/**
	 * Sets the hosp_amcco_qual of this asrim hospitals.
	 *
	 * @param HOSP_AMCCO_QUAL the hosp_amcco_qual of this asrim hospitals
	 */
	@Override
	public void setHOSP_AMCCO_QUAL(String HOSP_AMCCO_QUAL) {
		model.setHOSP_AMCCO_QUAL(HOSP_AMCCO_QUAL);
	}

	/**
	 * Sets the hosp_billinghead_qual of this asrim hospitals.
	 *
	 * @param HOSP_BILLINGHEAD_QUAL the hosp_billinghead_qual of this asrim hospitals
	 */
	@Override
	public void setHOSP_BILLINGHEAD_QUAL(String HOSP_BILLINGHEAD_QUAL) {
		model.setHOSP_BILLINGHEAD_QUAL(HOSP_BILLINGHEAD_QUAL);
	}

	/**
	 * Sets the hosp_category of this asrim hospitals.
	 *
	 * @param HOSP_CATEGORY the hosp_category of this asrim hospitals
	 */
	@Override
	public void setHOSP_CATEGORY(String HOSP_CATEGORY) {
		model.setHOSP_CATEGORY(HOSP_CATEGORY);
	}

	/**
	 * Sets the hosp_city of this asrim hospitals.
	 *
	 * @param HOSP_CITY the hosp_city of this asrim hospitals
	 */
	@Override
	public void setHOSP_CITY(String HOSP_CITY) {
		model.setHOSP_CITY(HOSP_CITY);
	}

	/**
	 * Sets the hosp_contact_no of this asrim hospitals.
	 *
	 * @param HOSP_CONTACT_NO the hosp_contact_no of this asrim hospitals
	 */
	@Override
	public void setHOSP_CONTACT_NO(String HOSP_CONTACT_NO) {
		model.setHOSP_CONTACT_NO(HOSP_CONTACT_NO);
	}

	/**
	 * Sets the hosp_contact_person of this asrim hospitals.
	 *
	 * @param HOSP_CONTACT_PERSON the hosp_contact_person of this asrim hospitals
	 */
	@Override
	public void setHOSP_CONTACT_PERSON(String HOSP_CONTACT_PERSON) {
		model.setHOSP_CONTACT_PERSON(HOSP_CONTACT_PERSON);
	}

	/**
	 * Sets the hosp_disp_code of this asrim hospitals.
	 *
	 * @param HOSP_DISP_CODE the hosp_disp_code of this asrim hospitals
	 */
	@Override
	public void setHOSP_DISP_CODE(String HOSP_DISP_CODE) {
		model.setHOSP_DISP_CODE(HOSP_DISP_CODE);
	}

	/**
	 * Sets the hosp_dist_cd of this asrim hospitals.
	 *
	 * @param HOSP_DIST_CD the hosp_dist_cd of this asrim hospitals
	 */
	@Override
	public void setHOSP_DIST_CD(String HOSP_DIST_CD) {
		model.setHOSP_DIST_CD(HOSP_DIST_CD);
	}

	/**
	 * Sets the hosp_email of this asrim hospitals.
	 *
	 * @param HOSP_EMAIL the hosp_email of this asrim hospitals
	 */
	@Override
	public void setHOSP_EMAIL(String HOSP_EMAIL) {
		model.setHOSP_EMAIL(HOSP_EMAIL);
	}

	/**
	 * Sets the hosp_empnl_date of this asrim hospitals.
	 *
	 * @param HOSP_EMPNL_DATE the hosp_empnl_date of this asrim hospitals
	 */
	@Override
	public void setHOSP_EMPNL_DATE(Date HOSP_EMPNL_DATE) {
		model.setHOSP_EMPNL_DATE(HOSP_EMPNL_DATE);
	}

	/**
	 * Sets the hosp_empnl_ref_num of this asrim hospitals.
	 *
	 * @param HOSP_EMPNL_REF_NUM the hosp_empnl_ref_num of this asrim hospitals
	 */
	@Override
	public void setHOSP_EMPNL_REF_NUM(String HOSP_EMPNL_REF_NUM) {
		model.setHOSP_EMPNL_REF_NUM(HOSP_EMPNL_REF_NUM);
	}

	/**
	 * Sets the hosp_estab_yr of this asrim hospitals.
	 *
	 * @param HOSP_ESTAB_YR the hosp_estab_yr of this asrim hospitals
	 */
	@Override
	public void setHOSP_ESTAB_YR(String HOSP_ESTAB_YR) {
		model.setHOSP_ESTAB_YR(HOSP_ESTAB_YR);
	}

	/**
	 * Sets the hosp_fax_no of this asrim hospitals.
	 *
	 * @param HOSP_FAX_NO the hosp_fax_no of this asrim hospitals
	 */
	@Override
	public void setHOSP_FAX_NO(String HOSP_FAX_NO) {
		model.setHOSP_FAX_NO(HOSP_FAX_NO);
	}

	/**
	 * Sets the hosp_id of this asrim hospitals.
	 *
	 * @param HOSP_ID the hosp_id of this asrim hospitals
	 */
	@Override
	public void setHOSP_ID(String HOSP_ID) {
		model.setHOSP_ID(HOSP_ID);
	}

	/**
	 * Sets the hosp_macid of this asrim hospitals.
	 *
	 * @param HOSP_MACID the hosp_macid of this asrim hospitals
	 */
	@Override
	public void setHOSP_MACID(String HOSP_MACID) {
		model.setHOSP_MACID(HOSP_MACID);
	}

	/**
	 * Sets the hosp_mithra of this asrim hospitals.
	 *
	 * @param HOSP_MITHRA the hosp_mithra of this asrim hospitals
	 */
	@Override
	public void setHOSP_MITHRA(String HOSP_MITHRA) {
		model.setHOSP_MITHRA(HOSP_MITHRA);
	}

	/**
	 * Sets the hosp_name of this asrim hospitals.
	 *
	 * @param HOSP_NAME the hosp_name of this asrim hospitals
	 */
	@Override
	public void setHOSP_NAME(String HOSP_NAME) {
		model.setHOSP_NAME(HOSP_NAME);
	}

	/**
	 * Sets the hosp_name_tel of this asrim hospitals.
	 *
	 * @param HOSP_NAME_TEL the hosp_name_tel of this asrim hospitals
	 */
	@Override
	public void setHOSP_NAME_TEL(String HOSP_NAME_TEL) {
		model.setHOSP_NAME_TEL(HOSP_NAME_TEL);
	}

	/**
	 * Sets the hosp_notice of this asrim hospitals.
	 *
	 * @param HOSP_NOTICE the hosp_notice of this asrim hospitals
	 */
	@Override
	public void setHOSP_NOTICE(String HOSP_NOTICE) {
		model.setHOSP_NOTICE(HOSP_NOTICE);
	}

	/**
	 * Sets the hosp_ramco_qual of this asrim hospitals.
	 *
	 * @param HOSP_RAMCO_QUAL the hosp_ramco_qual of this asrim hospitals
	 */
	@Override
	public void setHOSP_RAMCO_QUAL(String HOSP_RAMCO_QUAL) {
		model.setHOSP_RAMCO_QUAL(HOSP_RAMCO_QUAL);
	}

	/**
	 * Sets the hosp_speciality of this asrim hospitals.
	 *
	 * @param HOSP_SPECIALITY the hosp_speciality of this asrim hospitals
	 */
	@Override
	public void setHOSP_SPECIALITY(String HOSP_SPECIALITY) {
		model.setHOSP_SPECIALITY(HOSP_SPECIALITY);
	}

	/**
	 * Sets the hosp_type of this asrim hospitals.
	 *
	 * @param HOSP_TYPE the hosp_type of this asrim hospitals
	 */
	@Override
	public void setHOSP_TYPE(String HOSP_TYPE) {
		model.setHOSP_TYPE(HOSP_TYPE);
	}

	/**
	 * Sets the hosp_vil_cd of this asrim hospitals.
	 *
	 * @param HOSP_VIL_CD the hosp_vil_cd of this asrim hospitals
	 */
	@Override
	public void setHOSP_VIL_CD(String HOSP_VIL_CD) {
		model.setHOSP_VIL_CD(HOSP_VIL_CD);
	}

	/**
	 * Sets the incentive_care_account_no of this asrim hospitals.
	 *
	 * @param INCENTIVE_CARE_ACCOUNT_NO the incentive_care_account_no of this asrim hospitals
	 */
	@Override
	public void setINCENTIVE_CARE_ACCOUNT_NO(String INCENTIVE_CARE_ACCOUNT_NO) {
		model.setINCENTIVE_CARE_ACCOUNT_NO(INCENTIVE_CARE_ACCOUNT_NO);
	}

	/**
	 * Sets the infra_upd of this asrim hospitals.
	 *
	 * @param INFRA_UPD the infra_upd of this asrim hospitals
	 */
	@Override
	public void setINFRA_UPD(String INFRA_UPD) {
		model.setINFRA_UPD(INFRA_UPD);
	}

	/**
	 * Sets the infra_upd_dt of this asrim hospitals.
	 *
	 * @param INFRA_UPD_DT the infra_upd_dt of this asrim hospitals
	 */
	@Override
	public void setINFRA_UPD_DT(Date INFRA_UPD_DT) {
		model.setINFRA_UPD_DT(INFRA_UPD_DT);
	}

	/**
	 * Sets the isactive_ap of this asrim hospitals.
	 *
	 * @param ISACTIVE_AP the isactive_ap of this asrim hospitals
	 */
	@Override
	public void setISACTIVE_AP(String ISACTIVE_AP) {
		model.setISACTIVE_AP(ISACTIVE_AP);
	}

	/**
	 * Sets the isactive_tg of this asrim hospitals.
	 *
	 * @param ISACTIVE_TG the isactive_tg of this asrim hospitals
	 */
	@Override
	public void setISACTIVE_TG(String ISACTIVE_TG) {
		model.setISACTIVE_TG(ISACTIVE_TG);
	}

	/**
	 * Sets the lang_id of this asrim hospitals.
	 *
	 * @param LANG_ID the lang_id of this asrim hospitals
	 */
	@Override
	public void setLANG_ID(String LANG_ID) {
		model.setLANG_ID(LANG_ID);
	}

	/**
	 * Sets the lst_upd_dt of this asrim hospitals.
	 *
	 * @param LST_UPD_DT the lst_upd_dt of this asrim hospitals
	 */
	@Override
	public void setLST_UPD_DT(Date LST_UPD_DT) {
		model.setLST_UPD_DT(LST_UPD_DT);
	}

	/**
	 * Sets the lst_upd_status_dt of this asrim hospitals.
	 *
	 * @param LST_UPD_STATUS_DT the lst_upd_status_dt of this asrim hospitals
	 */
	@Override
	public void setLST_UPD_STATUS_DT(Date LST_UPD_STATUS_DT) {
		model.setLST_UPD_STATUS_DT(LST_UPD_STATUS_DT);
	}

	/**
	 * Sets the lst_upd_status_usr of this asrim hospitals.
	 *
	 * @param LST_UPD_STATUS_USR the lst_upd_status_usr of this asrim hospitals
	 */
	@Override
	public void setLST_UPD_STATUS_USR(String LST_UPD_STATUS_USR) {
		model.setLST_UPD_STATUS_USR(LST_UPD_STATUS_USR);
	}

	/**
	 * Sets the lst_upd_usr of this asrim hospitals.
	 *
	 * @param LST_UPD_USR the lst_upd_usr of this asrim hospitals
	 */
	@Override
	public void setLST_UPD_USR(String LST_UPD_USR) {
		model.setLST_UPD_USR(LST_UPD_USR);
	}

	/**
	 * Sets the medco_login_created of this asrim hospitals.
	 *
	 * @param MEDCO_LOGIN_CREATED the medco_login_created of this asrim hospitals
	 */
	@Override
	public void setMEDCO_LOGIN_CREATED(String MEDCO_LOGIN_CREATED) {
		model.setMEDCO_LOGIN_CREATED(MEDCO_LOGIN_CREATED);
	}

	/**
	 * Sets the nhpm_hosp_id of this asrim hospitals.
	 *
	 * @param NHPM_HOSP_ID the nhpm_hosp_id of this asrim hospitals
	 */
	@Override
	public void setNHPM_HOSP_ID(String NHPM_HOSP_ID) {
		model.setNHPM_HOSP_ID(NHPM_HOSP_ID);
	}

	/**
	 * Sets the nhpm_upd of this asrim hospitals.
	 *
	 * @param NHPM_UPD the nhpm_upd of this asrim hospitals
	 */
	@Override
	public void setNHPM_UPD(String NHPM_UPD) {
		model.setNHPM_UPD(NHPM_UPD);
	}

	/**
	 * Sets the nhpm_upd_add of this asrim hospitals.
	 *
	 * @param NHPM_UPD_ADD the nhpm_upd_add of this asrim hospitals
	 */
	@Override
	public void setNHPM_UPD_ADD(String NHPM_UPD_ADD) {
		model.setNHPM_UPD_ADD(NHPM_UPD_ADD);
	}

	/**
	 * Sets the nhpm_upd_add_dt of this asrim hospitals.
	 *
	 * @param NHPM_UPD_ADD_DT the nhpm_upd_add_dt of this asrim hospitals
	 */
	@Override
	public void setNHPM_UPD_ADD_DT(Date NHPM_UPD_ADD_DT) {
		model.setNHPM_UPD_ADD_DT(NHPM_UPD_ADD_DT);
	}

	/**
	 * Sets the nhpm_upd_dt of this asrim hospitals.
	 *
	 * @param NHPM_UPD_DT the nhpm_upd_dt of this asrim hospitals
	 */
	@Override
	public void setNHPM_UPD_DT(Date NHPM_UPD_DT) {
		model.setNHPM_UPD_DT(NHPM_UPD_DT);
	}

	/**
	 * Sets the nhpm_upd_hosp_attach_dt of this asrim hospitals.
	 *
	 * @param NHPM_UPD_HOSP_ATTACH_DT the nhpm_upd_hosp_attach_dt of this asrim hospitals
	 */
	@Override
	public void setNHPM_UPD_HOSP_ATTACH_DT(Date NHPM_UPD_HOSP_ATTACH_DT) {
		model.setNHPM_UPD_HOSP_ATTACH_DT(NHPM_UPD_HOSP_ATTACH_DT);
	}

	/**
	 * Sets the nhpm_upm_hosp_attach of this asrim hospitals.
	 *
	 * @param NHPM_UPM_HOSP_ATTACH the nhpm_upm_hosp_attach of this asrim hospitals
	 */
	@Override
	public void setNHPM_UPM_HOSP_ATTACH(String NHPM_UPM_HOSP_ATTACH) {
		model.setNHPM_UPM_HOSP_ATTACH(NHPM_UPM_HOSP_ATTACH);
	}

	/**
	 * Sets the onbed_patients of this asrim hospitals.
	 *
	 * @param ONBED_PATIENTS the onbed_patients of this asrim hospitals
	 */
	@Override
	public void setONBED_PATIENTS(int ONBED_PATIENTS) {
		model.setONBED_PATIENTS(ONBED_PATIENTS);
	}

	/**
	 * Sets the org_type of this asrim hospitals.
	 *
	 * @param ORG_TYPE the org_type of this asrim hospitals
	 */
	@Override
	public void setORG_TYPE(String ORG_TYPE) {
		model.setORG_TYPE(ORG_TYPE);
	}

	/**
	 * Sets the pan_holder_name of this asrim hospitals.
	 *
	 * @param PAN_HOLDER_NAME the pan_holder_name of this asrim hospitals
	 */
	@Override
	public void setPAN_HOLDER_NAME(String PAN_HOLDER_NAME) {
		model.setPAN_HOLDER_NAME(PAN_HOLDER_NAME);
	}

	/**
	 * Sets the pan_int of this asrim hospitals.
	 *
	 * @param PAN_int the pan_int of this asrim hospitals
	 */
	@Override
	public void setPAN_int(String PAN_int) {
		model.setPAN_int(PAN_int);
	}

	/**
	 * Sets the pan_number of this asrim hospitals.
	 *
	 * @param PAN_NUMBER the pan_number of this asrim hospitals
	 */
	@Override
	public void setPAN_NUMBER(String PAN_NUMBER) {
		model.setPAN_NUMBER(PAN_NUMBER);
	}

	/**
	 * Sets the patient_care_account_no of this asrim hospitals.
	 *
	 * @param PATIENT_CARE_ACCOUNT_NO the patient_care_account_no of this asrim hospitals
	 */
	@Override
	public void setPATIENT_CARE_ACCOUNT_NO(String PATIENT_CARE_ACCOUNT_NO) {
		model.setPATIENT_CARE_ACCOUNT_NO(PATIENT_CARE_ACCOUNT_NO);
	}

	/**
	 * Sets the payments of this asrim hospitals.
	 *
	 * @param PAYMENTS the payments of this asrim hospitals
	 */
	@Override
	public void setPAYMENTS(String PAYMENTS) {
		model.setPAYMENTS(PAYMENTS);
	}

	/**
	 * Sets the primary key of this asrim hospitals.
	 *
	 * @param primaryKey the primary key of this asrim hospitals
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the ramco_contact_no of this asrim hospitals.
	 *
	 * @param RAMCO_CONTACT_NO the ramco_contact_no of this asrim hospitals
	 */
	@Override
	public void setRAMCO_CONTACT_NO(String RAMCO_CONTACT_NO) {
		model.setRAMCO_CONTACT_NO(RAMCO_CONTACT_NO);
	}

	/**
	 * Sets the ramco_email of this asrim hospitals.
	 *
	 * @param RAMCO_EMAIL the ramco_email of this asrim hospitals
	 */
	@Override
	public void setRAMCO_EMAIL(String RAMCO_EMAIL) {
		model.setRAMCO_EMAIL(RAMCO_EMAIL);
	}

	/**
	 * Sets the ramco_name of this asrim hospitals.
	 *
	 * @param RAMCO_NAME the ramco_name of this asrim hospitals
	 */
	@Override
	public void setRAMCO_NAME(String RAMCO_NAME) {
		model.setRAMCO_NAME(RAMCO_NAME);
	}

	/**
	 * Sets the response_cnt of this asrim hospitals.
	 *
	 * @param RESPONSE_CNT the response_cnt of this asrim hospitals
	 */
	@Override
	public void setRESPONSE_CNT(String RESPONSE_CNT) {
		model.setRESPONSE_CNT(RESPONSE_CNT);
	}

	/**
	 * Sets the rev_fund_active of this asrim hospitals.
	 *
	 * @param REV_FUND_ACTIVE the rev_fund_active of this asrim hospitals
	 */
	@Override
	public void setREV_FUND_ACTIVE(String REV_FUND_ACTIVE) {
		model.setREV_FUND_ACTIVE(REV_FUND_ACTIVE);
	}

	/**
	 * Sets the tds_exemp_status of this asrim hospitals.
	 *
	 * @param TDS_EXEMP_STATUS the tds_exemp_status of this asrim hospitals
	 */
	@Override
	public void setTDS_EXEMP_STATUS(String TDS_EXEMP_STATUS) {
		model.setTDS_EXEMP_STATUS(TDS_EXEMP_STATUS);
	}

	/**
	 * Sets the tds_from_dt of this asrim hospitals.
	 *
	 * @param TDS_FROM_DT the tds_from_dt of this asrim hospitals
	 */
	@Override
	public void setTDS_FROM_DT(Date TDS_FROM_DT) {
		model.setTDS_FROM_DT(TDS_FROM_DT);
	}

	/**
	 * Sets the tds_remarks of this asrim hospitals.
	 *
	 * @param TDS_REMARKS the tds_remarks of this asrim hospitals
	 */
	@Override
	public void setTDS_REMARKS(String TDS_REMARKS) {
		model.setTDS_REMARKS(TDS_REMARKS);
	}

	/**
	 * Sets the tds_to_dt of this asrim hospitals.
	 *
	 * @param TDS_TO_DT the tds_to_dt of this asrim hospitals
	 */
	@Override
	public void setTDS_TO_DT(Date TDS_TO_DT) {
		model.setTDS_TO_DT(TDS_TO_DT);
	}

	/**
	 * Sets the temporary_hospital of this asrim hospitals.
	 *
	 * @param TEMPORARY_HOSPITAL the temporary_hospital of this asrim hospitals
	 */
	@Override
	public void setTEMPORARY_HOSPITAL(String TEMPORARY_HOSPITAL) {
		model.setTEMPORARY_HOSPITAL(TEMPORARY_HOSPITAL);
	}

	/**
	 * Sets the usr_macid of this asrim hospitals.
	 *
	 * @param USR_MACID the usr_macid of this asrim hospitals
	 */
	@Override
	public void setUSR_MACID(String USR_MACID) {
		model.setUSR_MACID(USR_MACID);
	}

	@Override
	protected AsrimHospitalsWrapper wrap(AsrimHospitals asrimHospitals) {
		return new AsrimHospitalsWrapper(asrimHospitals);
	}

}