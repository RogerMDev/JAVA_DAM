import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Libro> listaDeLibros;
    private ArrayList<Usuario> listaDeUsuarios;
    private ArrayList<Prestamo> listaDePrestamosActivos;

    public Biblioteca(){
        listaDeLibros = new ArrayList<>();
        listaDeUsuarios = new ArrayList<>();
        listaDePrestamosActivos = new ArrayList<>();
    }

    public void anadirLibroNuevo(Libro libroAAnadir){
        if (listaDeLibros.contains(libroAAnadir)){
            libroAAnadir.setNumeroEjemplares(libroAAnadir.getNumeroEjemplares()+1);
            System.out.println("Libro añadido correctamente, se ha sumado a los ya existentes!");
        } else{
            listaDeLibros.add(libroAAnadir);
            System.out.println("Nuevo libro añadido correctamente!");
        }
    }

    public void buscarLibroPorTitulo(String titulo){
        //VER CHAT GPT CHAT CON NOMBRE: PROYECTO BIBLIOTECA
    }
}
