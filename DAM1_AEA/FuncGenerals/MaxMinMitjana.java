public class MaxMinMitjana {

    public float TrobarMax(float[] vector){
        float max = 0;
        for ( int i = 0 ; i < vector.length; i++){
            if (vector[i] > max){
                max = vector[i];
            }   
        }
        System.out.println("El nombre máxim és el " + max ); 
        return max;
    }
    
    public float TrobarMin(float[] vector){
        float min = vector[1];
        for ( int i = 0 ; i < vector.length; i++){
            if (vector[i] < min){
                min = vector[i];
            }
        }
        System.out.println("El nombre minim és el " + min );
        return min;
    }

    public float Mitjana(float[] vector){
        float suma = 0;
        for ( int i = 0 ; i < vector.length; i++){
            suma += vector[i];
        }
        float mitjana = (suma/vector.length);
        System.out.println("La mitjana és " + mitjana );
        return mitjana;
    }
}
