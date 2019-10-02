/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.vo;

/**
 *
 * @author aluno
 */
public class Produto {

    private int idProduto;
    private String nomeProduto;
    private String precoProduto;
    private int quantidadeProduto;

    public Produto(int idProduto, String nomeProduto, String precoProduto, int quantidadeProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto() {
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

}
