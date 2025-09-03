package Kata_4;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public void atacar(Personaje personajeEnemigo) {
        System.out.println("El guerrero " + getNombre() + " ataca a " + personajeEnemigo.getNombre() + " y le causa 30 de daño.");
        personajeEnemigo.setVida(personajeEnemigo.getVida()-30);
        System.out.println("Vida restante del enemigo: " + (personajeEnemigo.getVida()));
    }
}
