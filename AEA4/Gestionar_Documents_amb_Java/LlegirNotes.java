package Gestionar_Documents_amb_Java;

import java.io.File;
import java.util.Scanner;

public class LlegirNotes {
    //la paraula fi serveix com a marca de final de fitxer
    public static final String MARCA_FI = "fi";
    public static void main (String[] args) {

        try {
            File f = new File("C:\\Users\\ztoxi\\Desktop\\asd-1.txt");
            Scanner lector = new Scanner(f);
            //Scanner aleix = new Scanner(System.in);
            boolean llegir = true;
            while (llegir) {
                String nom = lector.next();
                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                }
                else {
                    String cognom = lector.next();
                    System.out.print("Estudiant: " + nom + " " + cognom);
                    //Noteu com un scanner es pot passar com paràmetre
                    double mitjana = llegirNotes(lector);
                    System.out.println(" − Mitjana: " + mitjana);
                }
            }
            //Cal tancar el fitxer
            lector.close();
        }
        catch(Exception e) {
            //Excepció!
            System.out.println("1 Error llegint estudiants: " + e);
        }
    }

    /** Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
     * de les notes, s’extreuen i es calcula la mitjana.
     *
     * @param lector Scanner a processar
     * @return Mitjana de notes
     */
    public static double llegirNotes(Scanner lector) {
        double total = 0;
        int contador = 0;
        int numParar = -1;
        double numActual = 0;
        try {
            while (numActual != numParar){
                numActual = lector.nextDouble();
                if (numActual==numParar){
                    break;
                }
                total = total + numActual;
                contador++;
            }
            total = total/contador;
        }
        catch (Exception e) {
            //Excepció!
            System.out.println("2 Error llegint notes: " + e);
        }
        return total;
    }
}

