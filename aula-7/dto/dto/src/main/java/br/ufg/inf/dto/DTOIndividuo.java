/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DTOIndividuo")
public class DTOIndividuo extends ParserJsonXML<DTOIndividuo> {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
