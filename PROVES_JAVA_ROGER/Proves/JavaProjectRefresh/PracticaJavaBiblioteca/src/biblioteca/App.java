package biblioteca;

import java.util.List;

public class App {
    public static void main(String[] args) {
        LibroService servicio = new LibroService(new LibroRepositorio());

        servicio.registrarLibro("1984", "George Orwell");
        servicio.registrarLibro("Dune", "Frank Herbert");
        servicio.registrarLibro("El Hobbit", "J.R.R. Tolkien");
        servicio.registrarLibro("Fundacion", "Isaac Asimov");

        servicio.prestarLibro("Dune");
        servicio.prestarLibro("Fundacion");
        servicio.prestarLibro("Ave maria");

        System.out.println("Todos los libros:");
        for (Libro libro : servicio.obtenerTodos()) {
            System.out.println(libro.mostrarInfo());
        }

        List<String> disponibles = servicio.obtenerDisponibles().stream()
                .map(Libro::mostrarInfo)
                .toList();

        System.out.println("\nLibros disponibles:");
        System.out.println(disponibles);
    }
}
