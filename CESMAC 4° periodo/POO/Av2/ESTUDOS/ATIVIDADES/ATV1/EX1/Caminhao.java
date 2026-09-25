public class Caminhao extends Veiculo {
    public Caminhao(String placa) {
        super(placa);
    }

    @Override
    public double calcularTarifa(int horas) {
        return horas * 10.0;
    }
}