import java.util.Scanner;

public class CORRECCIO_EXAMEN{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i =1;
        double descompte = 0.06;
        double descompteaplicat = 0;
        double preudescompte = 0;
        double preutotal = 0;
        
        System.out.println("Benvingut/da a la caluladora de preus. Hauras d'introduir 5 preus de productes per saber si tenen descompte.");
        
        while (i<6){
            System.out.println("Introdueix el preu del " + (i) + " producte:");
            double preu = sc.nextDouble();
            if (preu > 0){
                if (preu > 50) {
                    descompteaplicat = preu*descompte;
                    if (preudescompte > 15){
                        preudescompte = 15;
                        }
                    preudescompte = preu - descompteaplicat;
                }
                else{
                preudescompte = preu;
                }    
            System.out.println("El preu del producte " + i + " és " + preudescompte);
            i++;
            }
            preutotal += preudescompte;
        }
        System.out.println("El preu final a pagar dels 5 productes és " + preutotal);
    }
}