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

import com.keyPeopleService.model.KeyPeople;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KeyPeople in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KeyPeopleCacheModel
	implements CacheModel<KeyPeople>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof KeyPeopleCacheModel)) {
			return false;
		}

		KeyPeopleCacheModel keyPeopleCacheModel = (KeyPeopleCacheModel)object;

		if (trust_userId == keyPeopleCacheModel.trust_userId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, trust_userId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{trust_userId=");
		sb.append(trust_userId);
		sb.append(", empname=");
		sb.append(empname);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", email=");
		sb.append(email);
		sb.append(", wingId=");
		sb.append(wingId);
		sb.append(", designationId=");
		sb.append(designationId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", empOrder=");
		sb.append(empOrder);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", modifyBy=");
		sb.append(modifyBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KeyPeople toEntityModel() {
		KeyPeopleImpl keyPeopleImpl = new KeyPeopleImpl();

		keyPeopleImpl.setTrust_userId(trust_userId);

		if (empname == null) {
			keyPeopleImpl.setEmpname("");
		}
		else {
			keyPeopleImpl.setEmpname(empname);
		}

		if (phone == null) {
			keyPeopleImpl.setPhone("");
		}
		else {
			keyPeopleImpl.setPhone(phone);
		}

		if (email == null) {
			keyPeopleImpl.setEmail("");
		}
		else {
			keyPeopleImpl.setEmail(email);
		}

		keyPeopleImpl.setWingId(wingId);
		keyPeopleImpl.setDesignationId(designationId);

		if (status == null) {
			keyPeopleImpl.setStatus("");
		}
		else {
			keyPeopleImpl.setStatus(status);
		}

		if (empOrder == null) {
			keyPeopleImpl.setEmpOrder("");
		}
		else {
			keyPeopleImpl.setEmpOrder(empOrder);
		}

		if (createDate == Long.MIN_VALUE) {
			keyPeopleImpl.setCreateDate(null);
		}
		else {
			keyPeopleImpl.setCreateDate(new Date(createDate));
		}

		if (createdBy == null) {
			keyPeopleImpl.setCreatedBy("");
		}
		else {
			keyPeopleImpl.setCreatedBy(createdBy);
		}

		if (modifyDate == Long.MIN_VALUE) {
			keyPeopleImpl.setModifyDate(null);
		}
		else {
			keyPeopleImpl.setModifyDate(new Date(modifyDate));
		}

		if (modifyBy == null) {
			keyPeopleImpl.setModifyBy("");
		}
		else {
			keyPeopleImpl.setModifyBy(modifyBy);
		}

		keyPeopleImpl.resetOriginalValues();

		return keyPeopleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		trust_userId = objectInput.readLong();
		empname = objectInput.readUTF();
		phone = objectInput.readUTF();
		email = objectInput.readUTF();

		wingId = objectInput.readLong();

		designationId = objectInput.readLong();
		status = objectInput.readUTF();
		empOrder = objectInput.readUTF();
		createDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		modifyBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(trust_userId);

		if (empname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empname);
		}

		if (phone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(wingId);

		objectOutput.writeLong(designationId);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (empOrder == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empOrder);
		}

		objectOutput.writeLong(createDate);

		if (createdBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(createdBy);
		}

		objectOutput.writeLong(modifyDate);

		if (modifyBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modifyBy);
		}
	}

	public long trust_userId;
	public String empname;
	public String phone;
	public String email;
	public long wingId;
	public long designationId;
	public String status;
	public String empOrder;
	public long createDate;
	public String createdBy;
	public long modifyDate;
	public String modifyBy;

}