/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import Paciente.Paciente;
import java.util.List;

/**
 *
 * @author Kimbe
 */
public final class HospiMexico extends OMS { //HERENCIA
    
    

    public HospiMexico(List<Paciente> pacientee) {
        super(pacientee);//COST CON HERENCIA
    }

    @Override
    protected Hospital getNombreHospital() {
        return Hospital.HospiMexico;
    }

    @Override
    protected boolean isGAMHospital() {
        return true;
    }
}
