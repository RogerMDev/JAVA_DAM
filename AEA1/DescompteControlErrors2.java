import java.util.Scanner;
//Un programa que calcula descomptes.
public class DescompteControlErrors2 {

    public static void main (String[] args) {
      Scanner lector = new Scanner(System.in);
      //PASSOS 2 i 3
      System.out.print("Quin és el preu del producte, en euros? ");
      float preu = lector.nextFloat();
      lector.nextLine();

      //declarem variables
      //Es fa un descompte del 8%.
      float DESCOMPTE = 8;
      //Es fa descompte per compres de 100 euros o més.
      float COMPRA_MIN = 100;
      //Valor del descompte màxim: 10 euros.
      float DESC_MAXIM = 10;
      //variable descompteFet
      float descompteFet = 0;

      
      if (preu > 0) {
        
        if (preu >= COMPRA_MIN) {
          
          descompteFet = preu * DESCOMPTE / 100;
          
          if (descompteFet > DESC_MAXIM) {
            descompteFet = DESC_MAXIM;
          }
          preu = preu - descompteFet;
        }
        System.out.println("El preu és de " + preu + " euros.");

      }
      else {
    
        System.out.println("Preu incorrecte. És negatiu.");
      }
  }
}