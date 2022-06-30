/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class UsuarioDAO implements UsuarioServices{

    public static final String SQL_INSERT="INSERT INTO usuario (id,Supervisor,Interventor) VAULES(?,?,?)";
    public static final String SQL_SELECT ="SELECT id,Supervisor,Interventor FROM Usuario ";
    public static final String SQL_UPDATE ="UPDATE Usuario SET id = ? , Supervisor = ? , Interventor = ? WHERE id = ?";
    public static final String SQL_DELETE ="DELETE FROM Usuario WHERE id  = ?";
    public static final String SQL_SELECT_BY_ID ="SELECT  Supervisor,Interventor FROM Usuario WHERE id = ?";   
    
    @Override
    public int crear(UsuarioDTO usuario) {
        
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_INSERT);
            pstm.setInt(1,usuario.getId());
            pstm.setString(2,usuario.getSupervisor());
            pstm.setString(3,usuario.getInterventor());
            return pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }

    @Override
    public UsuarioDTO consultarSupervisor(UsuarioDTO usuario) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,usuario.getId());
            pstm.setString(2,usuario.getSupervisor());
            pstm.setString(3,usuario.getInterventor());
            
            registros = pstm.executeUpdate();
                    
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);  
        }finally{
            try {
              
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(ObrasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuario;
    }

    @Override
    public UsuarioDTO consultarInterventor(UsuarioDTO usuario) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,usuario.getId());
            pstm.setString(2,usuario.getSupervisor());
            pstm.setString(3,usuario.getInterventor());
            
            registros = pstm.executeUpdate();
                    
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);  
        }finally{
            try {
              
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(ObrasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuario;
    }

    @Override
    public int actualizar(UsuarioDTO usuario) {
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_INSERT);
            pstm.setInt(1,usuario.getId());
            pstm.setString(2,usuario.getSupervisor());
            pstm.setString(3,usuario.getInterventor());
            return pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                ConexionDatos.close(pstm);
                ConexionDatos.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }
    
     
}
