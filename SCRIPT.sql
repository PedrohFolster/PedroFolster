DROP DATABASE IF EXISTS DBELEICAO;

CREATE DATABASE DBELEICAO;

USE DBELEICAO;

CREATE TABLE PARTIDO(
	IDPARTIDO INT PRIMARY KEY,
	NOME VARCHAR(255),
	SIGLA VARCHAR(10)
);

CREATE TABLE CANDIDATO(
	IDCANDIDADTO INT NOT NULL,
	IDPARTIDO INT, 
	NOME VARCHAR(255),
	RUA VARCHAR(100),
	CEP VARCHAR(8),
	CIDADE VARCHAR(100),
	ESTADO CHAR(2),
	FOREIGN KEY (IDPARTIDO) REFERENCES PARTIDO(IDPARTIDO)
);


CREATE TABLE FUNCIONARIO (
	FUNCIONARIO INT PRIMARY KEY,
	IDPARTIDO INT NOT NULL,
	DESCRICAO VARCHAR (100)
);


CREATE TABLE USUARIO (
  LOGIN VARCHAR(100),
  SENHA VARCHAR(255),
  EMAIL VARCHAR(100)
);



CREATE TABLE SETOR(
	IDSETOR INT NOT NULL,
	NOME VARCHAR(100)
);

CREATE TABLE FUNCAO(
	DESCRICAO VARCHAR(100)
);

CREATE TABLE PARTICIPA(
	IDFUNCAO INT,
	IDUSUARIO INT
);


CREATE TABLE VOTAR(
	IDELEICAO INT PRIMARY KEY,
	IDUSUARIO INT,
	IDCANDIDATO INT,
	DT_VOTO DATETIME
);


CREATE TABLE ELEICAO (
	IDELEICAO INT NOT NULL,
	TITULO VARCHAR(100),
	DT_INICIO DATETIME,
	DT_FIM DATETIME,
	PRIMARY KEY (IDELEICAO)
);

CREATE TABLE CHAPA (
idchapa int not null,
ideleicao int not null,
nome varchar(100) not null,
primary key(idchapa),
foreign key(ideleicao) references eleicao(ideleicao)
);

CREATE TABLE DEPARTAMENTO (
iddepartamento int not null,
nome varchar(100) not null,
primary key(iddepartamento)
);

CREATE TABLE CARGO (
idcargo int not null,
descricao varchar(100),
primary key(idcargo)
);


-- FUNCIONÁRIO
alter table funcionario add iddepartamento int not null,
drop column funcionario,
add idfuncionario int not null,
drop column idpartido,
drop column descricao,
add nome varchar(100),
add cpf varchar(11),
add senha varchar(45),
add primary key(idfuncionario),
add foreign key(iddepartamento) references departamento (iddepartamento);

-- PARTICIPA
alter table participa add idfuncionario int not null,
add idchapa int not null,
add idcargo int not null,
add foreign key(idfuncionario) references funcionario (idfuncionario),
add foreign key(idchapa) references chapa (idchapa),
add foreign key(idcargo) references cargo (idcargo),
drop column idfuncao,
drop column idusuario,
add primary key(idfuncionario, idchapa);

-- VOTAR
alter table votar drop column IDELEICAO;
alter table votar add ideleicao int not null,
add idfuncionario int,
add idchapa int not null,
add dt_voto int not null,
drop column idusuario,
drop column idcandidato,
drop column dt_voto,
add primary key (ideleicao, idfuncionario),
add foreign key(ideleicao) references eleicao(ideleicao),
add foreign key(idfuncionario) references funcionario(idfuncionario),
add foreign key(idchapa) references chapa(idchapa);


-- CANDIDATO
drop table candidato;

-- PARTIDO
drop table partido;


-- USUARIO
drop table usuario;

-- SETOR
drop table setor;

-- FUNCAO
drop table funcao;