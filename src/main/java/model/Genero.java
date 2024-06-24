package model;

public class Genero {
    private int id;
    private String nome;

    public Genero() {
    }

    public Genero(String nome) {
        this.nome = nome;
    }
    public Genero(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Genero(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "id=" + id +
                ", nome='" + nome + "\n";
    }
}
