/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.factory;

import crud.dao.ProdutoDAO;

/**
 *
 * @author aluno
 */
public abstract class DAOAbstractFactory {
    public static final int JDBC = 1;
    public static final int HIBERNATE = 2;
    
    public abstract ProdutoDAO createProdutoDAO();
    
    public static DAOAbstractFactory getFactory(int tipo){
        if(tipo == JDBC) {
            return new JDBCDAOFactory();
        }
        if(tipo == HIBERNATE) {
            return new HibernateDAOFactory();
        }
        return null;
    }
}
