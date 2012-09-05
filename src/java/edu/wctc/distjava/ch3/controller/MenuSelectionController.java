/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.distjava.ch3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.wctc.distjava.ch3.model.*;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author JoeGollakner
 */
public class MenuSelectionController extends HttpServlet {

    private static final String ORDER_PAGE = "finalOrder.jsp";

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html");
         
            String m = request.getParameter("menuItem");
            
            menuItems mi = new menuItems();
            
            List result = mi.getItems(m.trim());
         
            request.setAttribute("FinalOrder", result);
            
            RequestDispatcher view =
                request.getRequestDispatcher(ORDER_PAGE);
        view.forward(request, response);
         
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Main controller";
    }// </editor-fold>
}
