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
public class ObrasDAO implements ObrasServices{
    public static final String SQL_INSERT="INSERT INTO Obra (Zonas,Areas,puntos) VAULES(?,?,?)";
    public static final String SQL_SELECT ="SELECT Zonas,Areas,puntos FROM Obras ";
    public static final String SQL_UPDATE ="UPDATE Obra SET Zonas = ? , Areas = ? , puntos = ?";
    public static final String SQL_DELETE ="DELETE FROM Obra WHERE Zonas  = ?";
    public static final String SQL_SELECT_BY_ID ="SELECT  Areas,puntos FROM Obra WHERE Zonas = ?";
    public List<ObrasDTO> ObrasDAO;
    @Override
    public ObrasDTO puntos(ObrasDTO obras) {
      
        Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,obras.getZonas());
            pstm.setString(2,obras.getAreas());
            pstm.setString(3,obras.getPuntos());
            
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
        return obras;
    }

    @Override
    public ObrasDTO consultarZonas(ObrasDTO obras) {
         Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,obras.getZonas());
            pstm.setString(2,obras.getAreas());
            pstm.setString(3,obras.getPuntos());
            
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
        return obras;

    }

    @Override
    public int consultarAreas(ObrasDTO obras) {
         Connection con = null;
            PreparedStatement pstm = null;
            int registros = 0;
        try {
            
            
            con = ConexionDatos.getConnection();
            pstm = con.prepareStatement(SQL_UPDATE);
            pstm.setInt(1,obras.getZonas());
            pstm.setString(2,obras.getAreas());
            pstm.setString(3,obras.getPuntos());
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
        return registros;
    }
    
}
