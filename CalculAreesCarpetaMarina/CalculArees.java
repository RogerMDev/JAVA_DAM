import java.util.Scanner;

public class CalculArees {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");

        String figura = s.nextLine();
        double area = 0;
        boolean noexisteix = false; //OPCIO 2

        if (figura.equalsIgnoreCase("triangle")){ //public static double triangle(int a, int b)
            double b = 23.0;
            double h = 8.0;
            area = (b*h)/2;
        }

        //cas en que la figura = "quadrat"
        else if (figura.equalsIgnoreCase("quadrat")){ // public static double quadrat (double c)
            double costat = 37.0;
            //funció matemàtica que eleva a 2 el radi
            area = Math.pow(costat, 2);
        }

        //cas en que la figura = "rectangle"
        else if (figura.equalsIgnoreCase("rectangle")){
            double a = 68.0;
            double b = 39.0;
            area = a*b;
        }

        //cas en que la figura = "trapezi"
        else if (figura.equalsIgnoreCase("trapezi")){
            double a = 35.0;
            double b = 16.0;
            double h = 5.0;
            area = ((a*b)*h)/2;
        }

        //cas en que la figura = "rombe"
        else if (figura.equalsIgnoreCase("rombe")){
            double dM = 75.0;
            double dm = 30.0;
            area = (dM*dm)/2;
        }

        //cas en que la figura = "paralelogram"
        else if (figura.equalsIgnoreCase("paralelogram")){
            double b = 45.0;
            double h = 13.0;
            area = b*h;
        }

        //cas en que la figura = "cercle"
        else if (figura.equalsIgnoreCase("cercle")){
            System.out.println("Quin es el radi del cercle?");
            double r = s.nextDouble();
            //funció matemàtica que eleva a 2 el radi
            //Math.PI = nombre pi (3.14159....)
            area = Math.pow(r, 2)*Math.PI; // area = r * r* 3.14;
        }
        else{ //OPCIO 2
            noexisteix = true;
        }


        if (noexisteix){ //OPCIO 2
            System.out.println("No és cap figura de les que toquen");
        }
        else{ //OPCIO 2
            System.out.println("L'area del " + figura + " es " + area);
        }


    }
}
