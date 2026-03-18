package prat.dam.c2526._6.acd.p02.api.model.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VisitesMediques")
public class VisitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVisita", nullable = false)
    private Integer idVisita;

    @Column(name = "Nom_Pacient", nullable = false, length = 40)
    private String nomPacient;

    @Column(name = "Nom_Metge", nullable = false, length = 40)
    private String nomMetge;

    @Column(name = "Data", nullable = false)
    private LocalDate data;

    @Column(name = "Diagnostic", nullable = false, length = 250)
    private String diagnostic;

    public Integer getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public String getNomPacient() {
        return nomPacient;
    }

    public void setNomPacient(String nomPacient) {
        this.nomPacient = nomPacient;
    }

    public String getNomMetge() {
        return nomMetge;
    }

    public void setNomMetge(String nomMetge) {
        this.nomMetge = nomMetge;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
}
