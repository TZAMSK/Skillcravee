package com.stage.model.controller;

import com.stage.model.entities.Entreprise;
import com.stage.model.entities.Etudiant;
import com.stage.model.entities.Prof;
import com.stage.model.service.EntrepriseService;
import com.stage.model.service.EtudiantService;
import com.stage.model.service.ProfService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rafael 
 */
public class InscriptionController extends HttpServlet {
    //    Prof
    private List<Prof> listeProfs;
    ProfService profService = new ProfService();
    Prof prof = null;
    
    //    Etudiant
    private List<Etudiant> listeEtudiants;
    EtudiantService etudiantService = new EtudiantService();
    Etudiant etudiant = null;
    
    //    Entreprise
    private List<Entreprise> listeEntreprises;
    EntrepriseService entrepriseService = new EntrepriseService();
    Entreprise entreprise = null;
    
    boolean retour = false;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String selection = request.getParameter("selection");

        switch(selection){
            case "1":
                String prenom = request.getParameter("prenom");
                String nom = request.getParameter("nom");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                
                etudiant = new Etudiant(nom, prenom, email, password);
                retour = etudiantService.ajouterUnEtudiant(etudiant);
                if (retour) {
                    String message = "l'Etudiant  " + nom + "" + prenom + "a été ajouté avec success";
                    listeEtudiants = etudiantService.afficherLesEtudiants();
                    request.setAttribute("message", message);
                    request.setAttribute("listeEtudiants", listeEtudiants);
                    System.out.print("TEST CONTROLLEUR INSCRIPTION");
                    request.getRequestDispatcher("pageTestApresInscription.jsp").forward(request, response);
                }
                break;
            
            case "2":
                String prenom2 = request.getParameter("prenom");
                String nom2 = request.getParameter("nom");
                String email2 = request.getParameter("email");
                String password2 = request.getParameter("password");

                prof = new Prof(nom2, prenom2, email2, password2);
                retour = profService.ajouterUnProf(prof);
                if (retour) {
                    String message = "le professeur  " + nom2 + "" + prenom2 + "a été ajouté avec success";
                    listeProfs = profService.afficherLesProfs();
                    request.setAttribute("message", message);
                    request.setAttribute("listeProfs", listeProfs);
                    request.getRequestDispatcher("pageTestApresInscription.jsp").forward(request, response);
                }
                break;
            
            case "3":
                String nomEntreprise = request.getParameter("prenom");
                String adresse = request.getParameter("adresse");
                String telephoneString = request.getParameter("telephone");
                int telephone = Integer.parseInt(telephoneString);
                String email3 = request.getParameter("email");
                String password3 = request.getParameter("password");
                
                entreprise = new Entreprise(nomEntreprise, adresse, telephone, email3, password3);
                retour = entrepriseService.ajouterUneEntreprise(entreprise);
                if (retour) {
                    String message = "l'Entreprise  " + nomEntreprise + "a été ajouté avec success";
                listeEntreprises = entrepriseService.afficherLesEntreprises();
                request.setAttribute("message", message);
                request.setAttribute("listeEntreprises", listeEntreprises);
                request.getRequestDispatcher("pageTestApresInscription.jsp").forward(request, response);
            }
                break;
            default:
            request.setAttribute("invalide", "Vous devez faire un choix");
            request.getRequestDispatcher("inscription.jsp").include(request, response);
            break;
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
