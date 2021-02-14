package dto;

import java.util.ArrayList;

public class RelatorioDTO {
    private String nomeCliente;
    private int idVenda;
    private double valorPedido;
    private int quantidadeProd;
    private String nomeProduto;
    private ArrayList<RelatorioDTO> vetorRelatorio;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public int getQuantidadeProd() {
        return quantidadeProd;
    }

    public void setQuantidadeProd(int quantidadeProd) {
        this.quantidadeProd = quantidadeProd;
    }

    public ArrayList<RelatorioDTO> getVetorRelatorio() {
        return vetorRelatorio;
    }

    public void setVetorRelatorio(ArrayList<RelatorioDTO> vetorRelatorio) {
        this.vetorRelatorio = vetorRelatorio;
    }
    
    
}
