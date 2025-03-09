public class Coche extends Vehiculo {

    int numPuertas;

    public Coche(){

    }

    public Coche(String marca, String modelo, int ano, int velocidadMaxima, int numPuertas ){
        super(marca, modelo, ano, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public void acelerar(){
        System.out.println("El coche " + getModelo() + " está acelerando!!");
    }

    
}
