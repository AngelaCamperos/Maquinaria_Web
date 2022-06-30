/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.ObrasDAO;
import modelo.ObrasDTO;


/**
 *
 * @author User
 */
  @WebServlet("/obras")
public class ObrasController {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
   String accion = req.getParameter("accion");
   
   if (accion != null){
       switch (accion){
       case "puntos":
           this.puntos(req,resp);
           break;
           case "consultarZonas":
                    this.consultarZonas(req, resp);
                    break;
            case "consultarAreas":
                    this.consultarAreas(req, resp);
                    break;        
       default:
            this.listaObras(req, resp);   
       }}
   else
        this.listaObras(req, resp);
    }
    
        private void puntos(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        int Zonas = Integer.parseInt(req.getParameter("Zonas"));
        String Areas = req.getParameter("Areas");
        String puntos = req.getParameter("puntos");
        
        ObrasDTO obras =new ObrasDTO(Zonas,Areas,puntos);
        ObrasDTO registros = new ObrasDAO().puntos(obras);
        this.listaObras(req, resp);
        
        }

        private void consultarZonas(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           String obras = req.getParameter("obras");
        ObrasDTO ObrasDTO = new ObrasDAO().consultarZonas(new ObrasDTO(obras));
        req.setAttribute("ObrasDTO", ObrasDTO);
        req.getRequestDispatcher("Obras/Obras.jsp").forward(req, resp);
        
    }

    private void listaObras(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }

    private void consultarAreas(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     String obras = req.getParameter("obras");
        int ObrasDTO = new ObrasDAO().consultarAreas(new ObrasDTO(obras));
        req.setAttribute("ObrasDTO", ObrasDTO);
        req.getRequestDispatcher("Obras/Obras.jsp").forward(req, resp);
    
    }
  
}
