/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

/**
 *
 * @author Kimbe
 */
public enum Hospital {
    // CONSTANTES
    HospiMexico ("HOSPITAL MEXICO"), 
    HospideNicoya ("HOSPITAL NICOYA");
    //VARIABLES
    private final String nombre;
    //CONSTRUCTOR
    private Hospital(String nombre) {
        this.nombre = nombre;
    }
    //GETTER para obtener el nombre del enum
    public String getNombre() {
        return nombre;
    }
}
