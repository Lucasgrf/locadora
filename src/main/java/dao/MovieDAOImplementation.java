package dao;

import model.Movie;

import java.util.List;

public class MovieDAOImplementation implements IDaoGeneric<Movie> {
    @Override
    public int create(Movie movie) {
        return 0;
    }

    @Override
    public int update(Movie movie) {
        return 0;
    }

    @Override
    public int delete(Movie movie) {
        return 0;
    }

    @Override
    public Movie get(Movie movie) {
        return null;
    }

    @Override
    public List<Movie> getAll() {
        return List.of();
    }
}
