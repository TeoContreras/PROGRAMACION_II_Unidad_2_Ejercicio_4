public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry");
        Socio socio1 = new Socio("Ana", 101);
        Socio socio2 = new Socio("Juan", 102);

        ComprobantePrestamo comprobante = biblioteca.prestarLibro(libro, socio1);
        if (comprobante != null) comprobante.mostrar();

        biblioteca.prestarLibro(libro, socio2);
    }
}
