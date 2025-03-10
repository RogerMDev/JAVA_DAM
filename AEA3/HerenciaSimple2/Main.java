import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Allotjament[] totsAllotjaments = new Allotjament[6];
        
        totsAllotjaments[0] = new Habitacio("Blue Room", 4,true,4);
        totsAllotjaments[1] = new Apartament("St Patrick21",10,true,5,true );
        totsAllotjaments[2] = new CasaRural("Can Pep",24,true,true,true);
        totsAllotjaments[3] = new Habitacio("White Room",2,true,1);
        totsAllotjaments[4] = new Apartament("Atic12", 4,true, 2,false);
        totsAllotjaments[5] = new CasaRural("Can Colome", 34, true,true,false);
    }

    public static void inici(){
        System.out.println("Benvingut/da al sistema de reserves de BooQueen");
        System.out.println("Selecciona una de les següents ordres: ");
        System.out.println("1. Mostrar els allotjaments disponibles");
        System.out.println("2. Reservar allotjament");
        System.out.println("3. Alliberar allotjament");
        System.out.println("4. Cerca personalitzada");
        System.out.println("5. Sortir del programa");
        

        




        
    }
    
}
