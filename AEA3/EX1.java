package AEA3;
import java.util.Scanner;


public class EX1{

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digues de quina longitud vols els vectors : ");

        int longitud = sc.nextInt();

        int[] array1 = new int[longitud];

        int[] array2 = new int[longitud];

        int[] array3 = new int[longitud];

        System.out.println("Digues els elements del primer vector: ");

        for (int  i = 0; i < longitud; i++){
            System.out.println("Element " + (i+1) + " : ");
            array1[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.println("Digues els elements del segon vector: ");

        for (int  i = 0; i < longitud; i++){
            System.out.println("Element " + (i+1) + " : ");
            array2[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.println("La suma dels vectors es : ");

        for (int  i = 0; i <= longitud; i++){
            array3[i] = array1[i] + array2[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println(" ");
    }
}

