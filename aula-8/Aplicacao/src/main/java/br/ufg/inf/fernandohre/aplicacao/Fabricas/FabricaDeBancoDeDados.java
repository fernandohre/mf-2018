/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fernandohre.aplicacao.Fabricas;

import br.ufg.inf.fernandohre.aplicacao.GerenciadorDeBancoDeDados;
import br.ufg.inf.fernandohre.aplicacao.Mysql;
import br.ufg.inf.fernandohre.aplicacao.Postgresql;
import br.ufg.inf.fernandohre.aplicacao.Sqlite;
import static javafx.scene.input.KeyCode.T;


public class FabricaDeBancoDeDados {
    public static GerenciadorDeBancoDeDados CrieMysql() {
        return new Mysql();
    }
    
    public static GerenciadorDeBancoDeDados CriePostgresql() {
        return new Postgresql();
    }
    
    public static GerenciadorDeBancoDeDados CrieSqlite() {
        return new Sqlite();
    }
   
}
