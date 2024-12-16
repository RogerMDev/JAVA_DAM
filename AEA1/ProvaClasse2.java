import java.util.Scanner;

public class ProvaClasse2{
    public static void main(String[] args){
        //ACTIVEM SCANNER
        Scanner sc = new Scanner(System.in);

        char[] VectorChars = new ;
        
        for (int j = 0; j < VectorChars.length; j++){
        System.out.println("Digues el valor de " + j + "del vector");
        VectorChars[j] = sc.next().charAt(0);
            if (VectorChars[j] == 'a' ||VectorChars[j] == 'e' ||VectorChars[j] == 'i' || VectorChars[j] == 'o'||VectorChars[j] == 'u'){
                VectorChars[j] ='$';
            }
        }
        System.out.println(VectorChars[j]);
    }
}
