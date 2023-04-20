create table apgovt_newsandevents (
	uuid_ VARCHAR(75) null,
	newsId LONG not null primary key,
	newsdescription VARCHAR(75) null,
	ti_newsdescription VARCHAR(75) null,
	newsDate DATE null,
	fileEntryId LONG,
	status VARCHAR(75) null,
	createdDate DATE null,
	createdBy LONG,
	modifiedDate DATE null,
	modifiedBy LONG
);