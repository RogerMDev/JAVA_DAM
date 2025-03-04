
public class Empleado{

    public String nombre;
    public double salarioBase;

    public Empleado(String nom, double salari){
        this.nombre = nom;
        this.salarioBase = salari;
 
    }

    public double calcularSalario(){
        return this.salarioBase;
    }

    public void mostrarInfo(){
        System.out.println("El nombre del empleado es: " + this.nombre + " y su salario base es: " + calcularSalario()); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
}