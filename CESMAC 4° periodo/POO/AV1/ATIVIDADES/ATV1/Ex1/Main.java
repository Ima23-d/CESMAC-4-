public class Main {
    public static void main(String[] args) {
        
        // Pessoa 1
        Pessoa p1 = new Pessoa("Arthur", 19, "Maceió", "Ciência de dados", "Masculino");
        System.out.println(p1);
        p1.acao();
        
        // Pessoa 2
        Pessoa p2 = new Pessoa("João",32,"Maceió","Policial","Masculino");
        System.out.println(p2);
        p2.acao();
    }
}