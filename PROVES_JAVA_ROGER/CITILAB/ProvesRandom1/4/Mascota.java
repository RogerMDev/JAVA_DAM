
import java.util.ArrayList;

public class Mascota {
    private String nombre;
    private double edad;
    private String tipoDeAnimal;
    private static ArrayList<Mascota> listaDeMascotas = new ArrayList<>();

    public Mascota(String nombre, double edad, String tipoDeAnimal){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public void presentarse(){
        System.out.println("Hola, me llamo " + nombre + ", tengo " + edad + " años y soy un " + tipoDeAnimal);
    }

    public void anadirMascotaALista(Mascota mascotaAAnadir){
        listaDeMascotas.add(mascotaAAnadir);
    }

    public static void mostrarListaDeMascotas(){
        for (Mascota masc : listaDeMascotas){
            System.out.println(masc.getNombre() + " : " + masc.getEdad() + " años ( " + masc.getTipoDeAnimal() + " )");
        }
    }

    public static void mostrarPresentacionPorNombre(String nombreMascota){
        for (Mascota masc : listaDeMascotas){
            if (masc.getNombre().equalsIgnoreCase(nombreMascota)){
                masc.presentarse();
                return;
            }
        }
        System.out.println("No se encontró ninguna mascota registrada con ese nombre");
    }

    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }




}
