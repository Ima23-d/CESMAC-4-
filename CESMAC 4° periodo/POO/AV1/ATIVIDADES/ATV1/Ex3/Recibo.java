class Recibo {

    private int numero;
    private double valor;
    private String recebedor;
    private String pagador;
    private String descricao;

    public Recibo(int numero, double valor, String recebedor, String pagador, String descricao) {
        this.numero = numero;
        this.valor = valor;
        this.recebedor = recebedor;
        this.pagador = pagador;
        this.descricao = descricao;
    }


    public void emitirRecibo() {
        System.out.println("==========================================");
        System.out.println("RECIBO Nº: " + this.numero);
        System.out.println("VALOR: R$ " + String.format("%.2f", this.valor));
        System.out.println("------------------------------------------");
        System.out.println("Recebi de: " + this.pagador);
        System.out.println("A quantia de: R$ " + String.format("%.2f", this.valor));
        System.out.println("Referente a: " + this.descricao);
        System.out.println("Emitido por: " + this.recebedor);
        System.out.println("==========================================\n");
    }

 
    public boolean validarRecibo() {
        if (this.valor > 0 && this.recebedor != null && !this.recebedor.isEmpty() && this.pagador != null && !this.pagador.isEmpty()) {
            System.out.println("Recibo Nº " + this.numero + " VÁLIDO.");
            return true;
        } else {
            System.out.println("Recibo Nº " + this.numero + " INVÁLIDO.");
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}