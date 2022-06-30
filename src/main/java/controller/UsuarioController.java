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
import modelo.UsuarioDAO;
import modelo.UsuarioDTO;

/**
 *
 * @author User
 */
    
    @WebServlet("/usuario")
public class UsuarioController extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
  String accion = req.getParameter("accion");
   if (accion != null){
       switch (accion){
       case "crear":
           this.crear(req,resp);
           break;
           case "consultarSupervisor":
                    this.consultarSupervisor(req, resp);
                    break;
       default :
           this.listaUsuario(req, resp);
   }
   }
   else
        this.listaUsuario2(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String accion = req.getParameter("accion");
   
   if (accion != null){
       switch (accion){
       case "consultarInterventor":
           this.consultarInterventor(req,resp);
           break;
           case "actualizar":
                    this.actualizar(req, resp);
                    break;
       //default:
            //this.listaUsuario(req, resp);
  }
   //}
   //else
        //this.listaUsuario2(req, resp);
    }}


    private void crear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
           // throws ServletException, IOException {
        String id = req.getParameter("id");
        UsuarioDTO UsuarioDto = new UsuarioDAO().consultarSupervisor(new UsuarioDTO(id));
        req.setAttribute("usuariodto", UsuarioDto);
        req.getRequestDispatcher("Usuario/login.jsp").forward(req, resp);
        
    }
    
    
    private void consultarSupervisor (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          
            String nombre = req.getParameter("nombre");
        UsuarioDTO UsuarioDTO = new UsuarioDAO().consultarSupervisor(new UsuarioDTO(nombre));
        req.setAttribute("UsuarioDTO", UsuarioDTO);
        req.getRequestDispatcher("Usuario/login.jsp").forward(req, resp);
    }
    
    private void consultarInterventor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{ 
            //throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        UsuarioDTO UsuarioDTO = new UsuarioDAO().consultarInterventor(new UsuarioDTO(nombre));
        req.setAttribute("UsuarioDTO", UsuarioDTO);
        req.getRequestDispatcher("Usuario/login.jsp").forward(req, resp);
        
    }
    
     private void actualizar(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
      int id = Integer.parseInt(req.getParameter("id"));
         String Supervisor = req.getParameter("Supervisor");
         String Interventor = req.getParameter("Interventor");
        UsuarioDTO usuario = new UsuarioDTO(id,Supervisor,Interventor);
       int registros = new UsuarioDAO().actualizar(usuario);     
       this.listaUsuario(req, resp);
    }

    private void listaUsuario(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listaUsuario2(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    



