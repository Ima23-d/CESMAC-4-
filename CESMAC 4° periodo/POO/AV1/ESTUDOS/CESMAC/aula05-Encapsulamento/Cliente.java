public class Cliente{

    private String nome;
    private int telefone;
    private String email;
    private String cargo;
    private double salario;

    public Cliente(String nome,int telefone,String email,String cargo, double salario){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email; 
        this.cargo = cargo;
        this.salario = salario;
    }

     // Encapsulamento - Getters e Setters

    //Nome
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // Telefone
    public int getTelefone(){
        return telefone;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    //email
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

   // cargo
   public String getCargo(){
        return cargo;
   }

   public void setCargo(Stirng cargo){
        this.cargo = cargo;
   }
}