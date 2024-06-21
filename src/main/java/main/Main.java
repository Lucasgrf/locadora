package main;

import dao.AddressDAOImplementation;
import database.DbConnection;
import model.Endereco;

public class Main {
    public static void main(String[] args) {
        DbConnection.getConnection();

        AddressDAOImplementation adressDAO = new AddressDAOImplementation();
        //adressDAO.create(new Endereco("Rua Fictícia", "Rua", "Apto 101", "Cidade Exemplo", "EX", "12345-678", "100", "Bairro Exemplo")); CREATE
        System.out.println(adressDAO.get(new Endereco(11))); //READ
        System.out.println(adressDAO.get(new Endereco(12)));
        System.out.println(adressDAO.get(new Endereco(13)));


        DbConnection.disconnect();
    }
}
