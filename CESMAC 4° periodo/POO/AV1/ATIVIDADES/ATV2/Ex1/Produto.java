public class Produto {
  
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome; 
        this.preco = preco; 
        this.estoque = estoque; 
    }
    

    public void aplicarDesconto() {
        this.preco -= 10; 
    }

    public void reduzirEstoque() {
        this.estoque -= 1; 
    }
    
    public String toString(){
        return "Nome\n " + nome
                + "\nPreço\n "+preco
                + "\nEstoque\n "+estoque;
    }
}





