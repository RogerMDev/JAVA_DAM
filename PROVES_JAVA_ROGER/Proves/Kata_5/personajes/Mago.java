package Kata_5.personajes;

public class Mago extends Personaje {
    
    public Mago(String nombre, int vida){
        super(nombre,vida);
    }

    @Override
    public void atacar(Personaje objetivo){
        System.out.println("El mago " + getNombre() + " causa 20 de daño al personaje " + objetivo.getNombre());
        objetivo.setVida(objetivo.getVida()-20);
        System.out.println("El mago "+ getNombre() + " se cura 10 de salud al atacar!");
        setVida(getVida()+10);
        System.out.println("Salud del mago :" + getVida());
    }

}
