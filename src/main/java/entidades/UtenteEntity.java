package entidades;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "UTENTE", schema = "dbo", catalog = "projetoei")
public class UtenteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_UTENTE", nullable = false)
    private int idUtente;
    @Basic
    @Column(name = "NIF", nullable = false, length = 50)
    private String nif;
    @Basic
    @Column(name = "NOME", nullable = false, length = 60)
    private String nome;
    @Basic
    @Column(name = "NTELEMOVEL", nullable = false, length = 50)
    private String ntelemovel;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;
    @Basic
    @Column(name = "DATA_DE_NASCIMENTO", nullable = false)
    private Date dataDeNascimento;
    @Basic
    @Column(name = "NOME_REP", nullable = false, length = 150)
    private String nomeRep;
    @Basic
    @Column(name = "sexo", nullable = true, length = 20)
    private String sexo;

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNomeRep() {
        return nomeRep;
    }

    public void setNomeRep(String nomeRep) {
        this.nomeRep = nomeRep;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtenteEntity that = (UtenteEntity) o;
        return idUtente == that.idUtente && Objects.equals(nif, that.nif) && Objects.equals(nome, that.nome) && Objects.equals(ntelemovel, that.ntelemovel) && Objects.equals(email, that.email) && Objects.equals(dataDeNascimento, that.dataDeNascimento) && Objects.equals(nomeRep, that.nomeRep) && Objects.equals(sexo, that.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUtente, nif, nome, ntelemovel, email, dataDeNascimento, nomeRep, sexo);
    }
}
