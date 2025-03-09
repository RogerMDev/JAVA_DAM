public class Camion extends Vehiculo {

    int capacidadCarga;
    
    public Camion(){

    }

    public Camion(String marca, String modelo, int ano, int velocidadMaxima, int capacidadCarga){
        super(marca, modelo, ano, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    public int getcapacidadCarga(){
        return capacidadCarga;
    }

    public void setcapacidadCarga(int capacidad){
        this.capacidadCarga = capacidad;
    }

    @Override
    public void acelerar(){
        System.out.println("El camión de marca " + getMarca() + " y modelo" + getModelo() + " está acelerando!!");

    }

}
