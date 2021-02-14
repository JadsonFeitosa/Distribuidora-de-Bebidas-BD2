package controle;

import dto.ClienteDTO;
import java.sql.SQLException;
import modelo.Cliente;

public class ControleCliente {
    private Cliente cliente;
    
    public ControleCliente() {
        cliente = new Cliente();
    }
   public boolean create(Object obj) throws SQLException{
        return cliente.create(obj);
    }
   
    public ClienteDTO search(String nome) throws SQLException {
        return cliente.search(nome);
    }
    
    public ClienteDTO read() throws SQLException{
        return cliente.read();
    }
    public boolean delete (int id ) throws SQLException{
        return cliente.delete(id);
    }
    
    public boolean update (ClienteDTO obj) throws SQLException{
        return cliente.update(obj);
    }
}
