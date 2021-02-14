package dto;

import java.util.ArrayList;

public class ProdutoDTO {
    private ArrayList<ProdutoDTO> produtosRegistrados;
    private String nome;
    private int quantidade;
    private double valor;
    private int idFornecedor;
    private int idRegistro;

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    
    
    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<ProdutoDTO> getProdutosRegistrados() {
        return produtosRegistrados;
    }

    public void setProdutosRegistrados(ArrayList<ProdutoDTO> produtosRegistrados) {
        this.produtosRegistrados = produtosRegistrados;
    }
    
  
}
