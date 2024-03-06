package br.com.alura.farmacia.dao;

import br.com.alura.farmacia.modelo.Produto;

import javax.persistence.EntityManager;

public class ProdutoDao {
    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrarProduto(Produto produto){
        this.em.persist(produto);
    }
}
