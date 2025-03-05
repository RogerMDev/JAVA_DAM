
public class Gerente extends Empleado{

    public double bono;

    public Gerente(String nombre, double salarioBase, double bono){
        super(nombre, salarioBase);
        this.bono = bono;

    }

    @Override
    public double calcularSalario(){
        return (getSalarioBase() + getBono());
    }

    @Override
    public void mostrarInfo(){
        System.out.println("El nombre del empleado es: " + getNombre() + " y su salario base + su bono es: " + calcularSalario()); 
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

}