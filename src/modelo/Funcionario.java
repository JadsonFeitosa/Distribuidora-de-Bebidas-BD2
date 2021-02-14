package modelo;

import dto.FuncionarioDTO;
import dao.FuncionarioDAO;
import java.sql.SQLException;

public class Funcionario {
    private String nome;
    private String login;
    private String senha;
    private FuncionarioDAO fdao;
    
    public Funcionario(){
        fdao = new FuncionarioDAO();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean create(FuncionarioDTO obj) throws SQLException{
        return fdao.create(obj);
    }
    
    public boolean logaSistema(String login, String senha) throws SQLException{
        return  fdao.logar(login, senha);
    }
    
    public FuncionarioDTO read() throws SQLException{
        return fdao.read();
    }
    public boolean delete (int id) throws SQLException{
        return fdao.delete(id);
    }
    public boolean update(FuncionarioDTO obj) throws SQLException{
        return fdao.update(obj);
    }
    public FuncionarioDTO search(int id) throws SQLException{
        return fdao.search(id);
    }
     public FuncionarioDTO search(String login, String senha) throws SQLException{
        return fdao.search(login,senha);
    }
     public FuncionarioDTO funcionarioLogado(){
         return fdao.getLogado();
     }
     public void setLogado(FuncionarioDTO obj){
         fdao.setLogado(obj);
     }
}
