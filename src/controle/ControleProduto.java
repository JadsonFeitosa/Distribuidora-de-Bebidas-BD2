package controle;

import dto.ProdutoDTO;
import java.sql.SQLException;
import modelo.Produto;

public class ControleProduto {
    private Produto prod;
    public ControleProduto(){
        prod = new Produto();
    }
    
    public boolean create(ProdutoDTO obj) throws SQLException{
       return  prod.create(obj);
    }
    
    public boolean delete (int id) throws SQLException{
        return prod.delete(id);
    }
    
    public ProdutoDTO read() throws SQLException{
        return prod.read();
    }
    
    public ProdutoDTO search(String nome) throws SQLException{
        return prod.search(nome);
    }
    
    public boolean update (ProdutoDTO obj) throws SQLException{
        return prod.update(obj);
    }
}
