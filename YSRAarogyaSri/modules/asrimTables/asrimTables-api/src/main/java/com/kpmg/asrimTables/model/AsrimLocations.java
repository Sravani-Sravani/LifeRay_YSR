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

package com.kpmg.asrimTables.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AsrimLocations service. Represents a row in the &quot;asrim_locations&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AsrimLocationsModel
 * @generated
 */
@ImplementationClassName("com.kpmg.asrimTables.model.impl.AsrimLocationsImpl")
@ProviderType
public interface AsrimLocations extends AsrimLocationsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.kpmg.asrimTables.model.impl.AsrimLocationsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AsrimLocations, String> LOC_ID_ACCESSOR =
		new Accessor<AsrimLocations, String>() {

			@Override
			public String get(AsrimLocations asrimLocations) {
				return asrimLocations.getLOC_ID();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<AsrimLocations> getTypeClass() {
				return AsrimLocations.class;
			}

		};

}