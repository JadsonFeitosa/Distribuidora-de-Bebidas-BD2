package controle;

import dto.FuncionarioDTO;
import java.sql.SQLException;
import modelo.Funcionario;

public class ControleFuncionario {
    private Funcionario f;
    
    public ControleFuncionario(){
        f = new Funcionario();
    }
    
    public boolean create(FuncionarioDTO obj) throws SQLException{
         return f.create(obj);
      }
    public FuncionarioDTO read() throws SQLException{
        return f.read();
    }
    public boolean delete (int id) throws SQLException{
        return f.delete(id);
    }
    public FuncionarioDTO search(int id) throws SQLException{
        return f.search(id);
    }
    public FuncionarioDTO search(String login, String senha) throws SQLException{
        return f.search(login, senha);
    }
    public boolean update(FuncionarioDTO obj) throws SQLException{
        return f.update(obj);
    }
    
    public boolean loguinSistema(String login, String senha) throws SQLException{
        return f.logaSistema(login, senha);
    }
    
    public FuncionarioDTO getLogado(){
        return f.funcionarioLogado();
    }
    public void setLogado(FuncionarioDTO obj){
        f.setLogado(obj);
    }
}
