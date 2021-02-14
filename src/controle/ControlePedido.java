package controle;

import dto.PedidoDTO;
import java.sql.SQLException;
import modelo.Pedido;

public class ControlePedido {
    private Pedido pedido;
    public ControlePedido(){
        pedido = new Pedido();
    }
    public boolean create(PedidoDTO obj) throws SQLException{
        return pedido.create(obj);
    }
    
    public PedidoDTO read() throws SQLException{
        return pedido.read();
    }
    
    public boolean delete (int id) throws SQLException{
        return pedido.delete(id);
    }
}
