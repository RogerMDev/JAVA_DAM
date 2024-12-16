
//AEA_2 EXERCICI REPÀS AEA2

//HECHO HASTA QUE PIDE SUMA DE DOS DIAGONALES
public class MATRIU1 {

    public static void main(String[] args) {
        int [][] MatriuCanvi = new int[5][5];
        int suma = 0;
        int contcolum = 0;
        int maxim = 0;
        int vegadesmaxim = 0;
        int sumadiagonal1 = 0;
        int sumadiagonal2 = 0;
        int sumaultimafila = 0;

        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                MatriuCanvi[i][j] = (int)(Math.random() * 100);
                suma += MatriuCanvi[i][j];
                if (maxim < MatriuCanvi[i][j]){
                    maxim = MatriuCanvi[i][j];
                }
                ++contcolum;
            }
        }
        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                System.out.print(MatriuCanvi[i][j] + " ");
            }
            System.out.println("  ---> Fila " + i);
        }
        //Mostrar en consola el promedio de la matriz.
        //Mostrar en consola el número mayor y la cantidad de veces que este se repite.
        //Mostrar en consola todos los números primos.
        System.out.println("El promig de la matriu és  " + (suma/contcolum));
        System.out.print("Els nombres senars de la matriu són: ");
        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                if (maxim ==MatriuCanvi[i][j]){
                    vegadesmaxim++;
                }
                if (MatriuCanvi[i][j]%2 != 0){
                    System.out.print(" " +  MatriuCanvi[i][j]);
                }
            }
        }
        //Mostrar nombres parells de la matriu
        System.out.println();
        System.out.print("Els nombres parells de la matriu són: ");        
        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                if (MatriuCanvi[i][j]%2 ==0){
                    System.out.print(" " + MatriuCanvi[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println("El maxim de la matriu es: " + maxim);
        System.out.println("Les vegades que es repeteix el nombre máxim " + "(" + maxim + ")" + " es: "+ vegadesmaxim);

        //Mostrar en consola la suma de las diagonales
        for (int i = 0; i < MatriuCanvi.length; i++) {
            sumadiagonal1 += MatriuCanvi[i][i];
        }
        for (int i = 0; i < MatriuCanvi.length; i++) {
            sumadiagonal2 += MatriuCanvi[i][MatriuCanvi.length-1-i];
        }
        System.out.println("La suma de las diagonales es: " + (sumadiagonal1+sumadiagonal2));

        //Mostrar en consola la suma de la la ultima fila
        for (int i = 0; i < MatriuCanvi.length; i++){
            for (int j = 0; j < MatriuCanvi[i].length; j++){
                if (i == MatriuCanvi.length-1){
                    sumaultimafila += MatriuCanvi[i][j];
                }
            }
        }
        System.out.println("La suma de la ultima fila es:" + sumaultimafila);
    }
}




