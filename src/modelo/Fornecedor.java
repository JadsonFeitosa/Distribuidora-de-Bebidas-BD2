package modelo;

import dao.FornecedorDAO;
import dto.FornecedorDTO;
import java.sql.SQLException;

public class Fornecedor {
    private String nome;
    private String cnpj;
    private String telefone;
    private FornecedorDAO fdao;
    
    public Fornecedor(){
        fdao =  new FornecedorDAO();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public boolean create(FornecedorDTO obj) throws SQLException{
        return fdao.create(obj);
    }
    
    public FornecedorDTO read() throws SQLException{
        return fdao.read();
    }
    
    public FornecedorDTO search(String nome) throws SQLException{
        return fdao.search(nome);
    }
    public boolean delete(int id) throws SQLException{
        return fdao.delete(id);
    }
    
    public boolean update(FornecedorDTO obj) throws SQLException{
        return fdao.update(obj);
    }
}
