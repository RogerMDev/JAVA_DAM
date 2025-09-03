import java.time.LocalDate;

public class Prestamo {
    
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Usuario usuario, Libro libro){
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusDays(14); //2 semanas a partir de la fecha de préstamo
    }

    public boolean estaVencido(){
        return LocalDate.now().isAfter(fechaDevolucion);
    }

    public long diasRestantes(){
        long dias = java.time.temporal.ChronoUnit.DAYS.between(LocalDate.now(), fechaDevolucion);
        return Math.max(0,dias);
    }

    public void renovar(int diasExtraARenovar){
        this.fechaDevolucion = fechaDevolucion.plusDays(diasExtraARenovar);
    }

    @Override
    public String toString() {
        return "Préstamo de '" + libro.getTitulo() + "' a " + usuario.getNombre() +
            " - Fecha préstamo: " + fechaPrestamo +
            " | Fecha devolución: " + fechaDevolucion +
            (estaVencido() ? " ⚠️ (VENCIDO)" : " | Días restantes: " + diasRestantes());
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

} 
