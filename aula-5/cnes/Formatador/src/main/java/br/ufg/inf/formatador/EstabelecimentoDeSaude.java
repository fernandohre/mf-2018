/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.formatador;

/**
 * Classe responsável por representar a entidade que contém os dados
 * de um estabelecimento de saúde.
 * 
 * @author Fernando Henrique Quicano Callata
 */
public class EstabelecimentoDeSaude {
    /**
     * Inicializando atributos da classe para evitar null pointer exception.
     */
    private String codigo = "";
    private String razaoSocial = "";
    private String latitude = "";
    private String longitude = "";
    
    public EstabelecimentoDeSaude(String codigo, 
                                  String razaoSocial, 
                                  String latitude, 
                                  String longitude) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public String obtenhaRazaoSocial() {
        return this.razaoSocial;
    }
    
    public String obtenhaCodigo() {
        return this.codigo;
    }
    
    public String obtenhaLatitude() {
        return this.latitude;
    }
    
    public String obtenhaLongitude() {
        return this.longitude;
    }
}
