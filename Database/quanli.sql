CREATE DATABASE QLIVEXEMPHIM;

USE QLIVEXEMPHIM;

CREATE TABLE KHACHHANG(
   PhoneNumber VARCHAR(15) NOT NULL,
   FullName VARCHAR(30) NOT NULL,
   PassWord VARCHAR(16) NOT NULL,
   DateOFBirth DATETIME NOT NULL,
   Gender CHAR(3) NOT NULL,
	CONSTRAINT PK_SĐT PRIMARY KEY (PhoneNumber));