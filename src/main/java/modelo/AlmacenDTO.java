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
public class AlmacenDTO {
    
   private int idMaquina;
    private String nomMaquinas;
    private int cantMaquinas;
    private String estadoMaquina;

    public AlmacenDTO(int idMaquina, String nomMaquinas, int cantMaquinas, String estadoMaquina) {
        this.idMaquina = idMaquina;
        this.nomMaquinas = nomMaquinas;
        this.cantMaquinas = cantMaquinas;
        this.estadoMaquina = estadoMaquina;
    }

    public AlmacenDTO() {
    }

    

//    AlmacenDTO(int idMaquina, String nomMaquinas, int cantMaquinas, String estadoMaquina) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public int getIdMaquina(){
        return idMaquina;
    }
    
    public int setIdMaquina(int idMaquina){
        return idMaquina;
    }
    
    public String getNomMaquinas() {
        return nomMaquinas;
    }

    public void setNomMaquinas(String nomMaquinas) {
        this.nomMaquinas = nomMaquinas;
    }

    public int getCantMaquinas() {
        return cantMaquinas;
    }

    public void setCantMaquinas(int cantMaquinas) {
        this.cantMaquinas = cantMaquinas;
    }

    public String getEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(String estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    @Override
    public String toString() {
        return "AlmacenDTO{" + "idMaquina=" + idMaquina + ", nomMaquinas=" + nomMaquinas + ", cantMaquinas=" + cantMaquinas + ", estadoMaquina=" + estadoMaquina + '}';
    }

}
