package main;

import dao.CategoriaDAO;
import dao.EnderecoDAO;
import dao.FilmeDAO;
import dao.GeneroDAO;
import database.DbConnection;
import model.Categoria;
import model.Endereco;
import model.Genero;
import model.Movie;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        DbConnection.getConnection();

        EnderecoDAO adressDAO = new EnderecoDAO();
        /*adressDAO.create(new Endereco("Rua Fictícia", "Rua", "Apto 101", "Cidade Exemplo", "EX", "12345-678", "100", "Bairro Exemplo"));
        System.out.println(adressDAO.get(new Endereco(11)));
        System.out.println(adressDAO.getAll());
        adressDAO.update(new Endereco(13,"Rua Fictícia 2", "Rua 2", "Apto 1012", "Cidade Exemplo 2", "EX2", "12345-6782", "1002", "Bairro Exemplo 2"));
        System.out.println(adressDAO.get(new Endereco(13)));
        adressDAO.delete(new Endereco(11));
        adressDAO.delete(new Endereco(12));*/
        System.out.println(adressDAO.getAll());

        CategoriaDAO categoryDAO = new CategoriaDAO();
        /*BigDecimal bd = BigDecimal.valueOf(50.0);
        categoryDAO.create(new Categoria("Adulto", bd));
        categoryDAO.update(new Categoria(17, "Juvenil",bd));
        categoryDAO.delete(new Categoria(11));
        categoryDAO.delete(new Categoria(12));
        categoryDAO.delete(new Categoria(13));
        categoryDAO.delete(new Categoria(14));
        categoryDAO.delete(new Categoria(15));
        categoryDAO.delete(new Categoria(16));
        System.out.println(categoryDAO.get(new Categoria(1)));*/
        System.out.println(categoryDAO.getAll());

        GeneroDAO genrerDAO = new GeneroDAO();
        /*genrerDAO.create(new Genero("Policial"));
        genrerDAO.update(new Genero(11,"Investigação"));
        genrerDAO.delete(new Genero(12));
        System.out.println(genrerDAO.get(new Genero(10)));*/
        System.out.println(genrerDAO.getAll());

        FilmeDAO fDao = new FilmeDAO();
        /*fDao.create(new Movie("Saw - Enigma Mortal","Jogos mortais",10,2,4));
        fDao.update(new Movie(24,"Panic! 9", "Pânico! 9", 10, 2,4));
        fDao.delete(new Movie(24));
        System.out.println(fDao.get(new Movie(1)));
        System.out.println(fDao.getAll());*/



        DbConnection.disconnect();
    }
}
