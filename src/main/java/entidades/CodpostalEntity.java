package entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "CODPOSTAL", schema = "dbo", catalog = "projetoei")
public class CodpostalEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODPOSTAL", nullable = false, length = 20)
    private String codpostal;
    @Basic
    @Column(name = "LOCALIDADE", nullable = false, length = 20)
    private String localidade;

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodpostalEntity that = (CodpostalEntity) o;
        return Objects.equals(codpostal, that.codpostal) && Objects.equals(localidade, that.localidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codpostal, localidade);
    }
}
