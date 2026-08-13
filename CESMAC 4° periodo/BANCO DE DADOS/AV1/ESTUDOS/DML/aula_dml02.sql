-- SUM(Soma todos os valores)
SELECT SUM(forca) as total_forca FROM personagens
total_forca
---------------------------------

-- MAX retorna o mair valor
SELECT max(forca) as maior_forca FROM personagens
 maior_forca
---------------------------------

-- MIN retorna o menor valor
SELECT min(forca) as menor_forca FROM personagens
menor_forca
---------------------------------

-- AVG retorna a media dos valores
SELECT avg(forca) as media_forca FROM personagens
media_forca
---------------------------------

-- COUNT retorna o total de linhas
SELECT count(personagem) as total_personagem FROM personagens
total_personagem
---------------------------------

-- EXERCICIO: retorna a media de forca de guerreiros
select round(avg(forca),2) from personagens
WHERE classe_id = 1
---------------------------------

-- GROUP BY agrupar valores com a soma de forca
SELECT personagem, sum(forca) as total_forca FROM personagens GROUP BY personagem
ORDER BY total_forca DESC -- ordenando da maior forca para a menor
---------------------------------

-- EXERCICIO
SELECT classe_id, round(avg(hp),2) as media_total_hp FROM personagens GROUP BY classe_id
---------------------------------

-- HAVING filtro como o WHERE
SELECT classe_id, round(avg(forca),2) as media_total_forca FROM personagens GROUP BY classe_id
HAVING round(avg(forca),2) > 25 -- exibe a media de forca maior que 25
ORDER BY classe_id
---------------------------------

-- EXERCICIO
select classe_id, round(avg(hp),2) as media_total_hp from personagens group by classe_id
HAVING round(avg(hp),2) > 50
order by classe_id
---------------------------------




























