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
        sc.nextLine();
        boolean mostrarMenu = true;
        while(mostrarMenu){
            if (eleccio == 1){
                for (Allotjament a : totsAllotjaments){
                    if (a.isDisponible()){
                        System.out.println("Mostrant información de: " + a.getNom());
                        a.mostrarInformacio();
                        System.out.println("");
                        System.out.println("");
                    } 
                    else{}
                }
            } else if (eleccio == 2) {
                System.out.println("Allotjaments disponibles:");
                for (Allotjament a : totsAllotjaments){
                    if (a.isDisponible()){
                        System.out.println("Mostrant información de: " + a.getNom());
                        a.mostrarInformacio();
                        System.out.println("");
                        System.out.println("");
                    } else{}
                }
                System.out.println("Digues el nom del allotjament que vols reservar");
                String apartamentAReservar = sc.nextLine();
                for (Allotjament a : totsAllotjaments){
                    if (a.getNom().toLowerCase().equalsIgnoreCase(apartamentAReservar)){
                        if (a.isDisponible()){
                        a.setDisponible(false);
                        System.out.println("Reserva completada a l'allotjament " + a.getNom() + " correctament! Gràcies!");
                        } else{
                            System.out.println("L'allotjament " + a.getNom() + " no està disponible per reservar.");
                        }
                    }else{}
                }
            } else if(eleccio == 3){
                System.out.println("Digues el nom del allotjament que vols alliberar");
                String apartamentAReservar = sc.nextLine();
                for (Allotjament a : totsAllotjaments){
                    if (a.getNom().toLowerCase().equalsIgnoreCase(apartamentAReservar)){
                        if (a.isDisponible()){
                            System.out.println("L'allotjament desitjat ja està disponible per reservar.");
                        }else{
                            a.setDisponible(true);
                            System.out.println("Allotjament "+ a.getNom() + " alliberat correctament! Gràcies!");
                        }
                    }else{}
                }
            } else if (eleccio == 4){
                System.out.println("Selecciona com vols fer la cerca personalitzada:");
                System.out.println("1. Preu máxim per nit");
                System.out.println("2. Caracteristiques específiques");
                for (Allotjament a : totsAllotjaments){
                    System.out.println(a.calcularPreuPerNit());
                }
                int seleccio = sc.nextInt();
                if (seleccio == 1){
                    System.out.println("Digues quin és el preu màxim per nit que vols filtrar filtrar");
                    double preuMaxPerNit = sc.nextDouble();
                    System.out.println("Els següents allotjaments tenen un preu per nit inferior a la cuantitat introduida: ");
                    for (Allotjament a : totsAllotjaments){
                        if (preuMaxPerNit >= a.calcularPreuPerNit()){
                            a.mostrarInformacio();
                            System.out.println("");
                            System.out.println("");    
                        } else{}
                    }
                } else if (seleccio == 2){
                    System.out.println("Digues quin aspecte vols cercar:");
                    System.out.println("1. Cuina disponible (Nomès disponible per apartaments)");
                    System.out.println("2. Jardí o piscina disponible (Nomès disponible per cases rurals)");
                    int aspectecercat = sc.nextInt();
                    if (aspectecercat == 1){
                        for (Allotjament a : totsAllotjaments){
                            if (a.getClass() == Apartament.class){
                                if (a.isTeCuina()){ ****************
                                    
                                }
                            }
                        }
                    }
                }
            } else if (eleccio == 5){
                mostrarMenu = false;
            } else{
                System.out.println("Selecció incorrecte. Selecciona un nombre del menú. ");
            }
            System.out.println("Digues la següent opció");
            eleccio = sc.nextInt();
            sc.nextLine();
        }
    }
}
