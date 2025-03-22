import java.util.Scanner;

public class recursivitat2 {

static Scanner sc = new Scanner(System.in);

//    Caso base:
//Si la cadena está vacía ("") o tiene un solo carácter, se devuelve tal cual.

//Llamada recursiva:

//Se toma el último carácter y se concatena con el resultado de invertir el resto de la cadena.

//🎯 Ejemplo
//invertir("hola") → "aloh"

    public static String invertirParaules(String paraula) {
        if (paraula.equalsIgnoreCase(" ") || paraula.length() == 1) { 
            return paraula; //Si la cadena està buida ("") o només té un caracter, es retorna la paraula.
        }
        //Retornem l'ultim valor de la paraula (paraula.charAt(paraula.length() - 1) 
        //i afegim un tros de string (substring que va desde el principi (0) fins l'ultima lletra (paraula.(length() -1 ))
        return paraula.charAt(paraula.length() - 1) + invertirParaules(paraula.substring(0, paraula.length() - 1)); 
    }

    public static void main(String[] args) {
        System.out.println("Digues quina paraula vols invertir");
        String paraula = sc.nextLine();
        System.out.println("La paraula " + paraula + " invertida és: " + invertirParaules(paraula));  
    }
}


