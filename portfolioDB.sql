
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
    Nombre varchar(50) NOT NULL,
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
	Id int,
	IdInstitucion int,
    IdPersona int,
    NombreCarrera varchar(50) NOT NULL,
    AñoInicio int NOT NULL,
    AñoFin int NOT NULL,
    Estado bit,
    
    CONSTRAINT PK_ID_E PRIMARY KEY(Id),
    CONSTRAINT FK_IDI_E FOREIGN KEY(IdInstitucion) REFERENCES Institucion(Id),
    CONSTRAINT FK_IDP_E FOREIGN KEY(IdPersona) REFERENCES Persona(Id)
);

CREATE TABLE Proyecto(
	Id int,
    IdPersona int,
    Nombre varchar(50) NOT NULL,
    Descripcion varchar(100) NOT NULL,
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

CALL RegistrarUsuario(1, "Admin", "argprograma", true);

-- Inserción de registros

INSERT INTO Persona VALUES(1, "Carlo", "Renosto", 20, "Informático (Estudiante)");
INSERT INTO Institucion VALUES(1, "Universidad Tecnológica Nacional", "Tigre");
INSERT INTO Institucion VALUES(2, "Laboratorio de Idiomas UBA", "CABA");
INSERT INTO Institucion VALUES(3, "Escuela Don Orione", "Tigre");
INSERT INTO Educacion VALUES(1, 3, 1, "Nivel Secundario", 2015, 2020, 0);
INSERT INTO Educacion VALUES(2, 1, 1, "Técnico Universitario en Programación", 2021, 2023, 1);
INSERT INTO Educacion VALUES(3, 2, 1, "Inglés - Nivel 9 (B1)", 2022, 2022, 0);
INSERT INTO Educacion VALUES(4, 2, 1, "Inglés - Nivel 10", 2023, 2023, 1);



