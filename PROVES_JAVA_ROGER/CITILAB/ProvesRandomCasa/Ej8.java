import java.util.Scanner;

public class Ej8{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[4];
        
        int mayor = numeros[0];
        int menor = numeros[0];
        
        System.out.println("Pon los 4 numeros para operar.");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Numero " +(i+1));
            numeros[i] = sc.nextInt();
        }


        for (int j = 0; j < numeros.length;j++){
            if (mayor <= numeros[j]){
                mayor = numeros[j];
            } else {
                menor = numeros[j];
            }
        }
        System.out.println("El numero mas grande del vector es el numero " + mayor);
        System.out.println("El numero mas pequeño del vector es el numero " + menor);
        sc.close();
    }
}