/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dto;

/**
 *
 * @author ferna_000
 */
public class DTOCateiraDeTrabalho extends ParserJsonXML<DTOCateiraDeTrabalho> {
    private String identificador;
    private int serie;
    private String estado;
    
    public String obtenhaIdentificador() {
        return this.identificador;
    }
    public String obtenhaEstado() {
        return this.estado;
    }
    public int obtenhaSerie() {
        return this.serie;
    }
    
}
