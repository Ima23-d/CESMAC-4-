create or replace procedure aumentarSalario(funcID int) as $$
declare
	valor int;
begin
	valor:=200;
	update funcionarios set salario = salario + valor where id = funcID;
end
$$ language plpgsql

call aumentarSalario(4)
