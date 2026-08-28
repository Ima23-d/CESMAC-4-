
public class Produto{

    protected String nome;
    protected double preco;
    protected int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }  
      public String toString(){
        return "Nome\n "+nome 
                +"\nPreço\n "+preco
                +"\nEstoque\n "+estoque;
    }
}
