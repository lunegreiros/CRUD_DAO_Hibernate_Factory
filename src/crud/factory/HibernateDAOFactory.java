/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.factory;

import crud.dao.HibernateProdutoDAO;
import crud.dao.ProdutoDAO;

/**
 *
 * @author aluno
 */
public class HibernateDAOFactory extends DAOAbstractFactory {

    @Override
    public ProdutoDAO createProdutoDAO() {
        return new HibernateProdutoDAO();
    }
    
}
