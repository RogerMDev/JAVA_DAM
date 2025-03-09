
public class Figura{

    String figura;
    private static int id = 0;

    public Figura(){
        ++id;
    }
    
    public Figura(String figura){
        this.figura = figura;            
        //this.id = id;
        id++;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void ImprimirDades(){
        System.out.println("La figura amb id " + getId() + " es un " + getFigura());
        System.out.println("L'area del " + getFigura() + " és: " + calcularArea() );
        System.out.println("---------------------------------");
    }

    public double calcularArea(){
        return 0;
    }

    



}