
public class Director extends Gerente{

    public int accionesEmpresa;

    public Director(String nombre, double salarioBase, double bono, int accionesEmpresa) {
        super(nombre, salarioBase, bono);
        this.accionesEmpresa = accionesEmpresa;
    }


    @Override
    public double calcularSalario(){
        return (this.salarioBase + this.accionesEmpresa);
    }
    @Override
    public void mostrarInfo(){
        System.out.println("El nombre del empleado es: " + this.nombre + " y su salario base + sus acciones es: " + calcularSalario()); 
    }

    public int getAccionesEmpresa() {
        return accionesEmpresa;
    }

    public void setAccionesEmpresa(int accionesEmpresa) {
        this.accionesEmpresa = accionesEmpresa;
    }


    
}