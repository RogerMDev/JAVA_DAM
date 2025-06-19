package Kata_5;

import Kata_5.Objetos.*;
import Kata_5.personajes.*;

public class Main {
    public static void main(String[] args) {
        
        // Creamos a los personajes
        Guerrero guerrero = new Guerrero("Thorgal", 100);
        Mago mago = new Mago("Merlín", 50);

        // Creamos los objetos
        Pocion pocion = new Pocion("Poción de curación", 20);
        Arma espada = new Arma("Espada legendaria", 30);

        // Añadimos objetos al inventario
        mago.añadirAlInventario(pocion);
        guerrero.añadirAlInventario(espada);

        // Usamos la poción (Merlín se cura)
        System.out.println("\n🧙 Merlín usa una poción:");
        mago.usarObjeto("Poción de curación", mago);

        // Usamos el arma (Thorgal ataca a Merlín)
        System.out.println("\n🗡️ Thorgal usa su arma contra Merlín:");
        guerrero.usarObjeto("Espada legendaria", mago);

        // Mostramos la vida final de ambos
        System.out.println("\n❤️ Vida final de " + mago.getNombre() + ": " + mago.getVida());
        System.out.println("❤️ Vida final de " + guerrero.getNombre() + ": " + guerrero.getVida());
    }
}
