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

package com.departmentService.model.impl;

import com.departmentService.model.Department;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Department in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DepartmentCacheModel
	implements CacheModel<Department>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DepartmentCacheModel)) {
			return false;
		}

		DepartmentCacheModel departmentCacheModel =
			(DepartmentCacheModel)object;

		if (did == departmentCacheModel.did) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{did=");
		sb.append(did);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", department=");
		sb.append(department);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Department toEntityModel() {
		DepartmentImpl departmentImpl = new DepartmentImpl();

		departmentImpl.setDid(did);

		if (title == null) {
			departmentImpl.setTitle("");
		}
		else {
			departmentImpl.setTitle(title);
		}

		if (description == null) {
			departmentImpl.setDescription("");
		}
		else {
			departmentImpl.setDescription(description);
		}

		departmentImpl.setDepartment(department);

		departmentImpl.resetOriginalValues();

		return departmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		did = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();

		department = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(did);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeInt(department);
	}

	public long did;
	public String title;
	public String description;
	public int department;

}