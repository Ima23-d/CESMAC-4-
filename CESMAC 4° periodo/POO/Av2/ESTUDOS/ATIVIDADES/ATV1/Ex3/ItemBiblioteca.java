public abstract class ItemBiblioteca {
    private String titulo;

    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract double calcularMulta(int diasAtraso);
}