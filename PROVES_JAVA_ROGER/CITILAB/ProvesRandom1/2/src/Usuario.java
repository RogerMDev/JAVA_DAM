import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private int id;
    private ArrayList<Libro> listaLibrosPrestados;
    
    public Usuario(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        listaLibrosPrestados = new ArrayList<>();
    }

    public void prestarLibro(Libro libroPrestado){
        if (!listaLibrosPrestados.contains(libroPrestado)){
            listaLibrosPrestados.add(libroPrestado);
            System.out.println("El libro con título: " + libroPrestado.getTitulo() + " del autor/a " + libroPrestado.getAutor()+ " se ha añadido correctamente" );
        }
    }

    public void devolverLibro(Libro libroDevuelto){
        if (listaLibrosPrestados.contains(libroDevuelto)){
            listaLibrosPrestados.remove(libroDevuelto);
            System.out.println("Se ha devuelto correctamente el libro con el título: " + libroDevuelto.getTitulo() + " y con autor " + libroDevuelto.getAutor());
        } else{
            System.out.println("El libro propuesto para devolver no consta en el registro de libros prestados.");
        }
    }

    public void verLibrosPrestadosActualmente(){
        System.out.println("Libros prestados actualmente por " + nombre + " :");
        for (Libro libro : listaLibrosPrestados){
            System.out.println("-  " + libro.getTitulo() + " ," + libro.getAutor());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
