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

package com.kpmg.customtables.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewsAndEventsService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndEventsService
 * @generated
 */
public class NewsAndEventsServiceWrapper
	implements NewsAndEventsService, ServiceWrapper<NewsAndEventsService> {

	public NewsAndEventsServiceWrapper() {
		this(null);
	}

	public NewsAndEventsServiceWrapper(
		NewsAndEventsService newsAndEventsService) {

		_newsAndEventsService = newsAndEventsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newsAndEventsService.getOSGiServiceIdentifier();
	}

	@Override
	public NewsAndEventsService getWrappedService() {
		return _newsAndEventsService;
	}

	@Override
	public void setWrappedService(NewsAndEventsService newsAndEventsService) {
		_newsAndEventsService = newsAndEventsService;
	}

	private NewsAndEventsService _newsAndEventsService;

}