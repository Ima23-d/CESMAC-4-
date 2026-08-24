public class Funcionario{

    private String nome;
    private int telefone;
    private String email;
    private String profissao;

    public Funcionario(String nome,int telefone,String email, String profissao){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email; 
        this.profissao = profissao;
    }

    // Encapsulamento - Getters e Setters

    //Nome
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // Telefone
    public int getTelefone(){
        return telefone;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    //email
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //profissao
    public String getProfissao(){
        return profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }   
}