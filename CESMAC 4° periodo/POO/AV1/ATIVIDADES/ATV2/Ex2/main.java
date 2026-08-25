class Main {
    public static void main(String[] args) {

        Carro c = new Carro("FORD", 5, true);
        c.acelerar();
        c.exibirInformacoes();

        c.frear();
        c.exibirInformacoes();

        c.acelerar();
        c.ligar();
        c.desligar();
        c.exibirInformacoes();
    }
}