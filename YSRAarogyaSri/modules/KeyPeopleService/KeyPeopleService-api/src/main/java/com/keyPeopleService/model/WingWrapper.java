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
 * This class is a wrapper for {@link Wing}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Wing
 * @generated
 */
public class WingWrapper
	extends BaseModelWrapper<Wing> implements ModelWrapper<Wing>, Wing {

	public WingWrapper(Wing wing) {
		super(wing);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wid", getWid());
		attributes.put("wname", getWname());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wid = (Long)attributes.get("wid");

		if (wid != null) {
			setWid(wid);
		}

		String wname = (String)attributes.get("wname");

		if (wname != null) {
			setWname(wname);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public Wing cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the primary key of this wing.
	 *
	 * @return the primary key of this wing
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this wing.
	 *
	 * @return the status of this wing
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the wid of this wing.
	 *
	 * @return the wid of this wing
	 */
	@Override
	public long getWid() {
		return model.getWid();
	}

	/**
	 * Returns the wname of this wing.
	 *
	 * @return the wname of this wing
	 */
	@Override
	public String getWname() {
		return model.getWname();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the primary key of this wing.
	 *
	 * @param primaryKey the primary key of this wing
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this wing.
	 *
	 * @param status the status of this wing
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the wid of this wing.
	 *
	 * @param wid the wid of this wing
	 */
	@Override
	public void setWid(long wid) {
		model.setWid(wid);
	}

	/**
	 * Sets the wname of this wing.
	 *
	 * @param wname the wname of this wing
	 */
	@Override
	public void setWname(String wname) {
		model.setWname(wname);
	}

	@Override
	protected WingWrapper wrap(Wing wing) {
		return new WingWrapper(wing);
	}

}