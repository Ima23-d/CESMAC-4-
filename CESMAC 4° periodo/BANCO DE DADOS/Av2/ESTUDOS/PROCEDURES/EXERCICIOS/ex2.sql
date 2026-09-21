create or replace procedure aumentarSalario(funcID numeric, valor numeric) as $$
begin 
	update funcionarios set salario =  salario + valor where id = funcID;
end
$$ language plpgsql;

call aumentarSalario(4,200);
