/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.Date;
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
public class AlmacenDAO implements AlmacenServices{
    
    public static final String SQL_INSERT="INSERT INTO Almacen (idMaquina,nomMaquinas,cantMaquinas,estadoMaquina) VAULES(?,?,?,?)";
public static final String SQL_SELECT ="SELECT idMaquina,nomMaquinas,cantMaquinas,estadoMaquina FROM Almacen ";
public static final String SQL_UPDATE ="UPDATE Almacen SET nomMaquinas = ? , cantMaquinas = ? , estadoMaquina = ? idMaquina = ?";
public static final String SQL_DELETE ="DELETE FROM Almacen WHERE idMaquina  = ?";
public static final String SQL_SELECT_BY_ID ="SELECT  nomMaquinas,cantMaquinas,estadoMaquina FROM Almacen WHERE idMaquina = ?";
    
@Override
    public int agregarCantMaquinas(AlmacenDTO almacen) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,almacen.getIdMaquina());
            pstm.setString(2,almacen.getNomMaquinas());
            pstm.setInt(3,almacen.getCantMaquinas());
            pstm.setString(4,almacen.getEstadoMaquina());
            registros = pstm.executeUpdate();
                    
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);  
        }finally{
            try {
              
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(AlmacenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public List<AlmacenDTO> agregarNomMaquinas() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<AlmacenDTO> Almacen = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idMaquina = set.getInt("idmaquina");
                 String nomMaquinas= set.getString("nommaquinas");
                 int cantMaquinas = set.getInt("cantmaquinas");
                 String estadoMaquina = set.getString("estadomaquina");
                
                 AlmacenDTO almacen = new AlmacenDTO(idMaquina,nomMaquinas,cantMaquinas,estadoMaquina);
                 Almacen.add(almacen);
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
                Logger.getLogger(AlmacenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Almacen;
    }

    @Override
    public List<AlmacenDTO> consultarNomMaquinas() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<AlmacenDTO> Almacen = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idMaquina = set.getInt("idmaquina");
                 String nomMaquinas= set.getString("nommaquinas");
                 int cantMaquinas = set.getInt("cantmaquinas");
                 String estadoMaquina = set.getString("estadomaquina");
                
                 AlmacenDTO almacen = new AlmacenDTO(idMaquina,nomMaquinas,cantMaquinas,estadoMaquina);
                 Almacen.add(almacen);
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
                Logger.getLogger(AlmacenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Almacen;
    }

    
    @Override
    public List<AlmacenDTO> consultarCantMaquinas() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<AlmacenDTO> Almacen = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idMaquina = set.getInt("idmaquina");
                 String nomMaquinas= set.getString("nommaquinas");
                 int cantMaquinas = set.getInt("cantmaquinas");
                 String estadoMaquina = set.getString("estadomaquina");
                
                 AlmacenDTO almacen = new AlmacenDTO(idMaquina,nomMaquinas,cantMaquinas,estadoMaquina);
                 Almacen.add(almacen);
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
                Logger.getLogger(AlmacenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Almacen;
    }

    @Override
    public int agregarEstadoMaquina(AlmacenDTO almacen) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,almacen.getIdMaquina());
            pstm.setString(2,almacen.getNomMaquinas());
            pstm.setInt(3,almacen.getCantMaquinas());
            pstm.setString(4,almacen.getEstadoMaquina());
            registros = pstm.executeUpdate();
                    
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);  
        }finally{
            try {
              
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(AlmacenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public List<AlmacenDTO> consultarEstadoMaquina() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<AlmacenDTO> Almacen = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idMaquina = set.getInt("idmaquina");
                 String nomMaquinas= set.getString("nommaquinas");
                 int cantMaquinas = set.getInt("cantmaquinas");
                 String estadoMaquina = set.getString("estadomaquina");
                
                 AlmacenDTO almacen = new AlmacenDTO(idMaquina,nomMaquinas,cantMaquinas,estadoMaquina);
                 Almacen.add(almacen);
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
                Logger.getLogger(AlmacenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Almacen;
    }

    @Override
    public int agregarTipoMaquinaria(AlmacenDTO almacen) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,almacen.getIdMaquina());
            pstm.setString(2,almacen.getNomMaquinas());
            pstm.setInt(3,almacen.getCantMaquinas());
            pstm.setString(4,almacen.getEstadoMaquina());
            registros = pstm.executeUpdate();
                    
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);  
        }finally{
            try {
              
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(AlmacenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public List<AlmacenDTO> consultarTipoMaquinaria() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<AlmacenDTO> Almacen = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int idMaquina = set.getInt("idmaquina");
                 String nomMaquinas= set.getString("nommaquinas");
                 int cantMaquinas = set.getInt("cantmaquinas");
                 String estadoMaquina = set.getString("estadomaquina");
                
                 AlmacenDTO almacen = new AlmacenDTO(idMaquina,nomMaquinas,cantMaquinas,estadoMaquina);
                 Almacen.add(almacen);
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
                Logger.getLogger(AlmacenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Almacen;
    }

   
}
