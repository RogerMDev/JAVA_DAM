public class MATRIU2 {

    public static void main(String[] args) {
        int [][] MatriuCanvi = new int[5][5];

        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                MatriuCanvi[i][j] = i;
                if (i%2 == 0 && j%2 ==0){
                    MatriuCanvi[i][j] = 1;
                }
                else if (i%2 == 0 && j%2 != 0){
                    MatriuCanvi[i][j] = 2;
                }
                else if (i%2 != 0 && j%2 == 0){
                    MatriuCanvi[i][j] = 3;
                }
                else {
                    MatriuCanvi[i][j] = 4;
                }
            }
        }
        for (int i = 0; i < MatriuCanvi.length; i++) {
            for (int j = 0; j < MatriuCanvi[i].length; j++) {
                System.out.print(MatriuCanvi[i][j] + " ");
            }
            System.out.println("  ---> Fila " + i);
        }
    }
}
