public class Apartamento extends Alquiler {
    private int hab;
    private boolean cocina;

    public Apartamento(String nombre, int capacidad, int hab, boolean cocina){
        super(nombre, capacidad);
        this.setHab(hab);
        this.setCocina(cocina);
    }

    public int getHab() {
        return hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public boolean getCocina() {
        return cocina;
    }

    public void setCocina(boolean cocina) {
        this.cocina = cocina;
    }
    
    @Override
    public double costeNoche(int numPersones) {
        return 100 + (hab * 10);
    }

    @Override
    public void mostrarInformacio() {
        super.mostrarInformacio();
        System.out.println("Habitacions: " + this.getHab());
        System.out.println("Cocina: " + this.getCocina());
    }
}

