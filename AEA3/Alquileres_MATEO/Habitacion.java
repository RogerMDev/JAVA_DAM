
public class Habitacion extends Alquiler {
    private int numCamas;
    public Habitacion(String nombre, int capacidad, int numCamas){
        super(nombre, capacidad);
        this.setNumCamas(numCamas);
    }
    
    public int getNumCamas() {
        return numCamas;
    }
    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }
    @Override
    public double costeNoche(int numPersones) {
        if (numCamas < 3)
            return 50;
        else
            return 50 + (numCamas -3) * 20;
    }

    @Override
    public void mostrarInformacio() {
        super.mostrarInformacio();
        System.out.println("Numero de camas: " + this.getNumCamas());
    }
}
