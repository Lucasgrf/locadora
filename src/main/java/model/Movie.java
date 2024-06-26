package model;

public class Movie {
    private int id;
    private String titleOrigin;
    private String tittle;
    private int amount;
    private Categoria categoria;
    private Genero genero;

    public Movie() {
    }

    public Movie(int id, String titleOrigin, String tittle, int amount,
                 Categoria categoria, Genero genero) {
        this.id = id;
        this.titleOrigin = titleOrigin;
        this.tittle = tittle;
        this.amount = amount;
        this.categoria = categoria;
        this.genero = genero;
    }

    public Movie(String titleOrigin, String tittle, int amount, Categoria categoria, Genero genero) {
        this.titleOrigin = titleOrigin;
        this.tittle = tittle;
        this.amount = amount;
        this.categoria = categoria;
        this.genero = genero;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titleOrigin='" + titleOrigin + '\'' +
                ", tittle='" + tittle + '\'' +
                ", amount=" + amount +
                ", categoria=" + categoria +
                ", genero=" + genero + "\n";
    }
}
