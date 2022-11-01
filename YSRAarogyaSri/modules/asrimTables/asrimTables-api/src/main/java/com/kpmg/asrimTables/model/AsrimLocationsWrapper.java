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
 * This class is a wrapper for {@link AsrimLocations}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AsrimLocations
 * @generated
 */
public class AsrimLocationsWrapper
	extends BaseModelWrapper<AsrimLocations>
	implements AsrimLocations, ModelWrapper<AsrimLocations> {

	public AsrimLocationsWrapper(AsrimLocations asrimLocations) {
		super(asrimLocations);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("LOC_ID", getLOC_ID());
		attributes.put("LOC_NAME", getLOC_NAME());
		attributes.put("LOC_PARNT_ID", getLOC_PARNT_ID());
		attributes.put("LOC_ORDER", getLOC_ORDER());
		attributes.put("LOC_DESC", getLOC_DESC());
		attributes.put("LOC_VAL", getLOC_VAL());
		attributes.put("LANG_ID", getLANG_ID());
		attributes.put("CRT_USR", getCRT_USR());
		attributes.put("CRT_DT", getCRT_DT());
		attributes.put("LST_UPD_USR", getLST_UPD_USR());
		attributes.put("LST_UPD_DT", getLST_UPD_DT());
		attributes.put("LOC_HDR_ID", getLOC_HDR_ID());
		attributes.put("ACTIVE_YN", getACTIVE_YN());
		attributes.put("ITDA", getITDA());
		attributes.put("ITDA_AREA", getITDA_AREA());
		attributes.put("URBAN_RURAL", getURBAN_RURAL());
		attributes.put("PINCODE", getPINCODE());
		attributes.put("IS_CRDA_LOCATION", getIS_CRDA_LOCATION());
		attributes.put("EHS_LOCATION_ID", getEHS_LOCATION_ID());
		attributes.put("RURAL_URBAN", getRURAL_URBAN());
		attributes.put("LOC_DESC_TEL", getLOC_DESC_TEL());
		attributes.put("LOC_STATE_VAL", getLOC_STATE_VAL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String LOC_ID = (String)attributes.get("LOC_ID");

		if (LOC_ID != null) {
			setLOC_ID(LOC_ID);
		}

		String LOC_NAME = (String)attributes.get("LOC_NAME");

		if (LOC_NAME != null) {
			setLOC_NAME(LOC_NAME);
		}

		String LOC_PARNT_ID = (String)attributes.get("LOC_PARNT_ID");

		if (LOC_PARNT_ID != null) {
			setLOC_PARNT_ID(LOC_PARNT_ID);
		}

		String LOC_ORDER = (String)attributes.get("LOC_ORDER");

		if (LOC_ORDER != null) {
			setLOC_ORDER(LOC_ORDER);
		}

		String LOC_DESC = (String)attributes.get("LOC_DESC");

		if (LOC_DESC != null) {
			setLOC_DESC(LOC_DESC);
		}

		String LOC_VAL = (String)attributes.get("LOC_VAL");

		if (LOC_VAL != null) {
			setLOC_VAL(LOC_VAL);
		}

		String LANG_ID = (String)attributes.get("LANG_ID");

		if (LANG_ID != null) {
			setLANG_ID(LANG_ID);
		}

		String CRT_USR = (String)attributes.get("CRT_USR");

		if (CRT_USR != null) {
			setCRT_USR(CRT_USR);
		}

		Date CRT_DT = (Date)attributes.get("CRT_DT");

		if (CRT_DT != null) {
			setCRT_DT(CRT_DT);
		}

		String LST_UPD_USR = (String)attributes.get("LST_UPD_USR");

		if (LST_UPD_USR != null) {
			setLST_UPD_USR(LST_UPD_USR);
		}

		Date LST_UPD_DT = (Date)attributes.get("LST_UPD_DT");

		if (LST_UPD_DT != null) {
			setLST_UPD_DT(LST_UPD_DT);
		}

		String LOC_HDR_ID = (String)attributes.get("LOC_HDR_ID");

		if (LOC_HDR_ID != null) {
			setLOC_HDR_ID(LOC_HDR_ID);
		}

		String ACTIVE_YN = (String)attributes.get("ACTIVE_YN");

		if (ACTIVE_YN != null) {
			setACTIVE_YN(ACTIVE_YN);
		}

		String ITDA = (String)attributes.get("ITDA");

		if (ITDA != null) {
			setITDA(ITDA);
		}

		String ITDA_AREA = (String)attributes.get("ITDA_AREA");

		if (ITDA_AREA != null) {
			setITDA_AREA(ITDA_AREA);
		}

		String URBAN_RURAL = (String)attributes.get("URBAN_RURAL");

		if (URBAN_RURAL != null) {
			setURBAN_RURAL(URBAN_RURAL);
		}

		String PINCODE = (String)attributes.get("PINCODE");

		if (PINCODE != null) {
			setPINCODE(PINCODE);
		}

		String IS_CRDA_LOCATION = (String)attributes.get("IS_CRDA_LOCATION");

		if (IS_CRDA_LOCATION != null) {
			setIS_CRDA_LOCATION(IS_CRDA_LOCATION);
		}

		String EHS_LOCATION_ID = (String)attributes.get("EHS_LOCATION_ID");

		if (EHS_LOCATION_ID != null) {
			setEHS_LOCATION_ID(EHS_LOCATION_ID);
		}

		String RURAL_URBAN = (String)attributes.get("RURAL_URBAN");

		if (RURAL_URBAN != null) {
			setRURAL_URBAN(RURAL_URBAN);
		}

		String LOC_DESC_TEL = (String)attributes.get("LOC_DESC_TEL");

		if (LOC_DESC_TEL != null) {
			setLOC_DESC_TEL(LOC_DESC_TEL);
		}

		String LOC_STATE_VAL = (String)attributes.get("LOC_STATE_VAL");

		if (LOC_STATE_VAL != null) {
			setLOC_STATE_VAL(LOC_STATE_VAL);
		}
	}

	@Override
	public AsrimLocations cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the active_yn of this asrim locations.
	 *
	 * @return the active_yn of this asrim locations
	 */
	@Override
	public String getACTIVE_YN() {
		return model.getACTIVE_YN();
	}

	/**
	 * Returns the crt_dt of this asrim locations.
	 *
	 * @return the crt_dt of this asrim locations
	 */
	@Override
	public Date getCRT_DT() {
		return model.getCRT_DT();
	}

	/**
	 * Returns the crt_usr of this asrim locations.
	 *
	 * @return the crt_usr of this asrim locations
	 */
	@Override
	public String getCRT_USR() {
		return model.getCRT_USR();
	}

	/**
	 * Returns the ehs_location_id of this asrim locations.
	 *
	 * @return the ehs_location_id of this asrim locations
	 */
	@Override
	public String getEHS_LOCATION_ID() {
		return model.getEHS_LOCATION_ID();
	}

	/**
	 * Returns the is_crda_location of this asrim locations.
	 *
	 * @return the is_crda_location of this asrim locations
	 */
	@Override
	public String getIS_CRDA_LOCATION() {
		return model.getIS_CRDA_LOCATION();
	}

	/**
	 * Returns the itda of this asrim locations.
	 *
	 * @return the itda of this asrim locations
	 */
	@Override
	public String getITDA() {
		return model.getITDA();
	}

	/**
	 * Returns the itda_area of this asrim locations.
	 *
	 * @return the itda_area of this asrim locations
	 */
	@Override
	public String getITDA_AREA() {
		return model.getITDA_AREA();
	}

	/**
	 * Returns the lang_id of this asrim locations.
	 *
	 * @return the lang_id of this asrim locations
	 */
	@Override
	public String getLANG_ID() {
		return model.getLANG_ID();
	}

	/**
	 * Returns the loc_desc of this asrim locations.
	 *
	 * @return the loc_desc of this asrim locations
	 */
	@Override
	public String getLOC_DESC() {
		return model.getLOC_DESC();
	}

	/**
	 * Returns the loc_desc_tel of this asrim locations.
	 *
	 * @return the loc_desc_tel of this asrim locations
	 */
	@Override
	public String getLOC_DESC_TEL() {
		return model.getLOC_DESC_TEL();
	}

	/**
	 * Returns the loc_hdr_id of this asrim locations.
	 *
	 * @return the loc_hdr_id of this asrim locations
	 */
	@Override
	public String getLOC_HDR_ID() {
		return model.getLOC_HDR_ID();
	}

	/**
	 * Returns the loc_id of this asrim locations.
	 *
	 * @return the loc_id of this asrim locations
	 */
	@Override
	public String getLOC_ID() {
		return model.getLOC_ID();
	}

	/**
	 * Returns the loc_name of this asrim locations.
	 *
	 * @return the loc_name of this asrim locations
	 */
	@Override
	public String getLOC_NAME() {
		return model.getLOC_NAME();
	}

	/**
	 * Returns the loc_order of this asrim locations.
	 *
	 * @return the loc_order of this asrim locations
	 */
	@Override
	public String getLOC_ORDER() {
		return model.getLOC_ORDER();
	}

	/**
	 * Returns the loc_parnt_id of this asrim locations.
	 *
	 * @return the loc_parnt_id of this asrim locations
	 */
	@Override
	public String getLOC_PARNT_ID() {
		return model.getLOC_PARNT_ID();
	}

	/**
	 * Returns the loc_state_val of this asrim locations.
	 *
	 * @return the loc_state_val of this asrim locations
	 */
	@Override
	public String getLOC_STATE_VAL() {
		return model.getLOC_STATE_VAL();
	}

	/**
	 * Returns the loc_val of this asrim locations.
	 *
	 * @return the loc_val of this asrim locations
	 */
	@Override
	public String getLOC_VAL() {
		return model.getLOC_VAL();
	}

	/**
	 * Returns the lst_upd_dt of this asrim locations.
	 *
	 * @return the lst_upd_dt of this asrim locations
	 */
	@Override
	public Date getLST_UPD_DT() {
		return model.getLST_UPD_DT();
	}

	/**
	 * Returns the lst_upd_usr of this asrim locations.
	 *
	 * @return the lst_upd_usr of this asrim locations
	 */
	@Override
	public String getLST_UPD_USR() {
		return model.getLST_UPD_USR();
	}

	/**
	 * Returns the pincode of this asrim locations.
	 *
	 * @return the pincode of this asrim locations
	 */
	@Override
	public String getPINCODE() {
		return model.getPINCODE();
	}

	/**
	 * Returns the primary key of this asrim locations.
	 *
	 * @return the primary key of this asrim locations
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rural_urban of this asrim locations.
	 *
	 * @return the rural_urban of this asrim locations
	 */
	@Override
	public String getRURAL_URBAN() {
		return model.getRURAL_URBAN();
	}

	/**
	 * Returns the urban_rural of this asrim locations.
	 *
	 * @return the urban_rural of this asrim locations
	 */
	@Override
	public String getURBAN_RURAL() {
		return model.getURBAN_RURAL();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the active_yn of this asrim locations.
	 *
	 * @param ACTIVE_YN the active_yn of this asrim locations
	 */
	@Override
	public void setACTIVE_YN(String ACTIVE_YN) {
		model.setACTIVE_YN(ACTIVE_YN);
	}

	/**
	 * Sets the crt_dt of this asrim locations.
	 *
	 * @param CRT_DT the crt_dt of this asrim locations
	 */
	@Override
	public void setCRT_DT(Date CRT_DT) {
		model.setCRT_DT(CRT_DT);
	}

	/**
	 * Sets the crt_usr of this asrim locations.
	 *
	 * @param CRT_USR the crt_usr of this asrim locations
	 */
	@Override
	public void setCRT_USR(String CRT_USR) {
		model.setCRT_USR(CRT_USR);
	}

	/**
	 * Sets the ehs_location_id of this asrim locations.
	 *
	 * @param EHS_LOCATION_ID the ehs_location_id of this asrim locations
	 */
	@Override
	public void setEHS_LOCATION_ID(String EHS_LOCATION_ID) {
		model.setEHS_LOCATION_ID(EHS_LOCATION_ID);
	}

	/**
	 * Sets the is_crda_location of this asrim locations.
	 *
	 * @param IS_CRDA_LOCATION the is_crda_location of this asrim locations
	 */
	@Override
	public void setIS_CRDA_LOCATION(String IS_CRDA_LOCATION) {
		model.setIS_CRDA_LOCATION(IS_CRDA_LOCATION);
	}

	/**
	 * Sets the itda of this asrim locations.
	 *
	 * @param ITDA the itda of this asrim locations
	 */
	@Override
	public void setITDA(String ITDA) {
		model.setITDA(ITDA);
	}

	/**
	 * Sets the itda_area of this asrim locations.
	 *
	 * @param ITDA_AREA the itda_area of this asrim locations
	 */
	@Override
	public void setITDA_AREA(String ITDA_AREA) {
		model.setITDA_AREA(ITDA_AREA);
	}

	/**
	 * Sets the lang_id of this asrim locations.
	 *
	 * @param LANG_ID the lang_id of this asrim locations
	 */
	@Override
	public void setLANG_ID(String LANG_ID) {
		model.setLANG_ID(LANG_ID);
	}

	/**
	 * Sets the loc_desc of this asrim locations.
	 *
	 * @param LOC_DESC the loc_desc of this asrim locations
	 */
	@Override
	public void setLOC_DESC(String LOC_DESC) {
		model.setLOC_DESC(LOC_DESC);
	}

	/**
	 * Sets the loc_desc_tel of this asrim locations.
	 *
	 * @param LOC_DESC_TEL the loc_desc_tel of this asrim locations
	 */
	@Override
	public void setLOC_DESC_TEL(String LOC_DESC_TEL) {
		model.setLOC_DESC_TEL(LOC_DESC_TEL);
	}

	/**
	 * Sets the loc_hdr_id of this asrim locations.
	 *
	 * @param LOC_HDR_ID the loc_hdr_id of this asrim locations
	 */
	@Override
	public void setLOC_HDR_ID(String LOC_HDR_ID) {
		model.setLOC_HDR_ID(LOC_HDR_ID);
	}

	/**
	 * Sets the loc_id of this asrim locations.
	 *
	 * @param LOC_ID the loc_id of this asrim locations
	 */
	@Override
	public void setLOC_ID(String LOC_ID) {
		model.setLOC_ID(LOC_ID);
	}

	/**
	 * Sets the loc_name of this asrim locations.
	 *
	 * @param LOC_NAME the loc_name of this asrim locations
	 */
	@Override
	public void setLOC_NAME(String LOC_NAME) {
		model.setLOC_NAME(LOC_NAME);
	}

	/**
	 * Sets the loc_order of this asrim locations.
	 *
	 * @param LOC_ORDER the loc_order of this asrim locations
	 */
	@Override
	public void setLOC_ORDER(String LOC_ORDER) {
		model.setLOC_ORDER(LOC_ORDER);
	}

	/**
	 * Sets the loc_parnt_id of this asrim locations.
	 *
	 * @param LOC_PARNT_ID the loc_parnt_id of this asrim locations
	 */
	@Override
	public void setLOC_PARNT_ID(String LOC_PARNT_ID) {
		model.setLOC_PARNT_ID(LOC_PARNT_ID);
	}

	/**
	 * Sets the loc_state_val of this asrim locations.
	 *
	 * @param LOC_STATE_VAL the loc_state_val of this asrim locations
	 */
	@Override
	public void setLOC_STATE_VAL(String LOC_STATE_VAL) {
		model.setLOC_STATE_VAL(LOC_STATE_VAL);
	}

	/**
	 * Sets the loc_val of this asrim locations.
	 *
	 * @param LOC_VAL the loc_val of this asrim locations
	 */
	@Override
	public void setLOC_VAL(String LOC_VAL) {
		model.setLOC_VAL(LOC_VAL);
	}

	/**
	 * Sets the lst_upd_dt of this asrim locations.
	 *
	 * @param LST_UPD_DT the lst_upd_dt of this asrim locations
	 */
	@Override
	public void setLST_UPD_DT(Date LST_UPD_DT) {
		model.setLST_UPD_DT(LST_UPD_DT);
	}

	/**
	 * Sets the lst_upd_usr of this asrim locations.
	 *
	 * @param LST_UPD_USR the lst_upd_usr of this asrim locations
	 */
	@Override
	public void setLST_UPD_USR(String LST_UPD_USR) {
		model.setLST_UPD_USR(LST_UPD_USR);
	}

	/**
	 * Sets the pincode of this asrim locations.
	 *
	 * @param PINCODE the pincode of this asrim locations
	 */
	@Override
	public void setPINCODE(String PINCODE) {
		model.setPINCODE(PINCODE);
	}

	/**
	 * Sets the primary key of this asrim locations.
	 *
	 * @param primaryKey the primary key of this asrim locations
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rural_urban of this asrim locations.
	 *
	 * @param RURAL_URBAN the rural_urban of this asrim locations
	 */
	@Override
	public void setRURAL_URBAN(String RURAL_URBAN) {
		model.setRURAL_URBAN(RURAL_URBAN);
	}

	/**
	 * Sets the urban_rural of this asrim locations.
	 *
	 * @param URBAN_RURAL the urban_rural of this asrim locations
	 */
	@Override
	public void setURBAN_RURAL(String URBAN_RURAL) {
		model.setURBAN_RURAL(URBAN_RURAL);
	}

	@Override
	protected AsrimLocationsWrapper wrap(AsrimLocations asrimLocations) {
		return new AsrimLocationsWrapper(asrimLocations);
	}

}