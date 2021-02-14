package dto;

import java.util.ArrayList;

public class PedidoDTO {
     private int idCliente;
    private int idProduto;
    private int quantProduto;
    private double valorTotal;
    private ArrayList<PedidoDTO> pedidosRegistrados;
    
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

    public ArrayList<PedidoDTO> getPedidosRegistrados() {
        return pedidosRegistrados;
    }

    public void setPedidosRegistrados(ArrayList<PedidoDTO> pedidosRegistrados) {
        this.pedidosRegistrados = pedidosRegistrados;
    }
}
