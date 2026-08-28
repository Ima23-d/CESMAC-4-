public class Pessoa{
    
    private String nome;
    private int idade;
    private String cidade;
    private String profissao;
    private String sexo;
    
    public Pessoa(String nome, int idade, String cidade, String profissao, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.profissao = profissao;
        this.sexo = sexo;
    }
    
    public void acao(){
        System.out.println(nome + " Vai correr hoje");
    }
    

    public String toString(){
        return "Nome:\n " + nome
        + "\nIdade:\n " + idade
        + "\nCidade\n "+cidade
        + "\nProfissão\n "+profissao
        + "\nSexo\n "+sexo;
    }
}