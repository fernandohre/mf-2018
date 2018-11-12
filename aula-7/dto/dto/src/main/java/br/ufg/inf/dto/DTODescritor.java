/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dto;

/**
 *
 * @author aluno
 */
public class DTODescritor implements IDTODescritor {
    private final String codigo;
    private final String descricao;
    
    public DTODescritor(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    @Override
    public String obtenhaCodigo() {
        return this.codigo;
    }
    
    @Override
    public String obtenhaDescricao() {
        return this.descricao;
    }
}
