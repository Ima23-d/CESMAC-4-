create or replace function maiorSalario()
returns int as $$
declare
	maxSal int;
begin
	select max(salario) into maxSal from funcionarios;
end
$$ language plpgsql;

select maiorSalario();