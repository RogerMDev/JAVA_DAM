public abstract class Player {

    String nom;
    String cognom;
    int edat;
    int nivell;

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

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

}
