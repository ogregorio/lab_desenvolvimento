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
