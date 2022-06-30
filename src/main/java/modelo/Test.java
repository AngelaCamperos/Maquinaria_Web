/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Date fecha2 = new Date(116, 5,3, 10, 5, 6);
        SupervisorServices d = new SupervisorDAO();
        SupervisorDTO supervisor = new SupervisorDTO(115,"Angela","19/10/2022","12345");
   
       
       List<SupervisorDTO> departamentos = new ArrayList();
        departamentos = d.consultar();
        for(int i = 0; i< departamentos.size(); i++){
            System.out.println("El departamento es: " + departamentos.get(i).getNombre() + "--" + departamentos.get(i).getContraseña());
        }
    }
    
}
