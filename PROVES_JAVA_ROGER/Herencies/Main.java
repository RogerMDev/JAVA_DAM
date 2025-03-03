package Herencies;

public class Main {
    public static void main(String[] args){
        
        Persona p = new Persona(25,"Roger","Mateo","Estudiant");

        System.out.println(p.getNom());

        Estudiant e = new Estudiant(4,5,17,"Rogr","Mate","Estudiant");

        int curs = e.getCurs_actual();

        System.out.println(curs > 5 ? curs : "HOLA");


    }
    
}
