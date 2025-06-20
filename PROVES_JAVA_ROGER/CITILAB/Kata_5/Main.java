package Kata_5;

import Kata_5.Inventario.InventarioManager;
import Kata_5.Objetos.*;
import Kata_5.personajes.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Creamos a los personajes
        Guerrero guerrero = new Guerrero("Thorgal", 100);
        Mago mago = new Mago("Merlín", 50);

        // 2. Creamos los objetos
        Pocion pocion = new Pocion("Poción de curación", 20);
        Arma espada = new Arma("Espada legendaria", 30);

        // 3. Añadimos objetos al inventario
        mago.añadirAlInventario(pocion);
        guerrero.añadirAlInventario(espada);

        // 4. Guardamos el inventario de Merlín
        InventarioManager.guardarInventario(mago.getInventario());

        // 5. Usamos objetos
        System.out.println("\nMerlín usa una poción:");
        mago.usarObjeto("Poción de curación", mago);

        System.out.println("\nThorgal usa su arma contra Merlín:");
        guerrero.usarObjeto("Espada legendaria", mago);

        // 6. Mostramos vida final
        System.out.println("\nVida final de " + mago.getNombre() + ": " + mago.getVida());
        System.out.println("Vida final de " + guerrero.getNombre() + ": " + guerrero.getVida());

        // 7. Simulamos que más tarde cargamos ese inventario
        System.out.println("\n--- Cargando inventario desde archivo ---");
        Mago nuevoMago = new Mago("Nuevo Merlín", 60);
        ArrayList<Usable> inventarioCargado = InventarioManager.cargarInventario();
        nuevoMago.setInventario(inventarioCargado);

        System.out.println("Objetos cargados en el inventario de " + nuevoMago.getNombre() + ":");
        for (Usable obj : nuevoMago.getInventario()) {
            System.out.println("- " + obj.getNombre());
        }
    }
}
