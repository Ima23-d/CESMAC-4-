public class Carro {

    private String marca;
    private String cor;
    private int ano;
    private int velocidade;

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

    // --- GETTERS E SETTERS ---

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
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

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }
}