public class Moto extends Vehiculo{

    String tipoManillar;

    public Moto(){
    }

    public Moto(String marca, String modelo, int ano, int velocidadMaxima, String tipoManillar){
        super(marca, modelo, ano, velocidadMaxima);
        this.tipoManillar = tipoManillar;
    }

    public String gettipoManillar(){
        return tipoManillar;
    }

    public void settipoManillar(String tipoManillar){
        this.tipoManillar = tipoManillar;
    }

    @Override
    public void acelerar(){
        System.out.println(" La moto de la marca " + getMarca() + " y modelo " + getModelo() + " ha acelerado!!");
    }
    

}