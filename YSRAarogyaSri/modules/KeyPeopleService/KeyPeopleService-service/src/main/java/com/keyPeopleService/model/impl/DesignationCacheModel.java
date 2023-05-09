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

package com.keyPeopleService.model.impl;

import com.keyPeopleService.model.Designation;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Designation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DesignationCacheModel
	implements CacheModel<Designation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DesignationCacheModel)) {
			return false;
		}

		DesignationCacheModel designationCacheModel =
			(DesignationCacheModel)object;

		if (did == designationCacheModel.did) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, did);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{did=");
		sb.append(did);
		sb.append(", wid=");
		sb.append(wid);
		sb.append(", dname=");
		sb.append(dname);
		sb.append(", status=");
		sb.append(status);
		sb.append(", dorder=");
		sb.append(dorder);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Designation toEntityModel() {
		DesignationImpl designationImpl = new DesignationImpl();

		designationImpl.setDid(did);
		designationImpl.setWid(wid);

		if (dname == null) {
			designationImpl.setDname("");
		}
		else {
			designationImpl.setDname(dname);
		}

		if (status == null) {
			designationImpl.setStatus("");
		}
		else {
			designationImpl.setStatus(status);
		}

		designationImpl.setDorder(dorder);

		designationImpl.resetOriginalValues();

		return designationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		did = objectInput.readLong();

		wid = objectInput.readLong();
		dname = objectInput.readUTF();
		status = objectInput.readUTF();

		dorder = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(did);

		objectOutput.writeLong(wid);

		if (dname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dname);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeInt(dorder);
	}

	public long did;
	public long wid;
	public String dname;
	public String status;
	public int dorder;

}