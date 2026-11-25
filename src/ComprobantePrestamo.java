public class ComprobantePrestamo {
    private Libro libro;
    private Socio socio;

    public ComprobantePrestamo(Libro libro, Socio socio) {
        this.libro = libro;
        this.socio = socio;
    }

    public void mostrar() {
        System.out.println("Préstamo confirmado: " + libro.getTitulo()
                + " para " + socio.getNombre());
    }
}
