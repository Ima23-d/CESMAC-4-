-- -- CRIANDO UMA PROCEDURE
create or replace procedure [nome da procedure] ([Parametro])
as $$

  declare
    [Variaveis opcionais]

  begin
    [comando]
  end
$$ 
language plpgsql;
------------------------------------------------------------

-- CALL
para execultar comandos usamos o call 
CALL nomeProcedure();
------------------------------------------------------------

--EXEMPLO
create or replace procedure procTest() as $$
begin

    -- insere um valor teste
    insert into teste values('Arthur');
end
$$ language plpgsql

-- execultar procedure
call procTest();
------------------------------------------------------------

-- EXERCICIO
create or replace procedure aumentarTaxa() as $$
begin
  update taxas set inss = inss + 1.5;
end
$$
language plpgsql;

Execultar procedure
CALL aumentarTaxa();
------------------------------------------------------------

-- Procedure Parametro
create or replace procedure pessoa(idade int, nome varchar......)
------------------------------------------------------------

-- EXERCICIO
create or replace procedure aumentarSalario(funcID number, valor number) as $$
begin 
  update funcionarios set salario = salario + valor where id= funcID;
end
$$ language plpgsql
------------------------------------------------------------

-- DECLARANDO VARIAVEIS 
create procedure nomeProc() as $$ 
declare
      variavel1 int := 10;
      variavel2 varchar(200);
begin
      variavel2 := 'Carlos';
end
$$ language plpgsql
------------------------------------------------------------

-- EXERCICIO
create or replace procedure aumentarSalario(int) as $$
declare
    valor int;
begin
    valor := 200;
    update funcionarios set salario = salario + valor where id = $1;
end
$$ language plpgsql
------------------------------------------------------------

-- Recuperando um valor
create or replace procedure nomeProc() as $$
declare
    nomeUsuario varchar(200);
begin
    select nome into nomeUsuario from usuarios where id = 1;
end
$$ language plpgsql;
------------------------------------------------------------

-- EXERCICIO
create or replace procedure aumentarSalario(integer) as $$
declare
  valor int;
begin
    select valor into valor from aumento;
    update funcionarios set salario = salario + valor where id = $1;
end 
$$ language plpgsql;

