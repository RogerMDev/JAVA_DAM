package InvertirParaules;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class InvertirParaules {

    public static void main(String [] args ){

        try {
            File arxiu = new File("arxiu.txt");
            Scanner sc = new Scanner(arxiu);
            File sortida = new File("arxiu_invertit.txt");
            FileWriter fw = new FileWriter(sortida, false);
            
            while (sc.hasNextLine()) {
                String liniaActual = sc.nextLine();
                for (int i = liniaActual.length(); i > 0; i--) {
                    fw.write(liniaActual.charAt(i-1));
                }
                fw.write("\n"); // Afegim un salt de linia
            }
            sc.close();
            fw.close();
            System.out.println("S'ha invertit el contingut correctament.");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
