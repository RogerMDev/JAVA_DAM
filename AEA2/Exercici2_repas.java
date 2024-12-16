import java.util.Scanner;

//CREEM UNA MATRIU N X N I L'OMPLIM AMB NOMBRES ALEATORIS DEL 0 AL 10
public class Exercici2_repas{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Procedim a crear una matriu a petició de l'usuari");

    System.out.println("Digues cuantes columnes vols a la matriu");
    int n = sc.nextInt();

    int[][] MatriuNxN = new int[5][n];

        for (int i = 0; i < MatriuNxN.length; i++) {
            for (int j = 0; j < MatriuNxN[i].length; j++) {
            MatriuNxN[i][j] = (int)(Math.random() * 11);
            System.out.print(MatriuNxN[i][j] + " ");
            }
        System.out.println("  ---> Fila " + i);
        }
        sc.close();
    }
}


