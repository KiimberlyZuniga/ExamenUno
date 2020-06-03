/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import Paciente.Paciente;
import Prueba.Covid19Prueba;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kimbe
 */
public abstract class OMS {
    protected abstract Hospital getNombreHospital();
    protected abstract boolean isGAMHospital();
    
    private final List<Covid19Prueba> resultList = new ArrayList<Covid19Prueba>(); 
    
    public OMS(List<Paciente>pacientee){//Constructor con lista de obj paciente
   
        diagnosticar(pacientee);
    }

    private void diagnosticar(List<Paciente> pacientee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
