import java.util.Scanner;

public class recursivitat3 {

static Scanner sc = new Scanner(System.in);
//Caso base:

//Si n es menor que 10, tiene solo 1 dígito.
//Llamada recursiva:

//Dividimos el número entre 10 para eliminar el último dígito y seguimos contando.

//🎯 Ejemplo
//contarDigitos(12345) → 5

public static int comptarDigits(int nombre){
    
    if (nombre < 10 ){ // Si el nombre és d'un digit retornem 1
        return 1;
    }
    return 1 + comptarDigits(nombre/10); //Si no, retornem 1 + el nombre sol·licitat/10 , és a dir, sense l'ultim nombre.
}

public static void main(String[] args) {
    System.out.println("Digues quin nombre vols utilitzar per comptar els digits");
    int nombre = sc.nextInt();
    System.out.println("El contador de dígits del nombre " + nombre + " és: " + comptarDigits(nombre));
    }
}
