import java.util.Scanner;

public class Eleccio {

    public Eleccio(){
        Scanner sc = new Scanner(System.in);
        boolean mostrarmenu = true;

        while(mostrarmenu){
        System.out.println("Digues quin objecte vols crear:");
        System.out.println("1. Triangle");
        System.out.println("2. Cercle");
        System.out.println("3. Finalitzar programa");
        int eleccio = sc.nextInt();
        if (eleccio == 1){
            System.out.println("Digues l'alçada del triangle: ");
            int alcada = sc.nextInt();
            System.out.println("Digues la base del triangle: ");
            int base = sc.nextInt();
            Triangle t = new Triangle("Triangle",base,alcada);
            t.ImprimirDades();
        }else if (eleccio == 2){
            System.out.println("Digues el radi del cercle: ");
            int radi = sc.nextInt();
            Cercle c = new Cercle("Cercle",radi);
            c.ImprimirDades();
        } else {
            mostrarmenu = false;
        }
        }
        sc.close();
    }
}




