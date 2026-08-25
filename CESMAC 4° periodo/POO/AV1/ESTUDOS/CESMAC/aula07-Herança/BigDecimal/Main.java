
public class Main {
    public static void main(String[] args) {
       CalcularLucro cl = new CalcularLucro(new BigDecimal("1000.00"), new BigDecimal("700.00"));
       System.out.println("Lucro: " + cl.calcularLucro());
    }
}