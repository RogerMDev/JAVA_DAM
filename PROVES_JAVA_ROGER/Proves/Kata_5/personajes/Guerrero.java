package Kata_5.personajes;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int vida){
        super(nombre, vida);
    }
    
    @Override
    public void atacar(Personaje objetivo){
        System.out.println("El guerrero " + getNombre() + " ataca a " + objetivo.getNombre() +  " y le causa 30 de daño.");
        objetivo.setVida(objetivo.getVida()-30);
        System.out.println("Vida restante de " + objetivo.getNombre() + ": " + objetivo.getVida());
    }

}
