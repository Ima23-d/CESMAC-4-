// 1. CLASSE PAI (Superclasse)
class Animal {
    
    // protected: acessível dentro do mesmo pacote e por subclasses
    protected String nome;
    protected int idade;
    
    // Construtor da classe pai
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos genéricos que todas as filhas herdam
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }

}

class Cachorro extends Animal{

    private String raca;
    private String cor;

    public Cachorro(String nome, int idade, String raca, String cor){
        super(nome,idade);
        this.raca = raca;
        this.cor = cor;
    }

    @Override // Polimorfismo: Sobrescrevendo o método da classe pai
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    @Override// Polimorfismo: Sobrescrevendo o método da classe pai
    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }

    public void info(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Raça: "+raca);
        System.out.println("Cor: "+cor);
    }
}

// 3. CLASSE FILHA (Subclasse) - Gato
class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }
}