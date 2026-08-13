public class Main
{
    public static void main(String[] args) {
        Conta c1 = new Conta(1000.0, "001", 12345);
        c1.depositar(500.0);
        c1.sacar(200.0);
        c1.transferir(100, new Conta(0.0, "002", 67890));   
        c1.exibirSaldo();
    }
}