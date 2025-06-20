package Array;

public class EstadisticasClase {

    public static String analizarNotas(double[] notas){

        double max = notas[0];
        double min = notas[0];
        double sumaTotal = 0;
        double avg;
        for (int i = 0; i < notas.length; i++){
            sumaTotal += notas[i];
            if (max < notas[i]){
                max = notas[i];
            } 
            if (min > notas[i]){
                min = notas[i];
            }
        } 
        avg = sumaTotal/notas.length;
        return "La nota més gran és: " + max + "\n La nota més petita és: " + min + "\nLa nota mitjana és: " + avg + " .";

    }
}
