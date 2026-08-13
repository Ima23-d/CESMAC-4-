public class Main {
    public static void main(String[] args) {
        
        // Pessoa 1
        Pessoa p1 = new Pessoa("Arthur", 19, "Maceió", "Ciência de dados", "Masculino");
        p1.exibirInformacoes();
        p1.pensar();
        
        // Pessoa 2
        Pessoa p2 = new Pessoa("João",32,"Maceió","Policial","Masculino");
        p2.exibirInformacoes();
        p2.pensar();
    }
}