/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DTOComunicacaoMeioUso")
public class DTOComunicacaoMeioUso extends DTODescritorAlternativo {
 
    public DTOComunicacaoMeioUso(String codigo, String descricao) {
        super(codigo, descricao);
    }
    
}
