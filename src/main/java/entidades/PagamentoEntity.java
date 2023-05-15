package entidades;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "PAGAMENTO", schema = "dbo", catalog = "projetoei")
public class PagamentoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PAGAMENTO", nullable = false)
    private int idPagamento;
    @Basic
    @Column(name = "VALOR", nullable = false, precision = 0)
    private double valor;
    @Basic
    @Column(name = "ID_TIPOPAGAMENTO", nullable = false)
    private int idTipopagamento;
    @Basic
    @Column(name = "ID_ESTADOPAGAMENTO", nullable = false)
    private int idEstadopagamento;
    @Basic
    @Column(name = "DATA", nullable = false)
    private Date data;
    @Basic
    @Column(name = "ID_CONSULTA", nullable = false)
    private int idConsulta;

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdTipopagamento() {
        return idTipopagamento;
    }

    public void setIdTipopagamento(int idTipopagamento) {
        this.idTipopagamento = idTipopagamento;
    }

    public int getIdEstadopagamento() {
        return idEstadopagamento;
    }

    public void setIdEstadopagamento(int idEstadopagamento) {
        this.idEstadopagamento = idEstadopagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PagamentoEntity that = (PagamentoEntity) o;
        return idPagamento == that.idPagamento && Double.compare(that.valor, valor) == 0 && idTipopagamento == that.idTipopagamento && idEstadopagamento == that.idEstadopagamento && idConsulta == that.idConsulta && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPagamento, valor, idTipopagamento, idEstadopagamento, data, idConsulta);
    }
}
