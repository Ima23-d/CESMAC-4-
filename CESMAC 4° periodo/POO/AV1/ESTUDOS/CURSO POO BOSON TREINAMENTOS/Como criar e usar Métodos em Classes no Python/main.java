/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main{
    public static class Gato{

        public String nome;
        public String cor;
        public int idade;

        public Gato(Stirng nome,String cor, int idade){
            this.nome = nome;
            this.cor = cor;
            this.idade = idade;
        }

        public int peso_gato(int peso){
            this.peso = peso;
            if (this.peso > 5.0){
                System.out.println("Esta gordo");
            } else if (this.peso > 3.5){
                System.out.println("Ideal");
            } else {
                System.out.println("O animal esta abaixo do peso");
            }       
            return this.peso;
        }

        

            }
        }

    }
    
	public static void main(String[] args) {
		Gato g = new Gato();
        System.out.println("Nome do gato: " + g.nome);
        System.out.println("Peso do gato: " + g.peso_gato(4.0)); 
	}
}