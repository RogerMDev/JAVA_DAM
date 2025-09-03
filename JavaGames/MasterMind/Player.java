public abstract class Player {

    String nom;
    String cognom;

    public abstract String makeGuess();

    public abstract void OmplirDades();

    public abstract void presentacio();
    
    public String getNom(){
        return nom;
    } 

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    
}
