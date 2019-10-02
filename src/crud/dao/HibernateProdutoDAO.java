/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import crud.util.HibernateUtil;
import crud.vo.Produto;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class HibernateProdutoDAO implements ProdutoDAO {

    public void create(Produto produto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(produto);
        session.flush();
        transaction.commit();
        session.close();
    }

    public List<Produto> retrieveAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Produto> produtos = session.createQuery("from Produto").list();
        session.flush();
        session.close();
        return produtos;
    }

    public Produto retrieveById(int idProduto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Produto produto = (Produto) session.createQuery("from Produto where idProduto=" + idProduto).uniqueResult();
        session.flush();
        session.close();
        return produto;
    }

    public void delete(Produto produto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(produto);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void update(Produto produto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(produto);
        session.flush();
        transaction.commit();
        session.close();
    }
}
