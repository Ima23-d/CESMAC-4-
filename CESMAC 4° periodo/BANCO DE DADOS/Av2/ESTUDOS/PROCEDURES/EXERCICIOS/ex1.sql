create or replace procedure aumentarTaxa() as $$
begin 
	update taxas set inss = inss + 1.5;
end
$$ language plpgsql;

call aumentarTaxa();