import java.util.Scanner;

public class Exercici3_repas{
    public static void main(String[] args){

        //Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz. 
        //Los valores y la longitud, seran insertados por el usuario. 
        //Mostrar las matrices originales y el resultado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Procedim a crear les matrius indicant per consola les files i columnes que tindrán");
        
        System.out.println("Cuantes files han de tenir les matrius?");
        int i1 = sc.nextInt();
        
        System.out.println("Cuantes columnes han de tenir les matrius?");
        int j1 = sc.nextInt();
        //CREEM I OMPLIM LA PRIMERA MATRIU
        int[][] Matriu1 = new int[i1][j1];

        for (int i = 0; i < Matriu1.length ; i++){
            for (int j = 0; j < Matriu1[i].length ; j++){
                System.out.println("Introdueix el valor de la casella: " + i + " , " + j + " de la primera matriu");
                Matriu1[i][j] = sc.nextInt();
            }
        }
        //IMPRIMIM LA PRIMERA MATRIU
        System.out.println("Primera matriu: ");
        for (int i = 0; i < Matriu1.length ; i++){
            for (int j = 0; j < Matriu1[i].length ; j++){
                System.out.print(Matriu1[i][j] + " ");
            }
            System.out.println("  ---> Fila " + i);
        }
        System.out.println(" ");
        System.out.println("Procedim a crear la segona matriu amb les mateixes dimensions que l'anterior, ja que sino no sería possible fer la suma entre elles");
        
        //CREEM I OMPLIM LA SEGONA MATRIU
        int[][] Matriu2 = new int[i1][j1];

        for ( int i = 0; i < Matriu2.length; i++){
            for (int j = 0; j < Matriu2[i].length; j++){
                System.out.println("Introdueix el valor de la casella: " + i + " , " + j + " de la segona matriu" );
                Matriu2[i][j]= sc.nextInt();
            }
        }
        //IMPRIMIM LA SEGONA MATRIU
        System.out.println("Segona Matriu: ");
        for ( int i = 0; i < Matriu2.length; i++){
            for (int j = 0; j < Matriu2[i].length; j++){
                System.out.print(Matriu2[i][j] + " ");
            }
            System.out.println("  ---> Fila " + i);
        }

        //CREEM I OMPLIM LA TERCERA MATRIU AMB LA SUMA DE LES DUES ANTERIORS
        int[][] Matriu3 = new int[i1][j1];

        for (int i = 0; i < Matriu3.length; i++){
            for (int j = 0; j < Matriu3[i].length; j++){
                Matriu3[i][j] = Matriu1[i][j] + Matriu2[i][j];
            }
        }
        //IMPRIMIM LA TERCERA MATRIU
        System.out.println("Tercera Matriu (suma de les dues anteriors):");
        for (int i = 0; i < Matriu3.length; i++){
            for (int j = 0; j < Matriu3[i].length; j++){
                System.out.print(Matriu3[i][j] + " ");
            }
            System.out.println("  ---> Fila " + i);
        }
        sc.close();
    }
}

