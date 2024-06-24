package dao;

import model.Endereco;
import model.Genero;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static database.DbConnection.con;

public class GenrerDAOImplementation implements IDaoGeneric<Genero>{
    @Override
    public int create(Genero genero) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("insert into generos(nome) values (?)");
            ps.setString(1, genero.getNome());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir gênero: " + e.getMessage());
            return -1;
        }
    }

    @Override
    public int update(Genero genero) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE generos SET  nome = ? WHERE id = ?");
            ps.setString(1, genero.getNome());
            ps.setInt(2, genero.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar gênero: " + e.getMessage());
        }
        return 0;
    }

    @Override
    public int delete(Genero genero) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("Delete from generos where id = ?");
            ps.setInt(1, genero.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Genero get(Genero genero) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("SELECT * FROM generos WHERE id = ?");
            ps.setInt(1, genero.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                genero.setNome(rs.getString("nome"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar endereço: " + e.getMessage());
        }
        return genero;
    }

    @Override
    public List<Genero> getAll() { //Completo
        List<Genero> genrers = new ArrayList<Genero>();
        PreparedStatement ps = null;
        Genero genero = null;

        try {
            ps = con.prepareStatement("select * from generos order by id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                genero = new Genero();
                genero.setId(rs.getInt("id"));
                genero.setNome(rs.getString("nome"));

                genrers.add(genero);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar tabela " + e.getMessage());
        }
        return genrers;
    }
}
