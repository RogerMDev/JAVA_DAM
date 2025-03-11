import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Allotjament[] totsAllotjaments = new Allotjament[6];
    

    public static void main(String[] args) {
        
        totsAllotjaments[0] = new Habitacio("Blue Room", 4,true,4);
        totsAllotjaments[1] = new Apartament("St Patrick21",10,true,5,true );
        totsAllotjaments[2] = new CasaRural("Can Pep",24,true,true,true);
        totsAllotjaments[3] = new Habitacio("White Room",2,true,1);
        totsAllotjaments[4] = new Apartament("Atic12", 4,true, 2,false);
        totsAllotjaments[5] = new CasaRural("Can Colome", 34, true,true,false);
        inici();
    }

    public static void inici(){
        System.out.println("Benvingut/da al sistema de reserves de BooQueen");
        System.out.println("Selecciona una de les següents ordres: ");
        System.out.println("1. Mostrar els allotjaments disponibles");
        System.out.println("2. Reservar allotjament");
        System.out.println("3. Alliberar allotjament");
        System.out.println("4. Cerca personalitzada");
        System.out.println("5. Sortir del programa");
        System.out.println("------------------------------------------------");

        int eleccio = sc.nextInt();
        boolean mostrarMenu = true;
        while(mostrarMenu){
            if (eleccio == 1){
                for (Allotjament a : totsAllotjaments){
                    if (a.isDisponible()){
                        a.mostrarInformacio();
                    } else{}
                }
            } else if (eleccio == 2) {
                System.out.println("Digues el nom del allotjament que vols reservar");
                String apartamentAReservar = sc.nextLine();
                for (Allotjament a : totsAllotjaments){
                    if (a.getNom().equalsIgnoreCase(apartamentAReservar) && a.isDisponible()){
                        a.setDisponible(false);
                        System.out.println("Reserva completada a l'allotjament " + a.getNom() + " correctament! Gràcies!");
                    }else{
                        System.out.println("L'allotjament " + a.getNom() + " no està disponible per reservar.");
                    }
                }
            } else if(eleccio == 3){
                System.out.println("Digues el nom del allotjament que vols alliberar");
                String apartamentAReservar = sc.nextLine();
                for (Allotjament a : totsAllotjaments){
                    if (a.getNom().equalsIgnoreCase(apartamentAReservar) && !a.isDisponible()){
                        a.setDisponible(true);
                        System.out.println("Allotjament "+ a.getNom() + " alliberat correctament! Gràcies!");
                    }else{
                        System.out.println("L'allotjament desitjat ja està disponible per reservar.");
                    }
                }
            } else if (eleccio == 4){

            } else if (eleccio == 5){
                mostrarMenu = false;
            } else{
                System.out.println("Selecció incorrecte. Selecciona un nombre del menú. ");
            }
        }
    }
}
