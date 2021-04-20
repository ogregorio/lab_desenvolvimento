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
	cpfCliente VARCHAR(11) NOT NULL,
	matriculaAutomovel VARCHAR(10) NOT NULL,
	codigoAgente VARCHAR(10) NOT NULL,
	dataInicial DATETIME,
	dataModificacao DATETIME,
	FOREIGN KEY (cpfCliente) REFERENCES Cliente(cpf),
	FOREIGN KEY (matriculaAutomovel) REFERENCES Automoveis(matricula),
	FOREIGN KEY (codigoAgente) REFERENCES Agente(codigoAgente),
	PRIMARY KEY(codigo)
);

CREATE TABLE Automoveis (
	matricula VARCHAR(10) NOT NULL,
	ano YEAR NOT NULL,
	marca VARCHAR(50) NOT NULL,
	modelo VARCHAR(50) NOT NULL,
	placa VARCHAR(7) NOT NULL,
	status VARCHAR(20),
	proprietario VARCHAR(255),
	PRIMARY KEY(matricula)
);

CREATE TABLE Agente (
	codigoAgente VARCHAR(10) NOT NULL,
	PRIMARY KEY(codigoAgente)
);

INSERT INTO Cliente (cpf, rg, nome, profissao, empregador, rendimento) VALUES ('12364124111', 'MG421791', 'Zico', 'Jogador', 'Flamengo', 30000);

INSERT INTO Automoveis (matricula, ano, marca, modelo, placa, status, proprietario) VALUES ('2d2d4c4d8f', 2022, 'Volkswagen', 'GOL', 'AJOB123', 'NULL', 'Leonardo');

INSERT INTO Endereco (cep, rua, estado, pais, cpf) VALUES ('33935389', 'rua dez', 'MG', 'Brasil', '12364124111');

INSERT INTO Pedidos (codigo, status, cpfCliente, matriculaAutomovel, codigoAgente, dataInicial, dataModificacao) VALUES (3, 'Cancelado', '12364124111', '2d2d4c4d8f', '1234567891', datetime('2016-08-30 18:47:56.235'), datetime('2016-09-30 18:47:56.235') );

INSERT INTO Agente (codigoAgente) VALUES ('1234567891');