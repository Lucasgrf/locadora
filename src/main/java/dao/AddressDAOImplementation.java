package dao;

import model.Endereco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static database.DbConnection.con;

public class AddressDAOImplementation implements IDaoGeneric<Endereco> {
    @Override
    public int create(Endereco endereco) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("insert into enderecos(logradouro,tipo_log,complemento,cidade,uf,cep,numero,bairro) values (?,?,?,?,?,?,?,?)");
            ps.setString(1, endereco.getLogradouro());
            ps.setString(2, endereco.getTipoLogradouro());
            ps.setString(3, endereco.getComplemento());
            ps.setString(4, endereco.getCidade());
            ps.setString(5, endereco.getUf());
            ps.setString(6, endereco.getCep());
            ps.setString(7, endereco.getNumero());
            ps.setString(8, endereco.getBairro());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir endereço: " + e.getMessage());
            return -1;
        }
    }

    @Override
    public int update(Endereco endereco) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE enderecos SET logradouro = ?, tipo_log = ?, complemento = ?, cidade = ?, uf = ?, cep = ?, numero = ?, bairro = ?" +
                    " WHERE id = ?");
            ps.setString(1, endereco.getLogradouro());
            ps.setString(2, endereco.getTipoLogradouro());
            ps.setString(3, endereco.getComplemento());
            ps.setString(4, endereco.getCidade());
            ps.setString(5, endereco.getUf());
            ps.setString(6, endereco.getCep());
            ps.setString(7, endereco.getNumero());
            ps.setString(8, endereco.getBairro());
            ps.setInt(9, endereco.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar endereço: " + e.getMessage());
        }
        return 0;
    }

    @Override
    public int delete(Endereco endereco) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("Delete from enderecos where id = ?");
            ps.setInt(1, endereco.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Endereco get(Endereco endereco) { //Completo
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("SELECT * FROM enderecos WHERE id = ?");
            ps.setInt(1, endereco.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setTipoLogradouro(rs.getString("tipo_log"));
                endereco.setComplemento(rs.getString("complemento"));
                endereco.setCidade(rs.getString("cidade"));
                endereco.setUf(rs.getString("uf"));
                endereco.setCep(rs.getString("cep"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setBairro(rs.getString("bairro"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar endereço: " + e.getMessage());
        }
        return endereco;
    }

    @Override
    public List<Endereco> getAll() { //Completo
        List<Endereco> ends = new ArrayList<Endereco>();
        PreparedStatement ps = null;
        Endereco endereco = null;

        try {
            ps = con.prepareStatement("select * from enderecos order by id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                endereco = new Endereco();
                endereco.setId(rs.getInt("id"));
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setTipoLogradouro(rs.getString("tipo_log"));
                endereco.setComplemento(rs.getString("complemento"));
                endereco.setCidade(rs.getString("cidade"));
                endereco.setUf(rs.getString("uf"));
                endereco.setCep(rs.getString("cep"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setBairro(rs.getString("bairro"));

                ends.add(endereco);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar tabela " + e.getMessage());
        }
        return ends;
    }
}
