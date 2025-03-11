public class Allotjament{

    private String nom;
    private int capacitat; 
    private boolean disponible;
    public Allotjament(){

    }

    public Allotjament(String nom, int capacitat, boolean diponible){
        this.nom = nom; 
        this.capacitat = capacitat;
        this.disponible = disponible;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public double calcularPreuPerNit(){
        return 0;
    }

    public void mostrarInformacio(){
        System.out.println("a");
    }

    public boolean reservar(){
        return true;
    }

    public void alliberar(){

    }

}