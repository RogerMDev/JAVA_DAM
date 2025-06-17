package Kata2;
public class Estadisticas {

    public static String analizarNumeros(int[] numeros){

        int gran = numeros[0];
        int petit = numeros[0];
        double mitjana = 0;

        for (int i= 0; i <numeros.length;i++){
            mitjana += numeros[i];
            if (gran < numeros[i]){
                gran = numeros[i];
            } else if (petit > numeros[i]){
                petit = numeros[i];
            } 
        }
        return "El nombre més gran és el " + gran + " i el nombre més petit és el " + petit +". La mitjana és: " + (mitjana/numeros.length);
    }

    public static void main(String[] args){
        int[] test = {78,5,4,7,-45,45,78,122,998,74};

        System.out.println(analizarNumeros(test));
    }
}
