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
public class PruebaRapida implements Covid19Prueba {

    private final Paciente paciente;
    private boolean isPositiveRap = false;

    public PruebaRapida(Paciente paciente) {
        this.paciente = paciente;
        ejecutarPruebaRapida();
    }

    private void ejecutarPruebaRapida() {
        isPositiveRap = paciente.getTemperaturaPaciente() >= 37 && paciente.vomito();
        
    }

    @Override
    public boolean isPositiveCase() {
        return isPositiveRap;
    }

    @Override
    public String getNombrePacient() {
        return paciente.getNombrePacient();

    }
}
