/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dtotestes;
import Utilitarios.FabricaDeDTO;
import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste de DTO municipio")
public class DTOMunicipioTeste extends TestCase {
    
    @Test
    public void jsonTeste() {
        FabricaDeDTO.crieDTOMunicipio();
    }
}
