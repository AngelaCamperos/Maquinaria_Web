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
public class InterventorDAO implements InterventorServices {
public static final String SQL_INSERT="INSERT INTO Interventor (id,Nombre,Ingreso,Contraseña) VAULES(?,?,?,?)";
public static final String SQL_SELECT ="SELECT id,Nombre,Ingreso,Contraseña FROM Interventor ";
public static final String SQL_UPDATE ="UPDATE Interventor SET contraseña = ? , ingreso = ? , nombre = ? WHERE id = ?";
public static final String SQL_DELETE ="DELETE FROM Interventor WHERE id  = ?";
public static final String SQL_SELECT_BY_ID ="SELECT  Nombre,Ingreso,Contraseña FROM Interventor WHERE id = ?";
    @Override
    public int crear(InterventorDTO interventor) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_INSERT);
            pstm.setInt(1,interventor.getId());
            pstm.setString(2,interventor.getNombre());
            pstm.setString(3,interventor.getIngreso());
            pstm.setString(4,interventor.getContraseña());
            
            return pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(InterventorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public int aceptarSolicitud(InterventorDTO interventor) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_INSERT);
            pstm.setInt(1,interventor.getId());
            pstm.setString(2,interventor.getNombre());
            pstm.setString(3,interventor.getIngreso());
            pstm.setString(4 ,interventor.getContraseña());
            
            return pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(InterventorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public List<InterventorDTO> consultarEstadoMaquina() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<InterventorDTO> Interventor = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int id = set.getInt("id");
                 String Nombre= set.getString("nombre");
                 String Ingreso = set.getString("ingreso");
                 String Contraseña = set.getString("contraseña");
                
                 InterventorDTO interventor = new InterventorDTO(id,Nombre,Ingreso,Contraseña);
                 Interventor.add(interventor);
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
                Logger.getLogger(InterventorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Interventor;
    }

    @Override
    public List<InterventorDTO> rechazarSolicitud() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<InterventorDTO> Interventor = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int id = set.getInt("id");
                 String Nombre= set.getString("nombre");
                 String Ingreso = set.getString("ingreso");
                 String Contraseña = set.getString("contraseña");
                
                 InterventorDTO interventor = new InterventorDTO(id,Nombre,Ingreso,Contraseña);
                 Interventor.add(interventor);
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
                Logger.getLogger(InterventorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Interventor;
    }

    
    
}