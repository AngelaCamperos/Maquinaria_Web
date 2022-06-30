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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.InterventorDAO;
import modelo.InterventorDTO;

/**
 *
 * @author User
 */
@WebServlet("/Interventor")
public class InterventorController {
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String accion = req.getParameter("accion");
   
   if (accion != null){
       switch (accion){
       case "crear":
           this.crear(req,resp);
           break;
           case "aceptarSolicitud":
                    this.aceptarSolicitud(req, resp);
                    break;
       default:
            this.listaInterventor(req, resp);
   }
   }
   else
        this.listaInterventor(req, resp);
    }

        private void aceptarSolicitud(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        int id = Integer.parseInt(req.getParameter("id"));
        String nombre = req.getParameter("nombre");
        String ingreso = req.getParameter("ingreso");
        String contraseña = req.getParameter("contraseña");
        InterventorDTO interventor =new InterventorDTO(id,nombre,ingreso,contraseña);
        int registros = new InterventorDAO().crear(interventor);
        this.listaInterventor(req, resp);
        
        }

        private void crear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int id = Integer.parseInt(req.getParameter("id"));
        String nombre = req.getParameter("nombre");
        String ingreso = req.getParameter("ingreso");
        String contraseña = req.getParameter("contraseña");
        
         
        InterventorDTO interventor =new InterventorDTO(id,nombre,ingreso,contraseña);
        int registros = new InterventorDAO().crear(interventor);
        this.listaInterventor(req, resp);
        
    }

    private void listaInterventor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        InterventorDAO dDAO = new InterventorDAO();
        List<InterventorDTO> interventor = dDAO.consultarEstadoMaquina();
        req.setAttribute("interventor", interventor);
        req.getRequestDispatcher("Usuario/registro.jsp").forward(req, resp);
    
    
    }
        }

    
    
