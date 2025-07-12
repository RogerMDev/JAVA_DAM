package ProvesRandomCasa;
import java.util.Scanner;

public class Ej1 {
    static int numSumar;
    static Scanner sc = new Scanner(System.in);
    static int resultado;

    public static void main(String[] args){

    System.out.println("Di hasta que numero quieres sumar");

    numSumar = sc.nextInt();

    for (int i = 0;i <= numSumar;i++){
        resultado += i;
    }
    System.out.println("La respuesta es: " + resultado);
    sc.close();
    }

}
