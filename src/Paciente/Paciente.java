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
    private final String nombrePacient;
    private final int edadPaciente;
    private final int temperaturaPaciente;
    private final boolean vomito;

    //CONST
    public Paciente(String nombrePacient, int edadPaciente, int temperaturaPaciente, boolean vomito) {
        this.nombrePacient = nombrePacient;
        this.edadPaciente = edadPaciente;
        this.temperaturaPaciente = temperaturaPaciente;
        this.vomito = vomito;
    }

    //FALTA INV COMO HACER LOS ATRIBUTOS INMUTABLES
    
    //SOLO GETTER PARA QUE NO PUEDAN SER MODIFICADOS
    public String getNombrePacient() {
        return nombrePacient;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public int getTemperaturaPaciente() {
        return temperaturaPaciente;
    }

    

    public boolean vomito() {
return vomito;    }
}
