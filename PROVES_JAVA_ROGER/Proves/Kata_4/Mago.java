package Kata_4;

public class Mago extends Personaje {

    public Mago(String nombre, int vida){
        super(nombre, vida);
    }
    
    @Override
    public void atacar(Personaje personajeEnemigo){
        System.out.println("El mago " + getNombre() + " ataca a " + personajeEnemigo.getNombre() + " y le causa 20 de daño!");
        personajeEnemigo.setVida(personajeEnemigo.getVida()-20);
        System.out.println("Vida restante del enemigo: " + personajeEnemigo.getVida());
        System.out.println("Además, el mago " + getNombre() + " se cura 10 puntos de salud después de atacar!");
        setVida(getVida()+10);
        System.out.println("Vida actual del mago " + getNombre() + " :" + getVida());
    }
}
