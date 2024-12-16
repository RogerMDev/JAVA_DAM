import java.util.Scanner;

public class Exercici5_repas{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //CREEM LA MATRIU

        int[][] MatriuInts = new int[2][2];

        //L'USUARI OMPLE LA MATRIU
        for (int i = 0; i < MatriuInts.length; i++){
            for (int j = 0; j < MatriuInts[i].length; j++){
                System.out.println("Digues el valor de la casella " + i + "  " +  j);
                MatriuInts[i][j] = sc.nextInt();
            }
        }

        //L'USUARI PREGUNTA PEL NOMBRE QUE VOL SABER CUANTS COPS APAREIX
        System.out.println("Quin nombre vols saber cuants cops apareix? ");
        int req = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < MatriuInts.length; i++){
            for (int j = 0; j < MatriuInts[i].length; j++){
                if (req == MatriuInts[i][j]){
                    contador++;
                }
            }
        }
        //IMPRIMIM
        System.out.println("El nombre " + req + " apareix" + " " + contador + " cops");
        sc.close();
    }
}


