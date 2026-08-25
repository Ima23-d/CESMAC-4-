class Cadeira extends Produto{
    
    private double comprimento;
    private double largura;
    private double altura;
    
    public Cadeira(String nome, double preco, int estoque, double comprimento, double  largura, double  altura){
        super(nome,preco,estoque);
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public double area(){
        return comprimento * largura;
    }
    
    @Override
    public String toString(){
        return "Nome:\n " + nome
        + "\nPreço:\n " + preco 
        + "\nEstoque\n "+estoque 
        + "\nComprimento\n "+comprimento 
        + "\nAltura\n "+altura 
        + "\nLargura\n "+largura;
    }
}