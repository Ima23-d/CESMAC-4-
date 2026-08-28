public class Produto{

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void aplicarDesconto(){
        if(preco == 0 || preco <=10){
            System.out.println("Não é possivel aplicar desconto");
        }else{
            this.preco = preco-10;
        }
    }

    public void reduzirEstoque(){
        if(estoque == 0){
            System.out.println("Não é possivel reduzir estoque");
        }else{
            this.estoque = estoque-1;
        }
    }

    public String toString(){
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}
