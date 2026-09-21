create or replace procedure aumentarSalario(funcID int) as $$
declare
	valor int;
begin
	select into valor from aumento;
	update funcionarios set salario = salario + valor where id = funcID;
end
$$ language plpgsql;

call aumentarSalario(2);

--------------------------------------------------------------------------
create or replace procedure aumentarSalario(int) as $$
declare
	valor int;
begin
	select into valor from aumento;
	update funcionarios set salario = salario + valor where id = $1;
end
$$ language plpgsql;

call aumentarSalario(2);