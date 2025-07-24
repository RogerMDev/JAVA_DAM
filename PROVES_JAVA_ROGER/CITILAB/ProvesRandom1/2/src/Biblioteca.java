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
        for (Libro libro : listaDeLibros){
            if ((libro.getTitulo()).equalsIgnoreCase(titulo)){
                System.out.println("✅ Libro encontrado: " + libro.getTitulo() + " de " + libro.getAutor());
                System.out.println(libro);
                return;
            }
        }
        System.out.println("❌ No se ha encontrado ningún libro con ese título.");
    }

    public void buscarLibroPorAutor(String autor){
        for (Libro libro : listaDeLibros){
            if ((libro.getAutor()).equalsIgnoreCase(autor)){
                System.out.println("✅ Libro encontrado: " + libro.getTitulo() + " de " + libro.getAutor());
                System.out.println(libro);
                return;
            }
        }
        System.out.println("❌ No se ha encontrado ningún libro con ese autor.");
    }

    public void buscarLibroPorISBN(String isbn){
        for (Libro libro : listaDeLibros){
            if ((libro.getISBN()).equalsIgnoreCase(isbn)){
                System.out.println("✅ Libro encontrado: " + libro.getTitulo() + " de " + libro.getAutor());
                System.out.println(libro);
                return;
            }
        }
        System.out.println("❌ No se ha encontrado ningún libro con ese ISBN.");
    }

    public void mostrarLibrosDisponibles(){
        for (Libro libro : listaDeLibros){
            if (libro.consultardisponibilidad()){
                System.out.println(libro);
            }
        }
    }

    public void registrarUsuario(Usuario usuarioARegistrar){
        for (Usuario usuario : listaDeUsuarios){
            if (usuario.getId() == usuarioARegistrar.getId()){
                System.out.println("❌ El usuario ya está registrado.");
                return;
            }
        }
        listaDeUsuarios.add(usuarioARegistrar);
        System.out.println("✅ Usuario registrado y añadido correctamente");
    }

    public void buscarUsuarioPorId(int id){
        for (Usuario usuario : listaDeUsuarios){
            if ((usuario.getId()) == id){
                System.out.println("✅ Usuario con id: "+ id + " encontrado.");
                System.out.println(usuario);
                return;
            }
        }
        System.out.println("❌ El usuario con id: " + id + " no se ha encontrado.");
    }

    public void buscarUsuarioPorNombre(String nombre){
        boolean encontrado = false;
        for (Usuario usuario : listaDeUsuarios){
            if (usuario.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("✅ Usuario con nombre: "+ nombre + " encontrado.");
                System.out.println(usuario);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("❌ No se ha encontrado ningun usuario con el nombre: " + nombre);
        }
    }

    public void registrarPrestamo(Usuario usuario, Libro libro){
        
    }
}
 