package Herencies;

public class Estudiant extends Persona{

    int num_assignatures;
    int curs_actual;

    public Estudiant(int curs_actual, int num_assignatures, int edat, String nom, String cognom, String professio) {
        super(edat, nom, cognom, professio);
        this.curs_actual = curs_actual;
        this.num_assignatures = num_assignatures;
    }

    public int getNum_assignatures() {
        return num_assignatures;
    }

    public void setNum_assignatures(int num_assignatures) {
        this.num_assignatures = num_assignatures;
    }

    public int getCurs_actual() {
        return curs_actual;
    }

    public void setCurs_actual(int curs_actual) {
        this.curs_actual = curs_actual;
    }






}
