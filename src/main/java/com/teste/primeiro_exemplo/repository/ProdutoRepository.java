package com.teste.primeiro_exemplo.repository;

import org.springframework.stereotype.Repository;

import com.teste.primeiro_exemplo.model.Produto;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository {
    
    // Simulando o banco de dados
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    /**
     * Metodo para retornar uma lista de produtos
     * @return Lista de produtos
     */
    public List<Produto> obterTodos() {
        return produtos;
    }

    /**
     * Metodo para retornar produto por ID
     * @param id do produto a ser localizado
     * @return produto encontrado
     */
    public Optional<Produto> obterPorId(Integer id) {
        return produtos
            .stream()
            .filter(produto -> produto.getId() == id)
            .findFirst();
    }

    /**
     * Metodo para adicionar um novo produto
     * @param produto
     * @return
     */
    public Produto adicionar(Produto produto) {

        ultimoId++;

        produto.setId(ultimoId);
        produtos.add(produto);

        return produto;
    }

    /**
     * Método para deletar um produto por ID
     * @param id do produto a ser deletado
     */
    public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * Método para atualizar um produto
     * @param produto que será atualizado
     * @return Retorno produto atualizado
     */
    public Produto atualizar(Produto produto){
        
        // Encontrar o produto na lista
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

        if(produtoEncontrado.isEmpty()){
            throw new InputMismatchException("Produto não encontrado");
        }

        // Remover o produto antigo da lista
        deletar(produto.getId());

        //Adicionar o produto atualizado na lista
        produtos.add(produto);

        return produto;
    }
}
