public class Apartament extends Allotjament {
    
    private int habitacions;
    private boolean teCuina;
    private double preuPerNit;

    public Apartament(){

    }

    public Apartament(String nom, int capacitat, boolean disponible, int habitacions, boolean teCuina){
        super(nom,capacitat, disponible);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
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
    
}
