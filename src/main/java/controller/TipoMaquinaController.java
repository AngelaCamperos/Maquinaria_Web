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
import modelo.TipoMaquinaDAO;
import modelo.TipoMaquinaDTO;

/**
 *
 * @author User
 */
@WebServlet("/TipoMaquina")
public class TipoMaquinaController {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
  String accion = req.getParameter("accion");
   if (accion != null){
       switch (accion){
       case "agregar":
           this.agregar(req,resp);
           break;
           case "consultar":
                    this.consultar(req, resp);
                    break;
       default :
           this.listaTipoMaquina(req, resp);
   }
   }
   else
        this.listaTipoMaquina(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String accion = req.getParameter("accion");
   if (accion != null){
       switch (accion){
       case "crear":
           this.crear(req,resp);
           break;
           case "actualizar":
                    this.actualizar(req, resp);
                    break;
       default:
            this.listaTipoMaquina(req, resp);
   }
   }
   else
        this.listaTipoMaquina(req, resp);
    }

    private void listaTipoMaquina(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TipoMaquinaDAO dDAO = new TipoMaquinaDAO();
        List<TipoMaquinaDTO> tipoMaquina = dDAO.solicitar();
        req.setAttribute("tipoMaquina", tipoMaquina);
        req.getRequestDispatcher("TipoMaquina/TipoMaquina.jsp").forward(req, resp);
    }

    private void agregar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int idTipo = Integer.parseInt(req.getParameter("idTipo"));
        String maqPesada = req.getParameter("maqPesada");
        String maqSemiPesada = req.getParameter("maqSemiPesada");
        String maqLiviana = req.getParameter("maqLiviana");
        TipoMaquinaDTO tipoMaquina =new TipoMaquinaDTO(idTipo,maqPesada,maqSemiPesada,maqLiviana);
        int registros = new TipoMaquinaDAO().agregar(tipoMaquina);
        this.listaTipoMaquina(req, resp);
        
    }
    
    private void consultar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          
           int idTipo = Integer.parseInt(req.getParameter("idTipo"));
           String consultar = null;
           int registros = new TipoMaquinaDAO().agregar(new TipoMaquinaDTO(consultar));
           this.listaTipoMaquina(req, resp);
    }
    
    private void crear(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        TipoMaquinaDTO TipoMaquinaDto = new TipoMaquinaDAO().crear(new TipoMaquinaDTO(nombre));
        req.setAttribute("tipoMaquinadto", TipoMaquinaDto);
        req.getRequestDispatcher("tipoMaquina/TipoMaquina.jsp").forward(req, resp);
        
    }
    
     private void actualizar(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
       int idTipo = Integer.parseInt(req.getParameter("idTipo"));
        String maqPesada = req.getParameter("maqPesada");
        String maqSemiPesada = req.getParameter("maqSemiPesada");
        String maqLiviana = req.getParameter("maqLiviana");
        TipoMaquinaDTO tipoMaquina =new TipoMaquinaDTO(idTipo,maqPesada,maqSemiPesada,maqLiviana);
        int registros = new TipoMaquinaDAO().actualizar(tipoMaquina);
        this.listaTipoMaquina(req, resp);
}

    
}
