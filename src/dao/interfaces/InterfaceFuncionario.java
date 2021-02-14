package dao.interfaces;

import dto.FuncionarioDTO;
import java.sql.SQLException;

public interface InterfaceFuncionario {
 
    
    public boolean create(FuncionarioDTO obj) throws SQLException;
    public FuncionarioDTO read() throws SQLException;
    public boolean delete (int id) throws SQLException;
    public FuncionarioDTO search(int id) throws SQLException;
     public FuncionarioDTO search(String login, String senha) throws SQLException;
    public boolean update(FuncionarioDTO obj) throws SQLException;
}
