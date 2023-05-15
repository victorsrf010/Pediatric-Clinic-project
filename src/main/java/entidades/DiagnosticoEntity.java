package entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "DIAGNOSTICO", schema = "dbo", catalog = "projetoei")
public class DiagnosticoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_DIAGNOSTICO", nullable = false)
    private int idDiagnostico;
    @Basic
    @Column(name = "SINTOMAS", nullable = false, length = 200)
    private String sintomas;
    @Basic
    @Column(name = "DESC_TRATAMENTO", nullable = false, length = 200)
    private String descTratamento;

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDescTratamento() {
        return descTratamento;
    }

    public void setDescTratamento(String descTratamento) {
        this.descTratamento = descTratamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiagnosticoEntity that = (DiagnosticoEntity) o;
        return idDiagnostico == that.idDiagnostico && Objects.equals(sintomas, that.sintomas) && Objects.equals(descTratamento, that.descTratamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDiagnostico, sintomas, descTratamento);
    }
}
