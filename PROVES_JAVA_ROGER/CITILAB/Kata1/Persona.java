package Kata1;
public class Persona{

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String saludar(){
        return "Hola,soy " + this.nombre + " y tengo " + this.edad + " años.";
    }
}