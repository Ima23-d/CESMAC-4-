/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main{
    public static class Cubo{
        
        public double valor;
        
        public Cubo(double valor){
            this.valor = valor;
        }
        
        public double calcular(){
            double result = this.valor * this.valor * this.valor;
            return result;
        }
    }
    
	public static void main(String[] args) {
		Cubo c = new Cubo(6);
		System.out.println(c.calcular());
	}
}