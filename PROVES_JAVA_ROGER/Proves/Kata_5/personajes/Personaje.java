package Kata_5.personajes;

import Kata_5.Objetos.*;
import java.util.ArrayList;

public abstract class Personaje {

    String nombre;
    int vida;
    ArrayList<Usable> inventario;

    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
        this.inventario = new ArrayList<>();
    }

    public abstract void atacar(Personaje objetivo);

    public void usarObjeto(String nombreObjeto, Personaje objetivo){
        for (int i = 0; i < inventario.size(); i++){
            Usable objeto = inventario.get(i);
            if (objeto.getNombre().equals(nombreObjeto)){
                System.out.println(nombre + " usa " + objeto.getNombre() + " sobre " + objetivo.getNombre());
                objeto.usar(objetivo);

                if (objeto instanceof Pocion){
                    inventario.remove(i);
                    System.out.println("Se ha eliminado la poción del inventario!!");
                }

                return;
            }
        }

        System.out.println("Objeto " + nombreObjeto + " no encontrado en el inventario. ");
    }

    public void añadirAlInventario(Usable objeto){
    inventario.add(objeto);
    System.out.println(objeto.getNombre() + " ha sido añadido al inventario.");
    }

    public boolean estaVivo(){
        return vida < 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public ArrayList<Usable> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Usable> inventario) {
        this.inventario = inventario;
    }

}
