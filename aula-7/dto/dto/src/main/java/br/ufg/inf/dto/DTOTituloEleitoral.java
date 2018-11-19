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
public class DTOTituloEleitoral extends ParserJsonXML<DTOTituloEleitoral> {
    private String identificador;
    private int zona;
    private int sessao;
    
    public int obtenhaZona() {
        return this.zona;
    }
    
    public int obtenhaSessao() {
        return this.sessao;
    }
    
    public String obtenhaIdentificador() {
        return this.identificador;
    }
}
