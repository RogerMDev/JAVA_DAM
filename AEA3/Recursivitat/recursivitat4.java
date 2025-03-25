import java.util.Scanner;

public class recursivitat4 {
    
    static Scanner sc = new Scanner(System.in);

    public static int sumar(int numero){
        if (numero == 0){
            return 0;
        }
        return numero + sumar( numero - 1);

    }

    public static void main(String[] args) {
        System.out.println("Digues el nombre per realitzar l'exercici: ");
        int num = sc.nextInt();
        System.out.println("La suma dels nombres anteriors a " + num + " és " + sumar(num));
    }
}
