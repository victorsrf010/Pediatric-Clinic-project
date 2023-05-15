package entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "DIAG_CONSUL", schema = "dbo", catalog = "projetoei")
public class DiagConsulEntity {
    @Basic
    @Column(name = "ID_DIAGNOSTICO", nullable = false)
    private int idDiagnostico;
    @Basic
    @Column(name = "ID_CONSULTA", nullable = false)
    private int idConsulta;
    @Basic
    @Column(name = "data", nullable = false)
    private Date data;

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiagConsulEntity that = (DiagConsulEntity) o;
        return idDiagnostico == that.idDiagnostico && idConsulta == that.idConsulta && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDiagnostico, idConsulta, data);
    }
}
