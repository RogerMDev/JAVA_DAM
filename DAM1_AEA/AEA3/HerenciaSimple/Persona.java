package HerenciaSimple;

public class Persona {

    private int id;
    private int edat;
    private String nom;
    private String cognom;
    private String adreca;

    


    public Persona(int id, int edat, String nom, String cognom, String adreca){
        this.id = id;
        this.edat = edat;
        this.nom = nom;
        this.cognom = cognom;
        this.adreca = adreca;
    }

    public int getId() {
        return id;
    }

    public int getEdat() {
        return edat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getAdreca() {
        return adreca;
    }

}
