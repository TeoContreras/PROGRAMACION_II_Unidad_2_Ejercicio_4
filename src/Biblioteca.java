public class Biblioteca {
    public ComprobantePrestamo prestarLibro(Libro libro, Socio socio) {
        if (libro.estaDisponible()) {
            libro.setDisponible(false);
            System.out.println("La biblioteca aprobó el préstamo.");
            return new ComprobantePrestamo(libro, socio);
        }
        System.out.println("Préstamo rechazado: el libro no está disponible.");
        return null;
    }
}
