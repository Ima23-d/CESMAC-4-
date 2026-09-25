public class DVD extends ItemBiblioteca {
    public DVD(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 8.0;
    }
}