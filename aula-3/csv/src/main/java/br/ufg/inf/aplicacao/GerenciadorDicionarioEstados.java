/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.aplicacao;

import java.util.HashMap;

/**
 * O propósito elementar desta classe é gerenciar as operações básicas em um
 * dicionário específico para armazenamento de estados, de forma
 * que as unidades federativas serão as chaves que armazenarão seus respectivos
 * valores que serão a quantidade de universidades.
 * 
 * @author Fernando Henrique Quicano Callata
 */
public class GerenciadorDicionarioEstados extends HashMap {
    private static int UMA_UNIVERSIDADE = 1;
    public GerenciadorDicionarioEstados() {
        super();
    }
    /**
     * Realiza a inserção de um elemento com chave e valor no dicionário.
     * Antes de realizar a inserção, é verificado se a chave já existe para
     * contabilizar a universidade.
     * 
     * @param chave
     * @param valor 
     */
    public void adicione(String chave) {
        if (this.containsKey(chave)) {
            int quantidade = this.obtenha(chave);
            this.put(chave, ++quantidade);
            return;
        }
        this.put(chave, UMA_UNIVERSIDADE);
    }
    /**
     * Retorna a quantidade de universidade de um determinado estado dado
     * como chave.
     * 
     * @param chave
     * @return 
     */
    public int obtenha(String chave) {
        return (int)this.get(chave);
    }
    
    /**
     * Exibe a quantidade de universidade por estado
     * da seguinte forma: Unidade Federativa - Quantidade de universidades,
     * respectivamente.
     */
    public void exibaQuantidadeDeUniversidadesPorEstado() {
        if (this == null) {
            throw new NullPointerException("Objeto nulo!");
        }
        this.forEach((chave, valor) -> {
            System.out.println(chave + " - " + valor);
        });
    }
}
