<%-- 
    Document   : pageTestApresInscription
    Created on : 8 avr. 2023, 18 h 15 min 40 s
    Author     : rafaelfo
--%>
<%@page import="com.stage.model.entities.Prof"%>
<%@page import="com.stage.model.entities.Entreprise"%>
<%@page import="com.stage.model.entities.Etudiant"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%
    ArrayList<Etudiant> listeEtudiants = (ArrayList) request.getAttribute("listeEtudiants");
    Etudiant etudiant = (Etudiant) request.getAttribute("Etudiant");

    ArrayList<Prof> listeProfs = (ArrayList) request.getAttribute("listeProfs");
    Prof prof = (Prof) request.getAttribute("prof");

    ArrayList<Entreprise> listeEntreprises = (ArrayList) request.getAttribute("listeEntreprises");
    Entreprise entreprise = (Entreprise) request.getAttribute("Entreprise");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Affichage</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <h1>Affichage Tableau : </h1>
        <% if (request.getAttribute("message") != null) {%>
    <center><b><font color=red> <%=request.getAttribute("message")%></font><b></center>
                <%}%>

                <h2>Liste des utilisateurs</h2>


                <table style="width:79%">
                    <tr>
                        <th>Id</th>
                        <th>Nom</th>
                        <th>Prenom</th>
                        <th>Email</th>
                        <th>Mot de passe</th>
                    </tr>
                    <%if (etudiant != null) {%>
                    <tr>
                        <td> <%=etudiant.getId()%> </td>
                        <td> <%=etudiant.getNom()%> </td>
                        <td> <%=etudiant.getPrenom()%> </td>
                        <td> <%=etudiant.getEmail()%> </td>
                        <td> <%=etudiant.getPassword()%> </td>
                    </tr>
                    <% } else {
                        for (Etudiant etu : listeEtudiants) {%>
                    <tr>
                        <td> <%=etu.getId()%> </td>
                        <td> <%=etu.getNom()%> </td>
                        <td> <%=etu.getPrenom()%> </td>
                        <td> <%=etu.getEmail()%> </td>
                        <td> <%=etu.getPassword()%> </td>

                    </tr>

                    <% }
                        }%>
                </table>
                </body>
                </html>
