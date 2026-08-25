// 4. CLASSE PRINCIPAL (Execução)
public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Cachorro rex = new Cachorro("Rex", 3, "Labrador", "Amarelo");
        Gato mingau = new Gato("Mingau", 2);

        // Métodos herdados da classe Animal
        rex.comer();    // Rex está comendo.
        mingau.comer(); // Mingau está comendo.

        // Métodos sobrescritos (@Override)
        rex.emitirSom();    // Rex faz: Au Au!
        mingau.emitirSom(); // Mingau faz: Miau!

        // Método exclusivo da subclasse
        rex.enterrarOsso(); // Rex enterrou um osso.
        rex.info();
    }
}