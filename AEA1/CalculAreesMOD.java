import java.util.Scanner;

public class CalculAreesMOD {

    Scanner sc = new Scanner(System.in);

    public float AreaQuadrat(){
        System.out.println("Digues que mesura el costat del quadrat");
        Float costatquadrat = sc.nextFloat();
        System.out.println("L'area del quadrat es: " + costatquadrat*costatquadrat);
        return costatquadrat;
    }

    public float AreaTriangle(){
        System.out.println("Digues que mesura la base del triangle");
        Float basetriangle = sc.nextFloat();
        System.out.println("Digues que mesura la alcada del triangle");
        Float alcadatriangle = sc.nextFloat();
        Float areatriangle = (basetriangle*alcadatriangle)/2;
        System.out.println("L'area del triangle es: " + areatriangle);
        return areatriangle; 
    }

    public float AreaRectangle(){
        System.out.println("Digues que mesura la base del rectangle");
        Float baserectangle = sc.nextFloat();
        System.out.println("Digues que mesura la alcada del rectangle");
        Float alcadarectangle = sc.nextFloat();
        Float arearectangle =baserectangle*alcadarectangle;
        System.out.println("L'area del rectangle es: " + arearectangle); 
        return arearectangle;  
    }

    public float AreaTrapezi(){
        System.out.println("Digues que mesura la base major del trapezi");
        Float basemajortrapezi = sc.nextFloat();
        System.out.println("Digues que mesura la base menor del trapezi");
        Float basemenortrapezi = sc.nextFloat();
        System.out.println("Digues que mesura la alcada del trapezi");
        Float alcadatrapezi = sc.nextFloat();
        Float areatrapezi = ((basemajortrapezi+basemenortrapezi)*alcadatrapezi)/2;
        System.out.println("L'area del trapezi es: " + areatrapezi);
        return areatrapezi;
    }

    public float AreaRombe(){
        System.out.println("Digues que mesura la diagonal major del rombe");
        Float diagonalmajorrombe = sc.nextFloat();
        System.out.println("Digues que mesura la diagonal menor del rombe");
        Float diagonalmenorrombe = sc.nextFloat();    
        Float arearombe = (diagonalmajorrombe*diagonalmenorrombe)/2;
        System.out.println("L'area del rombe es: " + arearombe); 
        return arearombe;
    }

    public float AreaParalelogram(){
        System.out.println("Digues que mesura la base del paralelogram");
        Float baseparalelogram = sc.nextFloat();
        System.out.println("Digues que mesura la alcada del paralelogram");
        Float alcadaparelelogram = sc.nextFloat();
        Float areaparalelogram = baseparalelogram*alcadaparelelogram;            
        System.out.println("L'area del paralelogram es: " + areaparalelogram); 
        return areaparalelogram;
    }

    public double AreaCercle(){
        System.out.println("Digues que mesura el radi del cercle");
        double radicercle = sc.nextDouble();
        double pi = Math.PI;
        double areacercle = radicercle*pi;
        System.out.println("L'area del cercle es: " + areacercle);
        return areacercle;
    }
}
