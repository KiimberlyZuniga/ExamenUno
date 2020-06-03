/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

/**
 *
 * @author KimberlyZuniga
 */
public class Paciente {
    //ATRIBUTOS INMUTABLES 
    private final String nombrePaciente;
    private final int edadPaciente;
    private final int temperaturaPaciente;
    private final boolean vomito;

    //CONST
    public Paciente(String nombrePaciente, int edadPaciente, int temperaturaPaciente, boolean vomito) {
        this.nombrePaciente = nombrePaciente;
        this.edadPaciente = edadPaciente;
        this.temperaturaPaciente = temperaturaPaciente;
        this.vomito = vomito;
    }

    //FALTA INV COMO HACER LOS ATRIBUTOS INMUTABLES
    
    //SOLO GETTER PARA QUE NO PUEDAN SER MODIFICADOS
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public int getTemperaturaPaciente() {
        return temperaturaPaciente;
    }

    public boolean isVomito() {
        return vomito;
    }

    public boolean vomito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
