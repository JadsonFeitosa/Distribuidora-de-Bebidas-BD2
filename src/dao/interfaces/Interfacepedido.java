package dao.interfaces;

import dto.PedidoDTO;
import java.sql.SQLException;

public interface Interfacepedido {
    
    public boolean create(PedidoDTO obj) throws SQLException;
    public PedidoDTO read() throws SQLException;
    public boolean delete (int id) throws SQLException;
    public void update (int id, int quantAretirar) throws SQLException;
    
}
