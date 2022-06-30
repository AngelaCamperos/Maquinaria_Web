/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author User
 */
public class SupervisorDTO {
    
    private int id;
    private String Nombre;
    private String Ingreso;
    private String Contraseña;
    

    public SupervisorDTO(int id, String Nombre, String Ingreso, String Contraseña) {
        this.id = id;
        this.Nombre = Nombre;
        this.Ingreso = Ingreso;
        this.Contraseña = Contraseña;
    }

    public SupervisorDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIngreso() {
        return Ingreso;
    }

    public void setIngreso(String Ingreso) {
        this.Ingreso = Ingreso;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        return "SupervisorDTO{" + "id=" + id + ", Nombre=" + Nombre + ", Ingreso=" + Ingreso + ", Contrase\u00f1a=" + Contraseña + '}';
    }

}