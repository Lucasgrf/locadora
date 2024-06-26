package model;

public class Genero {
    private int id;
    private String nome;
    private static int contador;

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
        contador++;
        return "Genero: " + String.format("%02d",contador) +
                "\nID: " + id +
                " | Nome: " + nome + "\n";
    }
}
