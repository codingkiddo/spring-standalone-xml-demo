drop table if exists EMPLOYEE;

CREATE TABLE EMPLOYEE
(
	ID int  NOT NULL PRIMARY KEY,
	FIRST_NAME varchar(255),
	LAST_NAME varchar(255),
	ADDRESS varchar(255)
);