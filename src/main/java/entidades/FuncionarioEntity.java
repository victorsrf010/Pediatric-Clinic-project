package entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "FUNCIONARIO", schema = "dbo", catalog = "projetoei")
public class FuncionarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_FUNCIONARIO", nullable = false)
    private int idFuncionario;
    @Basic
    @Column(name = "ID_TIPOFUNCIONARIO", nullable = false)
    private int idTipofuncionario;
    @Basic
    @Column(name = "NOME", nullable = false, length = 60)
    private String nome;
    @Basic
    @Column(name = "NTELEMOVEL", nullable = false, length = 50)
    private String ntelemovel;
    @Basic
    @Column(name = "CODPOSTAL", nullable = false, length = 20)
    private String codpostal;
    @Basic
    @Column(name = "RUA", nullable = false, length = 80)
    private String rua;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;
    @Basic
    @Column(name = "NIF", nullable = false, length = 50)
    private String nif;
    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 10)
    private String password;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdTipofuncionario() {
        return idTipofuncionario;
    }

    public void setIdTipofuncionario(int idTipofuncionario) {
        this.idTipofuncionario = idTipofuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNtelemovel() {
        return ntelemovel;
    }

    public void setNtelemovel(String ntelemovel) {
        this.ntelemovel = ntelemovel;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuncionarioEntity that = (FuncionarioEntity) o;
        return idFuncionario == that.idFuncionario && idTipofuncionario == that.idTipofuncionario && Objects.equals(nome, that.nome) && Objects.equals(ntelemovel, that.ntelemovel) && Objects.equals(codpostal, that.codpostal) && Objects.equals(rua, that.rua) && Objects.equals(email, that.email) && Objects.equals(nif, that.nif) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFuncionario, idTipofuncionario, nome, ntelemovel, codpostal, rua, email, nif, password);
    }
}
