import java.util.Scanner;

public class TEST123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digues el preu en euros");
        float preu = sc.nextFloat();

        //Declaració de variables
        float Descompte = 8;

        float CompraMin = 100;

        float DescMax = 10;

        float descomptefet = 0;

        if (preu > 0) {

            if (preu >= CompraMin) {

                descomptefet = preu * Descompte / 100;

            }   if (descomptefet > DescMax){

                descomptefet = DescMax;
            }
        preu = preu - descomptefet;
        
        System.out.println("El preu final es de " + preu + "euros");
        } else {
            System.out.println("El preu es negatiu");
        }
    }
}