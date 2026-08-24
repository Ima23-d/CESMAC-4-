package modulo;

public class Produto {
  
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome; 
        this.preco = preco; 
        this.estoque = estoque; 
    }

    // Encapsulamento - Getters e Setters
    
    // Nome
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    // Preço
    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    
  
    
    // Estoque
    public int getEstoque(){
        return estoque;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
   
    
    public void aplicarDesconto() {
        this.preco -= 10; 
    }

    public void reduzirEstoque() {
        this.estoque -= 1; 
    }
    
    public void exibirInformacoes() {
        System.out.println("____INFORMAÇÕES____");
        System.out.println("Produto: " + this.nome);  
        System.out.println("Preço: " + this.preco); 
        System.out.println("Estoque: " + this.estoque); 
    }
}





