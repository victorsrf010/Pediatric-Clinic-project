package entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TIPOFUNCIONARIO", schema = "dbo", catalog = "projetoei")
public class TipofuncionarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TIPOFUNCIONARIO", nullable = false)
    private int idTipofuncionario;
    @Basic
    @Column(name = "CARGO", nullable = false, length = 20)
    private String cargo;

    public int getIdTipofuncionario() {
        return idTipofuncionario;
    }

    public void setIdTipofuncionario(int idTipofuncionario) {
        this.idTipofuncionario = idTipofuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipofuncionarioEntity that = (TipofuncionarioEntity) o;
        return idTipofuncionario == that.idTipofuncionario && Objects.equals(cargo, that.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipofuncionario, cargo);
    }
}
