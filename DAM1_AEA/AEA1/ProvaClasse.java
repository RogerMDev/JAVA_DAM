import java.util.Scanner;

public class ProvaClasse{
    public static void main(String[] args){
        //ACTIVEM SCANNER
        Scanner sc = new Scanner(System.in);

        //CREEM ARRAY
        double[] notes = new double[3];
        double sumanotes = 0;
        //DEMANEM SCANNER
        for (int i = 0; i < notes.length; i++){
            System.out.println("Digues el valor " + i + " del array");
            notes[i] = sc.nextDouble();
            sumanotes += notes[i];
        }
        System.out.println("La mitjana aritmetica del array es: " + sumanotes/notes.length);
        sc.close();
    }
}

