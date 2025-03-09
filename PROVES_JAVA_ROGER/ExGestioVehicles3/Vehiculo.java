public class Vehiculo{

    String marca;
    String modelo;
    int ano;
    int velocidadMaxima;

    public Vehiculo(){
        
    }

    public Vehiculo(String marca, String modelo,int ano, int velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadMaxima = velocidadMaxima;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInfo(){
        System.out.println("El vehículo es del año " + getAno() + " ,de la marca " + getMarca() + " y es el modelo " + getModelo() + " , además tiene una velocidad máxima de: " + getVelocidadMaxima() + " km/h." );
    }

    public void acelerar(){
        //????
    }



     
    
    
}