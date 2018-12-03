/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fernandohre.aplicacao;

import br.ufg.inf.fernandohre.mapeadores.Interfaces.IDriver;


public class GerenciadorDeConexao {
    private static GerenciadorDeConexao instancia;
    private GerenciadorDeConexao() {}
    
    public static GerenciadorDeConexao Instancia() {
        if (instancia == null) {
            instancia = new GerenciadorDeConexao();
            return instancia;
        }
        return instancia;
    }
    
}
