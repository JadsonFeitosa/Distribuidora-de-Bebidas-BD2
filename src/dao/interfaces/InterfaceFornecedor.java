package dao.interfaces;

import dto.FornecedorDTO;
import java.sql.SQLException;

public interface InterfaceFornecedor {
 
    
    public boolean create(FornecedorDTO obj) throws SQLException;
    public FornecedorDTO read() throws SQLException;
    public boolean delete (int id) throws SQLException;
    public FornecedorDTO search(String nome) throws SQLException;
    public boolean update (FornecedorDTO obj) throws SQLException;
}
