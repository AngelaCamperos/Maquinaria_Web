/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static modelo.AlmacenDAO.SQL_SELECT;
import static modelo.AlmacenDAO.SQL_UPDATE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class TipoMaquinaDAO implements TipoMaquinaServices{
    public static final String SQL_INSERT="INSERT INTO TipoMaquina (idTipo,maqPesada,maqSemiPesada,maqLiviana) VAULES(?,?,?,?)";
public static final String SQL_SELECT ="SELECT idTipo,maqPesada,maqSemiPesada,maqLiviana FROM TipoMaquina ";
public static final String SQL_UPDATE ="UPDATE TipoMaquina SET maqPesada = ? , maqSemiPesada = ? , maqLiviana = ? idTipo = ?";
public static final String SQL_DELETE ="DELETE FROM TipoMaquina WHERE idTipo  = ?";
public static final String SQL_SELECT_BY_ID ="SELECT  maqPesada,maqSemiPesada,maqLiviana FROM TipoMaquina WHERE idTipo = ?";
    @Override
    public int agregar(TipoMaquinaDTO tipomaquina) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,tipomaquina.getIdTipo());
            pstm.setString(2,tipomaquina.getMaqPesada());
            pstm.setString(3,tipomaquina.getMaqSemiPesada());
            pstm.setString(4,tipomaquina.getMaqLiviana());
            registros = pstm.executeUpdate();
                    
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);  
        }finally{
            try {
              
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(TipoMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public int consultar(TipoMaquinaDTO tipomaquina) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,tipomaquina.getIdTipo());
            pstm.setString(2,tipomaquina.getMaqPesada());
            pstm.setString(3,tipomaquina.getMaqSemiPesada());
            pstm.setString(4,tipomaquina.getMaqLiviana());
            registros = pstm.executeUpdate();
                    
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);  
        }finally{
            try {
              
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(TipoMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public int actualizar(TipoMaquinaDTO tipomaquina) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,tipomaquina.getIdTipo());
            pstm.setString(2,tipomaquina.getMaqPesada());
            pstm.setString(3,tipomaquina.getMaqSemiPesada());
            pstm.setString(4,tipomaquina.getMaqLiviana());
            registros = pstm.executeUpdate();
                    
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);  
        }finally{
            try {
              
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(TipoMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public List<TipoMaquinaDTO> retirar () {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<TipoMaquinaDTO> TipoMaquina = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idTipo = set.getInt("idtipo");
                 String maqPesada= set.getString("maqpesada");
                 String maqSemiPesada = set.getString("maqsemipesada");
                 String maqLiviana = set.getString("maqliviana");
                
                 TipoMaquinaDTO tipomaquina = new TipoMaquinaDTO(idTipo,maqPesada,maqSemiPesada,maqLiviana);
                 TipoMaquina.add(tipomaquina);
             }
        } catch (SQLException ex) {
              ex.printStackTrace(System.out);      
        }
        finally{
            try {
                ConexionDatos.close(set);
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(TipoMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return TipoMaquina;
    }

    @Override
    public List<TipoMaquinaDTO> trasladar() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<TipoMaquinaDTO> TipoMaquina = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idTipo = set.getInt("idtipo");
                 String maqPesada= set.getString("maqpesada");
                 String maqSemiPesada = set.getString("maqsemipesada");
                 String maqLiviana = set.getString("maqliviana");
                
                 TipoMaquinaDTO tipomaquina = new TipoMaquinaDTO(idTipo,maqPesada,maqSemiPesada,maqLiviana);
                 TipoMaquina.add(tipomaquina);
             }
        } catch (SQLException ex) {
              ex.printStackTrace(System.out);      
        }
        finally{
            try {
                ConexionDatos.close(set);
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(TipoMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return TipoMaquina;
    }

    @Override
    public List<TipoMaquinaDTO> solicitar () {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<TipoMaquinaDTO> TipoMaquina = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idTipo = set.getInt("idtipo");
                 String maqPesada= set.getString("maqpesada");
                 String maqSemiPesada = set.getString("maqsemipesada");
                 String maqLiviana = set.getString("maqliviana");
                
                 TipoMaquinaDTO tipomaquina = new TipoMaquinaDTO(idTipo,maqPesada,maqSemiPesada,maqLiviana);
                 TipoMaquina.add(tipomaquina);
             }
        } catch (SQLException ex) {
              ex.printStackTrace(System.out);      
        }
        finally{
            try {
                ConexionDatos.close(set);
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(TipoMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return TipoMaquina;
    }

    @Override
    public List<TipoMaquinaDTO> disponible() {
         Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<TipoMaquinaDTO> TipoMaquina = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idTipo = set.getInt("idtipo");
                 String maqPesada= set.getString("maqpesada");
                 String maqSemiPesada = set.getString("maqsemipesada");
                 String maqLiviana = set.getString("maqliviana");
                
                 TipoMaquinaDTO tipomaquina = new TipoMaquinaDTO(idTipo,maqPesada,maqSemiPesada,maqLiviana);
                 TipoMaquina.add(tipomaquina);
             }
        } catch (SQLException ex) {
              ex.printStackTrace(System.out);      
        }
        finally{
            try {
                ConexionDatos.close(set);
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(TipoMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return TipoMaquina;
    }

    @Override
    public List<TipoMaquinaDTO> nodisponible() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<TipoMaquinaDTO> TipoMaquina = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idTipo = set.getInt("idtipo");
                 String maqPesada= set.getString("maqpesada");
                 String maqSemiPesada = set.getString("maqsemipesada");
                 String maqLiviana = set.getString("maqliviana");
                
                 TipoMaquinaDTO tipomaquina = new TipoMaquinaDTO(idTipo,maqPesada,maqSemiPesada,maqLiviana);
                 TipoMaquina.add(tipomaquina);
             }
        } catch (SQLException ex) {
              ex.printStackTrace(System.out);      
        }
        finally{
            try {
                ConexionDatos.close(set);
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(TipoMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return TipoMaquina;
    }

    @Override
    public List<TipoMaquinaDTO> dañada() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<TipoMaquinaDTO> TipoMaquina = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idTipo = set.getInt("idtipo");
                 String maqPesada= set.getString("maqpesada");
                 String maqSemiPesada = set.getString("maqsemipesada");
                 String maqLiviana = set.getString("maqliviana");
                
                 TipoMaquinaDTO tipomaquina = new TipoMaquinaDTO(idTipo,maqPesada,maqSemiPesada,maqLiviana);
                 TipoMaquina.add(tipomaquina);
             }
        } catch (SQLException ex) {
              ex.printStackTrace(System.out);      
        }
        finally{
            try {
                ConexionDatos.close(set);
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(TipoMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return TipoMaquina;
    }

    public TipoMaquinaDTO crear(TipoMaquinaDTO tipoMaquinaDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
