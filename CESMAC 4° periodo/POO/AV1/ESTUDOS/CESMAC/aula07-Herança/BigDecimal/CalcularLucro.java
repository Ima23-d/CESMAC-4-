import math.BigDecimal;

public class CalcularLucro(){

    private BigDecimal faturamento;
    private BigDecimal custo;

    public CalcularLucro(BigDecimal faturamento, BigDecimal custo){
        this.faturamento = faturamento;
        this.custo = custo;
    }

    public BigDecimal calcularLucro(){
        return faturamento.subtract(custo);
    }
}