import java.util.Scanner;

public class Mod_CalculAreesv2_Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Mod_CalculAreesv2 arees = new Mod_CalculAreesv2();
        LectorDatosTerminal lector = new LectorDatosTerminal();

        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");

        String figura = s.nextLine();
        double area = 0;

        if (figura.equals("triangle")){
            System.out.println("Indica la base: ");
            double base = lector.leerDouble();
            System.out.println("Indica l'alçada");
            double altura = lector.leerDouble();
            area = arees.triangle(base,altura);
        }

        else if (figura.equals("quadrat")){
            double costat = lector.leerDouble();
            area = arees.quadrat(costat);
        }

        else if (figura.equals("rectangle")){
            double costat1 = lector.leerDouble();
            double costat2 = lector.leerDouble();
            area = arees.rectangle(costat1,costat2);
        }

        else if (figura.equals("trapezi")){
            double costat1 = lector.leerDouble();
            double costat2 = lector.leerDouble();
            double alcada = lector.leerDouble();
            area = arees.trapezi(costat1,costat2, alcada);
        }

        else if (figura.equals("rombe")){
            double dM = lector.leerDouble();
            double dm = lector.leerDouble();
            area = arees.rombe(dM,dm);
        }

        else if (figura.equals("paralelogram")){
            double base = lector.leerDouble();
            double h = lector.leerDouble();
            area = arees.paralelogram(base,h);
        }

        else if (figura.equals("cercle")){
            double radi = lector.leerDouble();
            area = arees.cercle(radi);
        }

        if(area == 0){
            System.out.println("Figura incorrecta");
        }
        else{
            System.out.println("L'àrea de "  + figura + " és " + area + ".");
        }
    }
}
