CREATE DATABASE QLIVEXEMPHIM;

USE QLIVEXEMPHIM;

CREATE TABLE KHACHHANG(
   PhoneNumber VARCHAR(15) NOT NULL,
   FullName VARCHAR(30) NOT NULL,
   PassWord VARCHAR(16) NOT NULL,
   DateOFBirth DATE NOT NULL,
   Gender CHAR(3) NOT NULL,
	CONSTRAINT PK_SDT PRIMARY KEY (PhoneNumber));

CREATE TABLE FILM(
   NameFilm VARCHAR(50) NOT NULL,
   IdFilm VARCHAR(20) NOT NULL,
   StatusFilm BOOLEAN NOT NULL,
   CONSTRAINT PK_IdFilm PRIMARY KEY (IdFilm));

CREATE TABLE TICKET(
  IdTicket VARCHAR(20) NOT NULL,
  StatusTicket TINYINT NOT null CHECK (StatusTicket IN(1,2,3)),
  Price DOUBLE(10,2) DEFAULT 0.00,
  IdFilm VARCHAR(20) NOT NULL,
  PhoneNumber VARCHAR(15) NOT NULL,
  CONSTRAINT PK_IdTicket PRIMARY KEY (IdTicket),
  CONSTRAINT FK_IdFilm FOREIGN KEY (IdFilm) REFERENCES FILM(IdFilm),
  CONSTRAINT FK_PhoneNumber FOREIGN KEY (PhoneNumber) REFERENCES khachhang(PhoneNumber));
  
insert into qlivexemphim.khachhang values
 ('0392779517','Nguyễn Minh Hoàng','123456789','2004-09-19','nam');