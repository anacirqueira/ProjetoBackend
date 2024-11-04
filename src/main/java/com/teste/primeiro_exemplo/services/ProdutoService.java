package com.teste.primeiro_exemplo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.primeiro_exemplo.model.Produto;
import com.teste.primeiro_exemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {
   
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos(){
        
        return produtoRepository.findAll();
    }

    public Optional<Produto> obterPorId(Integer id){

        return produtoRepository.findById(id);
    }

    public Produto adicionar(Produto produto){

        return produtoRepository.save(produto);
    }

    public void deletar(Integer id){

        produtoRepository.deleteById(id);
    }

    public Produto atualizar(Integer id, Produto produto){

        produto.setId(id);

        return produtoRepository.save(produto);

    }
}
