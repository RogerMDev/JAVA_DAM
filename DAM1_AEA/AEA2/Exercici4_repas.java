
import java.util.*;

public class Exercici4_repas{
    public static void main(String[] args){

        int[] Array = new int[5];

        //CREEM UN ARRAY RANDOM
        for (int i = 0; i < Array.length; i++){
            Array[i] = (int)(Math.random() * 20);
            System.out.print(Array[i] + "  ");
        }
        //CREEM UNA COPIA DEL ARRAY ORIGINAL
        int[] ArrayCopia = Array.clone();

        //ORDENEM DE MES GRAN A MES PETIT LA COPIA DE L'ARRAY ORIGINAL
        Arrays.sort(ArrayCopia);

        //ENTENEM QUE EL SEGON NOMBRE MES PETIT DEL ARRAY SERA L'INDEX 1 DE L'ARRAY
        //TOT I QUE POT NO SER CERT SI EL NOMBRE MÉS PETIT ES REPETEIX AL MENYS 2 COPS
        System.out.println("  ");
        System.out.println("El segon nombre més petit del array es el nombre:  " + ArrayCopia[1]);
    }
}
