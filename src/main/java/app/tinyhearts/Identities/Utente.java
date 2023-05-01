package app.tinyhearts.Identities;

public class Utente {
    private String nome;
    private String nif;

    public Utente(String nome, String nif) {
        this.nome = nome;
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public String getNif() {
        return nif;
    }
}
