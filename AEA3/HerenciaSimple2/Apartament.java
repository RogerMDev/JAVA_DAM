public class Apartament extends Allotjament {
    
    private int habitacions;
    private boolean teCuina;
    private double preuPerNit;
    private boolean disponible;

    public Apartament(){

    }

    public Apartament(String nom, int capacitat, boolean disponible, int habitacions, boolean teCuina){
        super(nom,capacitat);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
        this.disponible = disponible;
    }

    public int getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }

    public boolean isTeCuina() {
        return teCuina;
    }

    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
    }

    @Override
    public double calcularPreuPerNit(){
        preuPerNit = 100+(10*this.getHabitacions());
        return preuPerNit;
    }

    @Override
    public void mostrarInformacio(){
        System.out.print("Apartament: " + getNom() + " (Habitacions: " + getHabitacions() + ", Cuina:");
        if (isTeCuina()){
            System.out.print("Sí)");
        } else{
            System.out.print("No)");
        }
        if (isDisponible()){
            System.out.print(" - Disponible");
        } else{
            System.out.print(" - No disponible");
        }

    }
    
    @Override
    public boolean isDisponible(){
        return disponible;
    }

    @Override
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
}
