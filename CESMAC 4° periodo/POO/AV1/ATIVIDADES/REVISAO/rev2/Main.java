public class Main {
    public static void main(String[] args) {

        CarroEsportivo ferrari = new CarroEsportivo("Ferrari", "Vermelha", 2023, 120);

        System.out.println("--- Estado Inicial ---");
        System.out.println(ferrari);

        System.out.println("\n--- Ativando Modo Esportivo ---");
        ferrari.ativarModoEsportivo();
        System.out.println(ferrari);

        System.out.println("\n--- Desativando Modo Esportivo ---");
        ferrari.ativarModoEsportivo();
        System.out.println(ferrari);
    }
}