package dao;

import dao.interfaces.InterfaceFornecedor;
import ConnectionFactory.ConexaoPostgres;
import dto.FornecedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FornecedorDAO implements InterfaceFornecedor{
    public FornecedorDAO(){
        
    }
    
    @Override
    public boolean create(FornecedorDTO obj) throws SQLException {
        String sql = "INSERT INTO fornecedor (nome,cnpj,telefone) VALUES (?,?,?)";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCnpj());
            pst.setString(3, obj.getTelefone());
            pst.execute();
            return true;
        } catch (SQLException e) {
            throw new SQLException("erro ao salvar fornecedor. " + e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst);
        }
    }

    @Override
    public FornecedorDTO read() throws SQLException {
        String sql = "SELECT *FROM fornecedor";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<FornecedorDTO> vetorFornecedor = new ArrayList<FornecedorDTO>();
        FornecedorDTO dadosFornecedores = new FornecedorDTO();
        try {
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                FornecedorDTO fornecedor = new FornecedorDTO();
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setIdRegistro(rs.getInt("id"));
                vetorFornecedor.add(fornecedor);
            }
            dadosFornecedores.setFornecedoresRegistrados(vetorFornecedor);
        } catch (SQLException e) {
            throw new SQLException("erro ao buscar fornecedor. " + e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
        }
        return dadosFornecedores;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FornecedorDTO search(String nome) throws SQLException {
          String sql = "SELECT FROM fornecedor WHERE nome like ? LIMIT 1";
          Connection con = null;
          ResultSet rs = null;
          PreparedStatement pst = null;
          try{
              con = ConexaoPostgres.getInstance().abrirConexao();
              pst = con.prepareStatement(sql);
              rs = pst.executeQuery();
              while(rs.next()){
                  FornecedorDTO fornecedor = new FornecedorDTO();
                  fornecedor.setNome(rs.getString("nome"));
                  fornecedor.setCnpj(rs.getString("cnpj"));
                  fornecedor.setIdRegistro(rs.getInt("id"));
                  return fornecedor;
              }
          }catch(SQLException e){
              throw new SQLException("erro ao buscar fornecedor. " + e.getMessage());
          }finally{
              ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
          }
          return null;
    }

    @Override
    public boolean update(FornecedorDTO obj) throws SQLException {
        String sql = "UPDATE fornecedor SET nome = ?, cnpj = ?, telefone = ? WHERE id = ?";
        Connection con = null;
        PreparedStatement pst = null;
        
        try{
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCnpj());
            pst.setString(3, obj.getTelefone());
            pst.setInt(4, obj.getIdRegistro());
            pst.execute();
            return true;
        }catch(SQLException e){
            throw new SQLException("erro ao atualizar dados do fornecedor. " +e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst);
        }
    }

}
