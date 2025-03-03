package Herencies;

public class Persona {

    int edat;
    String nom;
    String cognom;
    String professio;

    public Persona(){
    }

    public Persona(int edat, String nom, String cognom, String professio){
        this.edat = edat;
        this.nom = nom;
        this.cognom = cognom;
        this.professio = professio;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getProfessio() {
        return professio;
    }

    public void setProfessio(String professio) {
        this.professio = professio;
    }
    
}
