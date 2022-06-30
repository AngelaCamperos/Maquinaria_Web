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
public class TipoMaquinaDTO {
    
    private int idTipo;
    private String maqPesada;
    private String maqSemiPesada;
    private String maqLiviana;
    

    public TipoMaquinaDTO(int idTipo, String maqPesada, String maqSemiPesada, String maqLiviana) {
        this.idTipo = idTipo;
        this.maqPesada = maqPesada;
        this.maqSemiPesada = maqSemiPesada;
        this.maqLiviana = maqLiviana;
    }

    public TipoMaquinaDTO() {
    }

    public TipoMaquinaDTO(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int id) {
        this.idTipo = idTipo;
    }

    public String getMaqPesada() {
        return maqPesada;
    }

    public void setMaqPesada(String maqPesada) {
        this.maqPesada = maqPesada;
    }

    public String getMaqSemiPesada() {
        return maqSemiPesada;
    }

    public void setMaqSemiPesada(String maqSemiPesada) {
        this.maqSemiPesada = maqSemiPesada;
    }

    public String getMaqLiviana() {
        return maqLiviana;
    }

    public void setMaqLiviana(String maqLiviana) {
        this.maqLiviana = maqLiviana;
    }

    @Override
    public String toString() {
        return "TipoMaquinaDTO{" + "idTipo=" + idTipo + ", maqPesada=" + maqPesada + ", maqSemiPesada=" + maqSemiPesada + ", maqLiviana=" + maqLiviana + '}';
    }
  
    
}
