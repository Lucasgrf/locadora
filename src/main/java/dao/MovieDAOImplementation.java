package dao;

import model.Categoria;
import model.Endereco;
import model.Genero;
import model.Movie;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static database.DbConnection.con;

public class MovieDAOImplementation implements IDaoGeneric<Movie> {
    @Override
    public int create(Movie movie) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("insert into filmes(titulo_original,titulo,quantidade,fk_categoria,fk_genero) values (?,?,?,?,?)");
            ps.setString(1, movie.getTitleOrigin());
            ps.setString(2, movie.getTittle());
            ps.setInt(3, movie.getAmount());
            ps.setInt(4, movie.getFkCategoria());
            ps.setInt(5, movie.getFkGenero());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir endereço: " + e.getMessage());
            return -1;
        }
    }

    @Override
    public int update(Movie movie) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE filmes SET titulo_original = ?, titulo = ?, quantidade = ?, fk_categoria = ?, fk_genero = ? WHERE id = ?");
            ps.setString(1, movie.getTitleOrigin());
            ps.setString(2, movie.getTittle());
            ps.setInt(3, movie.getAmount());
            ps.setInt(4, movie.getFkCategoria());
            ps.setInt(5, movie.getFkGenero());
            ps.setInt(6, movie.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar endereço: " + e.getMessage());
        }
        return -1;
    }

    @Override
    public int delete(Movie movie) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("Delete from filmes where id = ?");
            ps.setInt(1, movie.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Movie get(Movie movie) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("SELECT * FROM filmes WHERE id = ?");
            ps.setInt(1, movie.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                movie.setTitleOrigin(rs.getString("titulo_original"));
                movie.setTittle(rs.getString("titulo"));
                movie.setAmount(rs.getInt("quantidade"));
                movie.setFkCategoria(rs.getInt("fk_categoria"));
                movie.setFkGenero(rs.getInt("fk_genero"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar endereço: " + e.getMessage());
        }
        return movie;
    }

    @Override
    public List<Movie> getAll() { //Completo
        List<Movie> movies = new ArrayList<Movie>();
        PreparedStatement ps = null;
        Movie movie = null;
        try {
            ps = con.prepareStatement("select * from filmes order by id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setTitleOrigin(rs.getString("titulo_original"));
                movie.setTittle(rs.getString("titulo"));
                movie.setAmount(rs.getInt("quantidade"));
                movie.setFkCategoria(rs.getInt("fk_categoria"));
                movie.setFkGenero(rs.getInt("fk_genero"));

                movies.add(movie);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar tabela " + e.getMessage());
        }
        return movies;
    }
}
