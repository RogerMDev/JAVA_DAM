public class Libro {

    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroEjemplares;

    public Libro(String titulo, String autor, String ISBN, int numeroEjemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroEjemplares = numeroEjemplares;
    }

    public boolean consultardisponibilidad(){
        return numeroEjemplares > 0;
    }

    public void marcarPrestado(){
        if (consultardisponibilidad()){
            numeroEjemplares--;
            System.out.println("Se ha prestado correctamente el libro: " + titulo + " y se ha restado al registro local. Quedan " + numeroEjemplares + " ejemplares." );
        } else {
            System.out.println("No hay suficientes unidades de éste libro para prestar");
        }
    }

    public void marcarDevuelto(){
        numeroEjemplares++;
        System.out.println("Se ha devuelto correctamente el libro " + titulo + " y se ha añadido al registro local." );
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    @Override
    public String toString() { 
        return "📚 Libro: " + titulo +
            " | Autor: " + autor +
            " | ISBN: " + ISBN +
            " | Ejemplares disponibles: " + numeroEjemplares;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Si es el mismo objeto, son iguales
        if (obj == null || getClass() != obj.getClass()) return false; // Si no es un Libro, false

        Libro otroLibro = (Libro) obj;
        return this.ISBN.equals(otroLibro.getISBN());
    }

    @Override
    public int hashCode() {
        return ISBN.hashCode(); // Usa el ISBN para generar el código hash
    }

}
