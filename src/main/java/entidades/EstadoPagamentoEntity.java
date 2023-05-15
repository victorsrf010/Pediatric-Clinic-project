package entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "ESTADO_PAGAMENTO", schema = "dbo", catalog = "projetoei")
public class EstadoPagamentoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ESTADOPAGAMENTO", nullable = false)
    private int idEstadopagamento;
    @Basic
    @Column(name = "DESCRICAO", nullable = false, length = 50)
    private String descricao;

    public int getIdEstadopagamento() {
        return idEstadopagamento;
    }

    public void setIdEstadopagamento(int idEstadopagamento) {
        this.idEstadopagamento = idEstadopagamento;
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
        EstadoPagamentoEntity that = (EstadoPagamentoEntity) o;
        return idEstadopagamento == that.idEstadopagamento && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstadopagamento, descricao);
    }
}
