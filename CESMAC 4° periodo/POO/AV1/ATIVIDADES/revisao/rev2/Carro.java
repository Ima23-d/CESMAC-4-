public class Carro{

    private String marca;
    private String cor;
    private int ano;
    private int velocidade;

    public Carro(String marca, String cor, int ano,) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public Carro(String marca, String cor){
        this.marca = marca;
        this.cor = cor;
    }

    // Encapsulamento
    public void getMarca(String marca){
        this.marca = marca;
    }

    public String setMarca(){
        return marca;
    }

    public void getCor(String cor){
        this,cor = cor;
    }

    public String setCor(){
        reutrn cor;
    }

    public void getAno(int ano){
        this.ano = ano;
    } 

    public int setAno(){
        return ano;
    }

    public void getVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public int setVelocidade(){
        return velocidade;
    }

//////////////////////////////////////////////////////////////
    public void acelerar(){
        velocidade+=10;
    }

    public void frear(){
        if(velocidade == 0){
            System.out.println("Não é possivel frear");
            
        }else{
            velocidade-=10;
            }
    }

    public void pintar(String cor){
        this.cor = cor;
    }

    public boolean seminovo(int ano){
        if(ano >= 2020){
            return true;
        }else{
            return false;
        }
    }

    public void info(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }


}