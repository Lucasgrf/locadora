package model;

public class Movie {
    private int id;
    private String titleOrigin;
    private String tittle;
    private int amount;
    private int fkCategoria;
    private int fkGenero;

    public Movie() {
    }

    public Movie(int id, String titleOrigin, String tittle, int amount,
                 int categoria, int genero) {
        this.id = id;
        this.titleOrigin = titleOrigin;
        this.tittle = tittle;
        this.amount = amount;
        this.fkCategoria = categoria;
        this.fkGenero = genero;
    }

    public Movie(String titleOrigin, String tittle, int amount, int fkCategoria, int fkGenero) {
        this.titleOrigin = titleOrigin;
        this.tittle = tittle;
        this.amount = amount;
        this.fkCategoria = fkCategoria;
        this.fkGenero = fkGenero;
    }

    public Movie(int id) {
        this.id = id;
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

    public int getFkCategoria() {
        return fkCategoria;
    }

    public void setFkCategoria(int fkCategoria) {
        this.fkCategoria = fkCategoria;
    }

    public int getFkGenero() {
        return fkGenero;
    }

    public void setFkGenero(int fkGenero) {
        this.fkGenero = fkGenero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titleOrigin='" + titleOrigin + '\'' +
                ", tittle='" + tittle + '\'' +
                ", amount=" + amount +
                ", fkCategoria=" + fkCategoria +
                ", fkGenero=" + fkGenero + "\n";
    }
}
