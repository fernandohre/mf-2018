/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dto;

public class DTONome extends ParserJsonXML<DTONome> {
    private String id;
    private String individuo;
    private String titulos;
    private String nomes;
    private String sobreNomes;
    private String sufixos;
    private long codigoNomePreferido;
    private long codigoUsoCondicional;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getSobreNomes() {
        return sobreNomes;
    }

    public void setSobreNomes(String sobreNomes) {
        this.sobreNomes = sobreNomes;
    }

    public String getSufixos() {
        return sufixos;
    }

    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    public long getCodigoNomePreferido() {
        return codigoNomePreferido;
    }

    public void setCodigoNomePreferido(long codigoNomePreferido) {
        this.codigoNomePreferido = codigoNomePreferido;
    }

    public long getCodigoUsoCondicional() {
        return codigoUsoCondicional;
    }

    public void setCodigoUsoCondicional(long codigoUsoCondicional) {
        this.codigoUsoCondicional = codigoUsoCondicional;
    }
    
}
