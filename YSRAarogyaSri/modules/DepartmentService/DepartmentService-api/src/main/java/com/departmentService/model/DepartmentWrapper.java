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

package com.departmentService.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Department}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department
 * @generated
 */
public class DepartmentWrapper
	extends BaseModelWrapper<Department>
	implements Department, ModelWrapper<Department> {

	public DepartmentWrapper(Department department) {
		super(department);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("did", getDid());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("department", getDepartment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long did = (Long)attributes.get("did");

		if (did != null) {
			setDid(did);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer department = (Integer)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}
	}

	@Override
	public Department cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the department of this department.
	 *
	 * @return the department of this department
	 */
	@Override
	public int getDepartment() {
		return model.getDepartment();
	}

	/**
	 * Returns the description of this department.
	 *
	 * @return the description of this department
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the did of this department.
	 *
	 * @return the did of this department
	 */
	@Override
	public long getDid() {
		return model.getDid();
	}

	/**
	 * Returns the primary key of this department.
	 *
	 * @return the primary key of this department
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this department.
	 *
	 * @return the title of this department
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the department of this department.
	 *
	 * @param department the department of this department
	 */
	@Override
	public void setDepartment(int department) {
		model.setDepartment(department);
	}

	/**
	 * Sets the description of this department.
	 *
	 * @param description the description of this department
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the did of this department.
	 *
	 * @param did the did of this department
	 */
	@Override
	public void setDid(long did) {
		model.setDid(did);
	}

	/**
	 * Sets the primary key of this department.
	 *
	 * @param primaryKey the primary key of this department
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this department.
	 *
	 * @param title the title of this department
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	@Override
	protected DepartmentWrapper wrap(Department department) {
		return new DepartmentWrapper(department);
	}

}