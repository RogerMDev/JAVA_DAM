public class Cercle extends Figura {

    int radi;
    final double pi = 3.1416;

    public Cercle(){

    }
    
    public Cercle(String figura, int radi){
        super(figura);
        this.radi = radi;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }
    
    @Override
    public double calcularArea(){
        double area = pi*(getRadi()^2);
        return area;
    }
}
