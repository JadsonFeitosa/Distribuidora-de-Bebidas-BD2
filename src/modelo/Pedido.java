package modelo;

import dao.PedidoDAO;
import dto.PedidoDTO;
import java.sql.SQLException;

public class Pedido {
    private int idCliente;
    private int idProduto;
    private int quantProduto;
    private double valorTotal;
    private PedidoDAO daoP;

    public Pedido(){
        daoP = new PedidoDAO();
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean create(PedidoDTO obj) throws SQLException{
        return daoP.create(obj);
    }
    public PedidoDTO read() throws SQLException{
        return daoP.read();
    }
    public boolean delete (int id ) throws SQLException{
        return daoP.delete(id);
    }
    
}
