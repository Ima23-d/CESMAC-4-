class Pessoa {
    
    private String nome;
    private int idade;
    private String cidade;
    private String profissao;
    private String sexo;

    public Pessoa(String nome, int idade, String cidade, String profissao, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.profissao = profissao;
        this.sexo = sexo;
    }

    public void exibirInformacoes() {
        System.out.println("____INFORMAÇÕES____");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Profissão: " + this.profissao);
        System.out.println("Sexo: " + this.sexo);
    }
    
    public void pensar(){
        System.out.println(this.nome + ", Está pensando em correr a tarde");
    }

}
