package modelo;

import dao.ClienteDAO;
import dto.ClienteDTO;
import java.sql.SQLException;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private ClienteDAO cd;
    private String endereceo;
    private String cep;
    private int numeroEndereco;

    private ClienteDAO daoC;
    
    public Cliente(){
        daoC = new ClienteDAO();
    }
    public String getEndereceo() {
        return endereceo;
    }

    public void setEndereceo(String endereceo) {
        this.endereceo = endereceo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }
    
    
    
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public boolean create(Object obj) throws SQLException{
        return daoC.create((ClienteDTO) obj);
    }
    
    public ClienteDTO search(String nome) throws SQLException{
        return daoC.search(nome);
    }
    public boolean delete (int id) throws SQLException{
        return daoC.delete(id);
    }
    
    public ClienteDTO read() throws SQLException{
        return daoC.read();
    }
    
    public boolean update (ClienteDTO obj)throws SQLException{
        return daoC.update(obj);
    }
}
