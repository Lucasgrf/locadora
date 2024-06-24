package main;

import dao.AddressDAOImplementation;
import dao.CategoryDAOImplementation;
import dao.GenrerDAOImplementation;
import dao.MovieDAOImplementation;
import database.DbConnection;
import model.Categoria;
import model.Endereco;
import model.Genero;
import model.Movie;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        DbConnection.getConnection();

        /*AddressDAOImplementation adressDAO = new AddressDAOImplementation();
        adressDAO.create(new Endereco("Rua Fictícia", "Rua", "Apto 101", "Cidade Exemplo", "EX", "12345-678", "100", "Bairro Exemplo")); CREATE
        System.out.println(adressDAO.get(new Endereco(11))); READ
        System.out.println(adressDAO.getAll()); READ ALL
        adressDAO.update(new Endereco(13,"Rua Fictícia 2", "Rua 2", "Apto 1012", "Cidade Exemplo 2", "EX2", "12345-6782", "1002", "Bairro Exemplo 2")); UPDATE
        System.out.println(adressDAO.get(new Endereco(13)));
        adressDAO.delete(new Endereco(11)); DELETE
        adressDAO.delete(new Endereco(12));
        System.out.println(adressDAO.getAll()); Criação de endereço*/

        /*CategoryDAOImplementation categoryDAO = new CategoryDAOImplementation();
        BigDecimal bd = BigDecimal.valueOf(50.0);
        categoryDAO.create(new Categoria("Adulto", bd));
        categoryDAO.update(new Categoria(17, "Juvenil",bd));
        categoryDAO.delete(new Categoria(11));
        categoryDAO.delete(new Categoria(12));
        categoryDAO.delete(new Categoria(13));
        categoryDAO.delete(new Categoria(14));
        categoryDAO.delete(new Categoria(15));
        categoryDAO.delete(new Categoria(16));
        System.out.println(categoryDAO.get(new Categoria(1)));
        System.out.println(categoryDAO.getAll());*/

        /*GenrerDAOImplementation genrerDAO = new GenrerDAOImplementation();
        genrerDAO.create(new Genero("Policial"));
        genrerDAO.update(new Genero(11,"Investigação"));
        genrerDAO.delete(new Genero(12));
        System.out.println(genrerDAO.get(new Genero(10)));
        System.out.println(genrerDAO.getAll());*/

        /*MovieDAOImplementation movieDAO = new MovieDAOImplementation();
        movieDAO.create(new Movie("Saw - Enigma Mortal","Jogos mortais",10,2,4));
        movieDAO.update(new Movie(24,"Panic! 9", "Pânico! 9", 10, 2,4));
        movieDAO.delete(new Movie(24));
        System.out.println(movieDAO.get(new Movie(1)));
        System.out.println(movieDAO.getAll());*/



        DbConnection.disconnect();
    }
}
