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

import com.keyPeopleService.model.Wing;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Wing in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WingCacheModel implements CacheModel<Wing>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WingCacheModel)) {
			return false;
		}

		WingCacheModel wingCacheModel = (WingCacheModel)object;

		if (wid == wingCacheModel.wid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{wid=");
		sb.append(wid);
		sb.append(", wname=");
		sb.append(wname);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Wing toEntityModel() {
		WingImpl wingImpl = new WingImpl();

		wingImpl.setWid(wid);

		if (wname == null) {
			wingImpl.setWname("");
		}
		else {
			wingImpl.setWname(wname);
		}

		if (status == null) {
			wingImpl.setStatus("");
		}
		else {
			wingImpl.setStatus(status);
		}

		wingImpl.resetOriginalValues();

		return wingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wid = objectInput.readLong();
		wname = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(wid);

		if (wname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(wname);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long wid;
	public String wname;
	public String status;

}