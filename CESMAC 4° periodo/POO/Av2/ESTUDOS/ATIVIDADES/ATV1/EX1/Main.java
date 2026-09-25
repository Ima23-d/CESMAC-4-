import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("ABC-1234"));
        veiculos.add(new Caminhao("XYZ-5678"));
        veiculos.add(new Moto("MTO-9999"));

        int horasPermanencia = 4;
        double totalArrecadado = 0;

        for (Veiculo v : veiculos) {
            double tarifa = v.calcularTarifa(horasPermanencia);
            totalArrecadado += tarifa;
            System.out.println("Veículo [" + v.getClass().getSimpleName() + "] Placa: " + v.getPlaca() + " -> Tarifa: R$ " + tarifa);
        }

        System.out.println("Total arrecadado pelo estacionamento: R$ " + totalArrecadado);
    }
}