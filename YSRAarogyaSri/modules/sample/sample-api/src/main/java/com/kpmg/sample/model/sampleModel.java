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

package com.kpmg.sample.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the sample service. Represents a row in the &quot;anaja_sample&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.kpmg.sample.model.impl.sampleModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.kpmg.sample.model.impl.sampleImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sample
 * @generated
 */
@ProviderType
public interface sampleModel extends BaseModel<sample> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sample model instance should use the {@link sample} interface instead.
	 */

	/**
	 * Returns the primary key of this sample.
	 *
	 * @return the primary key of this sample
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sample.
	 *
	 * @param primaryKey the primary key of this sample
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this sample.
	 *
	 * @return the ID of this sample
	 */
	public long getId();

	/**
	 * Sets the ID of this sample.
	 *
	 * @param id the ID of this sample
	 */
	public void setId(long id);

	/**
	 * Returns the title of this sample.
	 *
	 * @return the title of this sample
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this sample.
	 *
	 * @param title the title of this sample
	 */
	public void setTitle(String title);

	@Override
	public sample cloneWithOriginalValues();

}