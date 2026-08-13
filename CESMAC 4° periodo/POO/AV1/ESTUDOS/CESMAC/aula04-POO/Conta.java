public class Conta{

    private double saldo;
    private String agencia;
    private Integer numero;


    public Conta(double saldo, String agencia, Integer numero){
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }

    public boolean sacar(double valor){
        if(valor >= 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }
    return false;
    }

    public void depositar(double valor){
        if(valor >= 0){
            saldo += valor;
        }
    }

    public void transferir(Conta c, double valor){
        if(valor >= 0 && valor <= saldo){
            boolean valorSacado =  sacar(valor);
            if(valorSacado){
                c.depositar(valor);
            }
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);

    }   

}