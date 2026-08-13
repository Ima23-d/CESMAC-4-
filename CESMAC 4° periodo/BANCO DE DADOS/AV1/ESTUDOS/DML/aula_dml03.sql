-- Inserindo dados(EXEMPLO)
INSERT INTO tabela(campo1,campo2,campo3....)
VALUES(valor1,valor2,valor3.....)
--------------------------------------

-- EXERCICIO
insert into personagens(id,personagem,classe_id,hp,mp,forca,defesa)
values(1,'teste',3,30,50,5,10)
-- ou 
insert into personagens values(1,'teste',3,30,50,5,10)
--------------------------------------

-- Atualizando os dados usando o UPDATE SET(EXEMPLO)
UPDATE tabela SET campos1 = valor1, campo2 =  valor2 WHERE <condicao>
--------------------------------------

-- EXERCICIO aumentar o hp de todos os magos em 20%
UPDATE personagens SET hp = hp*1.2 WHERE classe_id = 2
--------------------------------------

-- Excluir os dados usando o DELETE(EXEMPLO)
DELETE FROM tabela WHERE <condicao>
--------------------------------------

-- EXCLUIR TODOS OS DADOS USANDO O TRUNCATE(EXEMPLO)
TRUNCATE TABLE tabela
--------------------------------------

-- EXERCICIO excluir personagens com a forca entre 15 e 20 
DELETE FROM personagens WHERE forca BETWEEN 15 AND 20
--------------------------------------

