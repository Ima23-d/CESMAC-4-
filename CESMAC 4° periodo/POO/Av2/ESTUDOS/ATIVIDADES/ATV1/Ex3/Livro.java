public class Livro extends ItemBiblioteca {
    public Livro(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 3.0;
    }
}