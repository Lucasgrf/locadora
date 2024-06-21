package model;

public class Movie {
    private int id;
    private String titleOrigin;
    private String tittle;
    private int amount;
    private Categoria fkCategoria;
    private Genero fkGenero;

    public Movie() {
    }

    public Movie(int id, String titleOrigin, String tittle, int amount,
                 Categoria categoria, Genero genero) {
        this.id = id;
        this.titleOrigin = titleOrigin;
        this.tittle = tittle;
        this.amount = amount;
        this.fkCategoria = categoria;
        this.fkGenero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleOrigin() {
        return titleOrigin;
    }

    public void setTitleOrigin(String titleOrigin) {
        this.titleOrigin = titleOrigin;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Categoria getCategoria() {
        return fkCategoria;
    }

    public void setCategoria(Categoria categoria) {
        this.fkCategoria = categoria;
    }

    public Genero getGenero() {
        return fkGenero;
    }

    public void setGenero(Genero genero) {
        this.fkGenero = genero;
    }
}
