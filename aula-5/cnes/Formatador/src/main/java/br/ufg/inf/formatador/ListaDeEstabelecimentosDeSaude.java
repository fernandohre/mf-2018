/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.formatador;
import java.util.ArrayList;

/**
 * O propósito dessa classe é ser uma instancia única, de forma que a operações
 * ocorre somente na instância que está na memória.
 * 
 * @author Fernando Henrique Quicano Callata
 */
public class ListaDeEstabelecimentosDeSaude extends ArrayList<EstabelecimentoDeSaude> {
    private static ListaDeEstabelecimentosDeSaude instancia;
    /**
     * Seguindo padrão de projeto singleton que indica que a classe deve ser 
     * privada.
     */
    private ListaDeEstabelecimentosDeSaude(){}
    
    public static synchronized ListaDeEstabelecimentosDeSaude obtenha() {
        if (instancia != null) {
            return instancia;
        }
        instancia = new ListaDeEstabelecimentosDeSaude();
        return instancia; 
    }
}
