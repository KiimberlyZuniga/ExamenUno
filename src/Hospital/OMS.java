/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import Paciente.Paciente;
import Prueba.Covid19Prueba;
import Prueba.PCRPrueba;
import Prueba.PruebaRapida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KimberlyZuniga
 */
public abstract class OMS {

    protected abstract Hospital getNombreHospital();//funcion abstracta de tipo hospital

    protected abstract boolean isGAMHospital(); //funcion abstracta protegida

    private final List<Covid19Prueba> resultList = new ArrayList<Covid19Prueba>();

    public OMS(List<Paciente> pacientee) {//Constructor con lista de obj paciente

        diagnosticar(pacientee);
    }

    //
    private void diagnosticar(List<Paciente> pacientee) {
        for (Paciente paciente : pacientee) {
            if (isGAMHospital()) {
                resultList.add(new PCRPrueba(paciente));
            } else {
                resultList.add((Covid19Prueba) new PruebaRapida(paciente));
            }
        }
    }

    public final void printReport() {
        System.out.println("Resultado del hospital" + getNombreHospital().getNombre());
        for (Covid19Prueba resultado : resultList) {
            System.out.println("-----------");
            System.out.println("nombre = " + resultado.getNombrePaciente());
            System.out.println("es caso positivo = " + resultado.isPositiveCase());

        }
    }
}
