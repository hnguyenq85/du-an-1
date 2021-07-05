﻿CREATE DATABASE STORAGEMANAGERSYSTEM
GO
USE STORAGEMANAGERSYSTEM
GO
--DROP DATABASE STORAGEMANAGERSYSTEM

--------------------------------------------------------
-- TẠO BẢNG --

CREATE TABLE LOAIHANGHOA (
	MALHH VARCHAR(5) PRIMARY KEY,
	TENLHH NVARCHAR(50),
)
GO
CREATE TABLE HANGHOA (
	MAHH VARCHAR(10) PRIMARY KEY,
	TENHH NVARCHAR(50),
	DONGIA FLOAT,
	DONVITINH NVARCHAR(10),
	MALHH VARCHAR(5),
	
)
GO
CREATE TABLE LOAIDOITAC(
	MALDT VARCHAR(10) PRIMARY KEY,
	TENDT VARCHAR(50),
)
GO
CREATE TABLE DOITAC(
	MADT INT IDENTITY(1,1) PRIMARY KEY,
	TENDT NVARCHAR(50),
	DIACHI NVARCHAR(50),
	EMAIL VARCHAR(50),
	SODT VARCHAR(15),
	VAITRO BIT,
	MALDT VARCHAR(10),
)
GO
CREATE TABLE KHO(
	MAKHO INT PRIMARY KEY,
	DIACHI NVARCHAR(50),
	MATK VARCHAR(10),
)
GO
CREATE TABLE LUUTRU(
	MALT INT PRIMARY KEY,
	MAKHO INT,
	MAHH VARCHAR(10),
	SOLUONG FLOAT,
)
GO
CREATE TABLE CHITIETPHIEU(
	MACTP INT PRIMARY KEY,
	MAPHIEU INT,
	MALT INT,
	SOLUONG FLOAT,
	DONGIA FLOAT,
)	
GO
CREATE TABLE PHIEU (
	MAPHIEU INT IDENTITY(1,1) PRIMARY KEY,
	NGAYLAP DATETIME,
	LOAI BIT,
	TRANGTHAI BIT,
	NGTHUCHIEN DATE,
	NGHOANTHANH DATE,
	MADT INT,
	MANV VARCHAR(10),
)
GO
CREATE TABLE CHITIETKIEMKHO(
	MACTP INT IDENTITY(1,1) PRIMARY KEY,
	SOLUONGTON FLOAT,
	SOLUONGTHUC FLOAT,
	GHICHU NVARCHAR(50),
	MAKK VARCHAR(10),
	MALT INT,
)
GO
CREATE TABLE PHIEUKIEMKHO(
	MAKK VARCHAR(10) PRIMARY KEY,
	NGAYLAP DATETIME,
	NGAYKIEM DATE,
	TRANGTHAI BIT,
	MANV VARCHAR(10),
)
GO
CREATE TABLE NHANVIEN(
	MANV VARCHAR(10) PRIMARY KEY,
	TENNV VARCHAR(50),
	VAITRO BIT,
	MATKHAU VARCHAR(15),
	MUOI VARCHAR(15),
)
GO
-------------------------------------
-- THÊM KHOÁ NGOẠI --
--
ALTER TABLE HANGHOA
ADD CONSTRAINT FK_MALHH
FOREIGN KEY (MALHH) REFERENCES LOAIHANGHOA(MALHH);
GO
--
ALTER TABLE DOITAC
ADD CONSTRAINT FK_MALDT
FOREIGN KEY (MALDT) REFERENCES LOAIDOITAC(MALDT);
GO
--
ALTER TABLE PHIEU
ADD CONSTRAINT FK_MADT
FOREIGN KEY (MADT) REFERENCES DOITAC(MADT);

ALTER TABLE PHIEU
ADD CONSTRAINT FK_MANV
FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);
GO
--
ALTER TABLE CHITIETPHIEU
ADD CONSTRAINT FK_MAPHIEU
FOREIGN KEY (MAPHIEU) REFERENCES PHIEU(MAPHIEU);

ALTER TABLE CHITIETPHIEU
ADD CONSTRAINT FK_MALT
FOREIGN KEY (MALT) REFERENCES LUUTRU(MALT);
GO
--
ALTER TABLE LUUTRU
ADD CONSTRAINT FK_MAKHO
FOREIGN KEY (MAKHO) REFERENCES KHO(MAKHO);

ALTER TABLE LUUTRU
ADD CONSTRAINT FK_MAHH
FOREIGN KEY (MAHH) REFERENCES HANGHOA(MAHH);
GO
--
ALTER TABLE KHO
ADD CONSTRAINT FK_MATK
FOREIGN KEY (MATK) REFERENCES NHANVIEN(MANV);
GO
--
ALTER TABLE PHIEUKIEMKHO
ADD CONSTRAINT FK_MANV_PHIEUKIEMKHO
FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);
GO
--
ALTER TABLE CHITIETKIEMKHO
ADD CONSTRAINT FK_MAKK
FOREIGN KEY (MAKK) REFERENCES PHIEUKIEMKHO(MAKK);

ALTER TABLE CHITIETKIEMKHO
ADD CONSTRAINT FK_MALT_CHITIETKIEMKHO
FOREIGN KEY (MALT) REFERENCES LUUTRU(MALT);
GO
-----------------------------