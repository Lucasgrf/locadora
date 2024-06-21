package dao;

import model.Categoria;

import java.util.List;

public class CategoryDAOImplementation implements IDaoGeneric<Categoria>{
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
    public List<Categoria> getAll(Categoria Categoria) {
        return List.of();
    }
}
