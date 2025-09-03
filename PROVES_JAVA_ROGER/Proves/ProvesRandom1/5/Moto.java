public class Moto extends Vehiculo{
    int cilindrada;

    public Moto(String marca,String modelo, int anoFab, int cilindrada){
        super(marca, modelo, anoFab);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Soy una moto marca " + super.getMarca() +", modelo " + super.getModelo() + " año " + super.getAnoFab() + " , con " + getCilindrada() + " cilindrada.");
    }

    public int getCilindrada(){
        return cilindrada;
    }

}
