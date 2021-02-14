/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import dto.ProdutoDTO;
import java.sql.SQLException;

/**
 *
 * @author Italo
 */
public interface InterfaceProduto {
    
    public boolean create(ProdutoDTO obj) throws SQLException;
    public boolean delete (int id) throws SQLException;
    public ProdutoDTO read() throws SQLException;
    public ProdutoDTO search(String nome) throws SQLException;
    public boolean update(ProdutoDTO obj) throws SQLException;
    
}
