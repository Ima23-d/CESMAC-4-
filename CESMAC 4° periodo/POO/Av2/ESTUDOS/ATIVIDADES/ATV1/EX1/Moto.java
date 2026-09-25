public class Moto extends Veiculo {
    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double calcularTarifa(int horas) {
        return horas * 3.0;
    }
}