package dto;

import java.util.ArrayList;

public class FuncionarioDTO {
    private String nome;
    private String login;
    private String senha;
    private ArrayList<FuncionarioDTO> funcionariosRegistrados;
    private int idRegistro;
    
    
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

    public ArrayList<FuncionarioDTO> getFuncionariosRegistrados() {
        return funcionariosRegistrados;
    }

    public void setFuncionariosRegistrados(ArrayList<FuncionarioDTO> funcionariosRegistrados) {
        this.funcionariosRegistrados = funcionariosRegistrados;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    
}
