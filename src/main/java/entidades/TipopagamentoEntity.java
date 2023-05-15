package entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TIPOPAGAMENTO", schema = "dbo", catalog = "projetoei")
public class TipopagamentoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TIPOPAGAMENTO", nullable = false)
    private int idTipopagamento;
    @Basic
    @Column(name = "DESIGNACAO", nullable = false, length = 20)
    private String designacao;

    public int getIdTipopagamento() {
        return idTipopagamento;
    }

    public void setIdTipopagamento(int idTipopagamento) {
        this.idTipopagamento = idTipopagamento;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipopagamentoEntity that = (TipopagamentoEntity) o;
        return idTipopagamento == that.idTipopagamento && Objects.equals(designacao, that.designacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipopagamento, designacao);
    }
}
