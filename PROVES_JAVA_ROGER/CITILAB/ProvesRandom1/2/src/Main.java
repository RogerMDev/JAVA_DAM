public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro("1984", "George Orwell", "123ABC", 3);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", "456DEF", 2);

        // Añadir libros a la biblioteca
        biblioteca.anadirLibroNuevo(libro1);
        biblioteca.anadirLibroNuevo(libro2);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Roger", 1);
        Usuario usuario2 = new Usuario("Anna", 2);

        // Registrar usuarios en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Realizar un préstamo
        biblioteca.registrarPrestamo(usuario1, libro1);

        // Ver libros prestados por Roger
        usuario1.verLibrosPrestadosActualmente();

        // Renovar préstamo de Roger
        Prestamo prestamoRenovar = new Prestamo(usuario1, libro1); // OJO: este es uno "nuevo"
        biblioteca.renovarPrestamo(prestamoRenovar, 7); // Este no funcionará si se crea así (ver nota abajo)

        // Registrar devolución
        biblioteca.registrarDevolucion(usuario1, libro1);

        // Ver disponibilidad después de devolver
        biblioteca.mostrarLibrosDisponibles();
    }
}

