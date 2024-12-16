public class AEA2_MATRIUS_IMPARELLS {
    public static void main(String[] args) {

        System.out.println("---------------------");
        System.out.println("MATRIU");
        System.out.println("---------------------");

        int [][] matriuParells = new int[10][10];

        for (int i = 0; i < matriuParells.length; i++) {
            for (int j = 0; j < matriuParells[i].length; j++) {
                matriuParells [i][j] = i;
                if (i % 2 == 0 && j % 2 == 0) {
                    matriuParells [i][j] = -1;
                }
            }
        }
        for (int i = 0; i < matriuParells.length; i++) {
            for (int j = 0; j < matriuParells[i].length; j++) {
                System.out.print(matriuParells[i][j] + " "); 
            }
            System.out.println("   --> Fila " + i);
        }
    }
}