public class CasaRural extends Allotjament {

    private boolean teJardi;
    private boolean tePiscina;
    private double preuPerNit;

    public CasaRural(){

    }

    public CasaRural(String nom,int capacitat, boolean disponible, boolean teJardi, boolean tePiscina){
        super(nom,capacitat,disponible);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean isTeJardi() {
        return teJardi;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }

    public boolean isTePiscina() {
        return tePiscina;
    }

    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }

    @Override
    public double calcularPreuPerNit(){
        if (this.tePiscina){
            preuPerNit = 150+50;
        } else{
            preuPerNit = 150;
        }
        return preuPerNit;
    }

    @Override
    public void mostrarInformacio(){

    }
    
}
