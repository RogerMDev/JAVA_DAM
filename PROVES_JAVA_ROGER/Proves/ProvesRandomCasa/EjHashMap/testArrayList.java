import java.util.ArrayList;

public class testArrayList {
    public ArrayList<String> listaNombres = new ArrayList<>();

    public void anadirNombres(String nombreAAnadir) {
        listaNombres.add(nombreAAnadir);
    }

    public void mostrarNombres() {
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
    }

    public boolean comprobarNombre(String nombreAComprobar) {
        if (listaNombres.contains(nombreAComprobar)) {
            System.out.println("El nombre " + nombreAComprobar + " sí aparece en la lista.");
            return true;
        } else {
            System.out.println("El nombre " + nombreAComprobar + " no aparece en la lista.");
            return false;
        }
    }

    public void borrarNombre(String nombreABorrar) {
        if (listaNombres.contains(nombreABorrar)) {
            System.out.println("Nombre eliminado correctamente");
            listaNombres.remove(nombreABorrar);
        } else {
            System.out.println("Ese nombre no se encuentra en la lista");
        }
    }

    public int contarNumeroDeNombres() {
        int numNombres = 0;
        for (String nombre : listaNombres) {
            numNombres++;
        }
        return numNombres;
    }
    public static void main(String[] args) {
        // Creamos una instancia del objeto testArrayList
        testArrayList programa = new testArrayList();
        testArrayList programa2 = new testArrayList();

        // Usamos los métodos del objeto
        programa.anadirNombres("Roger");
        programa.anadirNombres("Laura");
        programa.anadirNombres("Joselito");

        programa2.anadirNombres("PEPE");
        programa2.anadirNombres("PACO");
        programa2.anadirNombres("PAPA");

        programa.mostrarNombres();
        programa2.mostrarNombres();

        programa.comprobarNombre("Laura");
        programa.borrarNombre("Roger");
        programa.mostrarNombres();

        int total = programa.contarNumeroDeNombres();
        System.out.println("Total de nombres: " + total);


    }
}

