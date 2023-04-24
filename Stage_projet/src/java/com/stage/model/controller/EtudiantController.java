package com.stage.model.controller;

import com.stage.model.entities.Etudiant;
import com.stage.model.service.EtudiantService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EtudiantController extends HttpServlet {

    private List<Etudiant> listeEtudiants;
    Etudiant etudiant = null;
    EtudiantService etudiantService = new EtudiantService();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String nom = request.getParameter("nom");
        if (nom != null) {
            etudiant = etudiantService.chercherEtudiantParNom(nom);
            request.setAttribute("etudiant", etudiant);
            request.getRequestDispatcher("utilisateurs.jsp").forward(request, response);
        }else {
            listeEtudiants = etudiantService.afficherLesEtudiants();
            request.setAttribute("listeEtudiants", listeEtudiants);
            request.getRequestDispatcher("utilisateurs.jsp").forward(request, response);      
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
