public class Cachorro{
    
    private String nome;
    private int idade;
    private String raca;
    private String cor;
    private String sexo;
    
    public Cachorro(String nome, int idade, String raca, String cor, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
    }
    
    public void acao(){
        System.out.println(nome + " Vai comer hoje");
    }
    

    public String toString(){
        return "Nome:\n " + nome
        + "\nIdade:\n " + idade
        + "\nRaça\n "+raca
        + "\nCor\n "+cor
        + "\nSexo\n "+sexo;
    }
}