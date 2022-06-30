/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public interface ObrasServices {
    
    public ObrasDTO puntos(ObrasDTO obras);
    public ObrasDTO consultarZonas(ObrasDTO obras);
    public int consultarAreas(ObrasDTO obras);
}
