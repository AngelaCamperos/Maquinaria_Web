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
public class SupervisorDAO implements SupervisorServices{
    
public static final String SQL_INSERT="INSERT INTO Supervisor (id,Nombre,Ingreso,Contraseña) VAULES(?,?,?,?)";
public static final String SQL_SELECT ="SELECT id,Nombre,Ingreso,Contraseña FROM Supervisor ";
public static final String SQL_UPDATE ="UPDATE Supervisor SET contraseña = ? , ingreso = ? , nombre = ? WHERE id = ?";
public static final String SQL_DELETE ="DELETE FROM Supervisor WHERE id  = ?";
public static final String SQL_SELECT_BY_ID ="SELECT  Nombre,Ingreso,Contraseña FROM Supervisor WHERE id = ?";

    @Override
    public int crear(SupervisorDTO supervisor) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_INSERT);
            pstm.setInt(1,supervisor.getId());
            pstm.setString(2,supervisor.getNombre());
            pstm.setString(3,supervisor.getIngreso());
            pstm.setString(4 ,supervisor.getContraseña());
            
            return pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(SupervisorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public int retirar(SupervisorDTO supervisor) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_INSERT);
            pstm.setInt(1,supervisor.getId());
            pstm.setString(2,supervisor.getNombre());
            pstm.setString(3,supervisor.getIngreso());
            pstm.setString(4 ,supervisor.getContraseña());
            
            return pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(SupervisorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public List<SupervisorDTO> trasladar() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<SupervisorDTO> Supervisor = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int id = set.getInt("id");
                 String Nombre= set.getString("nombre");
                 String Ingreso = set.getString("ingreso");
                 String Contraseña = set.getString("contraseña");
                
                 SupervisorDTO supervisor = new SupervisorDTO(id,Nombre,Ingreso,Contraseña);
                 Supervisor.add(supervisor);
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
                Logger.getLogger(SupervisorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Supervisor;
    }

    @Override
    public List<SupervisorDTO> consultar() {
        Connection con = null;
            PreparedStatement pstm = null;
            ResultSet set = null;
            List<SupervisorDTO> Supervisor = new ArrayList();
        try {
            con = ConexionDatos.getConnection();
             pstm = con.prepareStatement(SQL_SELECT);
             set = pstm.executeQuery();
             while(set.next()){
                 int id = set.getInt("id");
                 String Nombre= set.getString("nombre");
                 String Ingreso = set.getString("ingreso");
                 String Contraseña = set.getString("contraseña");
                
                 SupervisorDTO supervisor = new SupervisorDTO(id,Nombre,Ingreso,Contraseña);
                 Supervisor.add(supervisor);
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
                Logger.getLogger(SupervisorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Supervisor;
    }
   

}