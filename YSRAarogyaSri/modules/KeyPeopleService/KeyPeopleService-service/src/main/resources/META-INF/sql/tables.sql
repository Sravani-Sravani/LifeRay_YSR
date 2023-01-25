create table designation (
	did LONG not null primary key,
	wid LONG,
	dname VARCHAR(75) null,
	status VARCHAR(75) null
);

create table keyPeople (
	trust_userId LONG not null primary key,
	empname VARCHAR(75) null,
	phone VARCHAR(75) null,
	email VARCHAR(75) null,
	wingId LONG,
	designationId LONG,
	status VARCHAR(75) null,
	empOrder VARCHAR(75) null,
	createDate DATE null,
	createdBy VARCHAR(75) null,
	modifyDate DATE null,
	modifyBy VARCHAR(75) null
);

create table wings (
	wid LONG not null primary key,
	wname VARCHAR(75) null,
	status VARCHAR(75) null
);