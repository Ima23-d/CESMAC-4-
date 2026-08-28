public class CarroEsportivo extends Carro {
    
    private boolean modoEsportivo;

    public CarroEsportivo(String marca, String cor, int ano, int velocidade) {
        super(marca, cor, ano, velocidade);
        this.modoEsportivo = false;
    }

    public void ativarModoEsportivo() {
        if (!modoEsportivo) {
            this.modoEsportivo = true;
            this.velocidade += 100; 
            System.out.println("Modo Esportivo ATIVADO! +100 km/h");
        } else {
            this.modoEsportivo = false;
            System.out.println("Modo Esportivo DESATIVADO!");
        }
    }

    @Override
    public String toString() {
     
        return "CarroEsportivo{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                ", modoEsportivo=" + modoEsportivo +
                '}';
    }
}