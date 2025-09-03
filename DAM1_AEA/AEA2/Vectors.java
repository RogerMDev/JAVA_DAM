import java.util.Scanner;

public class Vectors{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
    String [] entrada = new String[6];
    // Demanar a l'usuari que ompli el vector entrada

    for (int i=0; i < entrada.length; i++){
        System.out.println("Introdueix char");
        entrada [i] = sc.next();
        }
    // Aqui ja hem llegit el vector que ens ha donat l'usuari
    for (int i=0; i < entrada.length; i++){
        if (entrada[i].equals("a") ||entrada[i].equals("e")||entrada[i].equals("i")||entrada[i].equals("o")||entrada[i].equals("u") ){
            entrada[i]="$";
            }
         if (entrada[i].equals("0") ||entrada[i].equals("1")||entrada[i].equals("2")||entrada[i].equals("3")||entrada[i].equals("4")||entrada[i].equals("5")||entrada[i].equals("6")||entrada[i].equals("7")||entrada[i].equals("8")||entrada[i].equals("9") ){
            entrada[i]="*";
            }
            System.out.println("Posicio " + i + "=" + entrada[i]);
        }
    }
}



