
public class exempleMatrius {
    public static void main(String[] args) {

        int [][] matriuParells = new int[10][10];

        for(int i = 0; i < matriuParells.length; i++) {
            for(int j = 0; j < matriuParells[i].length; j++) {
                matriuParells[i][j] = i;
                
                if (i%2 == 0) {
                    matriuParells[i][j] *= 0;
                }

                System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriuParells[i][j]);
            }
            System.out.println("La fila " + i + " de la matriu matriuParells ja està tota plena");
            System.out.println();

        }

        System.out.println();
        for(int i = 0; i < matriuParells.length; i++) {
            for(int j = 0; j < matriuParells[i].length; j++) {
                System.out.print(matriuParells[i][j]+ " ");
            }
            System.out.println("   --> Fila " + i);
        }
    }
}