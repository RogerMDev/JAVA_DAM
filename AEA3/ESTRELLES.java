import java.util.Scanner;

public class ESTRELLES {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
       Funcion();
    }
    public static void Funcion(){
        boolean on = true;

        while( on ){
            System.out.println("Di el simbolo quieres imprimir, si quieres parar, escribe: fin");
            String symbolo  = sc.nextLine();
            if (symbolo.equalsIgnoreCase("fin")){
                on = false;
            } else {System.out.println("Di la cantidad de simbolos quieres imprimir");
                    int cant = sc.nextInt();
                    if (cant >= 0){
                        sc.nextLine();
                    
                        for (int i = 0; i < cant ; i++){
                        System.out.print(symbolo);
                        }
                    } else {
                        System.out.println("Error, por favor, pon una cantidad válida.");
                    }   
                System.out.println("");
            }
        }
    }
}






