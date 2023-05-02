
-- Portfolio Web - Script SQL

CREATE DATABASE portfolioDB;

USE portfolioDB;

-- Tablas principales

CREATE TABLE Persona(
	Id int,
    Nombre varchar(20) NOT NULL,
    Apellido varchar(20) NOT NULL,
    Edad int NOT NULL,
    Ocupacion varchar(30),
    
    CONSTRAINT PK_ID_P PRIMARY KEY(Id)
);

CREATE TABLE Institucion(
	Id int, 
    Nombre varchar(30) NOT NULL,
    Ubicacion varchar(20) NOT NULL,
    
    CONSTRAINT PK_ID_I PRIMARY KEY(Id)
);

CREATE TABLE Tecnologia(
	Id int,
    Nombre varchar(20) NOT NULL,
    Tipo varchar(20) NOT NULL,
    
    CONSTRAINT PK_ID_T PRIMARY KEY(Id)
);

CREATE TABLE Usuario(
	Id int,
    Nombre char(20) NOT NULL,
    Contra char(20) NOT NULL,
    EsAdmin boolean NOT NULL,
    
    CONSTRAINT PK_ID_U PRIMARY KEY(Id)
);

-- Tablas para Persona

CREATE TABLE ExperienciaLaboral(
	IdInstitucion int,
    IdPersona int,
    Puesto varchar(30) NOT NULL,
    AñoInicio int NOT NULL,
    AñoFin int NOT NULL,
    
    CONSTRAINT PK_ID_E2 PRIMARY KEY(IdInstitucion),
    CONSTRAINT FK_IDI_E2 FOREIGN KEY(IdInstitucion) REFERENCES Institucion(Id),
    CONSTRAINT FK_IDP_E2 FOREIGN KEY(IdPersona) REFERENCES Persona(Id)
);

CREATE TABLE Educacion(
	IdInstitucion int,
    IdPersona int,
    NombreCarrera varchar(30) NOT NULL,
    AñoInicio int NOT NULL,
    AñoFin int NOT NULL,
    
    CONSTRAINT PK_ID_E PRIMARY KEY(IdInstitucion),
    CONSTRAINT FK_IDI_E FOREIGN KEY(IdInstitucion) REFERENCES Institucion(Id),
    CONSTRAINT FK_IDP_E FOREIGN KEY(IdPersona) REFERENCES Persona(Id)
);

CREATE TABLE Proyecto(
	Id int,
    IdPersona int,
    Nombre varchar(20) NOT NULL,
    Descripcion varchar(50) NOT NULL,
    FechaRealizacion char(10) NOT NULL,
    
	CONSTRAINT PK_ID_P PRIMARY KEY(Id),
	CONSTRAINT FK_IDP_P FOREIGN KEY(IdPersona) REFERENCES Persona(Id)
);

CREATE TABLE TecnologiasXPersona(
	IdTecnologia int,
    IdPersona int,
    NombreTecnologia varchar(20),
    Nivel char(10),
    
    CONSTRAINT PK_IDTecPer_TXP PRIMARY KEY(IdTecnologia, IdPersona)
);

CREATE PROCEDURE RegistrarUsuario(iId int, iNombre char(20), iContra char(20), iEsAdmin boolean)
	INSERT INTO Usuario VALUES(iId, iNombre, iContra, iEsAdmin);

CALL RegistrarUsuario(1, "Admin", "argprograma", true)





