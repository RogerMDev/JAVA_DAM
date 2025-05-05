package ComptadorParaules;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;


public class ComptadorDeParaules {

    public static void main(String args[]){
        int contadorparaules = 0;
        try {
            File f = new File("C:\\repos\\JAVA_DAM\\AEA4\\Gestionar_Documents_amb_Java\\ComptadorParaules\\entrada.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()){
                sc.next();
                contadorparaules++;
            }

            sc.close();

            File sortida = new File("C:\\repos\\JAVA_DAM\\AEA4\\Gestionar_Documents_amb_Java\\ComptadorParaules\\sortida.txt");

            if (sortida.exists()) {
                System.out.println("Atenció: El fitxer sortida.txt ja existeix. Es sobreescriurà.");
            }

            FileWriter fw = new FileWriter(sortida, false); // Marquem path amb 'sortida' i amb false = sobreescriure (true afegiría un nou arxiu)
            fw.write("Hi ha " + contadorparaules + " paraules.");
            fw.close();

            System.out.println("Resultat escrit correctament a sortida.txt.");
            
        }catch (FileNotFoundException fnf){
            System.out.println("No s'ha pogut trobar l'arxiu '.txt' d'entrada, error: " + fnf+ ".");
        } catch (SecurityException e) {
            System.out.println("No tens permisos per llegir el fitxer, error: " + e.getMessage() + "." );
        }
        catch(Exception a){
            System.out.println("Error desconegut: "+ a + ".");
        } 
    }
}
