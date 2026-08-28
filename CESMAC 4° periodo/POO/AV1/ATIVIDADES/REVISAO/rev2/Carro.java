public class Carro {

    protected String marca;
    protected String cor;
    protected int ano;
    protected int velocidade;


    public Carro(String marca, String cor, int ano, int velocidade) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public void acelerar() {
        velocidade += 10;
    }

    public void frear() {
        if (velocidade <= 0) {
            System.out.println("Não é possível frear (carro parado)");
        } else {
            velocidade -= 10;
        }
    }

    public void pintar(String cor) {
        this.cor = cor;
    }


    public boolean semiNovo() {
        return this.ano >= 2020;
    }
    
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }
}