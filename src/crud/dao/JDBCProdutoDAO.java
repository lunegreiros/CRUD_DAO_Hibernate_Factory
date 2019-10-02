/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import crud.util.DBConnection;
import crud.vo.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class JDBCProdutoDAO implements ProdutoDAO {

    @Override
    public void create(Produto produto) throws Exception {
        DBConnection.getInstance().getStatement().executeUpdate("INSERT INTO produto VALUES(null,'"
                + produto.getNomeProduto() + "','"
                + produto.getPrecoProduto() + "',"
                + produto.getQuantidadeProduto() + ")");
    }

    @Override
    public List<Produto> retrieveAll() throws Exception {
        List<Produto> produtos = new ArrayList<>();
        ResultSet result
                = DBConnection.getInstance().getStatement().executeQuery("SELECT * FROM produto");
        while (result.next()) {
            Produto produto = new Produto(
                    result.getInt(1),
                    result.getString(2),
                    result.getString(3),
                    result.getInt(4));
            produtos.add(produto);
        }
        return produtos;
    }

    @Override
    public Produto retrieveById(int idProduto) throws Exception {
        Produto produto = null;
        ResultSet result
                = DBConnection.getInstance().getStatement().executeQuery("SELECT * FROM produto WHERE id_produto=" + idProduto);
        if (result.next()) {
            produto = new Produto(
                    result.getInt(1),
                    result.getString(2),
                    result.getString(3),
                    result.getInt(4));
        }
        return produto;
    }

    @Override
    public void update(Produto produto) throws Exception {
        DBConnection.getInstance().getStatement().executeUpdate("UPDATE produto SET nome_produto='"
                    + produto.getNomeProduto() + "',preco_produto='"
                    + produto.getPrecoProduto() + "',quantidade_produto="
                    + produto.getQuantidadeProduto() + " WHERE id_produto="
                    + produto.getIdProduto());
    }

    @Override
    public void delete(Produto produto) throws Exception {
        DBConnection.getInstance().getStatement().executeUpdate("DELETE FROM produto WHERE id_produto="
                    + produto.getIdProduto());
    }
}
