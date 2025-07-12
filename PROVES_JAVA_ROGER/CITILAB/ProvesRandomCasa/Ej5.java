package ProvesRandomCasa;
import java.util.Random;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int intent;
        boolean acertat = false;
        int randomNum = random.nextInt(100) + 1; //Sense el + 1 seria de 0 a 99

        while (!acertat){
            System.out.println("Di un numero entre 1 y 100 : ");

            intent = sc.nextInt();

            if (intent != randomNum){
                if (intent > randomNum){
                    System.out.println("El numero propuesto es más grande que el objetivo");
                } else {
                    System.out.println("El numero propuesto es más pequeño que el objetivo");
                }
            } else {
                System.out.println("Has acertado el numero!! FELICIDADES!!");
                acertat = true;
                sc.close();
            }
        }
    }
}
