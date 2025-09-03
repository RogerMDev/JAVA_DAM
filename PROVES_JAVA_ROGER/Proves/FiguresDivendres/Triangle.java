public class Triangle extends Figura {

    int base;
    int h;

    public Triangle(){

    }
    
    public Triangle(String figura, int base, int h){
        super(figura);
        this.base = base;
        this.h = h;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calcularArea(){
        double area = (getBase() * getH())/2;
        return area;
    }
}


