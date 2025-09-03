public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anoFab;

    public Vehiculo(String marca1, String modelo1, int ano){
        this.marca = marca1;
        this.modelo = modelo1;
        this.anoFab = ano;
    }

    public abstract void mostrarInfo();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }
}
