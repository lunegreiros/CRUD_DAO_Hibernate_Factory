/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import crud.vo.Produto;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface ProdutoDAO {

    public void create(Produto produto) throws Exception;

    public List<Produto> retrieveAll() throws Exception;

    public Produto retrieveById(int idProduto) throws Exception;

    public void update(Produto produto) throws Exception;

    public void delete(Produto produto) throws Exception;
}
