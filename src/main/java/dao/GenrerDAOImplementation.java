package dao;

import model.Genero;

import java.util.List;

public class GenrerDAOImplementation implements IDaoGeneric<Genero>{
    @Override
    public int create(Genero genero) {
        return 0;
    }

    @Override
    public int update(Genero genero) {
        return 0;
    }

    @Override
    public int delete(Genero genero) {
        return 0;
    }

    @Override
    public Genero get(Genero genero) {
        return null;
    }

    @Override
    public List<Genero> getAll(Genero genero) {
        return List.of();
    }
}
