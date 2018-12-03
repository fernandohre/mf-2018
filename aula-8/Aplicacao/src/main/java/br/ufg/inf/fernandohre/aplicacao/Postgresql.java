/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fernandohre.aplicacao;

import br.ufg.inf.fernandohre.mapeadores.Interfaces.IDriver;

/**
 *
 * @author aluno
 */
public class Postgresql extends GerenciadorDeBancoDeDados implements IDriver {

    @Override
    public boolean estaAtivo() {
        
        try {
            Class.forName("org.postgresql.Driver");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
        
    }
    
}
