public class AEA2_MATRIUS_CLASE {

    public static void main(String[] args) {
        int [][] MatriuCanvi = new int[5][5];

        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                MatriuCanvi[i][j] = i;
            }
        }

        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                System.out.println(MatriuCanvi[i][j] + " ");
            }
            System.out.println("  ---> Fila " + i);
        }
    }
}