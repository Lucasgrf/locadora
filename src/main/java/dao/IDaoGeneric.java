package dao;

import model.Movie;

import java.util.List;

public interface IDaoGeneric<T> {
    int create(T object);
    int update(T object);
    int delete(T object);
    T get(T object);
    List<T> getAll();
}
