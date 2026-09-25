import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new ContaPoupanca());
        contas.add(new ContaCorrente());
        contas.add(new ContaInvestimento());

        double rendimentoTotal = 0;

        for (Conta c : contas) {
            double rendimento = c.calcularRendimento();
            rendimentoTotal += rendimento;
            System.out.println("Conta [" + c.getClass().getSimpleName() + "] -> Rendimento: R$ " + rendimento);
        }

        System.out.println("Rendimento total dos clientes: R$ " + rendimentoTotal);
    }
}