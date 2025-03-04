
public class main{

    public static void main(String[] args){

        Empleado e = new Empleado("Roger",10000);

        e.calcularSalario();
        e.mostrarInfo();

        Gerente g = new Gerente("Oscar",1000,5000);

        g.calcularSalario();
        g.mostrarInfo();

        Director d = new Director("Pepe",500,4000,800);

        d.calcularSalario();
        d.mostrarInfo();
    }
}