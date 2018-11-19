/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dto;


public class DTODescritor<T> extends ParserJsonXML<T> implements IDTODescritor {
    private String codigo;
    private String descricao;
    
    public DTODescritor(String cod, String desc) {
        codigo = cod;
        descricao = desc;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String obtenhaCodigo() {
        return codigo;
    }

    @Override
    public String obtenhaDescricao() {
        return descricao;
    }
    
    
}
