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

package com.kpmg.customtables.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NewsAndEvents}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndEvents
 * @generated
 */
public class NewsAndEventsWrapper
	extends BaseModelWrapper<NewsAndEvents>
	implements ModelWrapper<NewsAndEvents>, NewsAndEvents {

	public NewsAndEventsWrapper(NewsAndEvents newsAndEvents) {
		super(newsAndEvents);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("newsId", getNewsId());
		attributes.put("newsdescription", getNewsdescription());
		attributes.put("ti_newsdescription", getTi_newsdescription());
		attributes.put("newsDate", getNewsDate());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("home", getHome());
		attributes.put("spotlight", getSpotlight());
		attributes.put("asri", getAsri());
		attributes.put("ehs", getEhs());
		attributes.put("aarogyaraksha", getAarogyaraksha());
		attributes.put("wjhs", getWjhs());
		attributes.put("status", getStatus());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long newsId = (Long)attributes.get("newsId");

		if (newsId != null) {
			setNewsId(newsId);
		}

		String newsdescription = (String)attributes.get("newsdescription");

		if (newsdescription != null) {
			setNewsdescription(newsdescription);
		}

		String ti_newsdescription = (String)attributes.get(
			"ti_newsdescription");

		if (ti_newsdescription != null) {
			setTi_newsdescription(ti_newsdescription);
		}

		Date newsDate = (Date)attributes.get("newsDate");

		if (newsDate != null) {
			setNewsDate(newsDate);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Integer home = (Integer)attributes.get("home");

		if (home != null) {
			setHome(home);
		}

		Integer spotlight = (Integer)attributes.get("spotlight");

		if (spotlight != null) {
			setSpotlight(spotlight);
		}

		Integer asri = (Integer)attributes.get("asri");

		if (asri != null) {
			setAsri(asri);
		}

		Integer ehs = (Integer)attributes.get("ehs");

		if (ehs != null) {
			setEhs(ehs);
		}

		Integer aarogyaraksha = (Integer)attributes.get("aarogyaraksha");

		if (aarogyaraksha != null) {
			setAarogyaraksha(aarogyaraksha);
		}

		Integer wjhs = (Integer)attributes.get("wjhs");

		if (wjhs != null) {
			setWjhs(wjhs);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	@Override
	public NewsAndEvents cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the aarogyaraksha of this news and events.
	 *
	 * @return the aarogyaraksha of this news and events
	 */
	@Override
	public int getAarogyaraksha() {
		return model.getAarogyaraksha();
	}

	/**
	 * Returns the asri of this news and events.
	 *
	 * @return the asri of this news and events
	 */
	@Override
	public int getAsri() {
		return model.getAsri();
	}

	/**
	 * Returns the created by of this news and events.
	 *
	 * @return the created by of this news and events
	 */
	@Override
	public long getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the created date of this news and events.
	 *
	 * @return the created date of this news and events
	 */
	@Override
	public Date getCreatedDate() {
		return model.getCreatedDate();
	}

	/**
	 * Returns the ehs of this news and events.
	 *
	 * @return the ehs of this news and events
	 */
	@Override
	public int getEhs() {
		return model.getEhs();
	}

	/**
	 * Returns the file entry ID of this news and events.
	 *
	 * @return the file entry ID of this news and events
	 */
	@Override
	public long getFileEntryId() {
		return model.getFileEntryId();
	}

	/**
	 * Returns the home of this news and events.
	 *
	 * @return the home of this news and events
	 */
	@Override
	public int getHome() {
		return model.getHome();
	}

	/**
	 * Returns the modified by of this news and events.
	 *
	 * @return the modified by of this news and events
	 */
	@Override
	public long getModifiedBy() {
		return model.getModifiedBy();
	}

	/**
	 * Returns the modified date of this news and events.
	 *
	 * @return the modified date of this news and events
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the news date of this news and events.
	 *
	 * @return the news date of this news and events
	 */
	@Override
	public Date getNewsDate() {
		return model.getNewsDate();
	}

	/**
	 * Returns the newsdescription of this news and events.
	 *
	 * @return the newsdescription of this news and events
	 */
	@Override
	public String getNewsdescription() {
		return model.getNewsdescription();
	}

	/**
	 * Returns the news ID of this news and events.
	 *
	 * @return the news ID of this news and events
	 */
	@Override
	public long getNewsId() {
		return model.getNewsId();
	}

	/**
	 * Returns the primary key of this news and events.
	 *
	 * @return the primary key of this news and events
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the spotlight of this news and events.
	 *
	 * @return the spotlight of this news and events
	 */
	@Override
	public int getSpotlight() {
		return model.getSpotlight();
	}

	/**
	 * Returns the status of this news and events.
	 *
	 * @return the status of this news and events
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the ti_newsdescription of this news and events.
	 *
	 * @return the ti_newsdescription of this news and events
	 */
	@Override
	public String getTi_newsdescription() {
		return model.getTi_newsdescription();
	}

	/**
	 * Returns the uuid of this news and events.
	 *
	 * @return the uuid of this news and events
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the wjhs of this news and events.
	 *
	 * @return the wjhs of this news and events
	 */
	@Override
	public int getWjhs() {
		return model.getWjhs();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the aarogyaraksha of this news and events.
	 *
	 * @param aarogyaraksha the aarogyaraksha of this news and events
	 */
	@Override
	public void setAarogyaraksha(int aarogyaraksha) {
		model.setAarogyaraksha(aarogyaraksha);
	}

	/**
	 * Sets the asri of this news and events.
	 *
	 * @param asri the asri of this news and events
	 */
	@Override
	public void setAsri(int asri) {
		model.setAsri(asri);
	}

	/**
	 * Sets the created by of this news and events.
	 *
	 * @param createdBy the created by of this news and events
	 */
	@Override
	public void setCreatedBy(long createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the created date of this news and events.
	 *
	 * @param createdDate the created date of this news and events
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		model.setCreatedDate(createdDate);
	}

	/**
	 * Sets the ehs of this news and events.
	 *
	 * @param ehs the ehs of this news and events
	 */
	@Override
	public void setEhs(int ehs) {
		model.setEhs(ehs);
	}

	/**
	 * Sets the file entry ID of this news and events.
	 *
	 * @param fileEntryId the file entry ID of this news and events
	 */
	@Override
	public void setFileEntryId(long fileEntryId) {
		model.setFileEntryId(fileEntryId);
	}

	/**
	 * Sets the home of this news and events.
	 *
	 * @param home the home of this news and events
	 */
	@Override
	public void setHome(int home) {
		model.setHome(home);
	}

	/**
	 * Sets the modified by of this news and events.
	 *
	 * @param modifiedBy the modified by of this news and events
	 */
	@Override
	public void setModifiedBy(long modifiedBy) {
		model.setModifiedBy(modifiedBy);
	}

	/**
	 * Sets the modified date of this news and events.
	 *
	 * @param modifiedDate the modified date of this news and events
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the news date of this news and events.
	 *
	 * @param newsDate the news date of this news and events
	 */
	@Override
	public void setNewsDate(Date newsDate) {
		model.setNewsDate(newsDate);
	}

	/**
	 * Sets the newsdescription of this news and events.
	 *
	 * @param newsdescription the newsdescription of this news and events
	 */
	@Override
	public void setNewsdescription(String newsdescription) {
		model.setNewsdescription(newsdescription);
	}

	/**
	 * Sets the news ID of this news and events.
	 *
	 * @param newsId the news ID of this news and events
	 */
	@Override
	public void setNewsId(long newsId) {
		model.setNewsId(newsId);
	}

	/**
	 * Sets the primary key of this news and events.
	 *
	 * @param primaryKey the primary key of this news and events
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the spotlight of this news and events.
	 *
	 * @param spotlight the spotlight of this news and events
	 */
	@Override
	public void setSpotlight(int spotlight) {
		model.setSpotlight(spotlight);
	}

	/**
	 * Sets the status of this news and events.
	 *
	 * @param status the status of this news and events
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the ti_newsdescription of this news and events.
	 *
	 * @param ti_newsdescription the ti_newsdescription of this news and events
	 */
	@Override
	public void setTi_newsdescription(String ti_newsdescription) {
		model.setTi_newsdescription(ti_newsdescription);
	}

	/**
	 * Sets the uuid of this news and events.
	 *
	 * @param uuid the uuid of this news and events
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the wjhs of this news and events.
	 *
	 * @param wjhs the wjhs of this news and events
	 */
	@Override
	public void setWjhs(int wjhs) {
		model.setWjhs(wjhs);
	}

	@Override
	protected NewsAndEventsWrapper wrap(NewsAndEvents newsAndEvents) {
		return new NewsAndEventsWrapper(newsAndEvents);
	}

}