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
public  final class PCRPrueba implements Covid19Prueba{
    private boolean isPositive = false;
    private final Paciente paciente;

    //Const de obj tipo paciente
    public PCRPrueba(Paciente paciente) {
        this.paciente = paciente;
    }

    
    @Override
    public boolean isPositiveCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombrePaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //metodo da positivo si la temp es = o > a 39
      private void ejecutarPrueba() {
        isPositive = paciente.getTemperaturaPaciente()>= 39 && paciente.vomito();
    }
    
}
