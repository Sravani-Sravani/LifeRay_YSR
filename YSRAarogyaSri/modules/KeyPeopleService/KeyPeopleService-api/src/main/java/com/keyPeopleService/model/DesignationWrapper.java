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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Designation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Designation
 * @generated
 */
public class DesignationWrapper
	extends BaseModelWrapper<Designation>
	implements Designation, ModelWrapper<Designation> {

	public DesignationWrapper(Designation designation) {
		super(designation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("did", getDid());
		attributes.put("wid", getWid());
		attributes.put("dname", getDname());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long did = (Long)attributes.get("did");

		if (did != null) {
			setDid(did);
		}

		Long wid = (Long)attributes.get("wid");

		if (wid != null) {
			setWid(wid);
		}

		String dname = (String)attributes.get("dname");

		if (dname != null) {
			setDname(dname);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public Designation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the did of this designation.
	 *
	 * @return the did of this designation
	 */
	@Override
	public long getDid() {
		return model.getDid();
	}

	/**
	 * Returns the dname of this designation.
	 *
	 * @return the dname of this designation
	 */
	@Override
	public String getDname() {
		return model.getDname();
	}

	/**
	 * Returns the primary key of this designation.
	 *
	 * @return the primary key of this designation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this designation.
	 *
	 * @return the status of this designation
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the wid of this designation.
	 *
	 * @return the wid of this designation
	 */
	@Override
	public long getWid() {
		return model.getWid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the did of this designation.
	 *
	 * @param did the did of this designation
	 */
	@Override
	public void setDid(long did) {
		model.setDid(did);
	}

	/**
	 * Sets the dname of this designation.
	 *
	 * @param dname the dname of this designation
	 */
	@Override
	public void setDname(String dname) {
		model.setDname(dname);
	}

	/**
	 * Sets the primary key of this designation.
	 *
	 * @param primaryKey the primary key of this designation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this designation.
	 *
	 * @param status the status of this designation
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the wid of this designation.
	 *
	 * @param wid the wid of this designation
	 */
	@Override
	public void setWid(long wid) {
		model.setWid(wid);
	}

	@Override
	protected DesignationWrapper wrap(Designation designation) {
		return new DesignationWrapper(designation);
	}

}