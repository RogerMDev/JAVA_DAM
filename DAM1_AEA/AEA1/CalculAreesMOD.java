public class CalculAreesMOD {

    public float AreaQuadrat(float costatquadrat){
        Float areaquadrat = costatquadrat*costatquadrat;
        System.out.println("L'area del quadrat es: " + areaquadrat);
        return areaquadrat;
    }

    public float AreaTriangle(float base, float alcada){
        Float areatriangle = (base*alcada)/2;
        System.out.println("L'area del triangle es: " + areatriangle);
        return areatriangle; 
    }

    public float AreaRectangle(float baserectangle, float alcadarectangle){
        Float arearectangle =baserectangle*alcadarectangle;
        System.out.println("L'area del rectangle es: " + arearectangle); 
        return arearectangle;  
    }

    public float AreaTrapezi(float basemajortrapezi, float basemenortrapezi, float alcadatrapezi){
        
        float areatrapezi = ((basemajortrapezi+basemenortrapezi)*alcadatrapezi)/2;
        System.out.println("L'area del trapezi es: " + areatrapezi);
        return areatrapezi;
    }

    public float AreaRombe(float diagonalmajorrombe, float diagonalmenorrombe){    
        Float arearombe = (diagonalmajorrombe*diagonalmenorrombe)/2;
        System.out.println("L'area del rombe es: " + arearombe); 
        return arearombe;
    }

    public float AreaParalelogram(float baseparalelogram, float alcadaparelelogram){
        Float areaparalelogram = baseparalelogram*alcadaparelelogram;            
        System.out.println("L'area del paralelogram es: " + areaparalelogram); 
        return areaparalelogram;
    }

    public double AreaCercle(double radicercle, double pi){
        double areacercle = radicercle*pi;
        System.out.println("L'area del cercle es: " + areacercle);
        return areacercle;
    }
}
