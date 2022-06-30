/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author User
 */
public interface SupervisorServices {
    public int crear(SupervisorDTO supervisor);
    public int retirar (SupervisorDTO supervisor);
    public List<SupervisorDTO> trasladar();
    public List<SupervisorDTO> consultar();
}
