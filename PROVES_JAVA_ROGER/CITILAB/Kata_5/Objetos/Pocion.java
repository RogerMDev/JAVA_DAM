package Kata_5.Objetos;

import Kata_5.personajes.Personaje;

public class Pocion implements Usable {

    String nombre;
    int cantidadCurada;

    public Pocion(String nombre, int cantidadCurada){
        this.nombre = nombre;
        this.cantidadCurada = cantidadCurada;
    }

    @Override
    public void usar(Personaje objetivo) {
        System.out.println(objetivo.getNombre() + " recupera " + cantidadCurada + " puntos de vida.");
        objetivo.setVida(objetivo.getVida() + cantidadCurada);
    }

    @Override 
    public String getNombre(){
        return nombre;
    }

}
