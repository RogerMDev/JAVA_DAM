
import java.util.ArrayList;

public class Mascota {
    String nombre;
    double edad;
    String tipoDeAnimal;
    ArrayList listaDeMascotas = new ArrayList<Mascota>();

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
}
