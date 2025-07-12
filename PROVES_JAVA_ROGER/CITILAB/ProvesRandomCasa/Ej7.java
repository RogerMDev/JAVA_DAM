package ProvesRandomCasa;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[5];
        System.out.println("Di las notas de los estudiantes: ");
        int sumaNotas = 0;
        int aprovados = 0;

        for (int i = 0; i < notas.length;i++){
            System.out.println("Nota " + (i+1) + " : ");
            notas[i] = sc.nextInt();
            sumaNotas += notas[i];
            if (notas[i] >= 5){
                aprovados++;
            }
        }
        System.out.println("Notas guardadas correctamente!");

        System.out.println("El promedio de las notas introducidas es: " + (sumaNotas/notas.length));

        if (aprovados == 1) {
            System.out.println("Solamente ha aprovado 1 estudiante");
        } else if (aprovados == 0){
            System.out.println("No ha aprovado ningún estudiante :( ");
        } else{
            System.out.println("Han aprovado " + aprovados + " estudiantes.");
        }
    }
}
