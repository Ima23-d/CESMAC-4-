-- Junção de tabelas 
-- Comandos JOINS:
    INNER JOIN
    CROSS JOIN
    LEFT JOIN/ LEFT OUTER JOIN
    RIGHT JOIN/ RIGHT OUTER JOIN
    FULL JOIN/ FULL OUTER JOIN
--------------------------------------------

-- INNER JOIN
-- Permite juntas duas tabelas de modo que cada linha de uma tabela seja unida a linha de outra
-- SELECT <campos> FROM tabela INNER JOIN tabela2 ON <condicao_de_juncao>
-- -- EX
select livros.titulo, categoria.nome from livros inner join categoria
on livros.categoria_id = categoria.id

-- -- Livros      | nome
-- -- IT       | Ficcao
-- -- harrypotter / Romance
-- -- Codigo Da Vinci / Ficcao
--------------------------------------------

-- Usando o Alias
select l.titulo, c.nome from livros l inner join categoria c
on l.categoria_id = c.id
--------------------------------------------

-- Exercicio
select alunos.nome, notas.nota1, notas.nota2, notas.nota3 from alunos a inner join notas n 
on a.id = n.aluno_id where a.ativo = 1
--------------------------------------------

-- CROSS JOIN
-- não usa o on 
SELECT <campo> from tabela CROSS JOIN tabela2
-- EX
select l.titulo, c.nome from livros l cross join categoria c
-- -- Livros      | nome
-- -- IT       | Ficcao
-- -- harrypotter / Romance
select l.titulo, c.nome from livros l cross join categoria c 
where l.categoria = c.id
--------------------------------------------

-- Exercicio
select a.nome, n.nota1, n.nota2, n.nota3 from alunos a cross join notas n 
where a.id = n.aluno_id and a.ativo = 1
--------------------------------------------

-- LEFT JOIN/ LEFT OUTER JOIN
-- Retorna todas as linhas da tabela da esquerda e as linhas correspondentes da tabela da direita
select <campo> from tabela1 left join tabela 2 on <condicao de juncao>
-- ex
select l.titulo, c.nome from livros l left join categoria c
on l.categoria_id = c.id 
--------------------------------------------

-- Right JOIN/ RIGHT OUTER JOIN
-- Retorna todas as linhas da tabela da direita e as linhas correspondentes da tabela da esquerda   
select <campo> from tabela1 right join tabela2 
on <condicao de juncao>
-- ex
select l.titulo, c.nome from livros l right join categorias c
on l.categoria_id = c.id 
--------------------------------------------

-- FULL JOIN/ FULL OUTER JOIN
-- Retorna todas as linhas quando há uma correspondência em uma das tabelas
select <campo> from tabela1 full join tabela2
on <condicao>
-- ex
select l.titulo, c.nome from livros l full join categorias c 
on l.categoria_id = c.id
--------------------------------------------

-- Exercercico
select a.nome, n.nota1,n.nota2,n.nota3 from alunos a left join notas n 
on a.id = n.aluno_id
--------------------------------------------