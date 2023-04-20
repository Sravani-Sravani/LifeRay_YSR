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
package com.kpmg.customtables.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchNewsAndEventsException extends NoSuchModelException {

	public NoSuchNewsAndEventsException() {
	}

	public NoSuchNewsAndEventsException(String msg) {
		super(msg);
	}

	public NoSuchNewsAndEventsException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchNewsAndEventsException(Throwable throwable) {
		super(throwable);
	}

}