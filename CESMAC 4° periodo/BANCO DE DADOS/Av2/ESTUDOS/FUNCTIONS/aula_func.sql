
--Sintaxe function
create or replace function [nomeFuncao]
returns [tipoRetorno] as $$
begin
    [codigo sql]
end
$$ language plpgsql;

select nomeFuncao([parametros]);
----------------------------------------------

-- Exemplo
CREATE OR REPLACE FUNCTION HELLOWORLD()
RETURNS VARCHAR AS $$
BEGIN
	RETURN 'HELLO WORLD';
END
$$ LANGUAGE PLPGSQL;

TEXTO:= HELLOWORLD();

SELECT HELLOWORLD();
----------------------------------------------