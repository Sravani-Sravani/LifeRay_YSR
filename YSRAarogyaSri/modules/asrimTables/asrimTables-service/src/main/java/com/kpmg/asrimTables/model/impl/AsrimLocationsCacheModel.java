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

import com.kpmg.asrimTables.model.AsrimLocations;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AsrimLocations in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AsrimLocationsCacheModel
	implements CacheModel<AsrimLocations>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AsrimLocationsCacheModel)) {
			return false;
		}

		AsrimLocationsCacheModel asrimLocationsCacheModel =
			(AsrimLocationsCacheModel)object;

		if (LOC_ID.equals(asrimLocationsCacheModel.LOC_ID)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, LOC_ID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{LOC_ID=");
		sb.append(LOC_ID);
		sb.append(", LOC_NAME=");
		sb.append(LOC_NAME);
		sb.append(", LOC_PARNT_ID=");
		sb.append(LOC_PARNT_ID);
		sb.append(", LOC_ORDER=");
		sb.append(LOC_ORDER);
		sb.append(", LOC_DESC=");
		sb.append(LOC_DESC);
		sb.append(", LOC_VAL=");
		sb.append(LOC_VAL);
		sb.append(", LANG_ID=");
		sb.append(LANG_ID);
		sb.append(", CRT_USR=");
		sb.append(CRT_USR);
		sb.append(", CRT_DT=");
		sb.append(CRT_DT);
		sb.append(", LST_UPD_USR=");
		sb.append(LST_UPD_USR);
		sb.append(", LST_UPD_DT=");
		sb.append(LST_UPD_DT);
		sb.append(", LOC_HDR_ID=");
		sb.append(LOC_HDR_ID);
		sb.append(", ACTIVE_YN=");
		sb.append(ACTIVE_YN);
		sb.append(", ITDA=");
		sb.append(ITDA);
		sb.append(", ITDA_AREA=");
		sb.append(ITDA_AREA);
		sb.append(", URBAN_RURAL=");
		sb.append(URBAN_RURAL);
		sb.append(", PINCODE=");
		sb.append(PINCODE);
		sb.append(", IS_CRDA_LOCATION=");
		sb.append(IS_CRDA_LOCATION);
		sb.append(", EHS_LOCATION_ID=");
		sb.append(EHS_LOCATION_ID);
		sb.append(", RURAL_URBAN=");
		sb.append(RURAL_URBAN);
		sb.append(", LOC_DESC_TEL=");
		sb.append(LOC_DESC_TEL);
		sb.append(", LOC_STATE_VAL=");
		sb.append(LOC_STATE_VAL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AsrimLocations toEntityModel() {
		AsrimLocationsImpl asrimLocationsImpl = new AsrimLocationsImpl();

		if (LOC_ID == null) {
			asrimLocationsImpl.setLOC_ID("");
		}
		else {
			asrimLocationsImpl.setLOC_ID(LOC_ID);
		}

		if (LOC_NAME == null) {
			asrimLocationsImpl.setLOC_NAME("");
		}
		else {
			asrimLocationsImpl.setLOC_NAME(LOC_NAME);
		}

		if (LOC_PARNT_ID == null) {
			asrimLocationsImpl.setLOC_PARNT_ID("");
		}
		else {
			asrimLocationsImpl.setLOC_PARNT_ID(LOC_PARNT_ID);
		}

		if (LOC_ORDER == null) {
			asrimLocationsImpl.setLOC_ORDER("");
		}
		else {
			asrimLocationsImpl.setLOC_ORDER(LOC_ORDER);
		}

		if (LOC_DESC == null) {
			asrimLocationsImpl.setLOC_DESC("");
		}
		else {
			asrimLocationsImpl.setLOC_DESC(LOC_DESC);
		}

		if (LOC_VAL == null) {
			asrimLocationsImpl.setLOC_VAL("");
		}
		else {
			asrimLocationsImpl.setLOC_VAL(LOC_VAL);
		}

		if (LANG_ID == null) {
			asrimLocationsImpl.setLANG_ID("");
		}
		else {
			asrimLocationsImpl.setLANG_ID(LANG_ID);
		}

		if (CRT_USR == null) {
			asrimLocationsImpl.setCRT_USR("");
		}
		else {
			asrimLocationsImpl.setCRT_USR(CRT_USR);
		}

		if (CRT_DT == Long.MIN_VALUE) {
			asrimLocationsImpl.setCRT_DT(null);
		}
		else {
			asrimLocationsImpl.setCRT_DT(new Date(CRT_DT));
		}

		if (LST_UPD_USR == null) {
			asrimLocationsImpl.setLST_UPD_USR("");
		}
		else {
			asrimLocationsImpl.setLST_UPD_USR(LST_UPD_USR);
		}

		if (LST_UPD_DT == Long.MIN_VALUE) {
			asrimLocationsImpl.setLST_UPD_DT(null);
		}
		else {
			asrimLocationsImpl.setLST_UPD_DT(new Date(LST_UPD_DT));
		}

		if (LOC_HDR_ID == null) {
			asrimLocationsImpl.setLOC_HDR_ID("");
		}
		else {
			asrimLocationsImpl.setLOC_HDR_ID(LOC_HDR_ID);
		}

		if (ACTIVE_YN == null) {
			asrimLocationsImpl.setACTIVE_YN("");
		}
		else {
			asrimLocationsImpl.setACTIVE_YN(ACTIVE_YN);
		}

		if (ITDA == null) {
			asrimLocationsImpl.setITDA("");
		}
		else {
			asrimLocationsImpl.setITDA(ITDA);
		}

		if (ITDA_AREA == null) {
			asrimLocationsImpl.setITDA_AREA("");
		}
		else {
			asrimLocationsImpl.setITDA_AREA(ITDA_AREA);
		}

		if (URBAN_RURAL == null) {
			asrimLocationsImpl.setURBAN_RURAL("");
		}
		else {
			asrimLocationsImpl.setURBAN_RURAL(URBAN_RURAL);
		}

		if (PINCODE == null) {
			asrimLocationsImpl.setPINCODE("");
		}
		else {
			asrimLocationsImpl.setPINCODE(PINCODE);
		}

		if (IS_CRDA_LOCATION == null) {
			asrimLocationsImpl.setIS_CRDA_LOCATION("");
		}
		else {
			asrimLocationsImpl.setIS_CRDA_LOCATION(IS_CRDA_LOCATION);
		}

		if (EHS_LOCATION_ID == null) {
			asrimLocationsImpl.setEHS_LOCATION_ID("");
		}
		else {
			asrimLocationsImpl.setEHS_LOCATION_ID(EHS_LOCATION_ID);
		}

		if (RURAL_URBAN == null) {
			asrimLocationsImpl.setRURAL_URBAN("");
		}
		else {
			asrimLocationsImpl.setRURAL_URBAN(RURAL_URBAN);
		}

		if (LOC_DESC_TEL == null) {
			asrimLocationsImpl.setLOC_DESC_TEL("");
		}
		else {
			asrimLocationsImpl.setLOC_DESC_TEL(LOC_DESC_TEL);
		}

		if (LOC_STATE_VAL == null) {
			asrimLocationsImpl.setLOC_STATE_VAL("");
		}
		else {
			asrimLocationsImpl.setLOC_STATE_VAL(LOC_STATE_VAL);
		}

		asrimLocationsImpl.resetOriginalValues();

		return asrimLocationsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		LOC_ID = objectInput.readUTF();
		LOC_NAME = objectInput.readUTF();
		LOC_PARNT_ID = objectInput.readUTF();
		LOC_ORDER = objectInput.readUTF();
		LOC_DESC = objectInput.readUTF();
		LOC_VAL = objectInput.readUTF();
		LANG_ID = objectInput.readUTF();
		CRT_USR = objectInput.readUTF();
		CRT_DT = objectInput.readLong();
		LST_UPD_USR = objectInput.readUTF();
		LST_UPD_DT = objectInput.readLong();
		LOC_HDR_ID = objectInput.readUTF();
		ACTIVE_YN = objectInput.readUTF();
		ITDA = objectInput.readUTF();
		ITDA_AREA = objectInput.readUTF();
		URBAN_RURAL = objectInput.readUTF();
		PINCODE = objectInput.readUTF();
		IS_CRDA_LOCATION = objectInput.readUTF();
		EHS_LOCATION_ID = objectInput.readUTF();
		RURAL_URBAN = objectInput.readUTF();
		LOC_DESC_TEL = objectInput.readUTF();
		LOC_STATE_VAL = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (LOC_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LOC_ID);
		}

		if (LOC_NAME == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LOC_NAME);
		}

		if (LOC_PARNT_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LOC_PARNT_ID);
		}

		if (LOC_ORDER == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LOC_ORDER);
		}

		if (LOC_DESC == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LOC_DESC);
		}

		if (LOC_VAL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LOC_VAL);
		}

		if (LANG_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LANG_ID);
		}

		if (CRT_USR == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CRT_USR);
		}

		objectOutput.writeLong(CRT_DT);

		if (LST_UPD_USR == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LST_UPD_USR);
		}

		objectOutput.writeLong(LST_UPD_DT);

		if (LOC_HDR_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LOC_HDR_ID);
		}

		if (ACTIVE_YN == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ACTIVE_YN);
		}

		if (ITDA == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ITDA);
		}

		if (ITDA_AREA == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ITDA_AREA);
		}

		if (URBAN_RURAL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(URBAN_RURAL);
		}

		if (PINCODE == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(PINCODE);
		}

		if (IS_CRDA_LOCATION == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(IS_CRDA_LOCATION);
		}

		if (EHS_LOCATION_ID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(EHS_LOCATION_ID);
		}

		if (RURAL_URBAN == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(RURAL_URBAN);
		}

		if (LOC_DESC_TEL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LOC_DESC_TEL);
		}

		if (LOC_STATE_VAL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LOC_STATE_VAL);
		}
	}

	public String LOC_ID;

	public String LOC_NAME;

	public String LOC_PARNT_ID;

	public String LOC_ORDER;

	public String LOC_DESC;

	public String LOC_VAL;

	public String LANG_ID;

	public String CRT_USR;

	public long CRT_DT;

	public String LST_UPD_USR;

	public long LST_UPD_DT;

	public String LOC_HDR_ID;

	public String ACTIVE_YN;

	public String ITDA;

	public String ITDA_AREA;

	public String URBAN_RURAL;

	public String PINCODE;

	public String IS_CRDA_LOCATION;

	public String EHS_LOCATION_ID;

	public String RURAL_URBAN;

	public String LOC_DESC_TEL;

	public String LOC_STATE_VAL;

}