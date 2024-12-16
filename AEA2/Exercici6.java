
public class Exercici6 {

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};

        for (int i = 0; i < vector.length / 2; i++) {
            // Usamos una variable temporal para intercambiar valores
            int temp = vector[i];
            System.out.println(temp);
            vector[i] = vector[vector.length - 1 - i];
            System.out.println(vector[vector.length - 1 -i]);
            vector[vector.length - 1 - i] = temp;
            System.out.println(temp);
        }

        // Imprimimos el vector invertido
        for (int j : vector) {
            System.out.print(j + " ");
        }
    }
}
