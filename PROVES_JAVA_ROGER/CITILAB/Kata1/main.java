package Kata1;
public class main {
    public static void main(String[] args) {
        Persona Roger = new Persona("Roger", 25);
        Persona Marta = new Persona("Marta", 23);

        System.out.println(Roger.saludar());
        System.out.println(Marta.saludar());
    }
}
