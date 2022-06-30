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
public class ObrasDTO {
    
    private int Zonas;
    private String Areas;
    private String puntos;

    public ObrasDTO(int Zonas, String Areas, String puntos) {
        this.Zonas = Zonas;
        this.Areas = Areas;
        this.puntos = puntos;
    }

    public ObrasDTO() {
    }

    public ObrasDTO(String obras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getZonas() {
        return Zonas;
    }

    public void setZonas(int Zonas) {
        this.Zonas = Zonas;
    }

    public String getAreas() {
        return Areas;
    }

    public void setAreas(String Areas) {
        this.Areas = Areas;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "ObrasDTO{" + "Zonas=" + Zonas + ", Areas=" + Areas + ", puntos=" + puntos + '}';
    }
    
    
}
