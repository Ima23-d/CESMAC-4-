

public class Main{
   public static class Gato{

        public String nome;
        public String cor;
        public int idade;

       public Gato(String nome,String cor, int idade){
            this.nome = nome
            this.cor = cor
            this.idade = idade
       }
   }
	public static void main(String[] args) {
        Gato gato = new Gato("Mingau", "Cinza", 2);
        System.out.println("Nome do gato: " + gato.nome);
		
	}
}