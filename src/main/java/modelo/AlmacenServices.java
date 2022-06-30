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
public interface AlmacenServices {
    public int agregarCantMaquinas(AlmacenDTO almacen);
    public List<AlmacenDTO> agregarNomMaquinas();
    public List<AlmacenDTO> consultarNomMaquinas();
    public List<AlmacenDTO> consultarCantMaquinas();
    public int agregarEstadoMaquina(AlmacenDTO almacen);
    public List<AlmacenDTO> consultarEstadoMaquina();
    public int agregarTipoMaquinaria(AlmacenDTO almacen);
    public List<AlmacenDTO> consultarTipoMaquinaria();
}
