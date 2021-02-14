package dao;

import dao.interfaces.InterfaceFuncionario;
import ConnectionFactory.ConexaoPostgres;
import dto.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioDAO implements InterfaceFuncionario{
    private static FuncionarioDTO logado;
    
    @Override
    public boolean create(FuncionarioDTO obj) throws SQLException{
        String sql = "INSERT INTO funcionario (nome,login,senha) VALUES (?,?,?)";
        Connection con = ConexaoPostgres.getInstance().abrirConexao();
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getLogin());
            pst.setString(3, obj.getSenha());
            pst.execute();
            return true;
        } catch (Exception e) {
            throw new SQLException("ERRO " + e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst);
        }
    }

    @Override
    public FuncionarioDTO search(int id) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = null;
        String sql = "SELECT *FROM funcionario where id = ?";
        FuncionarioDTO fdto = new FuncionarioDTO();
        try {
            con = ConexaoPostgres.getInstance().abrirConexao();

            pst = con.prepareStatement(sql);

            pst.setInt(1, id);
            rs = pst.executeQuery();

            while (rs.next()) {
                fdto.setNome(rs.getString("nome"));
                fdto.setLogin(rs.getString("login"));
                fdto.setSenha(rs.getString("senha"));
            }
            return fdto;
        } catch (SQLException e) {
            throw new SQLException("erro ao buscar funcionário. " + e.getMessage());
        } finally {
            ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
        }
    }

    @Override
    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM funcionario where id = ?";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new SQLException("erro ao deletar funcionário. " + e.getMessage());
        } finally {
            ConexaoPostgres.getInstance().fecharConexao(con, pst);
        }
    }

  
    public boolean logar(String login, String senha) throws SQLException{
        String sql = "SELECT *FROM funcionario where login = ? and senha = ?";
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            FuncionarioDTO logado = this.search(login, senha);
            this.setLogado(logado);
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, login);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            while(rs.next()){
                return true;
            }
        } catch (SQLException e) {
            throw new SQLException("erro ao logar no sistema. " + e.getLocalizedMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
        }
        return false;
    }

    @Override
    public FuncionarioDTO read() throws SQLException {
        String sql = "SELECT *FROM funcionario";
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        FuncionarioDTO registrador = new FuncionarioDTO();
        ArrayList<FuncionarioDTO> vetorFuncionarios = new ArrayList<FuncionarioDTO>();
        try {
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                FuncionarioDTO f = new FuncionarioDTO();
                f.setLogin(rs.getString("login"));
                f.setNome(rs.getString("nome"));
                f.setSenha(rs.getString("senha"));
                f.setIdRegistro(rs.getInt("id"));
                vetorFuncionarios.add(f);
            }
            registrador.setFuncionariosRegistrados(vetorFuncionarios);
        } catch (SQLException e) {
            throw new SQLException("erro ao logar no sistema. " + e.getLocalizedMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
        }
        return registrador;
    }

    @Override
    public boolean update(FuncionarioDTO obj) throws SQLException {
        String sql = "UPDATE funcionario set nome = ?,login = ?,senha = ? WHERE id = ?";
        Connection con = null;
        PreparedStatement pst = null;
        try{
            con = ConexaoPostgres.getInstance().abrirConexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getLogin());
            pst.setString(3, obj.getSenha());
            pst.setInt(4, obj.getIdRegistro());
            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            throw new SQLException("erro ao atualizar dados do funcionário. "+ e.getMessage());
        }finally{
            ConexaoPostgres.getInstance().fecharConexao(con, pst);
        }
    }

    @Override
    public FuncionarioDTO search(String login, String senha) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = null;
        String sql = "SELECT *FROM funcionario where login = ? and senha = ?";
        FuncionarioDTO fdto = new FuncionarioDTO();
        try {
            con = ConexaoPostgres.getInstance().abrirConexao();

            pst = con.prepareStatement(sql);

            pst.setString(1, login);
            pst.setString(2, senha);
            rs = pst.executeQuery();

            while (rs.next()) {
                fdto.setNome(rs.getString("nome"));
                fdto.setLogin(rs.getString("login"));
                fdto.setSenha(rs.getString("senha"));
                fdto.setIdRegistro(rs.getInt("id"));
            }
            return fdto;
        } catch (SQLException e) {
            throw new SQLException("erro ao buscar funcionário. " + e.getMessage());
        } finally {
            ConexaoPostgres.getInstance().fecharConexao(con, pst, rs);
        }
    }

    public FuncionarioDTO getLogado() {
        return logado;
    }

    public void setLogado(FuncionarioDTO logado) {
        FuncionarioDAO.logado = logado;
    }
    
    
}
