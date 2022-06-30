package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class UsuarioDTO {
    
    private int id;
    private String Supervisor;
    private String Interventor;

    public UsuarioDTO(int id, String Supervisor, String Interventor) {
        this.id = id;
        this.Supervisor = Supervisor;
        this.Interventor = Interventor;
    }

    public UsuarioDTO() {
    }

    public UsuarioDTO(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String Supervisor) {
        this.Supervisor = Supervisor;
    }

    public String getInterventor() {
        return Interventor;
    }

    public void setInterventor(String Interventor) {
        this.Interventor = Interventor;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id=" + id + ", Supervisor=" + Supervisor + ", Interventor=" + Interventor + '}';
    }

    
}