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

    public void registrarPrestamo(Usuario usuarioPrestamista, Libro libroPrestado) {
    Usuario usuarioEncontrado = null;
    Libro libroEncontrado = null;

    // Buscar usuario por ID
    for (Usuario u : listaDeUsuarios) {
        if (u.getId() == usuarioPrestamista.getId()) {
            usuarioEncontrado = u;
            break;
        }
    }

    if (usuarioEncontrado == null) {
        System.out.println("❌ Usuario no encontrado.");
        return;
    }

    // Buscar libro por ISBN
    for (Libro l : listaDeLibros) {
        if (l.getISBN().equalsIgnoreCase(libroPrestado.getISBN())) {
            libroEncontrado = l;
            break;
        }
    }

    if (libroEncontrado == null) {
        System.out.println("❌ Libro no encontrado en el registro.");
        return;
    }

    if (!libroEncontrado.consultardisponibilidad()) {
        System.out.println("❌ El libro no está disponible actualmente.");
        return;
    }

    // Si todo está ok → registrar préstamo
    Prestamo prestamo = new Prestamo(usuarioEncontrado, libroEncontrado);
    listaDePrestamosActivos.add(prestamo);
    usuarioEncontrado.prestarLibro(libroEncontrado);
    libroEncontrado.marcarPrestado();

    System.out.println("✅ Préstamo registrado correctamente.");
    }

    public void registrarDevolucion(Usuario usuarioADevolver, Libro LibroADevolver){
        Usuario usuarioEncontrado = null;
        Libro libroEncontrado = null;
        Prestamo prestamoEncontrado = null;
    
        for (Usuario usuario : listaDeUsuarios){
            if (usuario.getId() == usuarioADevolver.getId()){
                usuarioEncontrado = usuario;
                break;
            }
        }

        if (usuarioEncontrado == null){
            System.out.println("No se ha encontrado el usuario.");
            return;
        }

        for (Libro libro : listaDeLibros){
            if (libro.getISBN().equalsIgnoreCase(LibroADevolver.getISBN())){
                libroEncontrado = libro;
                break;
            }
        }

        if (libroEncontrado == null){
            System.out.println("No se ha encontrado el libro a devolver.");
            return;
        }

        for (Prestamo p : listaDePrestamosActivos){
            if (p.getUsuario().getId() == usuarioEncontrado.getId() && p.getLibro().getISBN().equalsIgnoreCase(libroEncontrado.getISBN())){
                prestamoEncontrado = p;
                break;
            }
        }

        if (prestamoEncontrado != null){
            listaDePrestamosActivos.remove(prestamoEncontrado);
            usuarioEncontrado.devolverLibro(libroEncontrado);
            libroEncontrado.marcarDevuelto();
            System.out.println("✅ Devolucion registrada con exito! ");
        } else{
            System.out.println("❌ No se ha encontrado el prestamo activo para easte libro y usuario.");
        }
    }

    public void verPrestamosActivosDeUsuario(){
        
    }
      

}
 