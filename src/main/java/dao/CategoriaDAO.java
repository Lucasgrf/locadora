package dao;

import model.Categoria;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static database.DbConnection.con;

public class CategoriaDAO implements IDaoGeneric<Categoria>{

    @Override
    public int create(Categoria categoria) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("insert into categorias(nome,valor) values (?,?)");
            ps.setString(1, categoria.getNome());
            ps.setBigDecimal(2, categoria.getValor());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir categoria: " + e.getMessage());
            return -1;
        }
    }

    @Override
    public int update(Categoria categoria) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE categorias SET nome = ?, valor = ? WHERE id = ?");
            ps.setString(1, categoria.getNome());
            ps.setBigDecimal(2, categoria.getValor());
            ps.setInt(3, categoria.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar categoria: " + e.getMessage());
        }
        return 0;
    }

    @Override
    public int delete(Categoria categoria) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("Delete from categorias where id = ?");
            ps.setInt(1, categoria.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Categoria get(Categoria categoria) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("SELECT * FROM categorias WHERE id = ?");
            ps.setInt(1, categoria.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                categoria.setNome(rs.getString("nome"));
                String valorString = rs.getString("valor").replaceAll("[^0-9.,]", "");
                valorString = valorString.replace(',', '.');
                BigDecimal valor = new BigDecimal(valorString);
                categoria.setValor(valor);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar categoria: " + e.getMessage());
        }
        return categoria;
    }

    @Override
    public List<Categoria> getAll() {
        PreparedStatement ps = null;
        List<Categoria> categorias = new ArrayList<Categoria>();
        try {
            ps = con.prepareStatement("SELECT * FROM categorias");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));

                String valorString = rs.getString("valor").replaceAll("[^0-9.,]", "");
                valorString = valorString.replace(',', '.');
                BigDecimal valor = new BigDecimal(valorString);

                categoria.setValor(valor);
                categorias.add(categoria);
            }
            return categorias;
        }catch (SQLException e){
            throw new RuntimeException("Erro ao obter os dados da tabela. " + e);
        }
    }
}
