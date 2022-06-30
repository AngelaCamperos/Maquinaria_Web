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
public interface InterventorServices {
    public int crear(InterventorDTO interventor);
    public int aceptarSolicitud(InterventorDTO interventor);
    public List<InterventorDTO> consultarEstadoMaquina();
    public List<InterventorDTO> rechazarSolicitud();
}
