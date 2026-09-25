import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<ItemBiblioteca> itens = new ArrayList<>();
        itens.add(new Livro("Dom Casmurro"));
        itens.add(new Revista("National Geographic"));
        itens.add(new DVD("Inception"));

        int diasAtraso = 5;
        double totalMultas = 0;

        for (ItemBiblioteca item : itens) {
            double multa = item.calcularMulta(diasAtraso);
            totalMultas += multa;
            System.out.println("Item [" + item.getClass().getSimpleName() + "] Título: " + item.getTitulo() + " -> Multa: R$ " + multa);
        }

        System.out.println("Total devido em multas: R$ " + totalMultas);
    }
}