/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class ConexionJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/maquinaria?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Connection con = DriverManager.getConnection(url, "root", "JEHEAN1914");
            Statement sentencia = (Statement) con.createStatement();
            String sql = "SELECT idMaquina,nomMaquinas,cantMaquinas,estadoMaquina FROM almacen";
            ResultSet resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
                System.out.println("La idMaquina de las maquinas es: " + resultado.getInt("idMaquina"));
                System.out.println("El nomMaquinas de las maquina es: " + resultado.getString("nomMaquinas"));
                System.out.println("las cantMaquinas disponible es: " + resultado.getInt("cantMaquinas"));
                System.out.println("El estadoMaquina es: " + resultado.getString("estadoMaquina"));
                
            }
            resultado.close();
            sentencia.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
