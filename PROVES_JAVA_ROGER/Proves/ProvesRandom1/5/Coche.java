public class Coche extends Vehiculo {

    int numPuertas;

    public Coche(String marca, String modelo, int anoFabr, int numPuertas){
        super(marca, modelo, anoFabr);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Soy un coche marca " + super.getMarca() +", modelo " + super.getModelo() + " año " + super.getAnoFab() + " , con " + getNumPuertas() + " puertas.");
    }

    public int getNumPuertas() {
        return numPuertas;
    }
    
}
