package app2.nomines;

public class Treballador {

    private int id;
    private String nom;
    private String cognoms;
    private double salariBase;
    private double percentatgeDeduccioSegSocial;
    private double percentatgeDeduccioIRPF;
    private double salariNet;

    public Treballador(int id, String nom, String cognoms,
                       double salariBase, double segSocial, double irpf) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.salariBase = salariBase;
        this.percentatgeDeduccioSegSocial = segSocial;
        this.percentatgeDeduccioIRPF = irpf;
    }

    public void calcularSalariNet() {
        double deduccioSS = salariBase * percentatgeDeduccioSegSocial / 100.0;
        double deduccioIRPF = salariBase * percentatgeDeduccioIRPF / 100.0;
        this.salariNet = salariBase - deduccioSS - deduccioIRPF;
    }

    public double getSalariNet() {
        return salariNet;
    }

    @Override
    public String toString() {
        return id + " - " + nom + " " + cognoms + " | Net: " + salariNet;
    }
}
