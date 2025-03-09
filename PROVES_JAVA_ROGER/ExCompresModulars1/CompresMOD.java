public class CompresMOD {

    public void TrobarMax(int[] vector){
        int max = 0;
        for ( int i = 0 ; i < vector.length; i++){
            if (vector[i] > max){
                max = vector[i];
            }   
        }
        System.out.println("El nombre máxim és el " + max ); 
    }
    
    public void TrobarMin(int[] vector){
        int min = vector[1];
        for ( int i = 0 ; i < vector.length; i++){
            if (vector[i] < min){
                min = vector[i];
            }
        }
        System.out.println("El nombre minim és el " + min );
    }
}
