package com.teste.primeiro_exemplo.model;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import javax.persistence;
import jakarta.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistance.Id;


@Entity
public class Produto {
    
    //#region Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String nome;

    private Integer quantidade;

    private Double valor;

    private String observacao;
    //#endregion

    //#region Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    //#endregion

}
