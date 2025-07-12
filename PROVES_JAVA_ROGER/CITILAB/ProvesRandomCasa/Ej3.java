import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Tabla de multiplicar
        // Pide un número y muestra su tabla de multiplicar del 1 al 10 usando for.

        System.out.println("Di que tabla quieres ver: ");

        int tablaAMostrar = sc.nextInt();
        
        for (int i = 0; i < 11; i++){

            System.out.println( i + " x " + tablaAMostrar + " = " + (tablaAMostrar*i));
        }
        sc.close();
    }
}
