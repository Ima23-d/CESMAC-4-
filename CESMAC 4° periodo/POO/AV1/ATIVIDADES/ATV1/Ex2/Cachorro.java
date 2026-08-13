class Cachorro{
    
    private String nome;
    private int idade;
    private String raca;
    private String sexo;
    private String cor;
    
    public Cachorro(String nome, int idade, String raca, String sexo, String cor){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
    }
    
    public void exibirInformacoes() {
        System.out.println("____INFORMAÇÕES____");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade(ano): " + this.idade);
        System.out.println("Raça: " + this.raca);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Cor: " + this.cor);
    }
    
    public void acao(){
        System.out.println(this.nome + ", Vai passear hoje");
    }
}