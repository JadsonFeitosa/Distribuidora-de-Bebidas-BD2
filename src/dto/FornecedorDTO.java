package dto;

import java.util.ArrayList;

public class FornecedorDTO {
    private String nome;
    private String cnpj;
    private int idRegistro;
    private ArrayList<FornecedorDTO> fornecedoresRegistrados;
    private String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public ArrayList<FornecedorDTO> getFornecedoresRegistrados() {
        return fornecedoresRegistrados;
    }

    public void setFornecedoresRegistrados(ArrayList<FornecedorDTO> fornecedoresRegistrados) {
        this.fornecedoresRegistrados = fornecedoresRegistrados;
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
}
