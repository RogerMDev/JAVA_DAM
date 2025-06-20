package Kata_5.Objetos;

import Kata_5.personajes.Personaje;

public class Arma implements Usable {

    String nombre;
    int dano = 20;
    
    public Arma(String nombre, int dano){
        this.nombre = nombre;
        this.dano = dano;
    }

    @Override
    public void usar(Personaje personajeObjetivo){
        System.out.println(personajeObjetivo.getNombre() + " recibe " + dano + " puntos de daño.");
        personajeObjetivo.setVida(personajeObjetivo.getVida() - dano);
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    public int getDano() {
        return dano;
    }
}
