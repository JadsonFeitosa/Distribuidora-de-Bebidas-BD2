package modelo;

import dao.ProdutoDAO;
import dto.ProdutoDTO;
import java.sql.SQLException;

public class Produto {
    private String nome;
    private int quantidade;
    private double valor;
    private int idFornecedor;
    private dao.ProdutoDAO daoP;
    
    public Produto(){
        daoP = new ProdutoDAO();
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
    
    public boolean create(ProdutoDTO obj) throws SQLException{
        return daoP.create(obj);
    }
    
    public boolean delete (int it ) throws SQLException{
        return daoP.delete(it);
    }
    
    public ProdutoDTO read() throws SQLException{
        return daoP.read();
    }
    public ProdutoDTO search(String nome) throws SQLException{
        return daoP.search(nome);
    }
    
    public boolean update (ProdutoDTO obj) throws SQLException{
        return daoP.update(obj);
    }
}
