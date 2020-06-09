/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import Paciente.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KimberlyZuniga
 */
public class TestExamenUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Paciente> pacient = new ArrayList<Paciente>();
        
        pacient.add(new Paciente("1.Jayden Hughes", 1, 32, true));
        pacient.add(new Paciente("2.Juan Maldonado", 15, 40, true));
        pacient.add(new Paciente("3.Luisa Lopez",34,37, true));
        pacient.add(new Paciente("4.Mario Cortez",37,37, true));
        pacient.add(new Paciente("5.Karla Tobal",12,30, true));
        pacient.add(new Paciente("6.Miriam Alegria",25,40, true));
        pacient.add(new Paciente("7.Kath Espinoza",65,39, true));
        pacient.add(new Paciente("8.Kevin Solano",79,36, true));
        pacient.add(new Paciente("9.Santiago Roble",13,39, true));
        pacient.add(new Paciente("10.Samanta Montero",55,37, true));
        pacient.add(new Paciente("11.Samaria Pizarro",18,32, true));
        pacient.add(new Paciente("12.Santos Zeledon",45,35, true));
        pacient.add(new Paciente("13.Alberto Rodriguez",80,37, true));
        pacient.add(new Paciente("14.Carlos Lopez",36,39, true));
        pacient.add(new Paciente("15.Pedro Peladez",37,35, true));
        
        System.out.println("********************************");
        
        new HospiMexico(pacient).printReport();
        System.out.println("********************************");
        
        new HospiNicoya(pacient).printReport();
        System.out.println("********************************");
        
    }
    
}
