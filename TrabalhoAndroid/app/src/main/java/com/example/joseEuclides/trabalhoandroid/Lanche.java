package com.example.diego.trabalhoandroid;

import java.io.Serializable;

/**
 * Created by Diego on 26/11/2015.
 */
public class Lanche implements Serializable{
    private int codigo;
    private String nome;
    private String preco;
    private String ingredientes;



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

}
