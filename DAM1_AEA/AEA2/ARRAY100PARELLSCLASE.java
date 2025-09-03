public class ARRAY100PARELLSCLASE {
    public static void main(String[] args){

        int[][] matriuparells = new int[5][20];

        int parells = 0;
        

        for (int i = 0; i < matriuparells.length; i++){

            if (i%2 == 0){
                for (int j = 0; j < matriuparells[i].length ; j++){
                    matriuparells[i][j] = parells*2;
                    System.out.print(matriuparells[i][j] + " ");
                    parells++;
                }
            }

            if (i%2 != 0) {
                for (int j = 0; j < matriuparells[i].length; j++){
                    matriuparells[i][j] = (parells*2)+1;
                    System.out.print(matriuparells[i][j] + " ");
                    parells++;
                    }
                }
            
        System.out.println(" ");
        }
    }   
}

