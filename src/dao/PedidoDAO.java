package dao;

import ConnectionFactory.ConexaoPostgres;
import dao.interfaces.Interfacepedido;
import dto.PedidoDTO;
import dto.RelatorioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PedidoDAO implements Interfacepedido{

    @Override
    public boolean create(PedidoDTO obj) throws SQLException {
        String sql = "INSERT INTO pedido (id_cliente,id_produto,quant,valor_total) VALUES (?,?,?,?)";
        Connection con = null;
        PreparedStatement pst = null;
        try{
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            for(PedidoDTO p : obj.getPedidosRegistrados()){
                pst.setInt(1, p.getIdCliente());
                pst.setInt(2, p.getIdProduto());
                pst.setInt(3, p.getQuantProduto());
                pst.setDouble(4, p.getValorTotal());
                this.update(p.getIdProduto(), p.getQuantProduto());
                pst.executeUpdate();
            }
            return true;
        }catch(SQLException e){
            throw new SQLException("erro ao salvar pedido.\n"+e.getMessage());
        }
    }

    @Override
    public PedidoDTO read() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(int id, int quantAretirar) throws SQLException {
          String sql = "UPDATE produto set quantidade = ? where id = ?";
          Connection con = null;
          PreparedStatement pst = null;
          try{
              int quantidadeAtualProd = this.buscaQuantidadeEstoque(id);
              con = ConexaoPostgres.getInstance().abrirConexao();
              pst = con.prepareStatement(sql);
              pst.setInt(1, quantidadeAtualProd - quantAretirar);
              pst.setInt(2, id);
              pst.executeUpdate();
          }catch(SQLException e){
              throw new SQLException("erro ao atualiar quantidade no estoque. " + e.getMessage());
          }finally{
              ConexaoPostgres.getInstance().fecharConexao(con, pst);
          }
    }
    
    private int buscaQuantidadeEstoque(int idProd) throws SQLException{
        String sql = "SELECT quantidade FROM produto where id = ?";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            pst.setInt(1, idProd);
            rs = pst.executeQuery();
            while(rs.next()){
                return rs.getInt("quantidade");
            }
        }catch(SQLException e){
            throw new SQLException("erro ao busca quantidade estoque." + e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
        }
         return 0;   
    }

    public RelatorioDTO pedidosRegistrados() throws SQLException{
        String sql = "select *from v_relatorio";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        RelatorioDTO registraRelatorios = new RelatorioDTO();
        ArrayList<RelatorioDTO> vetorRelatorios = new ArrayList<RelatorioDTO>();
        try{
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                RelatorioDTO obj = new RelatorioDTO();
                obj.setIdVenda(rs.getInt("id"));
                obj.setNomeCliente(rs.getString("cliente"));
                obj.setNomeProduto(rs.getString("produto"));
                obj.setValorPedido(rs.getDouble("total"));
                vetorRelatorios.add(obj);
            }
            registraRelatorios.setVetorRelatorio(vetorRelatorios);
        }catch(SQLException e){
            throw new SQLException("erro ao busca quantidade estoque." + e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
        }
        return registraRelatorios;
    }
}
