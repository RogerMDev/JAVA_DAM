import java.util.Scanner;

public class CalculArees {
    public static void main(String[] args) {
        inici();
    }

    public static void inici(){
    Scanner sc = new Scanner(System.in);
    CalculAreesMOD documentcalcul = new CalculAreesMOD();
    System.out.println("Tria entre les seguents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");        String figura = sc.nextLine();
    boolean pregunta = false;

        while (!pregunta ){

            if ("quadrat".equalsIgnoreCase(figura)) {
            System.out.println("Digues quant mesuren els costats del quadrat");
            float costatQ = sc.nextFloat();
            documentcalcul.AreaQuadrat(costatQ);
            pregunta = true;
            
            } else if ("triangle".equalsIgnoreCase(figura)) {
            System.out.println("Digues quant mesura la base del triangle");
            float base = sc.nextFloat();
            System.out.println("Digues quant mesura la alçada del triangle");
            float alcada = sc.nextFloat();
            documentcalcul.AreaTriangle(base, alcada);
            pregunta = true;
            
            } else if ("rectangle".equalsIgnoreCase(figura)) {
            System.out.println("Digues quant mesura la base del rectangle");
            float base = sc.nextFloat();
            System.out.println("Digues quant mesura la alçada del triangle");
            float alcada = sc.nextFloat();
            documentcalcul.AreaRectangle(base, alcada);
            pregunta = true;
            
            } else if ("trapezi".equalsIgnoreCase(figura)) {
            System.out.println("Digues que mesura la base major del trapezi");
            Float basemajortrapezi = sc.nextFloat();
            System.out.println("Digues que mesura la base menor del trapezi");
            Float basemenortrapezi = sc.nextFloat();          
            System.out.println("Digues que mesura la alcada del trapezi");
            Float alcadatrapezi = sc.nextFloat();
            
            documentcalcul.AreaTrapezi(basemajortrapezi,basemenortrapezi,alcadatrapezi);
            pregunta = true;
            
            } else if ("rombe".equalsIgnoreCase(figura)) {
            
            System.out.println("Digues que mesura la diagonal major del rombe");
            Float diagonalmajorrombe = sc.nextFloat();
            System.out.println("Digues que mesura la diagonal menor del rombe");
            Float diagonalmenorrombe = sc.nextFloat();
            documentcalcul.AreaRombe(diagonalmajorrombe, diagonalmenorrombe);
            pregunta = true;

            } else if ("paralelogram".equalsIgnoreCase(figura)) {
            System.out.println("Digues que mesura la base del paralelogram");
            Float baseparalelogram = sc.nextFloat();
            System.out.println("Digues que mesura la alcada del paralelogram");
            Float alcadaparelelogram = sc.nextFloat();
            documentcalcul.AreaParalelogram(baseparalelogram,alcadaparelelogram);
            pregunta = true;

            } else if ("cercle".equalsIgnoreCase(figura)) {
            System.out.println("Digues que mesura el radi del cercle");
            double radicercle = sc.nextDouble();
            double nombrepi = 3.14;
            documentcalcul.AreaCercle(radicercle, nombrepi);
            pregunta = true;
            
            } else {
            System.out.println("No has seleccionat una figura valida, torna a intentar-ho");
            pregunta = false;
            }
        }
        sc.close();
    }
}