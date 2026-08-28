class Biscoito extends Produto{

    private String sabor;

    public Biscoito(String nome, double preco, int estoque,String sabor){
        super(nome,preco,estoque);
        this.sabor = sabor;
    }

    //Polimorfismo de sobreposição
    @Override
    public String toString(){
        return "Biscoito " + "Nome:\n " + nome + "\nPreço:\n " + preco + "\nEstoque:\n " + estoque + "\nSabor:\n " + sabor;
    }
}