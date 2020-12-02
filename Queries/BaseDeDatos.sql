-- Deberia crearse primero la base de datos con el nombre: TP_Aerolineas_2019

-- DROP SCHEMA dbo;

CREATE SCHEMA dbo;
-- TP_Aerolineas_2019.dbo.LineasAereas definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.LineasAereas GO

CREATE TABLE TP_Aerolineas_2019.dbo.LineasAereas (
	NombreAerolinea varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Alianza varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	IDLineaAerea int IDENTITY(0,1) NOT NULL,
	CONSTRAINT LineasAereas_PK PRIMARY KEY (IDLineaAerea)
) GO;


-- TP_Aerolineas_2019.dbo.Pais definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.Pais GO

CREATE TABLE TP_Aerolineas_2019.dbo.Pais (
	IDPais int NOT NULL,
	Pais varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Acronimo varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Acronimo2 varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	CONSTRAINT Pais_PK PRIMARY KEY (IDPais)
) GO;


-- TP_Aerolineas_2019.dbo.Pasaporte definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.Pasaporte GO

CREATE TABLE TP_Aerolineas_2019.dbo.Pasaporte (
	NUMpasaporte varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	AutoridadEmision varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	PaisEmision varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	FECHAemision date NULL,
	FECHAVencimiento date NULL,
	IDPasaporte int IDENTITY(0,1) NOT NULL,
	CONSTRAINT Pasaporte_PK PRIMARY KEY (IDPasaporte)
) GO;


-- TP_Aerolineas_2019.dbo.Telefono definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.Telefono GO

CREATE TABLE TP_Aerolineas_2019.dbo.Telefono (
	NUMpersonal varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	NUMcelular varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	NUMlaboral varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	IDTelefono int IDENTITY(0,1) NOT NULL,
	CONSTRAINT Telefono_PK PRIMARY KEY (IDTelefono)
) GO;


-- TP_Aerolineas_2019.dbo.Aeropuerto definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.Aeropuerto GO

CREATE TABLE TP_Aerolineas_2019.dbo.Aeropuerto (
	Ciudad varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Provincia varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	idPais int NULL,
	IdentificacionAeropuerto varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	CONSTRAINT Aeropuerto_PK PRIMARY KEY (IdentificacionAeropuerto),
	CONSTRAINT FKihu2w1yklr1u5wmx1t7kwlyti FOREIGN KEY (idPais) REFERENCES TP_Aerolineas_2019.dbo.Pais(IDPais)
) GO;


-- TP_Aerolineas_2019.dbo.DireccionCompleta definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.DireccionCompleta GO

CREATE TABLE TP_Aerolineas_2019.dbo.DireccionCompleta (
	Calle varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Altura varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Ciudad varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Provincia varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	idPais int NULL,
	CodPostal varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	IDDireccion int IDENTITY(0,1) NOT NULL,
	CONSTRAINT DireccionCompleta_PK PRIMARY KEY (IDDireccion),
	CONSTRAINT FKd1ovk2ela4dwcljwc8ol9nq4s FOREIGN KEY (idPais) REFERENCES TP_Aerolineas_2019.dbo.Pais(IDPais)
) GO;


-- TP_Aerolineas_2019.dbo.PasajeroFrecuente definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.PasajeroFrecuente GO

CREATE TABLE TP_Aerolineas_2019.dbo.PasajeroFrecuente (
	idAerolinea int NULL,
	Numero varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Categoria varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	IDPasajeroFrecuente int IDENTITY(0,1) NOT NULL,
	CONSTRAINT PasajeroFrecuente_PK PRIMARY KEY (IDPasajeroFrecuente),
	CONSTRAINT FK8phr3meulfs75vt0jyumla71p FOREIGN KEY (idAerolinea) REFERENCES TP_Aerolineas_2019.dbo.LineasAereas(IDLineaAerea)
) GO;


-- TP_Aerolineas_2019.dbo.Vuelos definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.Vuelos GO

CREATE TABLE TP_Aerolineas_2019.dbo.Vuelos (
	CantAsientos int NULL,
	FechaHoraSalida date NULL,
	FechaHoraLlegada date NULL,
	TiempoVuelo varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	idLineaAerea int NULL,
	IDVuelos int IDENTITY(0,1) NOT NULL,
	NUMvuelo varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	idAeropuertoLlegada varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	idAeropuertoSalida varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	CONSTRAINT Vuelos_PK PRIMARY KEY (IDVuelos),
	CONSTRAINT FK3q2wwwirgn4jmh7nr739uiacv FOREIGN KEY (idAeropuertoSalida) REFERENCES TP_Aerolineas_2019.dbo.Aeropuerto(IdentificacionAeropuerto),
	CONSTRAINT FK9xddoo02j2cjpo3ad50gyjaa3 FOREIGN KEY (idLineaAerea) REFERENCES TP_Aerolineas_2019.dbo.LineasAereas(IDLineaAerea),
	CONSTRAINT FKblj7f3nw1ewulswegeirgb27m FOREIGN KEY (idAeropuertoLlegada) REFERENCES TP_Aerolineas_2019.dbo.Aeropuerto(IdentificacionAeropuerto)
) GO;


-- TP_Aerolineas_2019.dbo.Cliente definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.Cliente GO

CREATE TABLE TP_Aerolineas_2019.dbo.Cliente (
	NombreCliente varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	ApellidoCliente varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	DNI varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	RS varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	EMAIL varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	FechaNacimiento date NULL,
	idTelefono int NULL,
	idPasaporte int NULL,
	idPasajero int NULL,
	IDCliente int IDENTITY(0,1) NOT NULL,
	idDireccionCompleta int NULL,
	CONSTRAINT Cliente_PK PRIMARY KEY (IDCliente),
	CONSTRAINT FK24lsx7rfiakal1ks3r7pt0af0 FOREIGN KEY (idPasaporte) REFERENCES TP_Aerolineas_2019.dbo.Pasaporte(IDPasaporte),
	CONSTRAINT FK6hr8tac99ji5h6xdqsw3moyli FOREIGN KEY (idPasajero) REFERENCES TP_Aerolineas_2019.dbo.PasajeroFrecuente(IDPasajeroFrecuente),
	CONSTRAINT FKb25s68a17kqsrjmmm6s57uq3s FOREIGN KEY (idTelefono) REFERENCES TP_Aerolineas_2019.dbo.Telefono(IDTelefono),
	CONSTRAINT FKdx1fwjhmc743oeo1dn9wb9q1u FOREIGN KEY (idDireccionCompleta) REFERENCES TP_Aerolineas_2019.dbo.DireccionCompleta(IDDireccion)
) GO;


-- TP_Aerolineas_2019.dbo.Ventas definition

-- Drop table

-- DROP TABLE TP_Aerolineas_2019.dbo.Ventas GO

CREATE TABLE TP_Aerolineas_2019.dbo.Ventas (
	idVuelo int NULL,
	idCliente int NULL,
	FechaDeVenta date NULL,
	FormaDePago varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	IDVenta int IDENTITY(0,1) NOT NULL,
	Cuotas varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Precio varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	CONSTRAINT Ventas_PK PRIMARY KEY (IDVenta),
	CONSTRAINT FK2ri93jw7wgatlxmuta3jwj8kx FOREIGN KEY (idCliente) REFERENCES TP_Aerolineas_2019.dbo.Cliente(IDCliente),
	CONSTRAINT FKkcbppcwloahfcc3a28542xrph FOREIGN KEY (idVuelo) REFERENCES TP_Aerolineas_2019.dbo.Vuelos(IDVuelos)
) GO;
