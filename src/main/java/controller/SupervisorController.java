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
import modelo.SupervisorDAO;
import modelo.SupervisorDTO;

/**
 *
 * @author User
 */
@WebServlet("/Supervisor")
public class SupervisorController {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String accion = req.getParameter("accion");
   
   if (accion != null){
       switch (accion){
       case "crear":
           this.crear(req,resp);
           break;
           case "retirar":
                    this.retirar(req, resp);
                    break;
       default:
            this.listaSupervisor(req, resp);   }
   }
   else
        this.listaSupervisor(req, resp);
    }

        private void retirar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        int id = Integer.parseInt(req.getParameter("id"));
        String nombre = req.getParameter("nombre");
        String ingreso = req.getParameter("ingreso");
        String contraseña = req.getParameter("contraseña");
        SupervisorDTO supervisor =new SupervisorDTO(id,nombre,ingreso,contraseña);
        int registros = new SupervisorDAO().crear(supervisor);
        this.listaSupervisor(req, resp);
        
        }

        private void crear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int id = Integer.parseInt(req.getParameter("id"));
        String nombre = req.getParameter("nombre");
        String ingreso = req.getParameter("ingreso");
        String contraseña = req.getParameter("contraseña");
        
         
        SupervisorDTO supervisor =new SupervisorDTO(id,nombre,ingreso,contraseña);
        int registros = new SupervisorDAO().crear(supervisor);
        this.listaSupervisor(req, resp);
        
    }


    private void listaSupervisor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        SupervisorDAO dDAO = new SupervisorDAO(); 
        List<SupervisorDTO> supervisor = dDAO.trasladar();
        req.setAttribute("supervisor ", supervisor );
        req.getRequestDispatcher("Usuario/registro.jsp").forward(req, resp);
    }

   
        }

    
