import java.util.Scanner;

public class EX3 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in); //ACTIVEM SCANNER

        System.out.println("Digues cuantes files i columnes vols que tingui la matriu");
        System.out.println("Digues el nombre de files");
        //SCANNNER PER SABER NOMBRE DE FILES
        int files = sc.nextInt();

        System.out.println("Digues el nombre de columnes");
        //SCANNNER PER SABER NOMBRE DE COLUMNES
        int columnes = sc.nextInt();

        int[][] matriu1 = new int[files][columnes]; //CREACIÓ DE LA MATRIU

        System.out.println("Procedim a omplir la matriu : ");
        for (int i = 0; i < matriu1.length; i++){
            for ( int j = 0; j < matriu1[i].length; j++){
                System.out.println("Valor per la casella de la fila " + i + " i columna " + j + " :");
                int valor = sc.nextInt(); 
                matriu1[i][j] = valor; //OMPLIM LA MATRIU AMB ELS NOMBRES INTRODUITS PER SCANNER
            }
            System.out.print(" ");
        }
        for (int i = 0; i < matriu1.length; i++){
            for ( int j = 0; j < matriu1[i].length; j++){
                System.out.print(matriu1[i][j] + " "); //IMPRIMIM LA MATRIU
            }
            System.out.println("  ------> Fila "+ i );  
        }      
    }
}
