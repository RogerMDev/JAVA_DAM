import java.util.Scanner;

public class CalculArees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tria entre les seguents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");
        String figura = sc.nextLine();
        if ("quadrat".equals(figura)) {
            System.out.println("Digues que mesura el costat del quadrat");
            Float costatquadrat = sc.nextFloat();
            System.out.println("L'area del quadrat es:" + costatquadrat*costatquadrat);
        } else if ("triangle".equals(figura)) {
            System.out.println("Digues que mesura la base del triangle");
            Float basetriangle = sc.nextFloat();
            System.out.println("Digues que mesura la alcada del triangle");
            Float alcadatriangle = sc.nextFloat();
            System.out.println("L'area del triangle es:" + (basetriangle*alcadatriangle)/2);
        } else if ("rectangle".equals(figura)) {
            System.out.println("Digues que mesura la base del rectangle");
            Float baserectangle = sc.nextFloat();
            System.out.println("Digues que mesura la alcada del rectangle");
            Float alcadarectangle = sc.nextFloat();
            System.out.println("L'area del rectangle es:" + baserectangle*alcadarectangle);   
        } else if ("trapezi".equals(figura)) {
            System.out.println("Digues que mesura la base major del trapezi");
            Float basemajortrapezi = sc.nextFloat();
            System.out.println("Digues que mesura la base menor del trapezi");
            Float basemenortrapezi = sc.nextFloat();
            System.out.println("Digues que mesura la alcada del trapezi");
            Float alcadatrapezi = sc.nextFloat();
            System.out.println("L'area del trapezi es:" + ((basemajortrapezi+basemenortrapezi)*alcadatrapezi)/2);  
        } else if ("rombe".equals(figura)) {
            System.out.println("Digues que mesura la diagonal major del rombe");
            Float diagonalmajorrombe = sc.nextFloat();
            System.out.println("Digues que mesura la diagonal menor del rombe");
            Float diagonalmenorrombe = sc.nextFloat();
            System.out.println("L'area del rombe es:" + (diagonalmajorrombe*diagonalmenorrombe)/2); 
        } else if ("paralelogram".equals(figura)) {
            System.out.println("Digues que mesura la base del paralelogram");
            Float baseparalelogram = sc.nextFloat();
            System.out.println("Digues que mesura la alcada del paralelogram");
            Float alcadaparelelogram = sc.nextFloat();
            System.out.println("L'area del paralelogram es:" + baseparalelogram*alcadaparelelogram); 
        } else if ("cercle".equals(figura)) {
            System.out.println("Digues que mesura el radi del cercle");
            Float radicercle = sc.nextFloat();
            double pi = Math.PI;
            System.out.println("L'area del cercle es:" + radicercle*pi);
        } else {
            System.out.println("No has seleccionat una figura valida, torna a intentar-ho");
          }
    }
}