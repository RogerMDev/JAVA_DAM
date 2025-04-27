package Gestionar_Documents_amb_Java;

import java.io.File;
import java.util.Scanner;

public class ContadorDeParaules {

    public static void main(String args[]){
        int contadorparaules = 0;
        try {
            File f = new File("C:\\Users\\ztoxi\\Desktop\\DAM 1\\JAVA_DAM\\AEA 4\\Gestionar_Documents_amb_Java\\entrada.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()){
                String paraulaActual = sc.next();
                if (paraulaActual.equals(" ")){
                    contadorparaules++;
                }
            }
            System.out.println("Hi ha "+ contadorparaules + " paraules.");
            
        } catch(Exception a){
            System.out.println("Error : "+ a);
        }
    }
}
