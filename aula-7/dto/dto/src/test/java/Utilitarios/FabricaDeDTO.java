/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import br.ufg.inf.dto.DTOIndividuo;
import br.ufg.inf.dto.DTOMunicipio;


public class FabricaDeDTO {
    public static DTOIndividuo crieDTOIndividuo() {
        DTOIndividuo objeto = new DTOIndividuo();
        objeto.setId("12");
        return objeto;
    }
    
    public static DTOMunicipio crieDTOMunicipio() {
        DTOMunicipio objeto = new DTOMunicipio();
        objeto.setCodigo(1231);
        objeto.setEstado("GO");
        objeto.setMunicipio("Goiânia");
        return objeto;
    }
}
