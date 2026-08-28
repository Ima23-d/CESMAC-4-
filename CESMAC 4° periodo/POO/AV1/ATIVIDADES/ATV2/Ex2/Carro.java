public class Carro {

    private String modelo;
    private int velocidade;
    private boolean ligado;

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.ligado = false;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        if (this.velocidade >= 10) {
            this.velocidade -= 10;
        } else {
            this.velocidade = 0;
        }
    }

    public void ligar() {
        this.ligado = true;
    }

    public String desligar() {
        if (this.velocidade == 0) {
            this.ligado = false;
            return "Carro desligado.";
        }
        return "Carro ligado.";
    }

    public String toString(){
        return "Modelo\n "+modelo
                +"\nVelocidade\n "+velocidade
                +"\nLigado\n "+ligado;
    }
}