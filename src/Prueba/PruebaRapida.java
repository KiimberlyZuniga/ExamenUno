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
    

   public PruebaRapida(Paciente paciente){
        this.paciente = paciente;
        ejecutarPruebaRapida();}
   
  
    
     private void ejecutarPruebaRapida() {
        isPositiveRap = paciente.getTemperaturaPaciente()>= 37 && paciente.vomito();
    }

    @Override
    public boolean isPositiveCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombrePaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
