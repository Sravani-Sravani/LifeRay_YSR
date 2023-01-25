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

package com.keyPeopleService.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KeyPeople}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KeyPeople
 * @generated
 */
public class KeyPeopleWrapper
	extends BaseModelWrapper<KeyPeople>
	implements KeyPeople, ModelWrapper<KeyPeople> {

	public KeyPeopleWrapper(KeyPeople keyPeople) {
		super(keyPeople);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("trust_userId", getTrust_userId());
		attributes.put("empname", getEmpname());
		attributes.put("phone", getPhone());
		attributes.put("email", getEmail());
		attributes.put("wingId", getWingId());
		attributes.put("designationId", getDesignationId());
		attributes.put("status", getStatus());
		attributes.put("empOrder", getEmpOrder());
		attributes.put("createDate", getCreateDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("modifyBy", getModifyBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long trust_userId = (Long)attributes.get("trust_userId");

		if (trust_userId != null) {
			setTrust_userId(trust_userId);
		}

		String empname = (String)attributes.get("empname");

		if (empname != null) {
			setEmpname(empname);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long wingId = (Long)attributes.get("wingId");

		if (wingId != null) {
			setWingId(wingId);
		}

		Long designationId = (Long)attributes.get("designationId");

		if (designationId != null) {
			setDesignationId(designationId);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String empOrder = (String)attributes.get("empOrder");

		if (empOrder != null) {
			setEmpOrder(empOrder);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		String modifyBy = (String)attributes.get("modifyBy");

		if (modifyBy != null) {
			setModifyBy(modifyBy);
		}
	}

	@Override
	public KeyPeople cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the create date of this key people.
	 *
	 * @return the create date of this key people
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the created by of this key people.
	 *
	 * @return the created by of this key people
	 */
	@Override
	public String getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the designation ID of this key people.
	 *
	 * @return the designation ID of this key people
	 */
	@Override
	public long getDesignationId() {
		return model.getDesignationId();
	}

	/**
	 * Returns the email of this key people.
	 *
	 * @return the email of this key people
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the empname of this key people.
	 *
	 * @return the empname of this key people
	 */
	@Override
	public String getEmpname() {
		return model.getEmpname();
	}

	/**
	 * Returns the emp order of this key people.
	 *
	 * @return the emp order of this key people
	 */
	@Override
	public String getEmpOrder() {
		return model.getEmpOrder();
	}

	/**
	 * Returns the modify by of this key people.
	 *
	 * @return the modify by of this key people
	 */
	@Override
	public String getModifyBy() {
		return model.getModifyBy();
	}

	/**
	 * Returns the modify date of this key people.
	 *
	 * @return the modify date of this key people
	 */
	@Override
	public Date getModifyDate() {
		return model.getModifyDate();
	}

	/**
	 * Returns the phone of this key people.
	 *
	 * @return the phone of this key people
	 */
	@Override
	public String getPhone() {
		return model.getPhone();
	}

	/**
	 * Returns the primary key of this key people.
	 *
	 * @return the primary key of this key people
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this key people.
	 *
	 * @return the status of this key people
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the trust_user ID of this key people.
	 *
	 * @return the trust_user ID of this key people
	 */
	@Override
	public long getTrust_userId() {
		return model.getTrust_userId();
	}

	/**
	 * Returns the wing ID of this key people.
	 *
	 * @return the wing ID of this key people
	 */
	@Override
	public long getWingId() {
		return model.getWingId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the create date of this key people.
	 *
	 * @param createDate the create date of this key people
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the created by of this key people.
	 *
	 * @param createdBy the created by of this key people
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the designation ID of this key people.
	 *
	 * @param designationId the designation ID of this key people
	 */
	@Override
	public void setDesignationId(long designationId) {
		model.setDesignationId(designationId);
	}

	/**
	 * Sets the email of this key people.
	 *
	 * @param email the email of this key people
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the empname of this key people.
	 *
	 * @param empname the empname of this key people
	 */
	@Override
	public void setEmpname(String empname) {
		model.setEmpname(empname);
	}

	/**
	 * Sets the emp order of this key people.
	 *
	 * @param empOrder the emp order of this key people
	 */
	@Override
	public void setEmpOrder(String empOrder) {
		model.setEmpOrder(empOrder);
	}

	/**
	 * Sets the modify by of this key people.
	 *
	 * @param modifyBy the modify by of this key people
	 */
	@Override
	public void setModifyBy(String modifyBy) {
		model.setModifyBy(modifyBy);
	}

	/**
	 * Sets the modify date of this key people.
	 *
	 * @param modifyDate the modify date of this key people
	 */
	@Override
	public void setModifyDate(Date modifyDate) {
		model.setModifyDate(modifyDate);
	}

	/**
	 * Sets the phone of this key people.
	 *
	 * @param phone the phone of this key people
	 */
	@Override
	public void setPhone(String phone) {
		model.setPhone(phone);
	}

	/**
	 * Sets the primary key of this key people.
	 *
	 * @param primaryKey the primary key of this key people
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this key people.
	 *
	 * @param status the status of this key people
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the trust_user ID of this key people.
	 *
	 * @param trust_userId the trust_user ID of this key people
	 */
	@Override
	public void setTrust_userId(long trust_userId) {
		model.setTrust_userId(trust_userId);
	}

	/**
	 * Sets the wing ID of this key people.
	 *
	 * @param wingId the wing ID of this key people
	 */
	@Override
	public void setWingId(long wingId) {
		model.setWingId(wingId);
	}

	@Override
	protected KeyPeopleWrapper wrap(KeyPeople keyPeople) {
		return new KeyPeopleWrapper(keyPeople);
	}

}