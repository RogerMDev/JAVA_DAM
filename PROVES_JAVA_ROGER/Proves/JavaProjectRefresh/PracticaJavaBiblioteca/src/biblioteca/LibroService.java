package biblioteca;

import java.util.List;

public class LibroService {

    private LibroRepositorio repositorio;

    public LibroService(LibroRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarLibro(String titulo, String autor) {
        if (repositorio.existePorTitulo(titulo)) {
            System.out.println("No se puede registrar un libro ya registrado");
            return;
        }

        repositorio.guardar(new Libro(titulo, autor));
    }

    public void prestarLibro(String titulo) {
        Libro libro = repositorio.buscarPorTitulo(titulo);

        if (libro == null) {
            System.out.println("Libro no encontrado");
            return;
        }

        if (!libro.isDisponible()) {
            System.out.println("El libro ya estaba prestado");
            return;
        } 
            libro.prestar();
    }

    public void devolverLibro(String titulo) {
        Libro libro = repositorio.buscarPorTitulo(titulo);

        if (libro != null && !libro.isDisponible()) {
            libro.devolver();
            return;
        }
        System.out.println("El libro no existe o ya estaba disponible");
    }

    public List<Libro> obtenerTodos() {
        return repositorio.obtenerTodos();
    }

    public List<Libro> obtenerDisponibles() {
        return repositorio.obtenerDisponibles();
    }
}