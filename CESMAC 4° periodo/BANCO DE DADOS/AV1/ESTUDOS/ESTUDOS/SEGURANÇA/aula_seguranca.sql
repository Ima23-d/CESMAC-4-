-- Criando 
CREATE USER nome_do_usuario [WITH opcoes_de_configuracao] 
CREATE ROLE nome_da_role [WITH opcoes_de_configuracao]

--ex
CREATE role admin with LOGIN SUPERUSER PASSWORD 'senha123'; -- SUPERUSER
CREATE role usuario WITH LOGIN NOSUPERUSER  PASSWORD 'senha123' -- NOSUPERUSER  
CREATE role usuario2 with login password 'senha123' -- Padrao NOSUPERUSER 
-------------------------------------
-- Opcões de Usuario
    -- SUPERUSER: O usuário tem todos os privilégios, incluindo a capacidade de criar outros usuários e roles.
    -- NOSUPERUSER: O usuário não tem privilégios de superusuário.
    -- CREATEDB: O usuário tem permissão para criar bancos de dados.
    -- NOCREATEDB: O usuário não tem permissão para criar bancos de dados.
    -- CREATEROLE: O usuário tem permissão para criar roles.
    -- NOCREATEROLE: O usuário não tem permissão para criar roles.
    -- LOGIN: O usuário pode se conectar ao banco de dados.
    -- NOLOGIN: O usuário não pode se conectar ao banco de dados.
    -- PASSWORD 'senha': Define a senha do usuário.
    -- CONNECTION LIMIT n: Define o número máximo de conexões simultâneas que o usuário pode ter.
    -- VALID UNTIL 'data': Define a data de validade da conta do usuário. 
-------------------------------------

-- Alterando Usuário
ALTER ROLE nome_da_role [WITH opcoes_de_configuracao]
--ex
ALTER ROLE admin WITH PASSWORD 'nova_senha' -- alterando a senha
ALTER ROLE user with VALID UNTIL '2024-12-31' -- Define a data de validade da conta do usuário
-------------------------------------

-- Excluir usuario
DROP ROLE nome_role
--ex
DROP ROLE usuario
-------------------------------------

-- Exercicio
CREATE ROLE cordenador1 WITH LOGIN CREATEROLE PASSWORD 'cordenador123';
CREATE ROLE professor WITH LOGIN NOSUPERUSER PASSWORD 'professor123';
CREATE ROLE app_mobile WITH LOGIN VALID UNTIL '2020-12-31' PASSWORD 'appmobile123';
--ex
--Trcar a senha do aapp
ALTER ROLE app_mobile WITH PASSWORD 'novasenhaapp123';
-------------------------------------

-- Criar um Grupo
CREATE GROUP nome_grupo
CREATE ROLE nome_grupo
-------------------------------------

-- Alterando menbros do grupo
ALTER GROUP nome_grupo ADD USER nome_do_usuario
--ex
ALTER GROUP testadores ADD USER teste1,teste2,teste3; -- Adicionando varios usuarios ao grupo

ALTER GROUP nome_grupo DROP USER nome_usuario
--ex
ALTER GROUP testadores DROP USER teste3
-------------------------------------

-- EXcluir o grupo
DROP GROUP nome_grupo
--ex
DROP GROUP testadores
-------------------------------------

-- Exercicio
CREATE GROUP professores
ALTER GROUP professores ADD USER professor1

CREATE GROUP coordenadores
ALTER GROUP coordenadores ADD USER coordenador1
-------------------------------------

-- Privilegios
    -- SELECT
    -- INSERT
    --UPDATE
    --DELETE
    --REFERENCES
    --TRUNCATE
    --ALL PRIVILEGES
-------------------------------------

-- Dando privilegios a tabela7
GRANT privilegios_tabela ON nome_tabela To nome_usuario;
--ex
GRANT SELECT,INSERT,UPDATE ON coordenadores TO coordenador1
-------------------------------------

-- Removendo os privilegios

REVOKE privilegios_tabela ON nome_tabela FROM nome_usuario;
--ex
REVOKE SELECT,INSERT,UPDATE ON coordenadores FROM coordenador1
-------------------------------------

-- Exercicio
GRANT SELECT,INSERT,UPDATE,DELETE ON alunos TO coordenadores
GRANT SELECT, INSERT , UPDATE, DELETE ON notas TO coordenadores
GRANT SELECT, INSERT , UPDATE ON alunos TO professores
GRANT SELECT, INSERT , UPDATE ON notas TO professores
GRANT ALL ON notas TO aplicativo_mobile

REVOKE UPDATE, INSERT ON alunos FROM professores