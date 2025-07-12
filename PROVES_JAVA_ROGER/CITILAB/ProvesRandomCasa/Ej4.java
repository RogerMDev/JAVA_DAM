package ProvesRandomCasa;
import java.util.Scanner;

public class Ej4 {


    public static void main(String[] args){

        int numeroInicial;
        int numeroFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Di dos numeros para contar cuantos impares hay entre ellos: ");
        System.out.println("Numero inicial: ");
        numeroInicial = sc.nextInt();
        System.out.println("Numero final: ");
        numeroFinal = sc.nextInt();

        for (int i = numeroInicial; i < numeroFinal;i++){
            if (i%2 != 0){
                System.out.println("nombre imparell trobat! : " + i);
            }
        }
    }
}
