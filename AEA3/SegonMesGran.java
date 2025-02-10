package test;
import java.util.Scanner;

public class SegonMesGran {

    public static void main(String[] args) {
        SegonMesGran programa = new SegonMesGran();
        programa.inici();
    }
    //param. ent: NO HI HA
    //param. sort: NO HI HA
    public void inici(){
        System.out.println("Entra la mida");
        int mida = llegirEntero();
        float[] vector = new float [mida]; //creació del vector
        System.out.println("Ara, has de posar els nombres del vector");

        for (int i = 0; i < vector.length; i++){
            vector[i] = llegirFloat();
        }

        float max2 = calcular2oNumeroMasGrande(vector); //public float calcular2oNumeroMasGrande(float[] random)
        System.out.println("El segon nombre més gran es " + max2);

        for (int i = 0; i < vector.length; i++){
            vector[i] = llegirFloat();
        }
        float max3 = calcular2oNumeroMasGrande(vector);
        System.out.println("El segon nombre més gran es " + max3);

        for (int i = 0; i < vector.length; i++){
            vector[i] = llegirFloat();
        }
        float max4 = calcular2oNumeroMasGrande(vector);
        System.out.println("El segon nombre més gran es " + max4);
    }

    //param. ent: tipus de dada: Array de floats, nom: arrayFloat
    //param. sort: tipus de dada: float, nom: max2
    public float calcular2oNumeroMasGrande(float[] arrayFloat) {
        float max1 = 0;
        float max2 = 0;

        for(int i = 0; i < arrayFloat.length; i++){
            if(max1 < arrayFloat[i]){
                max1 = arrayFloat[i];
            }
        }

        for(int i = 0; i < arrayFloat.length; i++){
            float j = arrayFloat[i];
            if(arrayFloat[i] == max1){
            }
            else if(max2 < arrayFloat[i]){
                max2 = arrayFloat[i];
            }
        }
        return max2;
    }

    //param. ent: NO HI HA
    //param. sort: TIPUS DE DADA: INT NOM: numLlegit
    public int llegirEntero(){
        Scanner lector = new Scanner(System.in);
        int numLlegit = 0;
        boolean valorOk = false;
        while(!valorOk){ //control d'error
            System.out.println("Si us plau, un nombre enter");
            if (lector.hasNextInt()) { // si el valor posat es un nombre enter, segueix
                numLlegit = lector.nextInt(); //mida = valor posat per l'usuari
                valorOk = true;
            }
            else {
                lector.next(); //si valor posat no és un nombre enter, el programa segueix demanant fins a que posi.
            }
        }
        return numLlegit;
    }

    //param. ent: NO HI HA
    //param. sort: TIPUS DE DADA: float NOM: numLlegit
    public float llegirFloat(){
        Scanner lector = new Scanner(System.in);
        float numLlegit = 0;
        boolean valorOk = false;
        while(!valorOk){ //control d'error
            System.out.println("Si us plau, un nombre float");
            if (lector.hasNextFloat()) { // si el valor posat es un nombre enter, segueix
                numLlegit = lector.nextFloat(); //mida = valor posat per l'usuari
                valorOk = true;
            }
            else {
                lector.next(); //si valor posat no és um nombre enter, el programa segueix demanant fins a que posi.
            }
        }
        return numLlegit;
    }
}

