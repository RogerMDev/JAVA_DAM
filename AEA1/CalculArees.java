import java.util.Scanner;

public class CalculArees {
    public void main(String[] args) {
        inici();
    }

    public void inici(){
    Scanner sc = new Scanner(System.in);
        CalculAreesMOD documentcalcul = new CalculAreesMOD();
        System.out.println("Tria entre les seguents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");
        String figura = sc.nextLine();
        boolean pregunta = false;
        while (!pregunta ){
            if ("quadrat".equalsIgnoreCase(figura)) {
            documentcalcul.AreaQuadrat();
            pregunta = true;
            } else if ("triangle".equalsIgnoreCase(figura)) {
            documentcalcul.AreaTriangle();
            pregunta = true;
            
            } else if ("rectangle".equalsIgnoreCase(figura)) {
            documentcalcul.AreaRectangle();
            pregunta = true;

            } else if ("trapezi".equalsIgnoreCase(figura)) {
            documentcalcul.AreaTrapezi();
            pregunta = true;
            
            } else if ("rombe".equalsIgnoreCase(figura)) {
            documentcalcul.AreaRombe();
            pregunta = true;

            } else if ("paralelogram".equalsIgnoreCase(figura)) {
            documentcalcul.AreaParalelogram();
            pregunta = true;

            } else if ("cercle".equalsIgnoreCase(figura)) {
            documentcalcul.AreaCercle();
            pregunta = true;
            
            } else {
            System.out.println("No has seleccionat una figura valida, torna a intentar-ho");
            inici();
            pregunta = true;
            }
        }
    }
}