public class Mod_CalculAreesv2 {

    public double triangle(double base, double altura){
        return (base * altura)/2;
    }

    public double quadrat (double c){
        return Math.pow(c, 2);
    }

    public double rectangle (double c1, double c2){
        return c1*c2;
    }

    public double trapezi(double a, double b, double h){
        return ((a*b)*h)/2;
    }

    public double paralelogram(double b, double h){
        return b*h;
    }

    public double cercle(double r){
        return Math.pow(r, 2)*Math.PI;
    }

    public double rombe (double dM, double dm){
        return (dM*dm)/2;
    }
}
