import modulo.Biscoito, modulo.Cadeira;

public class Main{
	public static void main(String[] args) {
		Biscoito b1 = new Biscoito("Chocolate", 2.50, 10);
        Cadeira c1 = new Cadeira("Madeira", 150.00, 5, 100.0, 50.0, 80.0);

        System.out.println(b1);
        System.out.println(c1);
        System.out.println("Área da cadeira: " + c1.area());

	}
}