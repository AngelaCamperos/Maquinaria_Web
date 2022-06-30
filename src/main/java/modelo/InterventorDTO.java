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
public class InterventorDTO {
    private int id;
    private String nombre;
    private String ingreso;
    private String contraseña;
    

    public InterventorDTO(int id, String nombre, String ingreso, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.ingreso = ingreso;
        this.contraseña = contraseña;
    }

    public InterventorDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
