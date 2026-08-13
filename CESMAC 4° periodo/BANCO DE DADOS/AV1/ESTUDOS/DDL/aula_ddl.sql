-- CHAVE PRIMARIA---
CREATE TABLE cliente(
	id_cliente SERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	data_nascimento DATE NOT NULL,
	cpf VARCHAR(14)
)
--------------------------------------

-- CHAVE ESTRANGEIRA 1-1 ou 1-N---
CREATE TABLE alunos(
	matricula number PRIMARY KEY,
	nome VARCHAR(200)
)
CREATE TABLE notas(
	id_notas SERIAL PRIMARY KEY,
	nota numeric(4,2),
	id_aluno integer references alunos(matricula)
)

--------------------------------------
-- CHAVE ESTRANGEIRA N-N---
CREATE TABLE vendas(
	id SERIAL PRIMARY KEY,
	cliente VARCHAR(200) NOT NULL,
	total NUMERIC(7,2)
);
CREATE TABLE produtos(
	id SERIAL PRIMARY KEY,
	produto VARCHAR(200) NOT NULL,
	preco NUMERIC(7,2)
);
CREATE TABLE vendas_produto(
	id_vendas integer REFERENCES vendas(id),
	id_produtos integer REFERENCES produtos(id)
)
--------------------------------------

-- PRATICANDO---
CREATE TABLE enderecos(
	id_endereco SERIAL PRIMARY KEY,
	id_cliente INTEGER REFERENCES cliente(id_cliente), --- chave estrangeira
	endereco VARCHAR(200) NOT NULL,
	numero_casa int NOT NULL,
	complemento VARCHAR(255)
)
--------------------------------------

-- ALTERANDO TABLE --
ALTER TABLE cliente ADD COLUMN sexo VARCHAR(100) NOT NULL -- ACRECENTAR SEXO
ALTER TABLE cliente DROP COLUMN sexo -- APAGAR COLUNA SEXO
--------------------------------------

-- EXCLUIR A TABLE
DROP TABLE aula_ddl;
--------------------------------------

-- PRATICANDO--
ALTER TABLE cliente ADD COLUMN saldo NUMERIC(7,2) NOT NULL
