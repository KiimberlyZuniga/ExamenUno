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
public final class HospiNicoya extends OMS {//Herencia

    public HospiNicoya(List<Paciente> pacientee) {
        super(pacientee);//constructor con herencia
    }

    @Override
    protected Hospital getNombreHospital() {
        return Hospital.HospideNicoya;
    }

    @Override
    protected boolean isGAMHospital() {
        return true;
    }

}
