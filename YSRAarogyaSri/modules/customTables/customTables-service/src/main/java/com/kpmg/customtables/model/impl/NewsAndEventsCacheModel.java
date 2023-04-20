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

package com.kpmg.customtables.model.impl;

import com.kpmg.customtables.model.NewsAndEvents;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NewsAndEvents in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewsAndEventsCacheModel
	implements CacheModel<NewsAndEvents>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NewsAndEventsCacheModel)) {
			return false;
		}

		NewsAndEventsCacheModel newsAndEventsCacheModel =
			(NewsAndEventsCacheModel)object;

		if (newsId == newsAndEventsCacheModel.newsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, newsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", newsId=");
		sb.append(newsId);
		sb.append(", newsdescription=");
		sb.append(newsdescription);
		sb.append(", ti_newsdescription=");
		sb.append(ti_newsdescription);
		sb.append(", newsDate=");
		sb.append(newsDate);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NewsAndEvents toEntityModel() {
		NewsAndEventsImpl newsAndEventsImpl = new NewsAndEventsImpl();

		if (uuid == null) {
			newsAndEventsImpl.setUuid("");
		}
		else {
			newsAndEventsImpl.setUuid(uuid);
		}

		newsAndEventsImpl.setNewsId(newsId);

		if (newsdescription == null) {
			newsAndEventsImpl.setNewsdescription("");
		}
		else {
			newsAndEventsImpl.setNewsdescription(newsdescription);
		}

		if (ti_newsdescription == null) {
			newsAndEventsImpl.setTi_newsdescription("");
		}
		else {
			newsAndEventsImpl.setTi_newsdescription(ti_newsdescription);
		}

		if (newsDate == Long.MIN_VALUE) {
			newsAndEventsImpl.setNewsDate(null);
		}
		else {
			newsAndEventsImpl.setNewsDate(new Date(newsDate));
		}

		newsAndEventsImpl.setFileEntryId(fileEntryId);

		if (status == null) {
			newsAndEventsImpl.setStatus("");
		}
		else {
			newsAndEventsImpl.setStatus(status);
		}

		if (createdDate == Long.MIN_VALUE) {
			newsAndEventsImpl.setCreatedDate(null);
		}
		else {
			newsAndEventsImpl.setCreatedDate(new Date(createdDate));
		}

		newsAndEventsImpl.setCreatedBy(createdBy);

		if (modifiedDate == Long.MIN_VALUE) {
			newsAndEventsImpl.setModifiedDate(null);
		}
		else {
			newsAndEventsImpl.setModifiedDate(new Date(modifiedDate));
		}

		newsAndEventsImpl.setModifiedBy(modifiedBy);

		newsAndEventsImpl.resetOriginalValues();

		return newsAndEventsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		newsId = objectInput.readLong();
		newsdescription = objectInput.readUTF();
		ti_newsdescription = objectInput.readUTF();
		newsDate = objectInput.readLong();

		fileEntryId = objectInput.readLong();
		status = objectInput.readUTF();
		createdDate = objectInput.readLong();

		createdBy = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(newsId);

		if (newsdescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newsdescription);
		}

		if (ti_newsdescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ti_newsdescription);
		}

		objectOutput.writeLong(newsDate);

		objectOutput.writeLong(fileEntryId);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(modifiedBy);
	}

	public String uuid;
	public long newsId;
	public String newsdescription;
	public String ti_newsdescription;
	public long newsDate;
	public long fileEntryId;
	public String status;
	public long createdDate;
	public long createdBy;
	public long modifiedDate;
	public long modifiedBy;

}