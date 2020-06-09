/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Paciente.Paciente;

/**
 *
 * @author KimberlyZuniga
 */
//CLASE INMUTABLE (FINAL)
public final class PCRPrueba implements Covid19Prueba {

    private boolean isPositivePCR = false;
    private final Paciente paciente;

    //Const de obj tipo paciente
    public PCRPrueba(Paciente paciente) {
        this.paciente = paciente;
        ejecutarPrueba();
    }

    @Override
    public boolean isPositiveCase() {
        return isPositivePCR;
    }

    @Override
    public String getNombrePacient() {

        return paciente.getNombrePacient();
    }

    //metodo da positivo si la temp es = o > a 39
    private void ejecutarPrueba() {
        
        isPositivePCR = paciente.getTemperaturaPaciente() >= 39 && paciente.vomito();
    }

}
