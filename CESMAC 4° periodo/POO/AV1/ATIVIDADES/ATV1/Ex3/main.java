public class Main {

    public static void main(String[] args) {

        // Instância 1 
        Recibo r1 = new Recibo(
            1,
            1530.50,
            "João Francisco Mendes Rocha Azevedo",
            "Maria Francisca Mendes Rocha Azevedo",
            "Pagamento do aluguel do mês de Maio de 2018"
        );

        // Instância 2
        Recibo r2 = new Recibo(
            2,
            850.00,
            "Carlos Eduardo Silva",
            "Ana Beatriz Santos",
            "Prestação de serviços de manutenção elétrica"
        );


        r1.validarRecibo();
        r1.emitirRecibo();


        r2.validarRecibo();
        r2.emitirRecibo();
    }
}