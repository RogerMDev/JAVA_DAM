public class CasaRural extends Alquiler {
    private boolean piscina;
    private boolean jardin;

    CasaRural(String nombre, int capacidad, boolean piscina, boolean jardin){
        super(nombre, capacidad);
        this.setPiscina(piscina);
        this.setJardin(jardin);
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean getJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    @Override
    public double costeNoche(int numPersones) {
        if (piscina)
            return 200;
        else
            return 150;
    }
    
    @Override
    public void mostrarInformacio() {
        super.mostrarInformacio();
        System.out.println("Piscina: " + this.getPiscina());
        System.out.println("Jardin: " + this.getJardin());
    }
}
