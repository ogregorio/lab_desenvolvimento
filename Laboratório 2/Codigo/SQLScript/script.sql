CREATE TABLE Cliente (
	cpf VARCHAR(11) NOT NULL,
	rg VARCHAR(10) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	profissao VARCHAR(255),
	empregador VARCHAR(255),
	rendimento DECIMAL,
	PRIMARY KEY(cpf)
);

CREATE TABLE Endereco (
	cep VARCHAR(8) NOT NULL,
	rua VARCHAR(255),
	estado VARCHAR(255),
	pais VARCHAR(255),
	cpf VARCHAR(11) NOT NULL,
	FOREIGN KEY (cpf) REFERENCES Cliente(cpf),
	PRIMARY KEY(cep)
);

CREATE TABLE Pedidos (
	codigo int AUTO_INCREMENT NOT NULL,
	status VARCHAR(20),
	data_inicial DATETIME,
	data_modificacao DATETIME,
	PRIMARY KEY(codigo)
);

CREATE TABLE Automoveis (
	matricula VARCHAR(10) NOT NULL,
	ano YEAR NOT NULL,
	marca VARCHAR(50) NOT NULL,
	placa VARCHAR(7) NOT NULL,
	status VARCHAR(20),
	proprietario VARCHAR(255),
	PRIMARY KEY(matricula)
);

INSERT INTO Cliente (cpf, rg, nome, profissao, empregador, rendimento) VALUES ('12364124126', 'MG421791', 'Bruna', 'Otorrinolaringologista', 'Napa center', 3000);

INSERT INTO Automoveis (matricula, ano, marca, placa, status, proprietario) VALUES ('2d2d4c4d8f', 2022, 'Volkswagen', 'AJOB123', 'NULL', 'Leonardo');

INSERT INTO Endereco (cep, rua, estado, pais, cpf) VALUES ('33935389', 'rua dez', 'MG', 'Brasil', '12364124123');

INSERT INTO Pedidos (codigo, status, data_inicial, data_modificacao) VALUES (3, 'Cancelado', datetime('2016-08-30 18:47:56.235'), datetime('2016-09-30 18:47:56.235') );

INSERT INTO Pedidos (codigo, status, data_inicial, data_modificacao) VALUES (9, 'Deferido', datetime('2021-04-15 20:42:51.235'), datetime('2021-04-18 21:47:56.235') );