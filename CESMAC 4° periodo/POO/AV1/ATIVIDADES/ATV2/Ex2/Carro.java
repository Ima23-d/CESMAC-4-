class Carro{
    
    private String modelo;
    private int velocidade;
    private boolean ligado;
    
    public Carro(String modelo, int velocidade, boolean ligado){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }
    
    public void acelerar(){
        this.velocidade +=10;
    }
    
    public void frear(){
        this.velocidade -=10;
    }
    
    public void ligado(){
        if(!this.ligado){
            this.ligado = true;
        }
    }
    
    public void desligado(){
        if(this.velocidade == 0){
            if(this.ligado){
                this.ligado = false;
            }
        }
    }
    
    public void exibirInformacoes() {
        System.out.println("____INFORMAÇÕES____");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Ligado: " + this.ligado);
    }

}