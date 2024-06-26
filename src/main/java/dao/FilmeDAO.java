package dao;

import model.Categoria;
import model.Genero;
import model.Movie;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static database.DbConnection.con;

public class FilmeDAO implements IDaoGeneric<Movie> {
    @Override
    public int create(Movie movie) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("insert into filmes(titulo_original,titulo,quantidade,fk_categoria,fk_genero) values (?,?,?,?,?)");
            ps.setString(1, movie.getTitleOrigin());
            ps.setString(2, movie.getTittle());
            ps.setInt(3, movie.getAmount());
            ps.setInt(4, movie.getCategoria().getId());
            ps.setInt(5, movie.getGenero().getId());
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
            ps.setInt(4, movie.getCategoria().getId());
            ps.setInt(5, movie.getGenero().getId());
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
        Genero genero = new Genero();
        Categoria categoria = new Categoria();
        try {
            ps = con.prepareStatement("SELECT * FROM filmes WHERE id = ?");
            ps.setInt(1, movie.getId());
            ResultSet rs = ps.executeQuery();
            CategoriaDAO cDAO = new CategoriaDAO();
            GeneroDAO gDAO = new GeneroDAO();
            if (rs.next()) {
                movie.setTitleOrigin(rs.getString("titulo_original"));
                movie.setTittle(rs.getString("titulo"));
                movie.setAmount(rs.getInt("quantidade"));
                categoria = cDAO.get(new Categoria(rs.getInt("fk_categoria")));
                genero = gDAO.get(new Genero(rs.getInt("fk_genero")));
                movie.setCategoria(categoria);
                movie.setGenero(genero);
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
        Genero genero = new Genero();
        Categoria categoria = new Categoria();
        try {
            ps = con.prepareStatement("select * from filmes order by id");
            ResultSet rs = ps.executeQuery();
            CategoriaDAO cDAO = new CategoriaDAO();
            GeneroDAO gDAO = new GeneroDAO();
            while (rs.next()) {
                movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setTitleOrigin(rs.getString("titulo_original"));
                movie.setTittle(rs.getString("titulo"));
                movie.setAmount(rs.getInt("quantidade"));
                categoria = cDAO.get(new Categoria(rs.getInt("fk_categoria")));
                genero = gDAO.get(new Genero(rs.getInt("fk_genero")));
                movie.setCategoria(categoria);
                movie.setGenero(genero);

                movies.add(movie);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar tabela " + e.getMessage());
        }
        return movies;
    }
}
