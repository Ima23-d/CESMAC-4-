public class Main {
    public static void main(String[] args) {

        Carro c = new Carro("FORD", 5);
        c.acelerar();
        System.out.println(c);
        c.frear();
        System.out.println(c);

        c.acelerar();
        c.ligar();
        c.desligar();
        System.out.println(c);
    }
}