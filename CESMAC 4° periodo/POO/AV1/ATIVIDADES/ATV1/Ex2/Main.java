public class Main {
	public static void main(String[] args) {
	    
	    // Cão 1
		Cachorro c1 = new Cachorro("BOB",1,"Golden","Amarelo","Masculino");
		System.out.println(c1);
		c1.acao();
		
		// Cão2
	    Cachorro c2 = new Cachorro("Luke",10,"Caramelo","Amarelo","Masculino");
	    System.out.println(c2);
	    c2.acao();
	}
}