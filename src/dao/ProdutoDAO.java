package dao;

import dao.interfaces.InterfaceProduto;
import ConnectionFactory.ConexaoPostgres;
import dto.ClienteDTO;
import dto.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO implements InterfaceProduto {

    @Override
    public boolean create(ProdutoDTO obj) throws SQLException {
        Connection con = null;
        PreparedStatement pst = null;
        String sql = "INSERT INTO produto (nome,quantidade,preco,id_fornecedor) VALUES (?,?,?,?)";
        try {
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, obj. getNome());
            pst.setInt(2, obj.getQuantidade());
            pst.setDouble(3, obj.getValor());
            pst.setInt(4, obj.getIdFornecedor());
            pst.execute();
            return true;
        } catch (SQLException e) {
            throw new SQLException("erro ao cadastrar bebida. " + e.getMessage());
        }

    }

    @Override
    public boolean delete(int id) throws SQLException {
        String sql  = "DELETE FROM produto where id = ?";
        Connection con = null;
        PreparedStatement pst = null;
        try{
        con = ConexaoPostgres.getInstance().abrirConexao();
        pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        pst.execute();
        return true;
        }catch(SQLException e){
            throw new SQLException("erro ao deletar produto. "+ e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst);
        }
    }

    @Override
    public ProdutoDTO read() throws SQLException {
        String sql = "SELECT *FROM produto";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<ProdutoDTO> vetorProduto = new ArrayList<ProdutoDTO>();
        ProdutoDTO registroProdutos = new ProdutoDTO();
        try {
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                ProdutoDTO prod = new ProdutoDTO();
               prod.setNome(rs.getString("nome"));
               prod.setValor(rs.getDouble("preco"));
               prod.setQuantidade(rs.getInt("quantidade"));
               prod.setIdRegistro(rs.getInt("id"));
               vetorProduto.add(prod);
            }
            registroProdutos.setProdutosRegistrados(vetorProduto);
        } catch (SQLException e) {
            throw new SQLException("erro ao buscar produtos cadastrados. "+e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
        }
        return registroProdutos;
    }
    @Override
    public ProdutoDTO search(String desc) throws SQLException {
        String slq = "SELECT *FROM produto WHERE nome LIKE ? LIMIT 1";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(slq);
            pst.setString(1,desc+"%");
            rs = pst.executeQuery();
            while(rs.next()){
                ProdutoDTO p = new ProdutoDTO();
                p.setNome(rs.getString("nome"));
                p.setValor(rs.getDouble("preco"));
                p.setIdRegistro(rs.getInt("id"));
                return p;
            }
        }catch(SQLException e){
            throw new SQLException("erro ao buscar produto. "+e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
        }
        return null;
    }

    @Override
    public boolean update(ProdutoDTO obj) throws SQLException {
        String sql = "UPDATE produto SET nome = ?,preco = ?,quantidade = ? WHERE id = ?";
         Connection con = null;
        PreparedStatement pst = null;
        try{
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setDouble(2, obj.getValor());
            pst.setInt(3, obj.getQuantidade());
            pst.setInt(4, obj.getIdRegistro());
            pst.execute();
            return true;
        }catch(SQLException e){
            throw new SQLException("erro ao atualizar dados do produto. " + e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst);
        }
    }
    
}
