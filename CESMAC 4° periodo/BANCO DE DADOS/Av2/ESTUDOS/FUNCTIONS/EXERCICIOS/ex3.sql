create or replace function usuariosExcluidos()
returns setof usuarios as $$
begin
	return query select*from usuarios where excluido = true;
end
$$ language plpgsql;

select usuariosExcluidos()