-- EXIBIR TABELA COMPLETA PERSONAGENS
SELECT*FROM personagens
----------------------------

-- FILTRAR PERSONAGENS COM A FORÇA MAIOR QUE 30
SELECT personagem, forca FROM personagens
WHERE forca > 30
----------------------------

-- FILTRAR ID maior que 3 ou diferente que 3
SELECT classe_id FROM personagens
WHERE classe_id > 3 OR classe_id !=3
----------------------------

-- USANDO O BETWEEN
SELECT forca FROM personagens
WHERE forca BETWEEN 20 AND 40 -- FILTRANDO A FORÇA ENTRE 20 e 40
----------------------------

-- OUTRA FORMA DE FAZER USANDO O WHERE
SELECT forca FROM personagens
WHERE forca >=20 AND forca <=40 -- FILTRANDO A FORÇA ENTRE 20 e 40
----------------------------

-- EXERCICIO
SELECT personagem,mp FROM personagens
WHERE classe_id = 2 AND mp BETWEEN 40 AND 70 -- VAI EXIBIR OS MAGOS COM O MP ENTRE 40 E 70
----------------------------

-- CONDICAO LIKE
SELECT personagem FROM personagens
WHERE personagem LIKE '%Adele%' -- Exibi os Personagens que começa com a letra A e letra A maisuculo
WHERE personagem ILIKE '%ADelE%' -- EXibi tanto letra A quanto letra a
----------------------------

-- EXERCICIO
SELECT personagem FROM personagens
WHERE personagem ILIKE '%M%' -- Busca todos os personagens com a letra M ou m
----------------------------

-- CONDICAO IN e NOT IN 
SELECT personagem, classe_id FROM personagens
WHERE classe_id IN(1,2,3) -- Exibir a classe 1,2 e 3 
WHERE classe_id NOT IN(4,3) -- Exibir a classe 1,2
----------------------------

-- EXERCICIO
SELECT personagem,classe_id FROM personagens
WHERE classe_id in(1,3)
----------------------------

-- ORDENAÇÂO ORDER BY ASC e DESC
SELECT personagem, classe_id FROM personagens
ORDER BY classe_id ASC-- Ordena a classe dos personagens de forma crecente
----------------------------

-- LIMITAR DADOS USANDO O LIMIT
SELECT*FROM personagens LIMIT 10 -- Exibe as 10 primeiras linhas
----------------------------

-- USANDO O OFFSET
SELECT*FROM personagens OFFSET 10 -- Começa exibir apartir da linha 10
----------------------------

-- LIMIT E OFFSET
SELECT*FROM personagens OFFSET 10 LIMIT 5 -- Começa exibir apartir da linha 10 e Exibe 5 linhas