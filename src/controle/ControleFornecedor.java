package controle;

import dto.FornecedorDTO;
import java.sql.SQLException;
import modelo.Fornecedor;

public class ControleFornecedor {
    private Fornecedor fornecedor;
    
    public ControleFornecedor(){
        fornecedor = new Fornecedor();
        
    }
     public boolean create(FornecedorDTO obj) throws SQLException{
         return fornecedor.create(obj);
     }
    public FornecedorDTO read() throws SQLException{
        return fornecedor.read();
    }
    public boolean delete (int id) throws SQLException{
         return fornecedor.delete(id);
    }
    public FornecedorDTO search(String nome) throws SQLException{
        return fornecedor.search(nome);
    }
    
    public boolean update(FornecedorDTO obj) throws SQLException{
        return fornecedor.update(obj);
    }
}
