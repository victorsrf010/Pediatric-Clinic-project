package entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "CONSULTAS_MEDICOS", schema = "dbo", catalog = "projetoei")
public class ConsultasMedicosEntity {
    @Basic
    @Column(name = "ID_CONSULTA", nullable = false)
    private int idConsulta;
    @Basic
    @Column(name = "ID_UTENTE", nullable = false)
    private int idUtente;
    @Basic
    @Column(name = "ID_ESTADOCONSUL", nullable = false)
    private int idEstadoconsul;
    @Basic
    @Column(name = "ID_FUNCIONARIO", nullable = false)
    private int idFuncionario;
    @Basic
    @Column(name = "DESCRICAO", nullable = false, length = 100)
    private String descricao;
    @Basic
    @Column(name = "DATA", nullable = false)
    private Date data;
    @Basic
    @Column(name = "HORA", nullable = false, length = 10)
    private String hora;

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public int getIdEstadoconsul() {
        return idEstadoconsul;
    }

    public void setIdEstadoconsul(int idEstadoconsul) {
        this.idEstadoconsul = idEstadoconsul;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultasMedicosEntity that = (ConsultasMedicosEntity) o;
        return idConsulta == that.idConsulta && idUtente == that.idUtente && idEstadoconsul == that.idEstadoconsul && idFuncionario == that.idFuncionario && Objects.equals(descricao, that.descricao) && Objects.equals(data, that.data) && Objects.equals(hora, that.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConsulta, idUtente, idEstadoconsul, idFuncionario, descricao, data, hora);
    }
}
