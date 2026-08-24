-- CREATE DATABASE aula_index.sql 

-- Exemplo
Create table user(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL
)

INSERT INTO user
VALUES
('Arthur','141-530-064-08'),
('Arthur','143-530-064-08'),
('Julia','142-530-064-08')

SELECT nome from user
WHERE nome = 'Arthur'
WHERE cpf = '141-530-064-08'
-----------------------------------------

-- Criando um indice
CREATE INDEX nome_index ON tabela(coluna)

-- EX
CREATE INDEX cpf_index on user(cpf);-- definir o cpf como um index
SELECT cpf FROM user
WHERE cpf = '141-530-064-08'
-----------------------------------------

-- Tipos de indice 
    -- B-tree
    -- Hash
    -- GiST
    -- GIN
    --...
-----------------------------------------

-- B-Tree o(log n)
--Ex
SELECT jogador, pontuacao FROM jogadores
WHERE pontuacao <=100;

-- EX index
CREATE INDEX nome_index on tabela USING btree(campo_tabela)

-- ex
CREATE INDEX btree_index on jogadores USING btree(pontuacao)
-----------------------------------------

-- Hash o(1)
-- EX
select cidade from clientes
where cidade = 'Maceio'

-- EX index
CREATE INDEX hash_index on tabela USING hash(campo_tabela)

--ex
CREATE INDEX hash_index on clientes USING hash(cidade)
WHERE cidade = 'Maceio'
-----------------------------------------

-- GiST
CREATE INDEX nome_index on tabela USING gist(campo_tabela)

-- ex
CREATE INDEX cep_index on tabela USING gist(cep)
-----------------------------------------

--GIN -- manipula mais de um valor
CREATE INDEX nome_index on tabela USING gin(campo1_tabela, campo2_tabela)

-- ex 
CREATE index busca_usuario_index on user USING gin(nome,cpf)