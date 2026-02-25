package prat.dam.visita.domini;

import java.time.LocalDate;

public class Visita {
    private Integer idVisita;
    private String nomPacient;
    private String nomMetge;
    private LocalDate data;
    private String diagnostic;

    public Visita(Integer idVisita, String nomPacient, String nomMetge, LocalDate data, String diagnostic) {
        this.idVisita = idVisita;
        this.nomPacient = nomPacient;
        this.nomMetge = nomMetge;
        this.data = data;
        this.diagnostic = diagnostic;
    }

    public Integer getIdVisita() {
        return idVisita;
    }

    public String getNomPacient() {
        return nomPacient;
    }

    public String getNomMetge() {
        return nomMetge;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    @Override
    public String toString() {
        return idVisita + " | " + nomPacient + " | " + nomMetge + " | " + data + " | " + diagnostic;
    }
}
