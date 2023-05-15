package entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "ESTADO_CONSULTA", schema = "dbo", catalog = "projetoei")
public class EstadoConsultaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ESTADOCONSUL", nullable = false)
    private int idEstadoconsul;
    @Basic
    @Column(name = "DESCRICAO", nullable = false, length = 50)
    private String descricao;

    public int getIdEstadoconsul() {
        return idEstadoconsul;
    }

    public void setIdEstadoconsul(int idEstadoconsul) {
        this.idEstadoconsul = idEstadoconsul;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoConsultaEntity that = (EstadoConsultaEntity) o;
        return idEstadoconsul == that.idEstadoconsul && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstadoconsul, descricao);
    }
}
