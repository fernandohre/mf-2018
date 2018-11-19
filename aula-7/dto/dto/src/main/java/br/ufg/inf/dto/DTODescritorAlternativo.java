/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DTODescritorAlternativo")
public class DTODescritorAlternativo extends DTODescritor<DTODescritorAlternativo> {
    private String alternativa;

    public DTODescritorAlternativo(String cod, String desc) {
        super(cod, desc);
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
}
