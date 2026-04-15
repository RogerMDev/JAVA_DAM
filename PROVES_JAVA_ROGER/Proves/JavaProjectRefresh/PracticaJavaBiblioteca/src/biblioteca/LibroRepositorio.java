package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LibroRepositorio {

    private final List<Libro> libros;

    public LibroRepositorio() {
        this.libros = new ArrayList<>();
    }

    public void guardar(Libro libro) {
        if (libro == null) {
            return;
        }

        if (existePorTitulo(libro.getTitulo())) {
            return;
        }

        libros.add(libro);
    }

    public List<Libro> obtenerTodos() {
        return new ArrayList<>(libros);
    }

    public List<Libro> obtenerDisponibles() {
        return libros.stream()
                .filter(Libro::isDisponible)
                .toList();
    }

    public Libro buscarPorTitulo(String titulo) {
        if (titulo == null) {
            return null;
        }

        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public boolean existePorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    public List<Libro> obtenerPrestados() {
        return libros.stream()
                .filter(libro -> !libro.isDisponible())
                .toList();
    }
}
