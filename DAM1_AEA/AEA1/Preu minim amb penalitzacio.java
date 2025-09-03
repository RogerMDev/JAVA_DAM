import java.util.Scanner;

public class PreuMinimAmbPenalitzacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quin es el preu del producte en euros?");
        float preu = sc.nextFloat();
        if (preu < 30) {
            System.out.println("El preu final amb penalització per comandes inferiors a 30 euros es:  " + (preu+2) );
        } else {
            System.out.println("El preu final es:  " + preu);
        }
    }
}