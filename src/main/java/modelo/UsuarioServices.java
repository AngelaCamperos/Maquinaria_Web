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
public interface UsuarioServices {
    public int crear(UsuarioDTO usuario);
    public UsuarioDTO consultarSupervisor(UsuarioDTO usuario);
    public UsuarioDTO consultarInterventor(UsuarioDTO usuario);
    public int actualizar(UsuarioDTO usuario);
}
