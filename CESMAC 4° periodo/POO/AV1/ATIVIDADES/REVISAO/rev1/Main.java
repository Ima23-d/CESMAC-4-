public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Criando o primeiro carro (Construtor Completo) ---");
   
        Carro carro1 = new Carro("Toyota", "Preto", 2022, 50);
        System.out.println(carro1.toString());

        System.out.println("\n--- Testando Métodos no Carro 1 ---");

        System.out.println("É seminovo? " + carro1.semiNovo());


        carro1.acelerar();
        System.out.println("Velocidade após acelerar: " + carro1.getVelocidade() + " km/h");

        carro1.pintar("Azul");
        System.out.println("Nova cor: " + carro1.getCor());

        
        System.out.println("\n--------------------------------------------------");
        System.out.println("--- Criando o segundo carro (Construtor Parcial) ---");

        Carro carro2 = new Carro("Fiat", "Branco");
        

        carro2.setAno(2018);
        System.out.println(carro2.toString());

        System.out.println("\n--- Testando Métodos no Carro 2 ---");
        System.out.println("É seminovo? " + carro2.semiNovo());

 
        System.out.print("Tentando frear parado: ");
        carro2.frear();


        carro2.acelerar();
        System.out.println("Velocidade após acelerar: " + carro2.getVelocidade() + " km/h");
        
        carro2.frear();
        System.out.println("Velocidade após frear: " + carro2.getVelocidade() + " km/h");
    }
}