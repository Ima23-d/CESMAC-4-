public class Carro extends Veiculo {
    public Carro(String placa) {
        super(placa);
    }

    @Override
    public double calcularTarifa(int horas) {
        return horas * 5.0;
    }
}