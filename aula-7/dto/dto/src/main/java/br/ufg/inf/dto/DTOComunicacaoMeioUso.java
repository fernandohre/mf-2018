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
public class DTOComunicacaoMeioUso extends DTODescritor {
    private String alternativo;
    
    public DTOComunicacaoMeioUso(String codigo, String descricao) {
        super(codigo, descricao);
    }
    
    public String obtenhaAlternativo() {
        return this.alternativo;
    }
}
