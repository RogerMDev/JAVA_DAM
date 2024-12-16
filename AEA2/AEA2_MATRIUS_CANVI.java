public class AEA2_MATRIUS_CANVI {

    public static void main(String[] args) {
        int [][] MatriuCanvi = new int[5][5];

        // Rellenar la matriz
        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                MatriuCanvi[i][j] = i;
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                System.out.print(MatriuCanvi[i][j] + " "); // Cambiado a print
            }
            System.out.println("  ---> Fila " + i); // Salto de línea después de cada fila
        }
    }
}