package app2.lloguers;

public class Immoble {

    private int id;
    private String adreca;
    private String tipus;
    private double llogatMensual;
    private double percentatgeIRPF;
    private double percentatgeDespeses;
    private double ingresNet;

    public Immoble(int id, String adreca, String tipus,
                   double llogatMensual, double irpf, double despeses) {
        this.id = id;
        this.adreca = adreca;
        this.tipus = tipus;
        this.llogatMensual = llogatMensual;
        this.percentatgeIRPF = irpf;
        this.percentatgeDespeses = despeses;
    }

    public void calcularIngresNet() {
        double deduccioIRPF = llogatMensual * percentatgeIRPF / 100.0;
        double deduccioDespeses = llogatMensual * percentatgeDespeses / 100.0;
        this.ingresNet = llogatMensual - deduccioIRPF - deduccioDespeses;
    }

    public double getIngresNet() {
        return ingresNet;
    }

    @Override
    public String toString() {
        return id + " - " + adreca + " [" + tipus + "] | Net: " + ingresNet;
    }
}
