package AEA3;
import java.util.Scanner;

public class EX2 {
    
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digues de quina longitud vols el vector : ");

        int longitud = sc.nextInt(); //Scanner per decidir longitud vector

        int[] vector1 = new int[longitud]; //Creo vector amb la longitud previament decidida

        System.out.println("Digues els elements del vector: ");

        for (int  i = 0; i < longitud; i++){
            System.out.println("Element " + i + " : "); 
            vector1[i] = sc.nextInt(); //S'omple el vector amb els nombres introduits per l'Scanner
        }
        
        System.out.println(" Digues quin nombre vols buscar al vector : ");

        int nombrebuscat = sc.nextInt(); //Creo variable per buscar el valor que vol l'usuari/a

        boolean missatge = false; //Predefineixo variable missatge com False

        for (int  i = 0; i < longitud; i++){
            if (vector1[i] == nombrebuscat){ //Condició si el nombre buscat és el nombre que s'esta mirant a l'array
                System.out.println("El nombre " + nombrebuscat + " s'ha trobat a la posició " + i);
                missatge = false; //Segueix associant el valor de missatge com False 
                break; //Trenquem bucle per que no segueixi buscant el nombre
            }
            else if  (vector1[i] != nombrebuscat){ //Condició si el nombre que mira no és el nombre que es busca
                missatge = true; //Es canvia la variable missatge a True
            }
        }
        if (missatge == true){ //Condicional si la variable missatge és True al acabar el bucle anterior on es comparen els valors del array amb el nombre buscat
            System.out.println("El nombre " + nombrebuscat + " no s'ha trobat al vector");
        }
    }
}


