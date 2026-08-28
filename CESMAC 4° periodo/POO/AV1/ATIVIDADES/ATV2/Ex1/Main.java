public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("TV", 1500, 7);
        
        p1.aplicarDesconto();
        p1.reduzirEstoque();
        System.out.println(p1);
        
    }
}