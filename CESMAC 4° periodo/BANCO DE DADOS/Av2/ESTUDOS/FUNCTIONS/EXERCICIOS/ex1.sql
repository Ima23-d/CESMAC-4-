create or replace function soma(int ,int)
returns int as $$
begin
	return $1 + $2;
end
$$ language plpgsql;

select soma(2,2);


create or replace function maiorSalario()
returns int as $$
declare
    maxSal int;
begin
    select max(salario) into maxSal from funcionarios;
    return maxSal;
end
$$ language plpgsql