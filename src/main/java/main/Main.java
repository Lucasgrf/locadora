package main;

import dao.AddressDAOImplementation;
import database.DbConnection;
import model.Endereco;

public class Main {
    public static void main(String[] args) {
        DbConnection.getConnection();

        AddressDAOImplementation adressDAO = new AddressDAOImplementation();
        /*adressDAO.create(new Endereco("Rua Fictícia", "Rua", "Apto 101", "Cidade Exemplo", "EX", "12345-678", "100", "Bairro Exemplo")); CREATE
        System.out.println(adressDAO.get(new Endereco(11))); READ
        System.out.println(adressDAO.getAll()); READ ALL
        adressDAO.update(new Endereco(13,"Rua Fictícia 2", "Rua 2", "Apto 1012", "Cidade Exemplo 2", "EX2", "12345-6782", "1002", "Bairro Exemplo 2")); UPDATE
        System.out.println(adressDAO.get(new Endereco(13)));*/

        //adressDAO.delete(new Endereco(11)); DELETE
        //adressDAO.delete(new Endereco(12));
        System.out.println(adressDAO.getAll());


        DbConnection.disconnect();
    }
}
