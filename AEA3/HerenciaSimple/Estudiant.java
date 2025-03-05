package HerenciaSimple;

public class Estudiant extends Persona {

    private String curs;
    private String[] assignatures;
    private String escola;
    private double[] notes;

    public Estudiant(int id, int edat, String nom, String cognom, String adreca, String curs, String[] assignatures, String escola, double[] notes) {
        super(id, edat, nom, cognom, adreca);
        this.curs = curs;
        this.assignatures = assignatures;
        this.escola = escola;
        this.notes = notes;
    }

    // Afegim els getters y setters
    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String[] getAssignatures() {
        return assignatures; 
    }

    public void setAssignatures(String[] assignatures) {
        this.assignatures = assignatures;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }
}

