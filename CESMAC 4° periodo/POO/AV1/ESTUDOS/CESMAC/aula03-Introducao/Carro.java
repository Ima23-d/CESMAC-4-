public class Carro{
    
    // ATRIBUTOS
    private String modelo;
    private int velocidade;
    private boolean ligado;
    
    // CONSTRUTOR
    public Carro(String modelo, int velocidade){
        this.modelo = modelo; // instacniando o atributo modelo com o valor passado no parametro
        this.velocidade = velocidade;
        this.ligado = false;
    }
    
    // METODO ACELERAR
    public void acelerar(){
        if(velocidade == 0){
            System.out.println("Não e possivel acelerar");
        }else{
            velocidade+=10;
        }
    }

    // METODO FREAE
    public void frear(){
        if(velocidade == 0){
            System.out.println("Não é possivel mas frear");
        }else{
            velocidade-=10;
        }
    }
    
    // METODO LIGAR
    public boolean ligar(){
        return ligado = true;
       
    }
    
    // METODO DESLIGAR
    public boolean desligar(){
        if(velocidade == 0){
            return ligado = false;
        }else{
            System.out.println("Não é possivel desligar");
            System.out.println("Carro Ligado");
        }
    return false;
    }
    
    // METODO INFO
    public void info(){
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Ligado: " + ligado);
    }
    
    
    
    
    
}