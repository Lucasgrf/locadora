package dao;

import model.Categoria;
import org.postgresql.util.PGmoney;

import java.util.List;

public class CategoryDAOImplementation implements IDaoGeneric<Categoria>{
    private int id;
    private String nome;
    private PGmoney valor;

    public CategoryDAOImplementation() {
    }

    public CategoryDAOImplementation(int id, String nome, PGmoney valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public CategoryDAOImplementation(int id) {
        this.id = id;
    }

    public CategoryDAOImplementation(String nome, PGmoney valor) {
        this.nome = nome;
        this.valor = valor;
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

    public PGmoney getValor() {
        return valor;
    }

    public void setValor(PGmoney valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "CategoryDAOImplementation{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor + "}\n";
    }

    @Override
    public int create(Categoria categoria) {
        return 0;
    }

    @Override
    public int update(Categoria categoria) {
        return 0;
    }

    @Override
    public int delete(Categoria categoria) {
        return 0;
    }

    @Override
    public Categoria get(Categoria categoria) {
        return null;
    }

    @Override
    public List<Categoria> getAll() {
        return List.of();
    }
}
