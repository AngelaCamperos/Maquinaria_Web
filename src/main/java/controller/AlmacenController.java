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
import modelo.AlmacenDAO;
import modelo.AlmacenDTO;

@WebServlet("/almacen")
public class AlmacenController extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AlmacenDAO dDAO = new AlmacenDAO();
        List<AlmacenDTO> almacen = dDAO.consultarNomMaquinas();
        req.setAttribute("almacen", almacen);
        req.getRequestDispatcher("almacen/veralmacen").forward(req, resp);
    }
        private void agregarTipoMaquinaria(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int idMaquina = Integer.parseInt(req.getParameter("idMaquina"));
         String nomMaquinas = req.getParameter("nomMaquinas");
         int cantMaquinas = Integer.parseInt(req.getParameter("cantMaquinas"));
          String estadoMaquina = req.getParameter("estadoMaquina");
         
        AlmacenDTO cliente =new AlmacenDTO(idMaquina,nomMaquinas,cantMaquinas,estadoMaquina);
        int registros = new AlmacenDAO().agregarTipoMaquinaria(cliente);
        this.agregarTipoMaquinaria(req, resp);
        
    }

    private void listaAlmacen(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    AlmacenDAO dDAO = new AlmacenDAO();
        List<AlmacenDTO> almacen = dDAO.consultarNomMaquinas();
        req.setAttribute("almacen", almacen);
        req.getRequestDispatcher("TipoMaquina/veralmacen.jsp").forward(req, resp);
    }
        
        
 }   
    