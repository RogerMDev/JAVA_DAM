package cat.dam2.visites.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "VisitesMediques")
public class VisitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVisita", nullable = false)
    private Long idVisita;

    @NotBlank(message = "El nom del pacient és obligatori")
    @Size(max = 40, message = "El nom del pacient no pot superar 40 caràcters")
    @Column(name = "Nom_Pacient", nullable = false, length = 40)
    private String nomPacient;

    @NotBlank(message = "El nom del metge és obligatori")
    @Size(max = 40, message = "El nom del metge no pot superar 40 caràcters")
    @Column(name = "Nom_Metge", nullable = false, length = 40)
    private String nomMetge;

    @NotNull(message = "La data és obligatòria")
    @Column(name = "Data", nullable = false)
    private LocalDate data;

    @NotBlank(message = "El diagnòstic és obligatori")
    @Size(max = 250, message = "El diagnòstic no pot superar 250 caràcters")
    @Column(name = "Diagnostic", nullable = false, length = 250)
    private String diagnostic;

    public Long getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Long idVisita) {
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
